package com.vatan.chapters.ch5;

import com.vatan.core.*;
import java.util.Scanner;

public class Chapter5_17 extends Olay<IndikatorlerCh5> {
    @Override
    public void oynat(IndikatorlerCh5 indikatorlerCh5) {
        int ucuncuSorudaSecilenSik = indikatorlerCh5.getUcuncuSorudaSecilenSik();
        MuzikKutusu olayMuzigi = new MuzikKutusu();

        if (ucuncuSorudaSecilenSik == 1) {
            this.metin =
                    "Kurmay Yüzbaşı:\n" +
                            "Osman Paşam, bu sabah Genelkurmay'dan görev yerinizin değiştirildiği haberi geldi. İyisi ile kötüsü ile hakkınızı helal edin, sizinle görev yapmak bir şerefti komutanım.\n";
            this.cevaplar =
                    new String[]{
                            "Allah'a emanetsiniz asker. Sizlere veda ederken unutmayın ki her birinizi hatırlayacağım."
                    };
            olayMuzigi.oynat("1/Chapter5_17.mp3");
        } else if (ucuncuSorudaSecilenSik == 2) {
            this.metin =
                    "Kurmay Yüzbaşı:\n" +
                            "Osman Paşam, bu sabah Genelkurmay'dan görev yerinizin değiştirildiği haberi geldi. İyisi ile kötüsü ile hakkınızı helal edin, sizinle görev yapmak bir şerefti komutanım.\n";
            this.cevaplar =
                    new String[]{
                            "Allah'a emanetsiniz asker. Sizlere veda ederken unutmayın ki her birinizi hatırlayacağım."
                    };
            olayMuzigi.oynat("2/Chapter5_17.mp3");
        } else if (ucuncuSorudaSecilenSik == 3 && indikatorlerCh5.getPkkGucu() != 3) {
            this.metin =
                    "Abdullah Öcalan:\n" +
                            "Demek beni indirmeye çalışıyorsun ha Osman Paşa? Bil ki senin kurduğun tuzaktan kaçtım. Artık seninle baş düşmanız Osman Paşa, elbet senle karşılaşacağız.\n";
            this.cevaplar =
                    new String[]{
                            "Elbet karşılaşacağız. Ama unutma vatansız köpek, o karşılaşmadan sağ çıkacak olan ben olacağım."
                    };
            olayMuzigi.oynat("3/Chapter5_17.mp3", 6.0f);
        } else if (ucuncuSorudaSecilenSik == 3 && indikatorlerCh5.getPkkGucu() == 3) {
            this.metin =
                    "İstihbaratçı Teğmen:\n" +
                            "Komutanım! Telsiz dinlemelerine göre terör örgütü panik halinde. Elebaşı Abdullah Öcalan'ın cesedini kaçırmaya çalışıyorlar.\n" +
                            "Bu zafer tarihe geçecek Paşam! Örgüt başsız kaldı, dağılmaları an meselesi!\n";
            this.cevaplar =
                    new String[]{
                            "Bu milletin ahı yerde kalmaz demiştik. Cehenneme kadar yolu var!"
                    };
            olayMuzigi.oynat("3/Chapter5_17_Dead.mp3", 6.0f);
        }

        soruSor();

        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int secim = sc.nextInt();
            sc.nextLine();
            olayMuzigi.durdur();

            if (secim == 1) {
                if (ucuncuSorudaSecilenSik == 1) {
                    indikatorlerCh5.setAskerMorali(indikatorlerCh5.getAskerMorali() + 3);
                } else if (ucuncuSorudaSecilenSik == 2) {
                    indikatorlerCh5.setAskerMorali(indikatorlerCh5.getAskerMorali() + 3);
                } else if (ucuncuSorudaSecilenSik == 3) {
                    indikatorlerCh5.setAskerMorali(100);
                    indikatorlerCh5.setKurmayDestegi(100);
                    indikatorlerCh5.setAnkaraDestegi(100);
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