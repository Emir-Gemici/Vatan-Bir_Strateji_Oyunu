package com.vatan.chapters.ch3;

import com.vatan.core.*;
import java.util.Scanner;

public class Chapter3_36 extends Olay<IndikatorlerCh3> {

    public Chapter3_36() {
        super("", new String[]{});
    }

    @Override
    public void oynat(IndikatorlerCh3 indikatorlerCh3) {
        String mevcutYol = indikatorlerCh3.getOyunYolu();
        MuzikKutusu olayMuzigi = new MuzikKutusu();

        if (mevcutYol.equals("TARIHSEL")) {
            this.metin =
                    "Bahriye Nazırı Cemal Paşa:\n" +
                            "Enver, Süveyş Kanalı'na 2. defa saldırmayı planlıyoruz. Bu sefer İngilizleri burada tutup Batı'ya destek vermelerini önlemeye gayret edeceğiz.\n" +
                            "Ancak Süveyş Kanalı'nın karşı tarafından uzaktan atış mı yaparak bu durumu gerçekleştirelim,\n" +
                            "Yoksa karşı tarafa da geçmeye çalışıp taarruz ağırlıklı mı harekat yapalım?\n";
            this.cevaplar = new String[]{
                    "Cemal, sana tavsiyem çok taarruz ağırlıklı bir harekat yapmaman olacaktır. Çünkü karşı tarafa geçmeye gayret ettiğiniz sırada İngilizler sizin geminizi denize düşürebilirler.",
                    "Karşıya geçip gavuru buraya geldiğine pişman edelim! Taarruz esastır!"
            };
            olayMuzigi.oynat("1/Chapter3_36.mp3");

        } else if (mevcutYol.equals("TURAN")) {
            this.metin =
                    "Türkistan Cephesi - Buhara Önleri:\n" +
                            "Büyük Hakanım! Sovyet kuklası Buhara Emiri kaleye kapandı. Şehir surları çok güçlü.\n" +
                            "İçeride binlerce masum Türk de yaşıyor. Şehri ağır toplarla döverek mi girelim (Sivil kayıp riski),\n" +
                            "Yoksa şehri kuşatıp aç bırakarak teslim olmalarını mı bekleyelim? (Zaman kaybı ve Rus takviyesi riski)\n";
            this.cevaplar = new String[]{
                    "Merhamet zaafiyet doğurur! Topçular ateş serbest! Buhara düşmeden Turan kurulmaz. Surları yıkın!",
                    "Kendi insanımızı vuramayız. Kuşatın, sularını kesin. Aç kalınca Emir'i kendileri teslim ederler."
            };
            olayMuzigi.oynat("2/Chapter3_36.mp3");

        } else if (mevcutYol.equals("CUMHURIYET")) {
            this.metin =
                    "Hariciye Vekili Tevfik Rüştü (Aras) Bey:\n" +
                            "Paşam, İtalya'da faşist lider Mussolini 'Bizim deniz' (Mare Nostrum) diyerek Antalya ve Rodos üzerinde hak iddia ediyor.\n" +
                            "Akdeniz'de donanma tatbikatı yaparak bize gözdağı veriyorlar.\n" +
                            "Cevap olarak biz de donanmayı Akdeniz'e indirip 'Savaşa hazırız' mesajı mı verelim, yoksa Cemiyet-i Akvam'a (BM) şikayet mi edelim?\n";
            this.cevaplar = new String[]{
                    "İtalyan korkağına pabuç bırakmam! Donanma Akdeniz'e! Namluları İtalyan gemilerine çevirin.",
                    "Genç Cumhuriyet yeni bir savaşı kaldıramaz. Diplomasiyi kullanalım, dünyayı arkamıza alalım."
            };
            olayMuzigi.oynat("3/Chapter3_36.mp3");

        } else if (mevcutYol.equals("SERIAT")) {
            this.metin =
                    "Sağlık Nazırı:\n" +
                            "Sultanım, Hac mevsimi yaklaşıyor lakin Hicaz bölgesinde 'Kolera' salgını baş gösterdi.\n" +
                            "Eğer Hac ibadetine izin verirsek hastalık tüm İslam alemine yayılabilir ve binlerce kişi ölebilir.\n" +
                            "Haccı bu senelik yasaklayıp Kabe'yi karantinaya alalım mı? Ulema 'Allah'ın evini kapatamazsınız' diyecektir.\n";
            this.cevaplar = new String[]{
                    "Tedbir takdirin önüne geçemez ama akıl da farzdır. Kabe karantinaya alınacak! Hac yasak!",
                    "Ecel birdir, değişmez. Müminler Allah'ın misafiridir, onları geri çeviremeyiz. Hac devam edecek."
            };
            olayMuzigi.oynat("4/Chapter3_36.mp3");

        } else if (mevcutYol.equals("PARCALANMA") || mevcutYol.equals("MANDA")) {
            this.metin =
                    "Sakarya Meydan Muharebesi (Başkomutanlık Çadırı):\n" +
                            "Yunan ordusu Haymana'yı zorluyor. Klasik askeri doktrine göre 'Hattı Müdafaa' (Çizgi Savunması) yapıyoruz ama hatlar kırılıyor.\n" +
                            "Mustafa Kemal Paşa yeni bir fikirle geldi: 'Hattı müdafaa yoktur, sathı müdafaa vardır. O satıh bütün vatandır.'\n" +
                            "Yani geri çekilerek düşmanı içeri çekip, parça parça imha etmek. Bu çok riskli, Ankara tamamen düşebilir.\n";
            this.cevaplar = new String[]{
                    "Bu delilik! Geri çekilen asker kaçar. Klasik düzende kalın, her tepe için sonuna kadar direnin! (Enver Doktrini)",
                    "Kemal haklı olabilir. Düşmanı içeri çekip ikmalini keselim. Bu stratejiyi uygulayın! (Atatürk Doktrini)"
            };
            olayMuzigi.oynat("5/Chapter3_36.mp3");
        }

        soruSor();

        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int secim = sc.nextInt();
            sc.nextLine();
            olayMuzigi.durdur();

            if (mevcutYol.equals("TARIHSEL")) {
                if (secim == 1) {
                    yesilYaz("\n*** İHTİYATLI HAREKAT ***\n");
                    System.out.println("Cemal Paşa tavsiyenize uydu. Kanal uzaktan dövüldü, asker zaiyatı az oldu.");
                    System.out.println("İngilizler tedirgin oldu ama Kanal trafiği durmadı.");

                    indikatorlerCh3.setAskerMorali(indikatorlerCh3.getAskerMorali() - 1); // Büyük zafer yok
                    indikatorlerCh3.setOrduGucu(indikatorlerCh3.getOrduGucu() + 2); // Gücümüzü koruduk
                    indikatorlerCh3.setPadisahDestegi(indikatorlerCh3.getPadisahDestegi() - 2); // Padişah zafer bekliyordu
                    indikatorlerCh3.setSubayDestegi(indikatorlerCh3.getSubayDestegi() + 2); // Mantıklı karar
                } else {
                    kirmiziYaz("\n*** 2. KANAL HEZİMETİ ***\n");
                    System.out.println("Taarruz ettik! Asker kanala girdi ama İngiliz makineli tüfekleri biçti.");
                    System.out.println("Çok şehit verdik, geri çekiliyoruz.");

                    indikatorlerCh3.setAskerMorali(indikatorlerCh3.getAskerMorali() + 2); // Cesaret takdir edildi
                    indikatorlerCh3.setOrduGucu(indikatorlerCh3.getOrduGucu() - 2); // Kayıp büyük
                    indikatorlerCh3.setPadisahDestegi(indikatorlerCh3.getPadisahDestegi() + 2);
                    indikatorlerCh3.setSubayDestegi(indikatorlerCh3.getSubayDestegi() - 2); // Subaylar stratejiye kızgın
                }

            } else if (mevcutYol.equals("TURAN")) {
                if (secim == 1) {
                    yesilYaz("\n*** BUHARA'NIN DÜŞÜŞÜ ***\n");
                    System.out.println("Surlar yıkıldı, şehir alındı. Emir kaçtı.");
                    System.out.println("Ancak sivil kayıplar yüzünden halk bizi 'kurtarıcı' değil 'istilacı' gibi görüyor.");
                    indikatorlerCh3.setBolgePuan("Kafkas", 10); // Türkistan etkisi
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() - 3);
                    indikatorlerCh3.setOrduGucu(indikatorlerCh3.getOrduGucu() - 1);
                } else {
                    kirmiziYaz("\n*** UZUN KUŞATMA ***\n");
                    System.out.println("Kuşatma aylarca sürdü. Sovyetler takviye gönderdi.");
                    System.out.println("İki ateş arasında kaldık.");
                    indikatorlerCh3.setIkmalDurumu(indikatorlerCh3.getIkmalDurumu() - 4);
                    indikatorlerCh3.setSavasTehlikesi(indikatorlerCh3.getSavasTehlikesi() + 1);
                }

            } else if (mevcutYol.equals("CUMHURIYET")) {
                if (secim == 1) {
                    yesilYaz("\n*** AKDENİZ'DE GÖVDE GÖSTERİSİ ***\n");
                    System.out.println("Yavuz Zırhlısı ve denizaltılarımız İtalyan gemilerine kilitlendi. Mussolini geri adım attı.");
                    System.out.println("Halkın milli gururu okşandı.");
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() + 3);
                    indikatorlerCh3.setItilafIliskisi(indikatorlerCh3.getItilafIliskisi() - 3); // Batı gerildi
                    indikatorlerCh3.setIkmalDurumu(indikatorlerCh3.getIkmalDurumu() - 2); // Donanma masrafı
                } else {
                    yesilYaz("\n*** YURTTA SULH ***\n");
                    System.out.println("Diplomasi kazandı. İtalya yalnız kaldı. Savaş çıkmadı ama pasif kaldık.");
                    indikatorlerCh3.setItilafIliskisi(indikatorlerCh3.getItilafIliskisi() + 2);
                    indikatorlerCh3.setSubayDestegi(indikatorlerCh3.getSubayDestegi() - 2);
                }

            } else if (mevcutYol.equals("SERIAT")) {
                if (secim == 1) {
                    yesilYaz("\n*** KARANTİNA ***\n");
                    System.out.println("Hac yasaklandı. Salgın yayılamadı, binlerce can kurtuldu.");
                    System.out.println("Yobazlar 'Dini yasakladı' diye isyanda.");
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() + 2); // Sağduyulu halk
                    indikatorlerCh3.setPadisahDestegi(indikatorlerCh3.getPadisahDestegi() - 3); // Halife tepkili
                    indikatorlerCh3.setOrduGucu(indikatorlerCh3.getOrduGucu() + 2); // Asker sağlıklı
                } else {
                    kirmiziYaz("\n*** VEBA ***\n");
                    System.out.println("Hac yapıldı ama hastalık askerlere ve halka bulaştı. Kırılıyoruz.");
                    indikatorlerCh3.setOrduGucu(indikatorlerCh3.getOrduGucu() - 5);
                    indikatorlerCh3.setPadisahDestegi(indikatorlerCh3.getPadisahDestegi() + 2);
                }

            } else { // PARCALANMA veya MANDA
                if (secim == 1) {
                    kirmiziYaz("\n*** ENVER DOKTRİNİ ***\n");
                    System.out.println("Mevzileri terk etmedik. Yunan topçusu sabit hedefleri yok etti.");
                    System.out.println("Ordu eriyor, cephe delindi!");
                    indikatorlerCh3.setOrduGucu(indikatorlerCh3.getOrduGucu() - 4);
                    indikatorlerCh3.setSavasTehlikesi(5);
                } else {
                    yesilYaz("\n*** SATHI MÜDAFAA ***\n");
                    System.out.println("Geri çekildikçe Yunan ordusu yayıldı ve ikmali koptu. Şimdi avlama sırası bizde!");
                    System.out.println("Sakarya kana boyanıyor ama zafer ışığı göründü.");
                    indikatorlerCh3.setOrduGucu(indikatorlerCh3.getOrduGucu() + 1);
                    indikatorlerCh3.setSubayDestegi(indikatorlerCh3.getSubayDestegi() + 3);
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() - 2); // Halk başta anlamadı
                }
            }

        } else {
            olayMuzigi.durdur();
            throw new ArithmeticException("Lütfen sadece sayı giriniz.");
        }
    }
}