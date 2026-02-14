package com.vatan.chapters.ch3;

import com.vatan.core.*;
import java.util.Random;
import java.util.Scanner;

public class Chapter3_38 extends Olay<IndikatorlerCh3> {

    public Chapter3_38() {
        super("", new String[]{});
    }

    @Override
    public void oynat(IndikatorlerCh3 indikatorlerCh3) {
        String mevcutYol = indikatorlerCh3.getOyunYolu();
        MuzikKutusu olayMuzigi = new MuzikKutusu();

        if (mevcutYol.equals("TARIHSEL")) {
            this.metin =
                    "Mustafa Kemal Paşa:\n" +
                            "Enver Paşa, Muş ve Bitlis'i geri alabilmek için bir karşı saldırı planlıyorum. Bu konuda nasıl bir temennin olur?\n";
            this.cevaplar = new String[]{
                    "Mustafa Kemal, bence Bingöl civarlarındaki Şerafettin dağlarının arasından dolaşabiliriz. Orduyu ikiye bölüp kıskaca alalım. (Riskli Taarruz)",
                    "İlk önce Bitlis'i korumaya gayret edebiliriz. Güneyden Bitlis'i alıp sonra Muş'a arkadan saldıralım. (Kademeli Harekat)"
            };
            olayMuzigi.oynat("1/Chapter3_38.mp3");

        } else if (mevcutYol.equals("TURAN")) {
            this.metin =
                    "İstihbarat Raporu (Urumçi):\n" +
                            "Büyük Hakanım! Çin ordusu toparlanıyor. Ancak kuzeyden kaçan 'Beyaz Rus' (Çar taraftarı) General Annenkov bize sığındı.\n" +
                            "'Bolşeviklere ve Çinlilere karşı emrinizde savaşırız' diyorlar. Yanlarında zırhlı trenler ve toplar var.\n" +
                            "Lakin bunlar eski düşmanımız Ruslardır. Güvenilir mi?\n";
            this.cevaplar = new String[]{
                    "Düşmanımın düşmanı dostumdur! Beyaz Rusları orduya katın. Zırhlı trenlere ihtiyacımız var.",
                    "Rus'tan dost olmaz! Silahlarını alın, kendilerini sınır dışı edin. Türk'ün Türk'ten başka dostu yoktur."
            };
            olayMuzigi.oynat("2/Chapter3_38.mp3");

        } else if (mevcutYol.equals("CUMHURIYET")) {
            this.metin =
                    "Dahiliye Vekili Şükrü Kaya:\n" +
                            "Paşam, toplumda 'Ağa, Paşa, Hoca, Hafız' gibi unvanlar sınıf ayrımı yaratıyor.\n" +
                            "Herkesin bir 'Soyadı' olmalı ve eski unvanlar yasaklanmalı.\n" +
                            "Sizden de 'Paşa' unvanını bırakıp sivil bir soyadı almanızı bekliyoruz. Halk bunu yadırgayabilir.\n";
            this.cevaplar = new String[]{
                    "İmtiyazsız, sınıfsız bir milletiz! Kanun çıksın. Ben de 'Paşa'lığı bırakıyorum. Herkes eşit olacak.",
                    "Gelenekleri bir anda yıkmayalım. Soyadı gelsin ama eski unvanlar yasaklanmasın. Saygı ifadesidir."
            };
            olayMuzigi.oynat("3/Chapter3_38.mp3");

        } else if (mevcutYol.equals("SERIAT")) {
            this.metin =
                    "Hariciye Nazırı:\n" +
                            "Sultanım, Milletler Cemiyeti 'Köleliğin Kaldırılması' sözleşmesini imzalamamızı istiyor.\n" +
                            "Şeriat hukukunda kölelik (cariye/köle) belirli şartlarda vardır, haram değildir.\n" +
                            "Eğer imzalamazsak dünya bize ambargo uygulayacak. İmzalarsak 'Allah'ın helal kıldığını haram kıldınız' diyecekler.\n";
            this.cevaplar = new String[]{
                    "Dünya değişti, maslahat bunu gerektirir. Sözleşmeyi imzalayın, kölelik resmen kalkmıştır.",
                    "Kafirlerin kanunu bizi bağlamaz! İmza atmıyoruz. Rızkı veren Allah'tır, ambargodan korkmayız."
            };
            olayMuzigi.oynat("4/Chapter3_38.mp3");

        } else if (mevcutYol.equals("PARCALANMA") || mevcutYol.equals("MANDA")) {
            this.metin =
                    "Başkomutanlık Karargahı (Büyük Taarruz Hazırlığı):\n" +
                            "Paşam, Sakarya'da Yunan'ı durdurduk ama atmak için 'Büyük Taarruz' lazım.\n" +
                            "Ordunun giyeceği, yiyeceği kalmadı. Tekalif-i Milliye'yi 2. kez, daha sert uygulayıp halkın elinde ne varsa %40'ını daha almamız lazım.\n" +
                            "Halk zaten aç. Veremezse ne yapacağız?\n";
            this.cevaplar = new String[]{
                    "Bu son kavgadır! Zorla da olsa alın. Vatan kurtulunca hepsini geri öderiz.",
                    "Halkı daha fazla sıkamayız. Elimizdekiyle idare edeceğiz. Süngü gücüyle saldıracağız."
            };
            olayMuzigi.oynat("5/Chapter3_38.mp3");
        }

        soruSor();

        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int secim = sc.nextInt();
            sc.nextLine();
            olayMuzigi.durdur();

            if (mevcutYol.equals("TARIHSEL")) {
                if (secim == 1) {
                    Random zar = new Random();
                    int sans = zar.nextInt(100);

                    if (sans < 70) { // %70 İhtimalle Başarılı
                        yesilYaz("\n*** KURT KAPANI ***\n");
                        System.out.println("Plan tıkır tıkır işledi! Ruslar toprak hırsıyla tuzağa düştü.");
                        System.out.println("Muş ve Bitlis kurtarıldı. Mustafa Kemal Paşa bir kez daha askeri dehasını kanıtladı.");

                        indikatorlerCh3.setAskerMorali(indikatorlerCh3.getAskerMorali() + 3);
                        indikatorlerCh3.setIttifakIliskisi(indikatorlerCh3.getIttifakIliskisi() + 1);
                        indikatorlerCh3.setItilafGucu(indikatorlerCh3.getItilafGucu() - 3);
                        indikatorlerCh3.bolgeGuncelle("Kafkas", 10);
                        indikatorlerCh3.setOrduGucu(indikatorlerCh3.getOrduGucu() + 3);
                        indikatorlerCh3.setPadisahDestegi(indikatorlerCh3.getPadisahDestegi() + 3);
                        indikatorlerCh3.setSubayDestegi(indikatorlerCh3.getSubayDestegi() + 3);
                    } else { // %30 İhtimalle Başarısız
                        kirmiziYaz("\n*** RUSLAR UYANIK ÇIKTI ***\n");
                        System.out.println("Rus komutan tuzağı fark etti. Bölünen ordumuzu ayrı ayrı vurdular.");
                        System.out.println("Ağır kayıp verdik, geri çekiliyoruz.");

                        indikatorlerCh3.setAskerMorali(indikatorlerCh3.getAskerMorali() - 2);
                        indikatorlerCh3.setItilafGucu(indikatorlerCh3.getItilafGucu() - 1);
                        indikatorlerCh3.bolgeGuncelle("Kafkas", -5);
                        indikatorlerCh3.setOrduGucu(indikatorlerCh3.getOrduGucu() - 2);
                        indikatorlerCh3.setSubayDestegi(indikatorlerCh3.getSubayDestegi() - 2);
                    }
                } else {
                    yesilYaz("\n*** ADIM ADIM ZAFER ***\n");
                    System.out.println("Sağlam adımlarla ilerledik. Önce Bitlis, sonra Muş kurtarıldı.");
                    System.out.println("Ruslar Muş'tan atıldı. Kayıplarımız az.");

                    indikatorlerCh3.setAskerMorali(indikatorlerCh3.getAskerMorali() + 2);
                    indikatorlerCh3.setIttifakIliskisi(indikatorlerCh3.getIttifakIliskisi() + 1);
                    indikatorlerCh3.setItilafGucu(indikatorlerCh3.getItilafGucu() - 2);
                    indikatorlerCh3.bolgeGuncelle("Kafkas", 5);
                    indikatorlerCh3.setOrduGucu(indikatorlerCh3.getOrduGucu() + 1);
                    indikatorlerCh3.setPadisahDestegi(indikatorlerCh3.getPadisahDestegi() + 2);
                    indikatorlerCh3.setSubayDestegi(indikatorlerCh3.getSubayDestegi() + 2);
                }

            } else if (mevcutYol.equals("TURAN")) {
                if (secim == 1) {
                    yesilYaz("\n*** GARİP İTTİFAK ***\n");
                    System.out.println("Beyaz Ruslar ve Türk süvarileri omuz omuza. Çin ordusu bu ateş gücü karşısında şaşırdı.");
                    indikatorlerCh3.setOrduGucu(indikatorlerCh3.getOrduGucu() + 3);
                    indikatorlerCh3.setSubayDestegi(indikatorlerCh3.getSubayDestegi() - 2); // Bazı subaylar Ruslardan rahatsız
                } else {
                    yesilYaz("\n*** MİLLİ ORDU ***\n");
                    System.out.println("Rusları kovdunuz. Silahlarına el koyduk. Ordu saflığını korudu.");
                    indikatorlerCh3.setOrduGucu(indikatorlerCh3.getOrduGucu() + 1);
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() + 2);
                }

            } else if (mevcutYol.equals("CUMHURIYET")) {
                if (secim == 1) {
                    yesilYaz("\n*** EŞİTLİK ***\n");
                    System.out.println("Ağalık, paşalık bitti. Halk kanun önünde eşitlendi.");
                    System.out.println("Kırsaldaki feodal yapı darbe yedi.");
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() + 3);
                    indikatorlerCh3.setSubayDestegi(indikatorlerCh3.getSubayDestegi() - 1);
                } else {
                    yesilYaz("\n*** GELENEKÇİ MODERNİZM ***\n");
                    System.out.println("Soyadı geldi ama unvanlar kalkmadı. Toplumsal hiyerarşi devam ediyor.");
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() - 1);
                    indikatorlerCh3.setPadisahDestegi(indikatorlerCh3.getPadisahDestegi() + 2);
                }

            } else if (mevcutYol.equals("SERIAT")) {
                if (secim == 1) {
                    yesilYaz("\n*** ZAMANIN RUHU ***\n");
                    System.out.println("Kölelik resmen kalktı. Batı ile ilişkiler yumuşadı.");
                    System.out.println("Radikaller tepkili ama devlet nefes aldı.");
                    indikatorlerCh3.setItilafIliskisi(indikatorlerCh3.getItilafIliskisi() + 3);
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() + 2);
                } else {
                    kirmiziYaz("\n*** YALNIZLIK ***\n");
                    System.out.println("Dünya ile bağlar koptu. Ambargolar başladı.");
                    System.out.println("Ekonomi çöküyor.");
                    indikatorlerCh3.setIkmalDurumu(indikatorlerCh3.getIkmalDurumu() - 4);
                }

            } else { // PARCALANMA veya MANDA
                if (secim == 1) {
                    yesilYaz("\n*** SON FEDAKARLIK ***\n");
                    System.out.println("Halk son ineğini, son yün çorabını verdi. Ordu taarruza hazır.");
                    System.out.println("Bu milletin büyüklüğü tarihe geçti.");
                    indikatorlerCh3.setIkmalDurumu(indikatorlerCh3.getIkmalDurumu() + 5);
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() - 3); // Açlık sınırı
                } else {
                    kirmiziYaz("\n*** EKSİK ORDU ***\n");
                    System.out.println("Taarruz için yeterli top ve mermi yok. Saldırırsak kırılabiliriz.");
                    indikatorlerCh3.setOrduGucu(indikatorlerCh3.getOrduGucu() - 2);
                    indikatorlerCh3.setSavasTehlikesi(5);
                }
            }

        } else {
            olayMuzigi.durdur();
            throw new ArithmeticException("Lütfen sadece sayı giriniz.");
        }
    }
}