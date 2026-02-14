package com.vatan.chapters.ch3;

import com.vatan.core.*;
import java.util.Random;
import java.util.Scanner;

public class Chapter3_05 extends Olay<IndikatorlerCh3> {

    public Chapter3_05() {
        super(
                "Saha Komutanı: Paşam, yine Balkanlarda patlak veren 2. muharebeyi duymuşsunuzdur.\n" +
                        "Bu muharebeye şimdilik dahil olmasak da ordunuzla beraber dahil olmalı mıyız?\n",
                new String[]{
                        "Bu muharebeye dahil olmamız durumunda zaten güçsüz olan ordu iyice güçsüzleşebilir. O yüzden savaşa dahil olmamak daha mantıklı.",
                        "Hazır bu denli bir karışıklık varken bundan faydalanmamız daha makuldür.",
                        "Bu karışıklıktan elbet faydalanacağız ancak çok saldırgan olup da büyük devletlerin dikkatini çekmek yerine ufak toprakları ele geçirerek ilerleyebiliriz."
                }
        );
    }

    @Override
    public void oynat(IndikatorlerCh3 indikatorlerCh3) {
        MuzikKutusu olayMuzigi = new MuzikKutusu();
        olayMuzigi.oynat("Chapter3_05.mp3");
        soruSor();
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int secim = sc.nextInt();
            sc.nextLine();
            olayMuzigi.durdur();

            if (secim == 1) {
                yesilYaz("\n*** İHTİYATLI BEKLEYİŞ ***\n");
                System.out.println("Balkan devletleri birbirini yerken biz savunma hatlarımızı güçlendirdik.");
                System.out.println("Asker dinlendi ve moral buldu ancak genç subaylar bu pasiflikten hoşnut değil.");

                indikatorlerCh3.setAskerMorali(indikatorlerCh3.getAskerMorali() + 2);
                indikatorlerCh3.bolgeGuncelle("Edirne", -5);
                indikatorlerCh3.setOrduGucu(indikatorlerCh3.getOrduGucu() + 3);
                indikatorlerCh3.setSubayDestegi(indikatorlerCh3.getSubayDestegi() - 2);
                indikatorlerCh3.setBalkanGucu(indikatorlerCh3.getBalkanGucu() - 3);
            }
            else if (secim == 2) {
                yesilYaz("\n*** FIRSAT SALDIRISI ***\n");
                System.out.println("Karışıklıktan faydalanıp ordumuzla hızlıca ilerledik.");
                System.out.println("Edirne önlerine kadar geldik, düşman hazırlıksız yakalandı.");

                indikatorlerCh3.setAskerMorali(indikatorlerCh3.getAskerMorali() + 2);
                indikatorlerCh3.setBalkanGucu(indikatorlerCh3.getBalkanGucu() - 3);
                indikatorlerCh3.bolgeGuncelle("Edirne", 10);
                indikatorlerCh3.setOrduGucu(indikatorlerCh3.getOrduGucu() - 1);
                indikatorlerCh3.setSubayDestegi(indikatorlerCh3.getSubayDestegi() - 2);
            }
            else if (secim == 3) {
                Random zar = new Random();
                int sans = zar.nextInt(100);

                if (sans < 50) {
                    yesilYaz("\n*** SESSİZ İLERLEYİŞ BAŞARILI ***\n");
                    System.out.println("Büyük devletleri ürkütmeden bazı sınır köylerini ve Edirne çevresini geri aldık.");
                    System.out.println("Padişah bu kurnaz hamleden memnun.");

                    indikatorlerCh3.bolgeGuncelle("Edirne", 5);
                    indikatorlerCh3.setBalkanGucu(indikatorlerCh3.getBalkanGucu() - 1);
                    indikatorlerCh3.setPadisahDestegi(indikatorlerCh3.getPadisahDestegi() + 1);
                    indikatorlerCh3.setSubayDestegi(indikatorlerCh3.getSubayDestegi() - 2);
                    indikatorlerCh3.setAskerMorali(indikatorlerCh3.getAskerMorali() + 1);
                } else {
                    kirmiziYaz("\n*** DİPLOMATİK KRİZ ***\n");
                    System.out.println("Ufak hareketliliğimiz Büyük Devletlerin (Düvel-i Muazzama) dikkatini çekti ve sert tepki gösterdiler.");
                    System.out.println("Gizli planımız açığa çıktı, Edirne üzerindeki hakimiyetimiz sarsıldı.");

                    indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() - 3);
                    indikatorlerCh3.bolgeGuncelle("Edirne", -10);
                    indikatorlerCh3.setPadisahDestegi(indikatorlerCh3.getPadisahDestegi() - 4);
                    indikatorlerCh3.setSubayDestegi(indikatorlerCh3.getSubayDestegi() - 3);
                }
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