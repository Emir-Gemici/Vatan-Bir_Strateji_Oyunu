package com.vatan.chapters.ch3;

import com.vatan.core.*;
import java.util.Scanner;

public class Chapter3_63 extends Olay<IndikatorlerCh3> {

    public Chapter3_63() {
        super("", new String[]{});
    }

    @Override
    public void oynat(IndikatorlerCh3 indikatorlerCh3) {
        String mevcutYol = indikatorlerCh3.getOyunYolu();
        MuzikKutusu olayMuzigi = new MuzikKutusu();

        // NOT: PARCALANMA VE MANDA YOLLARI 60. SORUDA SONA ERDİĞİ İÇİN BURADA YER ALMAZ.

        if (mevcutYol.equals("TARIHSEL")) {
            this.metin =
                    "Korbaşı Ergaş (Duşanbe Yakınları - Karlı Bir Tepe):\n" +
                            "Enver Paşam, Kızıl Ordu köylerimizi bastı geçti... Duşanbe tarafındaki kışlaklara çekilsek bizim için daha iyi olacak gibi.\n" +
                            "Rusların makineli tüfekleri çok, bizim ise cephanemiz bitmek üzere.\n" +
                            "En azından açık alanda bizi yakalayamazlar, dağlara sığınalım.\n";
            this.cevaplar = new String[]{
                    "Kaça kaça nereye kadar gideceğiz? Ya yiğitçe çarpışırız ya da şehit düşeceğiz! Hazırlanın, saldıracağız!",
                    "Doğru, doğru... Kızılların eline düşersek yolun sonu iyi değil... Gücümüzü toplayana kadar geri çekilelim."
            };
            olayMuzigi.oynat("1/Chapter3_63.mp3");

        } else if (mevcutYol.equals("KOMUNIST")) {
            this.metin =
                    "Sovyet Müfettişi (Taşkent):\n" +
                            "Yoldaş Enver! Moskova'dan raporlar geldi. Türkistan Komünist Partisi içinde hala 'Cuma Namazına giden parti üyeleri' varmış.\n" +
                            "Bu durum bilimsel sosyalizme aykırıdır. Parti içinde bir 'Temizlik' (Pürj) yapmanı emrediyoruz.\n" +
                            "Ya o üyeleri partiden atarsın ya da senin sadakatini sorgularız.\n";
            this.cevaplar = new String[]{
                    "Emredersiniz Yoldaş! Parti tüzüğüne uymayanlar derhal ihraç edilecek. (Staline Boyun Eğ)",
                    "Bizim halkımızın gerçeği budur. Namaz kılan komünist de olur. Kimseyi atmıyorum! (Milli Komünizm Direnişi)"
            };
            olayMuzigi.oynat("6/Chapter3_63.mp3");

        } else if (mevcutYol.equals("TURAN")) {
            this.metin =
                    "Doğu Türkistan Sınırı (Haberci):\n" +
                            "Ulu Hakan! Çin zulmü altındaki Uygur kardeşlerimiz ayaklandı.\n" +
                            "Bizden silah ve asker bekliyorlar. Ancak Çin ordusu sınıra yığınak yaptı.\n" +
                            "Yardım gönderirsek Çin ile topyekün savaş başlar. Göndermezsek kardeşlerimiz katledilecek.\n";
            this.cevaplar = new String[]{
                    "Kan kanı çeker! Ordu Doğu'ya! Çin Seddi'ni aşacağız! (Savaş)",
                    "Devlet duygusallığı kaldırmaz. Çin çok kalabalık, baş edemeyiz. Gizli yardım gönderin ama ordu girmesin. (Politika)"
            };
            olayMuzigi.oynat("2/Chapter3_63.mp3");

        } else if (mevcutYol.equals("CUMHURIYET")) {
            this.metin =
                    "Başvekil İsmet Paşa:\n" +
                            "Paşam, Doğu'da isyan belirtileri var. Musul meselesini çözmek üzereyken İngilizler aşiretleri kışkırtıyor.\n" +
                            "Sıkıyönetim ilan edip 'Takrir-i Sükun' kanununu çıkaralım mı?\n" +
                            "Bu kanunla basın ve muhalefet susturulacak ama devletin bekası sağlanacak.\n";
            this.cevaplar = new String[]{
                    "Devletin bekası her şeyden önce gelir. Kanunu çıkarın, demir yumruğumuzu vuralım!",
                    "Demokrasiden taviz veremeyiz. İsyanı hukuk içinde bastıralım. Basını susturmayın."
            };
            olayMuzigi.oynat("3/Chapter3_63.mp3");

        } else if (mevcutYol.equals("SERIAT")) {
            this.metin =
                    "Ahlak Zabıtası:\n" +
                            "Sultanım, şehirli kadınlar çarşaf yerine 'Mantor' ve 'Eşarp' giymeye başladı.\n" +
                            "Ulema, 'Bu kıyafetler vücut hatlarını belli ediyor, haramdır' diyor.\n" +
                            "Çarşaf zorunluluğunu kanunlaştıralım mı?\n";
            this.cevaplar = new String[]{
                    "Fitneye geçit yok! Çarşaf ve peçe zorunludur. Uymayanlara ceza kesilsin!",
                    "Tesettürün aslı örtünmektir. Manto da örtüdür. Karışmayalım, halkı bunaltmayalım."
            };
            olayMuzigi.oynat("4/Chapter3_63.mp3");
        }

        soruSor();

        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int secim = sc.nextInt();
            sc.nextLine();
            olayMuzigi.durdur();

            if (mevcutYol.equals("TARIHSEL")) {
                if (secim == 1) {
                    yesilYaz("\n*** SONUN BAŞLANGICI ***\n");
                    System.out.println("Kılıcınızı çektiniz. 'Ölmek var, dönmek yok!' narası dağlarda yankılandı.");
                    System.out.println("Bu karar, sizi efsaneleştirecek olan son muharebeye, Çegan Tepesi'ne götürüyor.");
                    System.out.println("Askerleriniz size hayranlıkla bakıyor, ölüme gülerek gidiyorlar.");

                    indikatorlerCh3.setAskerMorali(indikatorlerCh3.getAskerMorali() + 5);
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() + 3);
                    indikatorlerCh3.setOrduGucu(indikatorlerCh3.getOrduGucu() - 5);
                } else {
                    kirmiziYaz("\n*** KAÇIŞ ***\n");
                    System.out.println("Çekilme emri verdiniz. Basmacıların morali bozuldu.");
                    System.out.println("'Koca Enver Paşa kaçıyor mu?' fısıltıları başladı.");
                    System.out.println("Kızıl Ordu peşinizi bırakmayacak. Çember daralıyor.");

                    indikatorlerCh3.setAskerMorali(indikatorlerCh3.getAskerMorali() - 4);
                    indikatorlerCh3.setSubayDestegi(indikatorlerCh3.getSubayDestegi() - 3);
                    indikatorlerCh3.setIkmalDurumu(indikatorlerCh3.getIkmalDurumu() + 2);
                }

            } else if (mevcutYol.equals("KOMUNIST")) {
                if (secim == 1) {
                    kirmiziYaz("\n*** PARTİ SADAKATİ ***\n");
                    System.out.println("Arkadaşlarınızı sattınız. Moskova memnun ama vicdanınız rahat değil.");
                    indikatorlerCh3.setIttifakIliskisi(indikatorlerCh3.getIttifakIliskisi() + 3);
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() - 3);
                } else {
                    yesilYaz("\n*** HALKIN ADAMI ***\n");
                    System.out.println("Müfettişi kovdunuz. Parti tabanı size kenetlendi. Stalin çok öfkeli.");
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() + 4);
                    indikatorlerCh3.setSavasTehlikesi(indikatorlerCh3.getSavasTehlikesi() + 3);
                }

            } else if (mevcutYol.equals("TURAN")) {
                if (secim == 1) {
                    yesilYaz("\n*** ÇİN SEDDİ SAVAŞI ***\n");
                    System.out.println("Turan ordusu Çin'e girdi. Dünya şokta. Büyük bir savaş başladı.");
                    indikatorlerCh3.setOrduGucu(indikatorlerCh3.getOrduGucu() - 2);
                    indikatorlerCh3.setAskerMorali(indikatorlerCh3.getAskerMorali() + 3);
                } else {
                    kirmiziYaz("\n*** SİYASET ***\n");
                    System.out.println("Diplomasiyle bir kısım Uygur kurtarıldı ama Çin zulmü bitmedi.");
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() - 1);
                }

            } else if (mevcutYol.equals("CUMHURIYET")) {
                if (secim == 1) {
                    yesilYaz("\n*** TAKRİR-İ SÜKUN ***\n");
                    System.out.println("Muhalefet sustu, isyan bastırıldı. Cumhuriyet otoritesini kurdu.");
                    indikatorlerCh3.setSubayDestegi(indikatorlerCh3.getSubayDestegi() + 3);
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() - 2);
                } else {
                    kirmiziYaz("\n*** KAOS ***\n");
                    System.out.println("İsyan büyüdü. Meclis karıştı. Hükümet düştü.");
                    indikatorlerCh3.setSavasTehlikesi(indikatorlerCh3.getSavasTehlikesi() + 3);
                }

            } else if (mevcutYol.equals("SERIAT")) {
                if (secim == 1) {
                    yesilYaz("\n*** ZORAKİ TESETTÜR ***\n");
                    System.out.println("Sokaklarda kırbaç sesleri. Halk korkudan sindi. Görüntüde şeriat var.");
                    indikatorlerCh3.setPadisahDestegi(indikatorlerCh3.getPadisahDestegi() + 3);
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() - 4);
                } else {
                    yesilYaz("\n*** ILIMLI YOL ***\n");
                    System.out.println("Baskı yapılmadı. Halk devleti daha çok sevdi.");
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() + 2);
                }
            }

        } else {
            olayMuzigi.durdur();
            throw new ArithmeticException("Lütfen sadece sayı giriniz.");
        }
    }
}