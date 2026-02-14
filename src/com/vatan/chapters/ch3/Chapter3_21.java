package com.vatan.chapters.ch3;

import com.vatan.core.*;
import java.util.Scanner;

public class Chapter3_21 extends Olay<IndikatorlerCh3> {

    public Chapter3_21() {
        super("", new String[]{});
    }

    @Override
    public void oynat(IndikatorlerCh3 indikatorlerCh3) {
        int oncekiSecim = indikatorlerCh3.getonBirinciSorudaSecilenSik();
        MuzikKutusu olayMuzigi = new MuzikKutusu();

        if (oncekiSecim == 1) {
            this.metin =
                    "Irak Bölge Komutanı Cavit Paşa:\n" +
                            "Paşam, İtilaf devletleriyle müttefik olmamıza rağmen İngilizlerin Basra'daki hareketliliği şüpheli.\n" +
                            "Petrol kuyularını koruma bahanesiyle bölgeye asker çıkarıyorlar. Yerel halk 'İngilizler kalıcı olmaya geldi' diye fısıldaşıyor.\n" +
                            "Müttefikimize güvenip kışlalarda mı duralım, yoksa tedbir amaçlı stratejik noktaları tutalım mı?\n";

            this.cevaplar = new String[]{
                    "Müttefikimize güvenimiz tamdır ancak devlet malı emanet edilmez. Petrol bölgelerine Türk bayrağı çekilsin, asker nöbet tutsun.",
                    "İngilizleri kızdırmayalım Paşa. Onlar bizim dostumuz, petrolü korusunlar."
            };
            olayMuzigi.oynat("1/Chapter3_21.mp3");

        } else if (oncekiSecim == 2) {
            this.metin =
                    "Irak Bölge Komutanı Cavit Paşa:\n" +
                            "Paşam, Basra'dan ne yazık ki kötü haberler ile size geldim... İngilizler Şattülarap civarına Hindistan piyadeleri ile beraber çıkarma yapıyorlar.\n" +
                            "Basra tarafını kontrol etmemiz zor gibi duruyor ancak ordumuz an itibarıyla bölgedeki düşmanı tutabilecek vaziyette.\n" +
                            "Fakat paşam, burayı takviye ederlerse işimiz zor...\n";

            this.cevaplar = new String[]{
                    "Cavit Paşa, rahat ol. İngilizlerin önceliğinin Irak olduğuna inanmıyorum. Muhtemelen blöf yapacaklar.",
                    "Bu İngilizlerin maksadı burayı aşıp Arapları bize karşı kışkırtmak olmasın... Tamamdır paşam, sana ihtiyat alaylarını takviye olarak gönderiyorum."
            };
            olayMuzigi.oynat("2/Chapter3_21.mp3");

        } else if (oncekiSecim == 3) {
            this.metin =
                    "Irak Bölge Komutanı Cavit Paşa:\n" +
                            "Paşam, tarafsızlığımıza rağmen İngiliz ajanı Lawrence'ın aşiretleri kışkırttığı haberini aldık.\n" +
                            "Bazı şeyhler altın karşılığında İngilizlere biat etmeye hazırlanıyor. Eğer Basra'ya asker çıkarırlarsa halk direnmez.\n" +
                            "Aşiret reislerini İstanbul'a davet edip sadakatlerini mi tazeleyelim, yoksa ibret-i alem için elebaşlarını vuralım mı?\n";

            this.cevaplar = new String[]{
                    "Kan dökmek son çare olmalı. Reisleri sarayda ağırlayın, hediyelere boğun. Sadakat satın alınır.",
                    "Hainin başı ezilmelidir! Elebaşıları yakalayıp meydanda asın ki diğerlerine ders olsun."
            };
            olayMuzigi.oynat("3/Chapter3_21.mp3");
        }

        soruSor();

        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int secim = sc.nextInt();
            sc.nextLine();
            olayMuzigi.durdur();

            if (oncekiSecim == 1) {
                if (secim == 1) {
                    yesilYaz("\n*** PETROL NÖBETİ ***\n");
                    System.out.println("Türk askeri petrol kuyularını tuttu. İngilizler bu durumdan hoşlanmadı ama ses çıkaramadı.");
                    indikatorlerCh3.setOrduGucu(indikatorlerCh3.getOrduGucu() + 1);
                    indikatorlerCh3.bolgeGuncelle("Irak", 5);
                    indikatorlerCh3.setItilafIliskisi(indikatorlerCh3.getItilafIliskisi() - 2);
                } else if (secim == 2) {
                    kirmiziYaz("\n*** BASRA'DA İNGİLİZ BAYRAĞI ***\n");
                    System.out.println("Şehir fiilen İngiliz kontrolüne girdi. Halk, Osmanlı'nın acziyetini konuşuyor.");
                    indikatorlerCh3.bolgeGuncelle("Irak", -5);
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() - 2);
                    indikatorlerCh3.setItilafIliskisi(indikatorlerCh3.getItilafIliskisi() + 2);
                } else {
                    throw new ArithmeticException("Geçersiz tuşlama yaptınız.");
                }

            } else if (oncekiSecim == 2) {
                if (secim == 1) {
                    kirmiziYaz("\n*** BASRA DÜŞTÜ ***\n");
                    System.out.println("İngilizler blöf yapmıyordu. Takviye almadığı için Cavit Paşa geri çekilmek zorunda kaldı.");
                    System.out.println("Basra elden çıktı, İngilizler Bağdat yolunu açtı.");

                    indikatorlerCh3.setOrduGucu(indikatorlerCh3.getOrduGucu() + 1);
                    indikatorlerCh3.setPadisahDestegi(indikatorlerCh3.getPadisahDestegi() - 2);
                    indikatorlerCh3.setIkmalDurumu(indikatorlerCh3.getIkmalDurumu() - 3);
                    indikatorlerCh3.bolgeGuncelle("Irak", -10);

                } else if (secim == 2) {
                    yesilYaz("\n*** KUT'ÜL AMARE ZAFERİNE DOĞRU ***\n");
                    System.out.println("Gönderilen takviyeler sayesinde İngiliz ilerleyişi Selman-ı Pak'ta durduruldu.");
                    System.out.println("İngiliz ordusu kuşatma altına alınmak üzere.");

                    indikatorlerCh3.setOrduGucu(indikatorlerCh3.getOrduGucu() - 2);
                    indikatorlerCh3.setSubayDestegi(indikatorlerCh3.getSubayDestegi() + 3);
                    indikatorlerCh3.setIkmalDurumu(indikatorlerCh3.getIkmalDurumu() - 1);
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() + 2);
                    indikatorlerCh3.bolgeGuncelle("Irak", 10);
                } else {
                    throw new ArithmeticException("Geçersiz tuşlama yaptınız.");
                }

            } else if (oncekiSecim == 3) {
                if (secim == 1) {
                    yesilYaz("\n*** AŞİRETLERİN SADAKATİ ***\n");
                    System.out.println("Altın keseleri işe yaradı. Arap aşiretleri şimdilik İngilizlere yüz vermiyor.");
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() + 1);
                    indikatorlerCh3.setIkmalDurumu(indikatorlerCh3.getIkmalDurumu() - 2);
                    indikatorlerCh3.bolgeGuncelle("Irak", 2);
                } else if (secim == 2) {
                    kirmiziYaz("\n*** İSYAN ATEŞİ ***\n");
                    System.out.println("Sert müdahale ters tepti. Aşiretler intikam yemini edip İngiliz saflarına geçti.");
                    indikatorlerCh3.bolgeGuncelle("Irak", -10);
                    indikatorlerCh3.setSavasTehlikesi(indikatorlerCh3.getSavasTehlikesi() + 2);
                } else {
                    throw new ArithmeticException("Geçersiz tuşlama yaptınız.");
                }
            }

        } else {
            olayMuzigi.durdur();
            throw new ArithmeticException("Lütfen sadece sayı giriniz.");
        }
    }
}