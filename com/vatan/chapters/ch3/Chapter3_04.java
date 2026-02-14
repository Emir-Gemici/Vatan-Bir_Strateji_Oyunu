package com.vatan.chapters.ch3;

import com.vatan.core.*;
import java.util.Random;
import java.util.Scanner;

public class Chapter3_04 extends Olay<IndikatorlerCh3> {

    public Chapter3_04() {
        super(
                "Saha Komutanı: Paşam, Çatalca'yı zar zor savunuyoruz. Savunma stratejisi için ne yapmamızı emredersiniz?\n",
                new String[]{
                        "Düşmanı daha çok yorabilmek için taarruz ağırlıklı saldıralım...",
                        "Biraz geri çekilip pusu kurmak."
                }
        );
    }

    @Override
    public void oynat(IndikatorlerCh3 indikatorlerCh3) {
        MuzikKutusu olayMuzigi = new MuzikKutusu();
        olayMuzigi.oynat("Chapter3_04.mp3");
        soruSor();
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int secim = sc.nextInt();
            sc.nextLine();
            olayMuzigi.durdur();

            if (secim == 1) {
                yesilYaz("\n*** KARŞI TAARRUZ EMRİ VERİLDİ ***\n");
                System.out.println("Asker yorgun olmasına rağmen düşman üzerine yürüdü.");
                System.out.println("Bu hamle düşmanı şaşırtsa da ordumuzu yıprattı.");
                System.out.println("Edirne üzerindeki baskıyı bir nebze hafifletmeyi başardık.");

                indikatorlerCh3.setAskerMorali(indikatorlerCh3.getAskerMorali() - 2);
                indikatorlerCh3.setBalkanGucu(indikatorlerCh3.getBalkanGucu() - 5);
                indikatorlerCh3.setPadisahDestegi(indikatorlerCh3.getPadisahDestegi() - 3);
                indikatorlerCh3.setOrduGucu(indikatorlerCh3.getOrduGucu() - 3);
                indikatorlerCh3.setSubayDestegi(indikatorlerCh3.getSubayDestegi() + 3);
                indikatorlerCh3.bolgeGuncelle("Edirne", 5);
            }
            else if (secim == 2) {
                Random zar = new Random();
                int sans = zar.nextInt(100);

                if (sans < 50) {
                    yesilYaz("\n*** PUSU BAŞARILI! ***\n");
                    System.out.println("Geri çekilir gibi yapıp Bulgar kuvvetlerini tuzağa çektik.");
                    System.out.println("Düşman ağır kayıp verdi, moralimiz yükseldi.");

                    indikatorlerCh3.setAskerMorali(indikatorlerCh3.getAskerMorali() + 3);
                    indikatorlerCh3.setBalkanGucu(indikatorlerCh3.getBalkanGucu() - 5);
                    indikatorlerCh3.setSubayDestegi(indikatorlerCh3.getSubayDestegi() + 3);
                    indikatorlerCh3.bolgeGuncelle("Edirne", 5);
                } else {
                    kirmiziYaz("\n*** PUSU FARK EDİLDİ ***\n");
                    System.out.println("Düşman keşif kolları tuzağımızı erkenden fark etti.");
                    System.out.println("Hazırlıksız yakalanan birliklerimiz mevzilerini terk etmek zorunda kaldı.");
                    System.out.println("Edirne ile olan bağlantımız iyice koptu...");

                    indikatorlerCh3.setAskerMorali(indikatorlerCh3.getAskerMorali() - 3);
                    indikatorlerCh3.setPadisahDestegi(indikatorlerCh3.getPadisahDestegi() - 3);
                    indikatorlerCh3.setSubayDestegi(indikatorlerCh3.getSubayDestegi() - 3);
                    indikatorlerCh3.bolgeGuncelle("Edirne", -10);
                }
            }
            else {
                throw new ArithmeticException("Geçersiz tuşlama yaptınız.");
            }
        }
        else {
            olayMuzigi.durdur();
            throw new ArithmeticException("Lütfen sadece sayı giriniz.");
        }
    }
}