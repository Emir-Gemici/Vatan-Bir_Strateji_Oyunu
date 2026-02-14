package com.vatan.core;

import com.vatan.chapters.ch3.IndikatorlerCh3;
import com.vatan.chapters.ch5.IndikatorlerCh5;
import java.util.Scanner;
import java.util.Map;

public class HileKonsolu implements RenkliYazici {
    private Scanner scanner;

    public HileKonsolu() {
        this.scanner = new Scanner(System.in);
    }

    public int ch3HileEkrani(IndikatorlerCh3 ind, int mevcutSoruIndexi) {
        while (true) {
            fenerYaz("=== CHAPTER 3: KADER KONSOLU (DEBUG) ===");
            System.out.println("[1]  Ordu & İkmal & Moral");
            System.out.println("[2]  Siyaset (Padişah/Halk/Subay)");
            System.out.println("[3]  Diplomasi (İtilaf/İttifak/Balkan)");
            System.out.println("[4]  Savaş Tehlikesi");
            System.out.println("[5]  Bölgesel Hakimiyet (Edirne, vb.)");
            System.out.println("[6]  SORU ATLA (Jump to Question)");
            System.out.println("[0]  KONSOLU KAPAT VE DEVAM ET");
            System.out.print(">>> Komut: ");

            int secim = safeReadInt();
            if (secim == 0) break;

            switch (secim) {
                case 1:
                    System.out.print("Yeni Ordu Gücü (0-30): ");
                    ind.setOrduGucu(safeReadInt());
                    System.out.print("Yeni İkmal Durumu (0-30): ");
                    ind.setIkmalDurumu(safeReadInt());
                    System.out.print("Yeni Asker Morali (0-30): ");
                    ind.setAskerMorali(safeReadInt());
                    break;
                case 2:
                    System.out.print("Padişah Desteği (0-30): ");
                    ind.setPadisahDestegi(safeReadInt());
                    System.out.print("Halk Desteği (0-30): ");
                    ind.setHalkDestegi(safeReadInt());
                    System.out.print("Subay Desteği (0-30): ");
                    ind.setSubayDestegi(safeReadInt());
                    break;
                case 3:
                    System.out.print("İtilaf İlişkisi (0-25): ");
                    ind.setItilafIliskisi(safeReadInt());
                    System.out.print("İttifak İlişkisi (0-25): ");
                    ind.setIttifakIliskisi(safeReadInt());
                    System.out.print("Balkan Gücü (0-25): ");
                    ind.setBalkanGucu(safeReadInt());
                    System.out.print("İtilaf Gücü (0-30): ");
                    ind.setItilafGucu(safeReadInt());
                    System.out.print("İttifak Gücü (0-30): ");
                    ind.setIttifakGucu(safeReadInt());
                    break;
                case 4:
                    System.out.print("Savaş Tehlikesi (0-5): ");
                    ind.setSavasTehlikesi(safeReadInt());
                    break;
                case 5:
                    System.out.println("Mevcut Bölgeler:");
                    for (String k : ind.getBolgeler().keySet()) {
                        System.out.print("[" + k + ": " + ind.getBolgePuan(k) + "] ");
                    }
                    System.out.print("\nDeğiştirmek istediğin bölge adı (Birebir yaz): ");
                    String bolge = scanner.nextLine();
                    if (ind.getBolgeler().containsKey(bolge)) {
                        System.out.print("Yeni Puan (0-25): ");
                        ind.setBolgePuan(bolge, safeReadInt());
                        yesilYaz(bolge + " güncellendi.");
                    } else {
                        kirmiziYaz("Hata: Böyle bir bölge yok.");
                    }
                    break;
                case 6:
                    System.out.print("Atlamak istediğin Soru Numarası (Mevcut: " + (mevcutSoruIndexi + 1) + "): ");
                    int hedef = safeReadInt();
                    if(hedef > 55){
                        System.out.print("55. Soruda hangi şık seçilmiş olsun (TURAN ,TARIHSEL ,KOMUNIST,PARCALANMA ,SERIAT ,CUMHURIYET) : ");
                        ind.setOyunYolu(safeReadString());
                    }
                    else if(hedef>22){
                        System.out.print("22. Soruda hangi şık seçilmiş olsun (TURAN ,TARIHSEL ,PARCALANMA ,SERIAT ,CUMHURIYET) : ");
                        String yol = safeReadString();
                        ind.setOyunYolu(yol);
                    }
                    else if(hedef>11){
                        System.out.print("11. Soruda hangi şık seçilmiş olsun (1 ,2 ,3): ");
                        ind.setonBirinciSorudaSecilenSik(safeReadInt());
                    }
                    yesilYaz("Zaman bükülüyor... Soru " + hedef + "'e gidiliyor.\n");
                    return (hedef - 1);
            }
        }
        return mevcutSoruIndexi;
    }

    public int ch5HileEkrani(IndikatorlerCh5 ind, int mevcutSoruIndexi) {
        while (true) {
            fenerYaz("=== CHAPTER 5: OHAL KONSOLU (DEBUG) ===");
            System.out.println("[1]  TSK Gücü & Moral");
            System.out.println("[2]  PKK Gücü & Bölge Hakimiyeti");
            System.out.println("[3]  Destekler (Ankara/Halk/Kurmay)");
            System.out.println("[4]  SORU ATLA");
            System.out.println("[0]  ÇIKIŞ");
            System.out.print(">>> Komut: ");

            int secim = safeReadInt();
            if (secim == 0) break;

            switch (secim) {
                case 1:
                    System.out.print("Yeni TSK Gücü: ");
                    ind.setTskGucu(safeReadInt());
                    System.out.print("Yeni Asker Morali: ");
                    ind.setAskerMorali(safeReadInt());
                    break;
                case 2:
                    System.out.print("Yeni PKK Gücü: ");
                    ind.setPkkGucu(safeReadInt());
                    System.out.print("Yeni Bölge Hakimiyeti (0-50): ");
                    ind.setBolgeHakimiyeti(safeReadInt());
                    break;
                case 3:
                    System.out.print("Ankara Desteği: ");
                    ind.setAnkaraDestegi(safeReadInt());
                    System.out.print("Halk Desteği: ");
                    ind.setHalkDestegi(safeReadInt());
                    System.out.print("Kurmay Desteği: ");
                    ind.setKurmayDestegi(safeReadInt());
                    break;
                case 4:
                    System.out.print("Atlanacak Soru No: ");
                    int hedef = safeReadInt();
                    yesilYaz("Operasyon saati ileri alınıyor... Soru " + hedef + "\n");
                    return (hedef - 1);
            }
        }
        return mevcutSoruIndexi;
    }

    private int safeReadInt() {
        try {
            String input = scanner.nextLine();
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            return -1;
        }
    }
    private String safeReadString() {
        try {
            String input = scanner.nextLine();
            if (input == null || input.trim().isEmpty()) {
                return null;
            }
            return input.trim();
        } catch (Exception e) {
            return null;
        }
    }
}