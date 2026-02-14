package com.vatan.chapters.ch3;

import com.vatan.core.*;
import java.util.Scanner;

public class Chapter3_51 extends Olay<IndikatorlerCh3> {

    public Chapter3_51() {
        super("", new String[]{});
    }

    @Override
    public void oynat(IndikatorlerCh3 indikatorlerCh3) {
        String mevcutYol = indikatorlerCh3.getOyunYolu();
        MuzikKutusu olayMuzigi = new MuzikKutusu();

        // DİKKAT: KOMÜNİST YOL 55. SORUDA AÇILACAĞI İÇİN BURADA YER ALMAZ.

        if (mevcutYol.equals("TARIHSEL")) {
            // ARA EVENT: Talat Paşa Suikastı (Soru başlamadan önce gerçekleşen olay)
            kirmiziYaz("\n!!! SON DAKİKA: ACI HABER !!!");
            System.out.println("Berlin'in Charlottenburg semtinde, eski Sadrazam Talat Paşa,");
            System.out.println("Soğomon Tehlirian adında bir Ermeni komiteci tarafından arkasından vurularak şehit edildi!");
            System.out.println("İttihat ve Terakki'nin beyni dağıldı...");
            System.out.println("Bu haber üzerine sürgündeki subayların morali alt üst oldu.");

            // Otomatik Stat Düşüşü
            indikatorlerCh3.setAskerMorali(indikatorlerCh3.getAskerMorali() - 4);
            System.out.println("(Asker Morali -4 azaldı)\n");

            this.metin =
                    "Alman Polisi (Kapıyı Çalar):\n" +
                            "İyi günler sayın Ali Bey (Enver Paşa'nın takma adı), bunu nasıl söyleyebilirim bilmiyorum...\n" +
                            "Sanırım bir tanıdığınız olan Ali Sai (Talat Paşa'nın takma adı), bir Ermeni komitecisi tarafından sokak ortasında öldürüldü.\n" +
                            "Başınız sağ olsun.\n";
            this.cevaplar = new String[]{
                    "Ne, nasıl? Nasıl böyle bir şey olur? Arkadaşım hiç etliye sütlüye karışmazdı. Nasıl gidip onu öldürdüler? (İçinden: Bunu yapana hesabını ödeteceğim!)",
                    "Ne, nasıl? Nasıl böyle bir şey olur? Arkadaşım hiç etliye sütlüye karışmazdı. (İçinden: Artık bunun için yapabileceğimiz bir şey yok. Davamıza odaklanmalıyız...)"
            };
            olayMuzigi.oynat("1/Chapter3_51.mp3");

        } else if (mevcutYol.equals("TURAN")) {
            this.metin =
                    "Şamanist Türkmen Beyi:\n" +
                            "Ulu Hakan! Turan ordusunda 'Allah Allah' diye hücum ediliyor ama biz Gök Tanrı'ya inanırız.\n" +
                            "Bazı komutanlar bizi zorla Müslüman yapmaya çalışıyor, sakalımızı kesiyor.\n" +
                            "Turan, sadece Müslüman Türklerin mi, yoksa bütün Türklerin mi devletidir?\n";
            this.cevaplar = new String[]{
                    "Turan ırkın birliğidir, dinin değil! Herkes inancında özgürdür. Baskı yapan komutan cezalandırılacak.",
                    "Devletin dini İslam'dır! Birlik için tek inanç gerekir. Şamanlık eski bir masaldır, hak dine dönün."
            };
            olayMuzigi.oynat("2/Chapter3_51.mp3");

        } else if (mevcutYol.equals("CUMHURIYET")) {
            this.metin =
                    "Doğu Cephesi Komutanı:\n" +
                            "Paşam! Genç Cumhuriyet'e karşı ilk büyük isyan çıktı. Şeyh Sait ve adamları 'Din elden gidiyor' diyerek ayaklandı.\n" +
                            "Elazığ ve Diyarbakır tehlikede. Musul meselesiyle uğraşırken bu isyan bizi arkadan vurdu.\n" +
                            "İsyanı bastırmak için 'Takrir-i Sükun' (Sıkıyönetim) ilan edip, İstiklal Mahkemelerini kuralım mı?\n";
            this.cevaplar = new String[]{
                    "Cumhuriyet kanla kuruldu, kanla korunur! Sıkıyönetim ilan edin. İsyancıların başı ezilsin!",
                    "Şiddet daha çok şiddet doğurur. Bölgeye heyet gönderelim, dertlerini dinleyelim. Kan dökmeyelim."
            };
            olayMuzigi.oynat("3/Chapter3_51.mp3");

        } else if (mevcutYol.equals("SERIAT")) {
            this.metin =
                    "Hicaz Valisi:\n" +
                            "Emir'ül Müminin! Arabistan'daki Vahhabiler (Suudlar), 'Türbeler şirktir' diyerek sahabe mezarlarını yıkıyor.\n" +
                            "Peygamber Efendimizin kabrine dahi yaklaşmaya cüret ettiler.\n" +
                            "Bu sapkınlığa karşı ordu gönderelim mi, yoksa 'Mezhep kavgası çıkmasın' diye kınama mesajı mı yayınlayalım?\n";
            this.cevaplar = new String[]{
                    "Peygamberin kabrine uzanan eli kırarız! Ordu Mekke'ye girsin! Vahhabileri sürün!",
                    "Savaş çıkarsa İslam alemi bölünür. Diplomatik baskı yapalım, ulemayı gönderip ikna edelim."
            };
            olayMuzigi.oynat("4/Chapter3_51.mp3");

        } else if (mevcutYol.equals("PARCALANMA") || mevcutYol.equals("MANDA")) {
            this.metin =
                    "Adalet Bakanı:\n" +
                            "Efendim, savaş bitti ama İstiklal Mahkemeleri hala çalışıyor.\n" +
                            "Muhalifler 'Savaş bitti, olağanüstü hal kalksın' diyor. Yargıçlar ise 'Devrim düşmanları bitmedi' diyor.\n" +
                            "Mahkemeleri lağvedip normal hukuka dönelim mi?\n";
            this.cevaplar = new String[]{
                    "Tehlike geçmedi. Mahkemeler devam edecek. Rejimi oturtana kadar adalet sert işleyecek.",
                    "Hukuk devleti olacağız. İstiklal Mahkemeleri kapatılsın. Normal mahkemelere dönüyoruz."
            };
            olayMuzigi.oynat("5/Chapter3_51.mp3");
        }

        soruSor();

        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int secim = sc.nextInt();
            sc.nextLine();
            olayMuzigi.durdur();

            if (mevcutYol.equals("TARIHSEL")) {
                if (secim == 1) {
                    kirmiziYaz("\n*** İNTİKAM YEMİNİ ***\n");
                    System.out.println("Gözlerinizden ateş saçarak yumruğunuzu sıktınız.");
                    System.out.println("Alman Polisi bu fevri tavrınızdan şüphelendi. Sizi 'Tehlikeli ve duygusal' buldular.");
                    System.out.println("İttifak çevrelerinde itibarınız zedelendi.");

                    indikatorlerCh3.setIttifakIliskisi(indikatorlerCh3.getIttifakIliskisi() - 1);
                } else {
                    yesilYaz("\n*** SOĞUKKANLI LİDER ***\n");
                    System.out.println("Acınızı kalbinize gömdünüz. Alman polisi bu metanetiniz karşısında saygı duydu.");
                    System.out.println("'Talat gitti ama Enver hala dimdik ayakta' dediler.");
                    System.out.println("Davaya odaklanmanız Almanların güvenini tazeledi.");

                    indikatorlerCh3.setIttifakIliskisi(indikatorlerCh3.getIttifakIliskisi() + 2);
                }

            } else if (mevcutYol.equals("TURAN")) {
                if (secim == 1) {
                    yesilYaz("\n*** GÖK TANRI'NIN ÇOCUKLARI ***\n");
                    System.out.println("Hoşgörü politikanız Asya boylarını birleştirdi. Şamanlar size dua ediyor.");
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() + 3);
                    indikatorlerCh3.setPadisahDestegi(indikatorlerCh3.getPadisahDestegi() - 2);
                } else {
                    kirmiziYaz("\n*** DİN SAVAŞI ***\n");
                    System.out.println("Şamanist boylar isyan etti. Ordu kendi halkıyla savaşıyor.");
                    indikatorlerCh3.setOrduGucu(indikatorlerCh3.getOrduGucu() - 3);
                }

            } else if (mevcutYol.equals("CUMHURIYET")) {
                if (secim == 1) {
                    yesilYaz("\n*** DEMİR YUMRUK ***\n");
                    System.out.println("İsyan sertçe bastırıldı. Cumhuriyet otoritesini kanıtladı.");
                    System.out.println("Ancak halk ile devlet arasına kan girdi.");
                    indikatorlerCh3.setSubayDestegi(indikatorlerCh3.getSubayDestegi() + 3);
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() - 2);
                } else {
                    kirmiziYaz("\n*** ZAİYET ***\n");
                    System.out.println("Müzakere süreci isyancıları cesaretlendirdi. İsyan yayıldı.");
                    indikatorlerCh3.setSavasTehlikesi(indikatorlerCh3.getSavasTehlikesi() + 2);
                }

            } else if (mevcutYol.equals("SERIAT")) {
                if (secim == 1) {
                    yesilYaz("\n*** KUTSAL SAVUNMA ***\n");
                    System.out.println("Osmanlı ordusu Vahhabileri çöle sürdü. Türbeler kurtuldu.");
                    System.out.println("İslam dünyası Halife'yi 'Dinin Koruyucusu' olarak selamladı.");
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() + 4);
                } else {
                    kirmiziYaz("\n*** TARİH YOK OLDU ***\n");
                    System.out.println("Diplomasi işe yaramadı. Tüm türbeler yıkıldı.");
                    System.out.println("Halifeliğin acizliği ortaya çıktı.");
                    indikatorlerCh3.setPadisahDestegi(indikatorlerCh3.getPadisahDestegi() - 4);
                }

            } else { // PARCALANMA veya MANDA
                if (secim == 1) {
                    kirmiziYaz("\n*** KORKU DUVARI ***\n");
                    System.out.println("Mahkemeler korku saçmaya devam ediyor. Muhalefet sindi.");
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() - 3);
                    indikatorlerCh3.setSubayDestegi(indikatorlerCh3.getSubayDestegi() + 2);
                } else {
                    yesilYaz("\n*** HUKUK ZAFERİ ***\n");
                    System.out.println("Olağanüstü hal kalktı. Halk rahat bir nefes aldı.");
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() + 3);
                }
            }

        } else {
            olayMuzigi.durdur();
            throw new ArithmeticException("Lütfen sadece sayı giriniz.");
        }
    }
}