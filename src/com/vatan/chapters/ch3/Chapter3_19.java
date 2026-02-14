package com.vatan.chapters.ch3;

import com.vatan.core.*;
import java.util.Scanner;

public class Chapter3_19 extends Olay<IndikatorlerCh3> {

    public Chapter3_19() {
        super("", new String[]{});
    }

    @Override
    public void oynat(IndikatorlerCh3 indikatorlerCh3) {
        int oncekiSecim = indikatorlerCh3.getonBirinciSorudaSecilenSik();
        MuzikKutusu olayMuzigi = new MuzikKutusu();

        if (oncekiSecim == 1) {
            this.metin =
                    "Hariciye Nazırı:\n" +
                            "Paşam, İtilaf devletleri ile müttefik olmamıza rağmen Doğu'da durum karışık. Ermeni komitacıları, Rus müttefiklerimize güvenerek taşkınlık çıkarıyor.\n" +
                            "İngiliz Sefiri, 'Ermenilere dokunmayın, onlar savaşın sivil mağdurlarıdır' diye baskı yapıyor. Ancak Van'da devlet otoritesi sarsıldı.\n" +
                            "Müttefiklerimizi kızdırma pahasına müdahale mi edelim, yoksa diplomatik krizi önlemek için alttan mı alalım?\n";

            this.cevaplar = new String[]{
                    "Devletin bekası müttefiklerin keyfinden önemlidir! İsyana en sert şekilde müdahale edin.",
                    "Şu an İngiliz ve Rus desteğini kaybedemeyiz. Jandarma geri çekilsin, olayları diplomatik yolla çözmeye çalışalım."
            };
            olayMuzigi.oynat("1/Chapter3_19.mp3");

        } else if (oncekiSecim == 2) {
            this.metin =
                    "Kuşçubaşı Eşref:\n" +
                            "Enver, kardeşim biliyorum birçok sorunla uğraşıyorsun ancak şuan acil olan bir meselemiz daha var. Van'da Ermeniler direnişe başladılar.\n" +
                            "Acilen bir şeyler yapmamız gerekiyor. Biz bunu önleyebilmek adına bir Ermeni Tehciri kanunu çıkardık ancak senin de sahaya gidip sahadaki Ermeni isyancılarla mücadele etmen gerekiyor.\n";

            this.cevaplar = new String[]{
                    "Elbette kardeşim Eşref. Derhal bu Ermenilere hadlerini bildirmek üzere Van'a gidiyorum.",
                    "Kusura bakma kardeşim. Ancak Çanakkale ve İstanbul'daki durum daha vahim. Burada kalıp buraya yapılan işgalleri önlememiz gerekiyor."
            };
            olayMuzigi.oynat("2/Chapter3_19.mp3");

        } else if (oncekiSecim == 3) {
            this.metin =
                    "Dahiliye Nazırı Talat Paşa:\n" +
                            "Enver, tarafsızız diye gözümüzü kapatamayız. Yabancı ajanlar Doğu'da Ermenileri silahlandırıyor. Maksatları iç karışıklık çıkarıp bizi savaşa çekmek.\n" +
                            "Van Valisi yardım istiyor. Orduyu gönderirsek dünya 'Osmanlı seferberlik başlattı' diyecek, göndermezsek şehir elden gidecek.\n";

            this.cevaplar = new String[]{
                    "Bu bir asayiş meselesidir. Ordu değil, Teşkilat-ı Mahsusa birlikleri ve Jandarma gizlice müdahale etsin.",
                    "Şehir elden gidiyor Talat! Orduyu gönderin, kim ne derse desin!"
            };
            olayMuzigi.oynat("3/Chapter3_19.mp3");
        }

        soruSor();

        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int secim = sc.nextInt();
            sc.nextLine();
            olayMuzigi.durdur();

            if (oncekiSecim == 1) {
                if (secim == 1) {
                    yesilYaz("\n*** İSYAN BASTIRILDI AMA İLİŞKİLER GERİLDİ ***\n");
                    System.out.println("Van'da düzen sağlandı ancak İngiltere ve Rusya sert bir nota verdi.");
                    indikatorlerCh3.setItilafIliskisi(indikatorlerCh3.getItilafIliskisi() - 3);
                    indikatorlerCh3.bolgeGuncelle("Kafkas", 5);
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() + 2);
                } else if (secim == 2) {
                    kirmiziYaz("\n*** VAN'DA OTORİTE KAYBI ***\n");
                    System.out.println("Müttefikleri küstürmemek için geri adım atıldı. Ermeni komitacıları şehri fiilen ele geçirdi.");
                    indikatorlerCh3.bolgeGuncelle("Kafkas", -10);
                    indikatorlerCh3.setItilafIliskisi(indikatorlerCh3.getItilafIliskisi() + 2);
                    indikatorlerCh3.setSubayDestegi(indikatorlerCh3.getSubayDestegi() - 3);
                } else {
                    throw new ArithmeticException("Geçersiz tuşlama yaptınız.");
                }

            } else if (oncekiSecim == 2) {
                if (secim == 1) {
                    yesilYaz("\n*** ENVER PAŞA DOĞU CEPHESİNDE ***\n");
                    System.out.println("Van'a bizzat giderek isyanı bastırdınız ve Tehcir Kanunu'nu uygulattınız.");
                    System.out.println("Doğu güvenliği sağlandı ancak Batı cephesi komutansız kaldı.");

                    indikatorlerCh3.setAskerMorali(indikatorlerCh3.getAskerMorali() - 1);
                    indikatorlerCh3.bolgeGuncelle("Canakkale", -5);
                    indikatorlerCh3.setIkmalDurumu(indikatorlerCh3.getIkmalDurumu() - 2);
                    indikatorlerCh3.bolgeGuncelle("Kafkas", 5);
                    indikatorlerCh3.setOrduGucu(indikatorlerCh3.getOrduGucu() - 2);
                    indikatorlerCh3.setPadisahDestegi(indikatorlerCh3.getPadisahDestegi() + 1);
                    indikatorlerCh3.setSubayDestegi(indikatorlerCh3.getSubayDestegi() - 2);

                } else if (secim == 2) {
                    yesilYaz("\n*** PAYİTAHT MÜDAFAASI ***\n");
                    System.out.println("Merkezde kalarak Çanakkale savunmasını organize ettiniz.");
                    System.out.println("Van ve Doğu Anadolu kendi kaderine terk edildi.");

                    indikatorlerCh3.setAskerMorali(indikatorlerCh3.getAskerMorali() + 1);
                    indikatorlerCh3.bolgeGuncelle("Canakkale", 5);
                    indikatorlerCh3.bolgeGuncelle("Kafkas", -5);
                    indikatorlerCh3.setOrduGucu(indikatorlerCh3.getOrduGucu() - 2);
                    indikatorlerCh3.setPadisahDestegi(indikatorlerCh3.getPadisahDestegi() + 2);
                    indikatorlerCh3.setSubayDestegi(indikatorlerCh3.getSubayDestegi() - 1);
                } else {
                    throw new ArithmeticException("Geçersiz tuşlama yaptınız.");
                }

            } else if (oncekiSecim == 3) {
                if (secim == 1) {
                    yesilYaz("\n*** GİZLİ OPERASYON ***\n");
                    System.out.println("Eşref Bey komutasındaki birlikler isyanı bastırdı. Dünya basınına 'asayiş olayı' dendi.");
                    indikatorlerCh3.bolgeGuncelle("Kafkas", 2);
                    indikatorlerCh3.setSubayDestegi(indikatorlerCh3.getSubayDestegi() + 1);
                } else if (secim == 2) {
                    kirmiziYaz("\n*** SAVAŞ ÇANLARI ***\n");
                    System.out.println("Ordu Van'a girdi. Rusya sınıra yığınak yapmaya başladı.");
                    indikatorlerCh3.setSavasTehlikesi(indikatorlerCh3.getSavasTehlikesi() + 3);
                    indikatorlerCh3.bolgeGuncelle("Kafkas", 5);
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