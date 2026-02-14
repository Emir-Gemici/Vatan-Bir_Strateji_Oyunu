package com.vatan.chapters.ch5;

import com.vatan.core.*;
import java.util.Scanner;

public class Chapter5_03 extends Olay<IndikatorlerCh5> {
    public Chapter5_03() {
        super(
                "Kurmay yüzbaşı:\n" +
                        "Komutanım, emrettiğiniz üzere İkiyaka Dağları'nda toplanan eşkıyayı ortadan kaldırmak üzere planlarımızı hazırladık.\n" +
                        "Uzun süren planlamanın ardından üç farklı yöntemle saldırabileceğimize kanaat getirdik.\n" +
                        "Son karar sizindir komutanım!\n",
                new String[]{
                        "Eşkıyaların seviyesine inemeyiz. Nizami Çatışma (1. Plan).",
                        "Ateşe ateşle karşılık verecek ve terörü kurutacağız. (Küçük Gruplar).",
                        "Ateş gücüne dayalı bir plan mantıklı duruyor. (Topçu Atışı)."
                }
        );
    }

    @Override
    public void oynat(IndikatorlerCh5 indikatorlerCh5) {
        MuzikKutusu olayMuzigi = new MuzikKutusu();
        olayMuzigi.oynat("Chapter5_03.mp3");
        soruSor();
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int secim = sc.nextInt();
            sc.nextLine();
            olayMuzigi.durdur();
            indikatorlerCh5.setUcuncuSorudaSecilenSik(secim);
            if (secim == 1) {
                indikatorlerCh5.setAskerMorali(indikatorlerCh5.getAskerMorali() - 1);
                indikatorlerCh5.setHalkDestegi(indikatorlerCh5.getHalkDestegi() + 1);
                indikatorlerCh5.setKurmayDestegi(indikatorlerCh5.getKurmayDestegi() - 1);
                indikatorlerCh5.setPkkGucu(indikatorlerCh5.getPkkGucu() - 2);
            } else if (secim == 2) {
                indikatorlerCh5.setAnkaraDestegi(indikatorlerCh5.getAnkaraDestegi() - 1);
                indikatorlerCh5.setAskerMorali(indikatorlerCh5.getAskerMorali() + 1);
                indikatorlerCh5.setPkkGucu(indikatorlerCh5.getPkkGucu() - 2);
            } else if (secim == 3) {
                indikatorlerCh5.setHalkDestegi(indikatorlerCh5.getHalkDestegi() - 3);
                indikatorlerCh5.setPkkGucu(indikatorlerCh5.getPkkGucu() - 3);
                indikatorlerCh5.setTskGucu(indikatorlerCh5.getTskGucu() - 2);
            } else {
                throw new ArithmeticException("Geçersiz tuşlama yaptınız.");
            }
        } else {
            olayMuzigi.durdur();
            throw new ArithmeticException("Lütfen sadece sayı giriniz.");
        }
    }
}