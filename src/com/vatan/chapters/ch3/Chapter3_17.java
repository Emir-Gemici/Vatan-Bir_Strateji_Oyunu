package com.vatan.chapters.ch3;

import com.vatan.core.*;
import java.util.Scanner;

public class Chapter3_17 extends Olay<IndikatorlerCh3> {

    public Chapter3_17() {
        super("", new String[]{});
    }

    @Override
    public void oynat(IndikatorlerCh3 indikatorlerCh3) {
        int oncekiSecim = indikatorlerCh3.getonBirinciSorudaSecilenSik();
        MuzikKutusu olayMuzigi = new MuzikKutusu();

        if (oncekiSecim == 1) {
            this.metin =
                    "3. Ordu Komutanı Hasan İzzet Paşa:\n" +
                            "Enver Paşam, Rus müttefiklerimizden acil bir telgraf var. Alman ajanları İran üzerinden Afganistan ve Hindistan'a geçip oradaki Müslümanları İngilizlere karşı ayaklandırmaya çalışıyor.\n" +
                            "Ruslar, Doğu sınırımızda güvenliği artırmamızı ve bu Alman ajanlarını yakalamamızı istiyor. Ancak bölge halkı Almanlara sempati duyuyor, müdahale edersek halkla karşı karşıya geliriz.\n" +
                            "Ne emredersiniz?\n";

            this.cevaplar = new String[]{
                    "Müttefikimiz İngiltere ve Rusya'nın güvenliği bizim de güvenliğimizdir. Sınırı kapatın, Alman ajanlarını tutuklayın!",
                    "Bizim kendi derdimiz bize yeter Paşa. Doğu'da halkı karşımıza alamayız. Görmezden gelin geçsinler."
            };
            olayMuzigi.oynat("1/Chapter3_17.mp3");

        } else if (oncekiSecim == 2) {
            this.metin =
                    "3. Ordu Komutanı Hasan İzzet Paşa:\n" +
                            "Enver Paşam, Erkan-ı Harbiye'yi size şikayet etmek gibi görünmesini katiyyen istemem ancak Sarıkamış üzerine bu soğukta yürümek nasıl bir deliliktir?\n" +
                            "Üstelik Ruslar Pasinler ve Doğubeyazıt tarafına doğru ilerliyor iken gücümüzü taarruza nasıl verelim?\n" +
                            "11. Kolordu olmasa helak olacaktık paşam, bu kış halinde bir de taarruz etmek orduyu perişan edecektir!\n";

            this.cevaplar = new String[]{
                    "Bana bak paşa, düşmanı hazır zayıfken yakalamışız. Saldıracaksın!",
                    "Haklısın paşa... Ermeni eşkıyası fırsat bilip bizi arkadan vurabilir. Evvela arka taraftaki Ermeni eşkıyasını temizlemek gerekir..."
            };
            olayMuzigi.oynat("2/Chapter3_17.mp3");

        } else if (oncekiSecim == 3) {
            this.metin =
                    "3. Ordu Komutanı Hasan İzzet Paşa:\n" +
                            "Paşam, tarafsız olmamıza rağmen Rus Kazak süvarileri sınır köylerimizi taciz ediyor. Maksatları bizi kışkırtıp savaşa çekmek.\n" +
                            "Askerin sabrı taşıyor. Karşılık verelim mi yoksa diplomatik nota ile mi geçiştirelim?\n";

            this.cevaplar = new String[]{
                    "Misliyle karşılık verin! Sınır namustur!",
                    "Sükuneti koruyun. Hariciye Nezareti Rus elçisini uyaracaktır. Oyuna gelmeyelim."
            };
            olayMuzigi.oynat("3/Chapter3_17.mp3");
        }

        soruSor();

        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int secim = sc.nextInt();
            sc.nextLine();
            olayMuzigi.durdur();

            if (oncekiSecim == 1) {
                if (secim == 1) {
                    yesilYaz("\n*** ALMAN AJANLARI YAKALANDI ***\n");
                    System.out.println("İngilizler bu desteğimizden çok memnun kaldı ancak Doğu Anadolu halkı 'gavur dostu' olduğumuz gerekçesiyle huzursuz.");
                    indikatorlerCh3.setItilafIliskisi(indikatorlerCh3.getItilafIliskisi() + 3);
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() - 2);
                    indikatorlerCh3.bolgeGuncelle("Kafkas", 5);
                } else if (secim == 2) {
                    kirmiziYaz("\n*** İNGİLİZLER ÖFKELİ ***\n");
                    System.out.println("Almanlar geçiş yaptı ve Hindistan'da karışıklık çıkardı. Müttefiklerimiz bize güvenmiyor.");
                    indikatorlerCh3.setItilafIliskisi(indikatorlerCh3.getItilafIliskisi() - 3);
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() + 1);
                } else {
                    throw new ArithmeticException("Geçersiz tuşlama yaptınız.");
                }

            } else if (oncekiSecim == 2) {
                if (secim == 1) {
                    kirmiziYaz("\n*** SARIKAMIŞ HAREKATI BAŞLADI ***\n");
                    System.out.println("Allahuekber Dağları'nda tipi bastırdı. Asker donarak şehit düşüyor...");
                    System.out.println("Ruslar bu taarruz karşısında şaşırdı ancak kış en büyük düşmanımız.");

                    indikatorlerCh3.setOrduGucu(indikatorlerCh3.getOrduGucu() - 3);
                    indikatorlerCh3.setIkmalDurumu(indikatorlerCh3.getIkmalDurumu() - 2);
                    indikatorlerCh3.setItilafGucu(indikatorlerCh3.getItilafGucu() - 1);
                    indikatorlerCh3.bolgeGuncelle("Kafkas", -10);
                } else if (secim == 2) {
                    yesilYaz("\n*** CEPHE GERİSİ EMNİYETİ ***\n");
                    System.out.println("Hasan İzzet Paşa derin bir nefes aldı. Ordu savunma pozisyonunda kaldı.");
                    System.out.println("Ermeni çetelerine karşı yapılan temizlik harekatı cephe gerisini rahatlattı.");

                    indikatorlerCh3.setSubayDestegi(indikatorlerCh3.getSubayDestegi() + 1);
                    indikatorlerCh3.setAskerMorali(indikatorlerCh3.getAskerMorali() + 2);
                    indikatorlerCh3.setItilafGucu(indikatorlerCh3.getItilafGucu() + 1);
                    indikatorlerCh3.setPadisahDestegi(indikatorlerCh3.getPadisahDestegi() - 1);
                    indikatorlerCh3.bolgeGuncelle("Kafkas", 5);
                } else {
                    throw new ArithmeticException("Geçersiz tuşlama yaptınız.");
                }

            } else if (oncekiSecim == 3) {
                if (secim == 1) {
                    kirmiziYaz("\n*** SINIR ÇATIŞMASI ***\n");
                    System.out.println("Rus birlikleriyle çatışma çıktı. Savaş riski arttı.");
                    indikatorlerCh3.setSavasTehlikesi(indikatorlerCh3.getSavasTehlikesi() + 2);
                    indikatorlerCh3.setAskerMorali(indikatorlerCh3.getAskerMorali() + 1);
                } else if (secim == 2) {
                    yesilYaz("\n*** DİPLOMATİK NOTA ***\n");
                    System.out.println("Rusya özür diledi (yalandan). Şimdilik barış korundu.");
                    indikatorlerCh3.setSavasTehlikesi(indikatorlerCh3.getSavasTehlikesi() - 1);
                    indikatorlerCh3.setOrduGucu(indikatorlerCh3.getOrduGucu() - 1);
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