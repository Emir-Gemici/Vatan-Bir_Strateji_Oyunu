package com.vatan.chapters.ch3;

import com.vatan.core.RenkliYazici;

import java.util.*;

public class IndikatorlerCh3 implements RenkliYazici {

    private HashMap<String, Integer> bolgeler;
    private final int MAX_BOLGE = 25;

    private int itilafIliskisi;
    private int ittifakIliskisi;
    private int balkanGucu;
    private int ittifakGucu;
    private int itilafGucu;

    private int orduGucu;
    private int ikmalDurumu;
    private int savasTehlikesi;
    private int askerMorali;

    private int padisahDestegi;
    private int halkDestegi;
    private int subayDestegi;

    private int onBirinciSorudaSecilenSik = 0;

    private String oyunYolu = "UNLEYEN";
    private String eskiOyunYolu = "UNLEYEN";
    private boolean turan = false;
    private boolean sessizMod = false;
    private boolean oyunDevamEdiyor = true;
    private boolean muhbirBasarisi = false;
    private int atlanacakSoruIndex = -1;

    private HashMap<String, Integer> ilkBolgeler;
    private int ilkItilafIliskisi;
    private int ilkIttifakIliskisi;
    private int ilkBalkanGucu;
    private int ilkItilafGucu;
    private int ilkIttifakGucu;
    private int ilkOrduGucu;
    private int ilkIkmalDurumu;
    private int ilkSavasTehlikesi;
    private int ilkPadisahDestegi;
    private int ilkHalkDestegi;
    private int ilkSubayDestegi;
    private int ilkAskerMorali;

    public IndikatorlerCh3() {
        bolgeler = new HashMap<>();
        ilkBolgeler = new HashMap<>();
    }

    public void setSessizMod(boolean sessizMod) {
        this.sessizMod = sessizMod;
    }

    public static void baslangic(IndikatorlerCh3 indikatorler) {
        indikatorler.setSessizMod(true);


        indikatorler.getBolgeler().put("Manastır", 10);
        indikatorler.getBolgeler().put("Edirne", 20);
        indikatorler.getBolgeler().put("Trablusgarp", 5);
        indikatorler.getBolgeler().put("Yemen", 5);
        indikatorler.getBolgeler().put("Hicaz", 20);
        indikatorler.getBolgeler().put("Canakkale", 25);
        indikatorler.getBolgeler().put("Suriye", 25);
        indikatorler.getBolgeler().put("Irak", 25);
        indikatorler.getBolgeler().put("Kafkas",15);
        indikatorler.getBolgeler().put("Selanik", 15);

        indikatorler.setIlkOrduGucu(15);
        indikatorler.setIlkIkmalDurumu(10);
        indikatorler.setIlkSavasTehlikesi(1);
        indikatorler.setIlkPadisahDestegi(20);
        indikatorler.setIlkHalkDestegi(15);
        indikatorler.setIlkSubayDestegi(10);
        indikatorler.setIlkItilafIliskisi(10);
        indikatorler.setIlkIttifakIliskisi(15);
        indikatorler.setIlkBalkanGucu(20);
        indikatorler.setIlkItilafGucu(25);
        indikatorler.setIlkIttifakGucu(22);
        indikatorler.setIlkAskerMorali(13);

        indikatorler.setOrduGucu(indikatorler.getIlkOrduGucu());
        indikatorler.setIkmalDurumu(indikatorler.getIlkIkmalDurumu());
        indikatorler.setSavasTehlikesi(indikatorler.getIlkSavasTehlikesi());
        indikatorler.setPadisahDestegi(indikatorler.getIlkPadisahDestegi());
        indikatorler.setHalkDestegi(indikatorler.getIlkHalkDestegi());
        indikatorler.setSubayDestegi(indikatorler.getIlkSubayDestegi());
        indikatorler.setItilafIliskisi(indikatorler.getIlkItilafIliskisi());
        indikatorler.setIttifakIliskisi(indikatorler.getIlkIttifakIliskisi());
        indikatorler.setBalkanGucu(indikatorler.getIlkBalkanGucu());
        indikatorler.setItilafGucu(indikatorler.getIlkItilafGucu());
        indikatorler.setIttifakGucu(indikatorler.getIlkIttifakGucu());
        indikatorler.setAskerMorali(indikatorler.getIlkAskerMorali());

        indikatorler.ilkBolgeler.putAll(indikatorler.bolgeler);

        indikatorler.setSessizMod(false);
    }

    public void bolgeGuncelle(String bolgeAdi, int degisim) {
        if (bolgeler.containsKey(bolgeAdi)) {
            int eskiDeger = bolgeler.get(bolgeAdi);
            int yeniDeger = eskiDeger + degisim;

            if (yeniDeger > MAX_BOLGE) yeniDeger = MAX_BOLGE;
            if (yeniDeger < 0) yeniDeger = 0;

            bolgeler.put(bolgeAdi, yeniDeger);

            if (!sessizMod) {
                if (yeniDeger > eskiDeger) {
                    yesilYaz(bolgeAdi + " Hakimiyeti " + (yeniDeger - eskiDeger) + " arttı. (" + yeniDeger + "/25)\n");
                } else if (yeniDeger < eskiDeger) {
                    kirmiziYaz(bolgeAdi + " Hakimiyeti " + (eskiDeger - yeniDeger) + " azaldı! (" + yeniDeger + "/25)\n");
                }
            }
        } else {
            if (!sessizMod) System.out.println("UYARI: Stratejik haritada " + bolgeAdi + " bulunamadı.");
        }
    }

    public HashMap<String, Integer> getBolgeler() {
        return bolgeler;
    }

    public int getBolgePuan(String bolgeAdi) {
        return bolgeler.getOrDefault(bolgeAdi, 0);
    }

    public void setBolgePuan(String bolgeAdi, int puan) {
        bolgeler.put(bolgeAdi, puan);
    }

    public void setOrduGucu(int orduGucu) {
        int ilkSecim = getOrduGucu();
        if (orduGucu > 30) this.orduGucu = 30;
        else if (orduGucu < 0) this.orduGucu = 0;
        else this.orduGucu = orduGucu;

        int sonSecim = getOrduGucu();
        if (!sessizMod) {
            if (ilkSecim > sonSecim) kirmiziYaz("Ordu Gücü " + (ilkSecim - sonSecim) + " düştü...\n");
            else if (sonSecim > ilkSecim) yesilYaz("Ordu Gücü " + (sonSecim - ilkSecim) + " arttı...\n");
        }
    }

    public void setIkmalDurumu(int ikmalDurumu) {
        int ilkSecim = getIkmalDurumu();
        if (ikmalDurumu > 30) this.ikmalDurumu = 30;
        else if (ikmalDurumu < 0) this.ikmalDurumu = 0;
        else this.ikmalDurumu = ikmalDurumu;

        int sonSecim = getIkmalDurumu();
        if (!sessizMod) {
            if (ilkSecim > sonSecim) kirmiziYaz("İkmal Durumu " + (ilkSecim - sonSecim) + " kötüleşti...\n");
            else if (sonSecim > ilkSecim) yesilYaz("İkmal Durumu " + (sonSecim - ilkSecim) + " iyileşti...\n");
        }
    }

    public void setSavasTehlikesi(int savasTehlikesi) {
        int ilkSecim = getSavasTehlikesi();
        if (savasTehlikesi > 5) this.savasTehlikesi = 5;
        else if (savasTehlikesi < 0) this.savasTehlikesi = 0;
        else this.savasTehlikesi = savasTehlikesi;

        if (this.savasTehlikesi >= 5 && !sessizMod) {
            kirmiziYaz("!!! DÜNYA SAVAŞI KAPIDA !!!\n");
        }

        int sonSecim = getSavasTehlikesi();
        if (!sessizMod) {
            if (sonSecim > ilkSecim)
                kirmiziYaz("Savaş Tehlikesi " + (sonSecim - ilkSecim) + " arttı! (" + this.savasTehlikesi + "/5)\n");
            else if (ilkSecim > sonSecim)
                yesilYaz("Savaş Tehlikesi " + (ilkSecim - sonSecim) + " azaldı. (" + this.savasTehlikesi + "/5)\n");
        }
    }

    public void setPadisahDestegi(int padisahDestegi) {
        int ilkSecim = getPadisahDestegi();
        if (padisahDestegi > 30) this.padisahDestegi = 30;
        else if (padisahDestegi < 0) this.padisahDestegi = 0;
        else this.padisahDestegi = padisahDestegi;

        int sonSecim = getPadisahDestegi();
        if (!sessizMod) {
            if (ilkSecim > sonSecim) kirmiziYaz("Padişah Desteği " + (ilkSecim - sonSecim) + " düştü...\n");
            else if (sonSecim > ilkSecim) yesilYaz("Padişah Desteği " + (sonSecim - ilkSecim) + " arttı...\n");
        }
    }

    public void setHalkDestegi(int halkDestegi) {
        int ilkSecim = getHalkDestegi();
        if (halkDestegi > 30) this.halkDestegi = 30;
        else if (halkDestegi < 0) this.halkDestegi = 0;
        else this.halkDestegi = halkDestegi;

        int sonSecim = getHalkDestegi();
        if (!sessizMod) {
            if (ilkSecim > sonSecim) kirmiziYaz("Halk Desteği " + (ilkSecim - sonSecim) + " düştü...\n");
            else if (sonSecim > ilkSecim) yesilYaz("Halk Desteği " + (sonSecim - ilkSecim) + " arttı...\n");
        }
    }

    public void setSubayDestegi(int subayDestegi) {
        int ilkSecim = getSubayDestegi();
        if (subayDestegi > 30) this.subayDestegi = 30;
        else if (subayDestegi < 0) this.subayDestegi = 0;
        else this.subayDestegi = subayDestegi;

        int sonSecim = getSubayDestegi();
        if (!sessizMod) {
            if (ilkSecim > sonSecim) kirmiziYaz("Subay Desteği " + (ilkSecim - sonSecim) + " düştü...\n");
            else if (sonSecim > ilkSecim) yesilYaz("Subay Desteği " + (sonSecim - ilkSecim) + " arttı...\n");
        }
    }

    public void setItilafIliskisi(int itilafIliskisi) {
        int ilkSecim = getItilafIliskisi();
        if (itilafIliskisi > 25) this.itilafIliskisi = 25;
        else if (itilafIliskisi < 0) this.itilafIliskisi = 0;
        else this.itilafIliskisi = itilafIliskisi;

        int sonSecim = getItilafIliskisi();
        if (!sessizMod) {
            if (ilkSecim > sonSecim) kirmiziYaz("İtilaf İlişkisi " + (ilkSecim - sonSecim) + " kötüleşti...\n");
            else if (sonSecim > ilkSecim) yesilYaz("İtilaf İlişkisi " + (sonSecim - ilkSecim) + " iyileşti...\n");
        }
    }

    public void setIttifakIliskisi(int ittifakIliskisi) {
        int ilkSecim = getIttifakIliskisi();
        if (ittifakIliskisi > 25) this.ittifakIliskisi = 25;
        else if (ittifakIliskisi < 0) this.ittifakIliskisi = 0;
        else this.ittifakIliskisi = ittifakIliskisi;

        int sonSecim = getIttifakIliskisi();
        if (!sessizMod) {
            if (ilkSecim > sonSecim) kirmiziYaz("İttifak İlişkisi " + (ilkSecim - sonSecim) + " kötüleşti...\n");
            else if (sonSecim > ilkSecim) yesilYaz("İttifak İlişkisi " + (sonSecim - ilkSecim) + " iyileşti...\n");
        }
    }

    public void setBalkanGucu(int balkanGucu) {
        int ilkSecim = getBalkanGucu();
        if (balkanGucu > 25) this.balkanGucu = 25;
        else if (balkanGucu < 0) this.balkanGucu = 0;
        else this.balkanGucu = balkanGucu;

        int sonSecim = getBalkanGucu();
        if (!sessizMod) {
            if (sonSecim > ilkSecim) kirmiziYaz("Balkan Gücü " + (sonSecim - ilkSecim) + " arttı!\n");
            else if (ilkSecim > sonSecim) yesilYaz("Balkan Gücü " + (ilkSecim - sonSecim) + " azaldı.\n");
        }
    }
    public void setItilafGucu(int itilafGucu) {
        int ilkSecim = getItilafGucu();
        if (itilafGucu > 30) this.itilafGucu = 30;
        else if (itilafGucu < 0) this.itilafGucu = 0;
        else this.itilafGucu = itilafGucu;

        int sonSecim = getItilafGucu();
        if (!sessizMod) {
            if (ilkSecim > sonSecim) kirmiziYaz("İtilaf Gucu " + (ilkSecim - sonSecim) + " düştü...\n");
            else if (sonSecim > ilkSecim) yesilYaz("İtilaf Gucu " + (sonSecim - ilkSecim) + " yükseldi...\n");
        }
    }
    public void setIttifakGucu(int ittifakGucu) {
        int ilkSecim = getIttifakGucu();
        if (ittifakGucu > 30) this.ittifakGucu = 30;
        else if (ittifakGucu < 0) this.ittifakGucu = 0;
        else this.ittifakGucu = ittifakGucu;

        int sonSecim = getIttifakGucu();
        if (!sessizMod) {
            if (ilkSecim > sonSecim) kirmiziYaz("İttifak Gucu " + (ilkSecim - sonSecim) + " düştü...\n");
            else if (sonSecim > ilkSecim) yesilYaz("İttifak Gucu " + (sonSecim - ilkSecim) + " yükseldi...\n");
        }
    }

    public void setAskerMorali(int askerMorali) {
        int ilkSecim = getAskerMorali();
        if (askerMorali > 30) this.askerMorali = 30;
        else if (askerMorali < 0) this.askerMorali = 0;
        else this.askerMorali = askerMorali;

        int sonSecim = getAskerMorali();
        if (!sessizMod) {
            if (ilkSecim > sonSecim) kirmiziYaz("Asker Morali " + (ilkSecim - sonSecim) + " düştü...\n");
            else if (sonSecim > ilkSecim) yesilYaz("Asker Morali " + (sonSecim - ilkSecim) + " arttı...\n");
        }
    }

    public int getOrduGucu() {
        return orduGucu;
    }

    public int getIkmalDurumu() {
        return ikmalDurumu;
    }

    public int getSavasTehlikesi() {
        return savasTehlikesi;
    }

    public int getPadisahDestegi() {
        return padisahDestegi;
    }

    public int getHalkDestegi() {
        return halkDestegi;
    }

    public int getSubayDestegi() {
        return subayDestegi;
    }

    public int getItilafIliskisi() {
        return itilafIliskisi;
    }

    public int getIttifakIliskisi() {
        return ittifakIliskisi;
    }

    public int getBalkanGucu() {
        return balkanGucu;
    }

    public int getItilafGucu() {
        return itilafGucu;
    }
    public int getIttifakGucu() {
        return ittifakGucu;
    }

    public int getAskerMorali() {
        return askerMorali;
    }

    public int getonBirinciSorudaSecilenSik() {
        return onBirinciSorudaSecilenSik;
    }
    public boolean isMuhbirBasarisi() {
        return muhbirBasarisi;
    }

    public void setMuhbirBasarisi(boolean muhbirBasarisi) {
        this.muhbirBasarisi = muhbirBasarisi;
    }

    public boolean isTuran() {
        return turan;
    }

    public void setTuran(boolean turan) {
        this.turan = turan;
    }

    public boolean isOyunDevamEdiyor() {
        return oyunDevamEdiyor;
    }

    public void setOyunDevamEdiyor(boolean oyunDevamEdiyor) {
        this.oyunDevamEdiyor = oyunDevamEdiyor;
    }

    public void setonBirinciSorudaSecilenSik(int val) {
        this.onBirinciSorudaSecilenSik = val;
    }

    public int getAtlanacakSoruIndex() {
        return atlanacakSoruIndex;
    }

    public void setAtlanacakSoruIndex(int atlanacakSoruIndex) {
        this.atlanacakSoruIndex = atlanacakSoruIndex;
    }

    public String getOyunYolu() {
        return oyunYolu;
    }

    public void setOyunYolu(String oyunYolu) {
        setEskiOyunYolu(getOyunYolu());
        this.oyunYolu = oyunYolu;
    }


    public int getIlkItilafIliskisi() {
        return ilkItilafIliskisi;
    }

    public void setIlkItilafIliskisi(int val) {
        this.ilkItilafIliskisi = val;
    }

    public int getIlkIttifakIliskisi() {
        return ilkIttifakIliskisi;
    }

    public void setIlkIttifakIliskisi(int val) {
        this.ilkIttifakIliskisi = val;
    }

    public int getIlkBalkanGucu() {
        return ilkBalkanGucu;
    }

    public void setIlkBalkanGucu(int val) {
        this.ilkBalkanGucu = val;
    }

    public int getIlkItilafGucu() {
        return ilkItilafGucu;
    }

    public void setIlkItilafGucu(int val) {
        this.ilkItilafGucu = val;
    }

    public int getIlkIttifakGucu() {
        return ilkIttifakGucu;
    }

    public void setIlkIttifakGucu(int val) {
        this.ilkIttifakGucu = val;
    }

    public int getIlkOrduGucu() {
        return ilkOrduGucu;
    }

    public void setIlkOrduGucu(int val) {
        this.ilkOrduGucu = val;
    }

    public int getIlkIkmalDurumu() {
        return ilkIkmalDurumu;
    }

    public void setIlkIkmalDurumu(int val) {
        this.ilkIkmalDurumu = val;
    }

    public int getIlkSavasTehlikesi() {
        return ilkSavasTehlikesi;
    }

    public void setIlkSavasTehlikesi(int val) {
        this.ilkSavasTehlikesi = val;
    }

    public int getIlkPadisahDestegi() {
        return ilkPadisahDestegi;
    }

    public void setIlkPadisahDestegi(int val) {
        this.ilkPadisahDestegi = val;
    }

    public int getIlkHalkDestegi() {
        return ilkHalkDestegi;
    }

    public void setIlkHalkDestegi(int val) {
        this.ilkHalkDestegi = val;
    }

    public int getIlkSubayDestegi() {
        return ilkSubayDestegi;
    }

    public void setIlkSubayDestegi(int val) {
        this.ilkSubayDestegi = val;
    }

    public int getIlkAskerMorali() {
        return ilkAskerMorali;
    }

    public void setIlkAskerMorali(int val) {
        this.ilkAskerMorali = val;
    }

    public int getIlkBolgePuan(String bolgeAdi) {
        return ilkBolgeler.getOrDefault(bolgeAdi, 0);
    }

    public void setIlkBolgePuan(String bolgeAdi, int val) {
        ilkBolgeler.put(bolgeAdi, val);
    }

    public void chapter3DurumYazdir(String odakBolge) {
        maviYaz("==========================================================================");
        sariYaz("               --- ENVER PAŞA: HARBİYE NEZARETİ RAPORU ---                ");
        maviYaz("==========================================================================");

        System.out.println(
                "PADİŞAH: " + renkVer(padisahDestegi, 30) + padisahDestegi + "/30 " + RESET +
                        " |  HALK   : " + renkVer(halkDestegi, 30) + halkDestegi + "/30  " + RESET +
                        " |  SUBAY  : " + renkVer(subayDestegi, 30) + subayDestegi + "/30 " + RESET +
                        " | " + MOR + " SAVAŞ RİSKİ: " + savasTehlikesi + "/5 " + RESET
        );

        System.out.println(
                "ORDU   : " + renkVer(orduGucu, 30) + orduGucu + "/30 " + RESET +
                        " |  İKMAL  : " + renkVer(ikmalDurumu, 30) + ikmalDurumu + "/30  " + RESET +
                        " |  BALKAN : " + renkVer(balkanGucu, 25) + balkanGucu + "/25 " + RESET +
                        " |  MORAL     :" + renkVer(askerMorali,30) + askerMorali + "/30  " + RESET
        );
        maviYaz("------------- İlİŞKİ ---------------|---------------- GÜÇ ----------------");
        System.out.println(
                "İTİLAF : " + renkVer(itilafIliskisi, 25) + itilafIliskisi + "/25  " + RESET +
                        "|  İTTİFAK: " + renkVer(ittifakIliskisi, 25) + ittifakIliskisi + "/25   " + RESET +
                        "|  İTİLAF : "   + renkVer(itilafGucu , 30) + itilafGucu + "/30  " + RESET +
                        "|  İTTİFAK   :" + renkVer(ittifakGucu,30) + ittifakGucu + "/30  " + RESET
        );

        maviYaz("------------------------------ CEPHE DURUMU ------------------------------");

        if (odakBolge != null && bolgeler.containsKey(odakBolge)) {
            int puan = bolgeler.get(odakBolge);
            System.out.println("                  >>> " + ARKA_BEYAZ + SIYAH + " " + odakBolge.toUpperCase() + " HAKİMİYETİ: " + puan + "/25 " + RESET + " <<<");
        } else {
            int i = 0;
            for (String key : bolgeler.keySet()) {
                if( i % 5 == 0 && i!=0)
                {
                    System.out.println("\n--------------------------------------------------------------------------");
                }
                System.out.print(key + " : " + renkVer(bolgeler.get(key), 25) + bolgeler.get(key) + RESET + "   ");
                i+=1;
            }
            System.out.println();
        }

        System.out.println(MAVI + "==========================================================================" + RESET);
    }

    public void chapter3DurumYazdir() {
        chapter3DurumYazdir(null);
    }

    public String rastgeleBolge() {
        if (bolgeler == null || bolgeler.isEmpty()) {
            System.out.println("Haritada henüz hiçbir bölge tanımlanmamış.");
        }
        List<String> anahtarListesi = new ArrayList<>(bolgeler.keySet());
        Random random = new Random();
        int rastgeleIndeks = random.nextInt(anahtarListesi.size());
        String secilenBolge = anahtarListesi.get(rastgeleIndeks);
        return secilenBolge;
    }

    private String renkVer(int puan, int max) {
        if (puan <= max / 3) return KIRMIZI;
        if (puan <= (max / 3) * 2) return SARI;
        return YESIL;
    }

    public String getEskiOyunYolu() {
        return eskiOyunYolu;
    }

    public void setEskiOyunYolu(String eskiOyunYolu) {
        this.eskiOyunYolu = eskiOyunYolu;
    }
}
