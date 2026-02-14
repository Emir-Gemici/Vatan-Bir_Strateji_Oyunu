package com.vatan.chapters.ch3;

import com.vatan.core.*;
import java.util.Scanner;

public class Chapter3_49 extends Olay<IndikatorlerCh3> {

    public Chapter3_49() {
        super("", new String[]{});
    }

    @Override
    public void oynat(IndikatorlerCh3 indikatorlerCh3) {
        String mevcutYol = indikatorlerCh3.getOyunYolu();
        MuzikKutusu olayMuzigi = new MuzikKutusu();
        MuzikKutusu olayMuzigi2 = new MuzikKutusu();

        if (mevcutYol.equals("TARIHSEL")) {
            // U-Bot Denizaltı Sahnesi - 1918 Sonu
            this.metin =
                    "Talat Paşa (U-Bot Denizaltısı - Karadeniz Açıkları):\n" +
                            "Bak işte Enver... Ne kaldı ki şimdi elimizde? Koskoca vatanı kaybettik.\n" +
                            "Millet Sultan Hamit istibdadını dahi özler olmuş. Biz cesur ama vatanperver ihtilalcilerdik lakin yolun sonunu göremedik.\n" +
                            "Şimdi de kadersizce Almanya'ya, bir bilinmeze gidiyoruz. Ne dersin Enver, sence Almanlar teslim bayrağını çekmeden oraya varır mıyız?\n";
            this.cevaplar = new String[]{
                    "Talat, zaten içim kan ağlıyor. Başımı şişirme. Bizim kavgamız bitmedi, sadece mekan değiştiriyoruz.",
                    "Varırız elbet kardeşim. Orada bir istirahat edip vaziyeti görelim. Eğer Anadolu'da ateş sönmezse, biz de küllerimizden doğar döneriz."
            };

            // Özel Müzik
            olayMuzigi2.oynat("geldikGidiyoruz.mp3", 6);
            olayMuzigi.oynat("1/Chapter3_49.mp3"); // 49 olarak güncellendi

        } else if (mevcutYol.equals("TURAN")) {
            this.metin =
                    "Bilge Kağan Meclisi (Kurultay):\n" +
                            "Ulu Hakan! Ömrünüz uzun olsun lakin fani dünya. Sizden sonra bu devasa Turan İmparatorluğu'nu kim yönetecek?\n" +
                            "Eski usul 'Hanedan' (Oğlunuz) mı devam etsin, yoksa 'Liyakat' (Kurultay'ın seçtiği en iyi komutan) mı başa geçsin?\n" +
                            "Oğlunuzu seçerseniz düzen sürer ama yeteneksiz olabilir. Komutan seçerseniz taht kavgaları çıkabilir.\n";
            this.cevaplar = new String[]{
                    "Kanım kutsaldır! Benden sonra oğlum tahta geçecek. Hanedanlık devam edecek!",
                    "Töre neyi emrederse o! Benden sonra en yetenekli Bozkurt başa geçsin. Saltanat yok, liyakat var!"
            };
            olayMuzigi.oynat("2/Chapter3_49.mp3");

        } else if (mevcutYol.equals("CUMHURIYET")) {
            this.metin =
                    "Başvekil İsmet Paşa:\n" +
                            "Paşam, tek parti iktidarı halkta yorgunluk yarattı. Batı da bize 'Diktatörlük' diyor.\n" +
                            "Fethi Okyar Bey 'Serbest Cumhuriyet Fırkası' adında bir muhalefet partisi kurmak istiyor.\n" +
                            "İzin verirsek meclis karışır, vermezsek demokrasi topal kalır. Ne dersiniz?\n";
            this.cevaplar = new String[]{
                    "Milletin sesi duyulsun. Muhalefete izin verin. Demokrasicilik oynamıyoruz, gerçek olsun.",
                    "Devrimler henüz oturmadı. Muhalefet, gericilerin sığınağı olur. Parti kurulmasın, yola devam."
            };
            olayMuzigi.oynat("3/Chapter3_49.mp3");

        } else if (mevcutYol.equals("SERIAT")) {
            this.metin =
                    "Meclis-i Mebusan Reisi:\n" +
                            "Sultanım, yetkileriniz sınırsız. Ancak modern dünyada 'Anayasal Monarşi' esastır.\n" +
                            "Ulema ve mebuslar, Halife'nin yetkilerini sınırlayan, meclisi üstün kılan bir Anayasa değişikliği istiyor.\n" +
                            "Kabul ederseniz yetkileriniz azalır ama devlet kurumsallaşır.\n";
            this.cevaplar = new String[]{
                    "Allah'ın vekili anayasayla sınırlandırılamaz! Son söz Halife'nindir. Teklif reddedildi!",
                    "Şura (Danışma) sünnettir. Meclisin kararı benim kararımdır. Anayasayı imzalıyorum."
            };
            olayMuzigi.oynat("4/Chapter3_49.mp3");

        } else if (mevcutYol.equals("PARCALANMA") || mevcutYol.equals("MANDA")) {
            this.metin =
                    "TBMM Gizli Oturumu:\n" +
                            "Milletvekilleri kürsüde yumruklarını vuruyor: 'Savaş bitti, İstanbul kurtuldu ama Vahdettin hala sarayda!'\n" +
                            "Halkın bir kısmı Padişah'a bağlı, bir kısmı ise ona 'Hain' diyor.\n" +
                            "Saltanatı resmen kaldırmanın vakti geldi mi? Bu iç karışıklık çıkarabilir.\n";
            this.cevaplar = new String[]{
                    "Egemenlik kayıtsız şartsız milletindir! Saltanat kaldırılmıştır! Osmanlı resmen bitti.",
                    "Acele etmeyelim. Padişah sembolik olarak kalsın, yetkilerini alalım. Halkı bölmeyelim."
            };
            olayMuzigi.oynat("5/Chapter3_49.mp3");
        }

        soruSor();

        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int secim = sc.nextInt();
            sc.nextLine();
            olayMuzigi.durdur();
            olayMuzigi2.durdur();

            if (mevcutYol.equals("TARIHSEL")) {
                if (secim == 1) {
                    // TERSLEMEK
                    kirmiziYaz("\n*** KARANLIK SULAR ***\n");
                    System.out.println("Talat Paşa'yı terslediniz. Denizaltının kasvetli havası daha da ağırlaştı.");
                    System.out.println("Eski dostunuz köşesine çekildi, yolculuk sessizlik ve hüzün içinde geçiyor.");

                    indikatorlerCh3.setAskerMorali(indikatorlerCh3.getAskerMorali() - 2);
                    indikatorlerCh3.setSubayDestegi(indikatorlerCh3.getSubayDestegi() - 1); // Liderler arası küslük
                } else {
                    // UMUT VERMEK
                    yesilYaz("\n*** UMUT IŞIĞI ***\n");
                    System.out.println("Sözleriniz Talat Paşa'nın yüzünde acı bir tebessüm yarattı.");
                    System.out.println("'Senin bu hayalperestliğin olmasa biz çoktan ölmüştük Enver' dedi.");
                    System.out.println("Almanya'ya varmadan önce yeni planlar yapmaya başladınız bile.");

                    indikatorlerCh3.setAskerMorali(indikatorlerCh3.getAskerMorali() + 2); // Umut aşılandı
                    indikatorlerCh3.setIttifakIliskisi(indikatorlerCh3.getIttifakIliskisi() + 1); // Birlik korundu
                }

            } else if (mevcutYol.equals("KOMUNIST")) {
                if (secim == 1) {
                    yesilYaz("\n*** KIZIL TERÖR ***\n");
                    System.out.println("Gizli teşkilat kuruldu. Geceleri kapılar çalınıyor, insanlar kayboluyor.");
                    System.out.println("Devrim güvende ama korku hakim.");
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() - 4);
                    indikatorlerCh3.setSubayDestegi(indikatorlerCh3.getSubayDestegi() + 3);
                } else {
                    kirmiziYaz("\n*** KARŞI DEVRİM ***\n");
                    System.out.println("Yumuşak tavrınız düşmanları cesaretlendirdi. Suikast girişimleri arttı.");
                    indikatorlerCh3.setSavasTehlikesi(indikatorlerCh3.getSavasTehlikesi() + 3);
                }

            } else if (mevcutYol.equals("TURAN")) {
                if (secim == 1) {
                    yesilYaz("\n*** ENVER HANEDANI ***\n");
                    System.out.println("Oğlunuz veliaht ilan edildi. Töre bozuldu ama devletin geleceği netleşti.");
                    indikatorlerCh3.setPadisahDestegi(indikatorlerCh3.getPadisahDestegi() + 2);
                    indikatorlerCh3.setSubayDestegi(indikatorlerCh3.getSubayDestegi() - 2);
                } else {
                    yesilYaz("\n*** KURULTAY KARARI ***\n");
                    System.out.println("Saltanat reddedildi. Türk demokrasisinin temelleri atıldı.");
                    System.out.println("Komutanlar arasında rekabet başlasa da sistem adil.");
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() + 3);
                }

            } else if (mevcutYol.equals("CUMHURIYET")) {
                if (secim == 1) {
                    yesilYaz("\n*** ÇOK PARTİLİ HAYAT ***\n");
                    System.out.println("Serbest Fırka kuruldu. Meydanlar dolup taştı.");
                    System.out.println("Halkın coşkusu rejime güveni artırdı.");
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() + 4);
                    indikatorlerCh3.setSubayDestegi(indikatorlerCh3.getSubayDestegi() - 2);
                } else {
                    kirmiziYaz("\n*** TEK ADAM ***\n");
                    System.out.println("Parti kurulmadı. Muhalefet yeraltına indi.");
                    System.out.println("Demokrasi bir başka bahara kaldı.");
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() - 3);
                }

            } else if (mevcutYol.equals("SERIAT")) {
                if (secim == 1) {
                    yesilYaz("\n*** MUTLAK OTORİTE ***\n");
                    System.out.println("Halife'nin sözü kanundur. Meclis sadece danışma organı kaldı.");
                    System.out.println("Güçlü liderlik krizleri çözüyor.");
                    indikatorlerCh3.setPadisahDestegi(indikatorlerCh3.getPadisahDestegi() + 5);
                } else {
                    kirmiziYaz("\n*** ANAYASAL HİLAFET ***\n");
                    System.out.println("Yetkileriniz kısıtlandı. Artık her karar için meclis onayı lazım.");
                    System.out.println("Devlet hantallaştı.");
                    indikatorlerCh3.setPadisahDestegi(indikatorlerCh3.getPadisahDestegi() - 4);
                }

            } else { // PARCALANMA veya MANDA
                if (secim == 1) {
                    yesilYaz("\n*** PADİŞAHIM ÇOK YAŞA...MA ***\n");
                    System.out.println("Saltanat kaldırıldı! 600 yıllık çınar devrildi.");
                    System.out.println("Vahdettin gece yarısı ülkeden kaçtı. Artık tek egemen Millet!");
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() + 5);
                    indikatorlerCh3.setPadisahDestegi(0);
                } else {
                    kirmiziYaz("\n*** İKİ BAŞLILIK ***\n");
                    System.out.println("Ankara'da Meclis, İstanbul'da Padişah. Emir komuta karıştı.");
                    System.out.println("Bu ikilik devleti zayıflatıyor.");
                    indikatorlerCh3.setSubayDestegi(indikatorlerCh3.getSubayDestegi() - 3);
                }
            }

        } else {
            olayMuzigi.durdur();
            throw new ArithmeticException("Lütfen sadece sayı giriniz.");
        }
    }
}