package com.vatan.core;

import javax.sound.sampled.*;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class MuzikKutusu {
    private Clip clip;
    private static ArrayList<Clip> acikKlipler = new ArrayList<>();

    public void oynat(String dosyaAdi) {
        oynat(dosyaAdi, 0.0f);
    }

    public void oynat(String dosyaAdi, float desibel) {
        try {
            String tamYol = dosyaAdi.startsWith("/") ? dosyaAdi : "/" + dosyaAdi;

            InputStream audioSrc = getClass().getResourceAsStream(tamYol);
            if (audioSrc == null) {
                audioSrc = getClass().getResourceAsStream("/resources" + tamYol);
            }

            if (audioSrc != null) {
                if (clip != null && clip.isOpen()) {
                    clip.close();
                    acikKlipler.remove(clip);
                }

                InputStream bufferedIn = new BufferedInputStream(audioSrc);
                ByteArrayOutputStream out = new ByteArrayOutputStream();
                byte[] buffer = new byte[4096];
                int n;
                while ((n = bufferedIn.read(buffer)) != -1) {
                    out.write(buffer, 0, n);
                }
                byte[] audioBytes = out.toByteArray();

                ByteArrayInputStream bais = new ByteArrayInputStream(audioBytes);
                AudioInputStream in = null;

                try {
                    in = AudioSystem.getAudioInputStream(bais);
                } catch (UnsupportedAudioFileException e) {
                    try {
                        // Dedektif: Kütüphaneleri manuel çağırıyoruz
                        bais.reset();
                        Class<?> mp3ReaderClass = Class.forName("javazoom.spi.mpeg.sampled.file.MpegAudioFileReader");
                        Object mp3Reader = mp3ReaderClass.getDeclaredConstructor().newInstance();
                        Method getStream = mp3ReaderClass.getMethod("getAudioInputStream", InputStream.class);
                        in = (AudioInputStream) getStream.invoke(mp3Reader, bais);
                    } catch (ClassNotFoundException ex) {
                        System.out.println("KRİTİK HATA: MP3 Kütüphaneleri (jl1.0.1.jar, mp3spi1.9.5.jar) projeye eklenmemiş veya bulunamıyor!");
                        throw e;
                    } catch (Exception ex) {
                        System.out.println("MP3 Okuma Hatası (Reflection): " + ex.getMessage());
                        ex.printStackTrace();
                        throw e;
                    }
                }

                AudioFormat baseFormat = in.getFormat();
                AudioInputStream decodedIn = null;

                if (baseFormat.getEncoding() != AudioFormat.Encoding.PCM_SIGNED) {
                    AudioFormat decodedFormat = new AudioFormat(
                            AudioFormat.Encoding.PCM_SIGNED,
                            baseFormat.getSampleRate(),
                            16,
                            baseFormat.getChannels(),
                            baseFormat.getChannels() * 2,
                            baseFormat.getSampleRate(),
                            false
                    );

                    try {
                        decodedIn = AudioSystem.getAudioInputStream(decodedFormat, in);
                    } catch (Exception e) {
                        try {
                            Class<?> mp3ConverterClass = Class.forName("javazoom.spi.mpeg.sampled.convert.MpegFormatConversionProvider");
                            Object mp3Converter = mp3ConverterClass.getDeclaredConstructor().newInstance();
                            Method getStream = mp3ConverterClass.getMethod("getAudioInputStream", AudioFormat.class, AudioInputStream.class);
                            decodedIn = (AudioInputStream) getStream.invoke(mp3Converter, decodedFormat, in);
                        } catch (ClassNotFoundException ex) {
                            System.out.println("KRİTİK HATA: 'tritonus_share.jar' veya dönüştürücü kütüphane eksik!");
                            throw e;
                        } catch (Exception ex) {
                            System.out.println("MP3 Dönüştürme Hatası: " + ex.getMessage());
                            throw e;
                        }
                    }
                } else {
                    decodedIn = in;
                }

                clip = AudioSystem.getClip();
                clip.open(decodedIn);

                if (clip.isControlSupported(FloatControl.Type.MASTER_GAIN)) {
                    FloatControl gainControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
                    if (desibel > 6.0f) desibel = 6.0f;
                    if (desibel < -80.0f) desibel = -80.0f;
                    gainControl.setValue(desibel);
                }

                clip.start();
                clip.loop(Clip.LOOP_CONTINUOUSLY);
                acikKlipler.add(clip);


            } else {
                System.out.println("Müzik dosyası bulunamadı: " + dosyaAdi);
            }
        } catch (Exception e) {
            System.out.println("Ses hatası (" + dosyaAdi + "): " + e.getMessage());
        }
    }

    public void durdur() {
        if (clip != null && clip.isRunning()) {
            clip.stop();
            clip.close();
            acikKlipler.remove(clip);
        }
    }

    public static void herseyiSustur() {
        for (Clip c : acikKlipler) {
            if (c != null && c.isOpen()) {
                c.stop();
                c.close();
            }
        }
        acikKlipler.clear();
    }
}