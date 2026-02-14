package com.vatan.chapters.ch3;

import com.vatan.core.*;
import java.util.Scanner;

public class Chapter3_14 extends Olay<IndikatorlerCh3> {

    public Chapter3_14() {
        super(
                "Sadrazam Said Halim Paşa: Enver! Başımıza büyük bir iş aldık...\n" +
                        "Alman Amiral Souchon komutasındaki o iki zırhlı, İngiliz donanmasından kaçıp Çanakkale'den içeri girdi!\n" +
                        "İngiliz sefiri Mallet, köpürmüş durumda. 'Ya o gemileri derhal karasularından çıkarırsınız ya da silahlarını söküp mürettebatı teslim edersiniz' diyor.\n" +
                        "Aksi takdirde bunu bir harp ilanı sayacaklar. Almanlar ise gemileri vermememiz için baskı yapıyor. Ne cevap verelim?\n",
                new String[]{
                        "Dünyaya ilan edin: 'Biz o gemileri Almanlardan parasıyla satın aldık!' İsimlerini Yavuz ve Midilli yapın, Alman askerine de fes giydirin. İngilizler buna bir şey diyemez.",
                        "İngiltere ile şu an savaşı göze alamayız. Gemilerin silahlarını sökün ve Alman mürettebatı enterne edin."
                }
        );
    }

    @Override
    public void oynat(IndikatorlerCh3 indikatorlerCh3) {
        MuzikKutusu olayMuzigi = new MuzikKutusu();
        olayMuzigi.oynat("Chapter3_14.mp3");
        soruSor();
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int secim = sc.nextInt();
            sc.nextLine();
            olayMuzigi.durdur();

            if (secim == 1) {
                yesilYaz("\n*** TARİHİ ALDATMACA: YAVUZ VE MİDİLLİ ***\n");
                System.out.println("Goben ve Breslau gemilerine Türk bayrağı çekildi.");
                System.out.println("Bu zekice hamle İngilizleri diplomatik olarak kilitledi ancak bizi Almanlara göbekten bağladı.");
                System.out.println("Donanmamız artık Karadeniz'e açılmaya hazır.");

                indikatorlerCh3.setIttifakIliskisi(indikatorlerCh3.getIttifakIliskisi() + 5);
                indikatorlerCh3.setItilafIliskisi(indikatorlerCh3.getItilafIliskisi() - 5);
                indikatorlerCh3.setOrduGucu(indikatorlerCh3.getOrduGucu() + 4);
                indikatorlerCh3.setSavasTehlikesi(indikatorlerCh3.getSavasTehlikesi() + 3);
                indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() + 2);
            } else if (secim == 2) {
                kirmiziYaz("\n*** ALMANYA İLE KRİZ ***\n");
                System.out.println("Gemiler silahsızlandırıldı. İngilizler rahat bir nefes aldı ama Kayzer Wilhelm bu karara çok öfkelendi.");
                System.out.println("Elimize geçen büyük bir ateş gücünü diplomatik korkular yüzünden kaybettik.");

                indikatorlerCh3.setItilafIliskisi(indikatorlerCh3.getItilafIliskisi() + 3);
                indikatorlerCh3.setIttifakIliskisi(indikatorlerCh3.getIttifakIliskisi() - 5);
                indikatorlerCh3.setOrduGucu(indikatorlerCh3.getOrduGucu() - 2);
                indikatorlerCh3.setSavasTehlikesi(indikatorlerCh3.getSavasTehlikesi() - 2);
                indikatorlerCh3.setSubayDestegi(indikatorlerCh3.getSubayDestegi() - 2);
            } else {
                throw new ArithmeticException("Geçersiz tuşlama yaptınız.");
            }
        } else {
            olayMuzigi.durdur();
            throw new ArithmeticException("Lütfen sadece sayı giriniz.");
        }
    }
}