package com.vatan.main;

import com.vatan.chapters.ch3.*;
import com.vatan.chapters.ch3.IndikatorlerCh3;
import com.vatan.chapters.ch5.*;
import com.vatan.chapters.ch5.IndikatorlerCh5;
import com.vatan.core.MuzikKutusu;
import com.vatan.core.Olay;
import com.vatan.core.RenkliYazici;
import com.vatan.ui.BitisEkrani;
import com.vatan.core.HileKonsolu;
import org.fusesource.jansi.AnsiConsole;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Vatan {
    public static void main(String[] args) {
        AnsiConsole.systemInstall();
        String enterGel = "yeniden";
        while (enterGel.equals("yeniden")) {
            System.out.println(
                    "Hangi Chapter'ı oynamak istersiniz?\n" +
                            "Chapter 1 için 1'e Chapter 2 için 2'ye Chapter 3 için 3'e Chapter 4 için 4'e Chapter 5 için 5'e basın.");
            MuzikKutusu startMusic = new MuzikKutusu();
            startMusic.oynat("secim.mp3",6);
            Scanner input = new Scanner(System.in);
            int chapterSecimi = input.nextInt();
            if (chapterSecimi == 3) {
                try {
                    MuzikKutusu.herseyiSustur();
                    IndikatorlerCh3 yeniOyuncu = new IndikatorlerCh3();
                    ArrayList<Olay> Chapter3 = new ArrayList<>();
                    HileKonsolu hileKonsolu = new HileKonsolu();
                    MuzikKutusu sarki = new MuzikKutusu();
                    Random ihtimalimsi = new Random();
                    Chapter3.add(new Chapter3_01());
                    Chapter3.add(new Chapter3_02());
                    Chapter3.add(new Chapter3_03());
                    Chapter3.add(new Chapter3_04());
                    Chapter3.add(new Chapter3_05());
                    Chapter3.add(new Chapter3_06());
                    Chapter3.add(new Chapter3_07());
                    Chapter3.add(new Chapter3_08());
                    Chapter3.add(new Chapter3_09());
                    Chapter3.add(new Chapter3_10());
                    Chapter3.add(new Chapter3_11());
                    Chapter3.add(new Chapter3_12());
                    Chapter3.add(new Chapter3_13());
                    Chapter3.add(new Chapter3_14());
                    Chapter3.add(new Chapter3_15());
                    Chapter3.add(new Chapter3_16());
                    Chapter3.add(new Chapter3_17());
                    Chapter3.add(new Chapter3_18());
                    Chapter3.add(new Chapter3_19());
                    Chapter3.add(new Chapter3_20());
                    Chapter3.add(new Chapter3_21());
                    Chapter3.add(new Chapter3_22());
                    Chapter3.add(new Chapter3_23());
                    Chapter3.add(new Chapter3_24());
                    Chapter3.add(new Chapter3_25());
                    Chapter3.add(new Chapter3_26());
                    Chapter3.add(new Chapter3_27());
                    Chapter3.add(new Chapter3_28());
                    Chapter3.add(new Chapter3_29());
                    Chapter3.add(new Chapter3_30());
                    Chapter3.add(new Chapter3_31());
                    Chapter3.add(new Chapter3_32());
                    Chapter3.add(new Chapter3_33());
                    Chapter3.add(new Chapter3_34());
                    Chapter3.add(new Chapter3_35());
                    Chapter3.add(new Chapter3_36());
                    Chapter3.add(new Chapter3_37());
                    Chapter3.add(new Chapter3_38());
                    Chapter3.add(new Chapter3_39());
                    Chapter3.add(new Chapter3_40());
                    Chapter3.add(new Chapter3_41());
                    Chapter3.add(new Chapter3_42());
                    Chapter3.add(new Chapter3_43());
                    Chapter3.add(new Chapter3_44());
                    Chapter3.add(new Chapter3_45());
                    Chapter3.add(new Chapter3_46());
                    Chapter3.add(new Chapter3_47());
                    Chapter3.add(new Chapter3_48());
                    Chapter3.add(new Chapter3_49());
                    Chapter3.add(new Chapter3_50());
                    Chapter3.add(new Chapter3_51());
                    Chapter3.add(new Chapter3_52());
                    Chapter3.add(new Chapter3_53());
                    Chapter3.add(new Chapter3_54());
                    Chapter3.add(new Chapter3_55());
                    Chapter3.add(new Chapter3_56());
                    Chapter3.add(new Chapter3_57());
                    Chapter3.add(new Chapter3_58());
                    Chapter3.add(new Chapter3_59());
                    Chapter3.add(new Chapter3_60());
                    Chapter3.add(new Chapter3_61());
                    Chapter3.add(new Chapter3_62());
                    Chapter3.add(new Chapter3_63());
                    Chapter3.add(new Chapter3_64());
                    Chapter3.add(new Chapter3_65());
                    Chapter3.add(new Chapter3StatHesapla());
                    input.nextLine();
                    Chapter3_01.baslangic(yeniOyuncu);
                    yeniOyuncu.setOyunYolu("TARIHSEL");
                    for (int i = 0; i < Chapter3.size(); i++) {
                        String yeniYol = yeniOyuncu.getOyunYolu();
                        String eskiYol = yeniOyuncu.getEskiOyunYolu();
                        if (!Objects.equals(yeniYol, eskiYol)) {

                            MuzikKutusu.herseyiSustur();

                            switch (yeniYol) {
                                case "TARIHSEL":
                                    if (i < 48)
                                        sarki.oynat("music3Tarihsel.mp3", -30.0f);
                                    else
                                        sarki.oynat("music3TarihselSon.mp3", -30.0f);
                                    break;

                                case "TURAN":
                                    sarki.oynat("music3Turan.mp3", -30.0f);
                                    break;

                                case "SERIAT":
                                    sarki.oynat("music3Seriat.mp3", -30.0f);
                                    break;

                                case "CUMHURIYET":
                                    sarki.oynat("music3Cumhuriyet.mp3", -30.0f);
                                    break;

                                case "PARCALANMA":
                                    sarki.oynat("music3Parcalanma.mp3", -30.0f);
                                    break;

                                case "KOMUNIST":
                                    sarki.oynat("music3Komunist.mp3", -30.0f);
                                    break;
                            }
                            yeniOyuncu.setEskiOyunYolu(yeniYol);
                        }
                        yeniOyuncu.chapter3DurumYazdir();
                        System.out.println("Sıradaki soru için Enter'a basın");
                        String giris = input.nextLine();
                        if (giris.equals("Osman")) {
                            int yeniIndex = hileKonsolu.ch3HileEkrani(yeniOyuncu, i);
                            if (yeniIndex != i) {
                                i = yeniIndex - 1;
                                continue;
                            }
                        }
                        Chapter3.get(i).oynat(yeniOyuncu);
                        if (!yeniOyuncu.isOyunDevamEdiyor()) {
                            if(i < 5){
                                MuzikKutusu yenilgiMusic =  new MuzikKutusu();
                                yenilgiMusic.oynat("yenilgi.mp3",6);
                                System.out.println(RenkliYazici.KIRMIZI + "\nERKEN SON..." + RenkliYazici.RESET);
                            }
                            else{
                                Chapter3.get(Chapter3.size() - 1).oynat(yeniOyuncu);
                            }
                            break;
                        }
                        int ihtimal = ihtimalimsi.nextInt(3);
                        if (ihtimal == 1) {
                            yeniOyuncu.chapter3DurumYazdir();
                            int rasgaleEventIndex = ihtimalimsi.nextInt(Chapter3Events.Events.length);
                            Chapter3Events yeniEvent = new Chapter3Events(rasgaleEventIndex);
                            yeniEvent.oynat(yeniOyuncu, rasgaleEventIndex);
                        }
                    }
                    System.out.println(
                            "---------------------------------------------\n" +
                                    "Bitiş ekranını görebilmek için Enter'a basın"
                    );
                    input.nextLine();
                    BitisEkrani Enver = new BitisEkrani();
                    Enver.Chapter3Bitis();
                } catch (Exception e) {
                    MuzikKutusu.herseyiSustur();
                    System.out.println(RenkliYazici.KIRMIZI + "\nBir hata ile karşılaşıldı Enter'a basılınca program kapanacak  :   " + e.getMessage() + RenkliYazici.RESET);
                    BitisEkrani emegiGecenler = new BitisEkrani();
                    emegiGecenler.EmegiGecenlerBitis();
                } finally {
                    MuzikKutusu.herseyiSustur();
                    Scanner bitisIcinEnter = new Scanner(System.in);
                    if (bitisIcinEnter.hasNextLine()) bitisIcinEnter.nextLine();
                }
                System.out.println(
                        "Tekrar oynamak ister yada diğer Chapter'ları oynamak isterseniz enter'a basın.\n" +
                                "Eğer oynamak istemiyorsanız oyun hakkında yorumunuzu yazıp enter'a basın ve emeği geçenler ekranını görün...");
                Scanner yenidenBaslama = new Scanner(System.in);
                enterGel = yenidenBaslama.nextLine();
                if (enterGel.equals("")) enterGel = "yeniden";
                else enterGel = "yok";
            }
            if (chapterSecimi == 5) {
                try {
                    MuzikKutusu.herseyiSustur();
                    IndikatorlerCh5 yeniOyuncu = new IndikatorlerCh5();
                    ArrayList<Olay> Chapter5 = new ArrayList<>();
                    HileKonsolu hileKonsolu = new HileKonsolu();
                    Random ihtimalimsi = new Random();
                    MuzikKutusu sarki = new MuzikKutusu();
                    Chapter5.add(new Chapter5_01());
                    Chapter5.add(new Chapter5_02());
                    Chapter5.add(new Chapter5_03());
                    Chapter5.add(new Chapter5_04());
                    Chapter5.add(new Chapter5_05());
                    Chapter5.add(new Chapter5_06());
                    Chapter5.add(new Chapter5_07());
                    Chapter5.add(new Chapter5_08());
                    Chapter5.add(new Chapter5_09());
                    Chapter5.add(new Chapter5_10());
                    Chapter5.add(new Chapter5_11());
                    Chapter5.add(new Chapter5_12());
                    Chapter5.add(new Chapter5_13());
                    Chapter5.add(new Chapter5_14());
                    Chapter5.add(new Chapter5_15());
                    Chapter5.add(new Chapter5_16());
                    Chapter5.add(new Chapter5_17());
                    Chapter5.add(new Chapter5StatHesapla());
                    sarki.oynat("music5.mp3", -12.0f);
                    input.nextLine();
                    Chapter5_01.baslangic(yeniOyuncu);
                    for (int i = 0; i < Chapter5.size(); i++) {
                        yeniOyuncu.chapter5DurumYazdir();
                        System.out.println("Sıradaki soru için Enter'a basın");
                        String giris = input.nextLine();
                        if (giris.equals("Osman")) {
                            int yeniIndex = hileKonsolu.ch5HileEkrani(yeniOyuncu, i);
                            if (yeniIndex != i) {
                                i = yeniIndex - 1;
                                continue;
                            }
                        }
                        Chapter5.get(i).oynat(yeniOyuncu);
                        int ihtimal = ihtimalimsi.nextInt(3);
                        if (ihtimal == 1) {
                            if (yeniOyuncu.getPkkGucu() != 3) {
                                int rasgaleEventIndex = ihtimalimsi.nextInt(Chapter5Events.Events.length);
                                Chapter5Events yeniEvent = new Chapter5Events(rasgaleEventIndex);
                                yeniEvent.oynat(yeniOyuncu, rasgaleEventIndex);
                            }
                        }
                    }
                    yeniOyuncu.chapter5DurumYazdir();
                    System.out.println(
                            "---------------------------------------------\n" +
                            "Bitiş ekranını görebilmek için Enter'a basın"
                    );
                    input.nextLine();
                    BitisEkrani Hakkari = new BitisEkrani();
                    Hakkari.Chapter5Bitis();
                } catch (Exception e) {
                    MuzikKutusu.herseyiSustur();
                    System.out.println(RenkliYazici.KIRMIZI + "\nBir hata ile karşılaşıldı Enter'a basılınca program kapanacak  :   " + e.getMessage() + RenkliYazici.RESET);
                    BitisEkrani emegiGecenler = new BitisEkrani();
                    emegiGecenler.EmegiGecenlerBitis();
                } finally {
                    Scanner bitisIcinEnter = new Scanner(System.in);
                    if (bitisIcinEnter.hasNextLine()) bitisIcinEnter.nextLine();
                }
                System.out.println(
                        "Tekrar oynamak ister yada diğer Chapter'ları oynamak isterseniz enter'a basın.\n" +
                                "Eğer oynamak istemiyorsanız oyun hakkında yorumunuzu yazıp enter'a basın ve emeği geçenler ekranını görün...");
                Scanner yenidenBaslama = new Scanner(System.in);
                enterGel = yenidenBaslama.nextLine();
                if (enterGel.equals("")) enterGel = "yeniden";
                else enterGel = "yok";
            }
            else {
                System.out.println(RenkliYazici.KIRMIZI + "\nHenüz o Chapter gelmedi anlayışınız için teşekkür eder yeni sürümler için beklemenizi arzu ve temenni ederiz...\n" + RenkliYazici.RESET);
            }
        }
        BitisEkrani emegiGecenler = new BitisEkrani();
        emegiGecenler.EmegiGecenlerBitis();
    }
}
