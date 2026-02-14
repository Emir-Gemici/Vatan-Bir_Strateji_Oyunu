package com.vatan.chapters.ch3;

import com.vatan.core.*;
import java.util.Scanner;

public class Chapter3_29 extends Olay<IndikatorlerCh3> {

    public Chapter3_29() {
        super("", new String[]{});
    }

    @Override
    public void oynat(IndikatorlerCh3 indikatorlerCh3) {
        String mevcutYol = indikatorlerCh3.getOyunYolu();
        MuzikKutusu olayMuzigi = new MuzikKutusu();

        if (mevcutYol.equals("TARIHSEL")) {
            this.metin =
                    "Irak Komutanı Halil Kut:\n" +
                            "Enver Paşa, Bağdat kapısından İngilizleri sürmeyi başardığımızı sana söylemek isterim (Selman-ı Pak Zaferi).\n" +
                            "Duyduğum kadarıyla Kara Kışın etkisiyle Ruslara karşı zorlanmaya başlıyormuşsunuz.\n" +
                            "Takviye birlik göndereyim istersen. Buradaki zafer rüzgarı oraya da eser mi?\n";
            this.cevaplar = new String[]{
                    "Çok iyi olur Halil Paşam. Şuan baya ilerledi Ruslar. Onları geri püskürtebilmek için ek takviyeye ihtiyacımız var.",
                    "Halil Paşam, senin cephene İngilizler her an baskın yapabilir. Bu yüzden baskın tehdidi varken böyle bir şey yapmak aklı selim bir hareket olmaz. Yerini sağlamlaştır."
            };
            olayMuzigi.oynat("1/Chapter3_29.mp3");

        } else if (mevcutYol.equals("TURAN")) {
            this.metin =
                    "Keşif Kolu Komutanı:\n" +
                            "Büyük Hakanım! Türkistan'ın kapısı olan Pamir Dağları önümüzde bir duvar gibi yükseliyor.\n" +
                            "Çin sınırındaki Doğu Türkistan'a geçmek için ya bu 'Dünyanın Çatısı'nı aşacağız ki asker telef olabilir,\n" +
                            "Ya da güneyden, İngiliz kontrolündeki Keşmir üzerinden dolaşacağız. Bu da İngilizlerle sıcak çatışma demektir.\n";
            this.cevaplar = new String[]{
                    "Hannibal Alpler'i geçti, biz Pamir'i mi geçemeyeceğiz? Dağları aşıyoruz! Hedef Tanrı Dağları!",
                    "Dağlarda askeri kırdıramam. İngiliz hatlarına saldırın! Gerekirse savaşarak geçeriz ama donarak ölmeyiz."
            };
            olayMuzigi.oynat("2/Chapter3_29.mp3");

        } else if (mevcutYol.equals("CUMHURIYET")) {
            this.metin =
                    "Maarif Vekili:\n" +
                            "Paşam, köylüyü kalkındırmak için 'Köy Enstitüleri' benzeri modern çiftlik mektepleri kurmak istiyoruz.\n" +
                            "Kız ve erkek çocuklar beraber okuyacak, hem ziraat hem sanat öğrenecek.\n" +
                            "Ancak toprak ağaları ve tarikat şeyhleri 'Namus elden gidiyor' diye kara propagandaya başladı.\n";
            this.cevaplar = new String[]{
                    "Cehaletin kökü kazınacak! Mektepleri açın. Engel olmaya çalışanı Jandarma ile susturun.",
                    "Henüz erken. Şimdilik sadece erkek mektepleri açalım, tepkiyi yumuşatalım. Adım adım gidelim."
            };
            olayMuzigi.oynat("3/Chapter3_29.mp3");

        } else if (mevcutYol.equals("SERIAT")) {
            this.metin =
                    "Harbiye Nazırı Vekili:\n" +
                            "Sultanım, erkek nüfusumuz cephelerde eridi. Fabrikalarda ve tarlalarda çalışacak adam kalmadı.\n" +
                            "Kadınların çalışmasına izin verirsek üretim artar, orduya mühimmat gider.\n" +
                            "Lakin Ulema, 'Kadının yeri evidir, erkeklerle karışması haramdır' diye fetva veriyor. Ordu aç mı kalsın?\n";
            this.cevaplar = new String[]{
                    "Zaruretler haramı mübah kılar! Kadınlar tesettüre riayet ederek fabrikalarda çalışacak. Fetvayı ben veriyorum!",
                    "Şeriatın hükmü çiğnenemez. Kadınlar evde kalsın. Gerekirse daha az yeriz, daha az atarız ama harama bulaşmayız."
            };
            olayMuzigi.oynat("4/Chapter3_29.mp3");

        } else if (mevcutYol.equals("PARCALANMA") || mevcutYol.equals("MANDA")) {
            this.metin =
                    "Karakol Cemiyeti (İstanbul):\n" +
                            "Paşam, Galata rıhtımında İtilaf devletlerine ait büyük bir mühimmat deposu tespit ettik.\n" +
                            "Anadolu'nun bu silahlara ihtiyacı var. Bir gece baskınıyla depoyu boşaltıp takalarla kaçırabiliriz.\n" +
                            "Ama yakalanırsak İstanbul'daki yeraltı teşkilatımız tamamen deşifre olur ve yok edilir.\n";
            this.cevaplar = new String[]{
                    "Ya İstiklal Ya Ölüm! O silahlar Anadolu'ya gelecek. Baskın emrini veriyorum!",
                    "Teşkilatı riske atamayız. Şimdilik daha küçük çaplı kaçakçılıkla idare edelim."
            };
            olayMuzigi.oynat("5/Chapter3_29.mp3");
        }

        soruSor();

        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int secim = sc.nextInt();
            sc.nextLine();
            olayMuzigi.durdur();

            if (mevcutYol.equals("TARIHSEL")) {
                if (secim == 1) {
                    yesilYaz("\n*** KAFKASYA'DA NEFES ***\n");
                    System.out.println("Halil Paşa'nın gönderdiği taze kuvvetler Rus ilerleyişini durdurdu.");
                    System.out.println("Doğu cephesi rahatladı ama Irak'ta savunma hattı inceldi.");

                    indikatorlerCh3.setAskerMorali(indikatorlerCh3.getAskerMorali() + 2);
                    indikatorlerCh3.bolgeGuncelle("Irak", -5);
                    indikatorlerCh3.bolgeGuncelle("Kafkas", 10);
                    indikatorlerCh3.setOrduGucu(indikatorlerCh3.getOrduGucu() + 2);
                    indikatorlerCh3.setPadisahDestegi(indikatorlerCh3.getPadisahDestegi() - 2);
                    indikatorlerCh3.setSubayDestegi(indikatorlerCh3.getSubayDestegi() + 2);
                } else {
                    yesilYaz("\n*** BAĞDAT'IN EMNİYETİ ***\n");
                    System.out.println("Askeri Irak'ta tuttuk. İngilizlerin ani bir baskınına karşı hazırlıklıyız.");
                    System.out.println("Ancak Ruslar Doğu'da ilerlemeye devam ediyor.");

                    indikatorlerCh3.setAskerMorali(indikatorlerCh3.getAskerMorali() - 2);
                    indikatorlerCh3.bolgeGuncelle("Irak", 5);
                    indikatorlerCh3.bolgeGuncelle("Kafkas", -5);
                    indikatorlerCh3.setOrduGucu(indikatorlerCh3.getOrduGucu() - 1);
                    indikatorlerCh3.setPadisahDestegi(indikatorlerCh3.getPadisahDestegi() + 2);
                    indikatorlerCh3.setSubayDestegi(indikatorlerCh3.getSubayDestegi() - 2);
                }

            } else if (mevcutYol.equals("TURAN")) {
                if (secim == 1) {
                    yesilYaz("\n*** DÜNYANIN ÇATISI AŞILDI ***\n");
                    System.out.println("Binlerce asker donma tehlikesi geçirdi ama Pamir Dağları aşıldı.");
                    System.out.println("Çin sınırında belirdiğimizde düşman gözlerine inanamadı. Stratejik baskın!");
                    indikatorlerCh3.setOrduGucu(indikatorlerCh3.getOrduGucu() - 2); // Zaiyat var
                    indikatorlerCh3.bolgeGuncelle("Kafkas", 5); // Türkistan etkisi
                    indikatorlerCh3.setAskerMorali(indikatorlerCh3.getAskerMorali() + 3);
                } else {
                    kirmiziYaz("\n*** KEŞMİR CEPHESİ ***\n");
                    System.out.println("İngilizlerle sıcak çatışma çıktı. İlerledik ama çok kan döktük.");
                    System.out.println("Hindistan yolu karıştı.");
                    indikatorlerCh3.setOrduGucu(indikatorlerCh3.getOrduGucu() - 3);
                    indikatorlerCh3.setSavasTehlikesi(indikatorlerCh3.getSavasTehlikesi() + 1);
                }

            } else if (mevcutYol.equals("CUMHURIYET")) {
                if (secim == 1) {
                    yesilYaz("\n*** KÖY ENSTİTÜLERİ IŞIĞI ***\n");
                    System.out.println("Ağaların baskısına rağmen mektepler açıldı. Anadolu aydınlanıyor.");
                    System.out.println("Kız çocukları okulla tanıştı. Halkın bir kısmı tepkili olsa da gelecek parlak.");
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() - 2); // Yobaz tepkisi
                    indikatorlerCh3.setItilafIliskisi(indikatorlerCh3.getItilafIliskisi() + 2); // Batı takdiri
                } else {
                    yesilYaz("\n*** MUHAFAZAKAR EĞİTİM ***\n");
                    System.out.println("Karma eğitim ertelendi. Tepkiler dindi ama reformun ruhu zedelendi.");
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() + 2);
                }

            } else if (mevcutYol.equals("SERIAT")) {
                if (secim == 1) {
                    yesilYaz("\n*** BACIYAN-I RUM RUHU ***\n");
                    System.out.println("Kadınlar fabrikalara girdi. Mermi üretimi iki katına çıktı.");
                    System.out.println("Ulema homurdansa da ordu nefes aldı.");
                    indikatorlerCh3.setIkmalDurumu(indikatorlerCh3.getIkmalDurumu() + 4);
                    indikatorlerCh3.setSubayDestegi(indikatorlerCh3.getSubayDestegi() - 3);
                } else {
                    kirmiziYaz("\n*** ÜRETİM DURDU ***\n");
                    System.out.println("Erkek nüfus yetmiyor, tezgahlar boş kaldı. Cepheye mermi gitmiyor.");
                    indikatorlerCh3.setIkmalDurumu(indikatorlerCh3.getIkmalDurumu() - 4);
                    indikatorlerCh3.setPadisahDestegi(indikatorlerCh3.getPadisahDestegi() + 3);
                }

            } else { // PARCALANMA veya MANDA
                if (secim == 1) {
                    yesilYaz("\n*** KARAKOL CEMİYETİ DESTANI ***\n");
                    System.out.println("Gece yarısı operasyonuyla binlerce tüfek Anadolu'ya kaçırıldı!");
                    System.out.println("Milli Mücadele'nin ateş gücü arttı.");
                    indikatorlerCh3.setOrduGucu(indikatorlerCh3.getOrduGucu() + 3);
                    indikatorlerCh3.setSavasTehlikesi(5);
                } else {
                    kirmiziYaz("\n*** CEPHANESİZ ORDU ***\n");
                    System.out.println("Risk almadık. Teşkilat korundu ama cephedeki asker silahsız kaldı.");
                    indikatorlerCh3.setOrduGucu(indikatorlerCh3.getOrduGucu() - 2);
                }
            }

        } else {
            olayMuzigi.durdur();
            throw new ArithmeticException("Lütfen sadece sayı giriniz.");
        }
    }
}