package com.vatan.chapters.ch5;

import com.vatan.core.*;
import java.util.Scanner;

public class Chapter5_01 extends Olay<IndikatorlerCh5> {

    public static void baslangic(IndikatorlerCh5 indikatorlerCh5) {
        System.out.println("\u001B[41m"+"\u001B[30m"+"=== Chapter5: HAKKARİ ==="+"\u001B[0m");
        indikatorlerCh5.setIlkPkkGucu(12);
        indikatorlerCh5.setIlkHalkDestegi(8);
        indikatorlerCh5.setIlkAskerMorali(15);
        indikatorlerCh5.setIlkAnkaraDestegi(10);
        indikatorlerCh5.setIlkKurmayDestegi(15);
        indikatorlerCh5.setIlkTskGucu(12);
        indikatorlerCh5.setIlkBolgeHakimiyeti(20);

        indikatorlerCh5.setPkkGucu(indikatorlerCh5.getIlkPkkGucu());
        indikatorlerCh5.setHalkDestegi(indikatorlerCh5.getIlkHalkDestegi());
        indikatorlerCh5.setAskerMorali(indikatorlerCh5.getIlkAskerMorali());
        indikatorlerCh5.setAnkaraDestegi(indikatorlerCh5.getIlkAnkaraDestegi());
        indikatorlerCh5.setKurmayDestegi(indikatorlerCh5.getIlkKurmayDestegi());
        indikatorlerCh5.setTskGucu(indikatorlerCh5.getIlkTskGucu());
        indikatorlerCh5.setBolgeHakimiyeti(indikatorlerCh5.getIlkBolgeHakimiyeti());
    }

    public Chapter5_01() {
        super(
                "Hoşgeldiniz kumandanım.\n" +
                        "Hakkari Dağ ve Komando Tugayı emrinizdedir! Bildiğiniz gibi neredeyse on senedir bölücü eşkıyanın terör saldırıları ile karşı karşıyayız.\n" +
                        "Genelkurmay Başkanı Doğan Güreş ve Başbakan Çiller bu çatışmaları ancak gayrınizami savaş ile bitirebileceğimize inanıyorlar.\n" +
                        "Size tevdi edilen bu görev dahilinde bölgeniz içerisindeki terör örgütü unsurlarını ortadan kaldırmanız isteniyor. Sizce hangi yöntemlerle müdahale edelim komutanım?\n" +
                        "Cevap 1 için 1'e, Cevap 2 için 2'ye, Cevap 3 için 3 tuşuna basınız\n",
                new String[]{
                        "Irak Sınırına harekat planlayın. Sınırdan geçiş yollarını kapatmalıyız.",
                        "Öncelikle içe dönmemiz gerek, terörün kökünü kurutmalıyız.",
                        "Şimdi bir müdahaleye gücümüz yetmeyebilir. Ankara'dan destek isteyelim."
                }
        );
    }

    @Override
    public void oynat(IndikatorlerCh5 indikatorlerCh5) {
        MuzikKutusu olayMuzigi = new MuzikKutusu();
        olayMuzigi.oynat("Chapter5_01.mp3");

        soruSor();

        Scanner sc = new Scanner(System.in);
        if(sc.hasNextInt()){
            int secim = sc.nextInt();
            sc.nextLine();
            olayMuzigi.durdur();

            if (secim == 1){
                indikatorlerCh5.setAnkaraDestegi(indikatorlerCh5.getAnkaraDestegi() + 1);
                indikatorlerCh5.setAskerMorali(indikatorlerCh5.getAskerMorali() - 1);
            }
            else if (secim == 2){
                indikatorlerCh5.setHalkDestegi(indikatorlerCh5.getHalkDestegi() - 3);
                indikatorlerCh5.setKurmayDestegi(indikatorlerCh5.getKurmayDestegi() + 2);
            }
            else if (secim == 3){
                indikatorlerCh5.setAnkaraDestegi(indikatorlerCh5.getAnkaraDestegi() - 1);
                indikatorlerCh5.setAskerMorali(indikatorlerCh5.getAskerMorali() + 1);
                indikatorlerCh5.setKurmayDestegi(indikatorlerCh5.getKurmayDestegi() - 1);
                indikatorlerCh5.setTskGucu(indikatorlerCh5.getTskGucu() + 2);
            }
            else {
                throw new ArithmeticException("Geçersiz tuşlama yaptınız.");
            }
        } else {
            olayMuzigi.durdur();
            throw new ArithmeticException("Lütfen sadece sayı giriniz.");
        }
    }
}