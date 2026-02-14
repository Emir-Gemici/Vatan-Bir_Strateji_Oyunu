package com.vatan.chapters.ch3;

import com.vatan.core.*;
import java.util.Scanner;

public class Chapter3_26 extends Olay<IndikatorlerCh3> {

    public Chapter3_26() {
        super("", new String[]{});
    }

    @Override
    public void oynat(IndikatorlerCh3 indikatorlerCh3) {
        String mevcutYol = indikatorlerCh3.getOyunYolu();
        MuzikKutusu olayMuzigi = new MuzikKutusu();

        if (mevcutYol.equals("TARIHSEL")) {
            this.metin =
                    "Celal Paşa:\n" +
                            "Enver, biliyorsun ki Şuaybe'de yenildik maalesef ancak bundan daha da kötüsü yaşandı.\n" +
                            "Sana bunu nasıl söyleyeceğimi bilmiyorum ama...\n" +
                            "Üzülerek söylüyorum ki bu yenilginin ardından Süleyman Bey kendi canına kıydı.\n";
            this.cevaplar = new String[]{
                    "Üzülme Celal, bunu ona yaşatanlardan er ya da geç intikam alacağız! Kanı yerde kalmayacak.",
                    "Allah rahmet eylesin... Lakin savaş yas tutmayı beklemez. Yerine derhal Nureddin Paşa atansın, ordu başsız kalmasın."
            };
            olayMuzigi.oynat("1/Chapter3_26.mp3");

        } else if (mevcutYol.equals("TURAN")) {
            this.metin =
                    "Zeki Velidi Togan (Başkurt Lideri):\n" +
                            "Büyük Hakanım! Türkistan içlerinde ilerliyoruz lakin yerel 'Basmacı' liderleri arasında nifak çıktı.\n" +
                            "Kimi 'Enver Paşa bizi kurtardı' derken, Enver Paşa'ya rakip çıkan, 'Biz kendi hanlığımızı kuracağız' diyenler var.\n" +
                            "Kırgız ve Özbek beyleri, ordunun komutasının tamamen kendilerine verilmesini şart koşuyor.\n";
            this.cevaplar = new String[]{
                    "Turan ordusu disiplin ordusudur! Başıbozukluğa izin verilemez. Şart koşan beylerin kellesini alın, orduyu merkeze bağlayın.",
                    "Şimdilik birliğe ihtiyacımız var. Onların gururunu okşayın, yerel komutanlara rütbe ve nişan dağıtın."
            };
            olayMuzigi.oynat("2/Chapter3_26.mp3");

        } else if (mevcutYol.equals("CUMHURIYET")) {
            this.metin =
                    "Kara Kemal (İaşe Nazırı):\n" +
                            "Paşam, kurduğumuz milli fabrikalar işlemeye başladı, yerli malı üretimi artıyor.\n" +
                            "Ancak işçiler, 'Avrupa'daki gibi sendika isteriz, 8 saatlik mesai isteriz' diye grev tehdidinde bulunuyor.\n" +
                            "Sermaye sahipleri ise 'Bu hakları verirsek batarız' diye feryat ediyor. Cumhuriyet kimin yanında duracak?\n";
            this.cevaplar = new String[]{
                    "Biz halkçıyız Kemal! İşçinin hakkını verin. Emeği sömürülen millet kalkınamaz.",
                    "Devletin kalkınması için kemer sıkmak şart. Grevleri yasaklayın, üretim durmamalı. Şimdi fedakarlık zamanı."
            };
            olayMuzigi.oynat("3/Chapter3_26.mp3");

        } else if (mevcutYol.equals("SERIAT")) {
            this.metin =
                    "Rasathane Müdürü Fatin Hoca:\n" +
                            "Sultanım, ordunun topçu atışları ve namaz vakitleri için modern bir rasathane (gözlemevi) kurduk.\n" +
                            "Lakin bir grup yobaz, 'Meleklerin bacaklarına mı bakacaksınız? Bu aletler şeytan işidir' diye rasathaneyi taşlıyor.\n" +
                            "Ulema sessiz kalıyor. Eğer rasathane yıkılırsa ilim haysiyetimiz yerle bir olur.\n";
            this.cevaplar = new String[]{
                    "Cehalet en büyük düşmandır! Rasathaneyi askerle korumaya alın. Taş atanı zindana atın!",
                    "Halkı galeyana getirmeyelim. Rasathaneyi gözden uzak bir yere taşıyın, çalışmaları gizli yürütün."
            };
            olayMuzigi.oynat("4/Chapter3_26.mp3");

        } else if (mevcutYol.equals("PARCALANMA") || mevcutYol.equals("MANDA")) {
            this.metin =
                    "Karakol Cemiyeti Reisi:\n" +
                            "Paşam, Anadolu'da durum karışık. Mustafa Kemal Paşa Samsun'a çıktı ve kongreler düzenliyor.\n" +
                            "Halk ona büyük teveccüh gösteriyor. Bazı komutanlar 'Enver Paşa mimli, lider Mustafa Kemal olsun' diyor.\n" +
                            "Liderlik mücadelesine girersek milli kuvvetler bölünür. Ne yapalım?\n";
            this.cevaplar = new String[]{
                    "Mevzubahis vatansa gerisi teferruattır! Mustafa Kemal'e telgraf çekin, emrine girdiğimi bildirin. Birlik olma vaktidir.",
                    "Bu davayı başlatan benim! Liderlik benim hakkımdır. Kendi kongremizi toplayıp ipleri elimize alacağız."
            };
            olayMuzigi.oynat("5/Chapter3_26.mp3");
        }

        soruSor();

        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int secim = sc.nextInt();
            sc.nextLine();
            olayMuzigi.durdur();

            if (mevcutYol.equals("TARIHSEL")) {
                if (secim == 1) {
                    yesilYaz("\n*** İNTİKAM YEMİNİ ***\n");
                    System.out.println("Süleyman Askeri'nin acısı orduyu hırslandırdı. Asker intikam için bileniyor.");
                    indikatorlerCh3.setAskerMorali(indikatorlerCh3.getAskerMorali() + 1);
                    indikatorlerCh3.setSubayDestegi(indikatorlerCh3.getSubayDestegi() + 1);
                } else {
                    yesilYaz("\n*** SAKAL-LI NUREDDİN PAŞA ***\n");
                    System.out.println("Nureddin Paşa cepheye atandı. Disiplinli ve sert mizacıyla ordudaki dağınıklığı toparladı.");
                    System.out.println("Irak cephesi çöküşten kurtuldu.");
                    indikatorlerCh3.setOrduGucu(indikatorlerCh3.getOrduGucu() + 1);
                    indikatorlerCh3.setIkmalDurumu(indikatorlerCh3.getIkmalDurumu() + 1);
                }

            } else if (mevcutYol.equals("TURAN")) {
                if (secim == 1) {
                    yesilYaz("\n*** DEMİR YUMRUK ***\n");
                    System.out.println("İsyankar beyler idam edildi. Turan ordusu tek bir komuta altında birleşti.");
                    System.out.println("Ordu güçlendi ama yerel halkın desteği azaldı.");
                    indikatorlerCh3.setOrduGucu(indikatorlerCh3.getOrduGucu() + 3);
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() - 2);
                } else {
                    yesilYaz("\n*** DİPLOMATİK BİRLİK ***\n");
                    System.out.println("Beylere hilatlar giydirildi. Ordu biraz başlı kaldı ama herkes savaşmaya istekli.");
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() + 3);
                    indikatorlerCh3.setSubayDestegi(indikatorlerCh3.getSubayDestegi() - 2);
                }

            } else if (mevcutYol.equals("CUMHURIYET")) {
                if (secim == 1) {
                    yesilYaz("\n*** SOSYAL ADALET ***\n");
                    System.out.println("İşçilere haklar verildi. Halk 'Baba Enver' diye slogan atıyor.");
                    System.out.println("Sermaye sahipleri küstü, yatırım yavaşladı.");
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() + 4);
                    indikatorlerCh3.setIkmalDurumu(indikatorlerCh3.getIkmalDurumu() - 2);
                } else {
                    yesilYaz("\n*** KALKINMA HAMLESİ ***\n");
                    System.out.println("Grevler yasaklandı, fabrikalar tam gaz çalışıyor. Orduya mühimmat yağıyor.");
                    System.out.println("İşçiler mutsuz ama devlet güçleniyor.");
                    indikatorlerCh3.setIkmalDurumu(indikatorlerCh3.getIkmalDurumu() + 4);
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() - 3);
                }

            } else if (mevcutYol.equals("SERIAT")) {
                if (secim == 1) {
                    yesilYaz("\n*** İLİM VE İMAN ***\n");
                    System.out.println("Yobazlar dağıtıldı. Rasathane çalışıyor. Modern silahlar için teknoloji üretiliyor.");
                    indikatorlerCh3.setOrduGucu(indikatorlerCh3.getOrduGucu() + 2);
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() - 2);
                } else {
                    kirmiziYaz("\n*** İLME GEM VURULDU ***\n");
                    System.out.println("Rasathane kapatıldı. Bilim adamları ülkeyi terk ediyor.");
                    System.out.println("Teknolojik gerilik ordunun belini büküyor.");
                    indikatorlerCh3.setOrduGucu(indikatorlerCh3.getOrduGucu() - 2);
                    indikatorlerCh3.setPadisahDestegi(indikatorlerCh3.getPadisahDestegi() + 2);
                }

            } else { // PARCALANMA veya MANDA
                if (secim == 1) {
                    yesilYaz("\n*** KUVAYI MİLLİYE BİRLEŞİYOR ***\n");
                    System.out.println("Mustafa Kemal Paşa bu jest karşısında çok duygulandı.");
                    System.out.println("İki büyük komutan güçlerini birleştirdi. Kurtuluş umudu yeşerdi!");
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() + 5);
                    indikatorlerCh3.setSubayDestegi(indikatorlerCh3.getSubayDestegi() + 5);
                } else {
                    kirmiziYaz("\n*** İKİLİK ÇIKTI ***\n");
                    System.out.println("Anadolu'da iki başlılık başladı. Bir yanda Enverciler, bir yanda Kemalistler.");
                    System.out.println("Düşman bu bölünmeden faydalanıp ilerliyor.");
                    indikatorlerCh3.setOrduGucu(indikatorlerCh3.getOrduGucu() - 3);
                    indikatorlerCh3.setSavasTehlikesi(5);
                }
            }

        } else {
            olayMuzigi.durdur();
            throw new ArithmeticException("Lütfen sadece sayı giriniz.");
        }
    }
}