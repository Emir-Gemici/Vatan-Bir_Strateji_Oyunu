package com.vatan.chapters.ch3;

import com.vatan.core.*;
import java.util.Scanner;

public class Chapter3_09 extends Olay<IndikatorlerCh3> {

    public Chapter3_09() {
        super(
                "Talat Paşa: Enver, Hoşgeldin! Payitahta alışıyorsun gibi görünüyor. İyi iyi... Ama doğudaki vaziyet hakkında uğraşan benim tabii!\n" +
                        "Gelen haberlere göre Ermeni komiteleri Doğu'da gizli toplantılar düzenlemeye başlamış, Rus Çarı'ndan para aldıkları söyleniyor.\n" +
                        "Bunları inceleyecek zaptiye memuru da yok. Senden Umum Jandarma Komutanlığı'na emir verip Dahiliye Nezareti'ne yardım etmeni istesem olur mu?\n",
                new String[]{
                        "Elbette aziz biraderim. Bu gizli toplantılar muhtemelen doğuda bir Ermeni devleti planlamasıdır.",
                        "Talat, sana bunu demek zorundayım ama yardım edemem. Jandarmanın eli kolu bağlı..."
                }
        );
    }

    @Override
    public void oynat(IndikatorlerCh3 indikatorlerCh3) {
        MuzikKutusu olayMuzigi = new MuzikKutusu();
        olayMuzigi.oynat("Chapter3_09.mp3");
        soruSor();
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int secim = sc.nextInt();
            sc.nextLine();
            olayMuzigi.durdur();

            if (secim == 1) {
                yesilYaz("\n*** JANDARMA SEVKİYATI BAŞLADI ***\n");
                System.out.println("Jandarma birlikleri ve teçhizat doğu illerine kaydırıldı.");
                System.out.println("Bölgede asayiş ve devlet otoritesi sağlandı ancak bu durum ordunun kaynaklarını sarstı.");

                indikatorlerCh3.setAskerMorali(indikatorlerCh3.getAskerMorali() - 1);
                indikatorlerCh3.setIkmalDurumu(indikatorlerCh3.getIkmalDurumu() - 1);
                indikatorlerCh3.bolgeGuncelle("Kafkas", 10);
                indikatorlerCh3.setOrduGucu(indikatorlerCh3.getOrduGucu() - 2);
                indikatorlerCh3.setPadisahDestegi(indikatorlerCh3.getPadisahDestegi() + 2);
                indikatorlerCh3.setSubayDestegi(indikatorlerCh3.getSubayDestegi() + 2);
            }
            else if (secim == 2) {
                kirmiziYaz("\n*** DOĞUDA OTORİTE BOŞLUĞU ***\n");
                System.out.println("Talat Paşa bu karara bozuldu. Jandarma desteği olmayınca komiteler rahatça örgütlendi.");
                System.out.println("Ordu kaynakları korundu ama Doğu'daki hakimiyetimiz ciddi yara aldı.");

                indikatorlerCh3.setAskerMorali(indikatorlerCh3.getAskerMorali() + 1);
                indikatorlerCh3.bolgeGuncelle("Kafkas", -10);
                indikatorlerCh3.setOrduGucu(indikatorlerCh3.getOrduGucu() + 1);
                indikatorlerCh3.setPadisahDestegi(indikatorlerCh3.getPadisahDestegi() - 2);
                indikatorlerCh3.setSubayDestegi(indikatorlerCh3.getSubayDestegi() - 2);
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