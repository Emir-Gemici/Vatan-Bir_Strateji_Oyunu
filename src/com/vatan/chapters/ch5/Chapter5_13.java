package com.vatan.chapters.ch5;

import com.vatan.core.*;
import java.util.Scanner;

public class Chapter5_13 extends Olay<IndikatorlerCh5> {
    @Override
    public void oynat(IndikatorlerCh5 indikatorlerCh5) {
        int ucuncuSorudaSecilenSik = indikatorlerCh5.getUcuncuSorudaSecilenSik();
        MuzikKutusu olayMuzigi = new MuzikKutusu();

        if (ucuncuSorudaSecilenSik == 1) {
            this.metin =
                    "İstihbaratçı Teğmen:\n" +
                            "Balkaya Harekatı başarılı geçti paşam.Lakin askerimiz yoğun çaba sonucunda yorgun düştü.\n" +
                            "Bu yorgunluğu giderebilmek için bir süre savunma ağırlıklı bir strateji mi izleyelim yoksa saldırı ağırlıklı stratejiden devam mı?\n";
            this.cevaplar =
                    new String[]{
                            "Askerimiz biraz kendini toparlasın o vakit.Savunmaya önem verelim.",
                            "Kesinlikle hayır , askerimiz yorulsa da bu eşkiyaların üstesinden gelecektir.Bu eşkiyaların belini bükmeye devam!"
                    };
            olayMuzigi.oynat("1/Chapter5_13.mp3", 4.0f);
        } else if (ucuncuSorudaSecilenSik == 2) {
            this.metin =
                    "Kurmay Yüzbaşı:\n" +
                            "Paşam, Balkaya'nın ardından emrettiğiniz gibi Kato ve Buzul Dağı'na ilerliyoruz. Ancak soğuk hava şartları askerlerimizi zorluyor.\n" +
                            "Karadan ilerlememiz imkansız hale geldi. Hava indirmecilerden yardım istememiz elzem duruyor. Son karar sizindir komutanım!\n";
            this.cevaplar =
                    new String[]{
                            "Hava İndirmecileri gönderin, hain eşkıyanın tepesine askerlerimizi indirmemiz gerek!"
                    };
            olayMuzigi.oynat("2/Chapter5_13.mp3");
        } else if (ucuncuSorudaSecilenSik == 3) {
            this.metin =
                    "Genelkurmay Başkanı Doğan Güreş:\n" +
                            "Tebrik ederim Pamukoğlu. Hain eşkıyayı dize getirme konusunda pek çok subayımıza örnek oluyorsun. Avaşin üzerine taarruzuna müsaade ettim.\n" +
                            "Hatta bunu müteakip sana destek olması için bölgedeki jandarmalara da talimat verildi. Allah yardımcın olsun.\n";
            this.cevaplar =
                    new String[]{
                            "Gelen her desteğe ihtiyacımız var komutanım, sağolun.",
                            "Paşam, jandarmamız gerimizi kollasa yeter, biz kendi meselemizi halledebilecek durumdayız."
                    };
            olayMuzigi.oynat("3/Chapter5_13.mp3", 6.0f);
        }

        soruSor();

        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int secim = sc.nextInt();
            sc.nextLine();
            olayMuzigi.durdur();

            if (secim == 1) {
                if (ucuncuSorudaSecilenSik == 1) {
                    indikatorlerCh5.setAskerMorali(indikatorlerCh5.getAskerMorali() + 2);
                    indikatorlerCh5.setPkkGucu(indikatorlerCh5.getPkkGucu() + 2);
                    indikatorlerCh5.setTskGucu(indikatorlerCh5.getTskGucu() + 2);
                } else if (ucuncuSorudaSecilenSik == 2) {
                    indikatorlerCh5.setKurmayDestegi(indikatorlerCh5.getKurmayDestegi() + 1);
                    indikatorlerCh5.setPkkGucu(indikatorlerCh5.getPkkGucu() - 1);
                } else if (ucuncuSorudaSecilenSik == 3) {
                    indikatorlerCh5.setAnkaraDestegi(indikatorlerCh5.getAnkaraDestegi() - 1);
                    indikatorlerCh5.setTskGucu(indikatorlerCh5.getTskGucu() + 1);
                }
            } else if (secim == 2) {
                if (ucuncuSorudaSecilenSik == 1) {
                    indikatorlerCh5.setAnkaraDestegi(indikatorlerCh5.getAnkaraDestegi() + 1);
                    indikatorlerCh5.setAskerMorali(indikatorlerCh5.getAskerMorali() - 2);
                    indikatorlerCh5.setPkkGucu(indikatorlerCh5.getPkkGucu() - 3);
                    indikatorlerCh5.setTskGucu(indikatorlerCh5.getTskGucu() - 2);
                } else if (ucuncuSorudaSecilenSik == 2) {
                    throw new ArithmeticException("Geçersiz tuşlama yaptınız.");
                } else if (ucuncuSorudaSecilenSik == 3) {
                    indikatorlerCh5.setAnkaraDestegi(indikatorlerCh5.getAnkaraDestegi() - 1);
                    indikatorlerCh5.setTskGucu(indikatorlerCh5.getTskGucu() - 1);
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