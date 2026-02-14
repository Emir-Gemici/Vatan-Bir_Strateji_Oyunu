package com.vatan.chapters.ch3;

import com.vatan.core.*;
import java.util.Scanner;

public class Chapter3_07 extends Olay<IndikatorlerCh3> {

    public Chapter3_07() {
        super(
                "Mahmut Şevket Paşa: Enver, aziz evladım... Ordunun harp sonrasındaki hali sana da malumdur elbet.\n" +
                        "Memleketin neredeyse yarısını kaybettik. Ordu da bundan nasibini aldı.\n" +
                        "Duydum ki sen ve senin gibi vatanperver subaylarımızın dışarıda edindiği harici harp ilmi pekala derindir.\n" +
                        "Sizden orduyu yaklaşmakta olan muhtemel savaşa hazırlamanızı istiyorum evladım!\n",
                new String[]{
                        "Paşam, olası harp artık insan değil ateş gücüne dayanacaktır. Buna odaklanmak gerekir.",
                        "Sadrazam Hazretleri, ordumuzun hareket kabiliyeti zorlanmakta. Hızlı hareket edebilen seyyar kuvvetler bizi oldukça rahatlatacaktır.",
                        "Orduda disiplin ve muharebeye istek düşük, Almanlar gibi disipline haiz bir orduya muhtacız Sadrazam Hazretleri!"
                }
        );
    }

    @Override
    public void oynat(IndikatorlerCh3 indikatorlerCh3) {
        MuzikKutusu olayMuzigi = new MuzikKutusu();
        olayMuzigi.oynat("Chapter3_07.mp3");
        soruSor();
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int secim = sc.nextInt();
            sc.nextLine();
            olayMuzigi.durdur();

            if (secim == 1) {
                yesilYaz("\n*** ATEŞ GÜCÜ MODERNİZASYONU ***\n");
                System.out.println("Topçu birlikleri ve makineli tüfek bölükleri artırıldı.");
                System.out.println("Ordunun vuruş gücü yükseldi, Padişah ve Subaylar bu teknolojik atılımdan memnun.");

                indikatorlerCh3.setAskerMorali(indikatorlerCh3.getAskerMorali() + 1);
                indikatorlerCh3.setOrduGucu(indikatorlerCh3.getOrduGucu() + 2);
                indikatorlerCh3.setPadisahDestegi(indikatorlerCh3.getPadisahDestegi() + 3);
                indikatorlerCh3.setSubayDestegi(indikatorlerCh3.getSubayDestegi() + 3);
            }
            else if (secim == 2) {
                yesilYaz("\n*** HAREKET VE İKMAL REFORMU ***\n");
                System.out.println("Lojistik hatları düzeltildi, seyyar jandarma ve süvari birlikleri güçlendirildi.");
                System.out.println("Ordunun manevra kabiliyeti arttı.");

                indikatorlerCh3.setAskerMorali(indikatorlerCh3.getAskerMorali() + 1);
                indikatorlerCh3.setIkmalDurumu(indikatorlerCh3.getIkmalDurumu() + 2);
                indikatorlerCh3.setOrduGucu(indikatorlerCh3.getOrduGucu() + 2);
                indikatorlerCh3.setPadisahDestegi(indikatorlerCh3.getPadisahDestegi() + 3);
                indikatorlerCh3.setSubayDestegi(indikatorlerCh3.getSubayDestegi() + 3);
            }
            else if (secim == 3) {
                yesilYaz("\n*** ALMAN EKOLÜ VE DİSİPLİN ***\n");
                System.out.println("Alman askeri heyeti (Liman von Sanders) davet edildi.");
                System.out.println("Orduya Prusya disiplini getirildi. Almanya ile ilişkiler güçlendi.");

                indikatorlerCh3.setAskerMorali(indikatorlerCh3.getAskerMorali() + 3);
                indikatorlerCh3.setIkmalDurumu(indikatorlerCh3.getIkmalDurumu() + 2);
                indikatorlerCh3.setIttifakIliskisi(indikatorlerCh3.getIttifakIliskisi() + 2);
                indikatorlerCh3.setOrduGucu(indikatorlerCh3.getOrduGucu() + 2);
                indikatorlerCh3.setPadisahDestegi(indikatorlerCh3.getPadisahDestegi() + 3);
                indikatorlerCh3.setSubayDestegi(indikatorlerCh3.getSubayDestegi() + 3);
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