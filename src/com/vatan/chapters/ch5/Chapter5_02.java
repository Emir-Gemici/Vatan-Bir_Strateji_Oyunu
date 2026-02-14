package com.vatan.chapters.ch5;

import com.vatan.core.*;
import java.util.Scanner;

public class Chapter5_02 extends Olay<IndikatorlerCh5> {
    public Chapter5_02() {
        super(
                "Genelkurmay Başkanı Doğan Güreş: \n" +
                        "Albay Pamukoğlu, sınır boyunda ayakta kalan az sayıdaki karakollarımızdan aldığımız haberler hiç iç açıcı durmuyor.\n" +
                        "Yüzlerce kişilik gruplar halinde baskınlar yapabilecek hale geliyorlar ve daha da kötüsü şu var ki Rusya'dan karaborsaya düşen silahlara sahipler gibi duruyor.\n" +
                        "Ankara'da durumlar vahim… Başbakan acil müdahale etmemizi istedi. Senden hemen kurmaylarınla bir plan hazırlamanı ve uygulamaya koymanı istiyorum!\n",
                new String[]{
                        "Emredersiniz Komutanım! İkiyaka tarafında toplandıklarını öğrendik, hızlı davranırsak eşkıyayı ortadan kaldırabilirim!"
                }
        );
    }

    @Override
    public void oynat(IndikatorlerCh5 indikatorlerCh5) {
        MuzikKutusu olayMuzigi = new MuzikKutusu();
        olayMuzigi.oynat("Chapter5_02.mp3", 6.0f);
        soruSor();
        morYaz("(İkiyaka harekatı hazırlıkları başlar...)\n");
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int secim = sc.nextInt();
            sc.nextLine();
            olayMuzigi.durdur();
            if (secim == 1) {
                indikatorlerCh5.setAskerMorali(indikatorlerCh5.getAskerMorali() + 1);
                indikatorlerCh5.setKurmayDestegi(indikatorlerCh5.getKurmayDestegi() + 1);
            } else {
                throw new ArithmeticException("Geçersiz tuşlama yaptınız.");
            }
        } else {
            olayMuzigi.durdur();
            throw new ArithmeticException("Lütfen sadece sayı giriniz.");
        }
    }
}