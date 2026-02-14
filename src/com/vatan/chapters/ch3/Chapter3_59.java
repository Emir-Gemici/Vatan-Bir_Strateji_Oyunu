package com.vatan.chapters.ch3;

import com.vatan.core.*;
import java.util.Scanner;

public class Chapter3_59 extends Olay<IndikatorlerCh3> {

    public Chapter3_59() {
        super("", new String[]{});
    }

    @Override
    public void oynat(IndikatorlerCh3 indikatorlerCh3) {
        String mevcutYol = indikatorlerCh3.getOyunYolu();
        MuzikKutusu olayMuzigi = new MuzikKutusu();

        if (mevcutYol.equals("TARIHSEL")) {
            this.metin =
                    "V. Lenin (Moskova - Son Görüşme):\n" +
                            "Enver Paşa, sanırım işler Anadolu'da sizin için kötüye gidiyor. Mustafa Kemal sizi ülkeye sokmuyor.\n" +
                            "İstersen seni gizlice Anadolu'ya sokmanın, belki de bir darbe yapmanın yolunu bulabilirim.\n" +
                            "Ancak daha önceden de belirttiğim gibi, bunun karşılığında bizim için de bazı şeyler yapmalısın. Kafkasya'yı tamamen bize bırakacaksın.\n";
            this.cevaplar = new String[]{
                    "Artık savaş bizim lehimize döndü zaten! Sakarya'da Türk ordusu kazandı. Sizden destek alıp da ne edeceğim Lenin efendi bir söylesene? Üstelik senin isteklerin sonucunda neler planladığın meçhul. O yüzden artık aramızdaki anlaşma bitmiştir! (İpleri Kopar)",
                    "Eğer istekleriniz bizi kuklalaştırmak falan değilse kabul edebilirim belki Lenin efendi. Anadolu'ya girmek için her yol mübahtır. (Taviz Ver)"
            };
            olayMuzigi.oynat("1/Chapter3_59.mp3");

        } else if (mevcutYol.equals("KOMUNIST")) {
            this.metin =
                    "Sovyet Politik Komiseri:\n" +
                            "Yoldaş Enver! 'Allahsızlar Cemiyeti' (Bezbozhnik) Türkistan'da faaliyete geçmek istiyor.\n" +
                            "Camilerin kapatılıp, Kuran kurslarının yasaklanmasını ve yerine 'Bilim ve Ateizm' derslerinin konulmasını talep ediyorlar.\n" +
                            "Bunu yapmazsak Moskova bizi 'Yeterince devrimci olmamakla' suçlayacak.\n";
            this.cevaplar = new String[]{
                    "Burası Rusya değil Türkistan! Halkın inancına dokunanın elini kırarım! Cemiyet yasaklanmıştır! (Milli Komünizm)",
                    "Devrim, eski dünyanın tüm kalıntılarını temizlemektir. Cemiyete izin verin, dinin kökünü kazısınlar. (Stalinist Çizgi)"
            };
            olayMuzigi.oynat("6/Chapter3_59.mp3");

        } else if (mevcutYol.equals("TURAN")) {
            this.metin =
                    "Bahriye Komutanı:\n" +
                            "Ulu Hakan! Karada yenilmeziz ama Hazar Denizi Rusların kontrolünde.\n" +
                            "Bakü petrollerini korumak ve karşı kıyıya asker sevkiyatı yapmak için acilen bir 'Hazar Donanması' kurmalıyız.\n" +
                            "Ancak gemi yapacak tersanemiz yok. Ya Rus gemilerine el koyacağız (Savaş sebebi) ya da karadan gemi yürüteceğiz.\n";
            this.cevaplar = new String[]{
                    "Fatih'in torunlarıyız! Gemileri karadan yürüterek Hazar'a indirin! Düşman şaşkına dönsün!",
                    "Rus gemilerine gece baskını yapıp el koyun! Hazar Türk gölü olacak!"
            };
            olayMuzigi.oynat("2/Chapter3_59.mp3");

        } else if (mevcutYol.equals("CUMHURIYET")) {
            this.metin =
                    "Milli Eğitim Bakanı:\n" +
                            "Paşam, Arap harfleri öğrenmeyi zorlaştırıyor ve okuma-yazma oranımız çok düşük.\n" +
                            "Medeniyet alemine girmek için Latin alfabesi temelli 'Yeni Türk Alfabesi'ne geçiş yapalım mı?\n" +
                            "Bu devrim, bin yıllık kütüphaneleri bir gecede okunmaz hale getirecek ama geleceği aydınlatacak.\n";
            this.cevaplar = new String[]{
                    "En büyük vatanseverlik cehaletle savaştır! Harf İnkılabı derhal yapılsın. Millet mektepleri açılsın!",
                    "Kültürümüzü kökünden koparamayız. Arap harflerini ıslah edelim ama Latin harflerine geçmeyelim."
            };
            olayMuzigi.oynat("3/Chapter3_59.mp3");

        } else if (mevcutYol.equals("SERIAT")) {
            this.metin =
                    "Zaptiye Nazırı:\n" +
                            "Sultanım, şeriat hükümlerine göre içki (hamr) haramdır. Ancak Galata ve Pera'da meyhaneler dolup taşıyor.\n" +
                            "Yabancılar ve gayrimüslimler 'Bizim dinimizde yasak değil' diyerek itiraz ediyor.\n" +
                            "Katı bir 'Men-i Müskirat Kanunu' (İçki Yasağı) çıkarıp tüm meyhaneleri kapatalım mı?\n";
            this.cevaplar = new String[]{
                    "Bu topraklarda haram işlenmesine göz yumamayız! İçki üretimi ve tüketimi tamamen yasaklanmıştır!",
                    "Gayrimüslimlere karışmayalım, Müslümanlara yasak olsun. Turizm ve ticaret baltalanmasın."
            };
            olayMuzigi.oynat("4/Chapter3_59.mp3");

        } else if (mevcutYol.equals("PARCALANMA") || mevcutYol.equals("MANDA")) {
            this.metin =
                    "Başkomutanlık Meydan Muharebesi Öncesi:\n" +
                            "Paşam! Ordunun yiyeceği, giyeceği, mermisi bitmek üzere.\n" +
                            "Halktan son bir fedakarlık isteyip 'Tekalif-i Milliye' (Milli Yükümlülük) emirlerini çıkaralım mı?\n" +
                            "Halkın elindeki çarığın, buğdayın %40'ına el koyacağız. Yoksa savaşamayız.\n";
            this.cevaplar = new String[]{
                    "Vatanın bağrı yanarken malın kıymeti yoktur! Emirleri çıkarın. Zaferden sonra hepsini geri öderiz!",
                    "Halk zaten perişan, daha fazlasını isteyemeyiz. Elimizdekiyle yetinelim. (Riskli)"
            };
            olayMuzigi.oynat("5/Chapter3_59.mp3");
        }

        soruSor();

        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int secim = sc.nextInt();
            sc.nextLine();
            olayMuzigi.durdur();

            if (mevcutYol.equals("TARIHSEL")) {
                if (secim == 1) {
                    yesilYaz("\n*** ONURLU VEDA ***\n");
                    System.out.println("Lenin'e kapıyı gösterdiniz. Rus desteği kesildi ama Türk milletinin onurunu satmadınız.");
                    System.out.println("Artık tek yol: Kendi kılıcınızla Türkistan dağlarında destan yazmak!");

                    indikatorlerCh3.setAskerMorali(indikatorlerCh3.getAskerMorali() + 2);
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() + 1);
                    indikatorlerCh3.setIttifakIliskisi(indikatorlerCh3.getIttifakIliskisi() - 3); // Ruslar düşman oldu
                    indikatorlerCh3.setSubayDestegi(indikatorlerCh3.getSubayDestegi() + 1);
                } else {
                    kirmiziYaz("\n*** RUS KUKLASI ***\n");
                    System.out.println("Bolşeviklerle anlaştınız. Anadolu'ya sızma planları yapılıyor.");
                    System.out.println("Ancak subaylar size 'Rus Ajanı' gözüyle bakmaya başladı.");

                    indikatorlerCh3.setAskerMorali(indikatorlerCh3.getAskerMorali() - 2);
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() - 1);
                    indikatorlerCh3.setIttifakIliskisi(indikatorlerCh3.getIttifakIliskisi() + 4);
                    indikatorlerCh3.setSubayDestegi(indikatorlerCh3.getSubayDestegi() - 3);
                }

            } else if (mevcutYol.equals("KOMUNIST")) {
                if (secim == 1) {
                    yesilYaz("\n*** İNANÇ VE İSYAN ***\n");
                    System.out.println("Halk sizi korudu. Moskova geri adım atmak zorunda kaldı.");
                    System.out.println("Enver Paşa hem Komünist hem Müslüman lider olarak seviliyor.");
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() + 3);
                } else {
                    kirmiziYaz("\n*** DİNSİZ DEVLET ***\n");
                    System.out.println("Camiler depoya çevrildi. Halk gizlice lanet okuyor.");
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() - 5);
                    indikatorlerCh3.setIttifakIliskisi(indikatorlerCh3.getIttifakIliskisi() + 3);
                }

            } else if (mevcutYol.equals("TURAN")) {
                if (secim == 1) {
                    yesilYaz("\n*** KARADAN YÜRÜYEN GEMİLER ***\n");
                    System.out.println("Mühendislik harikası! Hazar Denizi'nde Türk bayrağı dalgalanıyor.");
                    indikatorlerCh3.setAskerMorali(indikatorlerCh3.getAskerMorali() + 3);
                    indikatorlerCh3.setOrduGucu(indikatorlerCh3.getOrduGucu() + 2);
                } else {
                    kirmiziYaz("\n*** KORSANLIK ***\n");
                    System.out.println("Baskın başarılı oldu ama Rusya ile savaş riski tavan yaptı.");
                    indikatorlerCh3.setOrduGucu(indikatorlerCh3.getOrduGucu() + 1);
                    indikatorlerCh3.setSavasTehlikesi(indikatorlerCh3.getSavasTehlikesi() + 3);
                }

            } else if (mevcutYol.equals("CUMHURIYET")) {
                if (secim == 1) {
                    yesilYaz("\n*** HARF DEVRİMİ ***\n");
                    System.out.println("Millet mektepleri doldu taştı. Okuma yazma oranı hızla artıyor.");
                    System.out.println("Kültür devrimi başladı.");
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() + 3);
                } else {
                    kirmiziYaz("\n*** ESKİYE DEVAM ***\n");
                    System.out.println("Cehaletle savaş yavaş ilerliyor. Modernleşme eksik kaldı.");
                    indikatorlerCh3.setIkmalDurumu(indikatorlerCh3.getIkmalDurumu() - 1);
                }

            } else if (mevcutYol.equals("SERIAT")) {
                if (secim == 1) {
                    yesilYaz("\n*** ARINMA ***\n");
                    System.out.println("Suç oranları düştü. Aile yapısı korundu.");
                    System.out.println("Yabancılar ülkeyi terk ediyor.");
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() + 2);
                    indikatorlerCh3.setIkmalDurumu(indikatorlerCh3.getIkmalDurumu() - 2); // Vergi kaybı
                } else {
                    kirmiziYaz("\n*** ÇİFTE STANDART ***\n");
                    System.out.println("Zenginler içiyor, fakirler cezalandırılıyor. Adalet duygusu zedelendi.");
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() - 3);
                }

            } else { // PARCALANMA veya MANDA
                if (secim == 1) {
                    yesilYaz("\n*** MİLLİ FEDAKARLIK ***\n");
                    System.out.println("Halk elinde ne varsa verdi. Ordu taarruza hazır!");
                    indikatorlerCh3.setOrduGucu(indikatorlerCh3.getOrduGucu() + 5);
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() + 2);
                } else {
                    kirmiziYaz("\n*** YOKLUK ***\n");
                    System.out.println("Asker aç ve çıplak. Taarruz gücümüz yok.");
                    indikatorlerCh3.setOrduGucu(indikatorlerCh3.getOrduGucu() - 4);
                }
            }

        } else {
            olayMuzigi.durdur();
            throw new ArithmeticException("Lütfen sadece sayı giriniz.");
        }
    }
}