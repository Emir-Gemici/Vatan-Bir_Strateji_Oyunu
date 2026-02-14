package com.vatan.chapters.ch3;

import com.vatan.core.*;
import java.util.Scanner;

public class Chapter3_41 extends Olay<IndikatorlerCh3> {

    public Chapter3_41() {
        super("", new String[]{});
    }

    @Override
    public void oynat(IndikatorlerCh3 indikatorlerCh3) {
        String mevcutYol = indikatorlerCh3.getOyunYolu();
        MuzikKutusu olayMuzigi = new MuzikKutusu();

        if (mevcutYol.equals("TARIHSEL")) {
            this.metin =
                    "Cemal Paşa:\n" +
                            "Enver, sana maalesef kötü bir haberim var. Biz Filistin'i kaybettikten sonra bu İngiliz fareleri,\n" +
                            "bizim yerimize Yahudileri yerleştirmek için onlara devlet vaat edecek bir anlaşma (Balfour Deklarasyonu) yapmışlar...\n" +
                            "Müslüman atalarımızın bize miras bıraktığı emanet Kudüs elden gitti...\n";
            this.cevaplar = new String[]{
                    "Cemal, artık yapabilecek bir şeyimiz yok. Şuan vatanımız da elden gidiyor. Asıl ilgilenmemiz gereken mesele bu! Toplanın, Anadolu'yu kurtaracağız."
            };
            olayMuzigi.oynat("1/Chapter3_41.mp3");

        } else if (mevcutYol.equals("TURAN")) {
            this.metin =
                    "Eğitim ve Propaganda Bakanı:\n" +
                            "Büyük Hakanım! Çin ve Moğolistan topraklarını ele geçirdik lakin nüfusları bizden katbekat fazla.\n" +
                            "Eğer bunları asimile etmezsek zamanla onlar bizi yutar (Çinlileşiriz).\n" +
                            "Okullarda Çinceyi yasaklayıp zorunlu Türkçe eğitimi başlatalım mı? Bu isyanlara sebep olabilir ama geleceğimiz buna bağlı.\n";
            this.cevaplar = new String[]{
                    "Burası artık Türk yurdudur! Çince yasaklanacak, herkes Türkçe konuşacak! Sert tedbirler uygulayın.",
                    "Zorla güzellik olmaz. Kültürlerine dokunmayın, sadece vergi versinler yeter. İmparatorluklar hoşgörüyle yaşar."
            };
            olayMuzigi.oynat("2/Chapter3_41.mp3");

        } else if (mevcutYol.equals("CUMHURIYET")) {
            this.metin =
                    "Diyanet İşleri Reisi:\n" +
                            "Paşam, dinde reform çalışmaları kapsamında ezanın ve hutbenin Türkçe okunması gündemde.\n" +
                            "Halkın neye dua ettiğini anlaması lazım. Camilerden 'Tanrı Uludur' sesleri yükselsin istiyoruz.\n" +
                            "Ancak taşrada halk 'Ezan-ı Muhammedi susturulamaz' diye ayaklanabilir.\n";
            this.cevaplar = new String[]{
                    "Allah Türkçe de bilir! Ezan Türkçe okunacak. Halk zamanla alışır, geri adım atmayın.",
                    "Ezanın aslı Arapçadır, dokunmayalım. Hutbeler Türkçe olsun yeter. Halkın bam teline basmayalım."
            };
            olayMuzigi.oynat("3/Chapter3_41.mp3");

        } else if (mevcutYol.equals("SERIAT")) {
            this.metin =
                    "Hicaz Emiri:\n" +
                            "Sultanım! İngiliz destekli Vahhabi (Suud) isyancılar Mekke ve Medine'yi kuşattı.\n" +
                            "Mukaddes emanetler tehlikede. Fahrettin Paşa Medine'de çekirge yiyerek direniyor.\n" +
                            "Ancak oraya asker gönderirsek Kuzey cephesi (Rus/İngiliz sınırı) çökecek. Kutsal toprakları mı koruyalım, başkenti mi?\n";
            this.cevaplar = new String[]{
                    "Medine düşerse İslam'ın kalbi durur! Bütün yedek birlikler Hicaz'a! Peygamberin kabri çiğnetilmeyecek!",
                    "Acı bir karar ama İstanbul düşerse Hilafet de biter. Hicaz'ı tahliye edin, emanetleri alıp çekilin. Başkenti koruyacağız."
            };
            olayMuzigi.oynat("4/Chapter3_41.mp3");

        } else if (mevcutYol.equals("PARCALANMA") || mevcutYol.equals("MANDA")) {
            this.metin =
                    "Hariciye - İngiliz Notası:\n" +
                            "Paşam! Ordumuz İzmir'e yürürken İngilizler ateşkes teklif etti.\n" +
                            "Teklifleri şu: 'İzmir ve çevresi özerk bölge olsun, Yunan polisi kalsın ama Türk bayrağı dalgalansın. Savaşı hemen bitirelim.'\n" +
                            "Ordumuz yorgun, mühimmat bitmek üzere. Bu teklifi kabul edersek kan dökülmez ama İzmir tam kurtulmaz.\n";
            this.cevaplar = new String[]{
                    "Bu bir tuzaktır! Düşman zaman kazanmak istiyor. Reddedin! Ordular, ilk hedefiniz Akdeniz'dir, ileri!",
                    "Ordunun hali ortada, daha fazla şehit vermeyelim. Masaya oturalım, belki diplomatik yolla çözeriz."
            };
            olayMuzigi.oynat("5/Chapter3_41.mp3");
        }

        soruSor();

        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int secim = sc.nextInt();
            sc.nextLine();
            olayMuzigi.durdur();

            if (mevcutYol.equals("TARIHSEL")) {
                // Tek seçenek var
                yesilYaz("\n*** ACI GERÇEK ***\n");
                System.out.println("Kudüs'ün kaybını sineye çektiniz. Artık hedef elde kalan son toprak parçası: Anadolu.");
                System.out.println("Ordu psikolojik olarak 'Vatan Savunması' moduna geçti.");

                indikatorlerCh3.setAskerMorali(indikatorlerCh3.getAskerMorali() + 1);
                indikatorlerCh3.setSubayDestegi(indikatorlerCh3.getSubayDestegi() + 1);
                indikatorlerCh3.bolgeGuncelle("Suriye", -15); // Filistin tamamen gitti

            } else if (mevcutYol.equals("TURAN")) {
                if (secim == 1) {
                    yesilYaz("\n*** DEMİR YUMRUK ***\n");
                    System.out.println("Çince yasaklandı. Başta isyanlar çıktı ama sertçe bastırıldı.");
                    System.out.println("Gelecek nesiller Türkçe konuşacak.");
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() - 4); // Yerel halk nefret etti
                    indikatorlerCh3.setOrduGucu(indikatorlerCh3.getOrduGucu() - 1); // İsyan bastırma zaiyatı
                } else {
                    kirmiziYaz("\n*** ERİME ***\n");
                    System.out.println("Kültürel serbestlik, Türk askerlerinin Çinli gibi yaşamasına yol açtı.");
                    System.out.println("Orduda disiplin bozuluyor, Türklük bilinci azalıyor.");
                    indikatorlerCh3.setAskerMorali(indikatorlerCh3.getAskerMorali() - 3);
                    indikatorlerCh3.setSubayDestegi(indikatorlerCh3.getSubayDestegi() - 2);
                }

            } else if (mevcutYol.equals("CUMHURIYET")) {
                if (secim == 1) {
                    kirmiziYaz("\n*** BURSA OLAYI ***\n");
                    System.out.println("Bursa'da ve Konya'da halk 'Tanrı Uludur' sesine karşı ayaklandı.");
                    System.out.println("Devrim en büyük direnişiyle karşılaştı.");
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() - 5);
                    indikatorlerCh3.setSubayDestegi(indikatorlerCh3.getSubayDestegi() + 2); // Ordu laikliği koruyor
                } else {
                    yesilYaz("\n*** UZLAŞI ***\n");
                    System.out.println("Ezan Arapça kaldı. Halk rahat bir nefes aldı. Hükümete güven tazelendi.");
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() + 3);
                    indikatorlerCh3.setSubayDestegi(indikatorlerCh3.getSubayDestegi() - 2); // Radikaller kızgın
                }

            } else if (mevcutYol.equals("SERIAT")) {
                if (secim == 1) {
                    yesilYaz("\n*** ÇÖL KAPLANI FAHRETTİN ***\n");
                    System.out.println("Medine kurtarıldı! Peygamberin sancağı dalgalanıyor.");
                    System.out.println("Ama İstanbul savunması zayıfladı, düşman Trakya sınırında.");
                    indikatorlerCh3.setPadisahDestegi(indikatorlerCh3.getPadisahDestegi() + 5);
                    indikatorlerCh3.setOrduGucu(indikatorlerCh3.getOrduGucu() - 3); // Bölündük
                } else {
                    kirmiziYaz("\n*** HİCAZ'A VEDA ***\n");
                    System.out.println("Kutsal topraklar Vahhabilerin eline geçti. Hilafetin manevi gücü çöktü.");
                    System.out.println("Artık sadece Anadolu kaldı.");
                    indikatorlerCh3.setPadisahDestegi(indikatorlerCh3.getPadisahDestegi() - 10); // Büyük prestij kaybı
                    indikatorlerCh3.setOrduGucu(indikatorlerCh3.getOrduGucu() + 2); // Ordu toplandı
                }

            } else { // PARCALANMA veya MANDA
                if (secim == 1) {
                    yesilYaz("\n*** HEDEF AKDENİZ ***\n");
                    System.out.println("İngiliz blöfünü yemediniz! Ordu İzmir'e sel gibi akıyor.");
                    System.out.println("Yunan ordusu denize dökülmek üzere!");
                    indikatorlerCh3.setOrduGucu(indikatorlerCh3.getOrduGucu() + 3);
                    indikatorlerCh3.setSubayDestegi(indikatorlerCh3.getSubayDestegi() + 3);
                } else {
                    kirmiziYaz("\n*** DİPLOMATİK TUZAK ***\n");
                    System.out.println("Ateşkes ilan edildi. Yunan ordusu toparlandı, İngilizler İzmir'e asker çıkardı.");
                    System.out.println("Zafer avucumuzun içinden kayıp gitti.");
                    indikatorlerCh3.setSavasTehlikesi(5);
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() - 5);
                }
            }

        } else {
            olayMuzigi.durdur();
            throw new ArithmeticException("Lütfen sadece sayı giriniz.");
        }
    }
}