package com.vatan.chapters.ch3;

import com.vatan.core.*;
import java.util.Scanner;

public class Chapter3_45 extends Olay<IndikatorlerCh3> {

    public Chapter3_45() {
        super("", new String[]{});
    }

    @Override
    public void oynat(IndikatorlerCh3 indikatorlerCh3) {
        String mevcutYol = indikatorlerCh3.getOyunYolu();
        MuzikKutusu olayMuzigi = new MuzikKutusu();

        if (mevcutYol.equals("TARIHSEL")) {
            this.metin =
                    "Cemal Paşa:\n" +
                            "Enver Paşa, asırlardır Müslüman kardeşimiz dediğimiz Araplar bu sefer bizi sırtımızdan bıçakladı.\n" +
                            "Şerif Hüseyin ve adamları İngilizlerle anlaşmışlar ve bize karşı Şam üzerinden bir saldırıya hazırlandıklarını muhbirlerimizden öğrendim.\n" +
                            "Onlara karşı acil bir önlem almamız lazım.\n";
            this.cevaplar = new String[]{
                    "Bu Şerif Hüseyin'e karşı alabileceğimiz en mantıklı önlem halkı ona karşı kışkırtmak. Onun adamları kılığında muhbirlerimiz halkın malına zarar versin. (Kirli Harp)",
                    "Şam'a denizden veya Doğudan saldırabilirler. Kıyıya topçu yerleştirin, Doğu'ya ise derhal mayın döşeyin. (Askeri Savunma)"
            };
            olayMuzigi.oynat("1/Chapter3_45.mp3"); // Müzik güncellendi

        } else if (mevcutYol.equals("TURAN")) {
            this.metin =
                    "Kırgız Beyi:\n" +
                            "Ulu Hakan! Ordunun ana gövdesi Çin'deyken, arkamızda kalan Kazak ve Kırgız bozkırlarında isyan çıktı.\n" +
                            "Halk 'Sürekli seferdeyiz, hayvanlarımız telef oldu, vergiler ağır' diye başkaldırdı.\n" +
                            "İsyanı bastırmak için cepheden seçkin birlikleri geri mi çağıralım, yoksa yerel aşiretleri birbirine mi kırdıralım?\n";
            this.cevaplar = new String[]{
                    "Cephe zayıflayamaz! Aşiretleri birbirine düşürün. 'İsyanı bastırana toprak vereceğim' deyin.",
                    "İçimiz yanarken dışarıyı fethedemeyiz. Muhafız alayını geri gönderin, isyanı bizzat ezin."
            };
            olayMuzigi.oynat("2/Chapter3_45.mp3");

        } else if (mevcutYol.equals("CUMHURIYET")) {
            this.metin =
                    "Hataylı Temsilciler:\n" +
                            "Paşam! Fransız mandası altındaki Antakya ve İskenderun'da Türkler zulüm görüyor.\n" +
                            "Suriye devleti kurulma aşamasında, eğer şimdi müdahale etmezsek Hatay ebediyen Arap toprağı olacak.\n" +
                            "Fransa ile yeni bir savaşı göze alıp sınırdan içeri girelim mi (Tayfur Sökmen Planı)?\n";
            this.cevaplar = new String[]{
                    "Hatay benim şahsi meselemdir! Ordu sınıra yığılsın. Gerekirse Fransa ile savaşırız!",
                    "Henüz hazır değiliz. Diplomatik baskı yapalım, Milletler Cemiyeti'ne başvuralım. Savaş riskli."
            };
            olayMuzigi.oynat("3/Chapter3_45.mp3");

        } else if (mevcutYol.equals("SERIAT")) {
            this.metin =
                    "Sıhhiye Reisi:\n" +
                            "Sultanım, cephe gerisinde binlerce yaralı var ama erkek doktor yetişmiyor.\n" +
                            "Kadınların hemşire olarak çalışmasına izin verirseniz ölümleri azaltabiliriz.\n" +
                            "Lakin bu durum 'Haremlik-Selamlık' kuralını bozar. Kadın eli namahreme değecek.\n";
            this.cevaplar = new String[]{
                    "Zaruretler mahzurları mübah kılar! Kadınlar hemşire olacak. Askerin canı namustan önce gelir.",
                    "Şeriat çiğnenemez! Kadınlar evinde otursun. Yaralılar kaderine razı olsun."
            };
            olayMuzigi.oynat("4/Chapter3_45.mp3");

        } else if (mevcutYol.equals("PARCALANMA") || mevcutYol.equals("MANDA")) {
            this.metin =
                    "Batı Cephesi Komutanlığı:\n" +
                            "Paşam, Yunan ordusu kaçarken geçtiği her köyü, kasabayı yakıyor. Manisa ve Uşak alevler içinde.\n" +
                            "Halkı kurtarmak için ordunun düzenini bozup, yorgun askerle 'Yıldırım Takibi' yapmamız lazım.\n" +
                            "Bu taktik orduyu pusuya düşürebilir ama yapmazsak binlerce sivil yanarak ölecek.\n";
            this.cevaplar = new String[]{
                    "Vatandaş yanarken asker duramaz! Düzen bozulsa da koşun! Yetişin!",
                    "Ordunun güvenliği esastır. Temkinli ilerleyin. Sivil kayıplar savaşın acı gerçeğidir."
            };
            olayMuzigi.oynat("5/Chapter3_45.mp3");
        }

        // DİKKAT: KOMÜNİST YOL HENÜZ AÇIK OLMADIĞI İÇİN BURADA YER ALMIYOR.
        // EĞER OYUNCU 55. SORUDA KOMÜNİST YOLU SEÇERSE, O ZAMAN BU TÜR SORULAR KARŞISINA ÇIKACAK.

        soruSor();

        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int secim = sc.nextInt();
            sc.nextLine();
            olayMuzigi.durdur();

            if (mevcutYol.equals("TARIHSEL")) {
                if (secim == 1) {
                    kirmiziYaz("\n*** KARANLIK OYUN ***\n");
                    System.out.println("Plan tuttu. Şam halkı Şerif Hüseyin'e lanet okudu ve destek vermedi.");
                    System.out.println("Ancak bu taktik Padişah ve onurlu subaylar tarafından 'Eşkıyalık' olarak görüldü.");

                    indikatorlerCh3.setAskerMorali(indikatorlerCh3.getAskerMorali() - 2);
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() + 4);
                    indikatorlerCh3.setItilafGucu(indikatorlerCh3.getItilafGucu() - 3);
                    indikatorlerCh3.setSubayDestegi(indikatorlerCh3.getSubayDestegi() + 1);
                    indikatorlerCh3.bolgeGuncelle("Suriye", 5);
                    indikatorlerCh3.setPadisahDestegi(indikatorlerCh3.getPadisahDestegi() - 5);
                } else {
                    yesilYaz("\n*** MAYIN TARLASI ***\n");
                    System.out.println("İngiliz süvarileri ve Arap isyancılar mayın tarlasına daldı!");
                    System.out.println("Büyük bir imha gerçekleşti. Şam savunması çelik gibi duruyor.");

                    indikatorlerCh3.setAskerMorali(indikatorlerCh3.getAskerMorali() + 3);
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() - 3);
                    indikatorlerCh3.setItilafGucu(indikatorlerCh3.getItilafGucu() - 4);
                    indikatorlerCh3.setSubayDestegi(indikatorlerCh3.getSubayDestegi() + 3);
                    indikatorlerCh3.setOrduGucu(indikatorlerCh3.getOrduGucu() + 2);
                    indikatorlerCh3.bolgeGuncelle("Suriye", 5);
                    indikatorlerCh3.setPadisahDestegi(indikatorlerCh3.getPadisahDestegi() + 3);
                }

            } else if (mevcutYol.equals("TURAN")) {
                if (secim == 1) {
                    yesilYaz("\n*** KURT KANI ***\n");
                    System.out.println("Aşiretler birbirini kırdı. İsyan bitti ama kardeş kanı döküldü.");
                    indikatorlerCh3.setOrduGucu(indikatorlerCh3.getOrduGucu() + 1);
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() - 3);
                } else {
                    kirmiziYaz("\n*** CEPHE ZAYIFLADI ***\n");
                    System.out.println("Muhafızlar gidince Çin cephesinde açık verdik. Düşman sızıyor.");
                    indikatorlerCh3.setOrduGucu(indikatorlerCh3.getOrduGucu() - 3);
                }

            } else if (mevcutYol.equals("CUMHURIYET")) {
                if (secim == 1) {
                    yesilYaz("\n*** HATAY BİZİMDİR ***\n");
                    System.out.println("Ordu sınıra yığıldı. Fransa korkup masaya oturdu.");
                    System.out.println("Hatay Cumhuriyeti kuruldu, ilhak yakın.");
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() + 4);
                    indikatorlerCh3.setSavasTehlikesi(indikatorlerCh3.getSavasTehlikesi() + 2);
                } else {
                    kirmiziYaz("\n*** OYALAMA TAKTİĞİ ***\n");
                    System.out.println("Fransa süreci uzatıyor. Hatay'da Türk nüfus baskı altında.");
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() - 2);
                }

            } else if (mevcutYol.equals("SERIAT")) {
                if (secim == 1) {
                    yesilYaz("\n*** ŞİFA ELLERİ ***\n");
                    System.out.println("Kadınlar cephe gerisinde mucizeler yarattı. Ölüm oranı düştü.");
                    indikatorlerCh3.setOrduGucu(indikatorlerCh3.getOrduGucu() + 3);
                } else {
                    kirmiziYaz("\n*** NAMUS VE ÖLÜM ***\n");
                    System.out.println("Yaralılar bakımsızlıktan öldü. Ordu eriyor.");
                    indikatorlerCh3.setOrduGucu(indikatorlerCh3.getOrduGucu() - 4);
                }

            } else { // PARCALANMA veya MANDA
                if (secim == 1) {
                    yesilYaz("\n*** VİCDANIN ZAFERİ ***\n");
                    System.out.println("Asker insanüstü bir gayretle yetişti. Yangınlar söndürüldü, siviller kurtarıldı.");
                    System.out.println("Halk orduya minnettar.");
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() + 5);
                    indikatorlerCh3.setOrduGucu(indikatorlerCh3.getOrduGucu() - 2);
                } else {
                    kirmiziYaz("\n*** KÜLLERİN ARASINDA ***\n");
                    System.out.println("Şehirler yandı. Halk 'Ordu bizi korumadı' diye ağlıyor.");
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() - 4);
                    indikatorlerCh3.setOrduGucu(indikatorlerCh3.getOrduGucu() + 1);
                }
            }

        } else {
            olayMuzigi.durdur();
            throw new ArithmeticException("Lütfen sadece sayı giriniz.");
        }
    }
}