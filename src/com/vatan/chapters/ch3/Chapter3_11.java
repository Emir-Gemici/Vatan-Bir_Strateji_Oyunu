package com.vatan.chapters.ch3;

import com.vatan.core.*;
import java.util.Scanner;

public class Chapter3_11 extends Olay<IndikatorlerCh3> {

    public Chapter3_11() {
        super(
                "Sultan Mehmet Reşad:\n" +
                        "Enver, malum bilirsin ki son vakitlerde tüm cihanı kasıp kavuran bir cihan harbi meydana gelmiştir.\n" +
                        "Bu harpte devlet gemisini düzgün bir şekilde sürebilmek için senin gibi sahada da duran bir komutana danışmam icap eder.\n" +
                        "Sence hangi tarafı tutmalıyız evladım?\n",
                new String[]{
                        "Hünkarım, İtilaf devletleri çok daha güçlü durumda sayılırlar. Bu yüzden İtilaf devletlerini desteklememiz en azından onların bize karşı yapmaya çalıştıkları işgali azaltacaktır.",
                        "Hünkarım, İtilaf Devletleri gözlerini bizim topraklarımıza dikmekteler. Onları desteklememiz onlara boyun eğmek olur. Ne pahasına olursa olsun onlara karşı olmalıyız.",
                        "Hünkarım, bu savaş bizi oldukça yıpratır. Devletimiz zaten yıpranmış durumda. Bu savaşa girmek bizi zora sokar."
                }
        );
    }

    @Override
    public void oynat(IndikatorlerCh3 indikatorlerCh3) {
        MuzikKutusu olayMuzigi = new MuzikKutusu();
        MuzikKutusu olayMuzigi2 = new MuzikKutusu();
        olayMuzigi.oynat("Chapter3_11.mp3");
        olayMuzigi2.oynat("hangisi.mp3",-50);
        soruSor();
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int secim = sc.nextInt();
            sc.nextLine();
            olayMuzigi.durdur();
            olayMuzigi2.durdur();

            indikatorlerCh3.setonBirinciSorudaSecilenSik(secim);

            if (secim == 1) {
                yesilYaz("\n*** İTİLAF YANLISI POLİTİKA ***\n");
                System.out.println("İngiltere ve Fransa'ya yakınlaşma çabası gösterildi. Padişah bu temkinli tavrı onayladı.");
                System.out.println("Ancak halk ve ordu, düşman olarak gördükleri devletlere yanaşılmasından rahatsız.");
                System.out.println("Alman müttefiklerimiz bu duruma tepki gösterdi.");

                indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() - 3);
                indikatorlerCh3.setIttifakGucu(indikatorlerCh3.getIttifakGucu() - 3);
                indikatorlerCh3.setOrduGucu(indikatorlerCh3.getOrduGucu() + 2);
                indikatorlerCh3.setAskerMorali(indikatorlerCh3.getAskerMorali() - 3);
                indikatorlerCh3.setPadisahDestegi(indikatorlerCh3.getPadisahDestegi() + 2);
                indikatorlerCh3.bolgeGuncelle("Edirne", -5);

                indikatorlerCh3.setItilafIliskisi(indikatorlerCh3.getItilafIliskisi() + 5);
                indikatorlerCh3.setIttifakIliskisi(indikatorlerCh3.getIttifakIliskisi() - 5);
            }
            else if (secim == 2) {
                yesilYaz("\n*** HARBE HAZIRLIK VE KARARLILIK ***\n");
                System.out.println("Düşmana boyun eğmeme kararı halkta ve askerde büyük bir heyecan yarattı.");
                System.out.println("Sınır bölgelerindeki hakimiyetimiz perçinlendi ancak ordunun kaynakları zorlanmaya başladı.");

                indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() + 3);
                indikatorlerCh3.setAskerMorali(indikatorlerCh3.getAskerMorali() + 2);
                indikatorlerCh3.setPadisahDestegi(indikatorlerCh3.getPadisahDestegi() - 1);
                indikatorlerCh3.setOrduGucu(indikatorlerCh3.getOrduGucu() - 2);
                indikatorlerCh3.bolgeGuncelle("Edirne", 5);

                indikatorlerCh3.setItilafIliskisi(indikatorlerCh3.getItilafIliskisi() - 5);
                indikatorlerCh3.setIttifakIliskisi(indikatorlerCh3.getIttifakIliskisi() + 5);
            }
            else if (secim == 3) {
                yesilYaz("\n*** TARAFSIZLIK POLİTİKASI ***\n");
                System.out.println("Savaştan uzak durma kararı alındı. Ordu güç topluyor.");
                System.out.println("Ancak pasif kalmak sınır bölgelerindeki nüfuzumuzu zayıflattı.");

                indikatorlerCh3.setHalkDestegi(indikatorlerCh3.getHalkDestegi() + 1);
                indikatorlerCh3.setOrduGucu(indikatorlerCh3.getOrduGucu() + 1);
                indikatorlerCh3.setSavasTehlikesi(indikatorlerCh3.getSavasTehlikesi() - 1);
                indikatorlerCh3.bolgeGuncelle("Edirne", -3);

                indikatorlerCh3.setItilafIliskisi(indikatorlerCh3.getItilafIliskisi() + 2);
                indikatorlerCh3.setIttifakIliskisi(indikatorlerCh3.getIttifakIliskisi() - 2);
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