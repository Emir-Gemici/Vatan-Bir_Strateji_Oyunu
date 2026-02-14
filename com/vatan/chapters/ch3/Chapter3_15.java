package com.vatan.chapters.ch3;

import com.vatan.core.*;
import java.util.Random;
import java.util.Scanner;

public class Chapter3_15 extends Olay<IndikatorlerCh3> {

    public Chapter3_15() {
        super("", new String[]{});
    }

    @Override
    public void oynat(IndikatorlerCh3 indikatorlerCh3) {
        int oncekiSecim = indikatorlerCh3.getonBirinciSorudaSecilenSik();
        MuzikKutusu olayMuzigi = new MuzikKutusu();

        if (oncekiSecim == 1) {
            this.metin =
                    "Kuşçubaşı Eşref: Kardeşim, İtilaf Devletleri safında yer almayı planlıyoruz peki anlıyorum.\n" +
                            "Fakat yine de savaştan bize de adam akıllı pay düşebilmesi için bir şeyler yapmak icap eder. Ne yapmalı?\n";

            this.cevaplar = new String[]{
                    "İngiltere ile anlaşma yapalım. Destek karşılığında maddi yardım isteyelim.",
                    "İngilizlerden ordumuzu modernleştirecek bir askeri heyet isteyelim.",
                    "Henüz yardım istemeyelim, sadece tarafımızı belli edelim."
            };
            olayMuzigi.oynat("1/Chapter3_15.mp3");

        } else if (oncekiSecim == 2) {
            this.metin =
                    "Kuşçubaşı Eşref: Kardeşim, İttifak saflarında olmayı planlıyoruz.\n" +
                            "Eğer sahiden düşündüğün gibi Almanlar bu kadar güçlüyse elimize bazı fırsatlar geçebilir.\n" +
                            "Ancak bunları kullanabilmek için orduyu savaşa hazırlamak icap eder. Nasıl hazırlamayı planlıyorsun?\n";

            this.cevaplar = new String[]{
                    "İstihbarat ağını güçlendirelim. Yetenekli bir muhbir görevlendirip İngiliz planlarını öğrenelim.",
                    "Almanlardan maddi destek alalım, donanımımızı güçlendirelim."
            };
            olayMuzigi.oynat("2/Chapter3_15.mp3");

        } else if (oncekiSecim == 3) {
            this.metin =
                    "Kuşçubaşı Eşref: Kardeşim, tarafsız kalmaya devam mı edeceğiz?\n" +
                            "Bu durumda devleti düzeltmemiz mümkün değil. Devleti ancak savaşa katılıp kalkındırabiliriz.\n";

            this.cevaplar = new String[]{
                    "Hayır Eşref. Bu savaşa katılırsak devlet net bir şekilde çok ağır kayba uğrayacaktır. Zaten vatanın yarısı elden gitmiş."
            };
            olayMuzigi.oynat("3/Chapter3_15.mp3");
        }

        soruSor();

        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int secim = sc.nextInt();
            sc.nextLine();
            olayMuzigi.durdur();

            if (oncekiSecim == 1) {
                if (secim == 1) {
                    Random zar = new Random();
                    if (zar.nextInt(100) < 50) {
                        yesilYaz("\n*** İNGİLİZ ALTINLARI GELDİ ***\n");
                        indikatorlerCh3.setIkmalDurumu(indikatorlerCh3.getIkmalDurumu() + 5);
                        indikatorlerCh3.setOrduGucu(indikatorlerCh3.getOrduGucu() + 3);
                        indikatorlerCh3.setSavasTehlikesi(indikatorlerCh3.getSavasTehlikesi() + 2);
                        indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() - 3);
                        indikatorlerCh3.bolgeGuncelle("Edirne", 5);
                    } else {
                        kirmiziYaz("\n*** İNGİLTERE REDDETTİ ***\n");
                        indikatorlerCh3.setItilafIliskisi(indikatorlerCh3.getItilafIliskisi() - 2);
                        indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() - 1);
                    }
                } else if (secim == 2) {
                    yesilYaz("\n*** İNGİLİZ ASKERİ HEYETİ GELDİ ***\n");
                    indikatorlerCh3.setOrduGucu(indikatorlerCh3.getOrduGucu() + 3);
                    indikatorlerCh3.setSavasTehlikesi(indikatorlerCh3.getSavasTehlikesi() + 2);
                    indikatorlerCh3.bolgeGuncelle("Edirne", 3);
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() - 3);
                    indikatorlerCh3.setAskerMorali(indikatorlerCh3.getAskerMorali() - 1);
                } else if (secim == 3) {
                    yesilYaz("\n*** POLİTİK DURUŞ ***\n");
                    indikatorlerCh3.setSavasTehlikesi(indikatorlerCh3.getSavasTehlikesi() + 3);
                    indikatorlerCh3.bolgeGuncelle("Edirne", -2);
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() + 2);
                    indikatorlerCh3.setAskerMorali(indikatorlerCh3.getAskerMorali() + 2);
                    indikatorlerCh3.setPadisahDestegi(indikatorlerCh3.getPadisahDestegi() + 1);
                } else {
                    throw new ArithmeticException("Geçersiz tuşlama yaptınız.");
                }

            } else if (oncekiSecim == 2) { // İTTİFAK SONUÇLARI
                if (secim == 1) {
                    Random zar = new Random();
                    if (zar.nextInt(100) < 50) {
                        yesilYaz("\n*** TEŞKİLAT-I MAHSUSA ZAFERİ ***\n");
                        indikatorlerCh3.setMuhbirBasarisi(true);
                        indikatorlerCh3.setAskerMorali(indikatorlerCh3.getAskerMorali() + 3);
                        indikatorlerCh3.setPadisahDestegi(indikatorlerCh3.getPadisahDestegi() + 3);
                        indikatorlerCh3.bolgeGuncelle("Edirne", 5);
                        indikatorlerCh3.setOrduGucu(indikatorlerCh3.getOrduGucu() + 2);
                    } else {
                        kirmiziYaz("\n*** MUHBİR YAKALANDI ***\n");
                        indikatorlerCh3.setMuhbirBasarisi(false);
                        indikatorlerCh3.setAskerMorali(indikatorlerCh3.getAskerMorali() - 2);
                        indikatorlerCh3.setPadisahDestegi(indikatorlerCh3.getPadisahDestegi() - 3);
                        indikatorlerCh3.bolgeGuncelle("Edirne", -3);
                    }
                } else if (secim == 2) {
                    yesilYaz("\n*** DEUTSCHE MARK DESTEĞİ ***\n");
                    indikatorlerCh3.setOrduGucu(indikatorlerCh3.getOrduGucu() + 2);
                    indikatorlerCh3.setAskerMorali(indikatorlerCh3.getAskerMorali() + 1);
                    indikatorlerCh3.bolgeGuncelle("Edirne", 1);
                } else {
                    throw new ArithmeticException("Geçersiz tuşlama yaptınız.");
                }

            } else if (oncekiSecim == 3) { // TARAFSIZLIK SONUCU
                if (secim == 1) {
                    System.out.println(RenkliYazici.SARI + "\n*** BEKLEME DEVRİ ***" + RenkliYazici.RESET);
                } else {
                    throw new ArithmeticException("Geçersiz tuşlama yaptınız.");
                }
            }

        } else {
            olayMuzigi.durdur();
            throw new ArithmeticException("Lütfen sadece sayı giriniz.");
        }
    }
}