package com.vatan.chapters.ch3;

import com.vatan.core.*;
import java.util.Scanner;

public class Chapter3_32 extends Olay<IndikatorlerCh3> {

    public Chapter3_32() {
        super("", new String[]{});
    }

    @Override
    public void oynat(IndikatorlerCh3 indikatorlerCh3) {
        String mevcutYol = indikatorlerCh3.getOyunYolu();
        MuzikKutusu olayMuzigi = new MuzikKutusu();

        if (mevcutYol.equals("TARIHSEL")) {
            this.metin =
                    "Mahmut Kamil Paşa:\n" +
                            "Paşa hazretleri! Ne yazık ki 3. Ordu'nun talihsizlikleri bitmek bilmiyor.\n" +
                            "Rus ordusu bizi Ermenilerin desteği ile tarumar etti! Malazgirt'i kaybettik.\n" +
                            "Düşman Muş üzerinden Anadolu'ya inecek gibi duruyor. Ordumuzun hali yamandır efendim.\n";
            this.cevaplar = new String[]{
                    "Allah kahretsin. Şu Ermenilerden kurtulun artık! (Tehcir Kararı)",
                    "Rusları durdurmanız imkansız gibi paşa. Trabzon-Erzurum-Ağrı hattına çekilmenizi icap edecektir."
            };
            olayMuzigi.oynat("1/Chapter3_32.mp3");

        } else if (mevcutYol.equals("TURAN")) {
            this.metin =
                    "Kurmay Başkanı:\n" +
                            "Büyük Hakanım! Çin Seddi'ni aştık lakin karşımızda sonsuz bir ova var.\n" +
                            "İlerledikçe ikmal hatlarımız uzuyor. Çinli generaller bizi içeri çekip kuşatmak istiyor.\n" +
                            "Urumçi'yi merkez yapıp yerimizi mi sağlamlaştıralım, yoksa Pekin'e doğru yıldırım harekatına devam mı edelim?\n" +
                            "Asker 'Pekin'deki Yasak Şehir'i yağmalamak' istiyor ama bu bir tuzak olabilir.\n";
            this.cevaplar = new String[]{
                    "Kurt avını bırakmaz! Pekin'e yürüyoruz. Çin İmparatoru diz çökecek!",
                    "Aç gözlülük felaket getirir. Urumçi'de durun, kaleleri tahkim edin. Burası artık bizim vatanımızdır."
            };
            olayMuzigi.oynat("2/Chapter3_32.mp3");

        } else if (mevcutYol.equals("CUMHURIYET")) {
            this.metin =
                    "Meclis Başkanı Kazım (Karabekir) Paşa:\n" +
                            "Paşam, kurduğunuz 'Terakkiperver Cumhuriyet Fırkası' muhalefeti sertleştirdi.\n" +
                            "Meclis'te devrimlerinizi eleştiriyorlar, halkı 'din elden gidiyor' diye kışkırtıyorlar.\n" +
                            "Ama parti kapatmak demokrasiye sığmaz. Bu muhalefete tahammül mü edeceğiz, yoksa 'irtica yuvası' diyerek kapatacak mıyız?\n";
            this.cevaplar = new String[]{
                    "Demokrasi amaç değil araçtır! Devrimleri korumak için partiyi kapatın. Muhalefetin vakti değil.",
                    "Söz milletindir Kazım. Bırak konuşsunlar, biz cevabımızı sandıkta veririz. Parti açık kalacak."
            };
            olayMuzigi.oynat("3/Chapter3_32.mp3");

        } else if (mevcutYol.equals("SERIAT")) {
            this.metin =
                    "Medrese Hocaları Heyeti:\n" +
                            "Sultanım, mekteplerde hala ecnebi dilleri (Fransızca) ve felsefe dersleri okutuluyor.\n" +
                            "Talebelerin zihni bulanıyor. 'Dünya dönüyor' diyen muallimler var.\n" +
                            "İlim sadece Kuran ve Sünnet'tir. Bu dersleri yasaklayıp yerine Fıkıh ve Kelam dersleri koyalım.\n";
            this.cevaplar = new String[]{
                    "Batı'nın ilmi değil, fennini alacağız. Felsefe ve ecnebi dil yasak! Sadece dini ilimler okutulsun.",
                    "Sakın ha! Topla tüfekle savaş kazanılır ama ilimle devlet yönetilir. Fen dersleri kalacak."
            };
            olayMuzigi.oynat("4/Chapter3_32.mp3");

        } else if (mevcutYol.equals("PARCALANMA") || mevcutYol.equals("MANDA")) {
            this.metin =
                    "Meclis Kürsüsü (Ankara):\n" +
                            "Mebuslar ayakta! Yunan top sesleri Ankara'dan duyulmaya başladı.\n" +
                            "Bazı vekiller 'Meclis'i Kayseri'ye taşıyalım, burada esir düşeriz' diyor.\n" +
                            "Eğer Meclis taşınırsa halkın ve askerin morali tamamen çöker. Ama kalırsak ve Yunan girerse hepimiz asılırız.\n";
            this.cevaplar = new String[]{
                    "Meclis Kayseri'ye taşınacak! Devletin aklı ve iradesi esir düşmemeli. Hazırlıklara başlayın.",
                    "Bu Meclis'in temeli Sakarya'da atılmadı ki Kayseri'ye taşınsın! Buradayız, gerekirse Meclis bahçesinde savaşır ölürüz!"
            };
            olayMuzigi.oynat("5/Chapter3_32.mp3");
        }

        soruSor();

        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int secim = sc.nextInt();
            sc.nextLine();
            olayMuzigi.durdur();

            if (mevcutYol.equals("TARIHSEL")) {
                if (secim == 1) {
                    yesilYaz("\n*** TEHCİR KARARI ***\n");
                    System.out.println("Ermeni çetelerine karşı sert tedbirler alındı. Ordu arkasını sağlama aldı.");
                    System.out.println("Lakin bu karar dünyada büyük yankı uyandıracak.");

                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() - 2);
                    indikatorlerCh3.setSubayDestegi(indikatorlerCh3.getSubayDestegi() + 3);
                    indikatorlerCh3.setAskerMorali(indikatorlerCh3.getAskerMorali() + 1);
                    indikatorlerCh3.setPadisahDestegi(indikatorlerCh3.getPadisahDestegi() - 2);
                } else {
                    kirmiziYaz("\n*** BÜYÜK GERİ ÇEKİLİŞ ***\n");
                    System.out.println("Ruslar Erzurum ve Trabzon'a girdi. Muş düştü.");
                    System.out.println("Binlerce muhacir yollara döküldü. Doğu Anadolu kan ağlıyor.");

                    indikatorlerCh3.bolgeGuncelle("Kafkas", -5);
                    indikatorlerCh3.setIkmalDurumu(indikatorlerCh3.getIkmalDurumu() + 1); // Hatlar kısaldı
                    indikatorlerCh3.setAskerMorali(indikatorlerCh3.getAskerMorali() - 1);
                    indikatorlerCh3.setPadisahDestegi(indikatorlerCh3.getPadisahDestegi() + 1);
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() + 1); // Halk canını kurtardı
                }

            } else if (mevcutYol.equals("TURAN")) {
                if (secim == 1) {
                    kirmiziYaz("\n*** ÇİN BATAKLIĞI ***\n");
                    System.out.println("Ordu içlere daldı ama ikmal koptu. Çin gerilla savaşıyla bizi eritiyor.");
                    System.out.println("Zafer sarhoşluğu felakete dönüşebilir.");
                    indikatorlerCh3.setOrduGucu(indikatorlerCh3.getOrduGucu() - 3);
                    indikatorlerCh3.setIkmalDurumu(indikatorlerCh3.getIkmalDurumu() - 5);
                } else {
                    yesilYaz("\n*** DOĞU TÜRKİSTAN DEVLETİ ***\n");
                    System.out.println("Urumçi'de bayrak göndere çekildi. Yerimizi sağlamlaştırdık.");
                    System.out.println("Çin saldırmaya cesaret edemiyor.");
                    indikatorlerCh3.setIkmalDurumu(indikatorlerCh3.getIkmalDurumu() + 3);
                    indikatorlerCh3.setOrduGucu(indikatorlerCh3.getOrduGucu() + 1);
                }

            } else if (mevcutYol.equals("CUMHURIYET")) {
                if (secim == 1) {
                    yesilYaz("\n*** TEK PARTİ DÖNEMİ ***\n");
                    System.out.println("Parti kapatıldı. Muhalefet sindirildi ama yeraltına indi.");
                    System.out.println("Batı basını 'Diktatör Enver' diye yazıyor.");
                    indikatorlerCh3.setSubayDestegi(indikatorlerCh3.getSubayDestegi() + 3);
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() - 2);
                    indikatorlerCh3.setItilafIliskisi(indikatorlerCh3.getItilafIliskisi() - 2);
                } else {
                    kirmiziYaz("\n*** MECLİS KARIŞTI ***\n");
                    System.out.println("Muhalefet güçlendi, her yasanızı engelliyorlar. Hükümet krizde.");
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() + 2);
                    indikatorlerCh3.setSubayDestegi(indikatorlerCh3.getSubayDestegi() - 3);
                }

            } else if (mevcutYol.equals("SERIAT")) {
                if (secim == 1) {
                    kirmiziYaz("\n*** KARANLIK ÇAĞ ***\n");
                    System.out.println("Okullar medreseye döndü. Mühendisler ve doktorlar ülkeyi terk ediyor.");
                    System.out.println("Ordu teknolojisiz kaldı.");
                    indikatorlerCh3.setOrduGucu(indikatorlerCh3.getOrduGucu() - 3);
                    indikatorlerCh3.setPadisahDestegi(indikatorlerCh3.getPadisahDestegi() + 3);
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() - 3); // Aydın kesim küstü
                } else {
                    yesilYaz("\n*** İSLAM VE FEN ***\n");
                    System.out.println("Ulemayı dinlemediniz. Mektepler ilim yuvası olmaya devam ediyor.");
                    System.out.println("Ordu modernleşiyor.");
                    indikatorlerCh3.setOrduGucu(indikatorlerCh3.getOrduGucu() + 2);
                    indikatorlerCh3.setPadisahDestegi(indikatorlerCh3.getPadisahDestegi() - 2);
                }

            } else { // PARCALANMA veya MANDA
                if (secim == 1) {
                    kirmiziYaz("\n*** MORALLER SIFIR ***\n");
                    System.out.println("Meclis taşınıyor haberi duyulunca asker mevziyi terk etmeye başladı.");
                    System.out.println("Ankara'da panik var. 'Devlet kaçıyor' dedikodusu yayıldı.");
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() - 5);
                    indikatorlerCh3.setAskerMorali(indikatorlerCh3.getAskerMorali() - 5);
                } else {
                    yesilYaz("\n*** BURADAYIZ! ***\n");
                    System.out.println("Meclis kürsüsüne kefenle çıkan vekiller oldu. Bu kararlılık orduya şevk verdi.");
                    System.out.println("Ankara düşse bile ruh düşmeyecek!");
                    indikatorlerCh3.setAskerMorali(indikatorlerCh3.getAskerMorali() + 5);
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() + 3);
                }
            }

        } else {
            olayMuzigi.durdur();
            throw new ArithmeticException("Lütfen sadece sayı giriniz.");
        }
    }
}