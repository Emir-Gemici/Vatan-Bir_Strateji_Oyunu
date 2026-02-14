package com.vatan.chapters.ch3;

import com.vatan.core.*;
import java.util.Scanner;

public class Chapter3_47 extends Olay<IndikatorlerCh3> {

    public Chapter3_47() {
        super("", new String[]{});
    }

    @Override
    public void oynat(IndikatorlerCh3 indikatorlerCh3) {
        String mevcutYol = indikatorlerCh3.getOyunYolu();
        MuzikKutusu olayMuzigi = new MuzikKutusu();

        if (mevcutYol.equals("TARIHSEL")) {
            this.metin =
                    "Halil Kut Paşa:\n" +
                            "Paşam, Irak'ı kaybettiğimizi acı ve hüzünle bildiririm.\n" +
                            "Senelerdir mücadele ettiğimiz memleket toprağı maalesef düşman eline geçti.\n" +
                            "Ordumuz Musul tarafında ancak dayanabildi. Buradan düşmanı kuzeye ilerletmeyiz ama bizim de taarruz imkanlarımız maalesef yok.\n";
            this.cevaplar = new String[]{
                    "Canın sağ olsun. Maalesef ki harbi kaybettik gibi duruyor. (Kabulleniş)",
                    "Musul son kalemizdir Halil! Orada gerekirse dağlara çekilip gerilla savaşı verin ama petrolü İngiliz'e yar etmeyin!"
            };
            olayMuzigi.oynat("1/Chapter3_47.mp3");

        } else if (mevcutYol.equals("TURAN")) {
            this.metin =
                    "Haberci (Altay Dağları):\n" +
                            "Büyük Hakanım! İmparatorluk o kadar büyüdü ki, İstanbul'dan çıkan bir emir Çin sınırına 3 ayda gidiyor.\n" +
                            "Uç beyleri kendi başlarına buyruk hareket etmeye, vergi vermemeye başladı.\n" +
                            "Merkezi otoriteyi sağlamak için 'Demiryolu Ağı' projesine tüm hazineyi dökelim mi? Yoksa yetkileri yerel hanlara mı devredelim?\n";
            this.cevaplar = new String[]{
                    "Demir ağlarla öreceğiz Turan'ı! Hazine boşalsa da o trenler işleyecek. Merkezden kopuş olmaz!",
                    "Coğrafya kaderdir. Federasyon sistemine geçelim. Hanlar iç işlerinde serbest olsun, bize asker versin yeter."
            };
            olayMuzigi.oynat("2/Chapter3_47.mp3");

        } else if (mevcutYol.equals("CUMHURIYET")) {
            this.metin =
                    "Eğitim Bakanı (Hasan Ali Yücel):\n" +
                            "Paşam, köylüyü aydınlatmak için şehirden öğretmen göndermek yetmiyor.\n" +
                            "Köyün içinden, zeki çocukları seçip yetiştirelim ve tekrar köylerine 'Eğitmen' olarak yollayalım (Köy Enstitüleri Fikri).\n" +
                            "Ancak toprak ağaları 'Köylü uyanırsa bizi dinlemez' diye buna şiddetle karşı çıkıyor.\n";
            this.cevaplar = new String[]{
                    "Köylü uyanacak efendiler! Köy Enstitüleri derhal kurulsun. Ağaların ne dediği umurumda değil.",
                    "Ağaları ürkütmeyelim. Şimdilik sadece okuma-yazma kursları açalım. Enstitü işi beklesin."
            };
            olayMuzigi.oynat("3/Chapter3_47.mp3");

        } else if (mevcutYol.equals("SERIAT")) {
            this.metin =
                    "Ahlak Zabıtası Reisi:\n" +
                            "Sultanım, şehirde bazı kadınların 'Peçe' takmadığı, sadece başörtüsüyle gezdiği görülüyor.\n" +
                            "Ulema 'Yüzü açmak fitneye sebeptir' diyor. Çarşaf ve peçe zorunluluğu getirelim mi?\n" +
                            "Yoksa 'Tesettürün aslı örtünmektir, şekil önemli değil' mi diyelim?\n";
            this.cevaplar = new String[]{
                    "Fitneye geçit yok! Çarşaf ve peçe zorunludur. Uymayanlar cezalandırılacak.",
                    "Aşırıya kaçmayalım. Başörtüsü kafidir. Kadınları ev hapsine çevirmeyin."
            };
            olayMuzigi.oynat("4/Chapter3_47.mp3");

        } else if (mevcutYol.equals("PARCALANMA") || mevcutYol.equals("MANDA")) {
            this.metin =
                    "Trakya Sınırı (Meriç Nehri):\n" +
                            "Paşam! Anadolu kurtuldu ama Trakya hala Yunan işgalinde. Meriç Nehri'nin öte yakasında kardeşlerimiz bekliyor.\n" +
                            "İngilizler 'Trakya'ya geçerseniz savaş başlar' diyor. Elimizde sallar ve kayıklarla nehri geçip sürpriz bir taarruz yapalım mı?\n";
            this.cevaplar = new String[]{
                    "Misak-ı Milli Edirne'yi de kapsar! Gece yarısı salla geçin! Trakya'yı söküp alacağız!",
                    "Deniz gücümüz yok, nehirde boğuluruz. Masada çözelim. İstanbul bizde, Trakya'yı da diplomasiyle alırız."
            };
            olayMuzigi.oynat("5/Chapter3_47.mp3");
        }

        soruSor();

        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int secim = sc.nextInt();
            sc.nextLine();
            olayMuzigi.durdur();

            if (mevcutYol.equals("TARIHSEL")) {
                if (secim == 1) {
                    kirmiziYaz("\n*** ACI KABULLENİŞ ***\n");
                    System.out.println("Enver Paşa'nın sesi titredi. 'Bitti' demese de gözleri mağlubiyeti haykırıyordu.");
                    System.out.println("Ordu komutanları umudu kesti.");

                    indikatorlerCh3.setOrduGucu(indikatorlerCh3.getOrduGucu() - 1);
                    indikatorlerCh3.setIttifakIliskisi(indikatorlerCh3.getIttifakIliskisi() - 5);
                    indikatorlerCh3.bolgeGuncelle("Irak", -10);
                } else {
                    yesilYaz("\n*** MUSUL DİRENİŞİ ***\n");
                    System.out.println("Halil Paşa emri aldı. Musul'da yeraltı direniş örgütleri kuruldu.");
                    System.out.println("Şehir düşse bile ruh düşmedi. Gelecek için bir koz sakladınız.");

                    indikatorlerCh3.setOrduGucu(indikatorlerCh3.getOrduGucu() + 1);
                    indikatorlerCh3.setSubayDestegi(indikatorlerCh3.getSubayDestegi() + 2);
                    indikatorlerCh3.bolgeGuncelle("Irak", -5);
                }

            } else if (mevcutYol.equals("TURAN")) {
                if (secim == 1) {
                    yesilYaz("\n*** DEMİR AĞLAR ***\n");
                    System.out.println("İnşaat başladı. Hazine tükendi ama devletin yumruğu her yere ulaşıyor.");
                    indikatorlerCh3.setIkmalDurumu(indikatorlerCh3.getIkmalDurumu() - 4);
                    indikatorlerCh3.setOrduGucu(indikatorlerCh3.getOrduGucu() + 2);
                } else {
                    kirmiziYaz("\n*** PARÇALANMA RİSKİ ***\n");
                    System.out.println("Hanlar güçlendi. Artık merkeze sadece hediye gönderiyorlar, vergi değil.");
                    indikatorlerCh3.setIkmalDurumu(indikatorlerCh3.getIkmalDurumu() - 2);
                    indikatorlerCh3.setSubayDestegi(indikatorlerCh3.getSubayDestegi() - 3);
                }

            } else if (mevcutYol.equals("CUMHURIYET")) {
                if (secim == 1) {
                    yesilYaz("\n*** AYDINLANMA ATEŞİ ***\n");
                    System.out.println("Köy Enstitüleri kuruldu. Anadolu bozkırında Mozart çalan, tarım bilen çocuklar yetişiyor.");
                    System.out.println("Ağalar diş biliyor.");
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() + 4);
                    indikatorlerCh3.setSubayDestegi(indikatorlerCh3.getSubayDestegi() + 1);
                } else {
                    kirmiziYaz("\n*** CAHİLLİK KADER Mİ? ***\n");
                    System.out.println("Ağalar memnun, köylü cahil kaldı. Devrim şehirlere hapsoldu.");
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() - 2);
                }

            } else if (mevcutYol.equals("SERIAT")) {
                if (secim == 1) {
                    kirmiziYaz("\n*** KARA ÇARŞAF ***\n");
                    System.out.println("Sokaklar siyah örtülere büründü. Kadınlar sosyal hayattan silindi.");
                    System.out.println("Gizli huzursuzluk büyüyor.");
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() - 3);
                    indikatorlerCh3.setPadisahDestegi(indikatorlerCh3.getPadisahDestegi() + 2);
                } else {
                    yesilYaz("\n*** MAKUL ŞERİAT ***\n");
                    System.out.println("Baskı yapılmadı. Halk dini değerlerine sahip çıkarak yaşantısına devam ediyor.");
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() + 2);
                }

            } else { // PARCALANMA veya MANDA
                if (secim == 1) {
                    yesilYaz("\n*** TRAKYA SEFERİ ***\n");
                    System.out.println("Sallar karşıya geçti! Yunan garnizonu şaşkın.");
                    System.out.println("Edirne'ye Türk bayrağı çekildi. İngilizler müdahale edemedi.");
                    indikatorlerCh3.setOrduGucu(indikatorlerCh3.getOrduGucu() + 2);
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() + 4);
                } else {
                    yesilYaz("\n*** BARIŞ MASASI ***\n");
                    System.out.println("Savaş riskine girmedik. Mudanya'da Trakya'nın bize devredilmesi kabul edildi.");
                    System.out.println("Kan dökmeden toprak kazandık.");
                    indikatorlerCh3.setSubayDestegi(indikatorlerCh3.getSubayDestegi() + 1);
                    indikatorlerCh3.setItilafIliskisi(indikatorlerCh3.getItilafIliskisi() + 2);
                }
            }

        } else {
            olayMuzigi.durdur();
            throw new ArithmeticException("Lütfen sadece sayı giriniz.");
        }
    }
}