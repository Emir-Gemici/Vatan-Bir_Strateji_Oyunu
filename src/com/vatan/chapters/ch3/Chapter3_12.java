package com.vatan.chapters.ch3;

import com.vatan.core.*;
import java.util.Scanner;

public class Chapter3_12 extends Olay<IndikatorlerCh3> {

    public Chapter3_12() {
        super(
                "Padişah V. Mehmed Reşad:\n" +
                        "Enver, sevgili evladım, Dersaadet'e gelmenin sebebinden haberdarım. Umumi Harp başlamış ve muhtelif gavur memleketlerin iktidar sahipleri Müslüman milletleri kendi sancakları altında muharebeye sürmektedirler.\n" +
                        "Bana yazdığın mektupta da demiş bulunduğun üzere Müslüman milletlerin ancak Sancak-ı Şerif altında birleşmesi doğrudur.\n" +
                        "Bu nedenle Osmanlı Devleti'nin düşmanlarına karşı Cihad ilan ediyorum!\n",
                new String[]{
                        "Milyonlarca Müslümanın yeri Zat-ı Şahanelerinin ve Devlet-i Aliyye'nin yanıdır!"
                }
        );
    }

    @Override
    public void oynat(IndikatorlerCh3 indikatorlerCh3) {
        MuzikKutusu olayMuzigi = new MuzikKutusu();
        olayMuzigi.oynat("Chapter3_12.mp3");
        soruSor();
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int secim = sc.nextInt();
            sc.nextLine();
            olayMuzigi.durdur();

            if (secim == 1) {
                yesilYaz("\n*** CİHAD-I EKBER İLAN EDİLDİ ***\n");
                System.out.println("Fatih Camii avlusunda okunan fetva ile tüm İslam alemi sancağa çağrıldı.");
                System.out.println("Askerlerin maneviyatı yükseldi, ordunun safları sıklaştı.");

                indikatorlerCh3.setAskerMorali(indikatorlerCh3.getAskerMorali() + 2);
                indikatorlerCh3.setSubayDestegi(indikatorlerCh3.getSubayDestegi() - 1);
                indikatorlerCh3.setPadisahDestegi(indikatorlerCh3.getPadisahDestegi() + 1);
                indikatorlerCh3.setOrduGucu(indikatorlerCh3.getOrduGucu() + 2);
            } else {
                throw new ArithmeticException("Geçersiz tuşlama yaptınız.");
            }
        } else {
            olayMuzigi.durdur();
            throw new ArithmeticException("Lütfen sadece sayı giriniz.");
        }
    }
}