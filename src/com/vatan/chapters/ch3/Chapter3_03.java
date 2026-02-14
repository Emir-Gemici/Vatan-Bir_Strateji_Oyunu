package com.vatan.chapters.ch3;

import com.vatan.core.*;
import java.util.Scanner;

public class Chapter3_03 extends Olay<IndikatorlerCh3> {

    public Chapter3_03() {
        super(
                "Kamil Paşa: Enver, evladım bu ne hal! Ne hadle Bab-ı Ali'nin önüne böyle silahlarla geliyorsunuz?\n" +
                        "Ne oluyor orada? Aman Ya Rabbi! Yakup Cemil kimi vuruyor? Nazım Paşa mı o? Enver evladım bu nasıl hal siz delirdiniz mi!? İhtilaldir bu! Ne istiyorsunuz hükümetten? Derhal gidin!\n",
                new String[]{
                        "İstifanızı Sadrazam hazretleri. Osmanlı ordusunun bu halinin sorumlusu sizsiniz!",
                        "Sizden derhal seferberlik etmenizi ve savaşa devamınızı rica ediyoruz Sadrazam Hazretleri!"
                }
        );
    }

    @Override
    public void oynat(IndikatorlerCh3 indikatorlerCh3) {
        MuzikKutusu olayMuzigi = new MuzikKutusu();
        MuzikKutusu olayMuzigi2 = new MuzikKutusu();
        olayMuzigi.oynat("Chapter3_03.mp3");
        olayMuzigi2.oynat("catisma.mp3",-12);
        soruSor();
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int secim = sc.nextInt();
            sc.nextLine();
            olayMuzigi.durdur();
            olayMuzigi2.durdur();

            if (secim == 1) {
                yesilYaz("\n*** BAB-I ALİ BASKINI BAŞARIYA ULAŞTI ***\n");
                System.out.println("Sadrazam Kamil Paşa silah zoruyla istifa ettirildi.");
                System.out.println("Mahmut Şevket Paşa yeni Sadrazam oldu. İttihat ve Terakki iktidarı tam manasıyla ele geçirdi.");
                System.out.println("Ancak bu siyasi kargaşa sırasında Balkanlardaki son topraklar da savunmasız kaldı...");

                indikatorlerCh3.setAskerMorali(indikatorlerCh3.getAskerMorali() + 2);
                indikatorlerCh3.setOrduGucu(indikatorlerCh3.getOrduGucu() - 1);

                kirmiziYaz("Rumeli elden çıktı...\n");
                indikatorlerCh3.setBolgePuan("Edirne", 0);
                indikatorlerCh3.setBolgePuan("Selanik", 0);
                indikatorlerCh3.setBolgePuan("Manastır", 0);
            }
            else if (secim == 2) {
                kirmiziYaz("\n*** HÜKÜMET KRİZİ VE KARGAŞA ***\n");
                System.out.println("Mevcut hükümetle savaşa devam kararı alındı ancak ordu siyasetten yorgun düştü.");
                System.out.println("Emir komuta zincirindeki zafiyet sonucu Rumeli cephesi tamamen çöktü.");

                indikatorlerCh3.setOrduGucu(indikatorlerCh3.getOrduGucu() - 1);
                indikatorlerCh3.setPadisahDestegi(indikatorlerCh3.getPadisahDestegi() - 2);
                indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() + 1);

                kirmiziYaz("Rumeli elden çıktı...");
                indikatorlerCh3.setBolgePuan("Edirne", 0);
                indikatorlerCh3.setBolgePuan("Selanik", 0);
                indikatorlerCh3.setBolgePuan("Manastır", 0);
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