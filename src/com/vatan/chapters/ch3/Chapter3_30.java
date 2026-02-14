package com.vatan.chapters.ch3;

import com.vatan.core.*;
import java.util.Scanner;

public class Chapter3_30 extends Olay<IndikatorlerCh3> {

    public Chapter3_30() {
        super("", new String[]{});
    }

    @Override
    public void oynat(IndikatorlerCh3 indikatorlerCh3) {
        String mevcutYol = indikatorlerCh3.getOyunYolu();
        MuzikKutusu olayMuzigi = new MuzikKutusu();

        if (mevcutYol.equals("TARIHSEL")) {
            this.metin =
                    "Irak Komutanı Halil (Kut) Paşa:\n" +
                            "Enver Paşa, yine seninle bir şeyi konuşmamız lazım. Bu sefer cephemizde işler iyi, Kut'ül Amare'yi kuşattık.\n" +
                            "Ancak şöyle bir ihtimal var: Eğer İngilizler ek bir takviye birlik veya teyyare getirirse işimiz tehlikeye biner.\n" +
                            "Bu yüzden sende eğer kullanılmayan top vs. varsa bize verebilir misin?\n" +
                            "Siz Ruslarla yakın dövüş ediyorsunuz, dağlık arazide top çok etkili olmaz. Biz ise düzlükteyiz, teyyareleri düşürmek için elzemdir.\n";
            this.cevaplar = new String[]{
                    "Paşam, üzgünüm ancak şuan çok sıkışık durumdayız. O toplar bile eski ve dağlık arazide kısmen işlevsiz kalsalar da ihtiyacımız var.",
                    "Olur elbette paşam. Zaten eskiydiler ve dağlık arazide dediğiniz gibi işe yaramıyorlardı. Derhal sevk ediyorum."
            };
            olayMuzigi.oynat("1/Chapter3_30.mp3");

        } else if (mevcutYol.equals("TURAN")) {
            this.metin =
                    "Uygur Türkleri Lideri:\n" +
                            "Ulu Hakan! Ordunuz Tanrı Dağları'na, Çin sınırına dayandı. Kaşgar ve Urumçi'deki kardeşleriniz zulüm altındadır.\n" +
                            "Çinli savaş ağaları bizi kılıçtan geçiriyor. Eğer şimdi sınırdan girerseniz bütün Doğu Türkistan ayaklanır!\n" +
                            "Ancak Çin devleti çok kalabalıktır, bu ejderhayı uyandırırsak ordumuz tükenebilir.\n";
            this.cevaplar = new String[]{
                    "Kanımız bir, canımız bir! Çin Seddi'ne kadar yolu var! Doğu Türkistan'a giriyoruz!",
                    "Duygusal davranamayız. Ordumuz yorgun, Çin ile savaşı kaldıramaz. Sınırdan gizlice silah yardımı yapın ama ordu girmesin."
            };
            olayMuzigi.oynat("2/Chapter3_30.mp3");

        } else if (mevcutYol.equals("CUMHURIYET")) {
            this.metin =
                    "Anayasa Komisyonu Başkanı:\n" +
                            "Paşam, yeni anayasayı yazıyoruz. En büyük tartışma 'Devletin dini' maddesi.\n" +
                            "Eğer 'Devletin dini İslam'dır' ibaresini kaldırırsak (Laiklik), Batı bizi medeni sayar ama halk ve muhafazakarlar ayaklanır.\n" +
                            "Kaldırmazsak devrimlerimiz yarım kalır. Ne yazalım?\n";
            this.cevaplar = new String[]{
                    "Din vicdan işidir, devletin dini olmaz! O maddeyi anayasadan çıkarın. Laik Cumhuriyet kuruluyor!",
                    "Halkı karşımıza almayalım. 'Devletin dini İslam'dır' maddesi şimdilik kalsın. Zamanı gelince değiştiririz."
            };
            olayMuzigi.oynat("3/Chapter3_30.mp3");

        } else if (mevcutYol.equals("SERIAT")) {
            this.metin =
                    "Defterdar Efendi:\n" +
                            "Sultanım, şeriat hükümlerince gayrimüslim tebaadan 'Cizye' (Koruma Vergisi) almamız gerekir.\n" +
                            "Lakin Tanzimat'tan beri bu vergi kalkmıştı. Şimdi geri getirirsek Avrupa devletleri 'Hıristiyanlara zulüm var' diye savaş açabilir.\n" +
                            "Getirmezsek şeriatın hükmünü çiğnemiş oluruz ve hazine bu gelirden mahrum kalır.\n";
            this.cevaplar = new String[]{
                    "Allah'ın emri pazarlık konusu olamaz! Cizye vergisi geri gelecek. Beğenmeyen terk etsin!",
                    "Devletin maslahatı için Cizye adını kullanmayalım. 'Varlık Vergisi' adı altında herkesten eşit alalım."
            };
            olayMuzigi.oynat("4/Chapter3_30.mp3");

        } else if (mevcutYol.equals("PARCALANMA") || mevcutYol.equals("MANDA")) {
            this.metin =
                    "İsmet Paşa (İnönü):\n" +
                            "Paşam, düzenli orduya geçiş sürecinde 'Yeşil Ordu' ve bazı sol gruplar başımıza dert oldu.\n" +
                            "Bunlar 'Biz Bolşevik olacağız, düzenli ordu burjuva işidir' diye askeri zehirliyor.\n" +
                            "Çerkes Ethem de bunlara göz kırpıyor. Ya bunları tasfiye edeceğiz ya da Sovyet yardımını kaybetme pahasına ezeceğiz.\n";
            this.cevaplar = new String[]{
                    "Orduda siyaset olmaz! Yeşil Ordu'yu dağıtın, direneni Divan-ı Harp'e verin. Disiplin şart!",
                    "Rus yardımına muhtacız İsmet. Şimdilik suyuna gidin, savaş bitince hesaplaşırız."
            };
            olayMuzigi.oynat("5/Chapter3_30.mp3");
        }

        soruSor();

        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int secim = sc.nextInt();
            sc.nextLine();
            olayMuzigi.durdur();

            if (mevcutYol.equals("TARIHSEL")) {
                if (secim == 1) {
                    yesilYaz("\n*** KAFKAS KARTALI ***\n");
                    System.out.println("Topları vermedik. Kafkas cephesinde Rus saldırılarını bu toplar sayesinde kırdık.");
                    System.out.println("Lakin Irak'ta Halil Paşa zorlanıyor, İngiliz uçakları askerimizi taciz ediyor.");

                    indikatorlerCh3.setAskerMorali(indikatorlerCh3.getAskerMorali() + 2);
                    indikatorlerCh3.bolgeGuncelle("Irak", -5);
                    indikatorlerCh3.bolgeGuncelle("Kafkas", 5);
                    indikatorlerCh3.setOrduGucu(indikatorlerCh3.getOrduGucu() + 1);
                    indikatorlerCh3.setPadisahDestegi(indikatorlerCh3.getPadisahDestegi() - 1);
                    indikatorlerCh3.setSubayDestegi(indikatorlerCh3.getSubayDestegi() + 2);
                } else {
                    yesilYaz("\n*** KUT'ÜL AMARE AVLARI ***\n");
                    System.out.println("Toplar Irak'a ulaştı. İngiliz teyyareleri düşürüldü, kuşatma çemberi daraldı.");
                    System.out.println("Kafkas cephesinde ise topçu desteği olmadığı için biraz geri çekildik.");

                    indikatorlerCh3.setAskerMorali(indikatorlerCh3.getAskerMorali() - 2);
                    indikatorlerCh3.bolgeGuncelle("Irak", 5);
                    indikatorlerCh3.bolgeGuncelle("Kafkas", -5);
                    indikatorlerCh3.setOrduGucu(indikatorlerCh3.getOrduGucu() - 2);
                    indikatorlerCh3.setPadisahDestegi(indikatorlerCh3.getPadisahDestegi() + 1);
                    indikatorlerCh3.setSubayDestegi(indikatorlerCh3.getSubayDestegi() - 2);
                }

            } else if (mevcutYol.equals("TURAN")) {
                if (secim == 1) {
                    kirmiziYaz("\n*** EJDERHA İLE SAVAŞ ***\n");
                    System.out.println("Çin ordusu sayıca çok üstün. İlk başta ilerlesek de mühimmatımız bitiyor.");
                    System.out.println("Turan ordusu iki ateş arasında (Rusya-Çin) kaldı.");
                    indikatorlerCh3.setOrduGucu(indikatorlerCh3.getOrduGucu() - 3);
                    indikatorlerCh3.setSavasTehlikesi(5);
                } else {
                    yesilYaz("\n*** GİZLİ DİRENİŞ ***\n");
                    System.out.println("Uygurlar gönderdiğimiz silahlarla gerilla savaşı başlattı. Çin'i yıpratıyoruz.");
                    System.out.println("Ordumuz gücünü korudu.");
                    indikatorlerCh3.setOrduGucu(indikatorlerCh3.getOrduGucu() + 1);
                    indikatorlerCh3.setIkmalDurumu(indikatorlerCh3.getIkmalDurumu() + 2);
                }

            } else if (mevcutYol.equals("CUMHURIYET")) {
                if (secim == 1) {
                    yesilYaz("\n*** LAİK CUMHURİYET ***\n");
                    System.out.println("Anayasa kabul edildi. Batı basını 'Türkiye Modernleşiyor' diye manşet atıyor.");
                    System.out.println("İçeride huzursuzluk olsa da devletin yönü netleşti.");
                    indikatorlerCh3.setItilafIliskisi(indikatorlerCh3.getItilafIliskisi() + 3);
                    indikatorlerCh3.setPadisahDestegi(0); // Köprüler atıldı
                } else {
                    yesilYaz("\n*** İDARE-İ MASLAHAT ***\n");
                    System.out.println("Madde kaldı. Muhafazakarlar rahatladı ama devrimciler hayal kırıklığına uğradı.");
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() + 2);
                    indikatorlerCh3.setSubayDestegi(indikatorlerCh3.getSubayDestegi() - 2);
                }

            } else if (mevcutYol.equals("SERIAT")) {
                if (secim == 1) {
                    yesilYaz("\n*** CİZYE KANUNU ***\n");
                    System.out.println("Vergi toplandı, hazine doldu. Ama Avrupa protesto notası çekti.");
                    System.out.println("Gayrimüslimler göç etmeye başladı.");
                    indikatorlerCh3.setIkmalDurumu(indikatorlerCh3.getIkmalDurumu() + 3);
                    indikatorlerCh3.setItilafIliskisi(indikatorlerCh3.getItilafIliskisi() - 4);
                } else {
                    yesilYaz("\n*** MODERN VERGİ ***\n");
                    System.out.println("Kimse rencide edilmeden para toplandı. Ulema mırıldansa da ses çıkarmadı.");
                    indikatorlerCh3.setIkmalDurumu(indikatorlerCh3.getIkmalDurumu() + 2);
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() + 1);
                }

            } else { // PARCALANMA veya MANDA
                if (secim == 1) {
                    yesilYaz("\n*** ORDUDA TEK SES ***\n");
                    System.out.println("Yeşil Ordu dağıtıldı. Ordu tamamen TBMM emrine girdi.");
                    System.out.println("Sovyetler biraz bozulsa da silah göndermeye devam ediyor.");
                    indikatorlerCh3.setOrduGucu(indikatorlerCh3.getOrduGucu() + 2);
                    indikatorlerCh3.setSubayDestegi(indikatorlerCh3.getSubayDestegi() + 3);
                } else {
                    kirmiziYaz("\n*** FİKİR AYRILIĞI ***\n");
                    System.out.println("Ordu içinde siyaset devam ediyor. Emir komuta zinciri zayıf.");
                    indikatorlerCh3.setOrduGucu(indikatorlerCh3.getOrduGucu() - 2);
                }
            }

        } else {
            olayMuzigi.durdur();
            throw new ArithmeticException("Lütfen sadece sayı giriniz.");
        }
    }
}