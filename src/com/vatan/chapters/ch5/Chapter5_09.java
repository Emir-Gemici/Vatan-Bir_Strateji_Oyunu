package com.vatan.chapters.ch5;

import com.vatan.core.*;
import java.util.Scanner;

public class Chapter5_09 extends Olay<IndikatorlerCh5> {
    @Override
    public void oynat(IndikatorlerCh5 indikatorlerCh5) {
        int ucuncuSorudaSecilenSik = indikatorlerCh5.getUcuncuSorudaSecilenSik();
        MuzikKutusu olayMuzigi = new MuzikKutusu();

        if (ucuncuSorudaSecilenSik == 1) {
            this.metin =
                    "Kurmay Yüzbaşı:\n" +
                            "Komutanım! PKK'nın Mardin'de yaptığı alçak saldırının ardından arazi tarama birlikleri korkunç bir şeyden şüpheleniyorlar.\n" +
                            "Teröristler köylere saldırılarda kimyasal silah kullandığı iddiası var ve bu bize eşkıyanın kendine oluşturmaya çalıştığı kurtarıcı propagandasına darbe vurma fırsatı verdi.\n" +
                            "Genelkurmay bölgede silahlı kuvvetlere bir direktif vermedi ama bunu kullanalım mı komutanım?\n";
            this.cevaplar =
                    new String[]{
                            "Alçak eşkıyanın kara yüzünü açığa koyalım!",
                            "Propaganda ile uğraşacak zamanımız yok, Irak sınırını tutmalıyız!"
                    };
            olayMuzigi.oynat("1/Chapter5_09.mp3");
        } else if (ucuncuSorudaSecilenSik == 2) {
            this.metin =
                    "İstihbaratçı Teğmen:\n" +
                            "Komutanım! İçeri sızdırdığımız adamlarımız sayesinde Peşmerge ile PKK'yı birbirine saldırtmayı başardık.\n" +
                            "Bunu PKK'nın açığa çıkan hücrelerini yok etme fırsatı olarak kullanma şansımız mevcut. Son karar sizindir komutanım!\n";
            this.cevaplar =
                    new String[]{
                            "İyice zayıflatalım ki kafalarını kaldıramasınlar. Hemen hazırlanın, gidiyoruz!",
                            "MİT'in işlerine yeteri kadar karıştık. Bundan sonrası onların."
                    };
            olayMuzigi.oynat("2/Chapter5_09.mp3", 4.0f);
        } else if (ucuncuSorudaSecilenSik == 3) {
            this.metin =
                    "Kurmay Yüzbaşı:\n" +
                            "Komutanım, İkiyaka'da olanlar Avrupa'ya kadar gitmiş olacak ki AB Parlamentosu Türkiye'yi kınamaya kalkmış.\n" +
                            "Başbakan Çiller'i gümrük vergileri konusunda tehdit ettikleri söyleniyor.\n" +
                            "Ankara'dan bize gelen son emir, aynı sertlikte devam edersek memleketin çıkarlarını tehlikeye atacağımızı ve durmamızı istiyor.Ne yapalım komutanım?\n";
            this.cevaplar =
                    new String[]{
                            "Doğru, kontrolü toptan kaybettik. Başka müdahale yöntemleri kullanmalıyız.",
                            "Hainlerin tahkim ettikleri yerler hariç bu yöntemleri bıraksak iyi olur.",
                            "Umrumda değil, son hain de ateş içinde kavrulana dek bombalayacağız!"
                    };
            olayMuzigi.oynat("3/Chapter5_09.mp3");
        }

        soruSor();

        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int secim = sc.nextInt();
            sc.nextLine();
            olayMuzigi.durdur();

            if (secim == 1) {
                if (ucuncuSorudaSecilenSik == 1) {
                    indikatorlerCh5.setHalkDestegi(indikatorlerCh5.getHalkDestegi() + 2);
                    indikatorlerCh5.setPkkGucu(indikatorlerCh5.getPkkGucu() - 1);
                } else if (ucuncuSorudaSecilenSik == 2) {
                    indikatorlerCh5.setAskerMorali(indikatorlerCh5.getAskerMorali() + 1);
                    indikatorlerCh5.setBolgeHakimiyeti(indikatorlerCh5.getBolgeHakimiyeti() + 10);
                    indikatorlerCh5.setPkkGucu(indikatorlerCh5.getPkkGucu() - 2);
                    indikatorlerCh5.setTskGucu(indikatorlerCh5.getTskGucu() - 1);
                } else if (ucuncuSorudaSecilenSik == 3) {
                    indikatorlerCh5.setAnkaraDestegi(indikatorlerCh5.getAnkaraDestegi() + 2);
                    indikatorlerCh5.setHalkDestegi(indikatorlerCh5.getHalkDestegi() + 1);
                    indikatorlerCh5.setPkkGucu(indikatorlerCh5.getPkkGucu() + 1);
                }
            } else if (secim == 2) {
                if (ucuncuSorudaSecilenSik == 1) {
                    indikatorlerCh5.setAnkaraDestegi(indikatorlerCh5.getAnkaraDestegi() - 1);
                    indikatorlerCh5.setTskGucu(indikatorlerCh5.getTskGucu() + 2);
                } else if (ucuncuSorudaSecilenSik == 2) {
                    indikatorlerCh5.setAskerMorali(indikatorlerCh5.getAskerMorali() + 1);
                    indikatorlerCh5.setHalkDestegi(indikatorlerCh5.getHalkDestegi() + 1);
                    indikatorlerCh5.setPkkGucu(indikatorlerCh5.getPkkGucu() - 1);
                } else if (ucuncuSorudaSecilenSik == 3) {
                    indikatorlerCh5.setAnkaraDestegi(indikatorlerCh5.getAnkaraDestegi() + 1);
                    indikatorlerCh5.setAskerMorali(indikatorlerCh5.getAskerMorali() + 1);
                    indikatorlerCh5.setKurmayDestegi(indikatorlerCh5.getKurmayDestegi() + 1);
                }
            } else if (secim == 3) {
                if (ucuncuSorudaSecilenSik == 1) {
                    throw new ArithmeticException("Geçersiz tuşlama yaptınız.");
                } else if (ucuncuSorudaSecilenSik == 2) {
                    throw new ArithmeticException("Geçersiz tuşlama yaptınız.");
                } else if (ucuncuSorudaSecilenSik == 3) {
                    indikatorlerCh5.setAnkaraDestegi(indikatorlerCh5.getAnkaraDestegi() - 3);
                    indikatorlerCh5.setHalkDestegi(indikatorlerCh5.getHalkDestegi() - 1);
                    indikatorlerCh5.setPkkGucu(indikatorlerCh5.getPkkGucu() - 4);
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