package com.vatan.chapters.ch5;

import com.vatan.core.*;
import java.util.Scanner;

public class Chapter5_15 extends Olay<IndikatorlerCh5> {
    @Override
    public void oynat(IndikatorlerCh5 indikatorlerCh5) {
        int ucuncuSorudaSecilenSik = indikatorlerCh5.getUcuncuSorudaSecilenSik();
        MuzikKutusu olayMuzigi = new MuzikKutusu();

        if (ucuncuSorudaSecilenSik == 1) {
            this.metin =
                    "Vali Mehmet Lütfullah Bilgin:\n" +
                            "Paşam! Sizi harekatlarınızdaki başarınızdan ötürü tebrik ederim! Hain eşkıyayı vatanın bağrından en azından burada söküp atmak gerçekten muazzam bir başarı.\n" +
                            "Ancak şimdi mücadelenin zor kısmındayız. Boşaltılan köyleri yeniden imar etmek, altyapıyı onarmak ve mali buhranı buralarda kolaylaştırma sürecindeyiz.\n" +
                            "Sizden rica etsem askerlerinizin belli bir kısmı da bu çalışmalarda bize yardımcı olabilir mi? Üstelik bu devletimizin yerel halk gözünde oluşan izlenimini de daha iyiye çevirecektir...\n";
            this.cevaplar =
                    new String[]{
                            "Muhakkak sayın valim. Memleketimizin vatandaşlarının hizmetkarıyız.",
                            "Askerlerimi muhtemel saldırılara açık hale getiremem. Özür dilerim sayın valim."
                    };
            olayMuzigi.oynat("1/Chapter5_15.mp3");
        } else if (ucuncuSorudaSecilenSik == 2) {
            this.metin =
                    "Genelkurmay Başkanı Doğan Güreş:\n" +
                            "Artık bütün hazırlıkların tamamlandığına inanıyorum Osman Paşam. Jandarma Asayiş Komutanlığının emri altında Irak üzerine harekat başlatacağız.\n" +
                            "Bu girip çıkılacak bir harekat değil. Yaklaşık 30 kilometre derinliğe inmeyi planlıyoruz. Sana iki seçenek veriyorum.\n" +
                            "Ya Hava indirmecilerle Peşmerge karakollarını alırsın ya da karadan öncü kuvvet olarak görev alırsın paşam, seçim senin.\n";
            this.cevaplar =
                    new String[]{
                            "Hava indirmecilerle taarruza destek vermek bana şereftir paşam! İşinizi kolaylaştıracağız.",
                            "Jandarmalar ve piyadeler bu araziye alışkın değil paşam. Onlara öncü olmamız daha faydalı olacaktır."
                    };
            olayMuzigi.oynat("2/Chapter5_15.mp3", 6.0f);
        } else if (ucuncuSorudaSecilenSik == 3) {
            this.metin =
                    "Veli Küçük:\n" +
                            "Osman Paşam! Suriye'de Aponun saklandığı yeri aradığın haberi bana geldi. Seni kurnaz tilki seni... Senin gibi subayların olması beni memnun ediyor.\n" +
                            "Senden bir isteğim karşılığında Aponun yerini sana ileteceğim. İsteğim senin bu gizli harekatı yaparken JİTEM'den sana yollayacağım özel kuvvetlerle beraber bu harekatı icra etmen.\n" +
                            "Tamam mıdır?";
            this.cevaplar =
                    new String[]{
                            "Teşekkür ederim paşam. Desteğinize minnettarım!",
                            "İllegal kişileri barındıramam paşam, üzgünüm"
                    };
            olayMuzigi.oynat("3/Chapter5_15.mp3", 3.0f);
        }

        soruSor();

        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int secim = sc.nextInt();
            sc.nextLine();
            olayMuzigi.durdur();

            if (secim == 1) {
                if (ucuncuSorudaSecilenSik == 1) {
                    indikatorlerCh5.setAnkaraDestegi(indikatorlerCh5.getAnkaraDestegi() + 3);
                    indikatorlerCh5.setAskerMorali(indikatorlerCh5.getAskerMorali() + 1);
                    indikatorlerCh5.setHalkDestegi(indikatorlerCh5.getHalkDestegi() + 4);
                } else if (ucuncuSorudaSecilenSik == 2) {
                    indikatorlerCh5.setAnkaraDestegi(indikatorlerCh5.getAnkaraDestegi() + 1);
                    indikatorlerCh5.setAskerMorali(indikatorlerCh5.getAskerMorali() + 1);
                    indikatorlerCh5.setPkkGucu(indikatorlerCh5.getPkkGucu() - 1);
                } else if (ucuncuSorudaSecilenSik == 3) {
                    indikatorlerCh5.setTskGucu(indikatorlerCh5.getTskGucu() + 1);
                }
            } else if (secim == 2) {
                if (ucuncuSorudaSecilenSik == 1) {
                    indikatorlerCh5.setHalkDestegi(indikatorlerCh5.getHalkDestegi() + 1);
                    indikatorlerCh5.setKurmayDestegi(indikatorlerCh5.getKurmayDestegi() + 2);
                } else if (ucuncuSorudaSecilenSik == 2) {
                    indikatorlerCh5.setAskerMorali(indikatorlerCh5.getAskerMorali() - 1);
                    indikatorlerCh5.setPkkGucu(indikatorlerCh5.getPkkGucu() - 2);
                    indikatorlerCh5.setTskGucu(indikatorlerCh5.getTskGucu() - 1);
                } else if (ucuncuSorudaSecilenSik == 3) {
                    indikatorlerCh5.setAskerMorali(indikatorlerCh5.getAskerMorali() + 1);
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