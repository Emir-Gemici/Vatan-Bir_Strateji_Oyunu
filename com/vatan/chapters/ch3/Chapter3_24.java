package com.vatan.chapters.ch3;

import com.vatan.core.*;
import java.util.Scanner;

public class Chapter3_24 extends Olay<IndikatorlerCh3> {

    public Chapter3_24() {
        super("", new String[]{});
    }

    @Override
    public void oynat(IndikatorlerCh3 indikatorlerCh3) {
        String mevcutYol = indikatorlerCh3.getOyunYolu();
        MuzikKutusu olayMuzigi = new MuzikKutusu();

        if (mevcutYol.equals("TARIHSEL")) {
            this.metin =
                    "Cemal Paşa: Enver, aziz kardeşim, Sina Yarımadası'na planladığımız gibi intikal ettik.\n" +
                            "Yakaladığımız Araplardan aldığımız bilgiye göre İngilizler buradan bolca yolcu gemisi geçirmeye başlamış.\n" +
                            "Sebebini anlayamadık ama İngiliz keferesi bir yere çıkarma yapacak gibi duruyor. Yoksa bu kadar askeri ne yapsın...\n" +
                            "Velhasıl kelam, sence Kanalı geçelim mi yoksa mayın mı döşeyelim?\n";
            this.cevaplar = new String[]{
                    "Kantara mevkinde kanalın geçilebilir olduğunu yazmışsın. O zaman geçmeyi deneyin!",
                    "Mayınlarla kanalı kapatın. İngilizleri sömürgelerinden koparırsak bolca faydası olur."
            };
            olayMuzigi.oynat("1/Chapter3_24.mp3");

        } else if (mevcutYol.equals("TURAN")) {
            this.metin =
                    "Enver Paşa (Tebriz Karargahı):\n" +
                            "Kafkasya ve İran elimizde lakin Dağıstan dağlarındaki Şeyh Şamil'in torunları bize biat etmekte nazlanıyor.\n" +
                            "Ruslar çekildi ama yerel beyler 'Osmanlı bizi vergiye bağlayacak' diye korkuyor.\n" +
                            "Arkamızı sağlama almadan Türkistan'a yürüyemeyiz. Bu dağlıları zorla mı itaat altına alalım, yoksa özerklik mi verelim?\n";
            this.cevaplar = new String[]{
                    "Turan'da tek baş, tek devlet olur! İtaat etmeyenin başı vurula. Dağıstan'a askeri harekat düzenleyin.",
                    "Onlar bizim kardeşimizdir, kan dökmeyelim. İç işlerinde serbestlik verin, yeter ki sancağımız altında birleşsinler."
            };
            olayMuzigi.oynat("2/Chapter3_24.mp3");

        } else if (mevcutYol.equals("CUMHURIYET")) {
            this.metin =
                    "Ziya Gökalp Bey:\n" +
                            "Paşam, reformlar için en büyük engel eğitimdir. Medreseler, modern bilimden uzak, padişaha kul yetiştiriyor.\n" +
                            "Sizden 'Tevhid-i Tedrisat' (Öğretim Birliği) kanununu çıkarmanızı arz ediyorum.\n" +
                            "Lakin Ulema sınıfı bunu 'dinsizlik' olarak yaftalayacaktır. Meclis'te kıyamet kopabilir.\n";
            this.cevaplar = new String[]{
                    "Medreseler kapatılacak! Bilim neredeyse oraya gidilecek. İtiraz eden mebusları susturun.",
                    "Toplum henüz buna hazır değil Ziya Bey. Şimdilik modern mektepler açalım ama medreselere dokunmayalım."
            };
            olayMuzigi.oynat("3/Chapter3_24.mp3");

        } else if (mevcutYol.equals("SERIAT")) {
            this.metin =
                    "Ticaret Nazırı:\n" +
                            "Paşam, savaşan Avrupa devletleri bizden erzak ve hammadde talep ediyor. Almanlar da İngilizler de kapımızda.\n" +
                            "Bazı dindar tüccarlar 'Kefereye mal satmak haramdır, sadece Müslümanlarla ticaret yapalım' diyor.\n" +
                            "Lakin hazine tamtakır. Bu ticareti yaparsak devlet zenginleşir, yapmazsak İslami duruşumuz perçinlenir.\n";
            this.cevaplar = new String[]{
                    "Paranın dini olmaz! Devletin bekası için kim parayı verirse malı ona satarız.",
                    "Rızkı veren Allah'tır. Kafirlerin savaşına odun taşımayacağız. Sadece İslam ülkeleriyle ticaret yapılsın."
            };
            olayMuzigi.oynat("4/Chapter3_24.mp3");

        } else if (mevcutYol.equals("PARCALANMA") || mevcutYol.equals("MANDA")) {
            this.metin =
                    "Antepli Şahin Bey:\n" +
                            "Paşam! Fransızlar Antep yolunu tuttu. Şehre erzak girişini kestiler, halk açlıkla terbiye edilmek isteniyor.\n" +
                            "Elimizdeki mavzerler Fransız makineli tüfeklerine yetmiyor.\n" +
                            "Ya şehri teslim edeceğiz ya da 'Ölürsem şehit, kalırsam gazi' diyip intihar saldırısına girişeceğiz.\n";
            this.cevaplar = new String[]{
                    "Antep 'Gazi' olacak! Köprü başlarını tutun, son nefer ölene kadar şehri vermeyin!",
                    "Halkın açlıktan ölmesine göz yumamayız... Fransız komutanla anlaşma yoluna gidin."
            };
            olayMuzigi.oynat("5/Chapter3_24.mp3");
        }

        soruSor();

        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int secim = sc.nextInt();
            sc.nextLine();
            olayMuzigi.durdur();

            if (mevcutYol.equals("TARIHSEL")) {
                if (secim == 1) {
                    kirmiziYaz("\n*** 2. KANAL HEZİMETİ ***\n");
                    System.out.println("Saldırı emri verdiniz ama İngilizler çoktan tahkimat yapmıştı.");
                    System.out.println("Çölün ortasında ordumuz büyük kayıp verdi. Cemal Paşa geri çekiliyor.");

                    indikatorlerCh3.setOrduGucu(indikatorlerCh3.getOrduGucu() - 1);
                    indikatorlerCh3.setIkmalDurumu(indikatorlerCh3.getIkmalDurumu() - 3);
                    indikatorlerCh3.setItilafGucu(indikatorlerCh3.getItilafGucu() - 2); // İlişki değil güç düşüyor
                } else {
                    yesilYaz("\n*** SÜVEYŞ KAPANDI ***\n");
                    System.out.println("Kanal mayınlandı! İngiliz gemileri geçemiyor. Mısır ekonomisi felç oldu.");
                    System.out.println("Halk bu stratejik hamleyi alkışlıyor.");

                    indikatorlerCh3.setIkmalDurumu(indikatorlerCh3.getIkmalDurumu() + 2);
                    indikatorlerCh3.setAskerMorali(indikatorlerCh3.getAskerMorali() + 1);
                    indikatorlerCh3.setItilafGucu(indikatorlerCh3.getItilafGucu() - 1);
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() + 2);
                    indikatorlerCh3.setIttifakIliskisi(indikatorlerCh3.getIttifakIliskisi() + 1);
                }

            } else if (mevcutYol.equals("TURAN")) {
                if (secim == 1) {
                    yesilYaz("\n*** DAĞLARIN HAKİMİ ***\n");
                    System.out.println("Dağıstan zapturapt altına alındı. Ordu disiplinle ilerliyor ama halk korku içinde.");
                    indikatorlerCh3.setOrduGucu(indikatorlerCh3.getOrduGucu() - 1);
                    indikatorlerCh3.setBolgePuan("Kafkas", 5);
                    indikatorlerCh3.setSubayDestegi(indikatorlerCh3.getSubayDestegi() + 2);
                } else {
                    yesilYaz("\n*** KAFKAS BİRLİĞİ ***\n");
                    System.out.println("Yerel beyler özerkliği kabul edip orduya katıldı. Turan ordusu büyüyor.");
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() + 3);
                    indikatorlerCh3.setOrduGucu(indikatorlerCh3.getOrduGucu() + 2);
                    indikatorlerCh3.setSubayDestegi(indikatorlerCh3.getSubayDestegi() - 1); // Merkeziyetçi subaylar kızgın
                }

            } else if (mevcutYol.equals("CUMHURIYET")) {
                if (secim == 1) {
                    yesilYaz("\n*** EĞİTİM DEVRİMİ ***\n");
                    System.out.println("Medreselerin kapısına kilit vuruldu. Meclis karıştı ama genç nesil umutlu.");
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() - 2); // Geleneksel halk tepkili
                    indikatorlerCh3.setSubayDestegi(indikatorlerCh3.getSubayDestegi() + 3);
                    indikatorlerCh3.setItilafIliskisi(indikatorlerCh3.getItilafIliskisi() + 2);
                } else {
                    yesilYaz("\n*** İKİLİ EĞİTİM ***\n");
                    System.out.println("Eski ve yeni bir arada. Kriz çıkmadı ama reformlar yavaşladı.");
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() + 2);
                    indikatorlerCh3.setPadisahDestegi(indikatorlerCh3.getPadisahDestegi() + 1);
                }

            } else if (mevcutYol.equals("SERIAT")) {
                if (secim == 1) {
                    yesilYaz("\n*** TİCARET YOLLARI ***\n");
                    System.out.println("Hazine dolmaya başladı. Devlet zenginleşiyor ama 'dava satıldı' diyenler var.");
                    indikatorlerCh3.setIkmalDurumu(indikatorlerCh3.getIkmalDurumu() + 4);
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() - 2);
                } else {
                    kirmiziYaz("\n*** EKONOMİK DARBOĞAZ ***\n");
                    System.out.println("Hazine boşalıyor. Maneviyat yüksek ama asker maaşları ödenemiyor.");
                    indikatorlerCh3.setIkmalDurumu(indikatorlerCh3.getIkmalDurumu() - 4);
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() + 4);
                }

            } else { // PARCALANMA veya MANDA
                if (secim == 1) {
                    yesilYaz("\n*** ANTEP DESTANI ***\n");
                    System.out.println("Şahin Bey köprü başında şehit düştü ama Fransızlar şehre giremedi. Antep direniyor!");
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() + 5);
                    indikatorlerCh3.setSavasTehlikesi(5);
                } else {
                    kirmiziYaz("\n*** ANTEP DÜŞTÜ ***\n");
                    System.out.println("Şehir teslim oldu. Fransız bayrağı çekildi. Direniş ruhu büyük yara aldı.");
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() - 5);
                }
            }

        } else {
            olayMuzigi.durdur();
            throw new ArithmeticException("Lütfen sadece sayı giriniz.");
        }
    }
}