package com.vatan.core;
public abstract class Olay<T> implements RenkliYazici {
    protected String metin;
    protected String[] cevaplar;

    public Olay(String metin, String[] cevaplar) {
        this.metin = metin;
        this.cevaplar = cevaplar;
    }

    public Olay() {}

    public void soruSor(){
        vurguluYaz(metin);
        for (int i=0; i<cevaplar.length; i++){
            yesilYaz("Cevap "+(i+1)+":   ");
            System.out.println(cevaplar[i]);
        }
        System.out.println("----------------------------------------------");
    }
    public abstract void oynat(T indikatorler);
    public void oynat(T indikatorler, int i) {};

}