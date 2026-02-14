package com.vatan.chapters.ch5;

import com.vatan.core.*;
import java.util.Scanner;

public class Chapter5_04 extends Olay<IndikatorlerCh5> {
    @Override
    public void oynat(IndikatorlerCh5 indikatorlerCh5) {
        int ucuncuSorudaSecilenSik = indikatorlerCh5.getUcuncuSorudaSecilenSik();
        MuzikKutusu olayMuzigi = new MuzikKutusu();

        if (ucuncuSorudaSecilenSik == 1) {
            this.metin =
                    "Kurmay Yüzbaşı:\n" +
                            "Komutanım emrettiğiniz gibi ilerliyoruz ancak belirttiğimiz gibi zorlanıyoruz.\n" +
                            "Düzenli ve büyük birliklerle ilerlendiği zaman teröristlerin küçük gruplarını yakalarsak imha etmek kolay oluyor ancak manevra kabiliyetini kaybediyoruz.\n" +
                            "Birçok mevziyi ele geçirdik ama şehitlerimiz çok fazla komutanım, sizce ne yapmalıyız? Eğer başaramazsak Genelkurmay hoş karşılamayacaktır komutanım!\n";
            this.cevaplar =
                    new String[]{
                            "Taarruza ne olursa olsun devam! Onları izole ettik kaçıramayız!",
                            "Eşkıyayı zaten kuşattık. Yoğun topçu ateşi ile teslim olmaya zorlayalım"
                    };
            olayMuzigi.oynat("1/Chapter5_04.mp3");
        } else if (ucuncuSorudaSecilenSik == 2) {
            this.metin =
                    "Kurmay Yüzbaşı:\n" +
                            "Komutanım, emrettiğiniz üzere mangalara varıncaya dek gayrınizami sisteme uygun olarak hazırlıkları yapmıştık.\n" +
                            "İnanamıyorum ancak işe yaradı! İkiyaka'yı tamamen kuşattık ve ilerliyoruz ancak teröristler hatlarımızda bazı boşluklar aramaya başladı ve şimdiden buldular gibi.\n" +
                            "Sizce ne yapmalıyız komutanım?.\n";
            this.cevaplar =
                    new String[]{
                            "3 hat halinde dağı iyice çevreleyin ve ilerlemeye devam edin! Hainleri imha etmeliyiz!",
                            "Kaçanlarla uğraşabilecek zamanımız yok. Yaşadıkları korku onlara yeter."
                    };
            olayMuzigi.oynat("2/Chapter5_04.mp3");

        } else if (ucuncuSorudaSecilenSik == 3) {
            this.metin =
                    "Kurmay Yüzbaşı:\n" +
                            "Komutanım! İkiyaka'yı gece gündüz demeden vuruyoruz!\n" +
                            "Dağ tarafı cehenneme dönmüş durumda ancak köyü de vurmak zorunda kaldık zira teröristler buradan kaçabilirler gibi duruyordu.\n" +
                            "Sivilleri vurup vurmadığımızı bilmiyoruz ama şimdiden il merkezindeki bazı esnaflar askerleri almamaya başladı. Ne yapmalıyız?\n";
            this.cevaplar =
                    new String[]{
                            "İsterse Başbakan gelse umrumda değil,ateşe devam!",
                            "Sivillere yardım edin, sonra devam ederiz."
                    };
            olayMuzigi.oynat("3/Chapter5_04.mp3");
        }

        soruSor();

        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int secim = sc.nextInt();
            sc.nextLine();
            olayMuzigi.durdur();

            if (secim == 1) {
                if (ucuncuSorudaSecilenSik == 1) {
                    indikatorlerCh5.setAnkaraDestegi(indikatorlerCh5.getAnkaraDestegi() - 2);
                    indikatorlerCh5.setAskerMorali(indikatorlerCh5.getAskerMorali() - 2);
                    indikatorlerCh5.setPkkGucu(indikatorlerCh5.getPkkGucu() - 1);
                    indikatorlerCh5.setTskGucu(indikatorlerCh5.getTskGucu() - 1);
                } else if (ucuncuSorudaSecilenSik == 2) {
                    indikatorlerCh5.setKurmayDestegi(indikatorlerCh5.getKurmayDestegi() + 1);
                    indikatorlerCh5.setPkkGucu(indikatorlerCh5.getPkkGucu() - 2);
                    indikatorlerCh5.setTskGucu(indikatorlerCh5.getTskGucu() - 1);
                } else if (ucuncuSorudaSecilenSik == 3) {
                    indikatorlerCh5.setHalkDestegi(indikatorlerCh5.getHalkDestegi() - 1);
                    indikatorlerCh5.setPkkGucu(indikatorlerCh5.getPkkGucu() - 2);
                    indikatorlerCh5.setTskGucu(indikatorlerCh5.getTskGucu() - 2);
                }
            } else if (secim == 2) {
                if (ucuncuSorudaSecilenSik == 1) {
                    indikatorlerCh5.setHalkDestegi(indikatorlerCh5.getHalkDestegi() + 1);
                    indikatorlerCh5.setKurmayDestegi(indikatorlerCh5.getKurmayDestegi() - 2);
                    indikatorlerCh5.setTskGucu(indikatorlerCh5.getTskGucu() - 1);
                } else if (ucuncuSorudaSecilenSik == 2) {
                    indikatorlerCh5.setAnkaraDestegi(indikatorlerCh5.getAnkaraDestegi() + 1);
                    indikatorlerCh5.setHalkDestegi(indikatorlerCh5.getHalkDestegi() + 1);
                    indikatorlerCh5.setPkkGucu(indikatorlerCh5.getPkkGucu() - 1);
                } else if (ucuncuSorudaSecilenSik == 3) {
                    indikatorlerCh5.setHalkDestegi(indikatorlerCh5.getHalkDestegi() + 2);
                    indikatorlerCh5.setKurmayDestegi(indikatorlerCh5.getKurmayDestegi() - 2);
                    indikatorlerCh5.setPkkGucu(indikatorlerCh5.getPkkGucu() + 1);
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