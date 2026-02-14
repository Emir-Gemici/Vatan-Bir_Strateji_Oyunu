package com.vatan.chapters.ch3;

import com.vatan.core.*;
import java.util.Scanner;

public class Chapter3_35 extends Olay<IndikatorlerCh3> {

    public Chapter3_35() {
        super("", new String[]{});
    }

    @Override
    public void oynat(IndikatorlerCh3 indikatorlerCh3) {
        String mevcutYol = indikatorlerCh3.getOyunYolu();
        MuzikKutusu olayMuzigi = new MuzikKutusu();

        if (mevcutYol.equals("TARIHSEL")) {
            this.metin =
                    "Anafartalar Komutanı Miralay Mustafa Kemal:\n" +
                            "Enver Paşa Hazretleri! Çanakkale'de çöreklenen Anzak-İngiliz kuvvetlerini denize dökmek için ordumuzu hazırlamış bulunuyoruz.\n" +
                            "Maksadımız İngilizleri seri taarruzlarla deniz kıyısına itmek suretiyle çekilmeye zorlamaktır.\n" +
                            "Burada İngilizleri devirmemiz ordumuzun bir nebze rahatlamasını sağlayacaktır. Nitekim burada mevcut asker sayımız 120.000'i aştı.\n" +
                            "Eğer burada çatışmaları bitirirsek Anadolu'ya yaklaşan Rus işgaline karşı elimizde harp deneyimine haiz kuvvetli ihtiyar kuvvetleri olacaktır.\n";
            this.cevaplar = new String[]{
                    "Mantıklı duruyor Mustafa Kemal... İzin verilmiştir. Düşmanı vatanın bağrından sökmenin vakti geldi!",
                    "İngilizleri buraya çakılı tutmamız bizim ve müttefiklerimizin diğer cephelerine İngilizlerin kuvvetli takviyeler yapmasını engelliyor. Bırak burada Anzaklar açlıktan gebersinler."
            };
            olayMuzigi.oynat("1/Chapter3_35.mp3");

        } else if (mevcutYol.equals("TURAN")) {
            this.metin =
                    "Ticaret ve İkmal Sorumlusu:\n" +
                            "Büyük Hakanım! Ordumuz Çin içlerinde ilerlerken yerel savaş lordlarından 'Müslüman General Ma' bize elçi gönderdi.\n" +
                            "'Bize dokunmaz ve İpek Yolu ticaretinden pay verirseniz, size erzak sağlar ve Çin ordusuna karşı yanınızda dururuz' der.\n" +
                            "Ancak bu adamlar güvenilmezdir, parayı verene kılıç sallarlar. Yine de midemiz boşken gurur karın doyurmuyor.\n";
            this.cevaplar = new String[]{
                    "Aç ayı oynamaz! General Ma ile anlaşın. İpek Yolu'nu ortak kullanalım, yeter ki asker doysun.",
                    "Türk ordusu paralı askerlerle, hainlerle iş tutmaz! Erzaklarımızı yağma ile elde ederiz ama onurumuzdan taviz vermeyiz."
            };
            olayMuzigi.oynat("2/Chapter3_35.mp3");

        } else if (mevcutYol.equals("CUMHURIYET")) {
            this.metin =
                    "İktisat Vekili:\n" +
                            "Paşam, Dünya ekonomik buhranı kapıda. Özel teşebbüs fabrikaları kapatıyor, işsizlik artıyor.\n" +
                            "Devlet olarak ekonomiye el koymalı ve 'Devletçilik' ilkesini sert bir şekilde uygulamalıyız.\n" +
                            "Fabrikaları devlet yapsın, demiryolunu devlet döşesin. Ama bu, serbest piyasayı ve Batılı yatırımcıyı tamamen kaçırır.\n";
            this.cevaplar = new String[]{
                    "Milletin ekmeğiyle kumar oynanmaz! Devletçilik esastır. Sümerbank'ı, Etibank'ı kurun. Her şeyi devlet yapacak!",
                    "Devlet tüccarlık yapmaz. Özel sektöre teşvik verin, yabancı sermayeyi ürkütmeyin. Kriz geçicidir."
            };
            olayMuzigi.oynat("3/Chapter3_35.mp3");

        } else if (mevcutYol.equals("SERIAT")) {
            this.metin =
                    "Ulema Meclisi Reisi:\n" +
                            "Sultanım, şehir meydanlarına dikilen abideler ve resim sergileri halkın maneviyatını bozuyor.\n" +
                            "Hadis-i Şerif'te 'Tasvir (suret) yapanlara azap vardır' buyurulur. Sanat adı altında putperestlik hortluyor.\n" +
                            "Tüm heykellerin yıkılmasını ve resimlerin kamu binalarından indirilmesini talep ediyoruz.\n";
            this.cevaplar = new String[]{
                    "Haklısınız hocam! Put kırıcılık peygamber sünnetidir. Yıkın o heykelleri, indirin resimleri!",
                    "İslam sanata düşman değildir. Minyatür de, hat da, heykel de medeniyettir. Yasağa gerek yok, aşırıya kaçılmasın yeter."
            };
            olayMuzigi.oynat("4/Chapter3_35.mp3");

        } else if (mevcutYol.equals("PARCALANMA") || mevcutYol.equals("MANDA")) {
            this.metin =
                    "Cephe Karargahı (Polatlı):\n" +
                            "Paşam! Mustafa Kemal Paşa cepheyi teftiş ederken attan düştü, kaburgaları kırık. Nefes almakta zorlanıyor ama cepheyi terk etmiyor.\n" +
                            "Bazı komutanlar 'Başkomutanlık görevini fiilen Enver Paşa devralsın, hasta adamla savaş yönetilmez' diyor.\n" +
                            "Mustafa Kemal'i ziyaret edip desteğinizi mi sunacaksınız, yoksa 'Dinlenmesi lazım' diyip yetkileri mi alacaksınız?\n";
            this.cevaplar = new String[]{
                    "O benim silah arkadaşımdır! Çadırına gidiyorum. 'Geçmiş olsun Paşam, emrindeyim' diyeceğim. Birlik bozulmamalı.",
                    "Savaş şakaya gelmez. Kemal Paşa revire kaldırılsın. Başkomutanlık asası benim elimde olacak!"
            };
            olayMuzigi.oynat("5/Chapter3_35.mp3");
        }

        soruSor();

        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int secim = sc.nextInt();
            sc.nextLine();
            olayMuzigi.durdur();

            if (mevcutYol.equals("TARIHSEL")) {
                if (secim == 1) {
                    yesilYaz("\n*** ANAFARTALAR ZAFERİ ***\n");
                    System.out.println("Mustafa Kemal'in süngü hücumu İngilizleri denize döktü! Çanakkale Zaferi kesinleşti.");
                    System.out.println("Tecrübeli birlikler boşa çıktı, Anadolu savunması için umut doğdu.");

                    indikatorlerCh3.bolgeGuncelle("Canakkale", 5);
                    indikatorlerCh3.setIkmalDurumu(indikatorlerCh3.getIkmalDurumu() - 1);
                    indikatorlerCh3.setOrduGucu(indikatorlerCh3.getOrduGucu() - 1);
                    indikatorlerCh3.setSubayDestegi(indikatorlerCh3.getSubayDestegi() + 1);
                    indikatorlerCh3.setPadisahDestegi(indikatorlerCh3.getPadisahDestegi() + 2);
                } else {
                    yesilYaz("\n*** YIPRATMA SAVAŞI ***\n");
                    System.out.println("İngilizler kıyıda sıkıştı kaldı. Ne ilerleyebiliyorlar ne de kaçabiliyorlar.");
                    System.out.println("Avrupa cephesine asker kaydıramadılar ama Çanakkale ordumuz da orada çakılı kaldı.");

                    indikatorlerCh3.setIkmalDurumu(indikatorlerCh3.getIkmalDurumu() + 3); // Mühimmat harcanmadı
                    indikatorlerCh3.setSubayDestegi(indikatorlerCh3.getSubayDestegi() - 3); // Mustafa Kemal ve subaylar "saldırmadık" diye kızgın
                    indikatorlerCh3.setPadisahDestegi(indikatorlerCh3.getPadisahDestegi() - 4); // Padişah kesin zafer istiyordu
                    indikatorlerCh3.setOrduGucu(indikatorlerCh3.getOrduGucu() + 2); // Asker ölmedi
                    indikatorlerCh3.bolgeGuncelle("Canakkale", -5); // İngiliz hala toprakta
                }

            } else if (mevcutYol.equals("TURAN")) {
                if (secim == 1) {
                    yesilYaz("\n*** İPEK YOLU İTTİFAKI ***\n");
                    System.out.println("General Ma sözünü tuttu. Ordu erzak doldu.");
                    System.out.println("Ama askerler 'Paralı köpeklere muhtaç kaldık' diye homurdanıyor.");
                    indikatorlerCh3.setIkmalDurumu(indikatorlerCh3.getIkmalDurumu() + 4);
                    indikatorlerCh3.setAskerMorali(indikatorlerCh3.getAskerMorali() - 2);
                } else {
                    kirmiziYaz("\n*** ONURLU VE AÇ ***\n");
                    System.out.println("General Ma düşman safına geçti. İkmal yolları kesildi.");
                    System.out.println("Asker aç ama başı dik savaşıyor.");
                    indikatorlerCh3.setIkmalDurumu(indikatorlerCh3.getIkmalDurumu() - 3);
                    indikatorlerCh3.setAskerMorali(indikatorlerCh3.getAskerMorali() + 3);
                }

            } else if (mevcutYol.equals("CUMHURIYET")) {
                if (secim == 1) {
                    yesilYaz("\n*** DEVLET BABA ***\n");
                    System.out.println("Fabrikalar millileşti. İşsizlik azaldı, halk devlete sığındı.");
                    System.out.println("Batı sermayesi ülkeyi terk etti.");
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() + 4);
                    indikatorlerCh3.setItilafIliskisi(indikatorlerCh3.getItilafIliskisi() - 3);
                } else {
                    kirmiziYaz("\n*** SERBEST PİYASA KURBANI ***\n");
                    System.out.println("Kriz derinleşti. Özel sektör battı, halk işsiz.");
                    System.out.println("Devlet müdahale etmediği için sokaklar karıştı.");
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() - 4);
                    indikatorlerCh3.setSavasTehlikesi(indikatorlerCh3.getSavasTehlikesi() + 1);
                }

            } else if (mevcutYol.equals("SERIAT")) {
                if (secim == 1) {
                    yesilYaz("\n*** PUTLARI YIKIYORUZ ***\n");
                    System.out.println("Heykeller balyozlarla kırıldı. Ulema sizi alkışlıyor.");
                    System.out.println("Dünya basını 'Barbarlar' manşeti attı. Sanatçılar ülkeyi terk ediyor.");
                    indikatorlerCh3.setPadisahDestegi(indikatorlerCh3.getPadisahDestegi() + 4);
                    indikatorlerCh3.setItilafIliskisi(indikatorlerCh3.getItilafIliskisi() - 3);
                } else {
                    yesilYaz("\n*** ORTA YOL ***\n");
                    System.out.println("Sanata dokunulmadı. Ulema küstü ama şehirler grileşmekten kurtuldu.");
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() + 2);
                    indikatorlerCh3.setPadisahDestegi(indikatorlerCh3.getPadisahDestegi() - 3);
                }

            } else { // PARCALANMA veya MANDA
                if (secim == 1) {
                    yesilYaz("\n*** ÇADIRDA KARDEŞLİK ***\n");
                    System.out.println("Mustafa Kemal'in elini sıktınız. 'Sen dinlen Paşam, ben senin gözün kulağın olurum' dediniz.");
                    System.out.println("Orduda dedikodular bitti, moral tavan yaptı. Sakarya'ya tek yumruk gidiyoruz!");
                    indikatorlerCh3.setSubayDestegi(indikatorlerCh3.getSubayDestegi() + 5);
                    indikatorlerCh3.setAskerMorali(indikatorlerCh3.getAskerMorali() + 3);
                } else {
                    kirmiziYaz("\n*** KOMUTA KRİZİ ***\n");
                    System.out.println("Mustafa Kemal zorla kızağa çekildi. Asker 'Kemal Paşa'sız savaşmayız' diyor.");
                    System.out.println("Savaş öncesi ordu bölündü.");
                    indikatorlerCh3.setOrduGucu(indikatorlerCh3.getOrduGucu() - 3);
                    indikatorlerCh3.setSubayDestegi(indikatorlerCh3.getSubayDestegi() - 4);
                }
            }

        } else {
            olayMuzigi.durdur();
            throw new ArithmeticException("Lütfen sadece sayı giriniz.");
        }
    }
}