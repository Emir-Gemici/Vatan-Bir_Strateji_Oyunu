package com.vatan.chapters.ch3;

import com.vatan.core.*;
import java.util.Scanner;

public class Chapter3_23 extends Olay<IndikatorlerCh3> {

    public Chapter3_23() {
        super("", new String[]{});
    }

    @Override
    public void oynat(IndikatorlerCh3 indikatorlerCh3) {
        String mevcutYol = indikatorlerCh3.getOyunYolu();
        MuzikKutusu olayMuzigi = new MuzikKutusu();

        if (mevcutYol.equals("TARIHSEL")) {
            this.metin =
                    "Ahmet İzzet Paşa:\n" +
                            "Enver paşam, ne yazık ki taarruzumuz hezimetle sonuçlandı. Ermeni çeteler bizi arkadan vurdular,\n" +
                            "yetmezmiş gibi kara kışta Ruslar kendilerini iyi savunuyor.\n" +
                            "Orduyu çekmekten başka bir çarem kalmadı paşam, aksi takdirde ortada 3. Ordu kalmayacak...\n";
            this.cevaplar = new String[]{
                    "Sizi zabit yapan Harbiye'nin...",
                    "Geri çekilin Paşa. Daha fazla evlat kaybetmeyelim. Cephe gerisini tahkim edin."
            };
            olayMuzigi.oynat("1/Chapter3_23.mp3");

        } else if (mevcutYol.equals("TURAN")) {
            this.metin =
                    "Kafkas İslam Ordusu Komutanı Nuri Paşa:\n" +
                            "Ağabey! Bakü elimizde, Hazar Denizi'ne atlarımızı sürdük! Rusya darmadağın.\n" +
                            "Ancak Türkistan'daki ceddimizden heyecanlı haberler gelir. Özbek ve Kazak beyleri bizi Semerkant'a davet eder.\n" +
                            "Lakin ordunun ikmali Bakü'de bile zorlanıyor. Hazar'ı geçip Orta Asya'ya yürümek büyük kumar olur. Ne emredersin?\n";
            this.cevaplar = new String[]{
                    "Durmak yok Nuri! Hazar'ı geçin, Semerkant'ta Cuma namazını kılacağız! Büyük Turan kuruluyor!",
                    "Zafer sarhoşu olma Nuri. Bakü ve Azerbaycan'ı elde tutmak kâfidir. Mevzileri güçlendir."
            };
            olayMuzigi.oynat("2/Chapter3_23.mp3");

        } else if (mevcutYol.equals("CUMHURIYET")) {
            this.metin =
                    "Ali Fethi (Okyar) Bey:\n" +
                            "Paşam, savaşa girmeyerek devleti büyük bir yıkımdan kurtardık. Halk size minnettar.\n" +
                            "Lakin Saray ve Padişah yanlıları bu 'Halkçılık' ve 'Cumhuriyet' fısıltılarından rahatsız.\n" +
                            "Meclis-i Mebusan'da yetkilerin Padişah'tan alınıp millete verilmesi teklifini sunarsak iç isyan çıkabilir.\n";
            this.cevaplar = new String[]{
                    "Hakimiyet kayıtsız şartsız milletindir! Teklifi sunun, itiraz eden Paşaları emekliye ayırın.",
                    "Henüz erken Fethi. Padişah'ı ürkütmeyelim, reformları zamana yayalım."
            };
            olayMuzigi.oynat("3/Chapter3_23.mp3");

        } else if (mevcutYol.equals("SERIAT")) {
            this.metin =
                    "Şeyhülislam Efendi:\n" +
                            "Enver Paşa Hazretleri, Hilafet sancağı altında duruşumuz İslam aleminde büyük yankı buldu.\n" +
                            "Lakin ordudaki bazı 'Frenk hayranı' ittihatçı subaylar, şer'i hükümlerin uygulanmasından rahatsızmış.\n" +
                            "Bunların defterinin dürülmesi elzemdir. Ordu, Peygamber ocağına dönmelidir.\n";
            this.cevaplar = new String[]{
                    "Ordu siyasetten ve dinden ari olmalıdır. Subaylarıma dokunmayın!",
                    "Haklısınız Efendi Hazretleri. Dinsiz subayların orduda yeri yoktur. Gereği yapılsın."
            };
            olayMuzigi.oynat("4/Chapter3_23.mp3");

        } else if (mevcutYol.equals("PARCALANMA") || mevcutYol.equals("MANDA")) {
            this.metin =
                    "Yaveriniz:\n" +
                            "Paşam... İngiliz zırhlıları Dolmabahçe önlerine demirledi. Yunan birlikleri İzmir'e çıkmak için hazırlık yapıyor.\n" +
                            "Anadolu'da halk çaresiz. Bazı çeteler dağa çıkıp direniş başlatmak istiyor ama düzenli ordu dağıtıldı.\n" +
                            "İşgal komutanı, silahlarınızı teslim etmenizi emrediyor.\n";
            this.cevaplar = new String[]{
                    "Asla! Silahını teslim edeni ben bizzat vururum! Anadolu'ya geçip çeteleri örgütleyeceğiz.",
                    "Lanet olsun... Yapacak bir şey kalmadı. Teslim oluyoruz."
            };
            olayMuzigi.oynat("5/Chapter3_23.mp3");
        }

        soruSor();

        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int secim = sc.nextInt();
            sc.nextLine();
            olayMuzigi.durdur();

            if (mevcutYol.equals("TARIHSEL")) {
                if (secim == 1) {
                    kirmiziYaz("\n*** BÜYÜK HEZİMET ***\n");
                    System.out.println("Sarıkamış dağlarında on binlerce şehit bıraktık. Rus ordusu Doğu Anadolu'ya giriyor.");

                    indikatorlerCh3.setIkmalDurumu(indikatorlerCh3.getIkmalDurumu() - 3);
                    indikatorlerCh3.setOrduGucu(indikatorlerCh3.getOrduGucu() - 3);
                    indikatorlerCh3.bolgeGuncelle("Kafkas", -5);
                    indikatorlerCh3.setSubayDestegi(indikatorlerCh3.getSubayDestegi() - 2);
                    indikatorlerCh3.setIttifakGucu(indikatorlerCh3.getIttifakGucu() + 2);
                    indikatorlerCh3.setItilafGucu(indikatorlerCh3.getItilafGucu() + 1);
                } else {
                    yesilYaz("\n*** GERİ ÇEKİLME ***\n");
                    System.out.println("Ahmet İzzet Paşa orduyu imhadan kurtardı ama toprak kaybettik.");
                    indikatorlerCh3.bolgeGuncelle("Kafkas", -10);
                    indikatorlerCh3.setOrduGucu(indikatorlerCh3.getOrduGucu() - 1);
                }

            } else if (mevcutYol.equals("TURAN")) {
                if (secim == 1) {
                    yesilYaz("\n*** HEDEF: ÖTÜKEN ***\n");
                    System.out.println("Türk ordusu Hazar'ı aşıyor. Lojistik hatları koptu ama askerin morali göklerde.");
                    indikatorlerCh3.setOrduGucu(indikatorlerCh3.getOrduGucu() - 2);
                    indikatorlerCh3.setAskerMorali(indikatorlerCh3.getAskerMorali() + 3);
                    indikatorlerCh3.setIkmalDurumu(indikatorlerCh3.getIkmalDurumu() - 5);
                } else {
                    yesilYaz("\n*** AZERBAYCAN KALESİ ***\n");
                    System.out.println("Bakü petrolleri güvenceye alındı. Ordumuz güç topluyor.");
                    indikatorlerCh3.setIkmalDurumu(indikatorlerCh3.getIkmalDurumu() + 5);
                    indikatorlerCh3.setOrduGucu(indikatorlerCh3.getOrduGucu() + 2);
                }

            } else if (mevcutYol.equals("CUMHURIYET")) {
                if (secim == 1) {
                    yesilYaz("\n*** DEVRİM KANUNLARI ***\n");
                    System.out.println("Saltanat yanlısı subaylar tasfiye edildi. Halkın bir kısmı şaşkın, aydınlar coşkulu.");
                    indikatorlerCh3.setPadisahDestegi(indikatorlerCh3.getPadisahDestegi() - 10);
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() + 5);
                } else {
                    yesilYaz("\n*** TEMKİNLİ REFORM ***\n");
                    System.out.println("Padişah'ın yetkileri yavaşça kısıtlanıyor. Kriz çıkmadı.");
                    indikatorlerCh3.setPadisahDestegi(indikatorlerCh3.getPadisahDestegi() - 2);
                }

            } else if (mevcutYol.equals("SERIAT")) {
                if (secim == 1) {
                    kirmiziYaz("\n*** ULEMA İLE ÇATIŞMA ***\n");
                    System.out.println("Şeyhülislam bu karara öfkelendi. Medrese talebeleri sokaklara döküldü.");
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() - 3);
                    indikatorlerCh3.setSubayDestegi(indikatorlerCh3.getSubayDestegi() + 2);
                } else {
                    yesilYaz("\n*** ORDUDA ARINMA ***\n");
                    System.out.println("Batı tarzı yaşam süren subaylar ordudan atıldı. Disiplin dini kurallara bağlandı.");
                    indikatorlerCh3.setOrduGucu(indikatorlerCh3.getOrduGucu() - 3);
                    indikatorlerCh3.setPadisahDestegi(indikatorlerCh3.getPadisahDestegi() + 5);
                }

            } else {
                if (secim == 1) {
                    yesilYaz("\n*** MİLLİ MÜCADELE ATEŞİ ***\n");
                    System.out.println("Enver Paşa, Anadolu dağlarına çekildi. Direniş başlıyor!");
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() + 5);
                    indikatorlerCh3.setSavasTehlikesi(5);
                } else {
                    kirmiziYaz("\n*** TESLİMİYET ***\n");
                    System.out.println("Osmanlı ordusu silah bıraktı. Ülke karanlığa gömüldü.");
                    indikatorlerCh3.setOyunDevamEdiyor(false); // ERKEN FİNAL
                }
            }

        } else {
            olayMuzigi.durdur();
            throw new ArithmeticException("Lütfen sadece sayı giriniz.");
        }
    }
}