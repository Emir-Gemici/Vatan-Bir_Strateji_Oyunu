package com.vatan.chapters.ch5;

import com.vatan.core.*;
import java.util.Random;
import java.util.Scanner;

public class Chapter5_16 extends Olay<IndikatorlerCh5> {
    @Override
    public void oynat(IndikatorlerCh5 indikatorlerCh5) {
        int ucuncuSorudaSecilenSik = indikatorlerCh5.getUcuncuSorudaSecilenSik();
        MuzikKutusu olayMuzigi = new MuzikKutusu();

        if (ucuncuSorudaSecilenSik == 1) {
            this.metin =
                    "Başbakan Çiller:\n" +
                            "Sayın Pamukoğlu, bölgede iki senedir devam eden başarılarınız memleketimizin dört yanında iftihar kaynağı olmuş durumda. Size olan bu teveccühü cevapsız bırakmak istemiyorum.\n" +
                            "Bu nedenle sizden ricam askeri vazifeden çekilirken size teklif edeceğim Savunma Bakanlığı müsteşarlığını kabul etmenizdir.\n";
            this.cevaplar =
                    new String[]{
                            " Sayın Başbakan, bu teklifinizi seve seve kabul ederim.",
                            "Vazifemin başında kalmam daha faydalı olacaktır sayın Başbakanım, sizden özür dileyerek reddetmek zorundayım."
                    };
            olayMuzigi.oynat("1/Chapter5_16.mp3", 6.0f);
        } else if (ucuncuSorudaSecilenSik == 2) {
            this.metin =
                    "Kurmay Yüzbaşı:\n" +
                            "Paşam! Birliklerimiz nihayet Kandil üzerine doğru ilerliyor ancak hain eşkıyanın siyasi bağlantıları baskı yapmış olacak ki merkez komutanlık durma talimatı verdi.\n" +
                            "Ele geçirdiğimiz yerlerde karakollar kurarak tutunmamız emredildi. Sizce Hakkari'ye mi çekilelim yoksa buradaki birliklerle beraber mevcut mevkilerimizi tahkim mi edelim komutanım?\n";
            this.cevaplar =
                    new String[]{
                            "Hakkari'ye dönelim. Buraları mekanize piyadeler yeterli şekilde tutacaktır.",
                            "Biz de burada bulunmalıyız asker. Yeni gelenlerin tuttuğu hatta çok güven olmaz."
                    };
            olayMuzigi.oynat("2/Chapter5_16.mp3");
        } else if (ucuncuSorudaSecilenSik == 3) {
            this.metin =
                    "İstihbaratçı Teğmen:\n" +
                            "Komutanım , MİT'ten aldığımız istihbaratla Apo'nun bulunduğu evi tespit ettik ve gizli suikastçileri ve askerlerimizi yerleştirdik.\n" +
                            "Apo'yu yakalamak için binadan korumalarıyla beraber çıkmasını mı bekleyelim yoksa evine gizlice mi girelim?\n";
            this.cevaplar =
                    new String[]{
                            "Eğer evine gizlice girmeye çalışırsak kaçmaya kalkmaz.Dolayısıyla birkaç kişi ile beraber Apo'yu yakalamaya çalışın.",
                            "Bu kadar asker buraya boşa gelmedi.Korumalarıyla evden çıktığı sırada korumalarının işini bitirip direkt onu kaçırmaya çalışalım."
                    };
            olayMuzigi.oynat("3/Chapter5_16.mp3", 4.0f);
        }

        soruSor();

        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int secim = sc.nextInt();
            sc.nextLine();
            olayMuzigi.durdur();

            if (secim == 1) {
                if (ucuncuSorudaSecilenSik == 1) {
                    indikatorlerCh5.setAskerMorali(indikatorlerCh5.getAskerMorali() + 1);
                    indikatorlerCh5.setKurmayDestegi(indikatorlerCh5.getKurmayDestegi() - 2);
                } else if (ucuncuSorudaSecilenSik == 2) {
                    indikatorlerCh5.setAskerMorali(indikatorlerCh5.getAskerMorali() + 2);
                    indikatorlerCh5.setTskGucu(indikatorlerCh5.getTskGucu() + 1);
                } else if (ucuncuSorudaSecilenSik == 3) {
                    indikatorlerCh5.setAskerMorali(indikatorlerCh5.getAskerMorali() - 1);
                    indikatorlerCh5.setTskGucu(indikatorlerCh5.getTskGucu() + 1);
                    Random apoYasamaIhtimali = new Random();
                    int apoYasama = apoYasamaIhtimali.nextInt(4);
                    if (apoYasama == 0) {
                        kirmiziYaz("Terör örgütü elebaşısı Abdullah Öcalan öldü...");
                        indikatorlerCh5.setPkkGucu(3);
                    }
                }
            } else if (secim == 2) {
                if (ucuncuSorudaSecilenSik == 1) {
                    indikatorlerCh5.setAnkaraDestegi(indikatorlerCh5.getAnkaraDestegi() - 1);
                    indikatorlerCh5.setHalkDestegi(indikatorlerCh5.getHalkDestegi() + 1);
                } else if (ucuncuSorudaSecilenSik == 2) {
                    indikatorlerCh5.setKurmayDestegi(indikatorlerCh5.getKurmayDestegi() - 3);
                    indikatorlerCh5.setPkkGucu(indikatorlerCh5.getPkkGucu() - 1);
                } else if (ucuncuSorudaSecilenSik == 3) {
                    indikatorlerCh5.setAskerMorali(indikatorlerCh5.getAskerMorali() + 1);
                    indikatorlerCh5.setBolgeHakimiyeti(indikatorlerCh5.getBolgeHakimiyeti() - 5);
                    indikatorlerCh5.setTskGucu(indikatorlerCh5.getTskGucu() - 1);
                    Random apoYasamaIhtimali = new Random();
                    int apoYasama = apoYasamaIhtimali.nextInt(10);
                    if (apoYasama == 0) {
                        kirmiziYaz("Terör örgütü elebaşısı Abdullah Öcalan öldü...");
                        indikatorlerCh5.setPkkGucu(3);
                    }
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