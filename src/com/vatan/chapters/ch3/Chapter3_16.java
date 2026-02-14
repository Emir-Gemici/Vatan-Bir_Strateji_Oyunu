package com.vatan.chapters.ch3;

import com.vatan.core.*;
import java.util.Scanner;

public class Chapter3_16 extends Olay<IndikatorlerCh3> {

    public Chapter3_16() {
        super("", new String[]{});
    }

    @Override
    public void oynat(IndikatorlerCh3 indikatorlerCh3) {
        int oncekiSecim = indikatorlerCh3.getonBirinciSorudaSecilenSik();
        MuzikKutusu olayMuzigi = new MuzikKutusu();

        if (oncekiSecim == 1) {
            this.metin =
                    "Bahriye Nazırı Cemal Paşa:\n" +
                            "Enver! Sarayburnu açıklarında kıyamet kopuyor! İtilaf Devletleri ile yakınlaştığımızı sezen Alman Amiral Souchon, gemileri teslim etmeyi reddediyor.\n" +
                            "Yavuz ve Midilli'nin namlularını Payitahta çevirdiler! 'Ya Ruslara saldırmama izin verirsiniz ya da İstanbul'u başınıza yıkarım' diye tehdit savuruyor.\n" +
                            "Bu Alman küstahlığına ne cevap vereceğiz?\n";

            this.cevaplar = new String[]{
                    "Burası Osmanlı'nın başkentidir, Alman sömürgesi değil! Kıyı bataryalarına ateş emri verin! Gerekirse o gemileri batırın ama o Almanları derdest edin!"
            };
            olayMuzigi.oynat("1/Chapter3_16.mp3");

        } else if (oncekiSecim == 2) {
            this.metin =
                    "Bahriye Nazırı Cemal Paşa:\n" +
                            "Enver, başımıza büyük bir iş aldık! Yavuz ve Midilliyle Odessa'yı bombaladık. Bunu sana acilen belirtmem gerekiyor.\n" +
                            "Bunu yaptık çünkü başka şansımız yoktu. Şuan İtilaf Devletleri bize saldırabilmek için bir sebebe sahipler. Ne yapmalıyız bu konuda?\n";

            this.cevaplar = new String[]{
                    "Peki hala Cemal paşam. Yapabilecek bir şeyimiz yok. Olan olmuş artık."
            };
            olayMuzigi.oynat("2/Chapter3_16.mp3");

        } else if (oncekiSecim == 3) {
            this.metin =
                    "Bahriye Nazırı Cemal Paşa:\n" +
                            "Enver! Felaketin kıyısından döndük! Amiral Souchon, bizden gizli Karadeniz'e açılıp Rus limanlarını vurma emri vermiş!\n" +
                            "Telsiz zabitlerimiz durumu son anda fark etti. Eğer o toplar patlarsa tarafsızlığımız biter, devleti ateşe atarlar.\n" +
                            "Souchon 'Hünkarın emri var' diye yalan söylüyor. Ne yapalım?\n";

            this.cevaplar = new String[]{
                    "Derhal donanmayı geri çağırın! Gerekirse Souchon'u tutuklayın. Kimse bu devleti emrivaki ile savaşa sokamaz!"
            };
            olayMuzigi.oynat("3/Chapter3_16.mp3");
        }

        soruSor();

        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int secim = sc.nextInt();
            sc.nextLine();
            olayMuzigi.durdur();

            if (oncekiSecim == 1) {
                if (secim == 1) {
                    yesilYaz("\n*** İSTANBUL BOĞAZINDA ÇATIŞMA ***\n");
                    System.out.println("Kıyı bataryaları ve Türk askerleri, Alman mürettebata müdahale etti.");
                    System.out.println("Kısa süreli çatışma sonucu gemiler ele geçirildi. İngilizler bu sadakati memnuniyetle karşıladı.");
                    System.out.println("Almanya ile ipler tamamen koptu.");

                    indikatorlerCh3.setItilafIliskisi(indikatorlerCh3.getItilafIliskisi() + 5);
                    indikatorlerCh3.setIttifakIliskisi(indikatorlerCh3.getIttifakIliskisi() - 10);
                    indikatorlerCh3.bolgeGuncelle("Edirne", 2);
                    indikatorlerCh3.setOrduGucu(indikatorlerCh3.getOrduGucu() - 2);
                    indikatorlerCh3.setSubayDestegi(indikatorlerCh3.getSubayDestegi() + 2);
                } else {
                    throw new ArithmeticException("Geçersiz tuşlama yaptınız.");
                }

            } else if (oncekiSecim == 2) {
                if (secim == 1) {
                    yesilYaz("\n*** OK YAYDAN ÇIKTI ***\n");
                    System.out.println("Rus limanları alevler içinde. Artık geri dönüş yok.");
                    System.out.println("Rusya, Osmanlı'ya resmen savaş ilan etti.");

                    indikatorlerCh3.setAskerMorali(indikatorlerCh3.getAskerMorali() + 1);
                    indikatorlerCh3.setSubayDestegi(indikatorlerCh3.getSubayDestegi() - 2);
                    indikatorlerCh3.setIttifakIliskisi(indikatorlerCh3.getIttifakIliskisi() + 2);
                    indikatorlerCh3.setItilafIliskisi(indikatorlerCh3.getItilafIliskisi() - 10);
                    indikatorlerCh3.setSavasTehlikesi(indikatorlerCh3.getSavasTehlikesi() + 1);
                } else {
                    throw new ArithmeticException("Geçersiz tuşlama yaptınız.");
                }

            } else if (oncekiSecim == 3) {
                if (secim == 1) {
                    yesilYaz("\n*** TARAFSIZLIK KORUNDU ***\n");
                    System.out.println("Donanma zorla limana döndürüldü. Almanlar çok öfkeli ama provokasyon engellendi.");
                    System.out.println("Padişah bu otoriter tavrı takdir etti.");

                    indikatorlerCh3.setIttifakIliskisi(indikatorlerCh3.getIttifakIliskisi() - 4);
                    indikatorlerCh3.setItilafIliskisi(indikatorlerCh3.getItilafIliskisi() + 2);
                    indikatorlerCh3.setPadisahDestegi(indikatorlerCh3.getPadisahDestegi() + 3);
                    indikatorlerCh3.setSavasTehlikesi(indikatorlerCh3.getSavasTehlikesi() - 2);
                } else {
                    throw new ArithmeticException("Geçersiz tuşlama yaptınız.");
                }
            }

        } else {
            olayMuzigi.durdur();
            throw new ArithmeticException("Lütfen sadece sayı giriniz.");
        }
    }
}