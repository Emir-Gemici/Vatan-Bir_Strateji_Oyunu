package com.vatan.chapters.ch5;

import com.vatan.core.*;
import java.util.Scanner;

public class Chapter5_08 extends Olay<IndikatorlerCh5> {
    @Override
    public void oynat(IndikatorlerCh5 indikatorlerCh5) {
        int ucuncuSorudaSecilenSik = indikatorlerCh5.getUcuncuSorudaSecilenSik();
        MuzikKutusu olayMuzigi = new MuzikKutusu();

        if (ucuncuSorudaSecilenSik == 1) {
            this.metin =
                    "Kurmay Yüzbaşı:\n" +
                            "Komutanım! PKK'lı bir takım grupların İstanbul'da Tuzla'da bombalı saldırısı sonucu 5 Piyade okulu öğrencisi şehit olmuşlar...\n" +
                            "Genelkurmay eşkıyaya acilen sert bir cevap vermemizi istiyor, sizce nasıl hareket etmeliyiz?\n";
            this.cevaplar =
                    new String[]{
                            "Şüphelendiğimiz köyleri boşaltın, bu kadar müsamaha yeter!",
                            "Balkaya üzerine olan harekat planımızı hızla tamamlayın, Irak'tan girişlerini durduracağız!",
                            "Aslında...JİTEM'in işlerine müsaade edelim, bırakın onlar çözsün."
                    };
            olayMuzigi.oynat("1/Chapter5_08.mp3");
        } else if (ucuncuSorudaSecilenSik == 2) {
            this.metin =
                    "İstihbaratçı Teğmen:\n" +
                            "Komutanım, bildiğiniz gibi PKKlı eşkıyaların çoğu maddi kaynaklarını Kuzey Irak'tan temin ediyorlar.\n" +
                            "Saddam'ın diktatörlüğünü bahane eden terör örgütü Talabani'nin gizli desteği ile büyük parasal kaynaklara ulaşmış.\n" +
                            "Biz de buna karşı Barzani'yi \"olağandışı\" yöntemlerle PKK'ya karşı tavır almaya zorlamayı planlıyoruz, umarız ki planımız tutar.\n";
            this.cevaplar =
                    new String[]{
                            "Allah yardımcınız olsun. Bölücü eşkıyayı birbirine kırdırırsak işimiz iyice kolaylaşır."
                    };
            olayMuzigi.oynat("2/Chapter5_08.mp3", 4.0f);
        } else if (ucuncuSorudaSecilenSik == 3) {
            this.metin =
                    "Kara Kuvvetleri Komutanı İsmail Hakkı Karadayı:\n" +
                            "Osman Paşam, evvela vazifende ve yeni rütbende sana başarılar dilerim.\n" +
                            "Son zamanlarda gelen haberler PKK dışında da Kürt Hizbullahı gibi irticai grupların da silahlanıp terör eylemlerine başladığına işaret ediyor.\n" +
                            "Bu saatten sonra polisin ve jandarmanın eli kolu bunlarla bağlı olacaktır. Ancak müsterih ol, sana istediğin desteği vereceğiz. İsteklerin nedir?\n";
            this.cevaplar =
                    new String[]{
                            "Tugaya yeni birlikleri bağlamanız yaklaşan harekatlarda bizi rahatlatacaktır komutanım.",
                            "Askerin morali bozulmuş durumda komutanım. Buraya bir ziyarette bulunmanız ve kendi gözünüzle vaziyeti incelemeniz iyi olacaktır."
                    };
            olayMuzigi.oynat("3/Chapter5_08.mp3", 3.0f);
        }

        soruSor();

        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int secim = sc.nextInt();
            sc.nextLine();
            olayMuzigi.durdur();

            if (secim == 1) {
                if (ucuncuSorudaSecilenSik == 1) {
                    indikatorlerCh5.setAnkaraDestegi(indikatorlerCh5.getAnkaraDestegi() + 1);
                    indikatorlerCh5.setHalkDestegi(indikatorlerCh5.getHalkDestegi() - 1);
                    indikatorlerCh5.setPkkGucu(indikatorlerCh5.getPkkGucu() - 1);
                } else if (ucuncuSorudaSecilenSik == 2) {
                    indikatorlerCh5.setAnkaraDestegi(indikatorlerCh5.getAnkaraDestegi() + 1);
                    indikatorlerCh5.setPkkGucu(indikatorlerCh5.getPkkGucu() - 1);
                } else if (ucuncuSorudaSecilenSik == 3) {
                    indikatorlerCh5.setKurmayDestegi(indikatorlerCh5.getKurmayDestegi() - 1);
                    indikatorlerCh5.setTskGucu(indikatorlerCh5.getTskGucu() + 2);
                }
            } else if (secim == 2) {
                if (ucuncuSorudaSecilenSik == 1) {
                    indikatorlerCh5.setAskerMorali(indikatorlerCh5.getAskerMorali() + 2);
                    indikatorlerCh5.setKurmayDestegi(indikatorlerCh5.getKurmayDestegi() + 1);
                    indikatorlerCh5.setTskGucu(indikatorlerCh5.getTskGucu() + 1);
                } else if (ucuncuSorudaSecilenSik == 2) {
                    throw new ArithmeticException("Geçersiz tuşlama yaptınız.");
                } else if (ucuncuSorudaSecilenSik == 3) {
                    indikatorlerCh5.setAskerMorali(indikatorlerCh5.getAskerMorali() + 2);
                    indikatorlerCh5.setKurmayDestegi(indikatorlerCh5.getKurmayDestegi() - 1);
                }
            } else if (secim == 3) {
                if (ucuncuSorudaSecilenSik == 1) {
                    indikatorlerCh5.setHalkDestegi(indikatorlerCh5.getHalkDestegi() - 1);
                    indikatorlerCh5.setPkkGucu(indikatorlerCh5.getPkkGucu() - 3);
                } else if (ucuncuSorudaSecilenSik == 2) {
                    throw new ArithmeticException("Geçersiz tuşlama yaptınız.");
                } else if (ucuncuSorudaSecilenSik == 3) {
                    throw new ArithmeticException("Geçersiz tuşlama yaptınız.");
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