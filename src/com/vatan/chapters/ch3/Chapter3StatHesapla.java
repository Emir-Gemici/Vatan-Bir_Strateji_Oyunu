package com.vatan.chapters.ch3;

import com.vatan.core.Olay;
import com.vatan.core.RenkliYazici;

// HATA ÇÖZÜMÜ: "extends Olay<IndikatorlerCh3>" ekledik.
public class Chapter3StatHesapla extends Olay<IndikatorlerCh3> implements RenkliYazici {

    // Constructor zorunlu çünkü Olay sınıfından miras alıyoruz
    public Chapter3StatHesapla() {
        super("BÖLÜM SONU DEĞERLENDİRMESİ", new String[]{});
    }

    @Override
    public void oynat(IndikatorlerCh3 indikatorler) {
        hesapla(indikatorler);
    }

    public void hesapla(IndikatorlerCh3 ind) {
        String yol = ind.getOyunYolu();
        String kazanilanUnvan = "BİLİNMEYEN"; // Varsayılan

        System.out.println("\n");
        maviYaz("==========================================================================");
        sariYaz("               --- BÖLÜM 3 FİNALİ: KADERİN TERAZİSİ ---                   ");
        maviYaz("==========================================================================");

        double skor = 0;

        // --- SKOR VE UNVAN BELİRLEME ---
        if (yol.equals("TARIHSEL")) {
            skor = puanMotoru(ind, 1.5, 1.0, 1.0, 2.0, 0.5, 1.0, 1.8, 0.1, 1.2, 1.5);
            if (skor < 150) kazanilanUnvan = "HAYALPEREST MACERACI";
            else if (skor < 300) kazanilanUnvan = "ŞEHİT-İ ALA (YÜCE ŞEHİT)";
            else kazanilanUnvan = "TURAN'IN EBEDİ BAŞKOMUTANI";
        }
        else if (yol.equals("TURAN")) {
            skor = puanMotoru(ind, 2.0, 2.0, 0.5, 1.5, 1.0, 1.2, 1.5, 0.0, 1.0, 2.5);
            if (skor < 200) kazanilanUnvan = "YALNIZ HAKAN";
            else if (skor < 400) kazanilanUnvan = "ASYA KAPLANI";
            else kazanilanUnvan = "İKİNCİ METE HAN";
        }
        else if (yol.equals("KOMUNIST")) {
            skor = puanMotoru(ind, 1.2, 1.5, 1.0, 1.2, -1.0, 2.5, 0.5, 0.0, 2.0, 1.0);
            if (skor < 180) kazanilanUnvan = "HAİN TROÇKİST";
            else if (skor < 350) kazanilanUnvan = "DEMİR YOLDAŞ";
            else kazanilanUnvan = "DOĞU'NUN LENİN'İ";
        }
        else if (yol.equals("CUMHURIYET")) {
            skor = puanMotoru(ind, 1.2, 2.0, 2.0, 1.0, 0.0, 2.0, 1.0, 2.0, 0.5, 1.0);
            if (skor < 200) kazanilanUnvan = "DEVRİK LİDER";
            else if (skor < 400) kazanilanUnvan = "MİLLİ ŞEF";
            else kazanilanUnvan = "DEMOKRASİ KAHRAMANI";
        }
        else if (yol.equals("SERIAT")) {
            skor = puanMotoru(ind, 1.5, 1.2, 0.5, 1.5, 2.5, 1.5, 1.0, 0.0, 2.5, 1.0);
            if (skor < 180) kazanilanUnvan = "BASİRETSİZ VEZİR";
            else if (skor < 380) kazanilanUnvan = "DİN MUHAFIZI";
            else kazanilanUnvan = "ÜMMETİN KILICI";
        }
        else { // MİLLİ MÜCADELE
            skor = puanMotoru(ind, 2.0, 1.5, 1.0, 1.5, -2.0, 2.0, 2.0, 1.0, 0.5, 1.5);
            if (skor < 200) kazanilanUnvan = "MAĞLUP GAZİ";
            else kazanilanUnvan = "KURTARICI ATA";
        }

        // --- ÇIKTI EKRANI ---
        System.out.println("Oyun Yolu: " + yol);
        System.out.println("Toplam Skor: " + (int)skor);
        System.out.println("----------------------------------------------------------------");

        // İSTEĞİNİZ ÜZERİNE EKLENEN KISIM:
        System.out.println( "TARİHİN SİZE LAYIK GÖRDÜĞÜ SIFAT: " + SARI + "\u001B[3m" + kazanilanUnvan + RESET);
        // Not: \u001B[3m italik (kavisli) yapar.

        System.out.println("----------------------------------------------------------------\n");

        maviYaz("==========================================================================");
        sariYaz("                 Enver Paşa'nın hikayesi burada sona erdi...              ");
        maviYaz("==========================================================================");
    }

    private double puanMotoru(IndikatorlerCh3 ind, double k_ordu, double k_ikmal, double k_savas,
                              double k_moral, double k_padisah, double k_halk, double k_subay,
                              double k_itilaf, double k_ittifak, double k_bolgeler) {
        double toplamPuan = 0;
        toplamPuan += ind.getOrduGucu() * k_ordu * 3; // Çarpanları biraz artırdım puanlar dolgun görünsün
        toplamPuan += ind.getIkmalDurumu() * k_ikmal * 3;
        toplamPuan += ind.getAskerMorali() * k_moral * 3;
        toplamPuan += ind.getPadisahDestegi() * k_padisah * 3;
        toplamPuan += ind.getHalkDestegi() * k_halk * 3;
        toplamPuan += ind.getSubayDestegi() * k_subay * 3;
        toplamPuan += ind.getItilafIliskisi() * k_itilaf * 3;
        toplamPuan += ind.getIttifakIliskisi() * k_ittifak * 3;
        toplamPuan += (5 - ind.getSavasTehlikesi()) * k_savas * 10;
        int bolgeToplami = ind.getBolgePuan("Kafkas") + ind.getBolgePuan("Irak") +
                ind.getBolgePuan("Suriye") + ind.getBolgePuan("Canakkale");
        toplamPuan += bolgeToplami * k_bolgeler;
        return toplamPuan;
    }


    // --- SENARYO FİNALLERİ ---

    private void sonucTarihsel(IndikatorlerCh3 ind) {
        // Tarihsel Yolda Önemli Olan: Asker Morali, Subay Sadakati ve Kafkasya
        // Padişah desteği önemsiz (hatta eksi olabilir), İtilaf ilişkisi önemsiz.
        double skor = puanMotoru(ind,
                1.5,  // Ordu Gücü (Yüksek)
                1.0,  // İkmal
                1.0,  // Savaş Riski
                2.0,  // Moral (Çok Önemli - Şehadet ruhu)
                0.5,  // Padişah (Düşük)
                1.0,  // Halk
                1.8,  // Subay (Yüksek - İttihatçı kadro)
                0.1,  // İtilaf (Önemsiz)
                1.2,  // İttifak (Almanya/Sovyet dengesi)
                1.5   // Bölge Hakimiyeti (Kafkasya hayali)
        );

        System.out.println("Tarihsel Skorunuz: " + (int)skor);

        if (skor < 150) {
            kirmiziYaz("\n>>> SONUÇ: UNUTULAN KOMUTAN <<<");
            System.out.println("4 Ağustos 1922... Çegan Tepesi sessiz.");
            System.out.println("Mitralyöz sesleri dindiğinde, yerde yatan bedeni kimse tanımadı.");
            System.out.println("Cebinden çıkan mektuplar çamura bulanmıştı. Askerleriniz dağıldı, davanız sahipsiz kaldı.");
            System.out.println("Tarih sizi 'Hayalperest bir maceracı' olarak, hüzünlü bir dipnot şeklinde kaydetti.");
            System.out.println("Anadolu'daki Milli Mücadele kadrosu bile adınızı anmaktan imtina etti.");

        } else if (skor < 300) {
            sariYaz("\n>>> SONUÇ: HÜZÜNLÜ DESTAN <<<");
            System.out.println("Kurban Bayramı sabahı... Atınızın üzerinde, kılıcınız elinizde ölüme sürdünüz.");
            System.out.println("Rus komutanı bile bu cesaret karşısında şapkasını çıkardı.");
            System.out.println("Şehadet haberiniz İstanbul'a ulaştığında, eski silah arkadaşlarınız gizlice ağladı.");
            System.out.println("Bedelini kanınızla ödediniz, ama Turan hayali sizinle birlikte toprağa gömüldü.");
            System.out.println("Nesiller boyu sürecek buruk bir türkü oldunuz: 'Hoş gelişler ola, kahraman Enver Paşa...'");

        } else {
            yesilYaz("\n>>> SONUÇ: DOĞU'NUN EBEDİ KILICI <<<");
            System.out.println("Çegan Tepesi bir son değil, bir milat oldu!");
            System.out.println("Şehadetiniz öyle bir yankı uyandırdı ki, Basmacı Hareketi alev topuna döndü.");
            System.out.println("Türkistan'dan Anadolu'ya kadar her evde, Mustafa Kemal'in yanında sizin de resminiz asıldı.");
            System.out.println("Siz, kaybederken bile kazanan, ölümüyle dirilen bir efsane oldunuz.");
            System.out.println("Ruhunuz şad, makamınız uçmağ olsun Başkomutanım!");
        }
    }

    private void sonucTuran(IndikatorlerCh3 ind) {
        // Turan Yolunda Önemli Olan: Ordu, İkmal (Mesafeler), Bölgeler
        double skor = puanMotoru(ind,
                2.0, // Ordu (Çok Yüksek)
                2.0, // İkmal (Çok Yüksek - Lojistik hayati)
                0.5, // Savaş Riski (Savaş zaten kaçınılmaz)
                1.5, // Moral
                1.0, // Padişah
                1.2, // Halk
                1.5, // Subay
                0.0, // İtilaf (Düşmanız)
                1.0, // İttifak (Asya devletleri)
                2.5  // Bölge (Fetih esastır)
        );

        System.out.println("Turan Skoru: " + (int)skor);

        if (skor < 200) {
            kirmiziYaz("\n>>> SONUÇ: KUMDAN KALE <<<");
            System.out.println("Haritadaki sınırlar devasa ama devletin temelleri çürük.");
            System.out.println("Haberleşme koptu, ikmal kesildi. Uç beyleri kendi krallıklarını ilan etti.");
            System.out.println("Enver Han, kendi otağında, güvendiği bir komutanı tarafından zehirlendi.");
            System.out.println("İmparatorluk, kurulduğu hızla parçalandı ve Asya bozkırlarında kanlı bir iç savaş başladı.");

        } else if (skor < 400) {
            sariYaz("\n>>> SONUÇ: KANLI TAHT <<<");
            System.out.println("Sınırlar Adriyatik'ten Çin Seddi'ne ulaştı, evet.");
            System.out.println("Ancak bu toprakları tutmak için sürekli savaşmak zorunda kaldınız.");
            System.out.println("Halk yorgun, hazine tamtakır. Ömrünüz at sırtında isyan bastırmakla geçti.");
            System.out.println("Tarih sizi 'Büyük Fatih' ama 'Acımasız Hükümdar' olarak yazdı.");

        } else {
            yesilYaz("\n>>> SONUÇ: İKİNCİ METE HAN DÖNEMİ <<<");
            System.out.println("Sadece kılıçla değil, kalemle ve akılla da fethettiniz!");
            System.out.println("Semerkant'tan İstanbul'a demiryolları döşendi, fabrikalar kuruldu.");
            System.out.println("Türk Birliği (Pax Turanica) sayesinde dünya siyaseti Asya'dan yönetiliyor.");
            System.out.println("Gök bayrak ve Al bayrak yan yana, sonsuza dek dalgalanacak.");
            System.out.println("Kutlu olsun Hakanım!");
        }
    }

    private void sonucKomunist(IndikatorlerCh3 ind) {
        // Komünist Yolda: Halk Desteği, İttifak (Sovyet), İkmal (Eşitlik)
        // Padişah ve Subay desteği düşük olabilir, sorun değil.
        double skor = puanMotoru(ind,
                1.2, // Ordu
                1.5, // İkmal
                1.0, // Savaş Riski
                1.2, // Moral
                -1.0, // Padişah (Varsa eksi puan, yoksa iyi)
                2.5, // Halk (Proletarya çok önemli)
                0.5, // Subay (Eski subaylar tasfiye edildi)
                0.0, // İtilaf
                2.0, // İttifak (Sovyetler)
                1.0  // Bölge
        );

        System.out.println("Devrim Skoru: " + (int)skor);

        if (skor < 180) {
            kirmiziYaz("\n>>> SONUÇ: SİBİRYA SÜRGÜNÜ <<<");
            System.out.println("Moskova, 'Milli Komünizm' hayallerinizi tehlikeli buldu.");
            System.out.println("Bir gece yarısı 'Troçkist' ve 'Hain' ilan edildiniz.");
            System.out.println("Kendi kurduğunuz İstiklal Mahkemeleri bu kez sizin için kuruldu.");
            System.out.println("Mezarınızın nerede olduğu bile bilinmiyor. Devrim, kendi evladını yedi.");

        } else if (skor < 350) {
            sariYaz("\n>>> SONUÇ: DEMİR PERDE <<<");
            System.out.println("Türkiye Sosyalist Cumhuriyeti hayatta, ama ruhu yok.");
            System.out.println("Her şey devletin, herkes eşit ama kimse mutlu değil.");
            System.out.println("Ülke gri beton bloklarla doldu. Stalin'in gölgesinde, sessiz ve itaatkar bir yönetim sürdünüz.");
            System.out.println("Bağımsızlık kağıt üzerinde kaldı.");

        } else {
            yesilYaz("\n>>> SONUÇ: KIZIL ELMA'DAN KIZIL YILDIZ'A <<<");
            System.out.println("Tarihin akışını değiştirdiniz! Türk-İslam sentezli bir Sosyalizm modeli yarattınız.");
            System.out.println("Sovyetlere boyun eğmediniz, mazlum milletlerin (Üçüncü Dünya) lideri oldunuz.");
            System.out.println("Anadolu, emperyalizme karşı direnişin ve adil paylaşımın küresel merkezi oldu.");
            System.out.println("Yoldaş Enver, dünya tarihine 'Halkların Babası' olarak geçti.");
        }
    }

    private void sonucCumhuriyet(IndikatorlerCh3 ind) {
        // Cumhuriyet Yolu: Halk, İtilaf (Diplomasi), İkmal (Ekonomi)
        double skor = puanMotoru(ind,
                1.2, // Ordu
                2.0, // İkmal (Ekonomi)
                2.0, // Savaş Riski (Barış çok önemli)
                1.0, // Moral
                0.0, // Padişah
                2.0, // Halk (Demokrasi)
                1.0, // Subay
                2.0, // İtilaf (Batı ile entegrasyon)
                0.5, // İttifak
                1.0  // Bölge
        );

        System.out.println("Cumhuriyet Skoru: " + (int)skor);

        if (skor < 200) {
            kirmiziYaz("\n>>> SONUÇ: YARIM KALAN DEVRİM <<<");
            System.out.println("Sivil hayata geçiş sancılı oldu. Ekonomik krizler halkı bezdirdi.");
            System.out.println("Muhalefet partileri rejimi kilitledi. Ordu, 'Düzeni sağlamak' için yönetime el koydu.");
            System.out.println("Enver Paşa, kurduğu cumhuriyette ev hapsinde vefat etti. Hayalleriniz yarım kaldı.");

        } else if (skor < 400) {
            sariYaz("\n>>> SONUÇ: BÜROKRATİK CUMHURİYET <<<");
            System.out.println("Devlet ayakta, sınırlar güvende. Ancak demokrasi tam yerleşemedi.");
            System.out.println("'Tek Adam' rejimi devam ediyor. Halk size saygı duyuyor ama korkuyor da.");
            System.out.println("Yine de Osmanlı'nın küllerinden modern bir devlet çıkarmayı başardınız.");

        } else {
            yesilYaz("\n>>> SONUÇ: MUASIR MEDENİYETLER SEVİYESİ <<<");
            System.out.println("Müthiş bir başarı! Türkiye, Avrupa'nın hasta adamı değil, parlayan yıldızı oldu.");
            System.out.println("Fabrikalar tütüyor, üniversiteler bilim üretiyor, halk özgürce konuşuyor.");
            System.out.println("Enver Paşa, asker üniformasını çıkarıp sivil bir devlet adamı olarak da destan yazdı.");
            System.out.println("Milletin gönlünde ebedi Cumhurbaşkanı olarak taht kurdunuz.");
        }
    }

    private void sonucSeriat(IndikatorlerCh3 ind) {
        // Şeriat Yolu: Padişah, İttifak (İslam Alemi), Halk
        double skor = puanMotoru(ind,
                1.5, // Ordu
                1.2, // İkmal
                0.5, // Savaş Riski
                1.5, // Moral
                2.5, // Padişah (Halife çok önemli)
                1.5, // Halk (Ümmet)
                1.0, // Subay
                0.0, // İtilaf
                2.5, // İttifak (İslam Birliği)
                1.0  // Bölge
        );

        System.out.println("Hilafet Skoru: " + (int)skor);

        if (skor < 180) {
            kirmiziYaz("\n>>> SONUÇ: TAASSUP VE ÇÖKÜŞ <<<");
            System.out.println("Teknoloji ve bilim 'Gavur icadı' diye reddedildi.");
            System.out.println("Ülke fakirleşti, salgın hastalıklar ve kıtlık baş gösterdi.");
            System.out.println("Halk, 'Din elden gidiyor' diyen farklı tarikatların kavgası arasında ezildi.");
            System.out.println("Devlet, modern dünyanın dişlileri arasında ezilip sömürgeye dönüştü.");

        } else if (skor < 380) {
            sariYaz("\n>>> SONUÇ: YALNIZ KALE <<<");
            System.out.println("Sınırlar kapandı, içe kapalı bir rejim kuruldu.");
            System.out.println("Maneviyat güçlü ama maddi refah düşük. Dünya ile bağlar koptu.");
            System.out.println("Osmanlı, kendi kabuğunda yaşayan, saygı duyulan ama korkulmayan bir 'Müze İmparatorluk' oldu.");

        } else {
            yesilYaz("\n>>> SONUÇ: NİZAM-I ALEM <<<");
            System.out.println("İslam'ın Altın Çağı yeniden başladı!");
            System.out.println("Hem ahlaki hem teknolojik kalkınma sağlandı. Batı, İstanbul'daki ilim meclislerine öğrenci gönderiyor.");
            System.out.println("Hilafet sancağı altında Afrika'dan Asya'ya dev bir birlik oluştu.");
            System.out.println("Enver Paşa, 'Ümmetin Kılıcı ve Aklı' olarak tarihe geçti.");
        }
    }

    private void sonucMilliMucadele(IndikatorlerCh3 ind) {
        // Milli Mücadele (Parçalanma/Manda'dan dönüş): Ordu, Halk, Subay
        double skor = puanMotoru(ind,
                2.0, 1.5, 1.0, 1.5,
                -2.0, // Padişah desteği negatif etki (Saltanat kalkmalı)
                2.0, 2.0,
                1.0, 0.5, 1.5
        );

        System.out.println("İstiklal Skoru: " + (int)skor);

        if (skor < 200) {
            kirmiziYaz("\n>>> SONUÇ: SEVR'İN GÖLGESİ <<<");
            System.out.println("Bağımsızlık kazanıldı ama bedeli çok ağır oldu.");
            System.out.println("Ekonomi çöktü, topraklar harap.");
        } else {
            yesilYaz("\n>>> SONUÇ: YAŞASIN TAM BAĞIMSIZ TÜRKİYE! <<<");
            System.out.println("Lozan'da masaya yumruğumuzu vurduk!");
            System.out.println("Misak-ı Milli sınırları içinde, hür ve müstakil bir devlet doğdu.");
        }
    }
}