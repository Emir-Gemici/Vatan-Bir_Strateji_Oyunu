package com.vatan.chapters.ch3;

import com.vatan.core.*;
import java.util.Scanner;

public class Chapter3_54 extends Olay<IndikatorlerCh3> {

    public Chapter3_54() {
        super("", new String[]{});
    }

    @Override
    public void oynat(IndikatorlerCh3 indikatorlerCh3) {
        String mevcutYol = indikatorlerCh3.getOyunYolu();
        MuzikKutusu olayMuzigi = new MuzikKutusu();

        // DİKKAT: KOMÜNİST YOL 55. SORUDA AÇILACAĞI İÇİN BURADA YER ALMAZ.

        if (mevcutYol.equals("TARIHSEL")) {
            this.metin =
                    "Bakü - Doğu Halkları Kurultayı (Kulis):\n" +
                            "Cemal Paşa:\n" +
                            "Enver şimdi, burada insanlara bir yol göstermek ve umut vermek için kürsüye çıkış yapacaksın.\n" +
                            "Salonda Bolşevikler, Asyalı devrimciler ve bizim İttihatçılar var. Ne hakkında konuşma yapmayı düşünüyorsun?\n";
            this.cevaplar = new String[]{
                    "Komünistlerin de dikkatini çok çekmemek için kendimi 'Dünya Devrimcisi' olarak tanıtmak daha makul gibi duruyor. Emperyalizme karşı ortak cephe vurgusu yapacağım.",
                    "Anadolu insanına da destek verdiğimizi belli etmemiz icap eder ki oranın durumunu da hatırlasınlar. Kendimi 'Anadolu Kurtarıcısı' ve İslam dünyasının kılıcı olarak göstereceğim."
            };
            olayMuzigi.oynat("1/Chapter3_54.mp3");

        } else if (mevcutYol.equals("TURAN")) {
            this.metin =
                    "Macaristan Büyükelçisi:\n" +
                            "Ulu Hakan! Biz Macarlar da Turan kavmiyiz, Atilla'nın torunlarıyız.\n" +
                            "Turan Birliği'ne katılmak isteriz. Ancak devletinizin 'İslami' yapısı bizi endişelendiriyor.\n" +
                            "Turan Birliği sadece Müslüman Türkleri mi kapsar, yoksa Macar ve Fin kardeşlerinizi de kucaklar mı?\n";
            this.cevaplar = new String[]{
                    "Turan kan bağıdır, din bağı değil! Macar ve Fin kardeşlerimiz başımızın tacıdır. Birliğe hoş geldiniz!",
                    "Bizim birliğimizin mayası İslam'dır. Hristiyan bir milletle birlik olamayız. Dost kalalım ama birlik yok."
            };
            olayMuzigi.oynat("2/Chapter3_54.mp3");

        } else if (mevcutYol.equals("CUMHURIYET")) {
            this.metin =
                    "Nüfus İşleri Müdürü:\n" +
                            "Paşam, 'Soyadı Kanunu' meclisten geçti. Herkes lakaplarını bırakıp Türkçe bir soyadı alacak.\n" +
                            "Siz ne soyadı almayı düşünüyorsunuz? 'Paşa' unvanı da kanunen yasaklanıyor.\n" +
                            "Halk size ne diye hitap edecek?\n";
            this.cevaplar = new String[]{
                    "Soyadım 'TÜRKKAN' olsun. Unvanlara gerek yok, milletim beni bilsin yeter.",
                    "Ben Enver Paşa olarak doğdum, öyle ölürüm! Kanun manun tanımam, Paşa unvanını kullanmaya devam edeceğim."
            };
            olayMuzigi.oynat("3/Chapter3_54.mp3");

        } else if (mevcutYol.equals("SERIAT")) {
            this.metin =
                    "Belediye Reisi:\n" +
                            "Sultanım, şehrin meydanına sizin büyük bir heykelinizi dikmek istiyoruz. Mimar planları hazırladı.\n" +
                            "Ancak medrese hocaları 'Suret ve heykel puttur, haramdır' diye fetva veriyor.\n" +
                            "Heykeli dikelim mi, yoksa projeyi iptal mi edelim?\n";
            this.cevaplar = new String[]{
                    "Yıkın o taslakları! İslam'da putçuluğa yer yok. Heykel dikmek haramdır!",
                    "Sanatın haramı olmaz. O heykel devletin gücünü gösterir. Dikilsin!"
            };
            olayMuzigi.oynat("4/Chapter3_54.mp3");

        } else if (mevcutYol.equals("PARCALANMA") || mevcutYol.equals("MANDA")) {
            this.metin =
                    "Ankara (Meclis Açılışı):\n" +
                            "Paşam! İstanbul işgal altındayken Meclis-i Mebusan dağıtıldı.\n" +
                            "Ankara'da 'Büyük Millet Meclisi'ni açıyoruz. Ancak duvarda ne yazacak?\n" +
                            "Padişah'a bağlılık mı bildirelim, yoksa 'Hakimiyet Kayıtsız Şartsız Milletindir' mi diyelim?\n";
            this.cevaplar = new String[]{
                    "Egemenlik milletindir! Padişah esirdir, hükmü yoktur. Meclis en büyük otoritedir.",
                    "Padişahımızı kurtarmak için toplandık diyelim. Halkı ürkütmeyelim. Hilafet makamına bağlıyız."
            };
            olayMuzigi.oynat("5/Chapter3_54.mp3");
        }

        soruSor();

        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int secim = sc.nextInt();
            sc.nextLine();
            olayMuzigi.durdur();

            if (mevcutYol.equals("TARIHSEL")) {
                if (secim == 1) {
                    yesilYaz("\n*** DÜNYA DEVRİMCİSİ ***\n");
                    System.out.println("Kürsüde emperyalizme ateş püskürdünüz. Bolşevikler sizi ayakta alkışladı.");
                    System.out.println("Ancak Anadolu'daki milliyetçiler, 'Enver de komünist olmuş' diye üzüldü.");
                    System.out.println("Yine de Sovyetlerin güvenini kazandınız.");

                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() + 2);
                    indikatorlerCh3.setIttifakIliskisi(indikatorlerCh3.getIttifakIliskisi() + 1); // Sovyet desteği
                } else {
                    yesilYaz("\n*** ANADOLU'NUN UMUDU ***\n");
                    System.out.println("Konuşmanızda İslam dünyasına ve Anadolu'ya selam gönderdiniz.");
                    System.out.println("Salondaki Türk delegeler gözyaşları içinde 'Enver Paşa Çok Yaşa' diye bağırdı.");
                    System.out.println("Lenin ve Zinovyev bu durumdan hiç hoşlanmadı ama halkın sevgisi muazzam.");

                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() + 4);
                    indikatorlerCh3.setIttifakIliskisi(indikatorlerCh3.getIttifakIliskisi() - 1); // Sovyetler kıskandı
                }

            } else if (mevcutYol.equals("TURAN")) {
                if (secim == 1) {
                    yesilYaz("\n*** BÜYÜK TURAN ***\n");
                    System.out.println("Macarlar ve Finler birliğe katıldı. Turan, Avrupa'nın içlerine kadar uzandı.");
                    System.out.println("Devletin teknolojik ve kültürel gücü arttı.");
                    indikatorlerCh3.setItilafIliskisi(indikatorlerCh3.getItilafIliskisi() - 2);
                    indikatorlerCh3.setIkmalDurumu(indikatorlerCh3.getIkmalDurumu() + 3);
                } else {
                    kirmiziYaz("\n*** DAR GÖRÜŞ ***\n");
                    System.out.println("Macarlar küstü. Turan ideali sadece 'Orta Asya' ile sınırlı kaldı.");
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() - 1);
                }

            } else if (mevcutYol.equals("CUMHURIYET")) {
                if (secim == 1) {
                    yesilYaz("\n*** BAY TÜRKKAN ***\n");
                    System.out.println("Sıradan bir vatandaş gibi davrandınız. Bu tevazu halkın kalbini fethetti.");
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() + 3);
                } else {
                    kirmiziYaz("\n*** PAŞA HAZRETLERİ ***\n");
                    System.out.println("Kanunlara direnmek otoriteyi sarstı. 'Devlet içinde devlet' görüntüsü oluştu.");
                    indikatorlerCh3.setSubayDestegi(indikatorlerCh3.getSubayDestegi() - 2);
                }

            } else if (mevcutYol.equals("SERIAT")) {
                if (secim == 1) {
                    yesilYaz("\n*** PUTLARA VEDA ***\n");
                    System.out.println("Ulema memnun oldu. Halk 'Halife dinimizi koruyor' dedi.");
                    indikatorlerCh3.setPadisahDestegi(indikatorlerCh3.getPadisahDestegi() + 3);
                } else {
                    kirmiziYaz("\n*** FİTNE ***\n");
                    System.out.println("Heykel dikilince gece yarısı saldırıya uğradı. Toplum bölündü.");
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() - 3);
                }

            } else { // PARCALANMA veya MANDA
                if (secim == 1) {
                    yesilYaz("\n*** MİLLETİN MECLİSİ ***\n");
                    System.out.println("Dualarla Meclis açıldı. Anadolu'nun tek sesi Ankara oldu.");
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() + 5);
                    indikatorlerCh3.setPadisahDestegi(0); // Padişah bitti
                } else {
                    kirmiziYaz("\n*** İKİLEM ***\n");
                    System.out.println("Padişah vurgusu devrim ateşini söndürdü. Meclis etkisiz kaldı.");
                    indikatorlerCh3.setAskerMorali(indikatorlerCh3.getAskerMorali() - 2);
                }
            }

        } else {
            olayMuzigi.durdur();
            throw new ArithmeticException("Lütfen sadece sayı giriniz.");
        }
    }
}