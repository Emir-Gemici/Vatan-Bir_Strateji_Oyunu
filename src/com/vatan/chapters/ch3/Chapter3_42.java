package com.vatan.chapters.ch3;

import com.vatan.core.*;
import java.util.Scanner;

public class Chapter3_42 extends Olay<IndikatorlerCh3> {

    public Chapter3_42() {
        super("", new String[]{});
    }

    @Override
    public void oynat(IndikatorlerCh3 indikatorlerCh3) {
        String mevcutYol = indikatorlerCh3.getOyunYolu();
        MuzikKutusu olayMuzigi = new MuzikKutusu();

        if (mevcutYol.equals("TARIHSEL")) {
            this.metin =
                    "Ahmet İzzet Paşa:\n" +
                            "Enver, aldığım duyumlara göre Ruslarla Erzincan Mütarekesi yapacakmışız.\n" +
                            "Lakin bu mütarekenin güvenilir olduğuna emin miyiz?\n" +
                            "Yani sadette Rus gavurundan bahsediyoruz, sağı solu belli olmaz.\n";
            this.cevaplar = new String[]{
                    "Merak etme Ahmet Paşa, hünkarımız böyle buyurduysa vardır bir bildiği. Biz emre itaat edelim.",
                    "Haklısın Ahmet Paşa, padişah Rusların tuzak kurmuş olabileceğini hesaba katmamış olsa gerek. Tedbiri elden bırakmayalım."
            };
            olayMuzigi.oynat("1/Chapter3_42.mp3");

        } else if (mevcutYol.equals("TURAN")) {
            this.metin =
                    "Devlet Katibi:\n" +
                            "Büyük Hakanım! Çin'i fethettik ama bu devasa bürokrasiyi yönetecek yetişmiş adamımız az.\n" +
                            "Esir aldığımız Çinli alimler ve bürokratlar, 'Bizi affedin, devleti sizin adınıza yönetelim' diyorlar.\n" +
                            "Tarihte atalarımız Çinli memurları kullanınca zamanla asimile olup Çinlileştiler. Ne yapalım?\n";
            this.cevaplar = new String[]{
                    "Devlet akılla yönetilir. Çinli memurları kullanın ama başlarına Türk müfettişler dikin. Düzen bozulmasın.",
                    "Türk'ün devleti Türk'e emanettir! Çinli bürokratların hepsini sürün. Gerekirse devlet yavaş işlesin ama bizim olsun."
            };
            olayMuzigi.oynat("2/Chapter3_42.mp3");

        } else if (mevcutYol.equals("CUMHURIYET")) {
            this.metin =
                    "Türk Dil Kurumu Başkanı:\n" +
                            "Paşam, ulus bilincini perçinlemek için 'Güneş Dil Teorisi'ni geliştirdik.\n" +
                            "Bu teoriye göre dünyadaki tüm diller Türkçeden türemiştir. Bunu okullarda okutursak milli gurur şahlanır.\n" +
                            "Bazı akademisyenler 'Bu bilimsel değil, dünya bize güler' diyor ama siyaseten işimize gelir.\n";
            this.cevaplar = new String[]{
                    "Tarih ve dil tezimiz haktır! Bu teoriyi müfredata koyun. Türk'ün büyüklüğünü herkes öğrenecek!",
                    "Bilimden sapmayalım. Milli gurur yalanla inşa edilmez. Teori rafa kaldırılsın."
            };
            olayMuzigi.oynat("3/Chapter3_42.mp3");

        } else if (mevcutYol.equals("SERIAT")) {
            this.metin =
                    "Maliye Nazırı:\n" +
                            "Sultanım, Düyun-u Umumiye (Dış Borçlar İdaresi) alacaklarını tahsil etmek istiyor.\n" +
                            "Ancak bu borçların çoğu 'Faiz' (Riba) üzerine kuruludur. Şeriat faizi kesinlikle haram kılar.\n" +
                            "Ödemeyi reddedersek Batılılar donanma gönderir. Ödersek Allah'ın emrine karşı geliriz.\n";
            this.cevaplar = new String[]{
                    "Allah'a harp ilan edemeyiz! Faiz ödemesi durdurulsun! Gerekirse cihad ederiz ama haram yemeyiz.",
                    "Zaruret hali vardır. Devletin bekası için borçları yapılandırıp ödeyelim. Allah affetsin."
            };
            olayMuzigi.oynat("4/Chapter3_42.mp3");

        } else if (mevcutYol.equals("PARCALANMA") || mevcutYol.equals("MANDA")) {
            this.metin =
                    "Çanakkale Krizi (İzmir'den Sonra):\n" +
                            "Paşam! Ordumuz İzmir'den sonra İstanbul'a ve Çanakkale'ye yöneldi. Karşımızda İngiliz işgal kuvvetleri var.\n" +
                            "İngiliz komutan 'Bir adım daha atarsanız ateş açarız' diyor. Ama İngiliz kamuoyu savaştan bıkmış durumda.\n" +
                            "Bu bir blöf olabilir. Üzerlerine yürürsek savaşmadan çekilebilirler ya da 2. Dünya Savaşı çıkar.\n";
            this.cevaplar = new String[]{
                    "Gözlerinin içine bakın ve yürüyün! İngilizler blöf yapıyor, yeni bir savaşı göze alamazlar! Hedef İstanbul!",
                    "Durun! Diplomatik zafer yakındır. Mudanya'da masaya oturalım. Kan dökmeden İstanbul'u alalım."
            };
            olayMuzigi.oynat("5/Chapter3_42.mp3");
        }

        soruSor();

        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int secim = sc.nextInt();
            sc.nextLine();
            olayMuzigi.durdur();

            if (mevcutYol.equals("TARIHSEL")) {
                if (secim == 1) {
                    yesilYaz("\n*** RUSLAR ÇEKİLİYOR ***\n");
                    System.out.println("Padişah haklı çıktı. Bolşevikler iç savaşla meşgul olduğu için Anadolu'yu boşaltıyor.");
                    System.out.println("Erzincan ve Doğu illeri savaşsız kurtuluyor.");

                    indikatorlerCh3.bolgeGuncelle("Kafkas", 5);
                    indikatorlerCh3.setPadisahDestegi(indikatorlerCh3.getPadisahDestegi() + 3);
                    indikatorlerCh3.setSubayDestegi(indikatorlerCh3.getSubayDestegi() - 2); // Subaylar hala şüpheci
                } else {
                    kirmiziYaz("\n*** GÜVENSİZLİK ***\n");
                    System.out.println("Ruslar çekilse de subayların tedbirli davranması süreci yavaşlattı.");
                    System.out.println("Ermeni çeteleri boşluğu fırsat bilip bazı köyleri yaktı.");

                    indikatorlerCh3.bolgeGuncelle("Kafkas", -1);
                    indikatorlerCh3.setPadisahDestegi(indikatorlerCh3.getPadisahDestegi() - 4);
                    indikatorlerCh3.setSubayDestegi(indikatorlerCh3.getSubayDestegi() + 3);
                }

            } else if (mevcutYol.equals("TURAN")) {
                if (secim == 1) {
                    yesilYaz("\n*** İDARİ DÜZEN ***\n");
                    System.out.println("Devlet çarkları dönmeye başladı. Vergi toplanıyor, asayiş berkemal.");
                    System.out.println("Türk müfettişler kontrolü elden bırakmıyor.");
                    indikatorlerCh3.setIkmalDurumu(indikatorlerCh3.getIkmalDurumu() + 3);
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() - 1);
                } else {
                    kirmiziYaz("\n*** BÜROKRATİK KAOS ***\n");
                    System.out.println("Tecrübeli memurlar gidince işler durdu. Şehirlerde çöp dağları birikti.");
                    System.out.println("Halk hizmet alamayınca isyan etmeye başladı.");
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() - 3);
                    indikatorlerCh3.setIkmalDurumu(indikatorlerCh3.getIkmalDurumu() - 2);
                }

            } else if (mevcutYol.equals("CUMHURIYET")) {
                if (secim == 1) {
                    yesilYaz("\n*** MİLLİ ROMANTİZM ***\n");
                    System.out.println("Gençlik milli şuurla doldu taştı. Devletin ideolojisi sağlamlaştı.");
                    System.out.println("Bilim dünyası mesafeli dursa da halk mutlu.");
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() + 3);
                    indikatorlerCh3.setItilafIliskisi(indikatorlerCh3.getItilafIliskisi() - 1);
                } else {
                    yesilYaz("\n*** AKILCI YAKLAŞIM ***\n");
                    System.out.println("Üniversiteler özerk kaldı. Bilimsel saygınlığımız korundu.");
                    indikatorlerCh3.setSubayDestegi(indikatorlerCh3.getSubayDestegi() - 1); // Milliyetçiler kırgın
                }

            } else if (mevcutYol.equals("SERIAT")) {
                if (secim == 1) {
                    kirmiziYaz("\n*** MALİ ABLUKA ***\n");
                    System.out.println("Batılı devletler tüm varlıklarımıza el koydu. Donanmaları limanlarımıza demirledi.");
                    System.out.println("Ekonomik kriz kapıda.");
                    indikatorlerCh3.setSavasTehlikesi(indikatorlerCh3.getSavasTehlikesi() + 3);
                    indikatorlerCh3.setIkmalDurumu(indikatorlerCh3.getIkmalDurumu() - 5);
                } else {
                    yesilYaz("\n*** EHVNE-İ ŞER ***\n");
                    System.out.println("Borçlar ödendi, savaş çıkmadı. Radikaller sizi 'Faizci' ilan etti.");
                    indikatorlerCh3.setIkmalDurumu(indikatorlerCh3.getIkmalDurumu() - 2);
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() - 2);
                }

            } else { // PARCALANMA veya MANDA
                if (secim == 1) {
                    yesilYaz("\n*** İNGİLİZLER ÇEKİLDİ ***\n");
                    System.out.println("Blöf tuttu! İngiliz askeri silah atmadan tellerden geri çekildi.");
                    System.out.println("Mehmetçik İstanbul kapılarına dayandı. Lozan'a elimiz çok güçlü gidiyoruz!");
                    indikatorlerCh3.setOrduGucu(indikatorlerCh3.getOrduGucu() + 2);
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() + 5);
                    indikatorlerCh3.setItilafIliskisi(indikatorlerCh3.getItilafIliskisi() + 2); // Saygı duydular
                } else {
                    yesilYaz("\n*** MUDANYA MÜTAREKESİ ***\n");
                    System.out.println("Masada kazandık. Trakya savaşmadan kurtarıldı.");
                    System.out.println("Askerin burnu bile kanamadı.");
                    indikatorlerCh3.setOrduGucu(indikatorlerCh3.getOrduGucu() + 1);
                    indikatorlerCh3.setSubayDestegi(indikatorlerCh3.getSubayDestegi() + 2);
                }
            }

        } else {
            olayMuzigi.durdur();
            throw new ArithmeticException("Lütfen sadece sayı giriniz.");
        }
    }
}