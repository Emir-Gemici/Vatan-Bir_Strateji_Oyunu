package com.vatan.chapters.ch3;

import com.vatan.core.*;
import java.util.Random;
import java.util.Scanner;

public class Chapter3_02 extends Olay<IndikatorlerCh3> {

    public Chapter3_02() {
        super(
                "İttihat ve Terakki İstihbaratçı Subayı (Kuşçubaşı Eşref):\n" +
                        "Enver, hoşgeldin kardeşim ama haberler o kadar hoş değil maalesef. Kumanova'da yenilmiş durumdayız,\n" +
                        "Sırplar ve Bulgarlar akın akın Makedonya üzerine giriyorlar. Prilep tarafında kalan redif alayları güç bela direniyor...\n" +
                        "Yunanlılar taarruz halinde, Selanik düşmüş, Arnavutluk tarafına çekilen kuvvetler kuşatılmış durumda.\n" +
                        "Ordu Edirne'de ve Gelibolu'da kuşatılmış ve Osmanlı ordusu güç bela İstanbul dışında Çatalca'yı savunuyor.\n" +
                        "Anlayacağın Enver, 600 senelik devlet tarihinde hiç bu kadar zorlanmamıştı.\n" +
                        "Nazım Paşa seni Çatalca'ya davet ediyor. Umarım burada bizi kurtarırsın kardeşim...\n",
                new String[]{
                        "Müdafaada kalıp ezileceğimize taarruza kalksanıza! Vurun Bulgar itine!",
                        "Zat-ı Şahane Padişah efendimizi müdafaa etmek için her şeyi yapın. Düşmanı geçirtemeyiz!"
                }
        );
    }

    @Override
    public void oynat(IndikatorlerCh3 indikatorlerCh3) {
        MuzikKutusu olayMuzigi = new MuzikKutusu();
        olayMuzigi.oynat("Chapter3_02.mp3");
        soruSor();
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int secim = sc.nextInt();
            sc.nextLine();
            olayMuzigi.durdur();

            if (secim == 1) {
                Random zar = new Random();
                int sans = zar.nextInt(100);

                if (sans < 40) {
                    yesilYaz("\n*** MUCİZE GERÇEKLEŞTİ! ***\n");
                    System.out.println("Birliklerimiz Bulgar hatlarını yardı! Edirne kuşatması hafifledi.");
                    indikatorlerCh3.setAskerMorali(indikatorlerCh3.getAskerMorali() + 1);
                    indikatorlerCh3.setBalkanGucu(indikatorlerCh3.getBalkanGucu() - 1);
                    indikatorlerCh3.bolgeGuncelle("Edirne", 5);
                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() + 3);
                    indikatorlerCh3.setIkmalDurumu(indikatorlerCh3.getIkmalDurumu() - 1);
                    indikatorlerCh3.setPadisahDestegi(indikatorlerCh3.getPadisahDestegi() - 1);
                    indikatorlerCh3.setOrduGucu(indikatorlerCh3.getOrduGucu() - 2);
                    indikatorlerCh3.setSubayDestegi(indikatorlerCh3.getSubayDestegi() + 2);
                } else {
                    int ihtimal = zar.nextInt(100);
                    if (ihtimal < 50) {
                        kirmiziYaz("\n*** EMRE İTAATSİZLİK VE HÜSRAN ***\n");
                        System.out.println("Nazım Paşa, senin bu fevri çıkışını 'emre itaatsizlik' olarak gördü.");
                        System.out.println("Cephedeki kargaşa sırasında birliklerin koordinasyonu bozuldu.");
                        System.out.println("Senin yüzünden yaşanan zafiyet sonucu Divan-ı Harb'e verildin.");
                        System.out.println("Rütbelerin söküldü. Tarih seni 'Hürriyet Kahramanı' olarak değil,");
                        System.out.println("bir 'Hayalperest Yarbay' olarak, sessizce emekli etti...");
                        indikatorlerCh3.setOyunDevamEdiyor(false);
                    }
                    else {
                        kirmiziYaz("\n*** TAARRUZ BAŞARISIZ ***\n");
                        System.out.println("Düşman tahkimatı çok güçlüydü. Geri çekilmek zorunda kaldık.");
                        System.out.println("Osmanlı Devleti, Londra Mütarekesi'ni imzalamak zorunda kaldı...");
                        indikatorlerCh3.setAskerMorali(indikatorlerCh3.getAskerMorali() + 1);
                        indikatorlerCh3.setBalkanGucu(indikatorlerCh3.getBalkanGucu() - 1);
                        indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() - 2);
                        indikatorlerCh3.setIkmalDurumu(indikatorlerCh3.getIkmalDurumu() - 1);
                        indikatorlerCh3.bolgeGuncelle("Manastır", -25);
                        indikatorlerCh3.setPadisahDestegi(indikatorlerCh3.getPadisahDestegi() - 1);
                        indikatorlerCh3.setOrduGucu(indikatorlerCh3.getOrduGucu() - 2);
                        indikatorlerCh3.bolgeGuncelle("Selanik", -25);
                        indikatorlerCh3.setSubayDestegi(indikatorlerCh3.getSubayDestegi() + 2);
                    }
                }
            }
                else if (secim == 2) {
                kirmiziYaz("\n*** LONDRA MÜTAREKESİ İMZALANDI ***\n");
                System.out.println("Çatalca hattını tuttuk ama Rumeli elden gitti paşam...");
                indikatorlerCh3.setBalkanGucu(indikatorlerCh3.getBalkanGucu() - 2);
                indikatorlerCh3.bolgeGuncelle("Edirne", -10);
                indikatorlerCh3.bolgeGuncelle("Manastır", -25);
                indikatorlerCh3.setPadisahDestegi(indikatorlerCh3.getPadisahDestegi() + 1);
                indikatorlerCh3.bolgeGuncelle("Selanik", -25);
                indikatorlerCh3.setSubayDestegi(indikatorlerCh3.getSubayDestegi() + 2);
            }
                else {
                throw new ArithmeticException("Geçersiz tuşlama yaptınız.");
            }
        }
            else {
            olayMuzigi.durdur();
            throw new ArithmeticException("Lütfen sadece sayı giriniz.");
        }
    }
}