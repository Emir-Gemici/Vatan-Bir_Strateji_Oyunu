package com.vatan.chapters.ch3;

import com.vatan.core.*;
import java.util.Scanner;

public class Chapter3_64 extends Olay<IndikatorlerCh3> {

    public Chapter3_64() {
        super("", new String[]{});
    }

    @Override
    public void oynat(IndikatorlerCh3 indikatorlerCh3) {
        String mevcutYol = indikatorlerCh3.getOyunYolu();
        MuzikKutusu olayMuzigi = new MuzikKutusu();

        // NOT: PARCALANMA VE MANDA YOLLARI 60. SORUDA SONA ERDİĞİ İÇİN BURADA YER ALMAZ.

        if (mevcutYol.equals("TARIHSEL")) {
            this.metin =
                    "Korbaşı Ergaş (Karlı Dağ Yolu):\n" +
                            "Paşam, ne yazık ki Moskoflara dayanamadık, Duşanbe düştü.\n" +
                            "Buradan Belcuvan, oradan da Çegan tepelerine doğru gidelim derim paşam.\n" +
                            "Oradaki halk da bizden yanadır, bizi ele satmaz. Orada gücümüzü toplar kendimize geliriz.\n";
            this.cevaplar = new String[]{
                    "Kaçıyoruz gidiyoruz da hadi hayırlısı... Bu geri çekilme hayra alamet değil ama elden ne gelir. (Mecburi İstikamet)",
                    "Çegan son durağımız olabilir Ergaş. Eğer orada da tutunamazsak şehadet şerbetini içeriz. Hazırlıklı olun! (Kaderine Razı Ol)"
            };
            olayMuzigi.oynat("1/Chapter3_64.mp3");

        } else if (mevcutYol.equals("KOMUNIST")) {
            this.metin =
                    "Telgraf (Moskova'dan - Stalin):\n" +
                            "Yoldaş Enver! Türkistan'daki başarılarınızdan dolayı sizi tebrik ederim.\n" +
                            "Size 'Kızıl Bayrak Nişanı' takdim etmek ve yeni stratejiyi konuşmak için acilen Moskova'ya gelmenizi emrediyorum.\n" +
                            "Treniniz hazır. Gelmezseniz parti disiplinine uymamış sayılırsınız.\n";
            this.cevaplar = new String[]{
                    "Emir demiri keser. Moskova'ya gidiyorum. Stalin yoldaşımdır, bana zarar vermez. (Tuzağa Git - KÖTÜ SON)",
                    "Bu bir tuzak! Giden geri gelmiyor. Gitmiyorum! Türkistan'da kalıp kendi başımızın çaresine bakacağız. (İsyan Et)"
            };
            olayMuzigi.oynat("6/Chapter3_64.mp3");

        } else if (mevcutYol.equals("TURAN")) {
            this.metin =
                    "Sınır Karakolu:\n" +
                            "Ulu Hakan! Kuzeyden Ruslar, Doğudan Çin ordusu birleşip üzerimize geliyor.\n" +
                            "Sayıları milyonları buluyor. Bizim ise 100 bin bozkurtumuz var.\n" +
                            "Bozkır taktiği ile onları içeri çekip 'Kurt Kapanı'na mı kıstıralım, yoksa şehirleri siper yapıp savunalım mı?\n";
            this.cevaplar = new String[]{
                    "Geri çekilin! Onları çöllere çekip aç ve susuz bırakacağız. Kurt kapanı kurulacak!",
                    "Bir karış toprak vermem! Şehirlerde sokak sokak savaşacağız. Semerkant düşmeyecek!"
            };
            olayMuzigi.oynat("2/Chapter3_64.mp3");

        } else if (mevcutYol.equals("CUMHURIYET")) {
            this.metin =
                    "İstihbarat Raporu:\n" +
                            "Paşam, İzmir seyahatiniz sırasında size ve Gazi Paşa'ya suikast düzenleneceği ihbarını aldık.\n" +
                            "Eski İttihatçı fedailerden bazıları ve saltanat yanlıları işbirliği yapmış.\n" +
                            "Seyahati iptal edelim mi, yoksa üzerine gidip hepsini yakalayalım mı?\n";
            this.cevaplar = new String[]{
                    "Korkup saklanacak değiliz! Seyahat devam edecek. Suçluları suçüstü yakalayın ve İstiklal Mahkemesi'ne verin!",
                    "Risk almayalım. Seyahat iptal. Ankara'dan operasyon yönetilsin."
            };
            olayMuzigi.oynat("3/Chapter3_64.mp3");

        } else if (mevcutYol.equals("SERIAT")) {
            this.metin =
                    "Manisa (Menemen Olayı):\n" +
                            "Sultanım! Derviş Mehmet adında bir mürteci, etrafına topladığı adamlarla ayaklandı.\n" +
                            "Olayı bastırmaya giden Asteğmen Kubilay'ı şehit ettiler.\n" +
                            "Halk galeyanda. Ordu intikam istiyor. Şeriat rejimine karşı ilk büyük kanlı isyan bu.\n";
            this.cevaplar = new String[]{
                    "Bu caniler ibret-i alem için asılacak! Bölgeye orduyu gönderin, taş üstünde taş kalmasın!",
                    "Olayı büyütmeyelim. Yerel mahkeme baksın. Halkı kışkırtmayalım."
            };
            olayMuzigi.oynat("4/Chapter3_64.mp3");
        }

        soruSor();

        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int secim = sc.nextInt();
            sc.nextLine();
            olayMuzigi.durdur();

            if (mevcutYol.equals("TARIHSEL")) {
                if (secim == 1) {
                    kirmiziYaz("\n*** HÜZÜNLÜ GÖÇ ***\n");
                    System.out.println("Yorgun atınızın üzerinde başınız eğik. Çegan Tepesi uzakta göründü.");
                    System.out.println("Askerlerinizin morali bozuk ama size sadıklar.");

                    indikatorlerCh3.setAskerMorali(indikatorlerCh3.getAskerMorali() - 2);
                    indikatorlerCh3.setIkmalDurumu(indikatorlerCh3.getIkmalDurumu() - 1);
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() + 1);
                } else {
                    yesilYaz("\n*** SON KALE ***\n");
                    System.out.println("Çegan Tepesi'ne vardınız. Mevziler kazıldı. Bayram sabahına hazırlanıyorsunuz.");
                    System.out.println("Kaderin ağları örüldü.");

                    indikatorlerCh3.setAskerMorali(indikatorlerCh3.getAskerMorali() + 3);
                    indikatorlerCh3.setOrduGucu(indikatorlerCh3.getOrduGucu() + 1);
                }

            } else if (mevcutYol.equals("KOMUNIST")) {
                if (secim == 1) {
                    kirmiziYaz("\n*** KURT KAPANI (OYUN SONU) ***\n");
                    System.out.println("Trene bindiniz. Sınırı geçer geçmez tutuklandınız.");
                    System.out.println("Lubyanka zindanları sizi bekliyor. Stalin affetmez.");
                    System.out.println("Tarih sahnesinden sessizce silindiniz.");

                    indikatorlerCh3.setHalkDestegi(0);
                    indikatorlerCh3.setOyunDevamEdiyor(false); // Komünist yolun kötü sonu burada biter.

                } else {
                    yesilYaz("\n*** TİTREYEN MOSKOVA ***\n");
                    System.out.println("Rest çektiniz. Stalin küplere bindi ama Türkistan'ı kaybetmekten korktuğu için saldıramıyor.");
                    System.out.println("Kendi kaderinizi çizdiniz. Bağımsızlık yolu açıldı.");
                    indikatorlerCh3.setSavasTehlikesi(indikatorlerCh3.getSavasTehlikesi() + 5);
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() + 4);
                }

            } else if (mevcutYol.equals("TURAN")) {
                if (secim == 1) {
                    yesilYaz("\n*** KURT OYUNU ***\n");
                    System.out.println("Düşman çöllere çekildi. Açlık ve susuzluk onları bitiriyor.");
                    System.out.println("Büyük zafer yakın.");
                    indikatorlerCh3.setOrduGucu(indikatorlerCh3.getOrduGucu() + 3);
                } else {
                    kirmiziYaz("\n*** ŞEHİR SAVAŞI ***\n");
                    System.out.println("Şehirler harabeye döndü. Sivil kayıplar çok fazla. Düşman durduruldu ama bedeli ağır.");
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() - 3);
                }

            } else if (mevcutYol.equals("CUMHURIYET")) {
                if (secim == 1) {
                    yesilYaz("\n*** DEMİR YUMRUK ***\n");
                    System.out.println("Suikastçılar yakalandı ve asıldı. Devletin gücü kanıtlandı.");
                    indikatorlerCh3.setSubayDestegi(indikatorlerCh3.getSubayDestegi() + 2);
                } else {
                    kirmiziYaz("\n*** KORKU İKLİMİ ***\n");
                    System.out.println("Seyahatin iptali zafiyet göstergesi oldu. Muhalifler cesaretlendi.");
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() - 2);
                }

            } else if (mevcutYol.equals("SERIAT")) {
                if (secim == 1) {
                    yesilYaz("\n*** KISAS ***\n");
                    System.out.println("Menemen yerle bir edildi. Rejim düşmanlarına gözdağı verildi.");
                    indikatorlerCh3.setSubayDestegi(indikatorlerCh3.getSubayDestegi() + 4);
                } else {
                    kirmiziYaz("\n*** ZAFİYET ***\n");
                    System.out.println("Katiller kaçtı. Ordu içinde huzursuzluk başladı.");
                    indikatorlerCh3.setSubayDestegi(indikatorlerCh3.getSubayDestegi() - 5);
                }
            }

        } else {
            olayMuzigi.durdur();
            throw new ArithmeticException("Lütfen sadece sayı giriniz.");
        }
    }
}