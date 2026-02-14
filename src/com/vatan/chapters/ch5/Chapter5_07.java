package com.vatan.chapters.ch5;

import com.vatan.core.*;
import java.util.Scanner;

public class Chapter5_07 extends Olay<IndikatorlerCh5> {
    @Override
    public void oynat(IndikatorlerCh5 indikatorlerCh5) {
        int ucuncuSorudaSecilenSik = indikatorlerCh5.getUcuncuSorudaSecilenSik();
        MuzikKutusu olayMuzigi = new MuzikKutusu();

        if (ucuncuSorudaSecilenSik == 1) {
            this.metin =
                    "Kurmay Yüzbaşı:\n" +
                            "Komutanım, bildiğiniz gibi kış geldiği gibi PKK’lı teröristler inlerine çekildi. Burada hain eşkıyaya rahat nefes aldırmamak için bir fikrimiz var.\n" +
                            "Kobra helikopterleri ile Irak sınırındaki kayalık mevkiler ve mağaralarda teröristlerin saklandığı inlere taciz ateşi açabiliriz.\n" +
                            "Bu şekilde herhangi bir şekilde dış dünya ile irtibat kurmalarını ve koordine saldırı hazırlıkları yapmalarını kısıtlayabiliriz.\n" +
                            "Ancak hain eşkıyanın ısı güdümlü füzeleri mevcut ve bu da yapacağımız saldırıları riske atacaktır. Son karar sizindir komutanım!\n";
            this.cevaplar =
                    new String[]{
                            "Doğru bir fikir gibi duruyor. Kafasını çıkaranı indirin!",
                            "Eldeki teçhizatı bahar taarruzuna saklayın, ihtiyacımız olacaktır."
                    };
            olayMuzigi.oynat("1/Chapter5_07.mp3");
        } else if (ucuncuSorudaSecilenSik == 2) {
            this.metin =
                    "Genelkurmay Başkanı Doğan Güreş:\n" +
                            "Osman Paşam, gördüğün gibi kış şartları hain teröristleri iyice zorlamış durumda. Bundan yararlanmak gerektiğine inanıyoruz.\n" +
                            "Hava Kuvvetlerine PKK'nın Haftanin kampını bombalaması emrini verdim. Eğer mümkünse karadan destek verilmesi çok faydalı olur. Bunu senin inisiyatifine bırakıyorum.\n";
            this.cevaplar =
                    new String[]{
                            "Hainleri hem karadan hem havadan ateşe boğacağız komutanım!",
                            "Balkaya'ya girmemiz daha ehemmiyetli durumda komutanım, üzgünüm."
                    };
            olayMuzigi.oynat("2/Chapter5_07.mp3", 6.0f);
        } else if (ucuncuSorudaSecilenSik == 3) {
            this.metin =
                    "Kurmay Yüzbaşı:\n" +
                            "Komutanım, maalesef yeni gelmekte olan hava indirmecilerle irtibatı kaybettik! Karayolundan birliklerine teslim olacakları esnada PKK'lı teröristler otobanları tutmuş.\n" +
                            "Piyadeleri taşıyan otobüsleri ateşe tutmuşlar! Kurtarabildiğimiz er ve erbaşları oradan çıkardık ama içlerinde genelde genç teğmenlerin olduğu iki otobüse girilemez hale gelmiş.\n" +
                            "Arama tarama faaliyetlerinde bölücü teröristleri yakalamaya çalışıyoruz efendim!\n";
            this.cevaplar =
                    new String[]{
                            "Yapacağınız işin..."
                    };
            olayMuzigi.oynat("3/Chapter5_07.mp3");
        }

        soruSor();

        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int secim = sc.nextInt();
            sc.nextLine();
            olayMuzigi.durdur();

            if (secim == 1) {
                if (ucuncuSorudaSecilenSik == 1) {
                    indikatorlerCh5.setPkkGucu(indikatorlerCh5.getPkkGucu() - 2);
                    indikatorlerCh5.setTskGucu(indikatorlerCh5.getTskGucu() - 1);
                } else if (ucuncuSorudaSecilenSik == 2) {
                    indikatorlerCh5.setAskerMorali(indikatorlerCh5.getAskerMorali() + 1);
                    indikatorlerCh5.setPkkGucu(indikatorlerCh5.getPkkGucu() - 1);
                    indikatorlerCh5.setTskGucu(indikatorlerCh5.getTskGucu() - 1);
                } else if (ucuncuSorudaSecilenSik == 3) {
                    indikatorlerCh5.setAnkaraDestegi(indikatorlerCh5.getAnkaraDestegi() - 2);
                    indikatorlerCh5.setPkkGucu(indikatorlerCh5.getPkkGucu() + 1);
                    indikatorlerCh5.setTskGucu(indikatorlerCh5.getTskGucu() - 1);
                }
            } else if (secim == 2) {
                if (ucuncuSorudaSecilenSik == 1) {
                    indikatorlerCh5.setTskGucu(indikatorlerCh5.getTskGucu() + 1);
                } else if (ucuncuSorudaSecilenSik == 2) {
                    indikatorlerCh5.setKurmayDestegi(indikatorlerCh5.getKurmayDestegi() - 2);
                    indikatorlerCh5.setPkkGucu(indikatorlerCh5.getPkkGucu() + 1);
                } else if (ucuncuSorudaSecilenSik == 3) {
                    throw new ArithmeticException("Geçersiz tuşlama yaptınız.");
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