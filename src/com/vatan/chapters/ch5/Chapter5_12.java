package com.vatan.chapters.ch5;

import com.vatan.core.*;
import java.util.Scanner;

public class Chapter5_12 extends Olay<IndikatorlerCh5> {
    @Override
    public void oynat(IndikatorlerCh5 indikatorlerCh5) {
        int ucuncuSorudaSecilenSik = indikatorlerCh5.getUcuncuSorudaSecilenSik();
        MuzikKutusu olayMuzigi = new MuzikKutusu();

        if (ucuncuSorudaSecilenSik == 1) {
            this.metin =
                    "Kurmay Yüzbaşı:\n" +
                            "Paşam! Hain teröristleri Balkaya'da bastırmamızın yetmeyeceğini anladık! Kato Dağı'nı resmen kendilerine garnizon yapan eşkıyanın üzerine ilerlememiz emredildi!\n" +
                            "Sizce gücümüzü bölüp hainlerin üzerine ilerlememiz doğru olacak mıdır? \n";
            this.cevaplar =
                    new String[]{
                            "Her yerde, aynı anda eşkıyayı ezmeliyiz. Kato'ya da piyadeleri gönderin!",
                            "Balkaya'yı bitirmemiz yeterli. Daha sonra Buzul Dağına da müdahale edeceğiz."
                    };
            olayMuzigi.oynat("1/Chapter5_12.mp3");
        } else if (ucuncuSorudaSecilenSik == 2) {
            this.metin =
                    "Kurmay Yüzbaşı:\n" +
                            "Paşam! Balkayadaki hain eşkıyayı tuzağa düşürdük! Ancak belli ki taarruzumuzu bekliyorlardı ki dağda mevkilerini tahkim etmişler.\n" +
                            "Ateş desteği olmadan aşamayız gibi komutanım! Topçuya ve hava desteğine ihtiyacımız var! Genelkurmaydan hava desteği isteyelim mi?\n";
            this.cevaplar =
                    new String[]{
                            "Topçu bataryaları yeterli olacaktır asker. Merak etme yardım yetişecektir.",
                            "Sen sadece birliklere taarruza devam etmelerini söyle, ben Hava Kuvvetlerine haber vereceğim asker!"
                    };
            olayMuzigi.oynat("2/Chapter5_12.mp3");
        } else if (ucuncuSorudaSecilenSik == 3) {
            this.metin =
                    "Kurmay Yüzbaşı:\n" +
                            "Paşam! PKK'lı teröristleri bozguna uğrattık, kaçıyorlar! Sınır tarafında Avaşin diye tabir edilen kampa doğru kaçtıklarını öğrendik.\n" +
                            "Sizce takip edelim mi komutanım?\n";
            this.cevaplar =
                    new String[]{
                            "Evet. Taarruzu durduramayız, hainleri kendi inlerinde dahi rahat bırakmayın!",
                            "Askerin hali zorda yüzbaşı. Bir nebze olsun dinlensinler. Topçu ateşiyle yetinelim."
                    };
            olayMuzigi.oynat("3/Chapter5_12.mp3");
        }

        soruSor();

        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int secim = sc.nextInt();
            sc.nextLine();
            olayMuzigi.durdur();

            if (secim == 1) {
                if (ucuncuSorudaSecilenSik == 1) {
                    indikatorlerCh5.setKurmayDestegi(indikatorlerCh5.getKurmayDestegi() + 1);
                    indikatorlerCh5.setPkkGucu(indikatorlerCh5.getPkkGucu() - 2);
                    indikatorlerCh5.setTskGucu(indikatorlerCh5.getTskGucu() - 2);
                } else if (ucuncuSorudaSecilenSik == 2) {
                    indikatorlerCh5.setAskerMorali(indikatorlerCh5.getAskerMorali() - 1);
                    indikatorlerCh5.setPkkGucu(indikatorlerCh5.getPkkGucu() - 2);
                    indikatorlerCh5.setTskGucu(indikatorlerCh5.getTskGucu() - 2);
                } else if (ucuncuSorudaSecilenSik == 3) {
                    indikatorlerCh5.setAskerMorali(indikatorlerCh5.getAskerMorali() + 1);
                    indikatorlerCh5.setKurmayDestegi(indikatorlerCh5.getKurmayDestegi() + 4);
                    indikatorlerCh5.setPkkGucu(indikatorlerCh5.getPkkGucu() - 3);
                    indikatorlerCh5.setTskGucu(indikatorlerCh5.getTskGucu() - 3);
                }
            } else if (secim == 2) {
                if (ucuncuSorudaSecilenSik == 1) {
                    indikatorlerCh5.setHalkDestegi(indikatorlerCh5.getHalkDestegi() + 2);
                    indikatorlerCh5.setPkkGucu(indikatorlerCh5.getPkkGucu() - 1);
                    indikatorlerCh5.setTskGucu(indikatorlerCh5.getTskGucu() - 1);
                } else if (ucuncuSorudaSecilenSik == 2) {
                    indikatorlerCh5.setAskerMorali(indikatorlerCh5.getAskerMorali() + 2);
                    indikatorlerCh5.setKurmayDestegi(indikatorlerCh5.getKurmayDestegi() - 3);
                    indikatorlerCh5.setPkkGucu(indikatorlerCh5.getPkkGucu() - 3);
                    indikatorlerCh5.setTskGucu(indikatorlerCh5.getTskGucu() - 2);
                } else if (ucuncuSorudaSecilenSik == 3) {
                    indikatorlerCh5.setAskerMorali(indikatorlerCh5.getAskerMorali() + 2);
                    indikatorlerCh5.setPkkGucu(indikatorlerCh5.getPkkGucu() - 1);
                    indikatorlerCh5.setTskGucu(indikatorlerCh5.getTskGucu() - 1);
                }
            } else {
                throw new ArithmeticException("Geçersiz tuşlama yaptınız.");
            }
        } else {
            olayMuzigi.durdur();
            throw new ArithmeticException("Lütfen sadece sayı giriniz.");
        }
    }
}