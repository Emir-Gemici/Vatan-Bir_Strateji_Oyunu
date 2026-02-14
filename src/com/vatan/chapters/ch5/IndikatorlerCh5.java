package com.vatan.chapters.ch5;

import com.vatan.core.RenkliYazici;

public class IndikatorlerCh5 implements RenkliYazici {
    private int pkkGucu;
    private int halkDestegi;
    private int askerMorali;
    private int ankaraDestegi;
    private int kurmayDestegi;
    private int tskGucu;
    private int bolgeHakimiyeti;

    private int UcuncuSorudaSecilenSik;
    private int atlanacakSoruIndex = -1;

    private int ilkPkkGucu;
    private int ilkHalkDestegi;
    private int ilkAskerMorali;
    private int ilkAnkaraDestegi;
    private int ilkKurmayDestegi;
    private int ilkTskGucu;
    private int ilkBolgeHakimiyeti;

    public IndikatorlerCh5() {}
    public int getUcuncuSorudaSecilenSik() {

        return UcuncuSorudaSecilenSik;
    }
    public void setUcuncuSorudaSecilenSik(int UcuncuSorudaSecilenSik) {
        this.UcuncuSorudaSecilenSik = UcuncuSorudaSecilenSik;
    }

    public int getBolgeHakimiyeti() {
        return bolgeHakimiyeti;
    }
    public void setBolgeHakimiyeti(int bolgeHakimiyeti) {
        int ilkSecim = getBolgeHakimiyeti();
        if (bolgeHakimiyeti > 50) this.bolgeHakimiyeti = 50;
        else if (bolgeHakimiyeti < 0) this.bolgeHakimiyeti = 0;
        else this.bolgeHakimiyeti = bolgeHakimiyeti;
        int sonSecim = getBolgeHakimiyeti();
        if (ilkSecim > sonSecim) kirmiziYaz("Bölge Hakimiyeti "+(ilkSecim-sonSecim)+" düştü...\n");
        else if (sonSecim > ilkSecim && !(ilkSecim == 0 && sonSecim == getIlkBolgeHakimiyeti())) yesilYaz("Bölge Hakimiyeti "+(sonSecim-ilkSecim)+" arttı...\n");
    }
    public int getTskGucu() {
        return tskGucu;
    }
    public void setTskGucu(int tskGucu) {
        int ilkSecim = getTskGucu();
        if (tskGucu > 20) this.tskGucu = 20;
        else if (tskGucu < 0) this.tskGucu = 0;
        else this.tskGucu = tskGucu;
        if (this.tskGucu < 5) {
            kritikHata("\n!!! ACİL DURUM: TSK GÜCÜ KRİTİK SEVİYEDE (" + this.tskGucu + ") !!!");
            kritikHata("!!! KURMAYDAN DESTEK İSTEMELİSİNİZ !!!\n");
        }
        int sonSecim = getTskGucu();
        if (ilkSecim > sonSecim) kirmiziYaz("Tsk Gücü "+(ilkSecim-sonSecim)+" düştü...\n");
        else if (sonSecim > ilkSecim && !(ilkSecim == 0 && sonSecim == getIlkTskGucu())) yesilYaz("Tsk Gücü "+(sonSecim-ilkSecim)+" arttı...\n");
    }
    public int getKurmayDestegi() {
        return kurmayDestegi;
    }
    public void setKurmayDestegi(int kurmayDestegi) {
        int ilkSecim = getKurmayDestegi();
        if (kurmayDestegi > 25) this.kurmayDestegi = 25;
        else if (kurmayDestegi < 0) this.kurmayDestegi = 0;
        else this.kurmayDestegi = kurmayDestegi;
        int sonSecim = getKurmayDestegi();
        if (ilkSecim > sonSecim) kirmiziYaz("Kurmay Desteği "+(ilkSecim-sonSecim)+" düştü...\n");
        else if (sonSecim > ilkSecim && !(ilkSecim == 0 && sonSecim == getIlkKurmayDestegi())) yesilYaz("Kurmay Desteği "+(sonSecim-ilkSecim)+" arttı...\n");
    }
    public int getAnkaraDestegi() {
        return ankaraDestegi;
    }
    public void setAnkaraDestegi(int ankaraDestegi) {
        int ilkSecim = getAnkaraDestegi();
        if (ankaraDestegi > 25) this.ankaraDestegi = 25;
        else if (ankaraDestegi < 0) this.ankaraDestegi = 0;
        else this.ankaraDestegi = ankaraDestegi;
        int sonSecim = getAnkaraDestegi();
        if (ilkSecim > sonSecim) kirmiziYaz("Ankara Desteği "+(ilkSecim-sonSecim)+" düştü...\n");
        else if (sonSecim > ilkSecim && !(ilkSecim == 0 && sonSecim == getIlkAnkaraDestegi())) yesilYaz("Ankara Desteği "+(sonSecim-ilkSecim)+" arttı...\n");

    }
    public int getAskerMorali() {
        return askerMorali;
    }
    public void setAskerMorali(int askerMorali) {
        int ilkSecim = getAskerMorali();
        if (askerMorali > 20) this.askerMorali = 20;
        else if (askerMorali < 0) this.askerMorali = 0;
        else this.askerMorali = askerMorali;
        int sonSecim = getAskerMorali();
        if (ilkSecim > sonSecim) kirmiziYaz("Asker Morali "+(ilkSecim-sonSecim)+" düştü...\n");
        else if (sonSecim > ilkSecim && !(ilkSecim == 0 && sonSecim == getIlkAskerMorali())) yesilYaz("Asker Morali "+(sonSecim-ilkSecim)+" arttı...\n");
    }
    public int getHalkDestegi() {
        return halkDestegi;
    }
    public void setHalkDestegi(int halkDestegi) {
        int ilkSecim = getHalkDestegi();
        if (halkDestegi > 20) this.halkDestegi = 20;
        else if (halkDestegi < 0) this.halkDestegi = 0;
        else this.halkDestegi = halkDestegi;
        int sonSecim = getHalkDestegi();
        if (ilkSecim > sonSecim) kirmiziYaz("Halk Desteği "+(ilkSecim-sonSecim)+" düştü...\n");
        else if (sonSecim > ilkSecim && !(ilkSecim == 0 && sonSecim == getIlkHalkDestegi())) yesilYaz("Halk Desteği "+(sonSecim-ilkSecim)+" arttı...\n");
    }
    public int getPkkGucu() {
        return pkkGucu;
    }
    public void setPkkGucu(int pkkGucu) {
        int ilkSecim = getPkkGucu();
        if (pkkGucu > 20) this.pkkGucu = 20;
        else if (pkkGucu < 0) this.pkkGucu = 0;
        else this.pkkGucu = pkkGucu;
        int sonSecim = getPkkGucu();
        if (ilkSecim>sonSecim) yesilYaz("Pkk Gücü "+(ilkSecim-sonSecim)+" azaldı...\n");
        else if (sonSecim > ilkSecim && !(ilkSecim == 0 && sonSecim == getIlkPkkGucu())) kirmiziYaz("Pkk Gücü "+(sonSecim-ilkSecim)+" arttı...\n");
    }
    public int getAtlanacakSoruIndex() {
        return atlanacakSoruIndex;
    }

    public void setAtlanacakSoruIndex(int atlanacakSoruIndex) {
        this.atlanacakSoruIndex = atlanacakSoruIndex;
    }
    public void durumYazdir() {
        maviYaz("--------------------------------------------------");
        sariYaz("TSK Gücü: " + tskGucu + "    | Asker Morali: " + askerMorali + "   | Pkk Gücü: " + pkkGucu);
        sariYaz("Halk Desteği: " + halkDestegi + " | Ankara Desteği: " + ankaraDestegi + " | Kurmay Desteği: " + kurmayDestegi);
        sariYaz("Bölge Hakimiyeti: " + bolgeHakimiyeti + "/50");
        maviYaz("--------------------------------------------------");
    }

    public void chapter5DurumYazdir() {
        maviYaz("--------------------------------------------------");
        sariYaz("TSK Gücü: " + tskGucu + "    | Asker Morali: " + askerMorali + "   | Pkk Gücü: " + pkkGucu);
        sariYaz("Halk Desteği: " + halkDestegi + " | Ankara Desteği: " + ankaraDestegi + " | Kurmay Desteği: " + kurmayDestegi);
        sariYaz("Bölge Hakimiyeti: " + bolgeHakimiyeti + "/50");
        maviYaz("--------------------------------------------------");
    }

    public int getIlkPkkGucu() {
        return ilkPkkGucu;
    }

    public void setIlkPkkGucu(int ilkPkkGucu) {
        this.ilkPkkGucu = ilkPkkGucu;
    }

    public int getIlkHalkDestegi() {
        return ilkHalkDestegi;
    }

    public void setIlkHalkDestegi(int ilkHalkDestegi) {
        this.ilkHalkDestegi = ilkHalkDestegi;
    }

    public int getIlkAskerMorali() {
        return ilkAskerMorali;
    }

    public void setIlkAskerMorali(int ilkAskerMorali) {
        this.ilkAskerMorali = ilkAskerMorali;
    }

    public int getIlkAnkaraDestegi() {
        return ilkAnkaraDestegi;
    }

    public void setIlkAnkaraDestegi(int ilkAnkaraDestegi) {
        this.ilkAnkaraDestegi = ilkAnkaraDestegi;
    }

    public int getIlkKurmayDestegi() {
        return ilkKurmayDestegi;
    }

    public void setIlkKurmayDestegi(int ilkKurmayDestegi) {
        this.ilkKurmayDestegi = ilkKurmayDestegi;
    }

    public int getIlkTskGucu() {
        return ilkTskGucu;
    }

    public void setIlkTskGucu(int ilkTskGucu) {
        this.ilkTskGucu = ilkTskGucu;
    }

    public int getIlkBolgeHakimiyeti() {
        return ilkBolgeHakimiyeti;
    }

    public void setIlkBolgeHakimiyeti(int ilkBolgeHakimiyeti) {
        this.ilkBolgeHakimiyeti = ilkBolgeHakimiyeti;
    }
}