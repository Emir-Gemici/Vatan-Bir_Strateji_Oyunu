package com.vatan.chapters.ch5;

import com.vatan.core.*;
import java.util.Random;
import java.util.Scanner;

public class Chapter5_11 extends Olay<IndikatorlerCh5> {
    @Override
    public void oynat(IndikatorlerCh5 indikatorlerCh5) {
        int ucuncuSorudaSecilenSik = indikatorlerCh5.getUcuncuSorudaSecilenSik();
        MuzikKutusu olayMuzigi = new MuzikKutusu();

        if (ucuncuSorudaSecilenSik == 1) {
            this.metin =
                    "Kurmay Yüzbaşı:\n" +
                            "Paşam, son gelen emirler üzerine Balkaya üzerine yapılacak müdahaleyi başlatıyoruz. Umarım hain eşkıyaya sağlam bir tokat indireceğiz...\n.";
            this.cevaplar =
                    new String[]{
                            "Temennimiz birdir, asker."
                    };
            olayMuzigi.oynat("1/Chapter5_11.mp3");
        } else if (ucuncuSorudaSecilenSik == 2) {
            this.metin =
                    "Kara Kuvvetleri Komutanı İsmail Hakkı Karadayı:\n" +
                            "Osman Paşam, hükümet son kararını vermiş durumda. Balkaya üzerine yapacağın harekata onay çıktı.\n" +
                            "Senden derhal birliklerinle görev bölgesine intikal etmen ve mümkün mertebe hızla bu harekatı tamamlaman bekleniyor. Allah yardımcın olsun.\n";
            this.cevaplar =
                    new String[]{
                            "Sağol Komutanım!"
                    };
            olayMuzigi.oynat("2/Chapter5_11.mp3", 3.0f);
        } else if (ucuncuSorudaSecilenSik == 3) {
            this.metin =
                    "\"Yeşil\" Mahmut Yıldırım:\n" +
                            "Paşam , bana gereken ilgiyi verdiğiniz için teşekkür ederim.\n" +
                            "Aldığımız yeni istihbarata göre PKK'lılar bu muhbirlerimizin bazılarını öğrenmişler ve onları kaçırıp bizden fidye istiyorlar.\n" +
                            "Bu fidyeyi ödeyip direkt arkadaşlarımızı kurtaralım mı yoksa yerlerini tespit edip direkt operasyona mı geçelim?\n";
            this.cevaplar =
                    new String[]{
                            "Derhal operasyon yapmamız en mantıklı olandır.Bu eşkiyaların sağı solu belli olmaz.",
                            "Direkt operasyondan ziyade eşkiyanın istediği fidyeyi getiriyormuş gibi yaparak planlı bir operasyon daha mantıklıdır."
                    };
            olayMuzigi.oynat("3/Chapter5_11.mp3", 6.0f);
        }

        soruSor();

        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int secim = sc.nextInt();
            sc.nextLine();
            olayMuzigi.durdur();

            if (secim == 1) {
                if (ucuncuSorudaSecilenSik == 1) {
                    morYaz("(Balkaya Harekatı başlar...)");
                } else if (ucuncuSorudaSecilenSik == 2) {
                    morYaz("(Balkaya Harekatı başlar...)");
                } else if (ucuncuSorudaSecilenSik == 3) {
                    Random muhbir = new Random();
                    int muhbirHayati = muhbir.nextInt(2);
                    if (muhbirHayati == 0) {
                        kirmiziYaz("Muhbirimizi kaybettik...\n");
                        indikatorlerCh5.setAnkaraDestegi(indikatorlerCh5.getAnkaraDestegi() - 1);
                        indikatorlerCh5.setAskerMorali(indikatorlerCh5.getAskerMorali() - 2);
                    } else if (muhbirHayati == 1) {
                        yesilYaz("Muhbirimiz kurtuldu...\n");
                        indikatorlerCh5.setAnkaraDestegi(indikatorlerCh5.getAnkaraDestegi() + 2);
                        indikatorlerCh5.setAskerMorali(indikatorlerCh5.getAskerMorali() + 2);
                        indikatorlerCh5.setPkkGucu(indikatorlerCh5.getPkkGucu() - 2);
                    }
                }
            } else if (secim == 2) {
                if (ucuncuSorudaSecilenSik == 1) {
                    throw new ArithmeticException("Geçersiz tuşlama yaptınız.");
                } else if (ucuncuSorudaSecilenSik == 2) {
                    throw new ArithmeticException("Geçersiz tuşlama yaptınız.");
                } else if (ucuncuSorudaSecilenSik == 3) {
                    indikatorlerCh5.setAnkaraDestegi(indikatorlerCh5.getAnkaraDestegi() + 2);
                    indikatorlerCh5.setAskerMorali(indikatorlerCh5.getAskerMorali() + 3);
                    indikatorlerCh5.setPkkGucu(indikatorlerCh5.getPkkGucu() - 2);
                }
            } else {
                throw new ArithmeticException("Geçersiz tuşlama yaptınız.");
            }
        } else {
            olayMuzigi.durdur();
            throw new ArithmeticException("Lütfen sadece sayı giriniz.");
        }
    }
}