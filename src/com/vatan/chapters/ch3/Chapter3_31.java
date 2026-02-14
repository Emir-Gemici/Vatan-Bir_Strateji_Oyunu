package com.vatan.chapters.ch3;

import com.vatan.core.*;
import java.util.Scanner;
import java.util.Random;


public class Chapter3_31 extends Olay<IndikatorlerCh3> {

    public Chapter3_31() {
        super("", new String[]{});
    }

    @Override
    public void oynat(IndikatorlerCh3 indikatorlerCh3) {
        String mevcutYol = indikatorlerCh3.getOyunYolu();
        MuzikKutusu olayMuzigi = new MuzikKutusu();

        if (mevcutYol.equals("TARIHSEL")) {
            this.metin =
                    "Çanakkale Kara Ordular Komutanı Liman von Sanders:\n" +
                            "Enver Paşa hazretleri, size esefle bildirmek isterim ki İngiliz kuvvetleri Gelibolu'ya Limni üzerinden çıkarma yapmışlar ve ilerlemektedirler.\n" +
                            "Sahaya üniversite öğrencilerine varasıya kadar sürülen askerimizin müdafaası takdire şayan,\n" +
                            "Ancak burada yapılacak en küçük hata, Osmanlı Devleti'ni tarihe karıştırır.\n";
            this.cevaplar = new String[]{
                    "Doğru paşa. Padişah Efendimizi ve Payitaht'ı müdafaa edebilmek için buraya diğer cephelerden takviyeler şart.",
                    "Liman Paşa! Diğer cepheleri boşaltırsak Ruslar ve İngilizler bizi kıskaca alır. Mevcut birliklerle ve Mustafa Kemal Bey'in inisiyatifiyle direnin! Size güveniyorum."
            };
            olayMuzigi.oynat("1/Chapter3_31.mp3");

        } else if (mevcutYol.equals("TURAN")) {
            this.metin =
                    "Öncü Birlikler Komutanı:\n" +
                            "Ulu Hakan! Karşımızda insan yapısı en büyük engel duruyor: Çin Seddi!\n" +
                            "Çin ordusu seddin kapılarını kapatmış, surların üzerinden ok ve kurşun yağdırıyor.\n" +
                            "Surları topla dövüp yıkabiliriz ama bu çok zaman alır ve cephanemizi tüketir.\n" +
                            "Ya da eski bir Türk taktiği ile gece yarısı sızma harekatı yapıp kapıları içeriden açacağız. Ama yakalanırsak öncülerimiz kılıçtan geçirilir.\n";
            this.cevaplar = new String[]{
                    "Balyoz gibi ineceksiniz! Topçular ateş serbest! O duvarlar Türk'e engel olamaz, yıkın geçin!",
                    "Kurt kapanı kuracağız. Gece sızma harekatı yapın. Sessizce kapıları açın, ejderhayı uykusunda avlayalım."
            };
            olayMuzigi.oynat("2/Chapter3_31.mp3");

        } else if (mevcutYol.equals("CUMHURIYET")) {
            this.metin =
                    "Adliye Vekili:\n" +
                            "Paşam, devrimlere karşı çıkan yobazlar ve eski rejimin adamları örgütleniyor.\n" +
                            "Normal mahkemeler delil yetersizliğinden bunları serbest bırakıyor veya süreç çok uzuyor.\n" +
                            "Devrimin bekası için olağanüstü yetkilere sahip 'İstiklal Mahkemeleri'ni kuralım. Kararları kesin olsun, temyizi olmasın.\n" +
                            "Batı buna 'diktatörlük' diyecektir.\n";
            this.cevaplar = new String[]{
                    "İnkılap kanla yazılır! İstiklal Mahkemeleri kurulsun. Vatana ihanetin bedeli idamdır!",
                    "Hukuktan ayrılmayalım. Normal mahkemelere savcı takviyesi yapın. Batı'ya 'biz hukuk devletiyiz' demeliyiz."
            };
            olayMuzigi.oynat("3/Chapter3_31.mp3");

        } else if (mevcutYol.equals("SERIAT")) {
            this.metin =
                    "Şeyhülislam Efendi:\n" +
                            "Emir'ül Müminin, sokaklarda ahlak bozuldu. Kadınlar ve erkekler haremlik-selamlığa dikkat etmiyor.\n" +
                            "Batı tarzı eğlenceler artıyor. Şeriatın tam tatbiki için 'Emri Bil Maruf' (İyiliği Emretme) teşkilatı, yani Ahlak Zabıtası kurmalıyız.\n" +
                            "Bu zabıtalar sokakta namaz kılmayanı, açık gezeni uyaracak veya cezalandıracak.\n";
            this.cevaplar = new String[]{
                    "Allah'ın nizamı sokakta da hakim olacak! Ahlak Zabıtası kurulsun, neşter vurulsun!",
                    "İman gönül işidir zorla olmaz hocam. Halkı dinden soğutmayalım. Vaaz ve nasihatle yetinelim."
            };
            olayMuzigi.oynat("4/Chapter3_31.mp3");

        } else if (mevcutYol.equals("PARCALANMA") || mevcutYol.equals("MANDA")) {
            this.metin =
                    "İsmet Paşa (İnönü) - Kütahya Cephesi:\n" +
                            "Paşam! Yunan ordusu çok büyük bir kuvvetle taarruza geçti. Cephe yarıldı yarılacak.\n" +
                            "Eğer yerimizde durursak ordumuz kuşatılıp imha edilecek.\n" +
                            "Tek çare var: Sakarya Nehri'nin doğusuna çekilmek. Ama bu; Eskişehir, Kütahya ve Afyon'u düşmana bırakmak demek!\n" +
                            "Meclis bizi asabilir ama orduyu kurtarmalıyız.\n";
            this.cevaplar = new String[]{
                    "Ordu yoksa vatan da yok! Çekilin İsmet! Toprak kaybedelim ama askeri kurtaralım. Sorumluluk bende.",
                    "Asla! Bir karış toprak verilemez. Son nefer ölene kadar mevzilerde kalınacak. Ölmek var dönmek yok!"
            };
            olayMuzigi.oynat("5/Chapter3_31.mp3");
        }

        soruSor();

        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int secim = sc.nextInt();
            sc.nextLine();
            olayMuzigi.durdur();

            if (mevcutYol.equals("TARIHSEL")) {
                if (secim == 1) {
                    yesilYaz("\n*** PAYİTAHT KURTULDU AMA... ***\n");
                    System.out.println("Takviye birlikler geldi, Çanakkale geçilmedi. İngilizler sahillere çakıldı.");
                    System.out.println("Fakat Irak ve Kafkasya'dan çekilen askerler yüzünden o cephelerde büyük gedikler açıldı.");

                    indikatorlerCh3.setOrduGucu(indikatorlerCh3.getOrduGucu() - 2); // Genel yorgunluk
                    indikatorlerCh3.setPadisahDestegi(indikatorlerCh3.getPadisahDestegi() + 1);
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() + 1);
                    indikatorlerCh3.setIkmalDurumu(indikatorlerCh3.getIkmalDurumu() - 3); // Lojistik felç
                    indikatorlerCh3.bolgeGuncelle("Canakkale", 15);
                    indikatorlerCh3.bolgeGuncelle("Kafkas", -10); // Bedeli ağır oldu
                    indikatorlerCh3.bolgeGuncelle("Irak", -5);
                } else {
                    kirmiziYaz("\n*** MUSTAFA KEMAL'İN SAHNESİ ***\n");
                    System.out.println("Takviye göndermediniz. Yarbay Mustafa Kemal, inisiyatif alıp 'Ben size ölmeyi emrediyorum' dedi.");
                    System.out.println("Cephe mucizevi bir şekilde tutuldu ama çok şehit verdik. Diğer cepheler ise gücünü korudu.");

                    indikatorlerCh3.setOrduGucu(indikatorlerCh3.getOrduGucu() - 1);
                    indikatorlerCh3.bolgeGuncelle("Canakkale", 5); // Zar zor tutuldu
                    indikatorlerCh3.bolgeGuncelle("Kafkas", 5); // Asker çekilmediği için korundu
                    indikatorlerCh3.bolgeGuncelle("Irak", 5);
                    indikatorlerCh3.setSubayDestegi(indikatorlerCh3.getSubayDestegi() + 2); // Yerel komutana güven
                }

            } else if (mevcutYol.equals("TURAN")) {
                if (secim == 1) {
                    yesilYaz("\n*** SEDDİN YIKILIŞI ***\n");
                    System.out.println("Toplarımız Çin Seddi'nde gedikler açtı. Ordu sel gibi içeri aktı.");
                    System.out.println("Tarihi bir an! Ama cephanemiz ciddi oranda azaldı.");
                    indikatorlerCh3.setOrduGucu(indikatorlerCh3.getOrduGucu() + 2); // Moral yüksek
                    indikatorlerCh3.setIkmalDurumu(indikatorlerCh3.getIkmalDurumu() - 4);
                    indikatorlerCh3.setSavasTehlikesi(indikatorlerCh3.getSavasTehlikesi() + 1);
                } else {
                    Random zar = new Random();
                    if (zar.nextInt(100) < 50) {
                        yesilYaz("\n*** GECE BASKINI ***\n");
                        System.out.println("Sızma başarılı! Kapılar açıldı, Çin ordusu uykusunda gafil avlandı.");
                        System.out.println("En az zaiyatla geçtik.");
                        indikatorlerCh3.setOrduGucu(indikatorlerCh3.getOrduGucu() + 4);
                    } else {
                        kirmiziYaz("\n*** TUZAK ***\n");
                        System.out.println("Öncü birliklerimiz fark edildi ve katledildi. Sur önünde kaldık.");
                        indikatorlerCh3.setOrduGucu(indikatorlerCh3.getOrduGucu() - 3);
                        indikatorlerCh3.setSubayDestegi(indikatorlerCh3.getSubayDestegi() - 2);
                    }
                }

            } else if (mevcutYol.equals("CUMHURIYET")) {
                if (secim == 1) {
                    yesilYaz("\n*** İSTİKLAL MAHKEMELERİ ***\n");
                    System.out.println("Mahkemeler kuruldu, darağaçları hazırlandı. İsyanlar bıçak gibi kesildi.");
                    System.out.println("Korku hakim ama düzen sağlandı.");
                    indikatorlerCh3.setSavasTehlikesi(indikatorlerCh3.getSavasTehlikesi() - 2); // İç savaş riski azaldı
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() - 3); // Halk korkuyor
                    indikatorlerCh3.setItilafIliskisi(indikatorlerCh3.getItilafIliskisi() - 2);
                } else {
                    kirmiziYaz("\n*** YARGI KRİZİ ***\n");
                    System.out.println("Hukuk yavaş işliyor. Suçlular serbest kalıp tekrar örgütleniyor.");
                    System.out.println("Devrim tehlikede.");
                    indikatorlerCh3.setSavasTehlikesi(indikatorlerCh3.getSavasTehlikesi() + 2);
                    indikatorlerCh3.setSubayDestegi(indikatorlerCh3.getSubayDestegi() - 2);
                }

            } else if (mevcutYol.equals("SERIAT")) {
                if (secim == 1) {
                    yesilYaz("\n*** AHLAK ZABITASI ***\n");
                    System.out.println("Sokaklar kontrol altına alındı. Dindarlar memnun.");
                    System.out.println("Gençler ve modern kesim ise gizli gizli tepki duyuyor.");
                    indikatorlerCh3.setPadisahDestegi(indikatorlerCh3.getPadisahDestegi() + 3);
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() - 2);
                } else {
                    yesilYaz("\n*** HOŞGÖRÜ İKLİMİ ***\n");
                    System.out.println("Baskı yapmadık. Halk devlete daha çok ısındı.");
                    System.out.println("Ancak radikaller sizi 'gevşek' olmakla suçluyor.");
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() + 2);
                    indikatorlerCh3.setSubayDestegi(indikatorlerCh3.getSubayDestegi() - 1);
                }

            } else { // PARCALANMA veya MANDA
                if (secim == 1) {
                    kirmiziYaz("\n*** BÜYÜK GERİ ÇEKİLİŞ ***\n");
                    System.out.println("Eskişehir ve Kütahya düştü. Halk yollara döküldü.");
                    System.out.println("Meclis'te kıyamet kopuyor: 'Ordu nerede?' diye bağırıyorlar.");
                    System.out.println("Ama ordu imha olmaktan kurtuldu, Sakarya gerisinde toplanıyor.");
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() - 10); // Büyük moral çöküntüsü
                    indikatorlerCh3.setOrduGucu(indikatorlerCh3.getOrduGucu() + 3); // Orduyu koruduk
                    indikatorlerCh3.setSubayDestegi(indikatorlerCh3.getSubayDestegi() + 2); // Subaylar stratejiyi anladı
                } else {
                    kirmiziYaz("\n*** KÜTAHYA FELAKETİ ***\n");
                    System.out.println("Çekilmedik. Yunan ordusu kanatlarımızdan kuşattı.");
                    System.out.println("Büyük kayıplar vererek düzensizce kaçıyoruz. Ordu dağılmak üzere!");
                    indikatorlerCh3.setOrduGucu(indikatorlerCh3.getOrduGucu() - 8);
                    indikatorlerCh3.setSavasTehlikesi(5);
                }
            }

        } else {
            olayMuzigi.durdur();
            throw new ArithmeticException("Lütfen sadece sayı giriniz.");
        }
    }
}