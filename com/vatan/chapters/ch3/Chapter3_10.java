package com.vatan.chapters.ch3;

import com.vatan.core.*;
import java.util.Scanner;

public class Chapter3_10 extends Olay<IndikatorlerCh3> {

    public Chapter3_10() {
        super(
                "Maliye Nazırı Cavit Bey: Enver Paşam, seçimde millete söz verdiğimiz vaatleri yerine getirme zamanı geldi.\n" +
                        "Mali krizi ve borçları idare edemez duruma geldik.\n" +
                        "Bazı maliyecilerimiz ile anlaştığımız üzere Ermeni, Rum, Yahudi vesair zenginlerin mallarını devlet mülküne geçirip bunları sanayi ve demiryolu inşaasında kullanabiliriz.\n" +
                        "Bazı başka maliyecilerimiz ise ecnebi devletlere olan kapitülasyonları kaldırarak ticarette denge kurabileceğimize inanıyor.\n" +
                        "Partinin tepe kadrosuna sormadan icraata geçmemeye karar verdim. Sizce hangi plan içinde hareket edelim paşam?\n",
                new String[]{
                        "Milli İktisat programı doğru duruyor. Üstelik bu Türk milletini zenginleştirme planımıza uygun.",
                        "Kapitülasyonlardan yeteri kadar çektik. Artık ecnebilerle denk olduğumuzu gösterme zamanıdır."
                }
        );
    }

    @Override
    public void oynat(IndikatorlerCh3 indikatorlerCh3) {
        MuzikKutusu olayMuzigi = new MuzikKutusu();
        olayMuzigi.oynat("Chapter3_10.mp3");
        soruSor();
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int secim = sc.nextInt();
            sc.nextLine();
            olayMuzigi.durdur();

            if (secim == 1) {
                yesilYaz("\n*** MİLLİ İKTİSAT POLİTİKASI BAŞLADI ***\n");
                System.out.println("Milli burjuvazi yaratma hamlesi devreye sokuldu.");
                System.out.println("Devletleştirilen kaynaklarla orduya lojistik destek sağlandı, subaylar bu milliyetçi adımdan memnun.");
                System.out.println("Ancak ticaret erbabının değişmesi halk içinde huzursuzluk yarattı.");

                indikatorlerCh3.setIkmalDurumu(indikatorlerCh3.getIkmalDurumu() + 2);
                indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() - 2);
                indikatorlerCh3.setOrduGucu(indikatorlerCh3.getOrduGucu() + 1);
                indikatorlerCh3.setSubayDestegi(indikatorlerCh3.getSubayDestegi() + 3);
            }
            else if (secim == 2) {
                yesilYaz("\n*** KAPİTÜLASYONLAR TEK TARAFLI KALDIRILDI ***\n");
                System.out.println("Yabancı devletlere verilen imtiyazlar sonlandırıldı. Halk bu bağımsızlık adımını coşkuyla karşıladı.");
                System.out.println("Ancak İtilaf devletleri bu duruma çok öfkelendi ve dış kredi muslukları kesilince ordu bütçesi sarsıldı.");

                indikatorlerCh3.setOrduGucu(indikatorlerCh3.getOrduGucu() - 1);
                indikatorlerCh3.setItilafIliskisi(indikatorlerCh3.getItilafIliskisi() - 2);
                indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() + 2);
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