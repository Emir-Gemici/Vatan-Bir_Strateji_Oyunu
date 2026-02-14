package com.vatan.chapters.ch3;

import com.vatan.core.*;
import java.util.Scanner;

public class Chapter3_56 extends Olay<IndikatorlerCh3> {

    public Chapter3_56() {
        super("", new String[]{});
    }

    @Override
    public void oynat(IndikatorlerCh3 indikatorlerCh3) {
        String mevcutYol = indikatorlerCh3.getOyunYolu();
        MuzikKutusu olayMuzigi = new MuzikKutusu();

        if (mevcutYol.equals("TARIHSEL")) {
            this.metin =
                    "Cemal Paşa (Batum'da Bir Ev):\n" +
                            "Burada daha beklemeye devam mı edeceğiz Enver? Baksana gavur Yunan Ankara'ya ilerlemeye başlamış.\n" +
                            "Sakarya Nehri'nin dibine kadar gelmişler. İvedilikle onlara bir yardım etmemiz lazım ama nasıl?\n" +
                            "Mustafa Kemal bizi rakip olarak görüyor, Anadolu'ya girersek iç savaş çıkabilir.\n";
            this.cevaplar = new String[]{
                    "Şuan bizi tehdit olarak görüyorlar. O yüzden sadece silah sevkiyatı yaparak destek olmak yeterli olacaktır. Aksi taktirde başımıza iş alırız.",
                    "Belki eğer ordu dağılırsa içeri girip durumu devralabiliriz. Bunun için doğru zamanı kollamalıyız. (Fırsatçı Bekleyiş)"
            };
            olayMuzigi.oynat("1/Chapter3_56.mp3");

        } else if (mevcutYol.equals("KOMUNIST")) {
            // ARTIK AKTİF! (55. Soruda 2. şıkkı seçenler buraya düşer)
            this.metin =
                    "Bakü - İslam İhtilal Cemiyetleri Birliği:\n" +
                            "Yoldaş Enver! Moskova ile anlaştık lakin tabanımız hala 'Şeriat ve Hilafet' diyor.\n" +
                            "Bolşevik yoldaşlar, 'Kuran ile Das Kapital yan yana olmaz, birini seçin' diye baskı yapıyor.\n" +
                            "Propaganda afişlerinde orak-çekiç mi kullanalım, yoksa hilal ve yıldız mı?\n";
            this.cevaplar = new String[]{
                    "Biz Müslüman Komünistleriz! Hilal'in yanına Orak-Çekiç koyun. İkisi birleşecek! (Yeşil Komünizm)",
                    "Moskova haklı. Dini sembolleri kaldırın. Tamamen Marksist bir söylem geliştirelim. (Tam Bolşevik)"
            };
            olayMuzigi.oynat("6/Chapter3_56.mp3");

        } else if (mevcutYol.equals("TURAN")) {
            this.metin =
                    "Türkistan - Basmacı Karargahı:\n" +
                            "Ulu Hakan! Lakaylı İbrahim Bey, sizin emrinize girmeyi reddediyor.\n" +
                            "'Enver Paşa Osmanlı'nın damadıdır, buranın töresini bilmez, ben kendi başıma savaşırım' demiş.\n" +
                            "Birliği sağlamak için İbrahim Bey'in kellesini mi alalım, yoksa ayağına gidip ikna mı edelim?\n";
            this.cevaplar = new String[]{
                    "Turan ordusunda itaatsizliğin cezası ölümdür! Vurun kellesini! (Disiplin)",
                    "Gurur yapma vakti değil. Çadırına gidin, hediyeler verin. Bize her kılıç lazım. (Diplomasi)"
            };
            olayMuzigi.oynat("2/Chapter3_56.mp3");

        } else if (mevcutYol.equals("CUMHURIYET")) {
            this.metin =
                    "Genelkurmay Karargahı (Sakarya Öncesi):\n" +
                            "Paşam, Yunan ordusu Polatlı'ya kadar geldi. Top sesleri Ankara'dan duyuluyor.\n" +
                            "Meclis'i Kayseri'ye taşıma fikri var. Bu, halkın moralini bitirir ama meclisi kurtarır.\n" +
                            "Ne emir buyurursunuz?\n";
            this.cevaplar = new String[]{
                    "Meclis yerinde kalacak! Biz burada öleceğiz ama geri adım atmayacağız! Hattı müdafaa yoktur, sathı müdafaa vardır!",
                    "Devletin bekası esastır. Meclis Kayseri'ye taşınsın. Ankara düşse de devlet yaşar."
            };
            olayMuzigi.oynat("3/Chapter3_56.mp3");

        } else if (mevcutYol.equals("SERIAT")) {
            this.metin =
                    "İstanbul - Sultanahmet Meydanı:\n" +
                            "Sultanım, Anadolu'da savaş kızıştı. Halk manevi bir işaret bekliyor.\n" +
                            "Topkapı Sarayı'ndan 'Sancak-ı Şerif'i (Peygamberin Sancağı) çıkarıp meydana dikelim mi?\n" +
                            "Bu, İngilizleri kışkırtabilir ama askere iman gücü verir.\n";
            this.cevaplar = new String[]{
                    "Sancağı çıkarın! Tekbirlerle meydana dikin! Bugün iman günüdür!",
                    "İngilizler sancağa el koyarsa mahvoluruz. Hazinede saklı kalsın. Dua edelim yeter."
            };
            olayMuzigi.oynat("4/Chapter3_56.mp3");

        } else if (mevcutYol.equals("PARCALANMA") || mevcutYol.equals("MANDA")) {
            this.metin =
                    "Amerikan Yüksek Komiseri:\n" +
                            "Paşam, Ankara hükümeti çok zor durumda. Eğer arabuluculuk yaparsanız,\n" +
                            "Yunanlıları durdurabiliriz ama karşılığında Anadolu'nun doğusunda bir Ermeni devleti kurulmasına göz yummanız istenir.\n";
            this.cevaplar = new String[]{
                    "Asla! Bir karış toprak bile verilemez. Yunan Ankara'ya girse de savaşacağız!",
                    "Belki... Savaşın durması için bu acı reçeteyi görüşebiliriz. Yeter ki kan dursun."
            };
            olayMuzigi.oynat("5/Chapter3_56.mp3");
        }

        soruSor();

        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int secim = sc.nextInt();
            sc.nextLine();
            olayMuzigi.durdur();

            if (mevcutYol.equals("TARIHSEL")) {
                if (secim == 1) {
                    yesilYaz("\n*** LOJİSTİK DESTEK ***\n");
                    System.out.println("Rusya'dan gelen silahları gizlice İnebolu'ya sevk ettiniz.");
                    System.out.println("Ankara hükümeti bu yardımı memnuniyetle karşıladı. Gerginlik azaldı.");

                    indikatorlerCh3.setAskerMorali(indikatorlerCh3.getAskerMorali() - 2); // Kendi askeriniz savaşmıyor diye üzgün
                    indikatorlerCh3.setIkmalDurumu(indikatorlerCh3.getIkmalDurumu() + 1);
                    indikatorlerCh3.setOrduGucu(indikatorlerCh3.getOrduGucu() + 2); // Anadolu ordusu güçlendi
                    indikatorlerCh3.setSubayDestegi(indikatorlerCh3.getSubayDestegi() + 2);
                } else {
                    kirmiziYaz("\n*** AKBABA TAKTİĞİ ***\n");
                    System.out.println("Sakarya kıyısında Türk ordusunun yenilmesini beklediniz.");
                    System.out.println("Bu tavrınız subaylar arasında 'Vatan hainliği' olarak fısıldanmaya başlandı.");
                    System.out.println("Enver Paşa, kendi milletinin yenilgisini bekleyen bir hırslı komutan durumuna düştü.");

                    indikatorlerCh3.setAskerMorali(indikatorlerCh3.getAskerMorali() - 2);
                    indikatorlerCh3.setIkmalDurumu(indikatorlerCh3.getIkmalDurumu() - 1);
                    indikatorlerCh3.setOrduGucu(indikatorlerCh3.getOrduGucu() - 2);
                    indikatorlerCh3.setSubayDestegi(indikatorlerCh3.getSubayDestegi() - 2);
                }

            } else if (mevcutYol.equals("KOMUNIST")) {
                if (secim == 1) {
                    yesilYaz("\n*** İSLAM SOSYALİZMİ ***\n");
                    System.out.println("Doğu halkları bu sentezi sevdi. 'Allah, Ekmek, Özgürlük' sloganları atılıyor.");
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() + 3);
                    indikatorlerCh3.setIttifakIliskisi(indikatorlerCh3.getIttifakIliskisi() - 2); // Moskova şüpheli
                } else {
                    kirmiziYaz("\n*** KÖKSÜZ DEVRİM ***\n");
                    System.out.println("Halk afişleri yırttı. 'Bunlar dinsiz' dediler. Taban desteği eriyor.");
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() - 4);
                    indikatorlerCh3.setIttifakIliskisi(indikatorlerCh3.getIttifakIliskisi() + 4); // Lenin memnun
                }

            } else if (mevcutYol.equals("TURAN")) {
                if (secim == 1) {
                    yesilYaz("\n*** OTORİTE ***\n");
                    System.out.println("İbrahim Bey öldürüldü. Diğer beyler korkudan itaat etti.");
                    indikatorlerCh3.setOrduGucu(indikatorlerCh3.getOrduGucu() + 1);
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() - 2); // Yerel halk kızgın
                } else {
                    yesilYaz("\n*** BİRLİK ***\n");
                    System.out.println("İbrahim Bey ikna oldu. Lakay süvarileri ordunuza katıldı.");
                    indikatorlerCh3.setOrduGucu(indikatorlerCh3.getOrduGucu() + 3);
                }

            } else if (mevcutYol.equals("CUMHURIYET")) {
                if (secim == 1) {
                    yesilYaz("\n*** SAKARYA DESTANI ***\n");
                    System.out.println("Meclis dimdik durdu. Ordu şaha kalktı. Yunan durduruldu!");
                    indikatorlerCh3.setAskerMorali(indikatorlerCh3.getAskerMorali() + 5);
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() + 5);
                } else {
                    kirmiziYaz("\n*** MORAL ÇÖKÜŞÜ ***\n");
                    System.out.println("Kayseri kararı panik yarattı. Asker firar etmeye başladı.");
                    indikatorlerCh3.setAskerMorali(indikatorlerCh3.getAskerMorali() - 5);
                }

            } else if (mevcutYol.equals("SERIAT")) {
                if (secim == 1) {
                    yesilYaz("\n*** SANCAK-I ŞERİF ***\n");
                    System.out.println("İstanbul sokakları tekbirle inledi. Anadolu'ya manevi destek yağdı.");
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() + 4);
                } else {
                    kirmiziYaz("\n*** SESSİZLİK ***\n");
                    System.out.println("Halk hayal kırıklığına uğradı. Saray pasif kaldı.");
                    indikatorlerCh3.setPadisahDestegi(indikatorlerCh3.getPadisahDestegi() - 2);
                }

            } else { // PARCALANMA veya MANDA
                if (secim == 1) {
                    yesilYaz("\n*** ONURLU RET ***\n");
                    System.out.println("Teklifi reddettiniz. Tarih onurunuzu yazacak.");
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() + 2);
                } else {
                    kirmiziYaz("\n*** İHANET MASASI ***\n");
                    System.out.println("Ermeni devleti kabul edildi. Anadolu size lanet okuyor.");
                    indikatorlerCh3.setHalkDestegi(0); // Game Over yaklaşıyor
                }
            }

        } else {
            olayMuzigi.durdur();
            throw new ArithmeticException("Lütfen sadece sayı giriniz.");
        }
    }
}