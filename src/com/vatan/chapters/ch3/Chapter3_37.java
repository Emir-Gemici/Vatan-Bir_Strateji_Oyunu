package com.vatan.chapters.ch3;

import com.vatan.core.*;
import java.util.Scanner;

public class Chapter3_37 extends Olay<IndikatorlerCh3> {

    public Chapter3_37() {
        super("", new String[]{});
    }

    @Override
    public void oynat(IndikatorlerCh3 indikatorlerCh3) {
        String mevcutYol = indikatorlerCh3.getOyunYolu();
        MuzikKutusu olayMuzigi = new MuzikKutusu();

        if (mevcutYol.equals("TARIHSEL")) {
            this.metin =
                    "Mustafa Kemal Paşa:\n" +
                            "Gözümüz aydın Enver Paşa. Çanakkale'de çok isabetli bir zafer elde ettik. Bunu sana haber etmek istedim.\n" +
                            "Düşman donanması ve kara ordusu çekiliyor. Payitahtın kilidi artık güvendedir.\n";
            this.cevaplar = new String[]{
                    "Sağ ol Mustafa Kemal Paşa. Allah'ın izniyle inşallah diğer cepheler için de aynısını tez vakitte göreceğiz.",
                    "Tebrikler Paşa. Lakin işimiz bitmedi. Çanakkale'deki o muzaffer birlikleri derhal Galiçya ve Romanya cephelerine, müttefiklere yardıma gönderelim!"
            };
            olayMuzigi.oynat("1/Chapter3_37.mp3");

        } else if (mevcutYol.equals("TURAN")) {
            this.metin =
                    "Uçbeyi:\n" +
                            "Büyük Hakanım! Çin Ejderhası uyandı. İmparatorluk ordusu 200 bin kişiyle üzerimize geliyor.\n" +
                            "Sayıca 1'e 5 üstünler. Eğer meydan savaşına girersek eziliriz.\n" +
                            "Tanrı Dağları'na çekilip vur-kaç taktiği mi uygulayalım (Gerilla), yoksa 'Türk kaçmaz' diyip ölümüne meydan mı okuyalım?\n";
            this.cevaplar = new String[]{
                    "Geri çekilmek yok! Turan ordusu gücünü dünyaya gösterecek. Meydan savaşı için saf tutun!",
                    "Akıl güce galip gelir. Dağlara çekilin, düşmanı içeri çekip parça parça yok edeceğiz."
            };
            olayMuzigi.oynat("2/Chapter3_37.mp3");

        } else if (mevcutYol.equals("CUMHURIYET")) {
            this.metin =
                    "Kültür Bakanlığı Müsteşarı:\n" +
                            "Paşam, radyolarda hala 'Alaturka' (Klasik Türk Müziği) çalınıyor. Bu müzik halkı uyuşturuyor ve geçmişe bağlıyor.\n" +
                            "Muasır medeniyetler seviyesi için radyolarda Alaturka'yı yasaklayıp, sadece Batı Klasik Müziği ve çok sesli müzik çaldıralım.\n" +
                            "Halk buna tepki gösterecektir ama kulakları zamanla alışır.\n";
            this.cevaplar = new String[]{
                    "Doğrudur. O uyuşuk ezgiler yasaklansın! Radyolarda sadece Mozart, Beethoven ve marşlar çalacak.",
                    "Kültür zorlamayla değişmez. Kendi müziğimizi modernize edelim ama yasaklamayalım. Halkı radyodan soğutmayın."
            };
            olayMuzigi.oynat("3/Chapter3_37.mp3");

        } else if (mevcutYol.equals("SERIAT")) {
            this.metin =
                    "Ticaret Odası Başkanı:\n" +
                            "Sultanım, devlet işlerinde Hicri Takvim kullanıyoruz ama dünya Miladi Takvim'e (Güneş takvimi) göre işliyor.\n" +
                            "Tren seferleri karışıyor, banka vadeleri tutmuyor, dış ticarette büyük zarar ediyoruz.\n" +
                            "Devlet işlerinde Miladi takvime geçsek? İbadetlerde yine Hicri kullanırız.\n";
            this.cevaplar = new String[]{
                    "Kafirin zamanına uymayız! Hicri takvim İslam'ın nişanesidir. Zarar etsek de bereket ondadır.",
                    "Ticaretin dini olmaz. Devlet işlerinde Miladi, dini günlerde Hicri takvim kullanılsın. Çifte takvim uygulayın."
            };
            olayMuzigi.oynat("4/Chapter3_37.mp3");

        } else if (mevcutYol.equals("PARCALANMA") || mevcutYol.equals("MANDA")) {
            this.metin =
                    "Sakarya Cephesi (22. Gün):\n" +
                            "Yunan ordusunun taarruzu durdu! Düşman yorgun, cephanesi bitti, geri çekilme emareleri var.\n" +
                            "Mustafa Kemal Paşa kükrüyor: 'Tam zamanıdır! Bütün hatlarla genel karşı taarruza kalkalım!'\n" +
                            "Ama ordumuzun da dermanı kalmadı. Eğer taarruz başarısız olursa elimizdeki son askeri de kaybederiz.\n";
            this.cevaplar = new String[]{
                    "Düşmanı kaçırırsak toparlanır. Vur İsmet! Bütün gücümüzle taarruz! Ya istiklal ya ölüm!",
                    "Riske girmeyelim. Bırakın çekilsinler, biz de yaralarımızı saralım. Savunmada kazandık, maceraya gerek yok."
            };
            olayMuzigi.oynat("5/Chapter3_37.mp3");
        }

        soruSor();

        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int secim = sc.nextInt();
            sc.nextLine();
            olayMuzigi.durdur();

            if (mevcutYol.equals("TARIHSEL")) {
                if (secim == 1) {
                    yesilYaz("\n*** ZAFERİN HAKLI GURURU ***\n");
                    System.out.println("Mustafa Kemal'i onurlandırdınız. Ordu içinde kardeşlik havası esti.");
                    System.out.println("Çanakkale'deki askerler Anadolu savunması için rezerve edildi.");

                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() + 2);
                    indikatorlerCh3.setSubayDestegi(indikatorlerCh3.getSubayDestegi() + 2);
                    indikatorlerCh3.setOrduGucu(indikatorlerCh3.getOrduGucu() + 1);
                } else {
                    kirmiziYaz("\n*** YANLIŞ SEVKİYAT ***\n");
                    System.out.println("Çanakkale'deki aslanları Avrupa cephelerine (Galiçya) sürdünüz.");
                    System.out.println("Kendi vatanımız işgal altındayken elin toprağında şehit oldular. Anadolu savunmasız kaldı.");

                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() - 3);
                    indikatorlerCh3.setOrduGucu(indikatorlerCh3.getOrduGucu() - 2); // Asker ziyan oldu
                    indikatorlerCh3.setIttifakIliskisi(indikatorlerCh3.getIttifakIliskisi() + 3); // Almanlar sevindi
                }

            } else if (mevcutYol.equals("TURAN")) {
                if (secim == 1) {
                    kirmiziYaz("\n*** KAN DENİZİ ***\n");
                    System.out.println("Sayı farkı çok fazlaydı. Kahramanca savaştık ama ezildik.");
                    System.out.println("Ordu dağıldı, hayaller Çin seddi önünde söndü.");
                    indikatorlerCh3.setOrduGucu(indikatorlerCh3.getOrduGucu() - 5);
                    indikatorlerCh3.setSavasTehlikesi(5);
                } else {
                    yesilYaz("\n*** KURT OYUNU ***\n");
                    System.out.println("Dağlara çekildik. Çin ordusu peşimizden geldi ve vadilerde sıkıştı.");
                    System.out.println("Gerilla taktiği ile dev orduyu eritiyoruz.");
                    indikatorlerCh3.setOrduGucu(indikatorlerCh3.getOrduGucu() + 2);
                    indikatorlerCh3.setSubayDestegi(indikatorlerCh3.getSubayDestegi() + 2);
                }

            } else if (mevcutYol.equals("CUMHURIYET")) {
                if (secim == 1) {
                    yesilYaz("\n*** RADYO SUSTU ***\n");
                    System.out.println("Alaturka yasaklandı. Halk radyolarını kapattı veya Arap radyolarını dinlemeye başladı.");
                    System.out.println("Kültürel bir kopuş yaşanıyor.");
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() - 3);
                    indikatorlerCh3.setItilafIliskisi(indikatorlerCh3.getItilafIliskisi() + 1);
                } else {
                    yesilYaz("\n*** ÇOK SESLİ TÜRKİYE ***\n");
                    System.out.println("Hem Dede Efendi çalıyor hem Beethoven. Halk bu sentezi sevdi.");
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() + 2);
                }

            } else if (mevcutYol.equals("SERIAT")) {
                if (secim == 1) {
                    kirmiziYaz("\n*** TİCARİ KAOS ***\n");
                    System.out.println("Bankalar ve trenler kilitlendi. Dış ticaret durma noktasına geldi.");
                    indikatorlerCh3.setIkmalDurumu(indikatorlerCh3.getIkmalDurumu() - 4);
                    indikatorlerCh3.setPadisahDestegi(indikatorlerCh3.getPadisahDestegi() + 2);
                } else {
                    yesilYaz("\n*** İKİLİ SİSTEM ***\n");
                    System.out.println("Devlet çarkları dönüyor. Ulema biraz bozulsa da işler yolunda.");
                    indikatorlerCh3.setIkmalDurumu(indikatorlerCh3.getIkmalDurumu() + 3);
                    indikatorlerCh3.setPadisahDestegi(indikatorlerCh3.getPadisahDestegi() - 1);
                }

            } else { // PARCALANMA veya MANDA
                if (secim == 1) {
                    yesilYaz("\n*** SAKARYA DESTANI ***\n");
                    System.out.println("Taarruz başarılı! Yunan ordusu panik halinde kaçıyor.");
                    System.out.println("1683 Viyana Kuşatması'ndan beri süren geri çekilme bugün son buldu!");
                    indikatorlerCh3.setOrduGucu(indikatorlerCh3.getOrduGucu() + 4);
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() + 5);
                    indikatorlerCh3.setSubayDestegi(indikatorlerCh3.getSubayDestegi() + 4);
                } else {
                    kirmiziYaz("\n*** FIRSAT KAÇTI ***\n");
                    System.out.println("Yunan ordusu düzenli çekildi, toparlanıp mevzi kazdılar.");
                    System.out.println("Savaşı bitirme şansını teptik.");
                    indikatorlerCh3.setSavasTehlikesi(indikatorlerCh3.getSavasTehlikesi() + 2);
                    indikatorlerCh3.setSubayDestegi(indikatorlerCh3.getSubayDestegi() - 3);
                }
            }

        } else {
            olayMuzigi.durdur();
            throw new ArithmeticException("Lütfen sadece sayı giriniz.");
        }
    }
}