package com.vatan.chapters.ch3;

import com.vatan.core.*;
import java.util.Scanner;

public class Chapter3_28 extends Olay<IndikatorlerCh3> {

    public Chapter3_28() {
        super("", new String[]{});
    }

    @Override
    public void oynat(IndikatorlerCh3 indikatorlerCh3) {
        String mevcutYol = indikatorlerCh3.getOyunYolu();
        MuzikKutusu olayMuzigi = new MuzikKutusu();

        if (mevcutYol.equals("TARIHSEL")) {
            this.metin =
                    "Irak Komutanı Halil Kut Paşa:\n" +
                            "Enver Paşa, Irak'ta çok zorlanıyoruz. Şu an İngilizler Nasırıye'ye saldırıyorlar.\n" +
                            "Orayı tutmamız lazım aksi taktirde İngilizler Kuzeye, Bağdat'a doğru daha çok gelecekler.\n" +
                            "Bize destek bir kuvvet yollayabilir misin? Kafkasya'dan kaydıracağın bir tümen kaderimizi değiştirir.\n";
            this.cevaplar = new String[]{
                    "Elbette Halil Paşam. Kafkasya'yı riske atma pahasına o tümeni sana yollayacağım. Bağdat düşmemeli!",
                    "Maalesef Halil Paşam. Ruslar tepemizde, biz de zar zor savunuyoruz. Kendi imkanlarınla diren."
            };
            olayMuzigi.oynat("1/Chapter3_28.mp3");

        } else if (mevcutYol.equals("TURAN")) {
            this.metin =
                    "Lojistik Subayı:\n" +
                            "Büyük Hakanım, Hazar Denizi üzerinden kurduğumuz ikmal hattı Sovyet gemileri tarafından taciz ediliyor.\n" +
                            "Türkistan içlerine ilerleyen ordumuz mühimmatsız kalmak üzere.\n" +
                            "Elimizde iki seçenek var: Ya Hazar kıyısındaki Astrahan'a saldırıp Rus donanma üssünü yok edeceğiz (Büyük Risk),\n" +
                            "Ya da tarihi İpek Yolu'nu canlandırıp karadan, deve kervanlarıyla zorlu bir ikmal hattı kuracağız (Zaman Kaybı).\n";
            this.cevaplar = new String[]{
                    "Deniz hakimiyeti olmadan Turan yaşamaz! Astrahan'a saldırın! Rus donanmasını yakın!",
                    "Rus ana karasına saldırmak intihar olur. Karadan, atadan kalma usulle kervanları düzün. Geç olsun güç olmasın."
            };
            olayMuzigi.oynat("2/Chapter3_28.mp3");

        } else if (mevcutYol.equals("CUMHURIYET")) {
            this.metin =
                    "Maliye Vekili Cavit Bey:\n" +
                            "Paşam, siyasi bağımsızlığı kazandık ama paramız hala 'Osmanlı Bankası' adındaki Fransız-İngiliz sermayeli kurumun elinde.\n" +
                            "Kendi paramızı basamıyoruz, faizleri onlar belirliyor. 'Türkiye Cumhuriyet Merkez Bankası'nı kurmanın vakti geldi.\n" +
                            "Ancak bunu yaparsak dış krediler bıçak gibi kesilir, piyasada kıtlık başlar. Göze alıyor muyuz?\n";
            this.cevaplar = new String[]{
                    "Kendi parasını basamayan devlet sömürgedir! Merkez Bankası derhal kurulsun. Kemer sıkmaya razıyız.",
                    "Ekonomi henüz bu şoku kaldıramaz Cavit Bey. Şimdilik Osmanlı Bankası ile anlaşmayı uzatın, yerli sermaye biriksin sonra kurarız."
            };
            olayMuzigi.oynat("3/Chapter3_28.mp3");

        } else if (mevcutYol.equals("SERIAT")) {
            this.metin =
                    "Kudüs Müftüsü:\n" +
                            "Emir'ül Müminin, Filistin topraklarında Siyonist yerleşimciler gizlice arazi satın alıyor.\n" +
                            "Bazı mülk sahipleri yüksek altın tekliflerine kanıp topraklarını satmakta.\n" +
                            "Şeriatımıza göre 'Dar'ül İslam' toprağı gayrimüslime satılamaz. Fetva verip satışları yasaklayalım mı, yoksa ticarete karışmayalım mı?\n";
            this.cevaplar = new String[]{
                    "Filistin Peygamber emanetidir! Toprak satan haindir, malı müsadere edilsin. Satışlar yasak!",
                    "Mülk şahıslarındır, devlet ticarete karışmaz. Ancak Siyonistlerin örgütlenmesini engelleyin."
            };
            olayMuzigi.oynat("4/Chapter3_28.mp3");

        } else if (mevcutYol.equals("PARCALANMA") || mevcutYol.equals("MANDA")) {
            this.metin =
                    "İsmet (İnönü) Bey:\n" +
                            "Paşam, Yunan ordusu Polatlı'ya dayandı. Sakarya nehrinin doğusuna çekiliyoruz.\n" +
                            "Düşmanı yavaşlatmak için acı bir karar vermemiz lazım: 'Yakıp Yıkma Taktiği'.\n" +
                            "Çekildiğimiz köyleri, tarlaları, köprüleri yakmalıyız ki Yunan ordusu ikmal bulamasın.\n" +
                            "Ama bunu yaparsak kendi halkımızı evsiz bırakacağız. Tarih bizi affeder mi?\n";
            this.cevaplar = new String[]{
                    "Vatanın kurtuluşu için gerekirse cehennemi yaşarız! Yakın! Yunan'a dikili bir ağaç bile bırakmayın!",
                    "Asla! Kendi halkımızın evini başına yıkamayız. Normal geri çekilme uygulayın, Allah yardımcımız olsun."
            };
            olayMuzigi.oynat("5/Chapter3_28.mp3");
        }

        soruSor();

        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int secim = sc.nextInt();
            sc.nextLine();
            olayMuzigi.durdur();

            if (mevcutYol.equals("TARIHSEL")) {
                if (secim == 1) {
                    yesilYaz("\n*** KUT'ÜL AMARE'NİN TEMELLERİ ***\n");
                    System.out.println("Halil Paşa aldığı destekle İngilizleri Nasırıye'de yavaşlattı. Irak cephesi tutundu.");
                    System.out.println("Ancak Kafkas cephesinden çekilen birlikler yüzünden Ruslar ilerlemeye başladı.");

                    indikatorlerCh3.setAskerMorali(indikatorlerCh3.getAskerMorali() - 2);
                    indikatorlerCh3.bolgeGuncelle("Irak", 10);
                    indikatorlerCh3.bolgeGuncelle("Kafkas", -10);
                    indikatorlerCh3.setOrduGucu(indikatorlerCh3.getOrduGucu() - 3);
                    indikatorlerCh3.setPadisahDestegi(indikatorlerCh3.getPadisahDestegi() + 1);
                    indikatorlerCh3.setSubayDestegi(indikatorlerCh3.getSubayDestegi() - 2);
                } else {
                    kirmiziYaz("\n*** IRAK'TA GERİLEYİŞ ***\n");
                    System.out.println("Halil Paşa desteksiz kaldı. İngilizler Nasırıye'yi geçti. Bağdat tehdit altında.");
                    System.out.println("Kafkas cephesini riske atmadık ama Güney kanadımız çöküyor.");

                    indikatorlerCh3.setAskerMorali(indikatorlerCh3.getAskerMorali() + 2); // Ruslara karşı güven arttı
                    indikatorlerCh3.bolgeGuncelle("Irak", -10);
                    indikatorlerCh3.bolgeGuncelle("Kafkas", 5);
                    indikatorlerCh3.setOrduGucu(indikatorlerCh3.getOrduGucu() - 1);
                    indikatorlerCh3.setPadisahDestegi(indikatorlerCh3.getPadisahDestegi() - 1);
                    indikatorlerCh3.setSubayDestegi(indikatorlerCh3.getSubayDestegi() + 2); // Subaylar stratejik kararı beğendi
                }

            } else if (mevcutYol.equals("TURAN")) {
                if (secim == 1) {
                    yesilYaz("\n*** HAZAR'IN HAKİMİ ***\n");
                    System.out.println("Baskın başarılı! Rus gemileri limanda batırıldı. İkmal yolu açıldı.");
                    System.out.println("Ancak bu saldırı ordumuzu çok yordu.");
                    indikatorlerCh3.setIkmalDurumu(indikatorlerCh3.getIkmalDurumu() + 4);
                    indikatorlerCh3.setOrduGucu(indikatorlerCh3.getOrduGucu() - 3);
                } else {
                    kirmiziYaz("\n*** KERVANLAR VURULDU ***\n");
                    System.out.println("Karadan gelen kervanlar eşkıyalarca yağmalandı. Cepheye mermi gitmiyor.");
                    indikatorlerCh3.setIkmalDurumu(indikatorlerCh3.getIkmalDurumu() - 4);
                    indikatorlerCh3.setOrduGucu(indikatorlerCh3.getOrduGucu() - 1);
                }

            } else if (mevcutYol.equals("CUMHURIYET")) {
                if (secim == 1) {
                    yesilYaz("\n*** EKONOMİK BAĞIMSIZLIK ***\n");
                    System.out.println("Merkez Bankası kuruldu! Türk Lirası artık millidir. Piyasada darlık var ama onurumuz kurtuldu.");
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() + 3);
                    indikatorlerCh3.setIkmalDurumu(indikatorlerCh3.getIkmalDurumu() - 3);
                    indikatorlerCh3.setItilafIliskisi(indikatorlerCh3.getItilafIliskisi() - 2);
                } else {
                    yesilYaz("\n*** SERMAYE AKIŞI ***\n");
                    System.out.println("Yabancı bankalarla anlaşma yenilendi. Kredi bol, refah var ama iplerimiz Londra'da.");
                    indikatorlerCh3.setIkmalDurumu(indikatorlerCh3.getIkmalDurumu() + 3);
                    indikatorlerCh3.setSubayDestegi(indikatorlerCh3.getSubayDestegi() - 2); // Milliyetçi subaylar kızgın
                }

            } else if (mevcutYol.equals("SERIAT")) {
                if (secim == 1) {
                    yesilYaz("\n*** KUTSAL TOPRAK KANUNU ***\n");
                    System.out.println("Satışlar yasaklandı. Siyonist göçü durdu. Araplar Halife'ye minnettar.");
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() + 4);
                    indikatorlerCh3.setItilafIliskisi(indikatorlerCh3.getItilafIliskisi() - 3); // İngilizler kızgın
                } else {
                    kirmiziYaz("\n*** SESSİZ İSTİLA ***\n");
                    System.out.println("Topraklar satılmaya devam ediyor. Halk 'Vatan elden gidiyor' diye isyanlarda.");
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() - 4);
                    indikatorlerCh3.setPadisahDestegi(indikatorlerCh3.getPadisahDestegi() - 2);
                }

            } else { // PARCALANMA veya MANDA
                if (secim == 1) {
                    kirmiziYaz("\n*** ACI REÇETE ***\n");
                    System.out.println("Köyler yakıldı. Yunan ordusu aç kaldı, ilerleyişi durma noktasına geldi.");
                    System.out.println("Kendi halkımızın ahı göklere yükseldi ama Ankara kurtuldu.");
                    indikatorlerCh3.setSavasTehlikesi(indikatorlerCh3.getSavasTehlikesi() - 2);
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() - 5);
                } else {
                    kirmiziYaz("\n*** DÜŞMAN KAPIDA ***\n");
                    System.out.println("Yunan ordusu sağlam köylerden erzak bulup güçlendi. Sakarya hattı çatırdıyor.");
                    indikatorlerCh3.setSavasTehlikesi(5);
                    indikatorlerCh3.setOrduGucu(indikatorlerCh3.getOrduGucu() - 2);
                }
            }

        } else {
            olayMuzigi.durdur();
            throw new ArithmeticException("Lütfen sadece sayı giriniz.");
        }
    }
}