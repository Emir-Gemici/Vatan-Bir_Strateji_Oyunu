package com.vatan.chapters.ch5;

import com.vatan.core.*;
import java.util.Scanner;

public class Chapter5StatHesapla extends Olay<IndikatorlerCh5> {
    @Override
    public void oynat(IndikatorlerCh5 indikatorlerCh5) {
        int pkkGucu = indikatorlerCh5.getPkkGucu();
        int tskGucu = indikatorlerCh5.getTskGucu();
        int bolgeHakimiyeti = indikatorlerCh5.getBolgeHakimiyeti();
        int halkDestegi = indikatorlerCh5.getHalkDestegi();
        int askerMorali = indikatorlerCh5.getAskerMorali();
        int ankaraDestegi = indikatorlerCh5.getAnkaraDestegi();
        int kurmayDestegi = indikatorlerCh5.getKurmayDestegi();

        System.out.println("\n\u001B[44m\u001B[33m=== BÖLÜM SONU RAPORU ===\u001B[0m");

        if (pkkGucu <= 6 && tskGucu >= 14 && bolgeHakimiyeti >= 35 && halkDestegi >= 12) {
            yesilYaz("\n*** SONUÇ: EFSANEVİ ZAFER - DAĞLARIN FATİHİ ***\n");
            this.metin =
                    "Komutanım! Hakkari dağlarında tek bir eşkıya nefesi dahi duyulmuyor.\n" +
                            "Bölge halkı devletin şefkatli ve güçlü elini omzunda hissediyor. Kurduğunuz hakimiyet sayesinde\n" +
                            "sadece teröristleri temizlemekle kalmadınız, bölgenin makus talihini de yendiniz.\n" +
                            "Tarih sizi 'Dağların Fatihi' olarak yazacak. PKK bölgeden tamamen silindi!\n";
            this.cevaplar = new String[]{"Vatan Sağ Olsun! (Chapter 5 Tamamlandı)"};
        } else if (tskGucu < 6 || bolgeHakimiyeti < 10 || askerMorali < 6) {
            kirmiziYaz("\n*** SONUÇ: ASKERİ HEZİMET - ÇÖKÜŞ ***\n");
            this.metin =
                    "Maalesef Komutanım... Bölgede kontrolü tamamen kaybettik.\n" +
                            "Verdiğimiz ağır kayıplar ve yanlış stratejiler sonucu terör örgütü cesaretlendi.\n" +
                            "Askerimiz moralsiz, birliklerimiz yorgun. Ankara sizi merkeze çekme kararı aldı.\n" +
                            "Arkanızda yanan köyler ve kaybedilmiş bir vatan toprağı bıraktınız...\n";
            this.cevaplar = new String[]{"Başaramadık... (Oyun Bitti)"};
        } else if (halkDestegi <= 6) {
            kirmiziYaz("\n*** SONUÇ: HALK İSYANI - GÖNÜLLERİ KAYBETTİK ***\n");
            this.metin =
                    "Paşam, teröristleri öldürdük belki ama halkı tamamen kaybettik.\n" +
                            "Yaptığımız sert müdahaleler ve boşaltılan köyler halkı devlete düşman etti.\n" +
                            "Şehir merkezlerinde sivil itaatsizlik eylemleri başladı. Askeri zaferimiz, sosyal bir felaketle gölgelendi.\n" +
                            "Artık dağda değil, şehirde savaşıyoruz.\n";
            this.cevaplar = new String[]{"Halksız devlet olmaz... (Chapter 5 Tamamlandı)"};
        } else if (ankaraDestegi >= 18 && kurmayDestegi >= 18) {
            maviYaz("\n*** SONUÇ: POLİTİK YÜKSELİŞ - ANKARA'NIN GÖZBEBEĞİ ***");
            this.metin =
                    "Operasyonel başarınızdan ziyade Ankara ile kurduğunuz güçlü ilişkiler meyvesini verdi.\n" +
                            "Genelkurmay ve Hükümet sizi bir kahraman olarak görüyor.\n" +
                            "Sahada bazı eksikler olsa da, siyasi ve bürokratik desteğiniz o kadar yüksek ki,\n" +
                            "Geleceğin Genelkurmay Başkanı olarak adınız geçmeye başladı bile.\n";
            this.cevaplar = new String[]{"Devletin bekası her şeyden önemlidir. (Chapter 5 Tamamlandı)"};
        } else if (pkkGucu >= 16) {
            kirmiziYaz("\n*** SONUÇ: TERÖRÜN YÜKSELİŞİ - KAOS ***\n");
            this.metin =
                    "Komutanım, dağları temizledik sandık ama yanılmışız.\n" +
                            "PKK, Irak sınırından oluk oluk akıyor. Karakollarımız her gece taciz ateşi altında.\n" +
                            "Şehir merkezlerinde bombalar patlıyor. Biz kazandık sanırken aslında savaşı şehirlere taşıdılar.\n" +
                            "Durum çok kritik, acil takviye gelmezse Hakkari düşebilir!\n";
            this.cevaplar = new String[]{"Direnmeye devam edeceğiz! (Chapter 5 Tamamlandı)"};
        } else if (kurmayDestegi <= 8 && ankaraDestegi <= 8) {
            sariYaz("\n*** SONUÇ: YALNIZ KURT - DESTEKSİZ MÜCADELE ***");
            this.metin =
                    "Sahada büyük işler başardınız Komutanım, ama Ankara'yı ve kendi karargahınızı karşınıza aldınız.\n" +
                            "Hiçbir yerden destek gelmiyor, mühimmatımız azalıyor.\n" +
                            "Kendi başımıza, kendi imkanlarımızla bir destan yazmaya çalışıyoruz ama bu sürdürülebilir değil.\n" +
                            "Tarih bizi 'İstenmeyen Kahraman' olarak yazacak.\n";
            this.cevaplar = new String[]{"Biz bize yeteriz! (Chapter 5 Tamamlandı)"};
        } else {
            sariYaz("\n*** SONUÇ: TARİHSEL GERÇEKLİK - BİTMEYEN MÜCADELE ***");
            this.metin =
                    "Büyük bir mücadele verdiniz Osman Paşam.\n" +
                            "Terör örgütünü kış boyu inlerinden çıkartmadınız, yüzlerce terörist etkisiz hale getirildi.\n" +
                            "Ancak terör illeti tamamen bitmedi, sadece sindirildi. Baharla birlikte yine geleceklerdir.\n" +
                            "Yine de Hakkari halkı ve TSK sizin sayenizde rahat bir nefes aldı. Görevinizi layıkıyla yaptınız.\n";
            this.cevaplar = new String[]{"Mücadele devam edecek. (Chapter 5 Tamamlandı)"};
        }

        soruSor();

        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            sc.nextInt();
            sc.nextLine();
        } else {
            sc.nextLine();
        }

        System.out.println("\n\u001B[44m\u001B[33m=== CHAPTER 5 İSTATİSTİKLERİ KAYDEDİLDİ ===\u001B[0m");
    }
}