package com.vatan.chapters.ch3;

import com.vatan.core.*;
import java.util.Scanner;

public class Chapter3_43 extends Olay<IndikatorlerCh3> {

    public Chapter3_43() {
        super("", new String[]{});
    }

    @Override
    public void oynat(IndikatorlerCh3 indikatorlerCh3) {
        String mevcutYol = indikatorlerCh3.getOyunYolu();
        MuzikKutusu olayMuzigi = new MuzikKutusu();

        if (mevcutYol.equals("TARIHSEL")) {
            this.metin =
                    "Talat Paşa:\n" +
                            "Enver, harp devam ettikçe halkın savaşa dayanacak hali kalmadı. 3 senedir cepheye evlatlarını gönderen analar artık bağrına taş basmaktan yoruldu.\n" +
                            "Kazanacaksak hızlı olmalıyız Enver. Milletin isyan etmesi an meselesi artık...\n";
            this.cevaplar = new String[]{
                    "Kazanamazsak ve vatanı kaybedersek o anaların evlatlarının döneceği bir ocak kalmaz Talat. Dayanacağız! (Sert Duruş)",
                    "Haklısın Talat... Halka moral lazım. Ordu stoklarından şehirlere erzak dağıtılsın. Cephe biraz aç kalsın ama cephe gerisi çökmesin."
            };
            olayMuzigi.oynat("1/Chapter3_43.mp3");

        } else if (mevcutYol.equals("TURAN")) {
            this.metin =
                    "Ordu Müfettişi:\n" +
                            "Büyük Hakanım! Asker 'Kızıl Elma' diye diye Çin Seddi'ne kadar geldi ama sıla hasreti çekiyor.\n" +
                            "Anadolu'dan mektup gelmiyor, giden dönemiyor. 'Biz burada ne arıyoruz, evimiz yandı mı?' diye fısıltılar başladı.\n" +
                            "Orduya büyük bir ganimet dağıtıp morallerini düzeltelim mi, yoksa 'Vatan Turan'dır' diye nutuk mu çekelim?\n";
            this.cevaplar = new String[]{
                    "Para için değil, dava için buradayız! Nutuk çekin, disiplini sıkı tutun. Gevşeyen haindir!",
                    "Haklılar... Yasak Şehir'in hazinelerini askerlere dağıtın. Altın gören askerin hasreti diner."
            };
            olayMuzigi.oynat("2/Chapter3_43.mp3");

        } else if (mevcutYol.equals("CUMHURIYET")) {
            this.metin =
                    "Maliye Vekili:\n" +
                            "Paşam, devrimlerin maliyeti ağır oldu. Köylüden alınan 'Aşar Vergisi' (Ürün vergisi) halkın belini büküyor.\n" +
                            "Köylü 'Cumhuriyet geldi ama cebimiz boşaldı' diyor.\n" +
                            "Bu vergiyi kaldırırsak hazine iflas eder, kaldırmazsak halk partiden soğur.\n";
            this.cevaplar = new String[]{
                    "Köylü milletin efendisidir! Aşar vergisi kaldırılmıştır! Hazineye başka kaynak bulun.",
                    "Devletin inşası için para lazım. Vergi devam edecek. Gelecek nesiller rahat etsin diye bugün kemer sıkacağız."
            };
            olayMuzigi.oynat("3/Chapter3_43.mp3");

        } else if (mevcutYol.equals("SERIAT")) {
            this.metin =
                    "İstanbul Kadısı:\n" +
                            "Sultanım, şeriatın ağır cezaları (recm, el kesme) halk arasında korku ve nefret uyandırmaya başladı.\n" +
                            "Batı dünyası bizi 'Barbar' olarak yaftalıyor. Halk da bu sertlikten yıldı.\n" +
                            "Halkın tepkisini dindirmek için 'Tazir' (Hafifletilmiş ceza) sistemine geçelim mi, yoksa 'Allah'ın hududu aşılmaz' mı diyelim?\n";
            this.cevaplar = new String[]{
                    "Allah'ın hükmü neyse odur! Kimse kınayıcının kınamasından korkmasın. Cezalar aynen uygulanacak!",
                    "Fitne çıkmasın diye cezaları yumuşatalım. Hapis ve sürgün cezalarına ağırlık verilsin."
            };
            olayMuzigi.oynat("4/Chapter3_43.mp3");

        } else if (mevcutYol.equals("PARCALANMA") || mevcutYol.equals("MANDA")) {
            this.metin =
                    "Anadolu Köylüsü (Temsili Heyet):\n" +
                            "Paşam, öküzümüzü aldınız, buğdayımızı aldınız, oğlumuzu aldınız.\n" +
                            "Artık verecek canımızdan başka bir şey kalmadı. Yunan ise polat gibi parlıyor.\n" +
                            "Bizim artık takatimiz yok. Bize bir umut verin, yoksa köyü terk edip dağlara çıkacağız.\n";
            this.cevaplar = new String[]{
                    "Söz veriyorum! Bu son fedakarlık. Sakarya'da onları boğacağız. Sabredin, zafer yakındır!",
                    "Kaçarsanız hain olursunuz! Vatan savunması bitmeden kimse bir yere gidemez. Jandarma, kaçanı vursun!"
            };
            olayMuzigi.oynat("5/Chapter3_43.mp3");
        }

        soruSor();

        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int secim = sc.nextInt();
            sc.nextLine();
            olayMuzigi.durdur();

            if (mevcutYol.equals("TARIHSEL")) {
                if (secim == 1) {
                    yesilYaz("\n*** ÇELİK İRADE ***\n");
                    System.out.println("Talat Paşa sustu. Enver'in kararlılığı odayı buz gibi kesti.");
                    System.out.println("Halk açlıktan kırılıyor ama devlet dimdik ayakta.");
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() - 3);
                    indikatorlerCh3.setIkmalDurumu(indikatorlerCh3.getIkmalDurumu() - 2);
                    indikatorlerCh3.setOrduGucu(indikatorlerCh3.getOrduGucu() + 1);
                    indikatorlerCh3.setSubayDestegi(indikatorlerCh3.getSubayDestegi() + 1);
                } else {
                    yesilYaz("\n*** EKMEK VE SAVAŞ ***\n");
                    System.out.println("Depolar açıldı. Halka un ve şeker dağıtıldı.");
                    System.out.println("Analar 'Allah devlete zeval vermesin' diye dua etti ama cepheye gidecek mühimmat azaldı.");
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() + 3);
                    indikatorlerCh3.setIkmalDurumu(indikatorlerCh3.getIkmalDurumu() - 4);
                    indikatorlerCh3.setOrduGucu(indikatorlerCh3.getOrduGucu() - 1);
                }

            } else if (mevcutYol.equals("TURAN")) {
                if (secim == 1) {
                    yesilYaz("\n*** ÜLKÜCÜ ORDU ***\n");
                    System.out.println("Askerler utandı, başlarını eğdi. Ordu maneviyatla kenetlendi.");
                    indikatorlerCh3.setAskerMorali(indikatorlerCh3.getAskerMorali() + 2);
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() - 1);
                } else {
                    yesilYaz("\n*** ALTIN YAĞMURU ***\n");
                    System.out.println("Hazineler dağıtıldı. Asker zengin oldu, savaşma isteği azaldı.");
                    indikatorlerCh3.setOrduGucu(indikatorlerCh3.getOrduGucu() - 2);
                    indikatorlerCh3.setAskerMorali(indikatorlerCh3.getAskerMorali() + 4);
                }

            } else if (mevcutYol.equals("CUMHURIYET")) {
                if (secim == 1) {
                    yesilYaz("\n*** KÖYLÜ EFENDİ OLDU ***\n");
                    System.out.println("Aşar kalktı. Köylü bayram ediyor. Cumhuriyet köylere kadar sevildi.");
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() + 5);
                    indikatorlerCh3.setIkmalDurumu(indikatorlerCh3.getIkmalDurumu() - 3);
                } else {
                    kirmiziYaz("\n*** AĞIR VERGİ ***\n");
                    System.out.println("Vergi memurları jandarmayla tahsilat yapıyor. Köylü devlete küstü.");
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() - 4);
                    indikatorlerCh3.setIkmalDurumu(indikatorlerCh3.getIkmalDurumu() + 4);
                }

            } else if (mevcutYol.equals("SERIAT")) {
                if (secim == 1) {
                    kirmiziYaz("\n*** KORKU İMPARATORLUĞU ***\n");
                    System.out.println("Meydanlarda infazlar sürüyor. Suç oranı sıfır ama halkın sevgisi kalmadı.");
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() - 4);
                    indikatorlerCh3.setPadisahDestegi(indikatorlerCh3.getPadisahDestegi() + 2);
                } else {
                    yesilYaz("\n*** MERHAMET KAPISI ***\n");
                    System.out.println("Cezalar yumuşadı. Halk 'Devlet baba şefkatli' dedi.");
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() + 2);
                    indikatorlerCh3.setPadisahDestegi(indikatorlerCh3.getPadisahDestegi() - 2);
                }

            } else { // PARCALANMA veya MANDA
                if (secim == 1) {
                    yesilYaz("\n*** UMUT AŞILANDI ***\n");
                    System.out.println("Gözlerinizdeki inanç köylüyü ikna etti. 'Sonuna kadar' dediler.");
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() + 3);
                    indikatorlerCh3.setAskerMorali(indikatorlerCh3.getAskerMorali() + 2);
                } else {
                    kirmiziYaz("\n*** ZORBALIK ***\n");
                    System.out.println("Halk korkudan sindi ama içten içe nefret büyüdü.");
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() - 5);
                    indikatorlerCh3.setIkmalDurumu(indikatorlerCh3.getIkmalDurumu() + 2);
                }
            }

        } else {
            olayMuzigi.durdur();
            throw new ArithmeticException("Lütfen sadece sayı giriniz.");
        }
    }
}