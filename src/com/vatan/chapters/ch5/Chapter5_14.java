package com.vatan.chapters.ch5;

import com.vatan.core.*;
import java.util.Scanner;

public class Chapter5_14 extends Olay<IndikatorlerCh5> {
    @Override
    public void oynat(IndikatorlerCh5 indikatorlerCh5) {
        int ucuncuSorudaSecilenSik = indikatorlerCh5.getUcuncuSorudaSecilenSik();
        MuzikKutusu olayMuzigi = new MuzikKutusu();

        if (ucuncuSorudaSecilenSik == 1) {
            this.metin =
                    "Kurmay Yüzbaşı:\n" +
                            "Paşam, Balkaya, Kato ve Buzul harekatlarının ardından askerlerimiz PKK'yı kesin olarak yurt içindeki üslerinden sürdü.\n" +
                            "Tahminimizce yüzlerce eşkıyayı etkisiz hale getirdik. Ankara'dan gelen destekler hakkındaki haberler de bizi memnun edici duruyor.\n" +
                            "Kısacası paşam, hain eşkıyanın siviller üzerindeki etkisini kırmaya başlayabiliriz.\n";
            this.cevaplar =
                    new String[]{
                            "Allah bizi muzaffer kıldı asker. Şimdi iyice dinlenin. Aktif müdahale dönemi bitti diyebiliriz."
                    };
            olayMuzigi.oynat("1/Chapter5_14.mp3");
        } else if (ucuncuSorudaSecilenSik == 2) {
            this.metin =
                    "Jandarma Asayiş Komutan Yardımcısı İlker Başbuğ:\n" +
                            "Osman Paşam! Sizinle nihayet tanışmak beni bahtiyar etti. Keşke barış zamanı denk gelebilseydik.\n" +
                            "Size iletmem istenen bir haber var. Silahlı Kuvvetler Irak üzerine Çelik kod adlı bir operasyon üzerinde hazırlanıyor.\n" +
                            "Fakat bu harekattan önce PKK'nın Irak'ta kalan Berçela ve Zap kamplarını ortadan kaldırmanız gerek. Allah yardımcınız olsun!\n";
            this.cevaplar =
                    new String[]{
                            "Hepimizin İlker Paşam, hepimizin."
                    };
            olayMuzigi.oynat("2/Chapter5_14.mp3", 2.0f);
        } else if (ucuncuSorudaSecilenSik == 3) {
            this.metin =
                    "İstihbaratçı Teğmen:\n" +
                            "Avaşin üzerine yapılan taarruz sonrası bölücü terör örgütü büyük bir darbe aldı komutanım.\n" +
                            "PKK'yı kökten kurutabilmek adına artık Suriyede hain terör örgütü elebaşı Apo 'yu yakalamak için operasyona girişebiliriz.\n";
            this.cevaplar =
                    new String[]{
                            "O vakit terörist ele başını yakalayıp şu belayı artık memleketin başından atalım.",
                            "Şuan bu operasyon için erken.Biraz daha bu terör örgütünün neler planladığını öğrenmeye çalışalım."
                    };
            olayMuzigi.oynat("3/Chapter5_14.mp3", 4.0f);
        }

        soruSor();

        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int secim = sc.nextInt();
            sc.nextLine();
            olayMuzigi.durdur();

            if (secim == 1) {
                if (ucuncuSorudaSecilenSik == 1) {
                    indikatorlerCh5.setHalkDestegi(indikatorlerCh5.getHalkDestegi() + 3);
                    indikatorlerCh5.setTskGucu(indikatorlerCh5.getTskGucu() + 1);
                } else if (ucuncuSorudaSecilenSik == 2) {
                    indikatorlerCh5.setAskerMorali(indikatorlerCh5.getAskerMorali() - 1);
                    indikatorlerCh5.setKurmayDestegi(indikatorlerCh5.getKurmayDestegi() + 3);
                    indikatorlerCh5.setTskGucu(indikatorlerCh5.getTskGucu() - 2);
                } else if (ucuncuSorudaSecilenSik == 3) {
                    indikatorlerCh5.setAskerMorali(indikatorlerCh5.getAskerMorali() + 2);
                    indikatorlerCh5.setBolgeHakimiyeti(indikatorlerCh5.getBolgeHakimiyeti() + 5);
                    indikatorlerCh5.setPkkGucu(indikatorlerCh5.getPkkGucu() - 3);
                }
            } else if (secim == 2) {
                if (ucuncuSorudaSecilenSik == 1) {
                    throw new ArithmeticException("Geçersiz tuşlama yaptınız.");
                } else if (ucuncuSorudaSecilenSik == 2) {
                    throw new ArithmeticException("Geçersiz tuşlama yaptınız.");
                } else if (ucuncuSorudaSecilenSik == 3) {
                    indikatorlerCh5.setAskerMorali(indikatorlerCh5.getAskerMorali() + 3);
                    indikatorlerCh5.setAskerMorali(indikatorlerCh5.getAskerMorali() + 1);
                    indikatorlerCh5.setKurmayDestegi(indikatorlerCh5.getKurmayDestegi() + 3);
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