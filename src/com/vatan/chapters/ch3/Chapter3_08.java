package com.vatan.chapters.ch3;

import com.vatan.core.*;
import java.util.Scanner;

public class Chapter3_08 extends Olay<IndikatorlerCh3> {

    public Chapter3_08() {
        super(
                "Padişah V. Mehmet Reşad:\n" +
                        "Enver evladım, hoş geldin. Abdülaziz'in kızı sevgili Naciye ile olan muhabbetini işittim.\n" +
                        "Bu haber beni oldukça bahtiyar etti. Ahmet İzzet Paşa'nın ardından Harbiye Nezareti'ni zaten devralmıştın.\n" +
                        "Senin gibi civanmert bir subaya yaraşan, Hanedan-ı Osmani'ye damat olarak girmektir.\n" +
                        "Bu muhabbetinize müsaade ediyorum. En kısa sürede seni hanedanın damadı olarak görmek isterim.\n",
                new String[]{
                        "Takdiriniz için müteşekkirim, Zat-ı Şahaneleri. Muhakkak Hanedan-ı Osmani'nin adına yaraşacak bir damat olacağım."
                }
        );
    }

    @Override
    public void oynat(IndikatorlerCh3 indikatorlerCh3) {
        MuzikKutusu olayMuzigi = new MuzikKutusu();
        olayMuzigi.oynat("Chapter3_08.mp3");
        soruSor();
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int secim = sc.nextInt();
            sc.nextLine();
            olayMuzigi.durdur();

            if (secim == 1) {
                yesilYaz("\n*** DAMAT-I ŞEHRİYARİ ENVER PAŞA ***\n");
                System.out.println("Sarayla kurulan bu akrabalık bağı gücünüze güç kattı.");
                System.out.println("Artık sadece Harbiye Nazırı değil, Hanedan'ın bir parçasısınız.");

                indikatorlerCh3.setAskerMorali(indikatorlerCh3.getAskerMorali() + 2);
                indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() + 2);
                indikatorlerCh3.setPadisahDestegi(indikatorlerCh3.getPadisahDestegi() + 3);
                indikatorlerCh3.setSubayDestegi(indikatorlerCh3.getSubayDestegi() + 2);
            } else {
                throw new ArithmeticException("Geçersiz tuşlama yaptınız.");
            }
        } else {
            olayMuzigi.durdur();
            throw new ArithmeticException("Lütfen sadece sayı giriniz.");
        }
    }
}