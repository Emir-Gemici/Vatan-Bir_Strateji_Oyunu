package com.vatan.chapters.ch5;

import com.vatan.core.*;
import java.util.Scanner;

public class Chapter5_05 extends Olay<IndikatorlerCh5> {
    @Override
    public void oynat(IndikatorlerCh5 indikatorlerCh5) {
        int ucuncuSorudaSecilenSik = indikatorlerCh5.getUcuncuSorudaSecilenSik();
        MuzikKutusu olayMuzigi = new MuzikKutusu();

        if (ucuncuSorudaSecilenSik == 1) {
            this.metin =
                    "Kurmay Yüzbaşı:\n" +
                            "Komutanım, siz Yüksekova'da karargahta iken devam ettirdiğimiz harekatı yeniden sizin katılımınızın ardından tamamlamış bulunuyoruz.\n" +
                            "İkiyaka köyü ve İkiyaka Dağları'nda başarıyla icra ettiğimiz operasyonda ne yazık ki birliklerimizin manevra kabiliyetini yitirmesinden ötürü 37 şehit verdik.\n" +
                            "Buna karşılık dağlarda bulunan PKK mevzilerini de ortadan kaldırdık ve arazi taramalarda 288 teröristi ortadan kaldırdığımızı tespit ettik.\n" +
                            "Yine de pusulara fazlaca düşmemiz Başbakanı ve hükümeti mecliste zayıflattı efendim. Çiller olmazsa da bize bu kadar bütçe ayıracak kimsemiz yok…\n";
            this.cevaplar =
                    new String[]{
                            "Zorlanıyoruz ama yine de eşkıya seviyesine inemeyiz. Şehitlerimizi ailelerine güvenle gönderin ve derhal sahadaki durum hakkında rapor hazırlayın."
                    };
            olayMuzigi.oynat("1/Chapter5_05.mp3");
        } else if (ucuncuSorudaSecilenSik == 2) {
            this.metin =
                    "Kurmay Yüzbaşı:\n" +
                            "Komutanım, sizin kısa süreliğine Yüksekova'daki karargaha dönmeniz esnasında  harekatı tamamlamış bulunuyoruz.Bölüklerden aldığımız haberlere göre mucizevi şekilde hiçbir kayıp vermedik.\n" +
                            "Buna karşılık bölücü teröristlerden 400 tanesini etkisiz hale getirdik. Üstelik muhbirlerimiz bize kıymetli bir haber verdi: \n" +
                            "eğer teröristlerin üzerine gitmeseydik buradan gelecek grupların tetikleyeceği bir isyanla Yüksekova'yı işgal edeceklerdi. Kısaca olası bir askeri faciayı engelledik diyebiliriz.\n";
            this.cevaplar =
                    new String[]{
                            "Hain eşkıya zayıfladı ancak daha yok edilmedi asker. Daha yapılacak çok iş var."
                    };
            olayMuzigi.oynat("2/Chapter5_05.mp3");
        } else if (ucuncuSorudaSecilenSik == 3) {
            this.metin =
                    "Genelkurmay Başkanı Doğan Güreş:\n" +
                            "Albay Pamukoğlu, İkiyaka'da icra ettiğiniz harekatın başarı ile sonuçlanmasından memnunuz ancak sahadaki durum ve sivil kayıplardan haberdar olduk.\n" +
                            "Bana bak Albay! Seni oraya terörü temizle diye gönderdik, eşkıyaya propaganda malzemesi ver diye değil! Yine de sana Tuğgeneralliğe terfi ettiğini haber vermek istedim.\n" +
                            "Umarım rütbenin farkına varır ve bir daha aynı hataya düşmezsin.";
            this.cevaplar =
                    new String[]{
                            "Emredersiniz Komutanım!"
                    };
            olayMuzigi.oynat("3/Chapter5_05.mp3", 6.0f);
        }

        soruSor();

        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int secim = sc.nextInt();
            sc.nextLine();
            olayMuzigi.durdur();

            if (secim == 1) {
                if (ucuncuSorudaSecilenSik == 1) {
                    indikatorlerCh5.setAskerMorali(indikatorlerCh5.getAskerMorali() - 1);
                    indikatorlerCh5.setBolgeHakimiyeti(indikatorlerCh5.getBolgeHakimiyeti() + 10);
                    indikatorlerCh5.setPkkGucu(indikatorlerCh5.getPkkGucu() - 1);
                    indikatorlerCh5.setTskGucu(indikatorlerCh5.getTskGucu() - 1);
                } else if (ucuncuSorudaSecilenSik == 2) {
                    indikatorlerCh5.setBolgeHakimiyeti(indikatorlerCh5.getBolgeHakimiyeti() + 10);
                    indikatorlerCh5.setHalkDestegi(indikatorlerCh5.getHalkDestegi() + 1);
                    indikatorlerCh5.setPkkGucu(indikatorlerCh5.getPkkGucu() - 1);
                } else if (ucuncuSorudaSecilenSik == 3) {
                    indikatorlerCh5.setBolgeHakimiyeti(indikatorlerCh5.getBolgeHakimiyeti() + 10);
                    indikatorlerCh5.setHalkDestegi(indikatorlerCh5.getHalkDestegi() - 1);
                    indikatorlerCh5.setKurmayDestegi(indikatorlerCh5.getKurmayDestegi() - 1);
                }
            } else {
                throw new ArithmeticException("Geçersiz tuşlama yaptınız.");
            }
        } else {
            olayMuzigi.durdur();
            throw new ArithmeticException("Lütfen sadece sayı giriniz.");
        }
    }
}