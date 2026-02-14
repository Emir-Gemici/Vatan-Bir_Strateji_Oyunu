package com.vatan.chapters.ch3;

import com.vatan.core.*;
import java.util.Scanner;

public class Chapter3_62 extends Olay<IndikatorlerCh3> {

    public Chapter3_62() {
        super("", new String[]{});
    }

    @Override
    public void oynat(IndikatorlerCh3 indikatorlerCh3) {
        String mevcutYol = indikatorlerCh3.getOyunYolu();
        MuzikKutusu olayMuzigi = new MuzikKutusu();

        // NOT: PARCALANMA VE MANDA YOLLARI 60. SORUDA SONA ERDİĞİ İÇİN BURADA YER ALMAZ.

        if (mevcutYol.equals("TARIHSEL")) {
            this.metin =
                    "İbrahim Lakay (Basmacı Lideri - Gergin Bir Toplantı):\n" +
                            "Behey Enver Paşa! Senin Moskof kafiri ile iş tuttuğun bilinmez mi sandın?\n" +
                            "Duyduk ki aynı zamanda Cedidçi (Yenilikçi) küffarlar ile de görülmüşsün.\n" +
                            "Şeriat düşmanı Moskof kafirinin adamı olduğun besbelli ortada.\n" +
                            "Bizi son zamanda darmadağın etmelerinin sebebi muhtemeldir ki budur! Casussun sen!\n";
            this.cevaplar = new String[]{
                    "İbrahim efendi! Sen kimsin ki beni Rus ile iş tutmakla suçlarsın? Ben ki Osmanoğlu hanedanının damadıyım, ömrüm Moskoflara karşı savaşla geçti. Sen kimsin de beni suçluyorsun? (Sert Çıkış)",
                    "Sakin ol İbrahim Bey. Fitne çıkarma zamanı değildir. Benim geçmişim bellidir. Eğer şüphen varsa gel benimle en ön safta savaş, Rus'a sıktığım kurşunu gözünle gör! (İkna Et)"
            };
            olayMuzigi.oynat("1/Chapter3_62.mp3");

        } else if (mevcutYol.equals("KOMUNIST")) {
            this.metin =
                    "Taşkent Meydanı (Hücum Hareketi):\n" +
                            "Yoldaş Enver! Parti, 'Kadınların Özgürleşmesi' adına 8 Mart'ta büyük bir eylem planlıyor.\n" +
                            "Binlerce Türkistanlı kadın meydanda toplanıp peçelerini (çarşaflarını) ateşe atacak.\n" +
                            "Ancak yerel halk ve mollalar 'Namusumuza el uzatılıyor' diyerek silahlanıyor. İç savaş çıkabilir.\n";
            this.cevaplar = new String[]{
                    "Yakın o bez parçalarını! Kadınlar özgürleşmeden toplum özgürleşmez. Mollaları ezin!",
                    "Durun! Bu halkı kaybetmemize neden olur. Peçe yasağını zamana yayalım, zorlamayalım."
            };
            olayMuzigi.oynat("6/Chapter3_62.mp3");

        } else if (mevcutYol.equals("TURAN")) {
            this.metin =
                    "Japon Ataşesi (Gizli Görüşme):\n" +
                            "Ulu Hakan! Japonya İmparatoru, 'Pan-Asya' ideali çerçevesinde Turan Devleti'ni tanımaya hazır.\n" +
                            "Size modern silahlar ve donanma desteği verebiliriz. Ancak karşılığında Rusya'ya doğudan saldırmamıza yardım edeceksiniz.\n" +
                            "Turan ve Japonya, Asya'yı bölüşelim mi?\n";
            this.cevaplar = new String[]{
                    "Güneşin doğduğu yerden gelen dostlar! Teklif kabuldür. Turan ve Japonya Asya'nın hakimidir!",
                    "Japonlar sömürgecidir. Bir kurttan kurtulup diğerine yem olmayız. İttifak reddedildi."
            };
            olayMuzigi.oynat("2/Chapter3_62.mp3");

        } else if (mevcutYol.equals("CUMHURIYET")) {
            this.metin =
                    "Çankaya Sofrası:\n" +
                            "Paşam, Cumhuriyet ilan edildi ama Halife Abdülmecid Efendi İstanbul'da cuma selamlığına çıkıyor, yabancı elçileri kabul ediyor.\n" +
                            "Devlet içinde devlet görüntüsü var. Hilafeti tamamen kaldırmanın zamanı geldi mi?\n" +
                            "Halkın dini duyguları buna ne der?\n";
            this.cevaplar = new String[]{
                    "Egemenlikte ortaklık olmaz! Hilafet derhal kaldırılsın, Osmanlı hanedanı yurt dışına çıkarılsın!",
                    "Acele etmeyelim. Halifelik sembolik kalsın. İslam dünyasını karşımıza almayalım."
            };
            olayMuzigi.oynat("3/Chapter3_62.mp3");

        } else if (mevcutYol.equals("SERIAT")) {
            this.metin =
                    "Maarif Şurası:\n" +
                            "Sultanım, taşradaki bazı aşiret reisleri 'Kızların okuması caiz değildir, günahtır' diyerek mektepleri basıyor.\n" +
                            "Kız çocuklarını okuldan alıyorlar. Ulema bu konuda ikiye bölündü.\n" +
                            "Kızların eğitim hakkı için jandarmayı kullanalım mı?\n";
            this.cevaplar = new String[]{
                    "İlim kadın erkek herkese farzdır! Jandarma o yobazları dağıtsın. Kızlar okuyacak!",
                    "Halkın örfüne karışmayalım. Kızlar evlerinde dini eğitim görsün yeter. Mektep şart değil."
            };
            olayMuzigi.oynat("4/Chapter3_62.mp3");
        }

        soruSor();

        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int secim = sc.nextInt();
            sc.nextLine();
            olayMuzigi.durdur();

            if (mevcutYol.equals("TARIHSEL")) {
                if (secim == 1) {
                    yesilYaz("\n*** KILIÇLAR ÇEKİLDİ ***\n");
                    System.out.println("Lakay, bu sert çıkışınız karşısında geri adım attı ama kini büyüdü.");
                    System.out.println("Sizi 'Kibirli Osmanlı' olarak görmeye başladı. Birlik ruhu zedelendi.");
                    System.out.println("Ancak otoritenizi korudunuz.");

                    indikatorlerCh3.setSubayDestegi(indikatorlerCh3.getSubayDestegi() + 2);
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() - 2);
                    indikatorlerCh3.setOrduGucu(indikatorlerCh3.getOrduGucu() - 1);
                } else {
                    yesilYaz("\n*** GÖNÜL ALMA ***\n");
                    System.out.println("Lakay'ın omzuna elinizi koydunuz. Samimiyetiniz onu yumuşattı.");
                    System.out.println("'Düşmanımız birdir' dediniz. Basmacılar size yeniden bağlandı.");

                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() + 2);
                    indikatorlerCh3.setOrduGucu(indikatorlerCh3.getOrduGucu() + 1);
                }

            } else if (mevcutYol.equals("KOMUNIST")) {
                if (secim == 1) {
                    kirmiziYaz("\n*** ALEVLER İÇİNDE ***\n");
                    System.out.println("Peçeler yakıldı. Öfkeli kalabalık parti binasını bastı. Kan döküldü.");
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() - 4);
                    indikatorlerCh3.setOrduGucu(indikatorlerCh3.getOrduGucu() - 2);
                } else {
                    yesilYaz("\n*** SABIRLI DEVRİM ***\n");
                    System.out.println("Geri adım attınız. Halk 'Enver Paşa dinimize saygılı' dedi.");
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() + 2);
                    indikatorlerCh3.setIttifakIliskisi(indikatorlerCh3.getIttifakIliskisi() - 1);
                }

            } else if (mevcutYol.equals("TURAN")) {
                if (secim == 1) {
                    yesilYaz("\n*** SAMURAY KILICI ***\n");
                    System.out.println("Japon teknolojisi orduya girdi. Asya'nın iki devi birleşti.");
                    indikatorlerCh3.setOrduGucu(indikatorlerCh3.getOrduGucu() + 4);
                    indikatorlerCh3.setItilafIliskisi(indikatorlerCh3.getItilafIliskisi() - 4);
                } else {
                    kirmiziYaz("\n*** YALNIZ KURT ***\n");
                    System.out.println("Japonlar küstü. Rusya'ya karşı tek başınasınız.");
                    indikatorlerCh3.setIkmalDurumu(indikatorlerCh3.getIkmalDurumu() - 2);
                }

            } else if (mevcutYol.equals("CUMHURIYET")) {
                if (secim == 1) {
                    yesilYaz("\n*** LAİKLİK ***\n");
                    System.out.println("Hilafet kaldırıldı. Din ve devlet işleri ayrıldı. Devrimler hızlandı.");
                    indikatorlerCh3.setSubayDestegi(indikatorlerCh3.getSubayDestegi() + 3);
                    indikatorlerCh3.setPadisahDestegi(0);
                } else {
                    kirmiziYaz("\n*** ÇİFT BAŞ ***\n");
                    System.out.println("Halife siyasete karışmaya devam etti. Rejim tehlikede.");
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() - 2);
                }

            } else if (mevcutYol.equals("SERIAT")) {
                if (secim == 1) {
                    yesilYaz("\n*** MÜMİNE KADINLAR ***\n");
                    System.out.println("Kızlar okullu oldu. İslam dünyasına örnek bir model doğuyor.");
                    indikatorlerCh3.setIkmalDurumu(indikatorlerCh3.getIkmalDurumu() + 2);
                } else {
                    kirmiziYaz("\n*** KARANLIK ***\n");
                    System.out.println("Kadınlar cahil bırakıldı. Toplumun yarısı felç oldu.");
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() - 3);
                }
            }

        } else {
            olayMuzigi.durdur();
            throw new ArithmeticException("Lütfen sadece sayı giriniz.");
        }
    }
}