package com.vatan.chapters.ch3;

import com.vatan.core.*;
import java.util.Scanner;

public class Chapter3_34 extends Olay<IndikatorlerCh3> {

    public Chapter3_34() {
        super("", new String[]{});
    }

    @Override
    public void oynat(IndikatorlerCh3 indikatorlerCh3) {
        String mevcutYol = indikatorlerCh3.getOyunYolu();
        MuzikKutusu olayMuzigi = new MuzikKutusu();

        if (mevcutYol.equals("TARIHSEL")) {
            this.metin =
                    "9. Kolordu Kumandanı Kazım Paşa:\n" +
                            "Harbiye Nazırı hazretleri! Rusların süvarileri gece vakti Pasinler'i aşıp Erzurum'a saldırmaya başlamış!\n" +
                            "Bölgeyi tutacak adamımız kalmadı, sizden acil yardım talep ediyorum Nazır Hazretleri!\n";
            this.cevaplar = new String[]{
                    "Cepheye yeni bir ordu komutanlığı altında Irak'tan kolordular kaydıracağım paşa. Bitlis'ten Erzurum'a kadar olan mevzileri tutmanız gerekecek.",
                    "Yeni seferber edilen birlikleri Kafkas cephesine kaydırıyorum paşa. Ama bir adım geri çekilmek yasak!",
                    "Maalesef Paşa... İngilizler her cephede bizi sıkıştırırken sana destek yollamam intihar olacaktır."
            };
            olayMuzigi.oynat("1/Chapter3_34.mp3");

        } else if (mevcutYol.equals("TURAN")) {
            this.metin =
                    "İstihbarat Subayı:\n" +
                            "Büyük Hakanım! Karşımızdaki Çinli savaş ağası Zhang Zuolin bir elçi gönderdi.\n" +
                            "'Kış yaklaşıyor, iki ordu da yorgun. Bahara kadar ateşkes yapalım, ticaret yollarını açalım' der.\n" +
                            "Bu bir tuzak olabilir, güç toplayıp baharda bizi ezmek isteyebilir. Ama ordumuzun da dinlenmeye ihtiyacı var.\n";
            this.cevaplar = new String[]{
                    "Türk'ün töresinde durmak yoktur! Düşman zayıfken ezilir. Saldırı emri veriyorum, kış mış dinlemem!",
                    "Ordunun hali perişan, ikmal lazım. Ateşkesi kabul edin ama nöbetçileri iki katına çıkarın. Hazırlık yapacağız."
            };
            olayMuzigi.oynat("2/Chapter3_34.mp3");

        } else if (mevcutYol.equals("CUMHURIYET")) {
            this.metin =
                    "Dahiliye Vekili:\n" +
                            "Paşam, Şapka Kanunu'na tepki olarak Rize'de ve Erzurum'da isyan çıktı.\n" +
                            "Halk 'Fesimizi vermeyiz' diye karakolları taşlıyor. Yerel jandarma yetersiz.\n" +
                            "Hamidiye Zırhlısı'nı limana gönderip şehri topa tutarak gözdağı verelim mi? Yoksa nasihat heyetleri mi yollayalım?\n";
            this.cevaplar = new String[]{
                    "İrtica başını kaldırdığı an ezilmelidir! Hamidiye ateş açsın! Devletin şakası olmadığını anlasınlar.",
                    "Kendi vatandaşımızı topa tutamayız. İkna heyetleri gitsin, elebaşılarını sessizce tutuklayın ama halka zarar gelmesin."
            };
            olayMuzigi.oynat("3/Chapter3_34.mp3");

        } else if (mevcutYol.equals("SERIAT")) {
            this.metin =
                    "İran Büyükelçisi:\n" +
                            "Emir'ül Müminin, Bağdat'ta kendini bilmez bazı Vahhabi radikaller, Şii kardeşlerimizin kutsal saydığı türbeye saldırdı.\n" +
                            "Eğer bu saldırganlar hemen yakalanıp kısas (idam) edilmezse, İran ordusu ittifaktan çekilecektir!\n" +
                            "Ancak saldırganları asarsak Sünni aşiretler 'Şiilere boyun eğdik' diye ayaklanabilir.\n";
            this.cevaplar = new String[]{
                    "Fitne katilden beterdir! Mezhep kavgası çıkaranın kellesi vurula. İran ile ittifak bozulamaz.",
                    "Sünni aşiretleri küstüremeyiz. Saldırganları hapse atın ama idam etmeyin. İran'a da 'gereği yapıldı' deyin."
            };
            olayMuzigi.oynat("4/Chapter3_34.mp3");

        } else if (mevcutYol.equals("PARCALANMA") || mevcutYol.equals("MANDA")) {
            this.metin =
                    "Karadeniz Bölge Komutanlığı:\n" +
                            "Paşam, Batı'da Yunanla uğraşırken Karadeniz'de Pontus Rum çeteleri ikmal kollarımızı vuruyor.\n" +
                            "Düzenli asker gönderemiyoruz. Giresunlu Topal Osman Ağa, 'Bana yetki verin, Karadeniz'i temizleyeyim' diyor.\n" +
                            "Ama Osman Ağa'nın yöntemleri çok serttir, sivil-çete ayrımı yapmaz, Batı dünyasında aleyhimize kullanılabilir.\n";
            this.cevaplar = new String[]{
                    "Merhamet vatana ihanettir! Topal Osman'a tam yetki verin. O dağları Rum çetelerine mezar etsin.",
                    "Osman Ağa kontrolsüz güçtür, başımıza dert açar. Bölge halkını silahlandırın ama çetecilere yetki vermeyin."
            };
            olayMuzigi.oynat("5/Chapter3_34.mp3");
        }

        soruSor();

        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int secim = sc.nextInt();
            sc.nextLine();
            olayMuzigi.durdur();

            if (mevcutYol.equals("TARIHSEL")) {
                if (secim == 1) {
                    yesilYaz("\n*** YENİ ORDU KURULDU ***\n");
                    System.out.println("Irak'tan gelen birliklerle hat tutuldu ama Irak cephesi zayıfladı.");
                    System.out.println("Erzurum savunması güçlendi.");
                    indikatorlerCh3.setIkmalDurumu(indikatorlerCh3.getIkmalDurumu() - 3);
                    indikatorlerCh3.setOrduGucu(indikatorlerCh3.getOrduGucu() - 1); // Kaydırma sırasındaki yorgunluk
                    indikatorlerCh3.setSubayDestegi(indikatorlerCh3.getSubayDestegi() - 1);
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() + 1);
                    indikatorlerCh3.bolgeGuncelle("Kafkas", 5);
                    indikatorlerCh3.bolgeGuncelle("Irak", -5);
                } else if (secim == 2) {
                    yesilYaz("\n*** SEFERBERLİK EMRİ ***\n");
                    System.out.println("Yeni birlikler tecrübesiz olsa da sayısal üstünlük sağladı.");
                    System.out.println("Halkın fedakarlığı ile cephe tutuldu.");
                    indikatorlerCh3.setOrduGucu(indikatorlerCh3.getOrduGucu() - 2); // Tecrübesiz asker
                    indikatorlerCh3.setIkmalDurumu(indikatorlerCh3.getIkmalDurumu() - 1);
                    indikatorlerCh3.setSubayDestegi(indikatorlerCh3.getSubayDestegi() + 2);
                    indikatorlerCh3.setIttifakIliskisi(indikatorlerCh3.getIttifakIliskisi() + 1);
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() + 2);
                    indikatorlerCh3.bolgeGuncelle("Kafkas", 5);
                } else {
                    kirmiziYaz("\n*** ERZURUM DÜŞTÜ ***\n");
                    System.out.println("Destek gitmedi. Ruslar şehre girdi. Doğu Anadolu'nun kilidi kırıldı.");
                    indikatorlerCh3.setIkmalDurumu(indikatorlerCh3.getIkmalDurumu() + 2); // Kaynak harcanmadı
                    indikatorlerCh3.setOrduGucu(indikatorlerCh3.getOrduGucu() + 1); // Asker korundu
                    indikatorlerCh3.setSubayDestegi(indikatorlerCh3.getSubayDestegi() - 3); // Subaylar isyanda
                    indikatorlerCh3.setPadisahDestegi(indikatorlerCh3.getPadisahDestegi() - 2);
                    indikatorlerCh3.bolgeGuncelle("Kafkas", -15); // Büyük kayıp -5 yerine -15
                }

            } else if (mevcutYol.equals("TURAN")) {
                if (secim == 1) {
                    yesilYaz("\n*** KAR VE KAN ***\n");
                    System.out.println("Kış şartlarında saldırdık. Çin ordusu beklemiyordu, dağıldılar.");
                    System.out.println("Büyük ganimet ele geçti ama çok askerimiz donarak şehit oldu.");
                    indikatorlerCh3.setOrduGucu(indikatorlerCh3.getOrduGucu() - 2);
                    indikatorlerCh3.setIkmalDurumu(indikatorlerCh3.getIkmalDurumu() + 4); // Ganimet
                    indikatorlerCh3.setSavasTehlikesi(indikatorlerCh3.getSavasTehlikesi() + 1);
                } else {
                    yesilYaz("\n*** BAHARI BEKLERKEN ***\n");
                    System.out.println("Ateşkes imzalandı. Ordu dinleniyor. Ancak Çinli general de güç topluyor.");
                    indikatorlerCh3.setOrduGucu(indikatorlerCh3.getOrduGucu() + 2);
                    indikatorlerCh3.setIkmalDurumu(indikatorlerCh3.getIkmalDurumu() - 2); // Hazır yiyoruz
                }

            } else if (mevcutYol.equals("CUMHURIYET")) {
                if (secim == 1) {
                    kirmiziYaz("\n*** ATMA HAMİDİYE ATMA! ***\n");
                    System.out.println("Zırhlıdan atılan toplar şehri dövdü. İsyan bastırıldı ama halkın gönlü kırıldı.");
                    System.out.println("Bu olay nesiller boyu unutulmayacak bir travma yarattı.");
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() - 4);
                    indikatorlerCh3.setSubayDestegi(indikatorlerCh3.getSubayDestegi() + 2);
                    indikatorlerCh3.setItilafIliskisi(indikatorlerCh3.getItilafIliskisi() + 2); // Batı kararlılığı sevdi
                } else {
                    yesilYaz("\n*** İKNA YOLU ***\n");
                    System.out.println("İsyan kansız dağıtıldı. Devrim biraz yavaşladı ama kan dökülmedi.");
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() + 2);
                    indikatorlerCh3.setSubayDestegi(indikatorlerCh3.getSubayDestegi() - 1);
                }

            } else if (mevcutYol.equals("SERIAT")) {
                if (secim == 1) {
                    yesilYaz("\n*** KISAS ***\n");
                    System.out.println("Saldırganlar asıldı. İran şahı teşekkür mektubu yolladı.");
                    System.out.println("Radikal Sünniler homurdansa da adalet yerini buldu.");
                    indikatorlerCh3.setIttifakIliskisi(indikatorlerCh3.getIttifakIliskisi() + 3); // İran ile ilişki
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() - 1);
                } else {
                    kirmiziYaz("\n*** MEZHEP ÇATLAĞI ***\n");
                    System.out.println("Katiller idam edilmedi. İran elçisi başkenti terk etti.");
                    System.out.println("İttifak çatırdıyor.");
                    indikatorlerCh3.setOrduGucu(indikatorlerCh3.getOrduGucu() - 2); // İran desteği gitti
                }

            } else { // PARCALANMA veya MANDA
                if (secim == 1) {
                    yesilYaz("\n*** TOPAL OSMAN SAHNEDE ***\n");
                    System.out.println("Karadeniz dağları Rum çetelerinden temizlendi. İkmal yolları açıldı.");
                    System.out.println("Batı basını 'Türkler katliam yapıyor' diye manşet atıyor.");
                    indikatorlerCh3.setIkmalDurumu(indikatorlerCh3.getIkmalDurumu() + 3);
                    indikatorlerCh3.setItilafIliskisi(indikatorlerCh3.getItilafIliskisi() - 4);
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() + 2);
                } else {
                    kirmiziYaz("\n*** KARADENİZ KANIYOR ***\n");
                    System.out.println("Yerel halk direnemedi. İkmal konvoyları vurulmaya devam ediyor.");
                    indikatorlerCh3.setIkmalDurumu(indikatorlerCh3.getIkmalDurumu() - 3);
                    indikatorlerCh3.setOrduGucu(indikatorlerCh3.getOrduGucu() - 1);
                }
            }

        } else {
            olayMuzigi.durdur();
            throw new ArithmeticException("Lütfen sadece sayı giriniz.");
        }
    }
}