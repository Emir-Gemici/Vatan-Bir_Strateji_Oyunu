package com.vatan.chapters.ch3;

import com.vatan.core.*;
import java.util.Scanner;

public class Chapter3Events extends Olay<IndikatorlerCh3> {

    public static String[] Events = {
            "Emir Ünleyen Beyefendinin makatını telhis eyleyeceksin sanırım...",
            " *** FACIA OLDU *** ",
            " *** GUZEL HABERLER GELDI *** ",
            " *** BIR KARISIKLILIK MEYDANA GELDI *** ",
            " *** HAYIRLI HABERLER GELDI *** "
    };

    public Chapter3Events(int i) {
        super("Yeni Olay!   :\n" + (Events.length > i ? Events[i] : ""), new String[]{"Onaylamak için enter a basın"});
    }

    @Override
    public void oynat(IndikatorlerCh3 indikatorlerCh3) {
    }

    @Override
    public void oynat(IndikatorlerCh3 indikatorlerCh3, int i) {
        System.out.println(
                "---------------------------------------------\n" +
                        "!!!Planda olmayan bir durum oluştu!!!\n" +
                        "Olayı görüntülemek için Enter'a basın...\n");

        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        soruSor();
        sc.nextLine();
        if (i == 0){
            kirmiziYaz("Emir İnleyenin makatını telhis eyledin\n");
            indikatorlerCh3.setAskerMorali(indikatorlerCh3.getAskerMorali() + 1);
        }
        if(i == 1){
            String yanginBolgesi = indikatorlerCh3.rastgeleBolge();
            System.out.println(yanginBolgesi + "'da büyük bir isyan çıktı!");
            indikatorlerCh3.bolgeGuncelle(yanginBolgesi,-5);
            indikatorlerCh3.setIkmalDurumu(indikatorlerCh3.getIkmalDurumu() - 1);
        }
        if(i == 2){
            String destekBolgesi = indikatorlerCh3.rastgeleBolge();
            System.out.println(destekBolgesi + "'dan bir grup erkek orduya katılmak istiyor ve taşımacılık faaliyetlerinde de kadınlar hayvanlarıyla yardım etmek istiyor...");
            indikatorlerCh3.bolgeGuncelle(destekBolgesi,5);
            indikatorlerCh3.setOrduGucu(indikatorlerCh3.getOrduGucu() + 1);
            indikatorlerCh3.setIkmalDurumu(indikatorlerCh3.getIkmalDurumu() + 3);
        }
        if(i == 3){
            System.out.println("Rütbeli askerler arasında siyasi ve diplomatik sebeplerden kavga çıktı...");
            indikatorlerCh3.setSubayDestegi(indikatorlerCh3.getSubayDestegi() - 1);
            indikatorlerCh3.setOrduGucu(indikatorlerCh3.getOrduGucu() - 1);
            indikatorlerCh3.setAskerMorali(indikatorlerCh3.getAskerMorali() - 1);
        }
        if (i == 4){
            if(indikatorlerCh3.getonBirinciSorudaSecilenSik() != 0){
                System.out.println("Naciye Sultan'dan size mektup geldi siz mutluysanız biz de mutluyuz paşam...");
                indikatorlerCh3.setAskerMorali(indikatorlerCh3.getAskerMorali() + 2);
                indikatorlerCh3.setPadisahDestegi(indikatorlerCh3.getPadisahDestegi() + 2);
            }
            else{
                System.out.println("Ünlü alim Yunus Emir Gemici, sizin hakkınızda geleceğiniz hakkında olumlu yorum yaptı siz mutluysanız bizde mutluyuz...");
                indikatorlerCh3.setAskerMorali(indikatorlerCh3.getAskerMorali() + 2);
                indikatorlerCh3.setSubayDestegi(indikatorlerCh3.getSubayDestegi() + 1);
            }
        }
    }
}