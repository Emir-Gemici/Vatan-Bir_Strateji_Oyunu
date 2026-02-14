package com.vatan.chapters.ch3;

import com.vatan.core.*;
import java.util.Scanner;

public class Chapter3_48 extends Olay<IndikatorlerCh3> {

    public Chapter3_48() {
        super("", new String[]{});
    }

    @Override
    public void oynat(IndikatorlerCh3 indikatorlerCh3) {
        String mevcutYol = indikatorlerCh3.getOyunYolu();
        MuzikKutusu olayMuzigi = new MuzikKutusu();

        if (mevcutYol.equals("TARIHSEL")) {
            // TARİHSEL GERÇEKLİK: MONDROS ATEŞKESİ (30 Ekim 1918)
            // 47'de Irak kaybedildi, 49'da ülke terk edilecek. Burası teslimiyet anı.
            this.metin =
                    "Bahriye Nazırı Rauf (Orbay) Bey:\n" +
                            "Enver Paşa, Limni Adası'nda İngilizlerle masaya oturduk (Mondros Mütarekesi).\n" +
                            "Şartlar çok ağır Paşam. Boğazlar açılacak, ordular terhis edilecek, tüneller ve telsizler İtilaf devletlerine verilecek.\n" +
                            "Dahası 7. Madde: 'İtilaf devletleri güvenliklerini tehdit edecek bir durum görürlerse, herhangi bir stratejik noktayı işgal edebilecekler.'\n" +
                            "Bu maddeyi kabul edersem vatan işgale açık hale gelir. Etmezsem savaş devam eder ama takatimiz kalmadı. Ne emredersiniz?\n";
            this.cevaplar = new String[]{
                    "Lanet olsun! Ordunun hali ortada Rauf. İmzala... Ama bil ki bu barış değil, idam fermanıdır. (Mütarekeyi Kabul Et)",
                    "Asla! 7. Madde'yi kabul etme! Masayı devir gel. Gerekirse İstanbul sokaklarında vuruşuruz! (Reddet)"
            };
            olayMuzigi.oynat("1/Chapter3_48.mp3");

        } else if (mevcutYol.equals("TURAN")) {
            // TURAN YOLU: DİL VE KÜLTÜR DEVRİMİ
            // 47'de altyapı konuşuldu, 49'da Batı ambargosu var. Burası kimlik inşası.
            this.metin =
                    "Kültür Kurultayı (Semerkant):\n" +
                            "Ulu Hakan! Büyük Turan'ı kurduk lakin Anadolu Türk'ü başka, Kırgız'ı başka, Tatar'ı başka alfabe kullanır.\n" +
                            "Birliğin temeli dildir. Resmi alfabe ne olacak?\n" +
                            "Atalarımızın mirası 'Göktürk Damgaları'na mı dönelim, yoksa Batı tekniğine uygun 'Latin Alfabesi'ne mi geçelim?\n";
            this.cevaplar = new String[]{
                    "Öze dönüş vaktidir! Göktürk alfabesi modernize edilsin. Taşlara kazınan tarih kağıda dökülsün!",
                    "Gelecek Batı tekniğindedir. Latin alfabesine geçiyoruz. Okuma yazma seferberliği başlasın."
            };
            olayMuzigi.oynat("2/Chapter3_48.mp3");

        } else if (mevcutYol.equals("CUMHURIYET")) {
            // CUMHURİYET YOLU: DİN VE DEVLET İŞLERİ (DİYANET)
            // 47'de eğitim reformu vardı, 49'da çok partili hayat denemesi var. Burası laiklik adımı.
            this.metin =
                    "Meclis Tartışması (Ankara):\n" +
                            "Paşam, Şeriye ve Evkaf Vekaleti'ni (Şeriat Bakanlığı) kaldırdık.\n" +
                            "Ancak din hizmetlerini kim yönetecek? Cami imamları kontrolsüz kalırsa rejime karşı kışkırtma yapabilirler.\n" +
                            "Devlete bağlı bir 'Diyanet İşleri Başkanlığı' kuralım mı, yoksa dini cemaatlere mi bırakalım?\n";
            this.cevaplar = new String[]{
                    "Din vicdan işidir ama kontrolsüz bırakılamaz. Diyanet kurulsun, hutbeler Ankara'dan yazılsın. (Devlet Kontrolü)",
                    "Devlet dine karışmaz. Cemaatler kendi imamını seçsin, maaşını versin. (Tam Laiklik)"
            };
            olayMuzigi.oynat("3/Chapter3_48.mp3");

        } else if (mevcutYol.equals("SERIAT")) {
            // ŞERİAT YOLU: HUKUK SİSTEMİ
            // 47'de kıyafet zorunluluğu, 49'da anayasa tartışması. Burası yargı düzeni.
            this.metin =
                    "Şeyhülislam Efendi:\n" +
                            "Sultanım, mahkemelerde 'Mecelle' (Osmanlı Medeni Kanunu) uygulanıyor ama bazı kadılar yetersiz kalıyor.\n" +
                            "Suçlulara verilecek cezalarda 'Kısas' (Göze göz) ve 'Had' (Uzuv kesme vb.) cezalarını tavizsiz uygulayalım mı?\n" +
                            "Yoksa 'Tazir' (Hakimin takdiri / Hapis / Para) cezalarına ağırlık mı verelim?\n";
            this.cevaplar = new String[]{
                    "Allah'ın hükmü neyse odur! Hırsızın eli kesilsin, katil kısas edilsin. Taviz yok! (Katı Şeriat)",
                    "Zaman değişti. İslam maslahatı gözetir. Bedensel cezalar yerine hapis ve ıslah uygulansın. (Ilımlı Yaklaşım)"
            };
            olayMuzigi.oynat("4/Chapter3_48.mp3");

        } else if (mevcutYol.equals("PARCALANMA") || mevcutYol.equals("MANDA")) {
            // PARÇALANMA YOLU: AMERİKAN MANDASI TARTIŞMASI
            // 47'de Trakya sorunu, 49'da Padişahın kaçışı. Burası son kurtuluş reçetesi arayışı.
            this.metin =
                    "Wilson Prensipleri Cemiyeti (Halide Edip ve Aydınlar):\n" +
                            "Paşam! Ülke İngiliz, Fransız, İtalyan ve Yunan arasında paylaşılıyor.\n" +
                            "Tek kurtuluş yolu, sömürgeci olmayan güçlü bir devletin himayesidir.\n" +
                            "Amerikan Mandası'nı kabul edelim. ABD bizi korur, bütünlüğümüzü sağlar ve kalkındırır. Ne dersiniz?\n";
            this.cevaplar = new String[]{
                    "Denize düşen yılana sarılır. Amerikan Mandası ehven-i şerdir. Görüşmelere başlayın.",
                    "Bağımsızlık karakterimizdir! Manda ve himaye kabul edilemez. Ya istiklal ya ölüm!"
            };
            olayMuzigi.oynat("5/Chapter3_48.mp3");
        }

        soruSor();

        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int secim = sc.nextInt();
            sc.nextLine();
            olayMuzigi.durdur();

            if (mevcutYol.equals("TARIHSEL")) {
                if (secim == 1) {
                    kirmiziYaz("\n*** İŞGALİN KAPISI AÇILDI ***\n");
                    System.out.println("Mondros imzalandı. Osmanlı fiilen bitti. Asker silah bıraktı.");
                    System.out.println("Enver Paşa olarak istifa etmekten ve ülkeyi terk etmekten başka çareniz kalmadı.");

                    indikatorlerCh3.setAskerMorali(indikatorlerCh3.getAskerMorali() - 5); // Büyük moral çöküşü
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() - 3);
                    indikatorlerCh3.setItilafIliskisi(indikatorlerCh3.getItilafIliskisi() + 2); // Teslimiyet onları memnun etti
                } else {
                    yesilYaz("\n*** ONURLU AMA ÇARESİZ ***\n");
                    System.out.println("Rauf Bey imzalamadı ama Padişah devreye girdi. Ateşkes zorla imzalandı.");
                    System.out.println("Halk sizin dik duruşunuzu takdir etse de sonuç değişmedi.");

                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() + 2);
                    indikatorlerCh3.setPadisahDestegi(indikatorlerCh3.getPadisahDestegi() - 3); // Sarayla ipler koptu
                }

            } else if (mevcutYol.equals("TURAN")) {
                if (secim == 1) {
                    yesilYaz("\n*** GÖKTÜRK RÜZGARI ***\n");
                    System.out.println("Taşlara kazınan harfler tabelalara yazıldı. Milli şuur zirve yaptı.");
                    System.out.println("Ancak okuma-yazma öğrenmek zorlaştı.");
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() + 3); // Milliyetçiler sevindi
                    indikatorlerCh3.setIkmalDurumu(indikatorlerCh3.getIkmalDurumu() - 1); // Bürokrosi yavaşladı
                } else {
                    yesilYaz("\n*** MEDENİYET ALFABESİ ***\n");
                    System.out.println("Latin harfleriyle okuma yazma patlaması yaşandı. Batı ile entegrasyon kolaylaştı.");
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() + 1);
                    indikatorlerCh3.setItilafIliskisi(indikatorlerCh3.getItilafIliskisi() + 2);
                }

            } else if (mevcutYol.equals("CUMHURIYET")) {
                if (secim == 1) {
                    yesilYaz("\n*** DİYANET İŞLERİ ***\n");
                    System.out.println("Diyanet kuruldu. Din istismarı önlendi, hutbeler millileşti.");
                    indikatorlerCh3.setSubayDestegi(indikatorlerCh3.getSubayDestegi() + 2);
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() - 1); // Muhafazakarlar şüpheli
                } else {
                    kirmiziYaz("\n*** TARİKATLAR GÜÇLENDİ ***\n");
                    System.out.println("Devlet dinden elini çekti ama boşluğu cemaatler doldurdu. Otorite sarsılıyor.");
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() + 2); // Dindarlar sevindi
                    indikatorlerCh3.setSubayDestegi(indikatorlerCh3.getSubayDestegi() - 3); // Ordu rahatsız
                }

            } else if (mevcutYol.equals("SERIAT")) {
                if (secim == 1) {
                    kirmiziYaz("\n*** KORKU İMPARATORLUĞU ***\n");
                    System.out.println("Meydanlarda infazlar başladı. Suç oranları düştü ama halk korkudan sindi.");
                    System.out.println("Batı dünyası 'Barbar Türkler' manşetleri atıyor.");
                    indikatorlerCh3.setItilafIliskisi(indikatorlerCh3.getItilafIliskisi() - 5);
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() - 3);
                } else {
                    yesilYaz("\n*** ADALET MÜLKÜN TEMELİDİR ***\n");
                    System.out.println("Ilımlı cezalar halkı rahatlattı. Devlet babacan yüzünü gösterdi.");
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() + 3);
                }

            } else { // PARCALANMA veya MANDA
                if (secim == 1) {
                    kirmiziYaz("\n*** MANDACILIK ***\n");
                    System.out.println("Amerikan mandası fikri yayıldı. Milli mücadele ruhu zedelendi.");
                    System.out.println("Bağımsızlık karakterinden vazgeçildi.");
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() - 4);
                    indikatorlerCh3.setSubayDestegi(indikatorlerCh3.getSubayDestegi() - 3);
                } else {
                    yesilYaz("\n*** YA İSTİKLAL YA ÖLÜM ***\n");
                    System.out.println("Mandayı reddettiniz. Tek yol savaşıp kazanmak!");
                    indikatorlerCh3.setSubayDestegi(indikatorlerCh3.getSubayDestegi() + 4);
                    indikatorlerCh3.setItilafGucu(indikatorlerCh3.getItilafGucu() - 1); // Direniş başladı
                }
            }

        } else {
            olayMuzigi.durdur();
            throw new ArithmeticException("Lütfen sadece sayı giriniz.");
        }
    }
}