package com.vatan.chapters.ch3;

import com.vatan.core.*;
import java.util.Scanner;

public class Chapter3_60 extends Olay<IndikatorlerCh3> {

    public Chapter3_60() {
        super("", new String[]{});
    }

    @Override
    public void oynat(IndikatorlerCh3 indikatorlerCh3) {
        String mevcutYol = indikatorlerCh3.getOyunYolu();
        MuzikKutusu olayMuzigi = new MuzikKutusu();

        if (mevcutYol.equals("TARIHSEL")) {
            this.metin =
                    "Enver Paşa (Kendi Kendine - Batum Limanı):\n" +
                            "En iyisi artık Batıdaki işlerimi bırakayım ve ideolojik hedefim olan Türkistan'a yöneleyim.\n" +
                            "Çünkü görünen o ki hem Anadolu kurtuldu sayılır, hem de Mustafa Kemal beni Anadolu'dan men ediyor.\n" +
                            "Ancak aileme, sevgili Naciye'me ve tanıdıklarıma bu mevzuyu nasıl anlatırım? Bu bir veda mektubu olacak...\n";
            this.cevaplar = new String[]{
                    "Sevgili Ailem, üzülerek yazıyorum... Bazı yanlış kararlara vardım. Pişmanım ancak bunu düzeltebilmek için Orta Asya'daki kardeşlerimize desteğe gideceğim. (Pişmanlık)",
                    "Sevgili Ailem, milletimizin ve askerimizin başına gelecekleri düşünemedim. Artık cezamı çekiyorum. Hatamı azaltmak adına Orta Asya'ya gidiyorum. (Helallik)"
            };
            olayMuzigi.oynat("1/Chapter3_60.mp3");

        } else if (mevcutYol.equals("KOMUNIST")) {
            this.metin =
                    "Moskova - Merkez Komite Toplantısı:\n" +
                            "Yoldaş Enver! Kızıl Ordu içindeki eski Çarlık subaylarını temizliyoruz.\n" +
                            "Senin emrindeki Türk birliğinde de eski İttihatçı subaylar var. Bunlar 'Burjuva milliyetçisi' olabilir.\n" +
                            "Sadakatini kanıtlamak için bu subayları ihbar etmeli ve tasfiye etmelisin.\n";
            this.cevaplar = new String[]{
                    "Devrim yolunda babamı bile tanımam! Listeyi veriyorum, hepsini tutuklayın. (Tam İtaat)",
                    "Onlar benim silah arkadaşlarım! Devrime sadıklar. Onları satmam! (Direniş)"
            };
            olayMuzigi.oynat("6/Chapter3_60.mp3");

        } else if (mevcutYol.equals("TURAN")) {
            this.metin =
                    "Turan Başkenti Tartışması:\n" +
                            "Büyük Hakanım! İmparatorluk kuruldu ama başkent neresi olacak?\n" +
                            "İstanbul (Tarihi ve Dini merkez) çok batıda kaldı. Semerkant (Ataların yurdu) çok doğuda.\n" +
                            "Ankara ise stratejik olarak ortada. Kararınız nedir?\n";
            this.cevaplar = new String[]{
                    "Gönlümüzün başkenti Semerkant'tır! Tahtımı Timur'un şehrine kuracağım. Yönümüz Doğu'dur!",
                    "Devletin aklı İstanbul'dur. Payitaht değişmez. Dünya bizi İstanbul'dan tanıyacak."
            };
            olayMuzigi.oynat("2/Chapter3_60.mp3");

        } else if (mevcutYol.equals("CUMHURIYET")) {
            this.metin =
                    "Çankaya Köşkü:\n" +
                            "Paşam, 'Şapka Kanunu' gündemde. Fes, Osmanlı'nın ve geri kalmışlığın sembolü olarak görülüyor.\n" +
                            "Batı medeniyeti gibi 'Şapka' takılmasını zorunlu kılalım mı?\n" +
                            "Halk buna büyük tepki gösterebilir. 'Gavur icadı' diyebilirler.\n";
            this.cevaplar = new String[]{
                    "Kafanın içi değişmedikçe dışı değişse ne olur? Fesi yasaklıyorum, şapka zorunludur! Medeniyet bunu gerektirir.",
                    "Halkı kılık kıyafetle zorlamayalım. İsteyen şapka taksın, isteyen fes. Özgürlük esastır."
            };
            olayMuzigi.oynat("3/Chapter3_60.mp3");

        } else if (mevcutYol.equals("SERIAT")) {
            this.metin =
                    "Matbuat Müdürlüğü:\n" +
                            "Sultanım, gazetelerde ve kitaplarda 'Evrim Teorisi', 'Felsefe' gibi zihni bulandıran fikirler yayılıyor.\n" +
                            "Ulema, bu tür neşriyatın (yayınların) halkın imanını zedelediğini söylüyor.\n" +
                            "Sıkı bir sansür uygulayıp sadece dini kitaplara mı izin verelim?\n";
            this.cevaplar = new String[]{
                    "Zehirli fikirler yasaklansın! Sadece icazet verilen kitaplar basılabilir. Sansür haktır.",
                    "Fikirler yasaklanamaz. Çürütmek için karşı tezler yazdırın. Sansür acizliktir."
            };
            olayMuzigi.oynat("4/Chapter3_60.mp3");

        } else if (mevcutYol.equals("PARCALANMA") || mevcutYol.equals("MANDA")) {
            // BU YOL İÇİN FİNAL SORUSU
            this.metin =
                    "Büyük Taarruz Öncesi (Son Umut):\n" +
                            "Paşam! Ordumuzun yarısı firar etti, cephane yok. Yunan ordusu Afyon'da tahkimat yaptı.\n" +
                            "Ya şimdi 'Ya İstiklal Ya Ölüm' diyip son bir intihar saldırısına kalkacağız,\n" +
                            "Ya da tamamen teslim olup İngiliz mandasını kabul edeceğiz. Son emir?\n";
            this.cevaplar = new String[]{
                    "Ordular! İlk hedefiniz Akdeniz'dir! İleri! (Son Taarruz - Şehadet)",
                    "Bu bir intihardır Paşam. Daha fazla kan dökülmesin. Beyaz bayrak çekin. (Teslimiyet - Sürgün)"
            };
            olayMuzigi.oynat("5/Chapter3_60.mp3");
        }

        soruSor();

        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int secim = sc.nextInt();
            sc.nextLine();
            olayMuzigi.durdur();

            if (mevcutYol.equals("TARIHSEL")) {
                if (secim == 1) {
                    yesilYaz("\n*** HÜZÜNLÜ VEDA ***\n");
                    System.out.println("Mektubu gözyaşlarıyla mühürlediniz. Aileniz sizi affetti ama yürekleri burkuldu.");
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() + 3);
                    indikatorlerCh3.setSubayDestegi(indikatorlerCh3.getSubayDestegi() + 3);
                } else {
                    yesilYaz("\n*** FEDAKAR KOMUTAN ***\n");
                    System.out.println("Kendinizi feda ederek yazdığınız bu mektup elden ele dolaştı.");
                    indikatorlerCh3.setAskerMorali(indikatorlerCh3.getAskerMorali() + 2);
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() + 5);
                    indikatorlerCh3.setSubayDestegi(indikatorlerCh3.getSubayDestegi() + 3);
                }

            } else if (mevcutYol.equals("KOMUNIST")) {
                if (secim == 1) {
                    kirmiziYaz("\n*** KIZIL TEMİZLİK ***\n");
                    System.out.println("Eski dostlarınızı kendi elinizle idama gönderdiniz. Stalin size madalya taktı.");
                    indikatorlerCh3.setIttifakIliskisi(indikatorlerCh3.getIttifakIliskisi() + 5);
                    indikatorlerCh3.setSubayDestegi(0);
                } else {
                    yesilYaz("\n*** ONURLU DURUŞ ***\n");
                    System.out.println("Subaylarınızı korudunuz. Moskova size diş biliyor ama birliğiniz size tapıyor.");
                    indikatorlerCh3.setAskerMorali(indikatorlerCh3.getAskerMorali() + 3);
                    indikatorlerCh3.setSavasTehlikesi(indikatorlerCh3.getSavasTehlikesi() + 2);
                }

            } else if (mevcutYol.equals("TURAN")) {
                if (secim == 1) {
                    yesilYaz("\n*** TİMUR'UN MİRASI ***\n");
                    System.out.println("Semerkant başkent oldu. Asya halkları coşku içinde.");
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() + 3);
                } else {
                    yesilYaz("\n*** PAYİTAHT ***\n");
                    System.out.println("İstanbul'un ihtişamı korundu. Devletin ağırlığı hissediliyor.");
                    indikatorlerCh3.setSubayDestegi(indikatorlerCh3.getSubayDestegi() + 2);
                }

            } else if (mevcutYol.equals("CUMHURIYET")) {
                if (secim == 1) {
                    yesilYaz("\n*** KILIK KIYAFET DEVRİMİ ***\n");
                    System.out.println("Fes atıldı, şapka geldi. Sokaklar modernleşti ama Rize'de isyan çıktı.");
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() - 2);
                    indikatorlerCh3.setItilafIliskisi(indikatorlerCh3.getItilafIliskisi() + 3);
                } else {
                    kirmiziYaz("\n*** ÇOK BAŞLILIK ***\n");
                    System.out.println("Kimisi sarıklı kimisi şapkalı. Devrim yarım kaldı.");
                    indikatorlerCh3.setSubayDestegi(indikatorlerCh3.getSubayDestegi() - 1);
                }

            } else if (mevcutYol.equals("SERIAT")) {
                if (secim == 1) {
                    kirmiziYaz("\n*** KARANLIK ÇAĞ ***\n");
                    System.out.println("Kitaplar yakıldı. Bilim adamları ülkeyi terk etti. Cehalet kutsandı.");
                    indikatorlerCh3.setIkmalDurumu(indikatorlerCh3.getIkmalDurumu() - 5);
                } else {
                    yesilYaz("\n*** FİKİR HÜRRİYETİ ***\n");
                    System.out.println("Fikirler tartışılıyor. İslam alimleri de kendilerini geliştiriyor.");
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() + 2);
                }

            } else { // PARCALANMA veya MANDA - BURADA OYUN BİTİYOR
                if (secim == 1) {
                    kirmiziYaz("\n*** SON TAARRUZ VE ŞEHADET ***\n");
                    System.out.println("Enver Paşa, kalan son birliğiyle Yunan siperlerine intihar saldırısı düzenledi.");
                    System.out.println("Vücuduna isabet eden şarapnel parçalarıyla Afyon ovasında şehit düştü.");
                    System.out.println("Bir imparatorluk, bir komutanla beraber toprağa gömüldü.");
                    System.out.println("\n--- OYUN SONU (Şerefli Ölüm) ---");

                    // OYUNU BİTİR
                    indikatorlerCh3.setOyunDevamEdiyor(false);

                } else {
                    kirmiziYaz("\n*** İNGİLİZ GEMİSİ VE SÜRGÜN ***\n");
                    System.out.println("Teslim bayrağı çekildi. Gece yarısı İngiliz zırhlısına binip ülkeyi terk ettiniz.");
                    System.out.println("Arkanızda işgal edilmiş, umutsuz bir vatan bıraktınız.");
                    System.out.println("Sürgünde, vatan hasretiyle ve vicdan azabıyla vefat ettiniz.");
                    System.out.println("\n--- OYUN SONU (Hazin Son) ---");

                    // OYUNU BİTİR
                    indikatorlerCh3.setOyunDevamEdiyor(false);
                }
            }

        } else {
            olayMuzigi.durdur();
            throw new ArithmeticException("Lütfen sadece sayı giriniz.");
        }
    }
}