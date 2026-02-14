package com.vatan.chapters.ch3;

import com.vatan.core.*;
import java.util.Scanner;

public class Chapter3_40 extends Olay<IndikatorlerCh3> {

    public Chapter3_40() {
        super("", new String[]{});
    }

    @Override
    public void oynat(IndikatorlerCh3 indikatorlerCh3) {
        String mevcutYol = indikatorlerCh3.getOyunYolu();
        MuzikKutusu olayMuzigi = new MuzikKutusu();

        if (mevcutYol.equals("TARIHSEL")) {
            this.metin =
                    "Cemal Paşa:\n" +
                            "Enver, Gazze'de işler kötüye gidiyor. Senin yardımına ihtiyacımız var.\n" +
                            "İngilizler yalın insan kuvvetiyle bizi aşamayacaklarını anlayınca 'Tank' denilen çelik canavarlarla üstümüze gelmeye çalışıyorlar.\n" +
                            "Mavzer kurşunu bunlara işlemiyor. Senden elinde bulunan topların ve tankı imhada işimize yarayacak silahların bir kısmını istiyoruz.\n";
            this.cevaplar = new String[]{
                    "Derhal size teslim ediyorum Cemal Paşam. Gazze düşerse Kudüs düşer!",
                    "Maalesef paşam. Şuan bize Ruslarla ve isyancı Ermenilerle uğraşmamız için lazım olacak bu silahlar. Tanklara karşı el bombası kullanmayı deneyin."
            };
            olayMuzigi.oynat("1/Chapter3_40.mp3");

        } else if (mevcutYol.equals("TURAN")) {
            this.metin =
                    "Hava Gözcüsü:\n" +
                            "Büyük Hakanım! Japon İmparatorluğu, Pekin'i aldığımız için bize savaş ilan etti.\n" +
                            "Tepemizde 'Tayyare' filoları dolaşıyor. Bizim ordumuz karada yenilmezdir ama havada savunmasızız.\n" +
                            "Japon bombaları askerimizi kırıyor. Gobi Çölü'nün derinliklerine çekilip kum fırtınalarına mı sığınalım,\n" +
                            "Yoksa siper kazıp tüfekle uçak mı avlamaya çalışalım?\n";
            this.cevaplar = new String[]{
                    "Geri çekilmek yok! Siper kazın. O uçaklar elbet yere inecek. İneni kılıçtan geçirin!",
                    "Gökten gelen ölüme kılıç çekilmez. Çölün derinliklerine çekilin, fırtınalar bizi korusun."
            };
            olayMuzigi.oynat("2/Chapter3_40.mp3");

        } else if (mevcutYol.equals("CUMHURIYET")) {
            this.metin =
                    "Sanayici Nuri Demirağ:\n" +
                            "Paşam, 'İstikbal Göklerdedir' dediniz. Ben tamamen yerli sermayeyle uçak fabrikası kurdum, ilk Türk uçağını ürettim.\n" +
                            "Ancak Hava Kurumu, 'İngiliz uçakları daha ucuz ve denenmiş' diyerek siparişleri iptal etmek istiyor.\n" +
                            "Yabancı lobiler devrede. Yerli uçağa sahip çıkacak mısınız, yoksa hazineyi düşünüp ucuz ithal uçağı mı alacaksınız?\n";
            this.cevaplar = new String[]{
                    "Türk'ün kanadı Türk'ün elinden çıkmalıdır! İngiliz uçağı almayın, ne pahasına olursa olsun Nuri Bey'i destekleyin.",
                    "Hazine tamtakır Nuri Bey. Şimdi macera arayamayız. Ucuz ve güvenilir olan İngiliz uçaklarını alın."
            };
            olayMuzigi.oynat("3/Chapter3_40.mp3");

        } else if (mevcutYol.equals("SERIAT")) {
            this.metin =
                    "Tıbbiye Nazırı:\n" +
                            "Sultanım, orduda cerrah yetiştirmek için kadavara (ölü insan bedeni) üzerinde otopsi çalışması yapmamız lazım.\n" +
                            "Lakin Ulema, 'Ölünün hürmeti vardır, kesilip biçilemez' diye fetva vermiyor.\n" +
                            "Cerrahlarımız deneyimsiz yetişiyor, cephede yaralı askerlerimiz bu yüzden ölüyor.\n";
            this.cevaplar = new String[]{
                    "Diriyi kurtarmak için ölüye müdahale edilir! Otopsi serbesttir. İtiraz eden hocaları susturun.",
                    "Allah'ın yarattığı bedene bıçak vurulmaz. Otopsi yasaktır. Kitaplardan öğrensinler."
            };
            olayMuzigi.oynat("4/Chapter3_40.mp3");

        } else if (mevcutYol.equals("PARCALANMA") || mevcutYol.equals("MANDA")) {
            this.metin =
                    "Büyük Taarruz (3. Gün):\n" +
                            "Paşam, Yunan cephesi yarıldı! Düşman panik halinde İzmir'e kaçıyor.\n" +
                            "Fahrettin (Altay) Paşa'nın Süvari Kolordusu, düşmanın yanlarından dolaşıp kaçış yolunu kesmek istiyor.\n" +
                            "Ancak süvarilerimiz çok yorgun ve destekten yoksun. Eğer kuşatılırlarsa elimizdeki tek hareketli gücü kaybederiz.\n";
            this.cevaplar = new String[]{
                    "Ordular! İlk hedefiniz Akdeniz'dir! İleri! Fahrettin Paşa İzmir'e kadar durmasın!",
                    "Süvarileri riske atmayalım. Ana orduyla beraber güvenli bir takip yapsınlar. Yunan zaten gidiyor."
            };
            olayMuzigi.oynat("5/Chapter3_40.mp3");
        }

        soruSor();

        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int secim = sc.nextInt();
            sc.nextLine();
            olayMuzigi.durdur();

            if (mevcutYol.equals("TARIHSEL")) {
                if (secim == 1) {
                    kirmiziYaz("\n*** DOĞU SAVUNMASIZ KALDI ***\n");
                    System.out.println("Topları Gazze'ye gönderdiniz. Tanklar durduruldu ama Gazze yine de düştü.");
                    System.out.println("Bu sırada Doğu'da Ruslar topçu desteğimiz olmadığı için ilerledi.");

                    indikatorlerCh3.setAskerMorali(indikatorlerCh3.getAskerMorali() - 1);
                    indikatorlerCh3.setOrduGucu(indikatorlerCh3.getOrduGucu() - 2);
                    indikatorlerCh3.setPadisahDestegi(indikatorlerCh3.getPadisahDestegi() + 3);
                    indikatorlerCh3.setSubayDestegi(indikatorlerCh3.getSubayDestegi() - 2);
                    indikatorlerCh3.bolgeGuncelle("Kafkas", -5);
                } else {
                    yesilYaz("\n*** STRATEJİK TERCİH ***\n");
                    System.out.println("Topları vermediniz. Gazze düştü, Kudüs yolu açıldı.");
                    System.out.println("Ancak elinizdeki toplarla Doğu cephesini tuttunuz. Askeri mantık kazandı, siyaset kaybetti.");

                    indikatorlerCh3.setAskerMorali(indikatorlerCh3.getAskerMorali() + 1);
                    indikatorlerCh3.setOrduGucu(indikatorlerCh3.getOrduGucu() + 1);
                    indikatorlerCh3.setPadisahDestegi(indikatorlerCh3.getPadisahDestegi() - 3);
                    indikatorlerCh3.setSubayDestegi(indikatorlerCh3.getSubayDestegi() + 2);
                    indikatorlerCh3.bolgeGuncelle("Suriye", -10); // Filistin elden gidiyor
                }

            } else if (mevcutYol.equals("TURAN")) {
                if (secim == 1) {
                    kirmiziYaz("\n*** HAVA SALDIRISI ***\n");
                    System.out.println("Tüfekle uçak vurulmaz! Japon bombaları açık hedef olan ordumuzu mahvetti.");
                    System.out.println("Büyük kayıp verdik.");
                    indikatorlerCh3.setOrduGucu(indikatorlerCh3.getOrduGucu() - 4);
                    indikatorlerCh3.setAskerMorali(indikatorlerCh3.getAskerMorali() - 2);
                } else {
                    yesilYaz("\n*** KUM FIRTINASI ***\n");
                    System.out.println("Çöle çekildik. Japon uçakları fırtınada bizi bulamadı ve üslerine döndü.");
                    System.out.println("Orduyu koruduk ama Pekin'den uzaklaştık.");
                    indikatorlerCh3.setOrduGucu(indikatorlerCh3.getOrduGucu() + 1);
                    indikatorlerCh3.setIkmalDurumu(indikatorlerCh3.getIkmalDurumu() - 2);
                }

            } else if (mevcutYol.equals("CUMHURIYET")) {
                if (secim == 1) {
                    yesilYaz("\n*** GÖK TÜRKLERİN ***\n");
                    System.out.println("Nuri Demirağ fabrikası büyüdü. Türkiye kendi savaş uçağını üretiyor.");
                    System.out.println("Dışa bağımlılık bitti.");
                    indikatorlerCh3.setOrduGucu(indikatorlerCh3.getOrduGucu() + 3);
                    indikatorlerCh3.setItilafIliskisi(indikatorlerCh3.getItilafIliskisi() - 2);
                } else {
                    kirmiziYaz("\n*** KANITSIZ KALDIK ***\n");
                    System.out.println("Yerli fabrika iflas etti, kapısına kilit vuruldu.");
                    System.out.println("Savaş çıktığında İngilizler parça vermezse uçaklarımız hurdaya dönecek.");
                    indikatorlerCh3.setOrduGucu(indikatorlerCh3.getOrduGucu() - 2);
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() - 2);
                }

            } else if (mevcutYol.equals("SERIAT")) {
                if (secim == 1) {
                    yesilYaz("\n*** İLİM İÇİN ***\n");
                    System.out.println("Otopsi başladı. Cerrahlarımız insan anatomisini öğrendi. Yaralılar kurtuluyor.");
                    System.out.println("Ulema size 'Deccal' demeye başladı.");
                    indikatorlerCh3.setOrduGucu(indikatorlerCh3.getOrduGucu() + 3);
                    indikatorlerCh3.setPadisahDestegi(indikatorlerCh3.getPadisahDestegi() - 3);
                } else {
                    kirmiziYaz("\n*** CAHİL TABİPLER ***\n");
                    System.out.println("Doktorlar sadece dua ve merhemle tedavi etmeye çalışıyor.");
                    System.out.println("Basit yaralardan asker kaybediyoruz.");
                    indikatorlerCh3.setOrduGucu(indikatorlerCh3.getOrduGucu() - 4);
                }

            } else { // PARCALANMA veya MANDA
                if (secim == 1) {
                    yesilYaz("\n*** İZMİR'E DOĞRU ***\n");
                    System.out.println("Süvariler yıldırım gibi gitti! Yunan generali Trikoupis esir alındı.");
                    System.out.println("Düşman düzeni tamamen bozuldu. Zafer artık kesin!");
                    indikatorlerCh3.setOrduGucu(indikatorlerCh3.getOrduGucu() + 5);
                    indikatorlerCh3.setSavasTehlikesi(0); // Zafer
                    indikatorlerCh3.setSubayDestegi(indikatorlerCh3.getSubayDestegi() + 3);
                } else {
                    kirmiziYaz("\n*** YUNAN KAÇTI ***\n");
                    System.out.println("Takip yavaş olunca Yunan ordusu gemilere binip kaçtı.");
                    System.out.println("İzmir'i yaktılar. Zafer kazandık ama düşmanı tam imha edemedik.");
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() - 3); // İzmir yandı
                    indikatorlerCh3.setOrduGucu(indikatorlerCh3.getOrduGucu() + 2);
                }
            }

        } else {
            olayMuzigi.durdur();
            throw new ArithmeticException("Lütfen sadece sayı giriniz.");
        }
    }
}