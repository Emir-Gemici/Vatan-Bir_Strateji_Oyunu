package com.vatan.chapters.ch3;

import com.vatan.core.*;
import java.util.Scanner;

public class Chapter3_13 extends Olay<IndikatorlerCh3> {

    public Chapter3_13() {
        super(
                "Bahriye Nazırı Cemal Paşa: Enver, hatırlarsan zamanında iki zırhlı almak istemiştik.\n" +
                        "Parasını vermemize rağmen teslim alamıyoruz. İngiliz Harp Bakanı gönderdiğimiz telgraflara herhangi bir cevap vermedi.\n" +
                        "Muhtemeldir ki İngilizler o iki zırhlıyı çoktan donanmalarına katmışlardır.\n" +
                        "Halbuki o ikisi bile Akdeniz'de kendimizi müdafaaya yetecekti...\n",
                new String[]{
                        "Said Halim Paşaya haber verelim. Almanların Akdeniz'de seyahat eden iki zırhlısı vardı. Bunları isteyebiliriz.",
                        "Bir daha yazın. Muhtemelen teslim edeceklerdir."
                }
        );
    }

    @Override
    public void oynat(IndikatorlerCh3 indikatorlerCh3) {
        MuzikKutusu olayMuzigi = new MuzikKutusu();
        olayMuzigi.oynat("Chapter3_13.mp3");
        soruSor();
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int secim = sc.nextInt();
            sc.nextLine();
            olayMuzigi.durdur();

            if (secim == 1) {
                yesilYaz("\n*** GOBEN VE BRESLAU ROTASINI ÇEVİRDİ ***\n");
                System.out.println("Almanlarla temas kuruldu. İki güçlü Alman zırhlısı rotasını Çanakkale Boğazı'na çevirdi.");
                System.out.println("Bu hamle bizi Almanlara yaklaştırırken savaşa girme riskini artırdı.");

                indikatorlerCh3.setIttifakIliskisi(indikatorlerCh3.getIttifakIliskisi() + 3);
                indikatorlerCh3.setSavasTehlikesi(indikatorlerCh3.getSavasTehlikesi() + 2);
                indikatorlerCh3.setSubayDestegi(indikatorlerCh3.getSubayDestegi() + 1);
            } else if (secim == 2) {
                kirmiziYaz("\n*** İNGİLİZLERE SON ÇAĞRI ***\n");
                System.out.println("Diplomatik ısrarımız İngilizleri yumuşatmasa da İtilaf bloğu ile ipleri tamamen koparmadık.");
                System.out.println("Ancak paramızla rezil olmamız subayların gururunu incitti.");

                indikatorlerCh3.setItilafIliskisi(indikatorlerCh3.getItilafIliskisi() + 4);
                indikatorlerCh3.setOrduGucu(indikatorlerCh3.getOrduGucu() + 1);
                indikatorlerCh3.setSubayDestegi(indikatorlerCh3.getSubayDestegi() - 1);
            } else {
                throw new ArithmeticException("Geçersiz tuşlama yaptınız.");
            }
        } else {
            olayMuzigi.durdur();
            throw new ArithmeticException("Lütfen sadece sayı giriniz.");
        }
    }
}