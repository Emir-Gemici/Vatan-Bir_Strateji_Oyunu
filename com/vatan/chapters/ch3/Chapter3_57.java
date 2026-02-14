package com.vatan.chapters.ch3;

import com.vatan.core.*;
import java.util.Scanner;

public class Chapter3_57 extends Olay<IndikatorlerCh3> {

    public Chapter3_57() {
        super("", new String[]{});
    }

    @Override
    public void oynat(IndikatorlerCh3 indikatorlerCh3) {
        String mevcutYol = indikatorlerCh3.getOyunYolu();
        MuzikKutusu olayMuzigi = new MuzikKutusu();

        if (mevcutYol.equals("TARIHSEL")) {
            this.metin =
                    "Cemal Paşa (Batum'da Sabah Vakti):\n" +
                            "Evet, Enver sana güzel bir haberim var. Mustafa Kemal Paşa Sakarya'da şu Yunan itlerini güzel bir şekilde mağlup etmiş.\n" +
                            "Yunan ordusu geri çekiliyor. Anadolu hükümeti rüştünü ispatladı.\n" +
                            "Artık halkın ve askerin gözünde 'Kurtarıcı' tartışmasız Mustafa Kemal'dir.\n";
            this.cevaplar = new String[]{
                    "Allah Mustafa Kemal Paşa'dan razı olsun. Umarım önündeki muharebeler de böyle hayırlı geçecektir inşallah. (Kabullenme)",
                    "Madem öyle, bu durumda bizim de bir şeyler yapmamız gerekir. Lakin Anadolu'ya girmenin bir yolunu bulmamız lazım. (Israrcı Ol)"
            };
            olayMuzigi.oynat("1/Chapter3_57.mp3");

        } else if (mevcutYol.equals("KOMUNIST")) {
            this.metin =
                    "Halk Komiserleri Meclisi:\n" +
                            "Yoldaş Enver! Burjuvazinin mallarına el koyduk, şimdi sıra üretimde.\n" +
                            "Fabrikalarda ve tarlalarda 'İşçi Konseyleri' (Sovyetler) kurarak yönetimi tamamen işçilere mi bırakalım?\n" +
                            "Yoksa üretimi artırmak için 'Merkezi Planlama' ile emirleri tepeden, biz mi verelim?\n";
            this.cevaplar = new String[]{
                    "İktidar işçilerindir! Yönetimi konseylere bırakın. Her fabrika kendini yönetsin. (Özgürlükçü Sosyalizm)",
                    "Disiplin şarttır! Merkezden ne emredilirse o üretilecek. Gevşekliğe yer yok. (Otoriter Sosyalizm)"
            };
            olayMuzigi.oynat("6/Chapter3_57.mp3");

        } else if (mevcutYol.equals("TURAN")) {
            this.metin =
                    "Beyaz Rus Generali (Mülteci):\n" +
                            "Hakanım! Biz Çar taraftarı Ruslar, Bolşeviklere karşı sizinle birleşmek isteriz.\n" +
                            "Ortak düşmanımız Kızıl Ordu'dur. Bize silah verirseniz Kızılları arkadan vururuz.\n" +
                            "Tarihsel düşmanlığımızı bir kenara bırakıp 'Kızıl Veba'ya karşı ittifak yapalım mı?\n";
            this.cevaplar = new String[]{
                    "Düşmanımın düşmanı dostumdur! Silah verin, Kızılları oyalasınlar. (Stratejik İttifak)",
                    "Rus Rus'tur! Kızı da Beyazı da Türk'e düşmandır. Asla güvenmem, elçiyi kovun! (Milli Duruş)"
            };
            olayMuzigi.oynat("2/Chapter3_57.mp3");

        } else if (mevcutYol.equals("CUMHURIYET")) {
            this.metin =
                    "Meclis Başkanı:\n" +
                            "Paşam! Sakarya Zaferi sonrası Meclis, Mustafa Kemal Paşa'ya 'Mareşal' rütbesi ve 'Gazi' unvanı vermek istiyor.\n" +
                            "Ancak muhalif grup 'Bu kadar yetki ve unvan bir kişide toplanmamalı' diye itiraz ediyor.\n" +
                            "Oylamada tavrınız ne olacak?\n";
            this.cevaplar = new String[]{
                    "O bu unvanları anasının ak sütü gibi hak etti! Destekliyorum, Mareşal olmalı!",
                    "Zafer milletindir, şahısların değil. Rütbe verilsin ama abartılmasın. Çekimser kalın."
            };
            olayMuzigi.oynat("3/Chapter3_57.mp3");

        } else if (mevcutYol.equals("SERIAT")) {
            this.metin =
                    "Sadrazam:\n" +
                            "Sultanım, Kuva-yi İnzibatiye (Halifelik Ordusu) Anadolu direnişi karşısında eridi bitti.\n" +
                            "Askerler silahlarıyla birlikte Mustafa Kemal'in safına geçiyor.\n" +
                            "Bu orduyu resmen lağvedip rezilliği bitirelim mi, yoksa sonuna kadar direnelim mi?\n";
            this.cevaplar = new String[]{
                    "Daha fazla rezil olmayalım. Orduyu lağvedin. Anadolu kazandı...",
                    "Asla! Son nefer kalana kadar asilerle çarpışılacak. Pes etmek yok!"
            };
            olayMuzigi.oynat("4/Chapter3_57.mp3");

        } else if (mevcutYol.equals("PARCALANMA") || mevcutYol.equals("MANDA")) {
            this.metin =
                    "Antep Müdafaa Heyeti:\n" +
                            "Paşam! Fransızlar şehri kuşattı. Açlıktan kedi köpek yemeye başladık ama teslim olmadık.\n" +
                            "İstanbul hükümeti 'Teslim olun' diyor. Sizden gizli bir emir bekliyoruz.\n" +
                            "Dayanalım mı, yoksa boşuna mı ölüyoruz?\n";
            this.cevaplar = new String[]{
                    "Antep düşerse Anadolu düşer! 'Gazi' olun ama esir olmayın! Direnin!",
                    "Evlatlarım, yardım gönderemiyoruz. Daha fazla can kaybı olmasın, antlaşma yapın."
            };
            olayMuzigi.oynat("5/Chapter3_57.mp3");
        }

        soruSor();

        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int secim = sc.nextInt();
            sc.nextLine();
            olayMuzigi.durdur();

            if (mevcutYol.equals("TARIHSEL")) {
                if (secim == 1) {
                    yesilYaz("\n*** HAKİKATİN KABULÜ ***\n");
                    System.out.println("Mustafa Kemal'in liderliğini kabullendiniz. Bu erdemli davranış subaylar arasında saygı uyandırdı.");
                    System.out.println("Ancak halk 'Enver Paşa artık iddiadan düştü' diye düşündü.");

                    indikatorlerCh3.setAskerMorali(indikatorlerCh3.getAskerMorali() + 1);
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() - 1);
                    indikatorlerCh3.setSubayDestegi(indikatorlerCh3.getSubayDestegi() + 1);
                } else {
                    kirmiziYaz("\n*** BEYHUDE ÇABA ***\n");
                    System.out.println("Sakarya zaferinden sonra Anadolu'ya girmek imkansız hale geldi.");
                    System.out.println("Bu ısrarınız, sizi 'Makam sevdalısı' gibi gösterdi. Subaylar tepkili.");

                    indikatorlerCh3.setAskerMorali(indikatorlerCh3.getAskerMorali() + 2); // Sizin askeriniz sevindi
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() + 1);
                    indikatorlerCh3.setSubayDestegi(indikatorlerCh3.getSubayDestegi() - 1); // Anadolu subayları kızgın
                }

            } else if (mevcutYol.equals("KOMUNIST")) {
                if (secim == 1) {
                    yesilYaz("\n*** İŞÇİ DEMOKRASİSİ ***\n");
                    System.out.println("Üretim düştü ama halk sistemi sevdi. Kaos var ama özgürlük de var.");
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() + 3);
                    indikatorlerCh3.setIkmalDurumu(indikatorlerCh3.getIkmalDurumu() - 2);
                } else {
                    kirmiziYaz("\n*** STALİNİST MODEL ***\n");
                    System.out.println("Fabrikalar saat gibi işliyor ama işçiler mutsuz. Üretim rekor kırdı.");
                    indikatorlerCh3.setIkmalDurumu(indikatorlerCh3.getIkmalDurumu() + 4);
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() - 3);
                }

            } else if (mevcutYol.equals("TURAN")) {
                if (secim == 1) {
                    yesilYaz("\n*** ZORAKİ DOSTLUK ***\n");
                    System.out.println("Beyaz Ruslar Kızılları oyaladı. Zaman kazandık.");
                    indikatorlerCh3.setOrduGucu(indikatorlerCh3.getOrduGucu() + 1);
                } else {
                    yesilYaz("\n*** SAF KAN ***\n");
                    System.out.println("Kendi gücümüzle savaşıyoruz. Kimseye diyet borcumuz yok.");
                    indikatorlerCh3.setAskerMorali(indikatorlerCh3.getAskerMorali() + 2);
                }

            } else if (mevcutYol.equals("CUMHURIYET")) {
                if (secim == 1) {
                    yesilYaz("\n*** MAREŞAL GAZİ ***\n");
                    System.out.println("Mustafa Kemal Paşa Mareşal oldu. Ordu ve millet kenetlendi.");
                    indikatorlerCh3.setSubayDestegi(indikatorlerCh3.getSubayDestegi() + 3);
                } else {
                    kirmiziYaz("\n*** SOĞUKLUK ***\n");
                    System.out.println("Mecliste tartışma çıktı. Zaferin coşkusu gölgelendi.");
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() - 1);
                }

            } else if (mevcutYol.equals("SERIAT")) {
                if (secim == 1) {
                    yesilYaz("\n*** İKİLİK BİTTİ ***\n");
                    System.out.println("Artık tek ordu TBMM ordusu. Saray fiilen teslim oldu.");
                    indikatorlerCh3.setPadisahDestegi(indikatorlerCh3.getPadisahDestegi() - 5);
                } else {
                    kirmiziYaz("\n*** SON ÇIRPINIŞ ***\n");
                    System.out.println("Kuvayi İnzibatiye darmadağın oldu. Rezillik büyüdü.");
                    indikatorlerCh3.setSubayDestegi(indikatorlerCh3.getSubayDestegi() - 4);
                }

            } else { // PARCALANMA veya MANDA
                if (secim == 1) {
                    yesilYaz("\n*** GAZİ ANTEP ***\n");
                    System.out.println("Antep teslim olmadı! Şehir harabe oldu ama onuru kurtuldu.");
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() + 4);
                } else {
                    kirmiziYaz("\n*** KIRIK UMUTLAR ***\n");
                    System.out.println("Antep düştü. Fransız bayrağı çekildi. Anadolu yas tutuyor.");
                    indikatorlerCh3.setAskerMorali(indikatorlerCh3.getAskerMorali() - 3);
                }
            }

        } else {
            olayMuzigi.durdur();
            throw new ArithmeticException("Lütfen sadece sayı giriniz.");
        }
    }
}