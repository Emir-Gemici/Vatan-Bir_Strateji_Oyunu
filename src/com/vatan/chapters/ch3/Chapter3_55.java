package com.vatan.chapters.ch3;

import com.vatan.core.*;
import java.util.Scanner;

public class Chapter3_55 extends Olay<IndikatorlerCh3> {

    public Chapter3_55() {
        super("", new String[]{});
    }

    @Override
    public void oynat(IndikatorlerCh3 indikatorlerCh3) {
        String mevcutYol = indikatorlerCh3.getOyunYolu();
        MuzikKutusu olayMuzigi = new MuzikKutusu();

        if (mevcutYol.equals("TARIHSEL")) {
            // *** BÜYÜK KIRILMA NOKTASI ***
            this.metin =
                    "V. Lenin (Moskova - Kremlin):\n" +
                            "Enver Paşa, sizi Rusya'da görmekten mutluyuz. Dünya devriminin ön hatlarında sizi görmek bizi memnun ediyor.\n" +
                            "Ülkenizdeki direniş hareketini büyük bir dikkatle takip ediyoruz. Eski dostunuz Mustafa Kemal Paşa ve askerleri kapitalist Batı'ya karşı takdir edilesi bir mücadele içerisinde.\n" +
                            "Türk halkını da sosyalizm mücadelesinde bizimle dost görmek istiyoruz.\n" +
                            "Mustafa Kemal Paşa'nın direniş hareketinin zayıflaması durumunda size ülkenizi kurtarmayı vaadediyorum Enver Paşa.\n" +
                            "Ancak karşılığında bazı taleplerimiz de olacaktır...\n";
            this.cevaplar = new String[]{
                    "İlk önce bekleyip ülkemizdeki savaşın nasıl bir seyir izleyeceğini takip etmeliyiz. Eğer seyir iyi giderse yardımınıza ihtiyacımız kalmaz Lenin efendi. Ancak eğer ki durumlar kötüye giderse teklifinizi o vakit değerlendiririz. (Bekle Gör - Tarihsel Devam)",
                    "Lenin efendi, görünen o ki savaş çok iyi gitmiyor. Bundan mütevellit şartlarınız ne olursa olsun kabul edeceğiz. (Kızıl Elma'dan Kızıl Yıldız'a - KOMÜNİST YOL BAŞLANGICI)"
            };
            olayMuzigi.oynat("1/Chapter3_55.mp3");

        } else if (mevcutYol.equals("TURAN")) {
            this.metin =
                    "Basmacı Lideri İbrahim Bey (Türkistan):\n" +
                            "Ulu Hakan! Sovyet Kızıl Ordusu Buhara kapılarına dayandı.\n" +
                            "Bize 'Teslim olun, sosyalist cumhuriyete katılın' diyorlar.\n" +
                            "Elimizdeki kuvvetler Rusları açık arazide yenmeye yetmez. Ya gerilla savaşına (Vur-Kaç) başlayacağız,\n" +
                            "Ya da tüm gücümüzle son bir meydan muharebesine gireceğiz.\n";
            this.cevaplar = new String[]{
                    "Türk er meydanından kaçmaz! Ordular saf tutsun. Ya istiklal ya ölüm! Meydan savaşı!",
                    "Rus ordusu çok kalabalık. Dağlara çekilin! Onları Türkistan bozkırlarında pusuyla yok edeceğiz."
            };
            olayMuzigi.oynat("2/Chapter3_55.mp3");

        } else if (mevcutYol.equals("CUMHURIYET")) {
            this.metin =
                    "TBMM (Anayasa Komisyonu):\n" +
                            "Paşam, 1921 Anayasası (Teşkilat-ı Esasiye) hazırlanıyor.\n" +
                            "Devletin yönetim şekli konusunda tartışma var. Mustafa Kemal 'Egemenlik kayıtsız şartsız milletindir' ilkesinde ısrarcı.\n" +
                            "Bazı vekiller ise 'Halifelik makamı korunmalı' diyor. Tavrımız ne olacak?\n";
            this.cevaplar = new String[]{
                    "Mustafa Kemal haklıdır! Egemenlik millete aittir, şahıslara değil. Saltanat hukuken bitmiştir.",
                    "Halkın hassasiyetlerini gözetelim. 'Devletin dini İslam, başkanı Halifedir' ibareleri eklensin."
            };
            olayMuzigi.oynat("3/Chapter3_55.mp3");

        } else if (mevcutYol.equals("SERIAT")) {
            this.metin =
                    "Şeyhülislam:\n" +
                            "Sultanım, Ankara'daki asi hükümet, 'Hıyanet-i Vataniye Kanunu' çıkarıp bize karşı gelenleri vatan haini ilan etti.\n" +
                            "Buna karşılık biz de Ankara'dakiler için 'Halife'ye isyan eden kafirdir' diye fetva verelim mi?\n" +
                            "Bu fetva kardeş kanını helal kılar, iç savaşı büyütür.\n";
            this.cevaplar = new String[]{
                    "Onlar devlete kılıç çekti! Fetvayı yayınlayın. Asilerin katli vaciptir!",
                    "Müslümanı Müslümana kırdırmam! Fetva vermeyin. Siyasi yolla çözelim."
            };
            olayMuzigi.oynat("4/Chapter3_55.mp3");

        } else if (mevcutYol.equals("PARCALANMA") || mevcutYol.equals("MANDA")) {
            this.metin =
                    "Sevr Antlaşması Taslağı:\n" +
                            "Paşam! İtilaf Devletleri önümüze bir ölüm fermanı koydu: Sevr Antlaşması.\n" +
                            "Anadolu paramparça ediliyor, ordumuz yok sayılıyor.\n" +
                            "Padişah Vahdettin imzalamaya meyilli. Ne yapalım?\n";
            this.cevaplar = new String[]{
                    "Bu antlaşmayı imzalayan haindir! Biz Anadolu'da direnişe devam edeceğiz. Sevr'i yırtıp atın!",
                    "Gücümüz yok Paşam. Zaman kazanmak için imzalayalım, sonra şartları yumuşatırız."
            };
            olayMuzigi.oynat("5/Chapter3_55.mp3");
        }

        soruSor();

        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int secim = sc.nextInt();
            sc.nextLine();
            olayMuzigi.durdur();

            if (mevcutYol.equals("TARIHSEL")) {
                if (secim == 1) {
                    // BEKLE VE GÖR
                    yesilYaz("\n*** TEMKİNLİ LİDER ***\n");
                    System.out.println("Lenin'e boyun eğmediniz. 'Türk milleti kendi kaderini kendi çizer' dediniz.");
                    System.out.println("Anadolu'dan gelecek haberleri bekliyorsunuz. Padişah ve subaylar bu duruşunuzu takdir etti.");

                    indikatorlerCh3.setAskerMorali(indikatorlerCh3.getAskerMorali() - 3); // Beklemek askeri yordu
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() - 2);
                    indikatorlerCh3.bolgeGuncelle("Kafkas", -5); // Ruslar boşluğu doldurdu
                    indikatorlerCh3.setPadisahDestegi(indikatorlerCh3.getPadisahDestegi() + 3);
                    indikatorlerCh3.setSubayDestegi(indikatorlerCh3.getSubayDestegi() + 3);

                } else {
                    // *** KOMÜNİST YOLA GEÇİŞ ***
                    kirmiziYaz("\n*** YOLDAŞ ENVER DOĞUYOR ***\n");
                    System.out.println("Lenin'in elini sıktınız. Kızıl Ordu üniformasını giydiniz.");
                    System.out.println("Artık hedefiniz sadece Turan değil, 'Sosyalist Turan' ve dünya devrimi!");
                    System.out.println("Tarih kitapları yeniden yazılacak: Enver Paşa, Bolşeviklerin safında!");

                    // OYUN YOLUNU DEĞİŞTİRME KOMUTU
                    indikatorlerCh3.setOyunYolu("KOMUNIST");

                    indikatorlerCh3.setAskerMorali(indikatorlerCh3.getAskerMorali() + 1);
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() + 2);
                    indikatorlerCh3.setIttifakIliskisi(100); // Sovyetlerle tam ittifak
                }

            } else if (mevcutYol.equals("TURAN")) {
                if (secim == 1) {
                    kirmiziYaz("\n*** KANLI MEYDAN ***\n");
                    System.out.println("Buhara önlerinde büyük savaş çıktı. Rus topçusu ağır zayiat verdirdi.");
                    indikatorlerCh3.setOrduGucu(indikatorlerCh3.getOrduGucu() - 3);
                    indikatorlerCh3.setAskerMorali(indikatorlerCh3.getAskerMorali() + 2); // Cesaret arttı
                } else {
                    yesilYaz("\n*** BOZKIRIN HAYALETLERİ ***\n");
                    System.out.println("Dağlara çekildiniz. Rus ordusu boş şehre girdi ama sürekli pusu yiyor.");
                    System.out.println("Savaş uzun sürecek ama kayıp az.");
                    indikatorlerCh3.setOrduGucu(indikatorlerCh3.getOrduGucu() + 1);
                }

            } else if (mevcutYol.equals("CUMHURIYET")) {
                if (secim == 1) {
                    yesilYaz("\n*** HALKIN EGEMENLİĞİ ***\n");
                    System.out.println("1921 Anayasası kabul edildi. Egemenlik millete verildi.");
                    System.out.println("Cumhuriyetin temeli atıldı.");
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() + 4);
                    indikatorlerCh3.setPadisahDestegi(indikatorlerCh3.getPadisahDestegi() - 5);
                } else {
                    kirmiziYaz("\n*** MUĞLAK ANAYASA ***\n");
                    System.out.println("Karma bir sistem kuruldu. İleride kriz çıkması kesin.");
                    indikatorlerCh3.setSubayDestegi(indikatorlerCh3.getSubayDestegi() - 2);
                }

            } else if (mevcutYol.equals("SERIAT")) {
                if (secim == 1) {
                    kirmiziYaz("\n*** KARDEŞ KAVGASI ***\n");
                    System.out.println("Fetva yayınlandı. Anadolu'da kardeş kardeşi vuruyor.");
                    System.out.println("İngilizler ellerini ovuşturuyor.");
                    indikatorlerCh3.setSavasTehlikesi(indikatorlerCh3.getSavasTehlikesi() + 5);
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() - 5);
                } else {
                    yesilYaz("\n*** VİCDANIN SESİ ***\n");
                    System.out.println("Fitneye alet olmadınız. Saray baskı altında olsa da onurunu korudu.");
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() + 2);
                }

            } else { // PARCALANMA veya MANDA
                if (secim == 1) {
                    yesilYaz("\n*** SEVR YIRTILDI ***\n");
                    System.out.println("Meclis antlaşmayı reddetti. Mücadele azmi bilendi.");
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() + 5);
                    indikatorlerCh3.setSavasTehlikesi(indikatorlerCh3.getSavasTehlikesi() + 3);
                } else {
                    kirmiziYaz("\n*** İDAM FERMANI ***\n");
                    System.out.println("İmzalar atıldı. Tarih sizi affetmeyecek.");
                    indikatorlerCh3.setHalkDestegi(0); // Bitti
                    System.out.println("Halk sizi linç etmek için saraya yürüyor...");
                }
            }

        } else {
            olayMuzigi.durdur();
            throw new ArithmeticException("Lütfen sadece sayı giriniz.");
        }
    }
}