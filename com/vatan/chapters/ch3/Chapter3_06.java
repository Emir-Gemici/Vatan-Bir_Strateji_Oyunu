package com.vatan.chapters.ch3;

import com.vatan.core.*;
import java.util.Random;
import java.util.Scanner;

public class Chapter3_06 extends Olay<IndikatorlerCh3> {

    public Chapter3_06() {
        super(
                "Saha Komutanı:\n" +
                        "Paşam, bildiğiniz üzere Bulgarlar da 2. Balkan Harbine dahil oldukları için çok karışıklık yaşıyorlar.\n" +
                        "Bu karışıklıktan faydalanarak belki Trakya'yı geri alabiliriz. Bu durumda bize ne emredersiniz?\n",
                new String[]{
                        "Şimdilik karışmayalım. Ordunun toparlanması ve savunma hattının güçlenmesi elzemdir.",
                        "Ordular! Hedefiniz Trakya'dır! Düz bir taarruzla toprağımızı geri alacağız.",
                        "Gizli bir operasyonla, oldubittiye getirerek Trakya'yı almaya çalışalım."
                }
        );
    }

    @Override
    public void oynat(IndikatorlerCh3 indikatorlerCh3) {
        MuzikKutusu olayMuzigi = new MuzikKutusu();
        olayMuzigi.oynat("Chapter3_06.mp3");
        soruSor();
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int secim = sc.nextInt();
            sc.nextLine();
            olayMuzigi.durdur();

            if (secim == 1) {
                yesilYaz("\n*** İHTİYATLI SAVUNMA ***\n");
                System.out.println("Savaşa girmeyerek orduyu koruduk. Edirne savunması güçlendi.");
                System.out.println("Subaylar bu kararlı duruştan memnun.");

                indikatorlerCh3.setAskerMorali(indikatorlerCh3.getAskerMorali() - 1);
                indikatorlerCh3.setBalkanGucu(indikatorlerCh3.getBalkanGucu() - 2);
                indikatorlerCh3.bolgeGuncelle("Edirne", 10);
                indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() + 1);
                indikatorlerCh3.setOrduGucu(indikatorlerCh3.getOrduGucu() + 1);
                indikatorlerCh3.setSubayDestegi(indikatorlerCh3.getSubayDestegi() + 2);
            } else if (secim == 2) {
                kirmiziYaz("\n*** CEPHEDEN TAARRUZ ***\n");
                System.out.println("Ordumuz Bulgar hatlarına yüklendi. Trakya geri alınıyor ancak kayıplarımız var.");
                System.out.println("Halk bu savaş halinden yorgun.");

                indikatorlerCh3.setAskerMorali(indikatorlerCh3.getAskerMorali() + 1);
                indikatorlerCh3.setBalkanGucu(indikatorlerCh3.getBalkanGucu() - 3);
                indikatorlerCh3.bolgeGuncelle("Edirne", 10);
                indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() - 1);
                indikatorlerCh3.setOrduGucu(indikatorlerCh3.getOrduGucu() - 2);
                indikatorlerCh3.setSubayDestegi(indikatorlerCh3.getSubayDestegi() - 2);
            } else if (secim == 3) {
                Random zar = new Random();
                int sans = zar.nextInt(100);

                if (sans < 50) {
                    yesilYaz("\n*** EDİRNE FATİHİ ENVER PAŞA! ***\n");
                    System.out.println("Yıldırım harekatıyla Bulgarları hazırlıksız yakaladık!");
                    System.out.println("Trakya ve Edirne tereyağından kıl çeker gibi geri alındı.");

                    indikatorlerCh3.setAskerMorali(indikatorlerCh3.getAskerMorali() + 3);
                    indikatorlerCh3.setBalkanGucu(indikatorlerCh3.getBalkanGucu() - 4);
                    indikatorlerCh3.bolgeGuncelle("Edirne", 10);
                    indikatorlerCh3.setPadisahDestegi(indikatorlerCh3.getPadisahDestegi() + 3);
                    indikatorlerCh3.setOrduGucu(indikatorlerCh3.getOrduGucu() - 2);
                    indikatorlerCh3.setSubayDestegi(indikatorlerCh3.getSubayDestegi() + 1);
                } else {
                    kirmiziYaz("\n*** OPERASYON FİYASKOSU ***\n");
                    System.out.println("Gizli harekatımız ifşa oldu ve pusuya düşürüldük.");
                    System.out.println("Hem askeri hem siyasi olarak büyük bir darbe aldık.");

                    indikatorlerCh3.setAskerMorali(indikatorlerCh3.getAskerMorali() - 3);
                    indikatorlerCh3.setBalkanGucu(indikatorlerCh3.getBalkanGucu() - 1);
                    indikatorlerCh3.bolgeGuncelle("Edirne", -5);
                    indikatorlerCh3.setPadisahDestegi(indikatorlerCh3.getPadisahDestegi() - 3);
                    indikatorlerCh3.setOrduGucu(indikatorlerCh3.getOrduGucu() - 3);
                    indikatorlerCh3.setSubayDestegi(indikatorlerCh3.getSubayDestegi() - 3);
                }
            } else {
                throw new ArithmeticException("Geçersiz tuşlama yaptınız.");
            }

            System.out.println("\n--------------------------------------------------------------------------");
            morYaz("!!! DÜNYA SAVAŞI BAŞLADI - CEPHELERDEN SON DAKİKA RAPORLARI !!!");
            System.out.println("--------------------------------------------------------------------------\n");

            System.out.println(">> Alman orduları Lüksemburg ve Belçika'yı işgal etti.");
            indikatorlerCh3.setIttifakGucu(indikatorlerCh3.getIttifakGucu() + 3);

            System.out.println(">> Ardennes ve Alsas-Loren'de Fransa geri çekildi.");
            indikatorlerCh3.setIttifakGucu(indikatorlerCh3.getIttifakGucu() - 1);
            indikatorlerCh3.setItilafGucu(indikatorlerCh3.getItilafGucu() - 3);

            System.out.println(">> Anvers çatışmasında Almanlar stratejik kazanç sağladı.");
            indikatorlerCh3.setIttifakGucu(indikatorlerCh3.getIttifakGucu() + 2);
            indikatorlerCh3.setItilafGucu(indikatorlerCh3.getItilafGucu() - 2);

            System.out.println(">> Ypres muharebesi kilitlendi.");
            indikatorlerCh3.setIttifakGucu(indikatorlerCh3.getIttifakGucu() + 1);
            indikatorlerCh3.setItilafGucu(indikatorlerCh3.getItilafGucu() - 1);

            System.out.println(">> Doğu Cephesi: Ruslar Doğu Prusya'da durduruldu (Tannenberg).");
            indikatorlerCh3.setIttifakGucu(indikatorlerCh3.getIttifakGucu() - 1);
            indikatorlerCh3.setItilafGucu(indikatorlerCh3.getItilafGucu() - 2);

            System.out.println(">> Doğu Cephesi: Ruslar, Vistül nehrinde Almanları geri püskürttü.");
            indikatorlerCh3.setIttifakGucu(indikatorlerCh3.getIttifakGucu() - 2);
            indikatorlerCh3.setItilafGucu(indikatorlerCh3.getItilafGucu() - 1);

            System.out.println("\n(Olayları geçmek için Enter'a basın...)");
            sc.nextLine();

        } else {
            olayMuzigi.durdur();
            throw new ArithmeticException("Lütfen sadece sayı giriniz.");
        }
    }
}