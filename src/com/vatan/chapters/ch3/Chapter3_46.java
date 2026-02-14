package com.vatan.chapters.ch3;

import com.vatan.core.*;
import java.util.Scanner;

public class Chapter3_46 extends Olay<IndikatorlerCh3> {

    public Chapter3_46() {
        super("", new String[]{});
    }

    @Override
    public void oynat(IndikatorlerCh3 indikatorlerCh3) {
        String mevcutYol = indikatorlerCh3.getOyunYolu();
        MuzikKutusu olayMuzigi = new MuzikKutusu();

        if (mevcutYol.equals("TARIHSEL")) {
            this.metin =
                    "Yıldırım Ordular Grubu Komutanı Liman von Sanders:\n" +
                            "Nazır Hazretleri! İngiliz kuvvetlerinin Şam'ı almasının ardından cephede tutunacak bir mevzi kalmadı!\n" +
                            "Araplar Suriye'nin her yanında isyan ediyor. Müdafaa edilebilecek bir hat bulamadık.\n" +
                            "Mustafa Kemal Paşa'nın ordusu olmasa toptan gidiyorduk. Halep çevresine doğru çatışarak çekiliyoruz!\n";
            this.cevaplar = new String[]{
                    "Paşa, paşa! Bu nasıl rezalet! Seni görevden azledeceğim! (Alman Komutanı Kov)",
                    "Liman Paşa, gerçekler acıdır. Mustafa Kemal'e tam yetki verin. Halep'in kuzeyinde, Türk sınırında son savunma hattını kursun."
            };
            olayMuzigi.oynat("1/Chapter3_46.mp3"); // Müzik güncellendi

        } else if (mevcutYol.equals("TURAN")) {
            this.metin =
                    "Koreli Direnişçi Lideri:\n" +
                            "Ulu Hakan! Japon zulmü altındaki Kore halkı adına size sığındık.\n" +
                            "Ordularınız Mançurya'dayken bize silah ve subay desteği verirseniz, Japonya'yı arkadan vuracak bir isyan başlatırız.\n" +
                            "Bu Japonya ile topyekün savaş demektir ama Asya'nın kurtuluşu için şarttır.\n";
            this.cevaplar = new String[]{
                    "Mazlumun yanında olmak Türk'ün töresidir! Kore'ye gizlice silah yollayın. Japonya'yı içeriden yıkacağız.",
                    "Turan ordusu macera arayamaz. Japonya çok güçlü, şimdilik onları karşımıza alamayız. Elçileri geri gönderin."
            };
            olayMuzigi.oynat("2/Chapter3_46.mp3");

        } else if (mevcutYol.equals("CUMHURIYET")) {
            this.metin =
                    "Toprak Reformu Komisyonu:\n" +
                            "Paşam, Doğu'da ve Güneydoğu'da devlet yok, 'Ağalık' düzeni var. Köylü maraba gibi çalışıyor.\n" +
                            "Toprak Reformu yapıp ağaların arazilerini köylüye dağıtmak istiyoruz.\n" +
                            "Lakin ağalar mecliste çok güçlü. 'Mülkiyet hakkına dokunursanız isyan ederiz' diye tehdit ediyorlar.\n";
            this.cevaplar = new String[]{
                    "Ağalık düzeni yıkılacak! Toprak işleyenin, su kullananındır! Reformu hemen başlatın.",
                    "Gücümüz yetmez. Ağaları şimdi karşımıza alırsak Doğu'yu kaybederiz. Reformu erteleyelim."
            };
            olayMuzigi.oynat("3/Chapter3_46.mp3");

        } else if (mevcutYol.equals("SERIAT")) {
            this.metin =
                    "Şeyhülislamlık Makamı:\n" +
                            "Sultanım, bazı gazeteler Halife'nin kararlarını eleştiriyor, 'Hata yaptı' diyor.\n" +
                            "Halife, Peygamber vekilidir, 'Ulu'l Emre itaat' farzdır. Basına sansür getirelim.\n" +
                            "Eleştiri kapısını açarsak otorite sarsılır. Kapatırsak 'İstibdat' derler.\n";
            this.cevaplar = new String[]{
                    "Fitne uykudadır, uyandırana lanet olsun! Halife eleştirilemez. Basına sansür getirilsin!",
                    "Mümin müminin aynasıdır. Edep dairesinde eleştiri serbesttir. Sansür yok."
            };
            olayMuzigi.oynat("4/Chapter3_46.mp3");

        } else if (mevcutYol.equals("PARCALANMA") || mevcutYol.equals("MANDA")) {
            this.metin =
                    "İstanbul Sınırı (Çatalca):\n" +
                            "Paşam! Ordularımız İstanbul kapılarına dayandı. Padişah Vahdettin sarayda titriyor.\n" +
                            "İngilizler 'Padişahın can güvenliğini sağlarsanız şehri savaşsız teslim ederiz' diyor.\n" +
                            "Bazı subaylar 'Hain Vahdettin asılmalı' derken, bazıları 'Sürgüne gönderelim' diyor. Ne yapacağız?\n";
            this.cevaplar = new String[]{
                    "Saltanat bitmiştir! Ama kan dökmeyeceğiz. Vahdettin ve ailesi sürgüne gönderilecek. Hanedan defteri kapandı.",
                    "Padişah yargılanmalı! Millete ihanetin bedelini Divan-ı Harp'te ödesin. İngiliz şartını reddedin."
            };
            olayMuzigi.oynat("5/Chapter3_46.mp3");
        }

        // KOMÜNİST YOL HENÜZ AÇIK DEĞİL (55. Soruda Açılacak)

        soruSor();

        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int secim = sc.nextInt();
            sc.nextLine();
            olayMuzigi.durdur();

            if (mevcutYol.equals("TARIHSEL")) {
                if (secim == 1) {
                    yesilYaz("\n*** ALMAN PAŞA KOVULDU ***\n");
                    System.out.println("Liman von Sanders azledildi. Türk askerinin morali yerine geldi: 'Kendi komutanımız bize yeter!'");
                    System.out.println("Komuta kademesi karışsa da asker son bir gayretle silaha sarıldı.");

                    indikatorlerCh3.setSubayDestegi(indikatorlerCh3.getSubayDestegi() - 2);
                    indikatorlerCh3.setAskerMorali(indikatorlerCh3.getAskerMorali() + 4);
                    indikatorlerCh3.setIkmalDurumu(indikatorlerCh3.getIkmalDurumu() + 1);
                    indikatorlerCh3.setOrduGucu(indikatorlerCh3.getOrduGucu() + 1);
                    indikatorlerCh3.bolgeGuncelle("Suriye", -5);
                } else {
                    yesilYaz("\n*** HATAY-HALEP HATTI ***\n");
                    System.out.println("Mustafa Kemal Paşa inisiyatifi ele aldı. İngilizleri Halep'in kuzeyinde durdurdu.");
                    System.out.println("Anadolu'nun güney kapısı kilitlendi. 'Misak-ı Milli' sınırı fiilen çizildi.");

                    indikatorlerCh3.setOrduGucu(indikatorlerCh3.getOrduGucu() + 2);
                    indikatorlerCh3.setSubayDestegi(indikatorlerCh3.getSubayDestegi() + 3);
                    indikatorlerCh3.bolgeGuncelle("Suriye", -10);
                }

            } else if (mevcutYol.equals("TURAN")) {
                if (secim == 1) {
                    kirmiziYaz("\n*** EJDERHA UYANDI ***\n");
                    System.out.println("Kore isyanı başarısız oldu. Japonya bunu savaş sebebi saydı.");
                    System.out.println("Mançurya sınırında Japon ordusuyla çatışmalar başladı.");
                    indikatorlerCh3.setSavasTehlikesi(indikatorlerCh3.getSavasTehlikesi() + 3);
                    indikatorlerCh3.setOrduGucu(indikatorlerCh3.getOrduGucu() - 2);
                } else {
                    yesilYaz("\n*** REELPOLİTİK ***\n");
                    System.out.println("Japonya ile barış korundu. Gücümüzü koruduk.");
                    System.out.println("Koreliler hayal kırıklığına uğradı.");
                    indikatorlerCh3.setItilafIliskisi(indikatorlerCh3.getItilafIliskisi() + 1);
                }

            } else if (mevcutYol.equals("CUMHURIYET")) {
                if (secim == 1) {
                    kirmiziYaz("\n*** DOĞU İSYANI ***\n");
                    System.out.println("Ağalar birleşip isyan başlattı. Dersim ve çevresi karıştı.");
                    System.out.println("Reform yapalım derken iç savaş çıktı.");
                    indikatorlerCh3.setSavasTehlikesi(indikatorlerCh3.getSavasTehlikesi() + 4);
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() + 2);
                } else {
                    yesilYaz("\n*** STATÜKO ***\n");
                    System.out.println("Düzen bozulmadı. Ağalar devlete sadık kaldı.");
                    System.out.println("Ama köylü hala köle gibi.");
                    indikatorlerCh3.setSubayDestegi(indikatorlerCh3.getSubayDestegi() - 1);
                }

            } else if (mevcutYol.equals("SERIAT")) {
                if (secim == 1) {
                    kirmiziYaz("\n*** İSTİBDAT ***\n");
                    System.out.println("Gazeteler kapatıldı. Aydınlar zindana atıldı.");
                    System.out.println("Halk fısıltı gazetesiyle haberleşiyor. Öfke birikiyor.");
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() - 4);
                    indikatorlerCh3.setPadisahDestegi(indikatorlerCh3.getPadisahDestegi() + 3);
                } else {
                    yesilYaz("\n*** MEŞVERET ***\n");
                    System.out.println("Eleştiriler yönetimi düzeltti. Halkın güveni arttı.");
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() + 2);
                }

            } else { // PARCALANMA veya MANDA
                if (secim == 1) {
                    yesilYaz("\n*** SALTANATIN SONU ***\n");
                    System.out.println("Vahdettin İngiliz gemisiyle kaçtı. İstanbul TBMM'ye teslim edildi.");
                    System.out.println("Yeni Türkiye Cumhuriyeti'nin önü açıldı.");
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() + 5);
                    indikatorlerCh3.setItilafIliskisi(indikatorlerCh3.getItilafIliskisi() + 2);
                } else {
                    kirmiziYaz("\n*** İPLER KOPTU ***\n");
                    System.out.println("İngilizler Padişahı vermedi. Şehir çatışarak alındı.");
                    System.out.println("İstanbul harabeye döndü.");
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() - 2);
                    indikatorlerCh3.setItilafIliskisi(indikatorlerCh3.getItilafIliskisi() - 5);
                }
            }

        } else {
            olayMuzigi.durdur();
            throw new ArithmeticException("Lütfen sadece sayı giriniz.");
        }
    }
}