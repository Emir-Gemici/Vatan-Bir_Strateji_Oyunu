package com.vatan.chapters.ch3;

import com.vatan.core.*;
import java.util.Scanner;
import java.util.Random;

public class Chapter3_50 extends Olay<IndikatorlerCh3> {

    public Chapter3_50() {
        super("", new String[]{});
    }

    @Override
    public void oynat(IndikatorlerCh3 indikatorlerCh3) {
        String mevcutYol = indikatorlerCh3.getOyunYolu();
        MuzikKutusu olayMuzigi = new MuzikKutusu();
        Random random = new Random();

        // DİKKAT: KOMÜNİST YOL 55. SORUDA AÇILACAĞI İÇİN BURADA YER ALMAZ.

        if (mevcutYol.equals("TARIHSEL")) {
            this.metin =
                    "Talat Paşa (Berlin'de Gizli Bir Ev):\n" +
                            "Enver, şu vakitlerde burada saklanıyoruz ediyoruz ancak ülke şuan perişan durumda.\n" +
                            "Ülkeye geri dönmek için Alman generallerle temasa geçmeli miyiz artık?\n" +
                            "Ben burada bulunduğum müddetçe içim kan ağlıyor. Bir şeyler yapmalıyız!\n";
            this.cevaplar = new String[]{
                    "Talat, benim de içim kan ağlıyor haklısın ancak şuan bu riski göze alamayız. Bir müddet daha burada saklanmalıyız. (Bekle)",
                    "Haklısın Talat. Alman generallere bu iş için danışabiliriz. Riskli ama vatanımıza dönmek istiyorsak bunu göze almalıyız. (Temasa Geç)"
            };
            olayMuzigi.oynat("1/Chapter3_50.mp3");

        } else if (mevcutYol.equals("TURAN")) {
            this.metin =
                    "Kırgız Beyi:\n" +
                            "Ulu Hakan! 'Vergi' adı altında hayvanlarımızı sayıp duruyorsunuz.\n" +
                            "Biz atalarımızdan beri özgür yaşarız, Hakan'a savaşta can veririz ama barışta mal vermeyiz!\n" +
                            "Vergi memurlarınızı geri çekin, yoksa boylar arasında huzursuzluk çıkar.\n";
            this.cevaplar = new String[]{
                    "Devlet vergiyle yaşar! İtiraz eden kellesinden olur. Memurlar görevine devam edecek!",
                    "Tamam, boyların töresine saygı duyalım. Vergi yerine 'Gönüllü Bağış' sistemi getirelim."
            };
            olayMuzigi.oynat("2/Chapter3_50.mp3");

        } else if (mevcutYol.equals("CUMHURIYET")) {
            this.metin =
                    "İsmet Paşa:\n" +
                            "Paşam, Kazım Karabekir ve Rauf Bey 'Terakkiperver Cumhuriyet Fırkası'nı kurdu.\n" +
                            "Halk bunlara büyük ilgi gösteriyor. Ancak tüzüklerinde 'Dini inançlara saygılıyız' maddesi var.\n" +
                            "Bu madde irticayı hortlatabilir. Partiyi kapatalım mı, yoksa demokrasi gereği izin mi verelim?\n";
            this.cevaplar = new String[]{
                    "Demokrasi çoğulculuktur. İzin verin, halk kimi isterse onu seçsin. Sandıktan korkmayız.",
                    "İrticaya geçit yok! Bu parti rejimi tehdit ediyor. Derhal kapatılsın, kurucuları sorgulansın."
            };
            olayMuzigi.oynat("3/Chapter3_50.mp3");

        } else if (mevcutYol.equals("SERIAT")) {
            this.metin =
                    "Maarif Nazırı (Eğitim Bakanı):\n" +
                            "Sultanım, medreseler modern fen bilimlerini (Fizik, Kimya) müfredata sokmamakta direniyor.\n" +
                            "'Bize Fıkıh ve Kelam yeter' diyorlar. Ancak mühendislerimiz yetişmiyor.\n" +
                            "Medreseleri zorla modernleştirelim mi, yoksa ulemayı karşımıza almayalım mı?\n";
            this.cevaplar = new String[]{
                    "İlim Müslüman'ın yitiğidir! Medreselerde fen dersleri zorunlu olacak. Direnen hoca azledilsin!",
                    "Ulema başımızın tacıdır. Onları küstürmeyelim. Fen mektepleri ayrı açılsın."
            };
            olayMuzigi.oynat("4/Chapter3_50.mp3");

        } else if (mevcutYol.equals("PARCALANMA") || mevcutYol.equals("MANDA")) {
            this.metin =
                    "Batı Cephesi Komutanı İsmet Paşa:\n" +
                            "Paşam! Çerkes Ethem ve kardeşleri 'Biz Düzenli Ordu'ya girmeyiz, kendi başımıza savaşırız' diye isyan etti.\n" +
                            "Yunan ordusu karşımızdayken bir de bunlarla mı uğraşacağız?\n" +
                            "Üzerlerine yürüyüp tasfiye edelim mi, yoksa suyuna gidip idare mi edelim?\n";
            this.cevaplar = new String[]{
                    "Devlet içinde devlet olmaz! Ethem'in üzerine yürüyün. Ya itaat edecek ya yok edilecek!",
                    "Şimdi iç savaşın sırası değil. Ethem'e taviz verin, gönlünü hoş tutun. Yunan'ı yenince hallederiz."
            };
            olayMuzigi.oynat("5/Chapter3_50.mp3");
        }

        soruSor();

        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int secim = sc.nextInt();
            sc.nextLine();
            olayMuzigi.durdur();

            if (mevcutYol.equals("TARIHSEL")) {
                if (secim == 1) {
                    // BEKLEMEK
                    kirmiziYaz("\n*** HAREKETSİZLİK ***\n");
                    System.out.println("Evde oturup eski günleri yad ettiniz. Zaman aleyhinize işliyor.");
                    System.out.println("Halk 'Paşalar bizi unuttu' demeye başladı.");

                    indikatorlerCh3.setAskerMorali(indikatorlerCh3.getAskerMorali() - 2);
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() - 3);
                    indikatorlerCh3.setPadisahDestegi(indikatorlerCh3.getPadisahDestegi() - 5);
                    indikatorlerCh3.setSubayDestegi(indikatorlerCh3.getSubayDestegi() - 5);
                } else {
                    // RİSK ALMAK (ZAR ATILIYOR)
                    System.out.println("Alman Karargahına gidiyorsunuz... Zar atılıyor...");
                    int zar = random.nextInt(100); // 0-99 arası

                    if (zar < 40) { // %40 İhtimalle Başarısızlık
                        kirmiziYaz("\n*** HAİN MUAMELESİ ***\n");
                        System.out.println("Alman Generaller: 'Siz artık bir hiçsiniz! Belki de İngiliz casususunuz!'");
                        System.out.println("Sizi nezarethaneye attılar. Talat Paşa'nın yüzü yere düştü.");

                        indikatorlerCh3.setAskerMorali(indikatorlerCh3.getAskerMorali() - 4);
                        indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() - 4);
                        indikatorlerCh3.setIttifakIliskisi(indikatorlerCh3.getIttifakIliskisi() - 5);
                        indikatorlerCh3.setPadisahDestegi(indikatorlerCh3.getPadisahDestegi() - 5);
                        indikatorlerCh3.setSubayDestegi(indikatorlerCh3.getSubayDestegi() - 5);
                    } else { // %60 İhtimalle Başarı
                        yesilYaz("\n*** ESKİ DOSTLAR ***\n");
                        System.out.println("General Seeckt sizi kapıda karşıladı: 'Ekselansları! Sizi görmek ne büyük şeref.'");
                        System.out.println("Size gizli ödenekten para ve sahte pasaport ayarladılar. Dönüş için umut doğdu!");

                        indikatorlerCh3.setAskerMorali(indikatorlerCh3.getAskerMorali() + 1);
                        indikatorlerCh3.setIttifakIliskisi(indikatorlerCh3.getIttifakIliskisi() + 3);
                        indikatorlerCh3.setPadisahDestegi(indikatorlerCh3.getPadisahDestegi() + 1);
                    }
                }

            } else if (mevcutYol.equals("TURAN")) {
                if (secim == 1) {
                    kirmiziYaz("\n*** BOY İSYANI ***\n");
                    System.out.println("Kırgızlar dağa çıktı. Vergi gelmediği gibi bir de isyanla uğraşıyoruz.");
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() - 3);
                    indikatorlerCh3.setIkmalDurumu(indikatorlerCh3.getIkmalDurumu() - 2);
                } else {
                    yesilYaz("\n*** TÖREYE SAYGI ***\n");
                    System.out.println("Boylar memnun oldu. Gönüllü olarak daha çok at ve erzak verdiler.");
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() + 2);
                    indikatorlerCh3.setIkmalDurumu(indikatorlerCh3.getIkmalDurumu() + 1);
                }

            } else if (mevcutYol.equals("CUMHURIYET")) {
                if (secim == 1) {
                    yesilYaz("\n*** SANDIK GÜCÜ ***\n");
                    System.out.println("Muhalefet meclise girdi. Tansiyon düştü, demokrasi kazandı.");
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() + 3);
                    indikatorlerCh3.setSubayDestegi(indikatorlerCh3.getSubayDestegi() - 2);
                } else {
                    kirmiziYaz("\n*** TEK PARTİ ***\n");
                    System.out.println("Parti kapatıldı. Muhalifler yeraltına indi. Gerilim sürüyor.");
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() - 3);
                    indikatorlerCh3.setSubayDestegi(indikatorlerCh3.getSubayDestegi() + 2);
                }

            } else if (mevcutYol.equals("SERIAT")) {
                if (secim == 1) {
                    yesilYaz("\n*** MÜHENDİS ULEMA ***\n");
                    System.out.println("Ulema direndi ama boyun eğdi. Yeni nesil hem hafız hem mühendis oluyor.");
                    indikatorlerCh3.setIkmalDurumu(indikatorlerCh3.getIkmalDurumu() + 3);
                } else {
                    kirmiziYaz("\n*** CAHİL NESİL ***\n");
                    System.out.println("Teknoloji dışarıdan alınıyor. Dışa bağımlılık arttı.");
                    indikatorlerCh3.setIkmalDurumu(indikatorlerCh3.getIkmalDurumu() - 3);
                }

            } else { // PARCALANMA veya MANDA
                if (secim == 1) {
                    yesilYaz("\n*** ETHEM'İN SONU ***\n");
                    System.out.println("Düzenli Ordu, Çerkes Ethem'i ezdi. Ordu içinde disiplin tam sağlandı.");
                    System.out.println("Artık tek otorite Ankara!");
                    indikatorlerCh3.setOrduGucu(indikatorlerCh3.getOrduGucu() + 2);
                    indikatorlerCh3.setSubayDestegi(indikatorlerCh3.getSubayDestegi() + 3);
                } else {
                    kirmiziYaz("\n*** İKİ BAŞLILIK ***\n");
                    System.out.println("Ethem başına buyruk hareket etmeye devam etti. Ordu düzen tutmuyor.");
                    indikatorlerCh3.setOrduGucu(indikatorlerCh3.getOrduGucu() - 2);
                }
            }

        } else {
            olayMuzigi.durdur();
            throw new ArithmeticException("Lütfen sadece sayı giriniz.");
        }
    }
}