package com.vatan.core;

public interface RenkliYazici {
    String RESET = "\u001B[0m";
    String KIRMIZI = "\u001B[31m";
    String YESIL = "\u001B[32m";
    String SARI = "\u001B[33m";
    String MAVI = "\u001B[34m";
    String SIYAH = "\u001B[30m";
    String MOR = "\u001B[35m";
    String BOLD = "\033[1m";
    String ARKA_MAVI = "\u001B[44m";
    String ARKA_BEYAZ = "\u001B[47m";
    String ARKA_KIRMIZI = "\u001B[41m";

    default void kirmiziYaz(String mesaj) {
        System.out.print(KIRMIZI + mesaj + RESET);
    }
    default void morYaz(String mesaj) {
        System.out.println(MOR + mesaj + RESET);
    }
    default void yesilYaz(String mesaj) {
        System.out.print(YESIL + mesaj + RESET);
    }
    default void sariYaz(String mesaj) {
        System.out.println(SARI + mesaj + RESET);
    }
    default void maviYaz(String mesaj) {
        System.out.println(MAVI + mesaj + RESET);
    }
    default void vurguluYaz(String mesaj) {
        String[] satirlar = mesaj.split("\n", -1);
        if (satirlar.length > 0 &&
                (satirlar[0].contains(":") || satirlar[0].contains("."))) {
            int idxColon = satirlar[0].indexOf(":");
            int idxDot   = satirlar[0].indexOf(".");
            int idx;
            if (idxColon != -1 && idxDot != -1) {
                idx = Math.min(idxColon, idxDot) + 1;
            } else if (idxColon != -1) {
                idx = idxColon + 1;
            } else {
                idx = idxDot + 1;
            }
            String kalinKisim = satirlar[0].substring(0, idx);
            String kalan      = satirlar[0].substring(idx);
            System.out.println(
                    ARKA_BEYAZ + SIYAH +
                            BOLD + kalinKisim + RESET +
                            ARKA_BEYAZ + SIYAH +
                            kalan + RESET
            );
        }
        else if (satirlar.length > 0) {
            System.out.println(ARKA_BEYAZ + SIYAH + satirlar[0] + RESET);
        }
        for (int i = 1; i < satirlar.length; i++) {
            System.out.println(ARKA_BEYAZ + SIYAH + satirlar[i] + RESET);
        }
    }

    default void kritikHata(String mesaj) {
        System.out.println(ARKA_KIRMIZI + SIYAH + mesaj + " " + RESET);
    }
    default void fenerYaz(String mesaj) {
        System.out.println(ARKA_MAVI + SARI + mesaj + RESET);
    }
}