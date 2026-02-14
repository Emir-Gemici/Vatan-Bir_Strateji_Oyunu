package com.vatan.chapters.ch3;

import com.vatan.core.*;
import java.util.Scanner;

public class Chapter3_39 extends Olay<IndikatorlerCh3> {

    public Chapter3_39() {
        super("", new String[]{});
    }

    @Override
    public void oynat(IndikatorlerCh3 indikatorlerCh3) {
        String mevcutYol = indikatorlerCh3.getOyunYolu();
        MuzikKutusu olayMuzigi = new MuzikKutusu();

        if (mevcutYol.equals("TARIHSEL")) {
            this.metin =
                    "Irak Cephe Komutanı Halil Kut:\n" +
                            "Enver Paşa, şuan çok önemli bir sorunumuz var. İngilizleri Kut'ül Amare'de yendikten sonra (takviyelerle geri gelip) Bağdat'a girdiler.\n" +
                            "Burada şuan güvenlik kuvvetlerimizle çatışıyorlar.\n" +
                            "Yeni generalleri (Maude) eskisine nazaran çok daha gayretli ve ilimli görünüyor. Bunları tekrar nasıl buradan süreriz paşam?\n";
            this.cevaplar = new String[]{
                    "O zaman generallerini hedef almak mantıklı olabilir. Generalin çadırına bombalı saldırı düzenleyelim. Ayrıca nehri zehirleyerek ordularını hasta edelim. (Kirli Harp)",
                    "Farklı bir şeyler denemekten ziyade artık savunma hattına karışmayalım ve risk almayalım. En iyisi adabımızla dümdüz bir savunma yapalım."
            };
            olayMuzigi.oynat("1/Chapter3_39.mp3");

        } else if (mevcutYol.equals("TURAN")) {
            this.metin =
                    "Turan Ordusu Komutanı:\n" +
                            "Büyük Hakanım! Pekin kapılarına dayandık. 'Yasak Şehir' karşımızda duruyor.\n" +
                            "Çin İmparatoru son bir elçi yolladı: 'Geri dönerseniz Doğu Türkistan'ı size veririm ve vergi öderim. Ama girerseniz şehri yakarım, size enkaz bırakırım.'\n" +
                            "Askerler zafer sarhoşu, şehre girip tarihi bir fetih yapmak istiyorlar. Ama şehir yanarsa ganimet alamayız.\n";
            this.cevaplar = new String[]{
                    "Tarih yazmaya geldik, pazarlığa değil! Pekin'e girilecek! Turan bayrağı Yasak Şehir'e dikilecek!",
                    "Zafer zaten kazanıldı, şehri yakıp kül etmeyelim. Anlaşmayı kabul edin. Doğu Türkistan ebediyen bizimdir."
            };
            olayMuzigi.oynat("2/Chapter3_39.mp3");

        } else if (mevcutYol.equals("CUMHURIYET")) {
            this.metin =
                    "Kadın Hakları Savunucusu Nezihe Muhiddin Hanım:\n" +
                            "Paşam, medeni kanunla bize boşanma ve miras hakkı verdiniz, sağ olun.\n" +
                            "Ancak Türk kadını vatanı savunurken ön saftaydı, şimdi neden sandıkta yok?\n" +
                            "Seçme ve seçilme hakkı istiyoruz. Meclis'teki erkekler 'Kadının aklı ermez' diye itiraz ediyor.\n";
            this.cevaplar = new String[]{
                    "Haklısınız! Türk kadını o meclisteki çoğu erkekten daha yiğittir. Seçme ve seçilme hakkı derhal verilsin!",
                    "Toplum henüz buna hazır değil Nezihe Hanım. Şimdilik belediye seçimleriyle başlayalım, vekilliği sonra düşünürüz."
            };
            olayMuzigi.oynat("3/Chapter3_39.mp3");

        } else if (mevcutYol.equals("SERIAT")) {
            this.metin =
                    "Musul Valisi:\n" +
                            "Sultanım, İngilizler Musul petrolleri üzerindeki hakkımızdan vazgeçmemiz için tehdit ediyor.\n" +
                            "'Ya petrolü bize bırakırsınız ya da Kürt aşiretlerini size karşı ayaklandırırız' diyorlar.\n" +
                            "Şeriat hükmünce 'Kafire haraç (toprak) vermek' caiz değildir ama savaşı göze alabilir miyiz?\n";
            this.cevaplar = new String[]{
                    "Bir karış toprak veren, yarın sarığını da verir! Savaşsa savaş! Musul bizimdir!",
                    "Hile-i şeriye yapalım. Toprağı vermeyelim ama işletme hakkını 99 yıllığına kiralayalım. Parayı alıp orduyu güçlendirelim."
            };
            olayMuzigi.oynat("4/Chapter3_39.mp3");

        } else if (mevcutYol.equals("PARCALANMA") || mevcutYol.equals("MANDA")) {
            this.metin =
                    "Büyük Taarruz Öncesi (Afyon):\n" +
                            "Yunan ordusu Afyon'da çok güçlü bir savunma hattı kurdu. 'Türkler burayı 6 ayda aşamaz' diyorlar.\n" +
                            "Kurmaylar 'Cepheden saldıralım' diyor. Mustafa Kemal Paşa ise riskli bir plan öneriyor:\n" +
                            "'Ordunun büyük kısmını gece gizlice güneye kaydıralım (Şuhut), düşmanın beklemediği yerden, böğründen vuralım.'\n" +
                            "Ama bu kaydırma sırasında fark edilirsek imha oluruz.\n";
            this.cevaplar = new String[]{
                    "Büyük risk, büyük zafer getirir! Kemal Paşa'nın planını uygulayın. Gece yürüyüşü başlasın!",
                    "Ordunun yerini değiştirmek çok tehlikeli. Klasik cephe taarruzu yapalım. Topçularımız yolu açsın."
            };
            olayMuzigi.oynat("5/Chapter3_39.mp3");
        }

        soruSor();

        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int secim = sc.nextInt();
            sc.nextLine();
            olayMuzigi.durdur();

            if (mevcutYol.equals("TARIHSEL")) {
                if (secim == 1) {
                    yesilYaz("\n*** GENERAL MAUDE ÖLDÜ ***\n");
                    System.out.println("Suikast başarılı! İngiliz komuta kademesi şokta.");
                    System.out.println("Zehirli sular İngiliz askerini kırdı geçirdi. Bağdat'ta tutunacak gücümüz arttı.");

                    indikatorlerCh3.setAskerMorali(indikatorlerCh3.getAskerMorali() - 1); // Kirli savaş askeri bozdu
                    indikatorlerCh3.bolgeGuncelle("Irak", 5);
                    indikatorlerCh3.setIkmalDurumu(indikatorlerCh3.getIkmalDurumu() - 2); // Bomba maliyeti
                    indikatorlerCh3.setOrduGucu(indikatorlerCh3.getOrduGucu() + 1);
                    indikatorlerCh3.setSubayDestegi(indikatorlerCh3.getSubayDestegi() + 2); // Zeka takdir edildi
                } else {
                    kirmiziYaz("\n*** BAĞDAT ELVEDA ***\n");
                    System.out.println("Savunmada kaldıkça İngilizler güçlendi.");
                    System.out.println("Şehir düştü, Halife'nin şehri gavurun eline geçti.");

                    indikatorlerCh3.setAskerMorali(indikatorlerCh3.getAskerMorali() + 1); // Onurlu duruş
                    indikatorlerCh3.bolgeGuncelle("Irak", -5);
                    indikatorlerCh3.setOrduGucu(indikatorlerCh3.getOrduGucu() - 2);
                    indikatorlerCh3.setSubayDestegi(indikatorlerCh3.getSubayDestegi() - 1);
                }

            } else if (mevcutYol.equals("TURAN")) {
                if (secim == 1) {
                    yesilYaz("\n*** PEKİN FATİHİ ***\n");
                    System.out.println("Yasak Şehir düştü! İmparator kaçtı. Asya'nın kalbi artık Türk'ün elinde.");
                    System.out.println("Bütün dünya titriyor.");
                    indikatorlerCh3.setOrduGucu(indikatorlerCh3.getOrduGucu() + 3);
                    indikatorlerCh3.setItilafIliskisi(0); // Dünya düşman oldu
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() + 5);
                } else {
                    yesilYaz("\n*** MANTIK EVLİLİĞİ ***\n");
                    System.out.println("Anlaşma yapıldı. Doğu Türkistan kurtuldu, ordu yorulmadan büyük kazanç sağladı.");
                    indikatorlerCh3.setIkmalDurumu(indikatorlerCh3.getIkmalDurumu() + 5);
                    indikatorlerCh3.setSavasTehlikesi(indikatorlerCh3.getSavasTehlikesi() - 2);
                }

            } else if (mevcutYol.equals("CUMHURIYET")) {
                if (secim == 1) {
                    yesilYaz("\n*** TÜRK KADINI SAHNEDE ***\n");
                    System.out.println("Dünyanın pek çok ülkesinden önce Türk kadınına hakları verildi.");
                    System.out.println("Modernleşme yolunda dev bir adım.");
                    indikatorlerCh3.setItilafIliskisi(indikatorlerCh3.getItilafIliskisi() + 3);
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() - 2); // Muhafazakarlar tepkili
                } else {
                    kirmiziYaz("\n*** EKSİK DEMOKRASİ ***\n");
                    System.out.println("Kadınlar hayal kırıklığına uğradı. Devrimler yarım kaldı.");
                    indikatorlerCh3.setSubayDestegi(indikatorlerCh3.getSubayDestegi() - 1);
                }

            } else if (mevcutYol.equals("SERIAT")) {
                if (secim == 1) {
                    kirmiziYaz("\n*** MUSUL SAVAŞI ***\n");
                    System.out.println("İngilizlerle sıcak çatışma başladı. Aşiretler İngiliz altınıyla bize saldırıyor.");
                    indikatorlerCh3.setOrduGucu(indikatorlerCh3.getOrduGucu() - 3);
                    indikatorlerCh3.setSavasTehlikesi(5);
                } else {
                    yesilYaz("\n*** PETROL GELİRİ ***\n");
                    System.out.println("Para akıyor ama toprak kağıt üzerinde İngiliz mandasında kaldı.");
                    System.out.println("Hazine doldu, onur zedelendi.");
                    indikatorlerCh3.setIkmalDurumu(indikatorlerCh3.getIkmalDurumu() + 5);
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() - 2);
                }

            } else { // PARCALANMA veya MANDA
                if (secim == 1) {
                    yesilYaz("\n*** DAHİYANE PLAN ***\n");
                    System.out.println("Gece yürüyüşü fark edilmedi. Sabahın ilk ışıklarında Yunan ordusunu arkadan vurduk!");
                    System.out.println("Düşman neye uğradığını şaşırdı, hatlar çöküyor!");
                    indikatorlerCh3.setOrduGucu(indikatorlerCh3.getOrduGucu() + 4);
                    indikatorlerCh3.setSubayDestegi(indikatorlerCh3.getSubayDestegi() + 5);
                    indikatorlerCh3.setAskerMorali(indikatorlerCh3.getAskerMorali() + 4);
                } else {
                    kirmiziYaz("\n*** KANLI DUVAR ***\n");
                    System.out.println("Cepheden saldırdık. Yunan tahkimatı çok güçlüydü. Binlerce şehit vererek durduk.");
                    System.out.println("Taarruz hızı kesildi.");
                    indikatorlerCh3.setOrduGucu(indikatorlerCh3.getOrduGucu() - 4);
                    indikatorlerCh3.setAskerMorali(indikatorlerCh3.getAskerMorali() - 3);
                }
            }

        } else {
            olayMuzigi.durdur();
            throw new ArithmeticException("Lütfen sadece sayı giriniz.");
        }
    }
}