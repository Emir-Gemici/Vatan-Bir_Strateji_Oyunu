package com.vatan.chapters.ch3;

import com.vatan.core.*;
import java.util.Scanner;

public class Chapter3_61 extends Olay<IndikatorlerCh3> {

    public Chapter3_61() {
        super("", new String[]{});
    }

    @Override
    public void oynat(IndikatorlerCh3 indikatorlerCh3) {
        String mevcutYol = indikatorlerCh3.getOyunYolu();
        MuzikKutusu olayMuzigi = new MuzikKutusu();

        // NOT: PARCALANMA VE MANDA YOLLARI 60. SORUDA SONA ERDİĞİ İÇİN BURADA YER ALMAZ.

        if (mevcutYol.equals("TARIHSEL")) {
            this.metin =
                    "Korbaşı Ergaş (Türkistan Dağları):\n" +
                            "Enver Paşam, basmacı birliklerimizi kurmuş bulunmaktayız. Ancak bir derdimiz var.\n" +
                            "Bu birlikleri nasıl düzene sokacaksınız? Biz aşiret usulü savaşırız, sizin Alman nizamı bize uymaz.\n";
            this.cevaplar = new String[]{
                    "Her zaman ki gibi gerilla tipi dağlarda savaşmak bizi hem çevik hem de yerimizin zor tespit edilebilir olmasını kılacaktır. (Gerilla Harbi)",
                    "Düzenli birlik eğer kurulabiliyorsa kurmak daha makuldür. Devlet olacaksak ordumuz ordu gibi olmalı! (Nizami Ordu)"
            };
            olayMuzigi.oynat("1/Chapter3_61.mp3");

        } else if (mevcutYol.equals("KOMUNIST")) {
            this.metin =
                    "Taşkent - Parti Merkezi:\n" +
                            "Yoldaş Enver! Sultan Galiyev tutuklandı. Stalin, 'Milli Komünizm' fikrini ihanet sayıyor.\n" +
                            "Sizden de Galiyev'i kınayan bir bildiri yayınlamanız isteniyor.\n" +
                            "Eğer kınarsanız yeriniz sağlamlaşır, kınamazsanız sıradaki hedef sizsiniz.\n";
            this.cevaplar = new String[]{
                    "Galiyev haindir! Yaşasın Stalin, yaşasın enternasyonalizm! (Bildiriyi İmzala)",
                    "Galiyev benim dava arkadaşımdır. Türklerin sosyalizmi Ruslara benzemez! (Rest Çek)"
            };
            olayMuzigi.oynat("6/Chapter3_61.mp3");

        } else if (mevcutYol.equals("TURAN")) {
            this.metin =
                    "Eğitim Bakanı:\n" +
                            "Ulu Hakan! Turan gençliğini nasıl yetiştireceğiz?\n" +
                            "Seçeneklerimiz: Ya 'Bozkurt Ocakları' kurup tamamen askeri disiplinle, savaşa hazır bir nesil yetiştireceğiz,\n" +
                            "Ya da 'Fen Enstitüleri' kurup bilim ve sanata ağırlık vereceğiz.\n";
            this.cevaplar = new String[]{
                    "Her Türk asker doğar! Bozkurt Ocakları kurulsun. Disiplin ve itaat esastır!",
                    "Kılıçla alınan kalemle tutulur. Fen Enstitüleri kurulsun. Bize mühendis lazım."
            };
            olayMuzigi.oynat("2/Chapter3_61.mp3");

        } else if (mevcutYol.equals("CUMHURIYET")) {
            this.metin =
                    "İzmir İktisat Kongresi:\n" +
                            "Paşam, savaş bitti ama ekonomi çökmüş durumda. Fabrika yok, sermaye yok.\n" +
                            "Kalkınma modelimiz ne olacak? Devlet her şeyi kendi mi yapsın (Devletçilik),\n" +
                            "Yoksa özel sektörü mü teşvik edelim (Liberalizm)?\n";
            this.cevaplar = new String[]{
                    "Halkın parası yok, tüccar yok. Her fabrikayı Devlet kuracak! Devletçilik esastır.",
                    "Devlet tüccarlık yapmaz. Özel teşebbüsü destekleyelim, yabancı sermaye gelsin."
            };
            olayMuzigi.oynat("3/Chapter3_61.mp3");

        } else if (mevcutYol.equals("SERIAT")) {
            this.metin =
                    "Şeyhülislam Vekili:\n" +
                            "Sultanım, radyolarda çalınan Garp (Batı) müzikleri ve kadın sesleri halkın ahlakını bozuyor.\n" +
                            "Müziğin haram olup olmadığı tartışılıyor. Radyoyu tamamen yasaklayalım mı, yoksa sansür mü getirelim?\n";
            this.cevaplar = new String[]{
                    "Şeytan icadıdır! Radyoları toplatın, müzik çalınması yasaktır!",
                    "Sadece Kuran ve ilahi okunsun. Kadın sesi ve çalgı yasak olsun. (Sansür)"
            };
            olayMuzigi.oynat("4/Chapter3_61.mp3");
        }

        soruSor();

        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int secim = sc.nextInt();
            sc.nextLine();
            olayMuzigi.durdur();

            if (mevcutYol.equals("TARIHSEL")) {
                if (secim == 1) {
                    yesilYaz("\n*** DAĞLARIN HAYALETİ ***\n");
                    System.out.println("Gerilla taktiğini seçtiniz. Basmacılar bu işi iyi biliyor.");
                    System.out.println("Ruslar sizi yakalayamıyor ama büyük şehirleri de alamıyorsunuz.");

                    indikatorlerCh3.setAskerMorali(indikatorlerCh3.getAskerMorali() - 1);
                    indikatorlerCh3.setIkmalDurumu(indikatorlerCh3.getIkmalDurumu() - 1);
                    indikatorlerCh3.setOrduGucu(indikatorlerCh3.getOrduGucu() + 2);
                    indikatorlerCh3.setSubayDestegi(indikatorlerCh3.getSubayDestegi() - 1);
                } else {
                    kirmiziYaz("\n*** YANLIŞ NİZAM ***\n");
                    System.out.println("Düzensiz çetelerden düzenli ordu kurmaya çalıştınız.");
                    System.out.println("Basmacılar sıkıldı, firar etti. Rus topçusu toplu hedefleri kolayca vurdu.");

                    indikatorlerCh3.setAskerMorali(indikatorlerCh3.getAskerMorali() + 2);
                    indikatorlerCh3.setSubayDestegi(indikatorlerCh3.getSubayDestegi() + 2);
                }

            } else if (mevcutYol.equals("KOMUNIST")) {
                if (secim == 1) {
                    kirmiziYaz("\n*** KUKLA LİDER ***\n");
                    System.out.println("Galiyev idam edildi. Stalin sizi tebrik etti ama halk size 'Hain' diyor.");
                    indikatorlerCh3.setIttifakIliskisi(indikatorlerCh3.getIttifakIliskisi() + 5);
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() - 5);
                } else {
                    yesilYaz("\n*** BAYRAK AÇIŞ ***\n");
                    System.out.println("Moskova ile ipler koptu. Türkistan Komünist Partisi bağımsızlığını ilan etti.");
                    indikatorlerCh3.setSavasTehlikesi(indikatorlerCh3.getSavasTehlikesi() + 4);
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() + 3);
                }

            } else if (mevcutYol.equals("TURAN")) {
                if (secim == 1) {
                    yesilYaz("\n*** SPARTALILAR ***\n");
                    System.out.println("Gençlik savaşa hazır. Ordu gücü muazzam artıyor.");
                    indikatorlerCh3.setOrduGucu(indikatorlerCh3.getOrduGucu() + 4);
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() - 2);
                } else {
                    yesilYaz("\n*** ALTIN ÇAĞ ***\n");
                    System.out.println("Bilimsel patlama yaşanıyor. Turan medeniyeti yükseliyor.");
                    indikatorlerCh3.setIkmalDurumu(indikatorlerCh3.getIkmalDurumu() + 3);
                }

            } else if (mevcutYol.equals("CUMHURIYET")) {
                if (secim == 1) {
                    yesilYaz("\n*** FABRİKALAR KURULUYOR ***\n");
                    System.out.println("Sümerbank, Etibank kuruldu. Devlet sanayileşiyor.");
                    indikatorlerCh3.setIkmalDurumu(indikatorlerCh3.getIkmalDurumu() + 3);
                } else {
                    kirmiziYaz("\n*** SERMAYE YOK ***\n");
                    System.out.println("Özel sektör zayıf kaldı. Ekonomi dışa bağımlı hale geldi.");
                    indikatorlerCh3.setIkmalDurumu(indikatorlerCh3.getIkmalDurumu() - 2);
                }

            } else if (mevcutYol.equals("SERIAT")) {
                if (secim == 1) {
                    kirmiziYaz("\n*** SESSİZ TOPLUM ***\n");
                    System.out.println("Radyolar sustu. Halk dünyadan koptu.");
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() - 3);
                } else {
                    yesilYaz("\n*** İLAHİ SESİ ***\n");
                    System.out.println("Sadece dini yayınlar var. Gençler sıkılsa da ulema memnun.");
                    indikatorlerCh3.setPadisahDestegi(indikatorlerCh3.getPadisahDestegi() + 2);
                }
            }

        } else {
            olayMuzigi.durdur();
            throw new ArithmeticException("Lütfen sadece sayı giriniz.");
        }
    }
}