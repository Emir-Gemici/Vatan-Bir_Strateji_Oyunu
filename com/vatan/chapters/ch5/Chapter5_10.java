package com.vatan.chapters.ch5;

import com.vatan.core.*;
import java.util.Scanner;

public class Chapter5_10 extends Olay<IndikatorlerCh5> {
    @Override
    public void oynat(IndikatorlerCh5 indikatorlerCh5) {
        int ucuncuSorudaSecilenSik = indikatorlerCh5.getUcuncuSorudaSecilenSik();
        MuzikKutusu olayMuzigi = new MuzikKutusu();

        if (ucuncuSorudaSecilenSik == 1) {
            this.metin =
                    "Kurmay Yüzbaşı:\n" +
                            "Paşam, hain eşkıyanın uyuşturucu ticareti ile kazanç sağladığını biliyorduk ancak bu denli yoğun olması bizi şaşırttı.\n" +
                            "Polis ve Jandarma baskın yaptıkları yerlerde yüzlerce kilo kenevir ele geçiriyor. Sizce bu baskınlarda askeri jandarmaya yardım için sahaya indirelim mi? \n";
            this.cevaplar =
                    new String[]{
                            "Kesinlikle. Vatandaşlara zehir satan katil eşkıyanın can damarlarını koparmalıyız.",
                            "Bırakın kolluk kuvvetleri bu işleri halletsin. Bunlarla uğraşacak ne personel ne de zaman var.",
                            "Kenevir ticaretinin nelere yol açtığını göstermesi için basın mensuplarını çağırın, eşkıya nereden para kazanıyor millet görsün."
                    };
            olayMuzigi.oynat("1/Chapter5_10.mp3");
        } else if (ucuncuSorudaSecilenSik == 2) {
            this.metin =
                    "İstihbaratçı Teğmen:\n" +
                            "Paşam, Ankara'dan gelen son şifreli mesajı size iletmek istiyorum. Meclis'te terör sempatizanlığı yapan vekillerin vekaletinin düşürülmesi konuşuluyor.\n" +
                            "Bu kişiler bertaraf edildikten sonra hükümetin Balkaya ve sonrasında Irak üzerine yapacağımız harekat için onay vermesini bekliyoruz.\n" +
                            "Genelkurmay bazı askeri birlikleri ve hava indirme taburlarını bölgeye kaydırmaya başlamış bile efendim!";
            this.cevaplar =
                    new String[]{
                            "Balkaya tarafını iyice izlemeye alın. Zamanı geldi."
                    };
            olayMuzigi.oynat("2/Chapter5_10.mp3", 4.0f);
        } else if (ucuncuSorudaSecilenSik == 3) {
            this.metin =
                    "\"Yeşil\" Mahmut Yıldırım:\n" +
                            "Paşam...Veli Küçük bana sizi güvenilir bir dost olarak tanıtmıştı, umarım haklıdır. Uzun zamandır PKK'lıların içinde dolanıyorum ve elde ettiğim bilgilerin size yararlı olacağını umuyorum.\n" +
                            "Kurmaylarınıza Hakkari dahilindeki PKK destekçilerinin konumlarını ile PKK'lılara para ve silah temin eden kişilerin isimlerini teslim ettim. Umarım bu desteğimin karşılığını yakında verirsiniz.\n";
            this.cevaplar =
                    new String[]{
                            "Vereceğiz elbet Mahmut, vereceğiz."
                    };
            olayMuzigi.oynat("3/Chapter5_10.mp3", 6.0f);
        }

        soruSor();

        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int secim = sc.nextInt();
            sc.nextLine();
            olayMuzigi.durdur();

            if (secim == 1) {
                if (ucuncuSorudaSecilenSik == 1) {
                    indikatorlerCh5.setAnkaraDestegi(indikatorlerCh5.getAnkaraDestegi() + 1);
                } else if (ucuncuSorudaSecilenSik == 2) {
                    indikatorlerCh5.setAskerMorali(indikatorlerCh5.getAskerMorali() + 3);
                } else if (ucuncuSorudaSecilenSik == 3) {
                    indikatorlerCh5.setAnkaraDestegi(indikatorlerCh5.getAnkaraDestegi() - 1);
                    indikatorlerCh5.setHalkDestegi(indikatorlerCh5.getHalkDestegi() - 1);
                    indikatorlerCh5.setPkkGucu(indikatorlerCh5.getPkkGucu() - 2);
                }
            } else if (secim == 2) {
                if (ucuncuSorudaSecilenSik == 1) {
                    indikatorlerCh5.setAnkaraDestegi(indikatorlerCh5.getAnkaraDestegi() - 1);
                    indikatorlerCh5.setTskGucu(indikatorlerCh5.getTskGucu() + 1);
                } else if (ucuncuSorudaSecilenSik == 2) {
                    throw new ArithmeticException("Geçersiz tuşlama yaptınız.");
                } else if (ucuncuSorudaSecilenSik == 3) {
                    throw new ArithmeticException("Geçersiz tuşlama yaptınız.");
                }
            } else if (secim == 3) {
                if (ucuncuSorudaSecilenSik == 1) {
                    indikatorlerCh5.setAnkaraDestegi(indikatorlerCh5.getAnkaraDestegi() + 2);
                    indikatorlerCh5.setHalkDestegi(indikatorlerCh5.getHalkDestegi() + 2);
                } else if (ucuncuSorudaSecilenSik == 2) {
                    throw new ArithmeticException("Geçersiz tuşlama yaptınız.");
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