package com.vatan.chapters.ch3;

import com.vatan.core.*;
import java.util.Random;
import java.util.Scanner;

public class Chapter3_22 extends Olay<IndikatorlerCh3> {

    public Chapter3_22() {
        super("", new String[]{});
    }

    @Override
    public void oynat(IndikatorlerCh3 indikatorlerCh3) {
        int oncekiSecim = indikatorlerCh3.getonBirinciSorudaSecilenSik();
        MuzikKutusu olayMuzigi = new MuzikKutusu();
        MuzikKutusu olayMuzigi2 = new MuzikKutusu();
        olayMuzigi2.oynat("hangisi.mp3",-50);
        int ESİK_DEGER = 600;

        if (oncekiSecim == 1) { // İTİLAF YOLU
            this.metin =
                    "3. Ordu Komutanı:\n" +
                            "Paşam, İtilaf bloğundayız lakin Rusya içeride Bolşevik isyanlarıyla boğuşuyor. Kafkas cephesi bomboş.\n" +
                            "Bu tarihi bir fırsattır! Müttefiklik hukukunu bir kenara bırakıp Bakü petrollerine ve Orta Asya'daki soydaşlarımıza ulaşabiliriz.\n" +
                            "İngilizler bunu ihanet sayacaktır ve savaş açabilirler. Risk büyük ama hedef Turan! Ne dersiniz?\n";

            this.cevaplar = new String[]{
                    "Tarih cesurları yazar! Müttefikliği bozuyoruz. Rusya'nın zaafından faydalanıp Bakü'ye gireceğiz. Hedef Turan!",
                    "Devlet sözünden dönmez. Müttefikimiz Rusya'ya ihanet edemeyiz, sınırı koruyun. Cumhuriyetin temellerini sağlam atalım."
            };
            olayMuzigi.oynat("1/Chapter3_22.mp3");

        } else if (oncekiSecim == 2) { // İTTİFAK (TARİHSEL) YOLU
            this.metin =
                    "Hafız Hakkı Paşa:\n" +
                            "Enver Paşam, askerimiz kırılıyor. Rusların üzerine yürümek yerine çekilme emri vermeye hazırlanıyorum.\n" +
                            "Ermeni eşkıyasının da köyleri basmaya başladığı şu günlerde savunmaya çekilmek doğru olacaktır.\n";

            this.cevaplar = new String[]{
                    "Bre mendebur köpek! Rusları tarumar etme fırsatını mı tepeceğiz? Takviyelerle cepheyi yararsınız, saldırın!",
                    "Allah seni bildiği gibi etsin paşa! Saldırmasak bile Ruslar geliyor, bari mevzileri korumaya çalışın..."
            };
            olayMuzigi.oynat("2/Chapter3_22.mp3");

        } else if (oncekiSecim == 3) { // TARAFSIZ YOLU
            this.metin =
                    "Teşkilat-ı Mahsusa Reisi:\n" +
                            "Paşam, tarafsızız ama Rus ordusu Alman cephesinde eziliyor. Kafkaslarda sadece çeteler kaldı.\n" +
                            "Eğer şimdi gizli bir harekatla Kars ve Ardahan'a girersek kimse ruhunu bile duymaz.\n" +
                            "Bu harekat Turan yolunu açabilir ama başarısız olursak Düvel-i Muazzama bizi pasta gibi dilimler.\n";

            this.cevaplar = new String[]{
                    "Vatanın kaybedilen topraklarını geri almak boynumuzun borcudur. Saldırın! Ya Turan Ya Ölüm!",
                    "Macera aramayın. İslam aleminin lideri olarak tarafsız kalıp gücümüzü koruyalım. Şeriat-ı Garra'yı hakim kılalım."
            };
            olayMuzigi.oynat("3/Chapter3_22.mp3");
        }

        soruSor();

        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int secim = sc.nextInt();
            sc.nextLine();
            olayMuzigi.durdur();
            olayMuzigi2.durdur();

            // --- NİHAİ STAT HESAPLAMA FORMÜLÜ (GÜNCELLENMİŞ) ---
            Random zar = new Random();
            int sansFaktoru = zar.nextInt(200);

            // Eşik değer 500 olduğu için katsayılar yükseltildi ve Subay/Padişah eklendi.
            // İkmal (x6) + Moral (x5) + Ordu (x5) + Kafkas (x4) + Halk (x2) + Subay (x1) + Padişah (x1)
            int statSkoru = (indikatorlerCh3.getIkmalDurumu() * 6) +
                    (indikatorlerCh3.getAskerMorali() * 5) +
                    (indikatorlerCh3.getOrduGucu() * 5) +
                    (indikatorlerCh3.getBolgePuan("Kafkas") * 4) +
                    (indikatorlerCh3.getHalkDestegi() * 2) +
                    (indikatorlerCh3.getSubayDestegi() * 1) +
                    (indikatorlerCh3.getPadisahDestegi() * 1);

            int toplamSkor = statSkoru + sansFaktoru;

            // Debug için (Test ederken açılabilir)
            // --- İTİLAF SONUÇLARI//             System.out.println("Turan Skoru: " + toplamSkor + " (Hedef: " + ESİK_DEGER + ")"); ---

            if (oncekiSecim == 1) {
                if (secim == 1) { // Turan Denemesi
                    if (toplamSkor > ESİK_DEGER) {
                        yesilYaz("\n*** KIZIL ELMA'YA DOĞRU (TURAN YOLU AÇILDI) ***\n");
                        System.out.println("Rusya iç karışıklık yüzünden karşılık veremedi. Türk ordusu Bakü'ye girdi!");

                        indikatorlerCh3.setTuran(true);
                        indikatorlerCh3.setOyunYolu("TURAN");

                        indikatorlerCh3.bolgeGuncelle("Kafkas", 25);
                        indikatorlerCh3.setOrduGucu(indikatorlerCh3.getOrduGucu() + 2);
                    } else {
                        kirmiziYaz("\n*** MANDA VE HİMAYE FELAKETİ ***\n");
                        System.out.println("Ordumuz Rus steplerinde eridi. İngiltere 'ihanet' gerekçesiyle İstanbul'a asker çıkardı.");
                        System.out.println("Artık bağımsız bir devlet değil, İngiliz mandası olma yolundayız...");

                        indikatorlerCh3.setTuran(false);
                        indikatorlerCh3.setOyunYolu("PARCALANMA");

                        indikatorlerCh3.setItilafIliskisi(0);
                        indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() - 5);
                        indikatorlerCh3.setOrduGucu(indikatorlerCh3.getOrduGucu() - 5);
                    }
                } else if (secim == 2) { // Cumhuriyet Yolu
                    yesilYaz("\n*** CUMHURİYET YOLU ***\n");
                    System.out.println("Maceraya girmedik. Ordumuzu koruduk. Enver Paşa, modern bir Cumhuriyet'in temellerini atıyor.");

                    indikatorlerCh3.setTuran(false);
                    indikatorlerCh3.setOyunYolu("CUMHURIYET");

                    indikatorlerCh3.setItilafIliskisi(indikatorlerCh3.getItilafIliskisi() + 3);
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() + 2);
                } else {
                    throw new ArithmeticException("Geçersiz tuşlama yaptınız.");
                }

                // --- İTTİFAK (TARİHSEL) SONUÇLARI ---
            } else if (oncekiSecim == 2) {
                if (secim == 1) { // Turan Denemesi (Sarıkamış)
                    if (toplamSkor > ESİK_DEGER) {
                        yesilYaz("\n*** SARIKAMIŞ MUCİZESİ (TURAN YOLU AÇILDI) ***\n");
                        System.out.println("Mükemmel lojistik, subayların itaati ve çelik gibi irade!");
                        System.out.println("Rus ordusu Allahuekber dağlarında imha edildi. Kars ve Ardahan kurtarıldı.");

                        indikatorlerCh3.setTuran(true);
                        indikatorlerCh3.setOyunYolu("TURAN");

                        indikatorlerCh3.bolgeGuncelle("Kafkas", 25);
                        indikatorlerCh3.setAskerMorali(indikatorlerCh3.getAskerMorali() + 5);
                    } else {
                        kirmiziYaz("\n*** SARIKAMIŞ FACİASI (TARİHSEL YOL) ***\n");
                        System.out.println("Hesaplar tutmadı. Yazlık elbiselerle dağa sürülen 90 bin vatan evladı donarak şehit oldu.");
                        System.out.println("Tarihsel akış devam ediyor: İmparatorluk çöküyor.");

                        indikatorlerCh3.setTuran(false);
                        indikatorlerCh3.setOyunYolu("TARIHSEL");

                        indikatorlerCh3.setOrduGucu(indikatorlerCh3.getOrduGucu() - 5);
                        indikatorlerCh3.setAskerMorali(indikatorlerCh3.getAskerMorali() - 5);
                        indikatorlerCh3.bolgeGuncelle("Kafkas", -20);
                        indikatorlerCh3.setIkmalDurumu(indikatorlerCh3.getIkmalDurumu() - 5);
                    }
                } else if (secim == 2) { // Savunma
                    kirmiziYaz("\n*** RUS İŞGALİ (TARİHSEL YOL) ***\n");
                    System.out.println("Saldırmadık ama Ruslar durmadı. Erzurum ve Trabzon işgal tehdidi altında.");

                    indikatorlerCh3.setTuran(false);
                    indikatorlerCh3.setOyunYolu("TARIHSEL");

                    indikatorlerCh3.setOrduGucu(indikatorlerCh3.getOrduGucu() - 2);
                    indikatorlerCh3.bolgeGuncelle("Kafkas", -10);
                } else {
                    throw new ArithmeticException("Geçersiz tuşlama yaptınız.");
                }

                // --- TARAFSIZ SONUÇLARI ---
            } else if (oncekiSecim == 3) {
                if (secim == 1) { // Turan Denemesi
                    if (toplamSkor > ESİK_DEGER) {
                        yesilYaz("\n*** SESSİZ İŞGAL (TURAN YOLU AÇILDI) ***\n");
                        System.out.println("Dünya savaşla meşgulken Kafkasya'yı yıldırım hızıyla ele geçirdik.");

                        indikatorlerCh3.setTuran(true);
                        indikatorlerCh3.setOyunYolu("TURAN");

                        indikatorlerCh3.bolgeGuncelle("Kafkas", 20);
                        indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() + 3);
                    } else {
                        kirmiziYaz("\n*** PARÇALANMA BAŞLADI ***\n");
                        System.out.println("Harekat fiyasko ile sonuçlandı. Rusya, İngiltere ve Fransa bize savaş ilan etti.");

                        indikatorlerCh3.setTuran(false);
                        indikatorlerCh3.setOyunYolu("PARCALANMA");

                        indikatorlerCh3.setSavasTehlikesi(5);
                        indikatorlerCh3.setOrduGucu(indikatorlerCh3.getOrduGucu() - 4);
                    }
                } else if (secim == 2) { // Şeriat Yolu
                    yesilYaz("\n*** HİLAFETİN GÜCÜ (ŞERİAT YOLU) ***\n");
                    System.out.println("Savaşa girmedik. İslam alemi Halife'nin etrafında kenetlendi.");

                    indikatorlerCh3.setTuran(false);
                    indikatorlerCh3.setOyunYolu("SERIAT");

                    indikatorlerCh3.setPadisahDestegi(indikatorlerCh3.getPadisahDestegi() + 5);
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() + 3);
                } else {
                    throw new ArithmeticException("Geçersiz tuşlama yaptınız.");
                }
            }

        } else {
            olayMuzigi.durdur();
            olayMuzigi2.durdur();
            throw new ArithmeticException("Lütfen sadece sayı giriniz.");
        }
    }
}