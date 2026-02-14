package com.vatan.chapters.ch3;

import com.vatan.core.*;
import java.util.Scanner;

public class Chapter3_58 extends Olay<IndikatorlerCh3> {

    public Chapter3_58() {
        super("", new String[]{});
    }

    @Override
    public void oynat(IndikatorlerCh3 indikatorlerCh3) {
        String mevcutYol = indikatorlerCh3.getOyunYolu();
        MuzikKutusu olayMuzigi = new MuzikKutusu();

        if (mevcutYol.equals("TARIHSEL")) {
            this.metin =
                    "Mustafa Kemal Paşa'dan Mektup (Batum'a Ulaşan Telgraf):\n" +
                            "Enver Paşa hazretleri, umarım istirahatın yerindedir. Çünkü daha çok istirahat edeceksin.\n" +
                            "Artık hiç kusura kalma ancak Anadolu'ya girmen kesinlikle yasaklanmıştır!\n" +
                            "Bir daha seni bu topraklarda görürsek, TBMM hükümeti olarak seni cezalandırırız. Yoluna git!\n";
            this.cevaplar = new String[]{
                    "Olamaz... Mustafa Kemal, demek öyle ha. Öyle diyorsun madem öyle olsun... O zaman biz de yönümüzü Orta Asya'ya çeviririz madem siz bizi Anadolu'da istemiyorsanız. (Türkistan Yolcusu)",
                    "Ben bu yasağı dinlemem! Söz konusu vatansa yasak bizim için hiçbir şeydir! Sınırdan zorla gireceğim! (İnatçı Tavır)"
            };
            olayMuzigi.oynat("1/Chapter3_58.mp3");

        } else if (mevcutYol.equals("KOMUNIST")) {
            this.metin =
                    "Mirsaid Sultan Galiyev (Tatar Bolşevik Lider):\n" +
                            "Yoldaş Enver! Stalin ve Ruslar bizi kullanıyor. Onlar için 'Halkların Kardeşliği' sadece Rus egemenliği demektir.\n" +
                            "Gel seninle gizlice 'Turan Sosyalist Cumhuriyeti'ni kuralım. Müslüman halkları Moskova'dan koparalım.\n" +
                            "Bu 'Milli Komünizm'dir. Stalin duyarsa ikimizi de asar. Var mısın?\n";
            this.cevaplar = new String[]{
                    "Haklısın Galiyev! Rus'un kızılı da beyazı da aynıdır. Gizli örgütlenmeyi başlatalım. (Milli Komünizm)",
                    "Bu intihardır! Stalin çok güçlü. Davaya ihanet etme Galiyev. Moskova'ya sadık kalalım. (Stalinist Çizgi)"
            };
            olayMuzigi.oynat("6/Chapter3_58.mp3");

        } else if (mevcutYol.equals("TURAN")) {
            this.metin =
                    "Hazine-i Hümayun:\n" +
                            "Ulu Hakan! Sınırlarımız genişledi ama her bölgede farklı para kullanılıyor.\n" +
                            "Çin'de Yuan, İran'da Tümen, Anadolu'da Lira geçiyor. Ticaret aksıyor.\n" +
                            "Üzerinde resminizin olduğu ortak 'Turan Akçesi'ni bastıralım mı? Bu, yerel ekonomileri sarsabilir.\n";
            this.cevaplar = new String[]{
                    "Tek Devlet, Tek Para! Turan Akçesi basılsın. Eski paraları toplayıp eritin!",
                    "Ekonomiyi ürkütmeyelim. Şimdilik yerel paralar geçerli kalsın. Geçişi zamana yayalım."
            };
            olayMuzigi.oynat("2/Chapter3_58.mp3");

        } else if (mevcutYol.equals("CUMHURIYET")) {
            this.metin =
                    "Adalet Bakanı:\n" +
                            "Paşam, Cumhuriyet ilan edildi ama Osmanlı Hanedanı üyeleri hala İstanbul'da.\n" +
                            "Bazı çevreler hala şehzadeler üzerinden saltanat rüyası görüyor.\n" +
                            "Hanedan'ın tüm üyelerini (kadın-erkek) vatandaşlıktan çıkarıp yurt dışına sürgün edelim mi?\n";
            this.cevaplar = new String[]{
                    "Acı ama gerekli. Hepsini sürgün edin! Cumhuriyetin gölgesinde saltanat bırakılamaz.",
                    "Suç şahsidir. Kadınlara ve siyasete karışmamış şehzadelere dokunmayın. Sürgün zalimce olur."
            };
            olayMuzigi.oynat("3/Chapter3_58.mp3");

        } else if (mevcutYol.equals("SERIAT")) {
            this.metin =
                    "Şeyhülislam:\n" +
                            "Sultanım, Tekke ve Zaviyeler kontrolsüzce çoğaldı. Bazı şeyhler kendilerini 'Mehdi' ilan ediyor.\n" +
                            "Halkı sömüren bu sahte dervişleri engellemek için Tekkeleri devlet denetimine alalım mı?\n" +
                            "Yoksa 'Tasavvuf özgürdür' diyip karışmayalım mı?\n";
            this.cevaplar = new String[]{
                    "Din tüccarlarına geçit yok! Tüm tekkeler denetlenecek, sapkınlar kapatılacak!",
                    "İlim ve zikir meclislerine devlet karışmaz. Kapatırsak halk ayaklanır."
            };
            olayMuzigi.oynat("4/Chapter3_58.mp3");

        } else if (mevcutYol.equals("PARCALANMA") || mevcutYol.equals("MANDA")) {
            this.metin =
                    "Karadeniz Bölgesi (Merkez Ordusu Komutanı Nurettin Paşa):\n" +
                            "Paşam! Pontus Rum çeteleri köyleri yakıp yıkıyor. İngilizler müdahale etmememiz için baskı yapıyor.\n" +
                            "Düzenli orduyla değil, 'Topal Osman' gibi milis güçleriyle bunları temizleyelim mi?\n" +
                            "Bu yöntem biraz sert ve kanlı olabilir ama kesin çözümdür.\n";
            this.cevaplar = new String[]{
                    "Vurun! Topal Osman'a yetki verin. Karadeniz'de bir tane eşkıya kalmasın!",
                    "Düzenli ordu varken çetecilere iş yaptırmayalım. Hukuk dairesinde kalalım."
            };
            olayMuzigi.oynat("5/Chapter3_58.mp3");
        }

        soruSor();

        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int secim = sc.nextInt();
            sc.nextLine();
            olayMuzigi.durdur();

            if (mevcutYol.equals("TARIHSEL")) {
                if (secim == 1) {
                    yesilYaz("\n*** KIZIL ELMA'YA DÖNÜŞ ***\n");
                    System.out.println("Gözyaşları içinde Anadolu'ya veda ettiniz. 'Vatan sağ olsun' dediniz.");
                    System.out.println("Geminin burnu Batum'dan Türkistan'a döndü. Artık hedef Buhara!");

                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() - 2); // Anadolu halkı sizi bekliyordu
                    indikatorlerCh3.setBolgePuan("Kafkas", 0); // Kafkasya defteri kapandı
                } else {
                    kirmiziYaz("\n*** İSTENMEYEN ADAM ***\n");
                    System.out.println("Sınıra dayandınız ama kendi askeriniz size silah doğrulttu.");
                    System.out.println("Mustafa Kemal'in emri kesindi. İçeri giremediniz, onurunuz zedelendi.");
                    System.out.println("Mecburen geri döndünüz.");

                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() + 1); // Cesaretiniz sevildi
                    indikatorlerCh3.setSubayDestegi(indikatorlerCh3.getSubayDestegi() - 2); // Disiplinsizlik
                }

            } else if (mevcutYol.equals("KOMUNIST")) {
                if (secim == 1) {
                    yesilYaz("\n*** GİZLİ İTTİFAK ***\n");
                    System.out.println("Galiyev ile el sıkıştınız. Türkistan'da yeraltı örgütlenmesi başladı.");
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() + 3);
                    indikatorlerCh3.setSavasTehlikesi(indikatorlerCh3.getSavasTehlikesi() + 2); // Stalin şüphelendi
                } else {
                    kirmiziYaz("\n*** GÜVENLİ LİMAN ***\n");
                    System.out.println("Galiyev'i ihbar etmediniz ama teklifi reddettiniz. Moskova ile aranız iyi.");
                    indikatorlerCh3.setIttifakIliskisi(indikatorlerCh3.getIttifakIliskisi() + 2);
                }

            } else if (mevcutYol.equals("TURAN")) {
                if (secim == 1) {
                    yesilYaz("\n*** TURAN AKÇESİ ***\n");
                    System.out.println("Yeni paralar basıldı. Ekonomik birlik sağlandı. Ticaret şahlandı.");
                    indikatorlerCh3.setIkmalDurumu(indikatorlerCh3.getIkmalDurumu() + 4);
                } else {
                    kirmiziYaz("\n*** KARMAŞA ***\n");
                    System.out.println("Her bölgede farklı para geçiyor. Tüccarlar zarar ediyor.");
                    indikatorlerCh3.setIkmalDurumu(indikatorlerCh3.getIkmalDurumu() - 2);
                }

            } else if (mevcutYol.equals("CUMHURIYET")) {
                if (secim == 1) {
                    yesilYaz("\n*** HANEDANIN SONU ***\n");
                    System.out.println("Sirkeci Garı'ndan trenler kalktı. Şehzadeler ağlayarak vatanı terk etti.");
                    System.out.println("Cumhuriyet kendini sağlama aldı.");
                    indikatorlerCh3.setSubayDestegi(indikatorlerCh3.getSubayDestegi() + 3);
                } else {
                    kirmiziYaz("\n*** TEHDİT SÜRÜYOR ***\n");
                    System.out.println("Hanedan üyeleri İstanbul'da kaldı. Saltanat yanlıları onlardan güç alıyor.");
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() - 2);
                }

            } else if (mevcutYol.equals("SERIAT")) {
                if (secim == 1) {
                    yesilYaz("\n*** DİSİPLİN ***\n");
                    System.out.println("Sahte şeyhler tutuklandı. Din istismarı engellendi.");
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() + 2);
                } else {
                    kirmiziYaz("\n*** HURAFE BATAKLIĞI ***\n");
                    System.out.println("Halk üfürükçülerin eline kaldı. Cehalet yayılıyor.");
                    indikatorlerCh3.setIkmalDurumu(indikatorlerCh3.getIkmalDurumu() - 3);
                }

            } else { // PARCALANMA veya MANDA
                if (secim == 1) {
                    yesilYaz("\n*** PONTUS TEMİZLİĞİ ***\n");
                    System.out.println("Topal Osman çeteleri isyanı kanlı bir şekilde bastırdı. Karadeniz Türk kaldı.");
                    indikatorlerCh3.setBolgePuan("Anadolu", 3);
                    indikatorlerCh3.setItilafIliskisi(indikatorlerCh3.getItilafIliskisi() - 3);
                } else {
                    kirmiziYaz("\n*** ZAİYAT ***\n");
                    System.out.println("Düzenli ordu dağlarda yetersiz kaldı. Rum çeteleri köyleri basmaya devam ediyor.");
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() - 3);
                }
            }

        } else {
            olayMuzigi.durdur();
            throw new ArithmeticException("Lütfen sadece sayı giriniz.");
        }
    }
}