package com.vatan.chapters.ch3;

import com.vatan.core.*;
import java.util.Scanner;

public class Chapter3_53 extends Olay<IndikatorlerCh3> {

    public Chapter3_53() {
        super("", new String[]{});
    }

    @Override
    public void oynat(IndikatorlerCh3 indikatorlerCh3) {
        String mevcutYol = indikatorlerCh3.getOyunYolu();
        MuzikKutusu olayMuzigi = new MuzikKutusu();

        // DİKKAT: KOMÜNİST YOL 55. SORUDA AÇILACAĞI İÇİN BURADA YER ALMAZ.

        if (mevcutYol.equals("TARIHSEL")) {
            this.metin =
                    "Cemal Paşa (Kremlin Sarayı Koridoru):\n" +
                            "Şimdi bu Lenin adındaki adamla görüşeceğiz. Lakin bunlarla nasıl bir anlaşma yapmalıyız inan bilmiyorum Enver.\n" +
                            "O yüzden kararı sen ver. Ya çıkarlarımız için sıkı bir anlaşma yaparız, eğer çıkarlarımıza uygun bir durum olursa...\n" +
                            "Veya baktık bu adam bize yararlı şeyler vermeyecek, en iyisi buna mesafeli duralım. Ne dersin? Nasıl bir vaat verir bu adam bize?\n";
            this.cevaplar = new String[]{
                    "Kötü bir vaat vereceğini sanmam. O yüzden onunla çıkar güden bir ilişki kurmaya kalkarız. Tabi sonunu kestiremesem de bu herif neticede bir İngiliz olmadığı için bize yamuk yapmaz herhalde.",
                    "Biliyor musun, sen şimdi böyle dedin beni de şüpheye soktun. En iyisi bunlara biz mesafeli bir şekilde yaklaşalım. Neticede kim olduğunu ve nasıl biri olduğunu bilmiyoruz."
            };
            olayMuzigi.oynat("1/Chapter3_53.mp3");

        } else if (mevcutYol.equals("TURAN")) {
            this.metin =
                    "İran Sınırı:\n" +
                            "Büyük Hakanım! Hindistan'a inmek için İran topraklarından geçmemiz lazım.\n" +
                            "İran Şahı 'Geçiş izni veririm ama ordunuzun silahlarını sınırda bırakmasını isterim' diyor.\n" +
                            "Bize güvenmiyor. Şah'ı tehdit edip zorla mı geçelim, yoksa etrafından mı dolaşalım?\n";
            this.cevaplar = new String[]{
                    "Türk'ün ordusu silah bırakmaz! Şah'a söyleyin, ya yolu açar ya da tahtını başına yıkarım!",
                    "Vakit kaybetmeyelim. Hazar Denizi'nin kuzeyinden dolaşalım. İran'la şimdilik uğraşamam."
            };
            olayMuzigi.oynat("2/Chapter3_53.mp3");

        } else if (mevcutYol.equals("CUMHURIYET")) {
            this.metin =
                    "Afet İnan Hanım:\n" +
                            "Paşam, medeni kanunla kadınlara haklar verdik ama hala oy kullanamıyorlar.\n" +
                            "Avrupa'nın birçok ülkesinde bile yokken, Türk kadınına seçme ve seçilme hakkını verelim mi?\n" +
                            "Meclisteki bazı muhafazakarlar 'Kadının yeri evidir' diye mırıldanıyor.\n";
            this.cevaplar = new String[]{
                    "Kadınlarımız cephede mermi taşıdı, mecliste de söz sahibi olacak! Hakları derhal verilsin!",
                    "Toplum henüz buna hazır değil. Önce belediye seçimlerinde deneyelim, meclis sonra gelir."
            };
            olayMuzigi.oynat("3/Chapter3_53.mp3");

        } else if (mevcutYol.equals("SERIAT")) {
            this.metin =
                    "Dahiliye Nazırı:\n" +
                            "Sultanım, halkın kılık kıyafeti çok karışık. Kimisi fes, kimisi sarık, kimisi şapka takıyor.\n" +
                            "Bir düzen getirmek adına 'Fes'i zorunlu kılıp, Batı tarzı şapkayı 'Küfür alameti' sayarak yasaklayalım mı?\n";
            this.cevaplar = new String[]{
                    "Müslümanın başlığı bellidir! Şapka takan gavura benzer. Fes zorunludur, şapka yasaktır!",
                    "Kıyafetle iman olmaz. İsteyen istediğini giysin. Devleti terzihane gibi yönetmeyelim."
            };
            olayMuzigi.oynat("4/Chapter3_53.mp3");

        } else if (mevcutYol.equals("PARCALANMA") || mevcutYol.equals("MANDA")) {
            this.metin =
                    "Sivas Kongresi:\n" +
                            "Paşam! Delegelerin bir kısmı, özellikle Halide Edip Hanım ve grubu 'Amerikan Mandası'nı savunuyor.\n" +
                            "'Tek başımıza İngilizleri yenemeyiz, Amerika'nın himayesine girelim, kalkınırız' diyorlar.\n" +
                            "Manda fikrini kesin bir dille reddedelim mi, yoksa açık bir kapı bırakalım mı?\n";
            this.cevaplar = new String[]{
                    "Manda ve himaye kabul edilemez! Ya istiklal ya ölüm! Başka yolu yok!",
                    "Amerika İngiltere'ye benzemez. Belki geçici bir süre desteklerini alabiliriz. Tartışalım."
            };
            olayMuzigi.oynat("5/Chapter3_53.mp3");
        }

        soruSor();

        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int secim = sc.nextInt();
            sc.nextLine();
            olayMuzigi.durdur();

            if (mevcutYol.equals("TARIHSEL")) {
                if (secim == 1) {
                    yesilYaz("\n*** DOĞUYA AÇILAN KAPI ***\n");
                    System.out.println("Lenin ile sıcak temas kurma kararı aldınız.");
                    System.out.println("Cemal Paşa hala şüpheci ama sizin öngörünüze güveniyor.");
                    System.out.println("Bu karar, gelecekteki 'Kızıl Elma'yı 'Kızıl Yıldız'a dönüştürebilir.");

                    indikatorlerCh3.setIttifakIliskisi(indikatorlerCh3.getIttifakIliskisi() + 2);
                    indikatorlerCh3.setItilafGucu(indikatorlerCh3.getItilafGucu() - 2);
                } else {
                    kirmiziYaz("\n*** MESAFELİ DURUŞ ***\n");
                    System.out.println("Lenin'e karşı temkinli yaklaştınız. Ruslar bu soğukluğu hissetti.");
                    System.out.println("Moskova'dan eli boş dönme ihtimaliniz arttı ama onurunuzu korudunuz.");

                    indikatorlerCh3.setIttifakIliskisi(indikatorlerCh3.getIttifakIliskisi() - 1);
                    indikatorlerCh3.setSubayDestegi(indikatorlerCh3.getSubayDestegi() + 1);
                }

            } else if (mevcutYol.equals("TURAN")) {
                if (secim == 1) {
                    yesilYaz("\n*** ACEM'E DERS ***\n");
                    System.out.println("Şah korktu, yolu açtı. Turan ordusu Tahran sokaklarında gövde gösterisi yaptı.");
                    indikatorlerCh3.setOrduGucu(indikatorlerCh3.getOrduGucu() + 1);
                    indikatorlerCh3.setItilafIliskisi(indikatorlerCh3.getItilafIliskisi() - 2);
                } else {
                    kirmiziYaz("\n*** ZORLU YOL ***\n");
                    System.out.println("Kuzey yolu bataklık ve soğuk. Ordu yıprandı.");
                    indikatorlerCh3.setIkmalDurumu(indikatorlerCh3.getIkmalDurumu() - 3);
                }

            } else if (mevcutYol.equals("CUMHURIYET")) {
                if (secim == 1) {
                    yesilYaz("\n*** DÜNYAYA ÖRNEK ***\n");
                    System.out.println("Türk kadını seçme hakkını kazandı. Dünya basını bizi alkışlıyor.");
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() + 3);
                    indikatorlerCh3.setItilafIliskisi(indikatorlerCh3.getItilafIliskisi() + 2);
                } else {
                    kirmiziYaz("\n*** ERTELENEN BAHAR ***\n");
                    System.out.println("Kadınlar hayal kırıklığına uğradı. Devrimci ateşi zayıfladı.");
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() - 1);
                }

            } else if (mevcutYol.equals("SERIAT")) {
                if (secim == 1) {
                    yesilYaz("\n*** TEK TİP TOPLUM ***\n");
                    System.out.println("Herkes fesli. Görüntüde birlik var ama özgürlük yok.");
                    indikatorlerCh3.setPadisahDestegi(indikatorlerCh3.getPadisahDestegi() + 2);
                    indikatorlerCh3.setItilafIliskisi(indikatorlerCh3.getItilafIliskisi() - 2);
                } else {
                    kirmiziYaz("\n*** KARIŞIKLIK ***\n");
                    System.out.println("Sokaklar karnaval gibi. Kimin ne olduğu belli değil.");
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() + 1);
                }

            } else { // PARCALANMA veya MANDA
                if (secim == 1) {
                    yesilYaz("\n*** TAM BAĞIMSIZLIK ***\n");
                    System.out.println("Manda fikri kongreden kovuldu! Millet kendi gücüne inandı.");
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() + 5);
                    indikatorlerCh3.setSubayDestegi(indikatorlerCh3.getSubayDestegi() + 3);
                } else {
                    kirmiziYaz("\n*** TESLİMİYET ***\n");
                    System.out.println("Manda tartışması iradeyi kırdı. 'Acaba Amerika kurtarır mı?' şüphesi yayıldı.");
                    indikatorlerCh3.setAskerMorali(indikatorlerCh3.getAskerMorali() - 3);
                }
            }

        } else {
            olayMuzigi.durdur();
            throw new ArithmeticException("Lütfen sadece sayı giriniz.");
        }
    }
}