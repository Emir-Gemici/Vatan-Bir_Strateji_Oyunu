package com.vatan.chapters.ch3;

import com.vatan.core.*;
import java.util.Scanner;

public class Chapter3_01 extends Olay<IndikatorlerCh3> {
    public static void baslangic(IndikatorlerCh3 indikatorlerCh3) {
        System.out.println("\u001B[41m"+"\u001B[30m"+"              === Chapter 3: ENVER PAŞA - HARBİYE NEZARETİ ===            "+"\u001B[0m");
        IndikatorlerCh3.baslangic(indikatorlerCh3);
    }
    public Chapter3_01() {
        super(
                "Talat Paşa:\n" +
                        "Enver, kardeşim, zannediyorum ki patlayan harbi duymuşsundur. Korktuğumuz felaket başımıza geldi.\n" +
                        "Sırplar, Karadağlılar, Bulgarlar ve Yunan keferesi bir olmuşlar! Şimdiden Sırp orduları Kumanova'ya,\n" +
                        "Bulgarlar ise muhtemelen Makedonya tarafına ilerleyecek gibi.\n" +
                        "Hükümet Trablusgarpı teslim etmeyi kabul etmiş olacak ki sana gelecek olan yedek subayları da Erkan-ı Harbiye'ye geri çağırmış.\n" +
                        "Sana da sözüm odur ki vatana dönesin aziz kardeşim...\n",
                new String[]{
                        "Vatanın bağrına dönme vaktidir... (İstanbul'a Dönüş)"
                }
        );
    }

    @Override
    public void oynat(IndikatorlerCh3 indikatorlerCh3) {
        MuzikKutusu olayMuzigi = new MuzikKutusu();
        olayMuzigi.oynat("Chapter3_01.mp3");
        soruSor();
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int secim = sc.nextInt();
            sc.nextLine();
            olayMuzigi.durdur();

            if (secim == 1) {
                yesilYaz("\n*** TRABLUSGARP CEPHESİ KAPANDI ***\n");
                System.out.println("Çölün ortasında verilen mücadele sona erdi. Şimdi hedef Payitaht, hedef Balkanlar...");

                indikatorlerCh3.setAskerMorali(indikatorlerCh3.getAskerMorali() + 2);
                indikatorlerCh3.setSubayDestegi(indikatorlerCh3.getSubayDestegi() - 1);
                indikatorlerCh3.setPadisahDestegi(indikatorlerCh3.getPadisahDestegi() + 2);
                indikatorlerCh3.bolgeGuncelle("Trablusgarp", -25);
            } else {
                throw new ArithmeticException("Geçersiz tuşlama yaptınız.");
            }
        } else {
            olayMuzigi.durdur();
            throw new ArithmeticException("Lütfen sadece sayı giriniz.");
        }
    }
}