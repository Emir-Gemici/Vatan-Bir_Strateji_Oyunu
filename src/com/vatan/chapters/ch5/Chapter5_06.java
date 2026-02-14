package com.vatan.chapters.ch5;

import com.vatan.core.*;
import java.util.Scanner;

public class Chapter5_06 extends Olay<IndikatorlerCh5> {
    @Override
    public void oynat(IndikatorlerCh5 indikatorlerCh5) {
        int ucuncuSorudaSecilenSik = indikatorlerCh5.getUcuncuSorudaSecilenSik();
        MuzikKutusu olayMuzigi = new MuzikKutusu();

        if (ucuncuSorudaSecilenSik == 1) {
            this.metin =
                    "Kurmay Yüzbaşı:\n" +
                            "Paşam, terfiniz hayırlı olsun demekle beraber sizlere Ankara'dan gelen yeni haberleri geçmek istiyorum.\n" +
                            "Yeni kabul edilen Kale Planı ile artık devletimiz terörün kaynaklarının kurutularak yok edilmesi gerektiği ve buna ilişkin kararları bizlere iletti.\n" +
                            "Buna göre belli başlı köyleri boşaltmamız ve köylülerin içindeki gizli terör destekçilerinin kolluk kuvvetleri tarafından derdest edilmesi gerekiyor.\n" +
                            "Bir yandan da Irak sınırındaki Balkaya'da teröristlerin Irak kamplarından topladıkları gruplarla bize saldırı planladığını haber aldık.\n" +
                            "Sizce önceliği neye verelim komutanım?\n";
            this.cevaplar =
                    new String[]{
                            "Ankara'nın emirlerini yerine getirin. Eşkıyayı şehire sokmamalıyız.",
                            "Balkaya için hazırlanın. Biz komandoyuz, meskun mahal polisi değil."
                    };
            olayMuzigi.oynat("1/Chapter5_06.mp3");
        } else if (ucuncuSorudaSecilenSik == 2) {
            this.metin =
                    "Başbakan Çiller:\n" +
                            "Tuğgeneral Pamukoğlu, sizi İkiyaka üzerine yaptığınız harekat için tebrik ederim.\n" +
                            "Hain terör örgütünü bu denli sağlam bir darbe vurmanız ve bunu yaparken kayıp vermemeniz milletimizin mevcut terörle mücadele siyasetini benimsemesini sağladı.\n" +
                            "Oluşan olumlu havaya kayıtsız kalmak istemedik ve askeri bütçenin belli bir kısmını komando birliklerimizi silahlandırmaya ayırdık.\n" +
                            "Size gönderdiğimiz ekipmanların yakında ulaşacağını umuyorum. Ama unutmayın, bunun karşılığını da sizden istiyoruz.\n" +
                            "Zira bu denli eğildiğimiz bir konuda başarısız olmanız kötü sonuçlara yol açacaktır...\n";
            this.cevaplar =
                    new String[]{
                            "Sayın Başbakan, müsterih olunuz. Hain eşkıyanın sonunu getireceğime söz veriyorum!"
                    };
            olayMuzigi.oynat("2/Chapter5_06.mp3", 2.0f);
        } else if (ucuncuSorudaSecilenSik == 3) {
            this.metin =
                    "Jandarma Albay Veli Küçük:\n" +
                            "Paşam, muhakkak kendinize bu jandarma albayı neden beni aradı diye soruyorsunuzdur ancak paşam sizi tebrik etmeyi kendime vazife bilirim.\n" +
                            "İkiyaka'nın ardından Ankara'da bazı sesler homurdansa da JİTEM olarak sizin teröre karşı nefes aldırmayan tavrınıza hayran kaldık.\n" +
                            "Paşam, size bir teklifte bulunmak istiyorum: müsaade edin size terörle mücadelede yardım edelim. Meskun mahalleri biz kollarken dağları temizlemek hem daha kolay olacaktır.\n";
            this.cevaplar =
                    new String[]{
                            "Gölgelerin içinde kalanlarla işim olmaz. Teşekkürler Albayım ama hayır, kalsın.",
                            "Aslında Albay…neden olmasın? Lütfen temasta kalalım."
                    };
            olayMuzigi.oynat("3/Chapter5_06.mp3", 2.0f);
        }

        soruSor();

        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int secim = sc.nextInt();
            sc.nextLine();
            olayMuzigi.durdur();

            if (secim == 1) {
                if (ucuncuSorudaSecilenSik == 1) {
                    indikatorlerCh5.setAnkaraDestegi(indikatorlerCh5.getAnkaraDestegi() + 1);
                    indikatorlerCh5.setHalkDestegi(indikatorlerCh5.getHalkDestegi() - 1);
                    indikatorlerCh5.setPkkGucu(indikatorlerCh5.getPkkGucu() - 1);
                } else if (ucuncuSorudaSecilenSik == 2) {
                    indikatorlerCh5.setAnkaraDestegi(indikatorlerCh5.getAnkaraDestegi() + 1);
                    indikatorlerCh5.setTskGucu(indikatorlerCh5.getTskGucu() + 1);
                } else if (ucuncuSorudaSecilenSik == 3) {
                    indikatorlerCh5.setHalkDestegi(indikatorlerCh5.getHalkDestegi() + 1);
                    indikatorlerCh5.setKurmayDestegi(indikatorlerCh5.getKurmayDestegi() - 1);
                }
            } else if (secim == 2) {
                if (ucuncuSorudaSecilenSik == 1) {
                    indikatorlerCh5.setAskerMorali(indikatorlerCh5.getAskerMorali() + 1);
                    indikatorlerCh5.setKurmayDestegi(indikatorlerCh5.getKurmayDestegi() + 1);
                    indikatorlerCh5.setTskGucu(indikatorlerCh5.getTskGucu() + 2);
                } else if (ucuncuSorudaSecilenSik == 2) {
                    throw new AssertionError("Geçersiz tuşlama yaptınız.");
                } else if (ucuncuSorudaSecilenSik == 3) {
                    indikatorlerCh5.setHalkDestegi(indikatorlerCh5.getHalkDestegi() - 2);
                    indikatorlerCh5.setKurmayDestegi(indikatorlerCh5.getKurmayDestegi() + 2);
                    indikatorlerCh5.setPkkGucu(indikatorlerCh5.getPkkGucu() + 1);
                }
            } else {
                throw new ArithmeticException("Geçersiz tuşlama yaptınız.");
            }
        } else {
            olayMuzigi.durdur();
            throw new ArithmeticException("Lütfen sadece sayı giriniz.");
        }
    }
}