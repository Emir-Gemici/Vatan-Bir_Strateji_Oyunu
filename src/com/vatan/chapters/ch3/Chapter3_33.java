package com.vatan.chapters.ch3;

import com.vatan.core.*;
import java.util.Scanner;

public class Chapter3_33 extends Olay<IndikatorlerCh3> {

    public Chapter3_33() {
        super("", new String[]{});
    }

    @Override
    public void oynat(IndikatorlerCh3 indikatorlerCh3) {
        String mevcutYol = indikatorlerCh3.getOyunYolu();
        MuzikKutusu olayMuzigi = new MuzikKutusu();

        if (mevcutYol.equals("TARIHSEL")) {
            this.metin =
                    "Kanal Cephesi Komutanı Cemal Paşa:\n" +
                            "Enver, durum vahim gibi. İngilizler kanalı aştılar. El-Ariş olarak tabir edilen çöldeki su kuyuları için çatışıyoruz.\n" +
                            "Üstelik görünüşe göre benzinimiz kalmadığı için Almanların yeni gönderdiği tayyareleri çalıştırmamız imkansız.\n" +
                            "Acil yardıma ihtiyacımız var! Yoksa Sina Çölü bize mezar olacak.\n";
            this.cevaplar = new String[]{
                    "Bütün cephelerde zorlanıyoruz Cemal. Sırf kanalda değil. Bizatihi payitaht tehlikede iken sana birlik kaydıramam...",
                    "Tamamdır kardeşim. Cepheye gönderilecek kuvvetlerini hazır edeceğim. Dayan!"
            };
            olayMuzigi.oynat("1/Chapter3_33.mp3");

        } else if (mevcutYol.equals("TURAN")) {
            this.metin =
                    "Japon İmparatorluğu Elçisi:\n" +
                            "Saygıdeğer Enver Paşa! Asya'daki ilerleyişinizi takdirle izliyoruz.\n" +
                            "Japonya olarak 'Asya Asyalılarındır' prensibiyle size destek vermeye hazırız.\n" +
                            "Size modern silah ve mühimmat sağlarız, karşılığında Bakü petrollerinin işletmesini 20 yıllığına Japon şirketlerine devredin.\n";
            this.cevaplar = new String[]{
                    "Anlaştık! Rus ve İngiliz ayısına karşı Japon ejderhasıyla dost olmak iyidir. İmzalar atılsın.",
                    "Türk'ün petrolü Türk'ündür! Bir sömürgeciyi kovup diğerini başımıza efendi etmeyiz. Teklif reddedildi!"
            };
            olayMuzigi.oynat("2/Chapter3_33.mp3");

        } else if (mevcutYol.equals("CUMHURIYET")) {
            this.metin =
                    "İstihbarat Raporu:\n" +
                            "Paşam, eski İttihatçı dostlarınızdan Cavid Bey ve Doktor Nazım'ın evinde gizli toplantılar yapılıyor.\n" +
                            "Sizi 'Diktatörleşmekle' ve 'Davaya ihanet etmekle' suçluyorlar.\n" +
                            "Henüz bir eylem yok ama bir suikast hazırlığı içinde olabilirler. Eski dostlarınız olmaları onları kurtarmalı mı?\n";
            this.cevaplar = new String[]{
                    "Devletin dostu olmaz! İhanetin kokusu bile yeter. Hepsini tutuklayın ve İstiklal Mahkemesi'ne verin.",
                    "Onlar benim kader arkadaşım. Yanlış yoldalar ama canlarına kast edemem. Sürgüne gönderin, gözüm görmesin."
            };
            olayMuzigi.oynat("3/Chapter3_33.mp3");

        } else if (mevcutYol.equals("SERIAT")) {
            this.metin =
                    "Medya ve Tebliğ Sorumlusu:\n" +
                            "Sultanım, 'Radyo' denilen icat her eve girmeye başladı. Gavur memleketlerden müzik ve haber yayılıyor.\n" +
                            "Ulema, 'Bu kutunun içinde şeytan var, insanları yoldan çıkarıyor' diyerek radyoların toplatılmasını istiyor.\n" +
                            "Halbuki biz bu aleti kendi propagandamız ve Kuran dinletmek için kullanabiliriz.\n";
            this.cevaplar = new String[]{
                    "Şeytan işi olduğu kesindir! Halkın ahlakı bozulmasın. Radyoları yasaklayın, toplatın.",
                    "Teknolojiyi dine hizmet ettireceğiz. Yasaklamayın, devlet radyosu kurun. Sadece Kuran ve ilahi çalınacak."
            };
            olayMuzigi.oynat("4/Chapter3_33.mp3");

        } else if (mevcutYol.equals("PARCALANMA") || mevcutYol.equals("MANDA")) {
            this.metin =
                    "Batı Cephesi Komutanlığı:\n" +
                            "Paşam, Tekalif-i Milliye emirlerine rağmen bazı köyler erzak vermemekte direniyor.\n" +
                            "Asker açlıktan çarıklarını kemiriyor. Bir köyde jandarmamıza ateş açıldı.\n" +
                            "Eğer sert tepki vermezsek otoritemiz kalmaz. O köyü ibret-i alem için yakıp, direnenleri asalım mı?\n";
            this.cevaplar = new String[]{
                    "Ordu açken erzak saklayan haindir! Gereğini yapın. İbret olsun ki diğerleri titreyip kendine gelsin.",
                    "Kendi köylümüzü mü yakacağız? Asla! İkna etmeye çalışın, zor kullanmayın. Halkı kaybedersek savaşı da kaybederiz."
            };
            olayMuzigi.oynat("5/Chapter3_33.mp3");
        }

        soruSor();

        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int secim = sc.nextInt();
            sc.nextLine();
            olayMuzigi.durdur();

            if (mevcutYol.equals("TARIHSEL")) {
                if (secim == 1) {
                    kirmiziYaz("\n*** FİLİSTİN'İN ANAHTARI KAYBOLDU ***\n");
                    System.out.println("Cemal Paşa desteksiz kaldı. Kanal harekatı hezimetle bitti.");
                    System.out.println("İngilizler Sina Çölü'nü geçip Filistin kapılarına dayandı.");

                    indikatorlerCh3.setSubayDestegi(indikatorlerCh3.getSubayDestegi() - 2);
                    indikatorlerCh3.setIkmalDurumu(indikatorlerCh3.getIkmalDurumu() + 1); // Kaynaklar elimizde kaldı
                    indikatorlerCh3.setOrduGucu(indikatorlerCh3.getOrduGucu() - 1);
                    indikatorlerCh3.setPadisahDestegi(indikatorlerCh3.getPadisahDestegi() - 1);
                    indikatorlerCh3.bolgeGuncelle("Suriye", -10); // Cephe çöküyor
                } else {
                    yesilYaz("\n*** ÇÖL KAPLANI ***\n");
                    System.out.println("Takviye birlikler Cemal Paşa'ya nefes aldırdı. İngiliz ilerleyişi yavaşlatıldı.");
                    System.out.println("Suriye cephesi şimdilik güvende ama Payitaht savunması zayıfladı.");

                    indikatorlerCh3.bolgeGuncelle("Suriye", 5);
                    indikatorlerCh3.setIkmalDurumu(indikatorlerCh3.getIkmalDurumu() - 2);
                    indikatorlerCh3.setOrduGucu(indikatorlerCh3.getOrduGucu() - 1); // Asker yoruldu
                    indikatorlerCh3.setSubayDestegi(indikatorlerCh3.getSubayDestegi() + 1);
                }

            } else if (mevcutYol.equals("TURAN")) {
                if (secim == 1) {
                    yesilYaz("\n*** YÜKSELEN GÜNEŞ ***\n");
                    System.out.println("Japon silahları cepheye ulaştı. Ordu modernleşti.");
                    System.out.println("Ancak Bakü halkı 'Petrolümüzü çaldılar' diye homurdanıyor.");
                    indikatorlerCh3.setOrduGucu(indikatorlerCh3.getOrduGucu() + 4);
                    indikatorlerCh3.setIkmalDurumu(indikatorlerCh3.getIkmalDurumu() + 3);
                    indikatorlerCh3.bolgeGuncelle("Kafkas", -5); // Halk tepkili
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() - 3);
                } else {
                    yesilYaz("\n*** TAM BAĞIMSIZLIK ***\n");
                    System.out.println("Teklifi reddettiniz. Japonya gücendi ama halkın size güveni arttı.");
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() + 3);
                    indikatorlerCh3.setItilafIliskisi(indikatorlerCh3.getItilafIliskisi() - 2); // Japonya düşman oldu
                }

            } else if (mevcutYol.equals("CUMHURIYET")) {
                if (secim == 1) {
                    kirmiziYaz("\n*** İZMİR SUİKASTI DAVASI ***\n");
                    System.out.println("Eski dostlarınız idam edildi. İttihatçı kadrolar dehşet içinde.");
                    System.out.println("Otoriteniz tartışılmaz hale geldi ama vicdanlar kanadı.");
                    indikatorlerCh3.setSubayDestegi(indikatorlerCh3.getSubayDestegi() + 4); // Korku itaati getirdi
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() - 2);
                } else {
                    yesilYaz("\n*** VEFA ***\n");
                    System.out.println("Sürgün kararı yumuşak bulundu. Muhalefet bunu zayıflık olarak görüyor.");
                    System.out.println("Ama tarihe 'kardeş katili' olarak geçmekten kurtuldunuz.");
                    indikatorlerCh3.setSubayDestegi(indikatorlerCh3.getSubayDestegi() - 3);
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() + 2);
                }

            } else if (mevcutYol.equals("SERIAT")) {
                if (secim == 1) {
                    kirmiziYaz("\n*** SESSİZLİK ***\n");
                    System.out.println("Radyolar parçalandı. Halk dünyadan bihaber kaldı.");
                    System.out.println("İletişim kopukluğu yüzünden taşrada isyanlar çıkıyor ve geç haberimiz oluyor.");
                    indikatorlerCh3.setSavasTehlikesi(indikatorlerCh3.getSavasTehlikesi() + 2);
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() - 3);
                } else {
                    yesilYaz("\n*** İSLAM'IN SESİ ***\n");
                    System.out.println("Radyodan Kuran ve fetva yayını başladı. Devletin sesi en ücra köye ulaştı.");
                    System.out.println("Modernistler müzik yok diye, yobazlar radyo var diye kızgın ama kontrol sizde.");
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() + 2);
                    indikatorlerCh3.setPadisahDestegi(indikatorlerCh3.getPadisahDestegi() - 2);
                }

            } else { // PARCALANMA veya MANDA
                if (secim == 1) {
                    kirmiziYaz("\n*** KANLI ERZAK ***\n");
                    System.out.println("Direnenler asıldı. Ordu doydu ama halk askerden nefret etmeye başladı.");
                    System.out.println("Vicdanlar yaralı.");
                    indikatorlerCh3.setIkmalDurumu(indikatorlerCh3.getIkmalDurumu() + 5); // Erzak geldi
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() - 6); // Nefret
                    indikatorlerCh3.setSubayDestegi(indikatorlerCh3.getSubayDestegi() + 2); // Disiplin
                } else {
                    kirmiziYaz("\n*** AÇ ORDU ***\n");
                    System.out.println("Köye dokunulmadı. Asker açlıktan yürüyemez hale geldi.");
                    System.out.println("Firarlar başladı.");
                    indikatorlerCh3.setOrduGucu(indikatorlerCh3.getOrduGucu() - 3);
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() + 2);
                }
            }

        } else {
            olayMuzigi.durdur();
            throw new ArithmeticException("Lütfen sadece sayı giriniz.");
        }
    }
}