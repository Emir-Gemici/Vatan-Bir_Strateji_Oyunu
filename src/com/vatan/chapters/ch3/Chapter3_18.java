package com.vatan.chapters.ch3;

import com.vatan.core.*;
import java.util.Scanner;

public class Chapter3_18 extends Olay<IndikatorlerCh3> {

    public Chapter3_18() {
        super("", new String[]{});
    }

    @Override
    public void oynat(IndikatorlerCh3 indikatorlerCh3) {
        int oncekiSecim = indikatorlerCh3.getonBirinciSorudaSecilenSik();
        MuzikKutusu olayMuzigi = new MuzikKutusu();

        if (oncekiSecim == 1) {
            this.metin =
                    "Başyaver:\n" +
                            "Paşam, İtilaf devletleri ile müttefik olsak da İngilizler, 'Çanakkale Boğazı'nı Rusya'ya yardım götürmek için kullanacağız, askerlerinizi bölgeden çekin' diye küstahça bir talepte bulunuyor.\n" +
                            "Bu resmen topraklarımızı yol geçen hanına çevirmektir! Ancak reddedersek müttefiklerimizle ipleri koparabiliriz.\n";

            this.cevaplar = new String[]{
                    "Burası bizim vatanımızdır! Müttefik de olsalar silahlı yabancı gemilerin Boğaz'dan elini kolunu sallayarak geçmesine izin veremeyiz.",
                    "Siyaseten sabretmek gerekir. Rusya'ya yardım gitmezse Doğu cephesinde Almanlar kazanır, bu da bizim sonumuz olur. Geçişe izin verin."
            };
            olayMuzigi.oynat("1/Chapter3_18.mp3");

        } else if (oncekiSecim == 2) {
            this.metin =
                    "Kuşçubaşı Eşref:\n" +
                            "Enver, İsmail Hakkı Paşa seni dinlemeyip orduya geri çekilme emri verdi. Ardahan elden gidiyor!\n" +
                            "Bir yandan da hiçbir sorun yokmuş gibi İngilizler Çanakkale'de bizi zorluyorlar. Acilen bir karar vermeliyiz.\n";

            this.cevaplar = new String[]{
                    "Kardeşim Eşref, o zaman yapabileceğimiz bir şey yok. Madem bu İsmail Hakkı Paşa bizim kararlarımızı dinlemiyor, en iyisi Ardahan'ı bırakalım ve kalan birlikleri Çanakkale'ye sevk edelim.",
                    "Hayır, Ardahan'ı hala kurtarma şansına sahibiz. Direnmeye devam edelim. İsmail Hakkı Paşa'nın verdiği emri kabul etmiyorum."
            };
            olayMuzigi.oynat("2/Chapter3_18.mp3");

        } else if (oncekiSecim == 3) {
            this.metin =
                    "Maliye Nazırı Cavit Bey:\n" +
                            "Paşam, tarafsızlığımız sayesinde sıcak savaştan uzak kaldık ama ekonomimiz abluka altında can çekişiyor.\n" +
                            "İngilizler ve Fransızlar ticari gemilerimize el koyuyor. Karaborsa almış başını gitmiş durumda. Halk ekmek bulamıyor.\n" +
                            "Ya stokçulara karşı askeri tedbir alacağız ya da dış borç bulmak için bir tarafa göz kırpacağız.\n";

            this.cevaplar = new String[]{
                    "Stokçuları Divan-ı Harp'te yargılayın! Halka ekmek karnesi dağıtılsın. Kendi yağımızla kavrulacağız.",
                    "Bu böyle gitmez. Almanya'dan gizli bir borç anlaşması yapalım, karşılığında bazı ticari imtiyazlar veririz."
            };
            olayMuzigi.oynat("3/Chapter3_18.mp3");
        }

        soruSor();

        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int secim = sc.nextInt();
            sc.nextLine();
            olayMuzigi.durdur();

            if (oncekiSecim == 1) {
                if (secim == 1) {
                    yesilYaz("\n*** İTİLAF İLE KRİZ ***\n");
                    System.out.println("İngiliz gemileri durduruldu. Müttefiklik büyük yara aldı ama onurumuz korundu.");
                    indikatorlerCh3.setItilafIliskisi(indikatorlerCh3.getItilafIliskisi() - 3);
                    indikatorlerCh3.setAskerMorali(indikatorlerCh3.getAskerMorali() + 2);
                    indikatorlerCh3.bolgeGuncelle("Canakkale", 5);
                } else if (secim == 2) {
                    kirmiziYaz("\n*** BOĞAZLAR AÇILDI ***\n");
                    System.out.println("İngiliz donanması İstanbul önlerinden geçip Karadeniz'e açıldı. Halk bu manzaradan utanç duyuyor.");
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() - 3);
                    indikatorlerCh3.setItilafIliskisi(indikatorlerCh3.getItilafIliskisi() + 3);
                    indikatorlerCh3.setOrduGucu(indikatorlerCh3.getOrduGucu() - 1);
                } else {
                    throw new ArithmeticException("Geçersiz tuşlama yaptınız.");
                }

            } else if (oncekiSecim == 2) {
                if (secim == 1) {
                    kirmiziYaz("\n*** ARDAHAN DÜŞTÜ, ÇANAKKALE TAHKİM EDİLDİ ***\n");
                    System.out.println("Doğu'da geri çekilme başladı, Ruslar ilerliyor. Ancak Batı'ya kaydırılan birlikler Çanakkale'de savunma hattını güçlendirdi.");

                    indikatorlerCh3.setAskerMorali(indikatorlerCh3.getAskerMorali() - 3);
                    indikatorlerCh3.bolgeGuncelle("Canakkale", 10);
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() - 3);
                    indikatorlerCh3.setIttifakIliskisi(indikatorlerCh3.getIttifakIliskisi() + 3);
                    indikatorlerCh3.setItilafGucu(indikatorlerCh3.getItilafGucu() - 1);
                    indikatorlerCh3.bolgeGuncelle("Kafkas", -10);
                    indikatorlerCh3.setOrduGucu(indikatorlerCh3.getOrduGucu() - 3);
                    indikatorlerCh3.setPadisahDestegi(indikatorlerCh3.getPadisahDestegi() + 1);
                    indikatorlerCh3.setSubayDestegi(indikatorlerCh3.getSubayDestegi() + 2);

                } else if (secim == 2) {
                    yesilYaz("\n*** KAFKAS'TA DİRENİŞ ***\n");
                    System.out.println("Enver Paşa'nın emriyle asker son gücüyle direndi. Ardahan düşmedi ama Çanakkale savunması zayıf kaldı.");

                    indikatorlerCh3.setAskerMorali(indikatorlerCh3.getAskerMorali() + 3);
                    indikatorlerCh3.bolgeGuncelle("Canakkale", -10);
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() + 3);
                    indikatorlerCh3.setIttifakIliskisi(indikatorlerCh3.getIttifakIliskisi() + 1);
                    indikatorlerCh3.setItilafGucu(indikatorlerCh3.getItilafGucu() - 1);
                    indikatorlerCh3.bolgeGuncelle("Kafkas", 5);
                    indikatorlerCh3.setOrduGucu(indikatorlerCh3.getOrduGucu() - 3);
                    indikatorlerCh3.setPadisahDestegi(indikatorlerCh3.getPadisahDestegi() - 1);
                    indikatorlerCh3.setSubayDestegi(indikatorlerCh3.getSubayDestegi() - 2);
                } else {
                    throw new ArithmeticException("Geçersiz tuşlama yaptınız.");
                }

            } else if (oncekiSecim == 3) {
                if (secim == 1) {
                    yesilYaz("\n*** MİLLİ EKONOMİ TEDBİRLERİ ***\n");
                    System.out.println("Karaborsacılara ağır cezalar verildi. Halkın devlete güveni arttı ama sermaye sahipleri ürktü.");
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() + 2);
                    indikatorlerCh3.setSubayDestegi(indikatorlerCh3.getSubayDestegi() + 1);
                } else if (secim == 2) {
                    yesilYaz("\n*** ALMAN SERMAYESİ ***\n");
                    System.out.println("Almanya'dan gelen kredi piyasayı rahatlattı ama tarafsızlığımız gölgelendi.");
                    indikatorlerCh3.setIttifakIliskisi(indikatorlerCh3.getIttifakIliskisi() + 2);
                    indikatorlerCh3.setItilafIliskisi(indikatorlerCh3.getItilafIliskisi() - 2);
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