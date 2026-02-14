package com.vatan.chapters.ch3;

import com.vatan.core.*;
import java.util.Random;
import java.util.Scanner;

public class Chapter3_20 extends Olay<IndikatorlerCh3> {

    public Chapter3_20() {
        super("", new String[]{});
    }

    @Override
    public void oynat(IndikatorlerCh3 indikatorlerCh3) {
        int oncekiSecim = indikatorlerCh3.getonBirinciSorudaSecilenSik();
        MuzikKutusu olayMuzigi = new MuzikKutusu();

        if (oncekiSecim == 1) {
            this.metin =
                    "Kafkas Cephesi Komutanı:\n" +
                            "Paşam, müttefikimiz Rusya ile ortak harekat planlıyoruz ancak bölgedeki Alman ajanları demiryollarını sabote ediyor.\n" +
                            "Ruslar, mühimmat sevkiyatının güvenliği için bölgedeki Alman misyonerlerin tutuklanmasını ve Alman subayların sınır dışı edilmesini istiyor.\n" +
                            "Bu durum Berlin ile olan tüm köprüleri atar ama Rusları memnun eder. Ne yapalım?\n";

            this.cevaplar = new String[]{
                    "Müttefikimizin güvenliği esastır. Almanları sınır dışı edin, demiryolunu koruyun.",
                    "Almanları karşımıza alamayız, görmezden gelin. Ruslar başının çaresine baksın."
            };
            olayMuzigi.oynat("1/Chapter3_20.mp3");

        } else if (oncekiSecim == 2) {
            this.metin =
                    "İsmail Hakkı Paşa:\n" +
                            "Enver, kusura bakma senin sözüne uymadım. Ardahan'ı kaybettik ancak başka çaremiz yoktu.\n" +
                            "Fakat şuan senin kararın çok mühim. Ruslar, Ermenilerle beraber Erzurum'u işgal etmeye çalışıyorlar.\n" +
                            "Acilen bir şeyler yapmamız gerekiyor.\n";

            this.cevaplar = new String[]{
                    "İsmail Paşa, umut ediyorum bu sefer akıllanmışsındır. Rusları ve Ermenileri şehir merkezine çekip Kargapazarı dağlarından arkadan kuşatalım. (Riskli)",
                    "Karşı saldırı ile uğraşıp orduyu yıpratmayalım. Sadece Erzurum'u savunmaya odaklanalım."
            };
            olayMuzigi.oynat("2/Chapter3_20.mp3");

        } else if (oncekiSecim == 3) {
            this.metin =
                    "Erzurum Valisi:\n" +
                            "Paşam, tarafsızız lakin Ruslar sınır ihlallerini artırdı. Erzurum halkı tedirgin, göç etmeye hazırlanıyorlar.\n" +
                            "Halkı teskin etmek için şehre askeri yığınak yaparsak Ruslar bunu savaş sebebi sayabilir.\n" +
                            "Yığınak yapmazsak halk şehri boşaltacak ve savunmasız kalacağız.\n";

            this.cevaplar = new String[]{
                    "Halkı bırakamayız! Erzurum'a takviye birlik gönderin, Ruslar ne düşünürse düşünsün.",
                    "Provokasyona gelmeyin. Halka sükunet telkin edin, askeri hareketlilikten kaçının."
            };
            olayMuzigi.oynat("3/Chapter3_20.mp3");
        }

        soruSor();

        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int secim = sc.nextInt();
            sc.nextLine();
            olayMuzigi.durdur();

            if (oncekiSecim == 1) {
                if (secim == 1) {
                    yesilYaz("\n*** RUSYA İLE GÜVEN TAZELEME ***\n");
                    System.out.println("Alman etkisi tamamen kırıldı. Ruslar lojistik destekten memnun.");
                    indikatorlerCh3.setItilafIliskisi(indikatorlerCh3.getItilafIliskisi() + 3);
                    indikatorlerCh3.setIttifakIliskisi(indikatorlerCh3.getIttifakIliskisi() - 5);
                    indikatorlerCh3.bolgeGuncelle("Kafkas", 5);
                } else if (secim == 2) {
                    kirmiziYaz("\n*** MÜTTEFİK KRİZİ ***\n");
                    System.out.println("Rusya, sabotajlara göz yumduğumuz için bize güvenmiyor.");
                    indikatorlerCh3.setItilafIliskisi(indikatorlerCh3.getItilafIliskisi() - 3);
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() + 1);
                } else {
                    throw new ArithmeticException("Geçersiz tuşlama yaptınız.");
                }

            } else if (oncekiSecim == 2) {
                if (secim == 1) {
                    Random zar = new Random();
                    if (zar.nextInt(100) < 70) {
                        yesilYaz("\n*** KARGAPAZARI ZAFERİ ***\n");
                        System.out.println("Plan kusursuz işledi! Ruslar şehir merkezinde sıkışırken, dağlardan inen birliklerimiz arkadan vurdu.");
                        System.out.println("Erzurum kurtuldu, düşman bozguna uğradı.");

                        indikatorlerCh3.setAskerMorali(indikatorlerCh3.getAskerMorali() + 3);
                        indikatorlerCh3.setIttifakGucu(indikatorlerCh3.getIttifakGucu() + 3);
                        indikatorlerCh3.setIttifakIliskisi(indikatorlerCh3.getIttifakIliskisi() + 3);
                        indikatorlerCh3.setItilafGucu(indikatorlerCh3.getItilafGucu() - 3);
                        indikatorlerCh3.setIkmalDurumu(indikatorlerCh3.getIkmalDurumu() - 3);
                        indikatorlerCh3.bolgeGuncelle("Kafkas", 10);
                        indikatorlerCh3.setOrduGucu(indikatorlerCh3.getOrduGucu() - 3);
                        indikatorlerCh3.setSubayDestegi(indikatorlerCh3.getSubayDestegi() + 3);
                        indikatorlerCh3.setPadisahDestegi(indikatorlerCh3.getPadisahDestegi() + 3);
                    } else {
                        kirmiziYaz("\n*** ERZURUM DÜŞTÜ ***\n");
                        System.out.println("Pusu girişimi felaketle sonuçlandı. Ruslar manevrayı fark edip birliklerimizi çembere aldı.");
                        System.out.println("Erzurum işgal edildi, Doğu cephesi çöktü.");

                        indikatorlerCh3.setAskerMorali(indikatorlerCh3.getAskerMorali() - 5);
                        indikatorlerCh3.setIttifakGucu(indikatorlerCh3.getIttifakGucu() - 2);
                        indikatorlerCh3.setIttifakIliskisi(indikatorlerCh3.getIttifakIliskisi() - 1);
                        indikatorlerCh3.setItilafGucu(indikatorlerCh3.getItilafGucu() + 2);
                        indikatorlerCh3.setIkmalDurumu(indikatorlerCh3.getIkmalDurumu() - 4);
                        indikatorlerCh3.bolgeGuncelle("Kafkas", -10);
                        indikatorlerCh3.setOrduGucu(indikatorlerCh3.getOrduGucu() - 4);
                        indikatorlerCh3.setSubayDestegi(indikatorlerCh3.getSubayDestegi() - 3);
                        indikatorlerCh3.setPadisahDestegi(indikatorlerCh3.getPadisahDestegi() - 3);
                    }
                } else if (secim == 2) {
                    yesilYaz("\n*** ERZURUM SAVUNMASI ***\n");
                    System.out.println("Macraya atılmadık. Birliklerimiz Erzurum tabyalarında savunma savaşı verdi.");
                    System.out.println("Şehir elde kaldı ama kuşatma devam ediyor.");

                    indikatorlerCh3.setAskerMorali(indikatorlerCh3.getAskerMorali() - 2);
                    indikatorlerCh3.setItilafGucu(indikatorlerCh3.getItilafGucu() - 1);
                    indikatorlerCh3.setIkmalDurumu(indikatorlerCh3.getIkmalDurumu() - 1);
                    indikatorlerCh3.bolgeGuncelle("Kafkas", 5);
                    indikatorlerCh3.setOrduGucu(indikatorlerCh3.getOrduGucu() + 1);
                    indikatorlerCh3.setSubayDestegi(indikatorlerCh3.getSubayDestegi() + 2);
                    indikatorlerCh3.setPadisahDestegi(indikatorlerCh3.getPadisahDestegi() + 2);
                } else {
                    throw new ArithmeticException("Geçersiz tuşlama yaptınız.");
                }

            } else if (oncekiSecim == 3) {
                if (secim == 1) {
                    yesilYaz("\n*** GÜÇ GÖSTERİSİ ***\n");
                    System.out.println("Erzurum'a asker yığıldı. Halk rahatladı, Ruslar geri adım attı.");
                    indikatorlerCh3.bolgeGuncelle("Kafkas", 5);
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() + 2);
                } else if (secim == 2) {
                    kirmiziYaz("\n*** GÖÇ DALGASI ***\n");
                    System.out.println("Halk korkuya kapılıp şehri terk etmeye başladı. Şehir boşalıyor.");
                    indikatorlerCh3.bolgeGuncelle("Kafkas", -5);
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() - 3);
                } else {
                    throw new ArithmeticException("Geçersiz tuşlama yaptınız.");
                }
            }

        } else {
            olayMuzigi.durdur();
            throw new ArithmeticException("Lütfen sadece sayı giriniz.");
        }
    }
}