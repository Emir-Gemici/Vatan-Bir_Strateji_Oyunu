package com.vatan.chapters.ch3;

import com.vatan.core.*;
import java.util.Scanner;

public class Chapter3_52 extends Olay<IndikatorlerCh3> {

    public Chapter3_52() {
        super("", new String[]{});
    }

    @Override
    public void oynat(IndikatorlerCh3 indikatorlerCh3) {
        String mevcutYol = indikatorlerCh3.getOyunYolu();
        MuzikKutusu olayMuzigi = new MuzikKutusu();

        // DİKKAT: KOMÜNİST YOL 55. SORUDA AÇILACAĞI İÇİN BURADA YER ALMAZ.

        if (mevcutYol.equals("TARIHSEL")) {
            this.metin =
                    "Cemal Paşa (Berlin'de Bir Park):\n" +
                            "Enver, istersen bu yoldan vazgeçelim. Hem bu komünistlerin bizi tam destekleyip desteklemeyeceğini bilemeyiz.\n" +
                            "Bak görüyorsun birçok kaza vs. atlattık. Hatta Litvanya'da seni tutukladılar, casus sanıp hapse attılar.\n" +
                            "Bence bu işe değmez. Moskova yolu bize kapalı Enver. Talat'ı da kaybettik, sıra bize geliyor.\n";
            this.cevaplar = new String[]{
                    "Davamız için oraya gidip onlarla konuşmalıyız Cemal. Olmazsa bir daha deneyip gitmeliyiz. Söz konusu vatan ve Orta Asya'daki kardeşlerimiz.",
                    "En iyisi uygun zamanı kollayalım. Şuan çok fazla şey yaşadık ve bizi yeni saldıkları için ortalık epey karıştı. Biraz bekleyelim."
            };
            olayMuzigi.oynat("1/Chapter3_52.mp3");

        } else if (mevcutYol.equals("TURAN")) {
            this.metin =
                    "Turan Kurultayı (Dil Komisyonu):\n" +
                            "Büyük Hakanım! İmparatorluğun bir ucunda Arap alfabesi, diğer ucunda Kiril, öbüründe Çin harfleri kullanılıyor.\n" +
                            "Birliğimiz için 'Ortak Alfabe' şarttır. Hangi harfleri kabul edelim?\n" +
                            "Atalarımızın Göktürk harflerini mi, Batı'nın Latin harflerini mi, yoksa İslam'ın Arap harflerini mi?\n";
            this.cevaplar = new String[]{
                    "Özümüze dönüyoruz! Göktürk (Orhun) alfabesi devletin resmi yazısıdır. Herkes öğrenecek!",
                    "İlim Batı'dadır. Latin alfabesine geçiyoruz. Hem öğrenmesi kolay hem dünyaya entegre oluruz."
            };
            olayMuzigi.oynat("2/Chapter3_52.mp3");

        } else if (mevcutYol.equals("CUMHURIYET")) {
            this.metin =
                    "İstiklal Mahkemesi Reisi:\n" +
                            "Paşam, isyan bastırıldı. Şeyh Sait ve 46 elebaşı idama mahkum edildi.\n" +
                            "Ancak Batı basını ve içerideki bazı çevreler 'Merhamet' çağrısı yapıyor.\n" +
                            "İdamları hemen infaz edelim mi, yoksa sürgüne mi çevirelim?\n";
            this.cevaplar = new String[]{
                    "Vatana ihanetin affı olmaz! İbret-i alem için hüküm derhal infaz edilsin!",
                    "Yeterince kan aktı. İdamlar onları şehit mertebesine yükseltir. Müebbet hapse çevirelim."
            };
            olayMuzigi.oynat("3/Chapter3_52.mp3");

        } else if (mevcutYol.equals("SERIAT")) {
            this.metin =
                    "Ticaret Nazırı:\n" +
                            "Sultanım, Hicri takvim ve Alaturka saat yüzünden Batı ile ticarette büyük sorunlar yaşıyoruz.\n" +
                            "Tren saatleri tutmuyor, banka günleri karışıyor.\n" +
                            "Devlet işlerinde Miladi takvim ve 24 saatlik sisteme geçelim mi? Ulema buna 'Gavur adeti' diyor.\n";
            this.cevaplar = new String[]{
                    "Ticaretin dini olmaz. Devlet işlerinde Miladi takvim kullanılacak. Hicri takvim ibadette kalsın.",
                    "Zamanımızı da Batı'ya satmayacağız! Hicri takvim İslam'ın nişanesidir. Değişiklik yok!"
            };
            olayMuzigi.oynat("4/Chapter3_52.mp3");

        } else if (mevcutYol.equals("PARCALANMA") || mevcutYol.equals("MANDA")) {
            this.metin =
                    "Dışişleri Bakanı:\n" +
                            "Paşam, İngilizler Musul konusunda bizi sıkıştırıyor. Milletler Cemiyeti aleyhimize karar verecek gibi.\n" +
                            "Ya Musul'dan vazgeçeceğiz ya da savaşı göze alacağız. Ordumuz henüz toparlanamadı.\n" +
                            "İngilizlere 'Savaşırız' diye blöf yapalım mı?\n";
            this.cevaplar = new String[]{
                    "Musul Türk'tür! Blöf değil, gerekirse savaşırız! Ordu sınıra kaydırılsın.",
                    "Gerçekçi olalım, yeni bir savaşı kaldıramayız. Masada petrol payı karşılığında anlaşmaya çalışın."
            };
            olayMuzigi.oynat("5/Chapter3_52.mp3");
        }

        soruSor();

        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int secim = sc.nextInt();
            sc.nextLine();
            olayMuzigi.durdur();

            if (mevcutYol.equals("TARIHSEL")) {
                if (secim == 1) {
                    yesilYaz("\n*** İNATÇI KEÇİ ***\n");
                    System.out.println("Cemal Paşa başını iki yana salladı: 'Senin bu inadın bir gün başımızı yiyecek Enver.'");
                    System.out.println("Ama gözlerindeki ateş onu da ikna etti. Moskova yolu göründü. Sovyetler kararlılığınızı takdir etti.");
                    indikatorlerCh3.setIttifakIliskisi(indikatorlerCh3.getIttifakIliskisi() + 2); // Sovyet desteği
                    indikatorlerCh3.setAskerMorali(indikatorlerCh3.getAskerMorali() + 1);
                } else {
                    kirmiziYaz("\n*** ZAMAN KAYBI ***\n");
                    System.out.println("Bekledikçe fırsatlar kaçıyor. Mustafa Kemal Anadolu'da güçlenirken siz burada paslanıyorsunuz.");
                    System.out.println("Sovyetler sizin çekimserliğinizi zayıflık olarak gördü.");
                    indikatorlerCh3.setIttifakIliskisi(indikatorlerCh3.getIttifakIliskisi() - 2);
                }

            } else if (mevcutYol.equals("TURAN")) {
                if (secim == 1) {
                    yesilYaz("\n*** TAŞA KAZINAN TARİH ***\n");
                    System.out.println("Göktürk alfabesi milli şuuru şahlandırdı. Ama okuma-yazma oranı düştü.");
                    System.out.println("Dünya ile iletişim zorlaştı.");
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() + 2);
                    indikatorlerCh3.setItilafIliskisi(indikatorlerCh3.getItilafIliskisi() - 2);
                } else {
                    yesilYaz("\n*** MEDENİYET KÖPRÜSÜ ***\n");
                    System.out.println("Latin harfleriyle okuma yazma seferberliği başladı. Batı bilimi hızla çevriliyor.");
                    indikatorlerCh3.setIkmalDurumu(indikatorlerCh3.getIkmalDurumu() + 3);
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() - 1);
                }

            } else if (mevcutYol.equals("CUMHURIYET")) {
                if (secim == 1) {
                    yesilYaz("\n*** OTORİTE ***\n");
                    System.out.println("İdamlar gerçekleşti. Doğu sessizliğe büründü. Cumhuriyetin gücü hissedildi.");
                    indikatorlerCh3.setSubayDestegi(indikatorlerCh3.getSubayDestegi() + 2);
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() - 2);
                } else {
                    kirmiziYaz("\n*** ZAFİYET ***\n");
                    System.out.println("İdam edilmeyenler hapisten kaçıp tekrar dağa çıktı. İsyan bitmedi, sadece ertelendi.");
                    indikatorlerCh3.setSavasTehlikesi(indikatorlerCh3.getSavasTehlikesi() + 2);
                }

            } else if (mevcutYol.equals("SERIAT")) {
                if (secim == 1) {
                    yesilYaz("\n*** TİCARİ ENTEGRASYON ***\n");
                    System.out.println("Banka ve borsa canlandı. Ekonomi nefes aldı.");
                    System.out.println("Ulema homurdansa da tüccarlar memnun.");
                    indikatorlerCh3.setIkmalDurumu(indikatorlerCh3.getIkmalDurumu() + 4);
                    indikatorlerCh3.setPadisahDestegi(indikatorlerCh3.getPadisahDestegi() - 2);
                } else {
                    kirmiziYaz("\n*** EKONOMİK İZOLASYON ***\n");
                    System.out.println("Yabancı yatırımcılar ülkeden kaçtı. Saat farkı ticareti öldürüyor.");
                    indikatorlerCh3.setIkmalDurumu(indikatorlerCh3.getIkmalDurumu() - 4);
                }

            } else { // PARCALANMA veya MANDA
                if (secim == 1) {
                    yesilYaz("\n*** DİK DURUŞ ***\n");
                    System.out.println("İngilizler kararlılığınızı gördü. Savaş riskini alamadılar.");
                    System.out.println("Musul masada hala bizim kozumuz.");
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() + 3);
                    indikatorlerCh3.setSavasTehlikesi(indikatorlerCh3.getSavasTehlikesi() + 1);
                } else {
                    kirmiziYaz("\n*** MUSUL GİTTİ ***\n");
                    System.out.println("Anlaşma yapıldı. Petrol gelirinin %10'u karşılığında Musul satıldı.");
                    System.out.println("Tarih bunu affetmeyecek.");
                    indikatorlerCh3.setBolgePuan("Irak", -5);
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() - 5);
                }
            }

        } else {
            olayMuzigi.durdur();
            throw new ArithmeticException("Lütfen sadece sayı giriniz.");
        }
    }
}