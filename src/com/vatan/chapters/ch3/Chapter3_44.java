package com.vatan.chapters.ch3;

import com.vatan.core.*;
import java.util.Scanner;

public class Chapter3_44 extends Olay<IndikatorlerCh3> {

    public Chapter3_44() {
        super("", new String[]{});
    }

    @Override
    public void oynat(IndikatorlerCh3 indikatorlerCh3) {
        String mevcutYol = indikatorlerCh3.getOyunYolu();
        MuzikKutusu olayMuzigi = new MuzikKutusu();

        if (mevcutYol.equals("TARIHSEL")) {
            this.metin =
                    "Ahmet İzzet Paşa:\n" +
                            "Enver, Azerbaycan'daki Müslüman kardeşlerimiz ırkçı Ermenilerin soykırım tehdidi altında.\n" +
                            "Onları kurtarabilmek için bu Kafkas İslam Ordusu'yla Azerbaycan'ı kurtarmamız icap eder.\n" +
                            "Bunu nasıl yapmalıyız?\n";
            this.cevaplar = new String[]{
                    "Bu insaniyetlerini yitirmiş Ermenilere Allah'ın verdiği cezanın yeryüzündeki boyutunu uygulayarak. (Bakü Fatihi)",
                    "Burada aldığım duyumlara göre Lenin adında bir adam Komünist bir devrim yapmaya çalışıyor. Rus Hükümetinin kafasını karıştırıp Azerbaycan'ı kurtarmak için bu adama gizli destek verelim. (Taktiksel İttifak - Yol Değişmez)"
            };
            olayMuzigi.oynat("1/Chapter3_44.mp3");

        } else if (mevcutYol.equals("TURAN")) {
            this.metin =
                    "Mançurya Sınır Komutanı:\n" +
                            "Büyük Hakanım! Çin'i aldık ama Japonlar Mançurya bölgesindeki maden haklarını talep ediyor.\n" +
                            "'Daha önce yardım ettik, şimdi payımızı isteriz' diyorlar. Eğer vermezsek arkamızdan vurabilirler.\n" +
                            "Ancak Mançurya sanayisi Turan ordusunun kalbidir. Paylaşırsak gücümüz bölünür.\n";
            this.cevaplar = new String[]{
                    "Turan bölünmez bir bütündür! Japonlara bir çakıl taşı bile yok. Gerekirse onlarla da savaşırız!",
                    "Diplomasi gereği sus payı verelim. Mançurya'nın kuzeyi bizim, güneyi Japonların olsun. Şimdilik dost kalalım."
            };
            olayMuzigi.oynat("2/Chapter3_44.mp3");

        } else if (mevcutYol.equals("CUMHURIYET")) {
            this.metin =
                    "Milli Eğitim Bakanı (Reşit Galip):\n" +
                            "Paşam, İstanbul Darülfünunu (Üniversitesi) köhneleşmiş durumda. Hocalar devrimlere direnip eski usul ders anlatıyor.\n" +
                            "İsviçreli Profesör Malche bir rapor hazırladı: 'Bu kadroyla bilim yapılmaz' diyor.\n" +
                            "Eski hocaların tamamını tasfiye edip, yerlerine Nazi Almanyası'ndan kaçan Yahudi bilim adamlarını getirelim mi?\n";
            this.cevaplar = new String[]{
                    "İlimde taviz olmaz! Darülfünun kapatılsın, İstanbul Üniversitesi kurulsun. Einstein'a bile davet yollayın!",
                    "Yerli hocalarımızı küstürmeyelim. Reformu zamana yayalım. Yabancı hoca istemem."
            };
            olayMuzigi.oynat("3/Chapter3_44.mp3");

        } else if (mevcutYol.equals("SERIAT")) {
            this.metin =
                    "Adliye Nazırı:\n" +
                            "Sultanım, ticari davalarda kadılarımız yetersiz kalıyor. Şeriat hukuku modern şirketleşmelere cevap veremiyor.\n" +
                            "Mecelle'yi (Osmanlı Medeni Kanunu) güncelleyip Batı hukukundan bazı kısımları 'İslamilleştirerek' alalım mı?\n" +
                            "Yoksa 'Kuran bize yeter' diyip içtihat kapısını kapatalım mı?\n";
            this.cevaplar = new String[]{
                    "Zamanın değişmesiyle ahkam değişir. Mecelle modernize edilsin. Ticaretin önü açılsın.",
                    "Allah'ın kanunu eksik değildir! Batı'dan kanun alınamaz. Kadılarımız Fıkıh kitaplarına göre hüküm versin."
            };
            olayMuzigi.oynat("4/Chapter3_44.mp3");

        } else if (mevcutYol.equals("PARCALANMA") || mevcutYol.equals("MANDA")) {
            this.metin =
                    "İzmir Rıhtımı:\n" +
                            "Paşam! Şanlı ordumuz İzmir'e girdi. Yunan askeri denize döküldü.\n" +
                            "Ancak şehirde büyük bir panik var. Rum ve Ermeni mahallelerinde yangınlar çıktı (İzmir Yangını).\n" +
                            "Batı dünyası bizi suçluyor. Yangını söndürmek için askeri seferber edelim mi, yoksa 'Düşman yaktı' diyip seyir mi edelim?\n";
            this.cevaplar = new String[]{
                    "Şehir bizimdir, yanmasına izin veremeyiz! Asker yangına müdahale etsin, yağmacıları vurun!",
                    "Bırakın yansın! O mahalleler ihanet yuvasıydı. Bizim suçumuz yok, kaçarken kendileri yaktı."
            };
            olayMuzigi.oynat("5/Chapter3_44.mp3");
        }

        soruSor();

        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int secim = sc.nextInt();
            sc.nextLine();
            olayMuzigi.durdur();

            if (mevcutYol.equals("TARIHSEL")) {
                if (secim == 1) {
                    yesilYaz("\n*** BAKÜ FATİHİ ***\n");
                    System.out.println("Kafkas İslam Ordusu Bakü'ye girdi! Nuri Paşa şehri Ermeni ve Bolşeviklerden temizledi.");
                    System.out.println("Azerbaycan Türkleri ile kucaklaştık. Tarihi bir zafer!");

                    indikatorlerCh3.setAskerMorali(indikatorlerCh3.getAskerMorali() + 1);
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() - 4);
                    indikatorlerCh3.bolgeGuncelle("Kafkas", 10);
                    indikatorlerCh3.setPadisahDestegi(indikatorlerCh3.getPadisahDestegi() - 3);
                    indikatorlerCh3.setSavasTehlikesi(indikatorlerCh3.getSavasTehlikesi() + 1);
                    indikatorlerCh3.setSubayDestegi(indikatorlerCh3.getSubayDestegi() + 4);
                } else {
                    // YOL DEĞİŞİMİ YOK - TAKTİKSEL HAMLE
                    yesilYaz("\n*** TAKTİKSEL DESTEK ***\n");
                    System.out.println("Lenin'e el altından destek verdiniz. Çarlık yıkıldı, Bolşevikler güçlendi.");
                    System.out.println("Bu sayede Azerbaycan üzerindeki Rus baskısı geçici olarak kalktı.");
                    System.out.println("Ancak Enver Paşa'nın 'Kızıl' sempatisi subayları huzursuz etti.");

                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() + 1);
                    indikatorlerCh3.bolgeGuncelle("Kafkas", 8); // Tam fetih değil ama etki
                    indikatorlerCh3.setPadisahDestegi(indikatorlerCh3.getPadisahDestegi() - 2);
                    indikatorlerCh3.setSubayDestegi(indikatorlerCh3.getSubayDestegi() - 2);
                }

            } else if (mevcutYol.equals("TURAN")) {
                if (secim == 1) {
                    yesilYaz("\n*** ASYA'NIN TEK HAKİMİ ***\n");
                    System.out.println("Japonya'ya rest çektiniz. Mançurya tamamen Turan'ın oldu.");
                    indikatorlerCh3.setOrduGucu(indikatorlerCh3.getOrduGucu() + 2);
                    indikatorlerCh3.setItilafIliskisi(indikatorlerCh3.getItilafIliskisi() - 3);
                } else {
                    yesilYaz("\n*** DOĞU BLOĞU ***\n");
                    System.out.println("Japonya ile anlaştınız. Teknoloji transferi hızlandı.");
                    indikatorlerCh3.setIkmalDurumu(indikatorlerCh3.getIkmalDurumu() + 3);
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() - 2);
                }

            } else if (mevcutYol.equals("CUMHURIYET")) {
                if (secim == 1) {
                    yesilYaz("\n*** BİLİM DEVRİMİ ***\n");
                    System.out.println("Darülfünun kapandı. Alman profesörler geldi. Bilimsel atılım başladı.");
                    indikatorlerCh3.setItilafIliskisi(indikatorlerCh3.getItilafIliskisi() + 2);
                    indikatorlerCh3.setSubayDestegi(indikatorlerCh3.getSubayDestegi() + 1);
                } else {
                    kirmiziYaz("\n*** ORTA ÇAĞ KARANLIĞI ***\n");
                    System.out.println("Eski kafa hocalarla devam edildi. Üniversite yerinde sayıyor.");
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() + 1);
                }

            } else if (mevcutYol.equals("SERIAT")) {
                if (secim == 1) {
                    yesilYaz("\n*** MECELLE-İ AHKAM ***\n");
                    System.out.println("Hukuk güncellendi. Ticaret canlandı.");
                    indikatorlerCh3.setIkmalDurumu(indikatorlerCh3.getIkmalDurumu() + 3);
                    indikatorlerCh3.setPadisahDestegi(indikatorlerCh3.getPadisahDestegi() - 2);
                } else {
                    kirmiziYaz("\n*** ADALET KRİZİ ***\n");
                    System.out.println("Yabancılar mahkemeleri tanımıyor. Ticaret durma noktasında.");
                    indikatorlerCh3.setIkmalDurumu(indikatorlerCh3.getIkmalDurumu() - 3);
                }

            } else { // PARCALANMA veya MANDA
                if (secim == 1) {
                    yesilYaz("\n*** İZMİR KURTULDU ***\n");
                    System.out.println("Yangın söndürüldü. Tarihi şehir kurtarıldı.");
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() + 3);
                    indikatorlerCh3.setItilafIliskisi(indikatorlerCh3.getItilafIliskisi() + 2);
                } else {
                    kirmiziYaz("\n*** GÜZEL İZMİR YANDI ***\n");
                    System.out.println("Şehrin yarısı kül oldu. Dünya basını aleyhimize döndü.");
                    indikatorlerCh3.setItilafIliskisi(indikatorlerCh3.getItilafIliskisi() - 5);
                    indikatorlerCh3.setIkmalDurumu(indikatorlerCh3.getIkmalDurumu() - 3);
                }
            }

        } else {
            olayMuzigi.durdur();
            throw new ArithmeticException("Lütfen sadece sayı giriniz.");
        }
    }
}