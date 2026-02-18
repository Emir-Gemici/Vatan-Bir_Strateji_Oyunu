package com.vatan.chapters.ch3;

import com.vatan.core.Olay;
import com.vatan.core.RenkliYazici;

public class Chapter3StatHesapla extends Olay<IndikatorlerCh3> implements RenkliYazici {

    public Chapter3StatHesapla() {
        super("BÖLÜM SONU DEĞERLENDİRMESİ", new String[]{});
    }

    @Override
    public void oynat(IndikatorlerCh3 indikatorler) {
        hesapla(indikatorler);
    }

    public void hesapla(IndikatorlerCh3 ind) {
        String yol = ind.getOyunYolu();
        String kazanilanUnvan = "BİLİNMEYEN";
        double skor = 0;

        System.out.println("\n");
        maviYaz("==========================================================================");
        sariYaz("               --- BÖLÜM 3 FİNALİ: KADERİN TERAZİSİ ---                   ");
        maviYaz("==========================================================================");

        if (yol.equals("TARIHSEL")) {
            skor = puanMotoru(ind, 4.0, 3.0, 2.0, 5.0, 0.5, 2.0, 4.0, 0.0, 2.0, 3.0);
            
            if (skor < 600) kazanilanUnvan = "HAYALPEREST MACERACI";
            else if (skor < 1200) kazanilanUnvan = "ŞEHİT-İ ALA (YÜCE ŞEHİT)";
            else kazanilanUnvan = "TURAN'IN EBEDİ BAŞKOMUTANI";
            
            sonucTarihsel(skor);
        }
        else if (yol.equals("TURAN")) {
            skor = puanMotoru(ind, 5.0, 4.0, 1.0, 3.0, 2.0, 2.5, 3.0, -2.0, 2.0, 5.0);
            
            if (skor < 700) kazanilanUnvan = "YALNIZ HAKAN";
            else if (skor < 1400) kazanilanUnvan = "ASYA KAPLANI";
            else kazanilanUnvan = "İKİNCİ METE HAN";
            
            sonucTuran(skor);
        }
        else if (yol.equals("KOMUNIST")) {
            skor = puanMotoru(ind, 2.5, 3.0, 2.0, 3.0, -5.0, 5.0, 1.0, 0.0, 4.5, 2.0);
            
            if (skor < 650) kazanilanUnvan = "HAİN TROÇKİST";
            else if (skor < 1300) kazanilanUnvan = "DEMİR YOLDAŞ";
            else kazanilanUnvan = "DOĞU'NUN LENİN'İ";
            
            sonucKomunist(skor);
        }
        else if (yol.equals("CUMHURIYET")) {
            skor = puanMotoru(ind, 3.0, 4.5, 4.0, 3.0, -3.0, 4.5, 3.0, 3.5, 1.0, 2.5);
            
            if (skor < 700) kazanilanUnvan = "DEVRİK LİDER";
            else if (skor < 1350) kazanilanUnvan = "MİLLİ ŞEF";
            else kazanilanUnvan = "DEMOKRASİ KAHRAMANI";
            
            sonucCumhuriyet(skor);
        }
        else if (yol.equals("SERIAT")) {
            skor = puanMotoru(ind, 3.0, 2.5, 2.0, 4.0, 5.0, 3.0, 2.0, -3.0, 4.5, 2.0);
            
            if (skor < 600) kazanilanUnvan = "BASİRETSİZ VEZİR";
            else if (skor < 1250) kazanilanUnvan = "DİN MUHAFIZI";
            else kazanilanUnvan = "ÜMMETİN KILICI";
            
            sonucSeriat(skor);
        }
        else { 
            skor = puanMotoru(ind, 4.5, 4.0, 2.0, 4.0, -4.0, 5.0, 4.0, 1.0, 2.0, 4.0);
            
            if (skor < 750) kazanilanUnvan = "MAĞLUP GAZİ";
            else kazanilanUnvan = "KURTARICI ATA";
            
            sonucMilliMucadele(skor);
        }

        System.out.println("\n----------------------------------------------------------------");
        System.out.println("Oyun Yolu: " + yol);
        System.out.println("TARİHİN SİZE LAYIK GÖRDÜĞÜ SIFAT: " + SARI + "\u001B[3m" + kazanilanUnvan + RESET);
        System.out.println("----------------------------------------------------------------\n");

        maviYaz("==========================================================================");
        sariYaz("                 Enver Paşa'nın hikayesi burada sona erdi...              ");
        maviYaz("==========================================================================");
    }

    private double puanMotoru(IndikatorlerCh3 ind, double k_ordu, double k_ikmal, double k_savas,
                              double k_moral, double k_padisah, double k_halk, double k_subay,
                              double k_itilaf, double k_ittifak, double k_bolgeler) {
        
        double toplamPuan = 0;

        toplamPuan += hesaplaAsimetrik(ind.getOrduGucu(), k_ordu);
        toplamPuan += hesaplaAsimetrik(ind.getIkmalDurumu(), k_ikmal);
        toplamPuan += hesaplaAsimetrik(ind.getAskerMorali(), k_moral);
        toplamPuan += hesaplaAsimetrik(ind.getHalkDestegi(), k_halk);
        toplamPuan += hesaplaAsimetrik(ind.getSubayDestegi(), k_subay);

        if (k_padisah < 0) {
            if (ind.getPadisahDestegi() > 50) {
                toplamPuan -= (ind.getPadisahDestegi() - 50) * Math.abs(k_padisah) * 8;
            } else {
                toplamPuan += (50 - ind.getPadisahDestegi()) * Math.abs(k_padisah) * 4;
            }
        } else {
            toplamPuan += hesaplaAsimetrik(ind.getPadisahDestegi(), k_padisah);
        }

        toplamPuan += ind.getItilafIliskisi() * k_itilaf * 2;
        toplamPuan += ind.getIttifakIliskisi() * k_ittifak * 2;

        double guvenlikPuani = (10 - ind.getSavasTehlikesi());
        if (guvenlikPuani < 5) {
            toplamPuan -= (5 - guvenlikPuani) * k_savas * 15;
        } else {
            toplamPuan += guvenlikPuani * k_savas * 5;
        }

        int bolgeToplami = ind.getBolgePuan("Kafkas") + ind.getBolgePuan("Irak") +
                ind.getBolgePuan("Suriye") + ind.getBolgePuan("Canakkale");

        if (bolgeToplami < 0) {
            toplamPuan += bolgeToplami * k_bolgeler * 6;
        } else {
            toplamPuan += bolgeToplami * k_bolgeler * 3;
        }

        if (ind.getOrduGucu() < 10 || ind.getHalkDestegi() < 10 || ind.getIkmalDurumu() < 10) {
            System.out.println(KIRMIZI + "(!) UYARI: Devletin bir kolonu çöktü! (Ağır Ceza)" + RESET);
            toplamPuan -= 600; 
        }

        return toplamPuan;
    }

    private double hesaplaAsimetrik(int deger, double katsayi) {
        double sonuc = 0;
        double fark = deger - 50;

        if (fark >= 0) {
            sonuc = fark * katsayi * 4; 
        } else {
            sonuc = fark * katsayi * 8; 
        }
        return sonuc;
    }

    private void sonucTarihsel(double skor) {
        System.out.println("Tarihsel Skorunuz: " + (int)skor);
        if (skor < 600) { 
            kirmiziYaz("\n>>> SONUÇ: UNUTULAN KOMUTAN <<<\n");
            System.out.println("4 Ağustos 1922... Çegan Tepesi sessiz.");
            System.out.println("Tarih sizi 'Hayalperest bir maceracı' olarak kaydetti.");
        } else if (skor < 1200) { 
            sariYaz("\n>>> SONUÇ: HÜZÜNLÜ DESTAN <<<\n");
            System.out.println("Kurban Bayramı sabahı... Şehadet haberiniz İstanbul'da yankılandı.");
            System.out.println("Bedelini kanınızla ödediniz, ama Turan hayali sizinle toprağa gömüldü.");
        } else {
            yesilYaz("\n>>> SONUÇ: DOĞU'NUN EBEDİ KILICI <<<\n");
            System.out.println("Çegan Tepesi bir son değil, bir milat oldu!");
            System.out.println("Siz, kaybederken bile kazanan, ölümüyle dirilen bir efsane oldunuz.");
        }
    }

    private void sonucTuran(double skor) {
        System.out.println("Turan Skoru: " + (int)skor);
        if (skor < 700) {
            kirmiziYaz("\n>>> SONUÇ: KUMDAN KALE <<<\n");
            System.out.println("İmparatorluk, kurulduğu hızla parçalandı.");
        } else if (skor < 1400) {
            sariYaz("\n>>> SONUÇ: KANLI TAHT <<<\n");
            System.out.println("Sınırlar geniş ama halk yorgun. Tarih sizi 'Acımasız Hükümdar' yazdı.");
        } else {
            yesilYaz("\n>>> SONUÇ: İKİNCİ METE HAN DÖNEMİ <<<\n");
            System.out.println("Sadece kılıçla değil, kalemle ve akılla da fethettiniz! Pax Turanica kuruldu.");
        }
    }

    private void sonucKomunist(double skor) {
        System.out.println("Devrim Skoru: " + (int)skor);
        if (skor < 650) {
            kirmiziYaz("\n>>> SONUÇ: SİBİRYA SÜRGÜNÜ <<<\n");
            System.out.println("Devrim kendi evladını yedi. Mezarınız bile meçhul.");
        } else if (skor < 1300) {
            sariYaz("\n>>> SONUÇ: DEMİR PERDE <<<\n");
            System.out.println("Stalin'in gölgesinde, sessiz ve itaatkar bir yönetim sürdünüz.");
        } else {
            yesilYaz("\n>>> SONUÇ: KIZIL ELMA'DAN KIZIL YILDIZ'A <<<\n");
            System.out.println("Tarihin akışını değiştirdiniz! Türk-İslam sentezli Sosyalizm'in babası oldunuz.");
        }
    }

    private void sonucCumhuriyet(double skor) {
        System.out.println("Cumhuriyet Skoru: " + (int)skor);
        if (skor < 700) {
            kirmiziYaz("\n>>> SONUÇ: YARIM KALAN DEVRİM <<<\n");
            System.out.println("Ekonomik krizler ve darbelerle hayalleriniz yarım kaldı.");
        } else if (skor < 1350) {
            sariYaz("\n>>> SONUÇ: BÜROKRATİK CUMHURİYET <<<\n");
            System.out.println("Devlet ayakta ama demokrasi tam yerleşemedi. 'Tek Adam' rejimi.");
        } else {
            yesilYaz("\n>>> SONUÇ: MUASIR MEDENİYETLER SEVİYESİ <<<\n");
            System.out.println("Türkiye, Avrupa'nın parlayan yıldızı oldu. Ebedi Cumhurbaşkanı!");
        }
    }

    private void sonucSeriat(double skor) {
        System.out.println("Hilafet Skoru: " + (int)skor);
        if (skor < 600) {
            kirmiziYaz("\n>>> SONUÇ: TAASSUP VE ÇÖKÜŞ <<<\n");
            System.out.println("Ülke fakirleşti, sömürgeye dönüştü. Bilim reddedildi.");
        } else if (skor < 1250) {
            sariYaz("\n>>> SONUÇ: YALNIZ KALE <<<\n");
            System.out.println("İçe kapalı, saygı duyulan ama korkulmayan bir 'Müze İmparatorluk'.");
        } else {
            yesilYaz("\n>>> SONUÇ: NİZAM-I ALEM <<<\n");
            System.out.println("İslam'ın Altın Çağı yeniden başladı! Ümmetin Kılıcı ve Aklı.");
        }
    }

    private void sonucMilliMucadele(double skor) {
        System.out.println("İstiklal Skoru: " + (int)skor);
        if (skor < 750) {
            kirmiziYaz("\n>>> SONUÇ: SEVR'İN GÖLGESİ <<<\n");
            System.out.println("Bağımsızlık kazanıldı ama bedeli çok ağır oldu.");
        } else {
            yesilYaz("\n>>> SONUÇ: YAŞASIN TAM BAĞIMSIZ TÜRKİYE! <<<\n");
            System.out.println("Lozan'da masaya yumruğumuzu vurduk! Hür ve müstakil bir devlet.");
        }
    }
}
