package com.vatan.chapters.ch3;

import com.vatan.core.*;
import java.util.Random;
import java.util.Scanner;

public class Chapter3_27 extends Olay<IndikatorlerCh3> {

    public Chapter3_27() {
        super("", new String[]{});
    }

    @Override
    public void oynat(IndikatorlerCh3 indikatorlerCh3) {
        String mevcutYol = indikatorlerCh3.getOyunYolu();
        MuzikKutusu olayMuzigi = new MuzikKutusu();

        if (mevcutYol.equals("TARIHSEL")) {
            this.metin =
                    "Ahmet İzzet Paşa:\n" +
                            "Enver, yine doğuda olay çıktı. Ermeniler bu sefer direnişe değil direkt isyana kalktılar.\n" +
                            "İvedilikle bir şeyler yapmamız lazım. Aksi taktirde Van elden gidecek. Van'ın güneyine kadar indiler.\n";
            this.cevaplar = new String[]{
                    "Güney taraftan Ruslara Muş'u kuşatmalarında yardımcı olmaya çalışacaklardır. Bunu önleyebilmek için Van'ın hafif yükseltili Güney arazisini kullanabiliriz. Gürpınar civarından ateş açacağız.",
                    "Eğer vakit kaybedersek isyan daha da büyüyebilir. Derhal bu Ermenilere hadlerini bildirmeliyiz! (Riskli Taarruz)"
            };
            olayMuzigi.oynat("1/Chapter3_27.mp3");

        } else if (mevcutYol.equals("TURAN")) {
            this.metin =
                    "Türkistan Cephesi Komutanı:\n" +
                            "Paşam, ordumuz Semerkant'a yaklaştı lakin yerel halkın bir kısmı Sovyet propagandasına kanmış durumda.\n" +
                            "Bolşevikler 'Toprak ağalarını kovduk, toprak köylünün olacak' diyerek fakir halkı yanlarına çekiyor.\n" +
                            "Biz ise eski Beyler ve Hanlar ile işbirliği yapıyoruz. Bu durum 'Enver Paşa zenginlerin dostudur' dedikodusu yayıyor.\n";
            this.cevaplar = new String[]{
                    "Turan davası sınıfsızdır! Toprak reformu ilan edin. Beylerin toprağını halka dağıtın, Bolşeviklerin elindeki kozu alın.",
                    "Düzen bozulmamalı. Beylerin desteği olmadan orduyu besleyemeyiz. Propagandaya kulak asmayın, ilerlemeye devam."
            };
            olayMuzigi.oynat("2/Chapter3_27.mp3");

        } else if (mevcutYol.equals("CUMHURIYET")) {
            this.metin =
                    "Milli Eğitim Vekili:\n" +
                            "Paşam, Harf Devrimi hazırlıkları tamamlandı. Latin esaslı yeni Türk alfabesine geçmek istiyoruz.\n" +
                            "Lakin okuma yazma oranı zaten düşük, bir de harfler değişirse halk bir gecede cahil kalacak.\n" +
                            "Gazeteler ve bürokrasi felç olabilir. Geçişi kademeli mi yapalım, yoksa bıçak gibi kesip atalım mı?\n";
            this.cevaplar = new String[]{
                    "Devrim beklemez! Yarın sabah herkes yeni harfleri öğrenecek. Eski harfleri yasaklayın.",
                    "Halkı küstürmeyelim. 5 yıllık bir geçiş süreci olsun. Gazeteler hem eski hem yeni harfle basılsın."
            };
            olayMuzigi.oynat("3/Chapter3_27.mp3");

        } else if (mevcutYol.equals("SERIAT")) {
            this.metin =
                    "İran Şahı'nın Elçisi:\n" +
                            "Halife Hazretleri, Şii kardeşleriniz olarak İslam Birliği'ne katılmaya sıcak bakıyoruz.\n" +
                            "Ancak şartımız şudur: Mezhep ayrımı kalkacak, camilerde 12 İmam adına da hutbe okunacak.\n" +
                            "Eğer bunu kabul ederseniz İran ordusu emrinizdedir. Kabul etmezseniz kendi yolumuza gideriz.\n";
            this.cevaplar = new String[]{
                    "Müslüman Müslümanın kardeşidir! Mezhep fitnesini ayaklar altına alıyorum. Şartlarınızı kabul ediyoruz.",
                    "Ehl-i Sünnet vel Cemaat yolundan şaşmayız. Birleşeceğiz diye itikadımızdan taviz veremeyiz. Teklif reddedildi."
            };
            olayMuzigi.oynat("4/Chapter3_27.mp3");

        } else if (mevcutYol.equals("PARCALANMA") || mevcutYol.equals("MANDA")) {
            this.metin =
                    "Sakarya Cephesi:\n" +
                            "Paşam! Yunan ordusu Haymana'ya kadar geldi. Top sesleri Ankara'dan duyuluyor.\n" +
                            "Ordunun ayağında çarık, elinde mermi yok. Meclis'te 'Tekalif-i Milliye' (Milli Yükümlülük) emirlerini çıkarıp halkın elindeki malın %40'ına el koymamız lazım.\n" +
                            "Halk zaten aç, bunu yaparsak isyan çıkabilir.\n";
            this.cevaplar = new String[]{
                    "Vatanın bağrı yanarken malın kıymeti mi olur? Emirleri uygulayın! Ordu doymazsa millet yok olur.",
                    "Halkı daha fazla ezmeyelim. Elimizdekiyle son bir savunma hattı kuralım. Allah büyüktür."
            };
            olayMuzigi.oynat("5/Chapter3_27.mp3");
        }

        soruSor();

        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int secim = sc.nextInt();
            sc.nextLine();
            olayMuzigi.durdur();

            if (mevcutYol.equals("TARIHSEL")) {
                if (secim == 1) {
                    yesilYaz("\n*** COĞRAFYA KADERDİR ***\n");
                    System.out.println("Gürpınar tepelerinden açılan ateş isyancıları baskıladı. Van savunması nefes aldı.");
                    System.out.println("Ruslarla birleşmeleri engellendi.");

                    indikatorlerCh3.setAskerMorali(indikatorlerCh3.getAskerMorali() + 1);
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() - 3);
                    indikatorlerCh3.setIkmalDurumu(indikatorlerCh3.getIkmalDurumu() - 2);
                    indikatorlerCh3.setItilafGucu(indikatorlerCh3.getItilafGucu() - 2);
                    indikatorlerCh3.bolgeGuncelle("Kafkas", 5);
                    indikatorlerCh3.setOrduGucu(indikatorlerCh3.getOrduGucu() - 1);
                    indikatorlerCh3.setSubayDestegi(indikatorlerCh3.getSubayDestegi() - 1);
                } else {
                    Random zar = new Random();
                    int sans = zar.nextInt(100);

                    if (sans < 60) { // %60 İhtimalle Kötü Son
                        kirmiziYaz("\n*** TUZAK ***\n");
                        System.out.println("Biz şehre inerken Rus öncü birlikleri arkadan vurdu!");
                        System.out.println("İki ateş arasında kaldık, Van harabeye döndü.");

                        indikatorlerCh3.setAskerMorali(indikatorlerCh3.getAskerMorali() - 4);
                        indikatorlerCh3.setIkmalDurumu(indikatorlerCh3.getIkmalDurumu() - 1);
                        indikatorlerCh3.bolgeGuncelle("Kafkas", -10);
                        indikatorlerCh3.setOrduGucu(indikatorlerCh3.getOrduGucu() - 4);
                        indikatorlerCh3.setSubayDestegi(indikatorlerCh3.getSubayDestegi() - 3);
                    } else { // %40 İhtimalle İyi Son
                        yesilYaz("\n*** YILDIRIM HAREKATI ***\n");
                        System.out.println("Ruslar gelmeden isyanı bastırdık! Şehir kontrol altına alındı.");

                        indikatorlerCh3.setAskerMorali(indikatorlerCh3.getAskerMorali() + 3);
                        indikatorlerCh3.setItilafGucu(indikatorlerCh3.getItilafGucu() - 2);
                        indikatorlerCh3.bolgeGuncelle("Kafkas", 5);
                        indikatorlerCh3.setOrduGucu(indikatorlerCh3.getOrduGucu() - 2);
                        indikatorlerCh3.setSubayDestegi(indikatorlerCh3.getSubayDestegi() - 1);
                    }
                }

            } else if (mevcutYol.equals("TURAN")) {
                if (secim == 1) {
                    yesilYaz("\n*** HALKÇI TURAN ***\n");
                    System.out.println("Topraklar dağıtıldı. Türkistan köylüsü Enver Paşa'yı 'Kurtarıcı Ata' ilan etti.");
                    System.out.println("Bolşeviklerin halk desteği çöktü. Beyler ise ordudan kaçıyor.");
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() + 5);
                    indikatorlerCh3.setIkmalDurumu(indikatorlerCh3.getIkmalDurumu() - 2); // Beyler desteği kesti
                    indikatorlerCh3.setOrduGucu(indikatorlerCh3.getOrduGucu() + 1); // Köylüler katıldı
                } else {
                    yesilYaz("\n*** ESKİ DÜZEN ***\n");
                    System.out.println("Beylerle aramız iyi, ambarlarımız dolu. Lakin halkın bir kısmı komünistlere katıldı.");
                    indikatorlerCh3.setIkmalDurumu(indikatorlerCh3.getIkmalDurumu() + 4);
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() - 3);
                }

            } else if (mevcutYol.equals("CUMHURIYET")) {
                if (secim == 1) {
                    yesilYaz("\n*** HARF DEVRİMİ ***\n");
                    System.out.println("Yeni alfabe kabul edildi. Okuma yazma seferberliği başladı. Batı dünyası reformları alkışlıyor.");
                    indikatorlerCh3.setItilafIliskisi(indikatorlerCh3.getItilafIliskisi() + 3);
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() - 4); // Kısa vadeli şok
                } else {
                    yesilYaz("\n*** YUMUŞAK GEÇİŞ ***\n");
                    System.out.println("Bürokrasi aksamadı ama devrim heyecanı söndü. Muhafazakarlar zaman kazandı.");
                    indikatorlerCh3.setPadisahDestegi(indikatorlerCh3.getPadisahDestegi() + 2);
                    indikatorlerCh3.setSubayDestegi(indikatorlerCh3.getSubayDestegi() - 2);
                }

            } else if (mevcutYol.equals("SERIAT")) {
                if (secim == 1) {
                    yesilYaz("\n*** BÜYÜK İSLAM BİRLİĞİ ***\n");
                    System.out.println("Tarihi anlaşma! Şii ve Sünni dünyası tek sancak altında. İran ordusu cepheye akıyor.");
                    indikatorlerCh3.setOrduGucu(indikatorlerCh3.getOrduGucu() + 5);
                    indikatorlerCh3.setSubayDestegi(indikatorlerCh3.getSubayDestegi() - 3); // Bağnazlar tepkili
                } else {
                    kirmiziYaz("\n*** MEZHEP DUVARI ***\n");
                    System.out.println("İran desteğini çekti. İslam dünyasındaki bölünmüşlük devam ediyor.");
                    indikatorlerCh3.setOrduGucu(indikatorlerCh3.getOrduGucu() - 1);
                }

            } else { // PARCALANMA veya MANDA
                if (secim == 1) {
                    yesilYaz("\n*** TEKALİF-İ MİLLİYE ***\n");
                    System.out.println("Halkın elindeki çarığa, çoraba kadar alındı. Ordu donatıldı. Sakarya'da destan yazılacak!");
                    indikatorlerCh3.setOrduGucu(indikatorlerCh3.getOrduGucu() + 4);
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() - 3);
                } else {
                    kirmiziYaz("\n*** CEPHANE YOK ***\n");
                    System.out.println("Asker süngüyle savaşmak zorunda. Yunan topçusu mevzilerimizi dövüyor.");
                    indikatorlerCh3.setOrduGucu(indikatorlerCh3.getOrduGucu() - 3);
                    indikatorlerCh3.setSavasTehlikesi(5);
                }
            }

        } else {
            olayMuzigi.durdur();
            throw new ArithmeticException("Lütfen sadece sayı giriniz.");
        }
    }
}