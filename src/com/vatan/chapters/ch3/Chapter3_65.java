package com.vatan.chapters.ch3;

import com.vatan.core.*;
import java.util.Scanner;

public class Chapter3_65 extends Olay<IndikatorlerCh3> {

    public Chapter3_65() {
        super("", new String[]{});
    }

    @Override
    public void oynat(IndikatorlerCh3 indikatorlerCh3) {
        String mevcutYol = indikatorlerCh3.getOyunYolu();
        MuzikKutusu olayMuzigi = new MuzikKutusu();

        // Ortak Şehadet Metni (Kod tekrarını önlemek ve standartlaştırmak için)
        String kelimeiSehadet = "\n\"Eşhedü en lâ ilâhe illâllâh ve eşhedü enne Muhammeden abdühû ve Resûlüh...\"";

        if (mevcutYol.equals("TARIHSEL")) {
            // FİNAL: ÇEGAN TEPESİ DESTANI
            this.metin =
                    "TARİH: 4 Ağustos 1922 - Kurban Bayramı Sabahı\n" +
                            "YER: Tacikistan, Pamir Dağları, Çegan Tepesi\n\n" +
                            "Korbaşı Ergaş'ın gözlerinde yaşlar var:\n" +
                            "'Paşam! Rus mitralyözleri bayram namazını kana buladı! Etrafımız sarıldı...'\n" +
                            "Doru atınız 'Derviş' şaha kalktı. Kılıcınızı kınından çektiniz.\n" +
                            "Karşınızda binlerce kişilik Kızıl Ordu tümeni, arkanızda sadece 60 sadık süvari...\n" +
                            "Ölüm soğuk değil, vuslat sıcaklığında yüzünüze vuruyor.\n";
            this.cevaplar = new String[]{
                    "Kılıçlar çekilsin! Bugün bayramdır, bugün vuslattır! ALLAH ALLAH! HÜCUM! (Şehadete Yürü)"
            };
            olayMuzigi.oynat("1/Chapter3_65.mp3");

        } else if (mevcutYol.equals("KOMUNIST")) {
            // FİNAL: İHANET VE TÖVBE
            this.metin =
                    "TARİH: 1924 - Moskova, Kremlin Sarayı\n\n" +
                            "Stalin'in zehirli şarabı ciğerlerinizi yakıyor. NKVD ajanları etrafınızı sarmış.\n" +
                            "Yere yığıldınız. Gözleriniz kararıyor.\n" +
                            "Bir ömür 'Kızıl Elma' peşinde koştunuz, 'Kızıl Yıldız'a aldandınız.\n" +
                            "Ama son nefesinizde, üzerinizdeki o kızıl üniformayı ruhunuzdan söküp atıyorsunuz.\n" +
                            "Artık sadece Rabbinizle baş başasınız.\n";
            this.cevaplar = new String[]{
                    "Beni zehirlediniz Stalin! Ama imanımı alamazsınız! (Son Nefesle Şehadet Getir)"
            };
            olayMuzigi.oynat("6/Chapter3_65.mp3");

        } else if (mevcutYol.equals("TURAN")) {
            // FİNAL: ZAFERİN BEDELİ
            this.metin =
                    "TARİH: 1928 - Çin Seddi Önleri\n\n" +
                            "Turan Ordusu, düşman hatlarını yarıp geçti. Zafer Türk'ündür!\n" +
                            "Ancak göğsünüze saplanan o hain ok, ciğerinizi deldi.\n" +
                            "Atınızın üzerinde yavaşça yana eğildiniz. Bütün Asya ayaklarınızın altında.\n" +
                            "Gök Tanrı'ya değil, Alemlerin Rabbine kavuşma vakti.\n" +
                            "Kanınız sancağa damlarken dudaklarınız kıpırdıyor.\n";
            this.cevaplar = new String[]{
                    "Vatan sağ olsun! Gözüm arkada değil... (Şehadet ile Veda)"
            };
            olayMuzigi.oynat("2/Chapter3_65.mp3");

        } else if (mevcutYol.equals("CUMHURIYET")) {
            // FİNAL: GÖREV ŞEHİDİ
            this.metin =
                    "TARİH: 1939 - Ankara, Genelkurmay Başkanlığı\n\n" +
                            "Gece yarısı. Masanızda Hatay haritası açık. Kalbinizdeki ağrı artık dayanılmaz.\n" +
                            "Yıllarca cepheden cepheye koşan bu yorgun beden artık iflas etti.\n" +
                            "Yaveriniz içeri koştuğunda başınızın masaya düştüğünü gördü.\n" +
                            "Son gücünüzü toplayarak parmağınızı göğe kaldırdınız.\n";
            this.cevaplar = new String[]{
                    "Emaneti sahibine teslim etme vakti... (Huzurla Şehadet Getir)"
            };
            olayMuzigi.oynat("3/Chapter3_65.mp3");

        } else if (mevcutYol.equals("SERIAT")) {
            // FİNAL: MABEDİN BEKÇİSİ
            this.metin =
                    "TARİH: 1926 - İstanbul, Ayasofya Meydanı\n\n" +
                            "İşgalci İngiliz askerleri ve içerideki hainler üzerinize ateş açıyor.\n" +
                            "Vücudunuz delik deşik oldu ama sancağı yere düşürmediniz.\n" +
                            "Ayasofya'nın kubbesi son kez çınlıyor sesinizle.\n" +
                            "Bu bir yenilgi değil, bu ebedi bir nöbetin başlangıcıdır.\n";
            this.cevaplar = new String[]{
                    "Dinim, devletim ve milletim için... (Kanlar İçinde Şehadet)"
            };
            olayMuzigi.oynat("4/Chapter3_65.mp3");

        } else if (mevcutYol.equals("PARCALANMA") || mevcutYol.equals("MANDA")) {
            // Fail-safe
            this.metin = "Veda...";
            this.cevaplar = new String[]{"Son"};
        }

        soruSor();

        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int secim = sc.nextInt();
            sc.nextLine();
            olayMuzigi.durdur();

            // KONSOL ÇIKTILARI (EPİLOG)

            if (mevcutYol.equals("TARIHSEL")) {
                kirmiziYaz("\n*** ÇEGAN TEPESİ'NDE BİR YILDIZ KAYDI ***\n");
                System.out.println("Doru atınız Derviş ile Rus saflarının ortasına daldınız.");
                System.out.println("Kılıcınız havada, göğsünüzde Rus kurşunları...");
                System.out.println("Son nefesinizde haykırdınız:");
                yesilYaz(kelimeiSehadet); // ŞEHADETİ YEŞİL VE VURGULU YAZ
                System.out.println("\nPamir Dağları bu sesi yankıladı. Ruhunuz, şehitler kervanına katıldı.");
                System.out.println("\n");
                System.out.println("ENVER PAŞA (1881 - 4 Ağustos 1922)");

            } else if (mevcutYol.equals("KOMUNIST")) {
                kirmiziYaz("\n*** TÖVBE VE ŞEHADET ***\n");
                System.out.println("Zehir tüm vücudunuzu sardı. Kremlin'in soğuk duvarlarına bakarak gülümsediniz.");
                System.out.println("Dudaklarınızdan o mübarek sözler döküldü:");
                yesilYaz(kelimeiSehadet);
                System.out.println("\nStalin dehşet içinde baktı. Çünkü bir Komünist lideri değil, bir Mücahidi öldürdüğünü anladı.");
                System.out.println("ENVER PAŞA (1881 - 1924) | Moskova'da Şehit Edildi.");

            } else if (mevcutYol.equals("TURAN")) {
                kirmiziYaz("\n*** HAKANIN VEDASI ***\n");
                System.out.println("Turan ordusunun zafer naraları arasında gözlerinizi kapattınız.");
                System.out.println("Son sözünüz bir emir değil, bir ikrardı:");
                yesilYaz(kelimeiSehadet);
                System.out.println("\nBütün Asya bozkırları yasa boğuldu. Kurtlar o gece aya uludu.");
                System.out.println("ENVER PAŞA (1881 - 1928) | Turan Başbuğu Şehit Düştü.");

            } else if (mevcutYol.equals("CUMHURIYET")) {
                yesilYaz("\n*** HUZURLU SON ***\n");
                System.out.println("Başınız masadaki Türkiye haritasının, tam da Ankara'nın üzerine düştü.");
                System.out.println("Yaveriniz odaya girdiğinde odada sadece bir fısıltı duyuldu:");
                yesilYaz(kelimeiSehadet);
                System.out.println("\nBir asker doğdunuz, bir asker gibi imanla öldünüz.");
                System.out.println("ENVER PAŞA (1881 - 1939) | Görevi Başında Vefat Etti.");

            } else if (mevcutYol.equals("SERIAT")) {
                kirmiziYaz("\n*** AYASOFYA ŞEHİDİ ***\n");
                System.out.println("Mermiler vücudunuzu parçaladı ama imanınızı sökemedi.");
                System.out.println("Ayasofya'nın mermerlerine kanınızla son mührünüzü vurdunuz:");
                yesilYaz(kelimeiSehadet);
                System.out.println("\nTarih sizi 'Son Osmanlı Kahramanı' olarak yazdı.");
                System.out.println("ENVER PAŞA (1881 - 1926) | İstanbul'da Şehit Düştü.");
            }

            // OYUNU BİTİR
            System.out.println("\n------------------------------------------------");
            System.out.println("    \"Bizler hayalperest değiliz, sadece");
            System.out.println("     hayalleri cihan kadar geniş olanlarız.\"");
            System.out.println("------------------------------------------------");

            indikatorlerCh3.setOyunDevamEdiyor(false);

        } else {
            olayMuzigi.durdur();
            throw new ArithmeticException("Lütfen sadece sayı giriniz.");
        }
    }
}