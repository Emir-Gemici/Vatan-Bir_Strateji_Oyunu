package com.vatan.chapters.ch3;

import com.vatan.core.*;
import java.util.Scanner;

public class Chapter3_25 extends Olay<IndikatorlerCh3> {

    public Chapter3_25() {
        super("", new String[]{});
    }

    @Override
    public void oynat(IndikatorlerCh3 indikatorlerCh3) {
        String mevcutYol = indikatorlerCh3.getOyunYolu();
        MuzikKutusu olayMuzigi = new MuzikKutusu();

        if (mevcutYol.equals("TARIHSEL")) {
            this.metin =
                    "Çanakkale Müstahkem Mevki Komutanı Cevat Paşa:\n" +
                            "Enver Paşa, İngilizler Ruslara destek göndermek için Çanakkale'den geçmeye çalışıyorlar.\n" +
                            "Ordumuz orada zor durumda. Buradan Çanakkale'ye destek kuvvet gönderir misin?\n" +
                            "Boğaz'ın kilidi kırılırsa Payitaht düşer Paşam!\n";
            this.cevaplar = new String[]{
                    "Eğer İngilizler Çanakkale'den geçerse Ruslar iyice güçlenir ve halimiz perişan olur. Derhal gönderiyorum Cevat Paşam.",
                    "İngilizleri bir şekil durdurursunuz. Ancak eğer biz Rusları durduramazsak o zaman Çanakkale cephesinde çok ağır kayıplar veririz. O yüzden maalesef paşam, biz kendi çaremize siz de kendi çarenize bakmalısınız."
            };
            olayMuzigi.oynat("1/Chapter3_25.mp3");

        } else if (mevcutYol.equals("TURAN")) {
            this.metin =
                    "Afganistan Emiri'nin Elçisi:\n" +
                            "Büyük Hakan Enver Paşa! Ordularınızın Hazar'ı aşıp Türkistan'a yaklaştığını duyduk.\n" +
                            "Hindistan Müslümanları ve Afgan mücahitleri ayaklanmak için sizin işaretinizi bekler.\n" +
                            "Lakin İngilizler sınırımıza yığınak yapıyor. Bize modern silah ve altın gönderirseniz Hindistan'ı İngiliz'e mezar ederiz.\n" +
                            "Ama bu yardım, sizin ana ordunuzun ikmalini zayıflatacaktır.\n";
            this.cevaplar = new String[]{
                    "Hindistan'ın kilidini açacağız! Depolardaki son Alman tüfeklerini ve altınları Afgan kardeşlerimize gönderin. İngiliz'i kalbinden vuracağız!",
                    "Ordumuzun her mermiye ihtiyacı var. Şimdi macera zamanı değil. Biz gelene kadar sabretsinler, yardım gönderemeyiz."
            };
            olayMuzigi.oynat("2/Chapter3_25.mp3");

        } else if (mevcutYol.equals("CUMHURIYET")) {
            this.metin =
                    "Maliye Vekili:\n" +
                            "Paşam, kapitülasyonları kaldırdık ama ecnebi şirketleri hala demiryollarımızı ve limanlarımızı işletiyor.\n" +
                            "Ekonomik bağımsızlık için bu şirketleri millileştirmemiz, yani devletleştirmemiz şart.\n" +
                            "Ancak bunu yaparsak Avrupa sermayesi bize tamamen sırt çevirir, borç bulamayız. Kemer sıkmak zorunda kalırız.\n";
            this.cevaplar = new String[]{
                    "Bağımsızlık ucuz değildir! Tüm yabancı şirketlere el koyun. Demiryolları da limanlar da Türk milletinindir!",
                    "Hazinenin durumu malum. Şimdilik ürkütmeyelim, vergi oranlarını artırmakla yetinelim."
            };
            olayMuzigi.oynat("3/Chapter3_25.mp3");

        } else if (mevcutYol.equals("SERIAT")) {
            this.metin =
                    "Adliye Nazırı:\n" +
                            "Paşam, şeriat hükümlerini geri getirdik lakin mahkemelerde 'Nizamiye' (Batı tarzı) ve 'Şer'i' mahkemeler arası yetki karmaşası var.\n" +
                            "Ulema, Nizamiye mahkemelerinin tamamen kapatılmasını ve Kadı'ların tek yetkili olmasını istiyor.\n" +
                            "Hukukçular ise modern ticaret kanunlarının Şer'i mahkemelerle yürümeyeceğini söylüyor.\n";
            this.cevaplar = new String[]{
                    "Allah'ın kanunu varken kulun kanunu olmaz! Nizamiye mahkemelerini kapatın, tek hüküm Kuran'dır.",
                    "Devlet işleyişi aksamasın. Ticaret ve ceza davaları modern mahkemelerde, aile hukuku şer'i mahkemelerde görülsün."
            };
            olayMuzigi.oynat("4/Chapter3_25.mp3");

        } else if (mevcutYol.equals("PARCALANMA") || mevcutYol.equals("MANDA")) {
            this.metin =
                    "Batı Cephesinden Haber:\n" +
                            "Paşam, Yunan ordusu İzmir'den içeriye doğru ilerliyor. Elimizde düzenli birlik yok, sadece Kuvayi Milliye çeteleri var.\n" +
                            "Çerkes Ethem 'Bana yetki verin, düzenli orduya gerek yok, ben Yunan'ı hallederim' diyor.\n" +
                            "Ama Ethem güçlenirse yarın bize de başkaldırabilir. Düzenli orduyu mu bekleyelim yoksa Ethem'e mi güvenelim?\n";
            this.cevaplar = new String[]{
                    "Denize düşen yılana sarılır. Ethem'e silah ve para verin, Yunan'ı durdursun. Sonrasına bakarız.",
                    "Çetelerle devlet kurulmaz! Ethem'i boşverin, ne pahasına olursa olsun aceleyle düzenli birlikler kurmaya çalışın."
            };
            olayMuzigi.oynat("5/Chapter3_25.mp3");
        }

        soruSor();

        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int secim = sc.nextInt();
            sc.nextLine();
            olayMuzigi.durdur();

            if (mevcutYol.equals("TARIHSEL")) {
                if (secim == 1) {
                    yesilYaz("\n*** ÇANAKKALE GEÇİLMEZ ***\n");
                    System.out.println("Takviye birlikler Seyit Onbaşı'nın bataryalarına ve Nusret'in mayın hatlarına can suyu oldu.");
                    System.out.println("Boğaz savunması güçlendi ama Kafkas cephesi zayıfladı.");

                    indikatorlerCh3.setAskerMorali(indikatorlerCh3.getAskerMorali() - 2);
                    indikatorlerCh3.bolgeGuncelle("Canakkale", 10);
                    indikatorlerCh3.setIttifakIliskisi(indikatorlerCh3.getIttifakIliskisi() + 1);
                    indikatorlerCh3.bolgeGuncelle("Kafkas", -10);
                    indikatorlerCh3.setPadisahDestegi(indikatorlerCh3.getPadisahDestegi() + 1);
                    indikatorlerCh3.setSubayDestegi(indikatorlerCh3.getSubayDestegi() - 1);
                } else {
                    kirmiziYaz("\n*** PAYİTAHT TEHLİKEDE ***\n");
                    System.out.println("Çanakkale'ye destek gitmedi. İngiliz zırhlıları tabyaları dövüyor.");
                    System.out.println("Kafkasya'da elimiz güçlü olsa da Boğazlar düşerse bunun bir anlamı kalmayacak.");

                    indikatorlerCh3.setAskerMorali(indikatorlerCh3.getAskerMorali() + 2);
                    indikatorlerCh3.bolgeGuncelle("Canakkale", -5);
                    indikatorlerCh3.bolgeGuncelle("Kafkas", 10);
                    indikatorlerCh3.setSubayDestegi(indikatorlerCh3.getSubayDestegi() + 1);
                }

            } else if (mevcutYol.equals("TURAN")) {
                if (secim == 1) {
                    yesilYaz("\n*** HİNDİSTAN AYAKLANIYOR ***\n");
                    System.out.println("Gönderdiğimiz silahlarla Afgan ve Hint Müslümanları İngiliz karakollarına saldırdı.");
                    System.out.println("İngiltere panikledi ve kuvvetlerini Hindistan'a çekti. Cephemiz rahatladı.");
                    indikatorlerCh3.setOrduGucu(indikatorlerCh3.getOrduGucu() - 1);
                    indikatorlerCh3.setIkmalDurumu(indikatorlerCh3.getIkmalDurumu() - 3);
                    indikatorlerCh3.setSavasTehlikesi(indikatorlerCh3.getSavasTehlikesi() + 2); // İngilizler çıldırdı
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() + 3);
                } else {
                    yesilYaz("\n*** ORDUMUZU KORUDUK ***\n");
                    System.out.println("Yardım gitmeyince isyan cılız kaldı ve İngilizler tarafından ezildi.");
                    System.out.println("Ancak ana ordumuzun ikmali bozulmadı.");
                    indikatorlerCh3.setIkmalDurumu(indikatorlerCh3.getIkmalDurumu() + 2);
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() - 2);
                }

            } else if (mevcutYol.equals("CUMHURIYET")) {
                if (secim == 1) {
                    yesilYaz("\n*** MİLLİ EKONOMİ ***\n");
                    System.out.println("Limanlara ve trenlere Türk bayrağı çekildi. Yabancı sermaye ülkeyi terk ediyor.");
                    System.out.println("Kısa vadede kriz var ama gelecek nesiller borçsuz yaşayacak.");
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() + 4);
                    indikatorlerCh3.setIkmalDurumu(indikatorlerCh3.getIkmalDurumu() - 3);
                    indikatorlerCh3.setItilafIliskisi(indikatorlerCh3.getItilafIliskisi() - 3);
                } else {
                    yesilYaz("\n*** SICAK PARA ***\n");
                    System.out.println("Avrupalı bankerler rahatladı, kredi muslukları açıldı. Piyasa canlı ama iplerimiz onların elinde.");
                    indikatorlerCh3.setIkmalDurumu(indikatorlerCh3.getIkmalDurumu() + 3);
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() - 2);
                }

            } else if (mevcutYol.equals("SERIAT")) {
                if (secim == 1) {
                    yesilYaz("\n*** ŞERİAT-I GARRA ***\n");
                    System.out.println("Batı kanunları lağvedildi. Ulema sizi 'Emir'ül Müminin' ilan etti.");
                    System.out.println("Ancak tüccarlar ve yabancılar hukuki belirsizlik yüzünden ülkeden kaçıyor.");
                    indikatorlerCh3.setPadisahDestegi(indikatorlerCh3.getPadisahDestegi() + 5);
                    indikatorlerCh3.setSubayDestegi(indikatorlerCh3.getSubayDestegi() - 3);
                    indikatorlerCh3.setIkmalDurumu(indikatorlerCh3.getIkmalDurumu() - 2);
                } else {
                    yesilYaz("\n*** DENGELİ SİYASET ***\n");
                    System.out.println("Devlet çarkları dönmeye devam ediyor. Radikaller kızgın ama düzen bozulmadı.");
                    indikatorlerCh3.setSubayDestegi(indikatorlerCh3.getSubayDestegi() + 2);
                    indikatorlerCh3.setPadisahDestegi(indikatorlerCh3.getPadisahDestegi() - 2);
                }

            } else { // PARCALANMA veya MANDA
                if (secim == 1) {
                    yesilYaz("\n*** ETHEM'İN YÜKSELİŞİ ***\n");
                    System.out.println("Kuvayi Seyyare Yunan ilerleyişini durdurdu. Halk Ethem'i kurtarıcı sanıyor.");
                    System.out.println("Düzenli ordu kurma çalışmaları sekteye uğradı.");
                    indikatorlerCh3.setOrduGucu(indikatorlerCh3.getOrduGucu() + 1); // Anlık güç
                    indikatorlerCh3.setSubayDestegi(indikatorlerCh3.getSubayDestegi() - 3); // Subaylar Ethem'den nefret eder
                } else {
                    kirmiziYaz("\n*** ZAMAN KAZANMAYA ÇALIŞIYORUZ ***\n");
                    System.out.println("Yunan ordusu ilerliyor, köyler yanıyor. Ama düzenli ordu temelleri atılıyor.");
                    System.out.println("Halk 'Asker nerede?' diye feryat ediyor.");
                    indikatorlerCh3.setOrduGucu(indikatorlerCh3.getOrduGucu() - 2); // Anlık zayıflık
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() - 3);
                    indikatorlerCh3.setSubayDestegi(indikatorlerCh3.getSubayDestegi() + 2);
                }
            }

        } else {
            olayMuzigi.durdur();
            throw new ArithmeticException("Lütfen sadece sayı giriniz.");
        }
    }
}