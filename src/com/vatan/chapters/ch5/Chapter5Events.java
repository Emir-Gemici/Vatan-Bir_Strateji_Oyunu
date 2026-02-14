package com.vatan.chapters.ch5;

import com.vatan.core.*;
import java.util.Scanner;

public class Chapter5Events extends Olay {
    Scanner sc = new Scanner(System.in);
    public static String[] Events =
            {
                    "Senelik askere alımların ardından Tugayımıza gönderilen yeni er ve erbaşlar görev yerlerine ulaştılar komutanım.\n" +
                            "Ayrıca bu erleri silahlandırmak ve harekatlarımıza devam edebilmemiz için hükümet yeni bir askeri bütçe de geçirdi...\n",

                    "Köylerde ve uzak mezralardaki muhbirlerimiz bize hoş olmayan haberler getirdiler komutanım.\n" +
                            "Bölücü teröristler kontrolümüze alamadığımız köylerden zorla adam kaçırıyor, köylünün erzakına el koyuyor,\n" +
                            "uyuşturucu parası ile de kendine silah ve cephane stokluyor. Halkın bir kısmı da bu duruma çanak tutuyor gibi efendim.\n" +
                            "Bu da halkın arasında hala bölücü eşkıyayı destekleyenler var demek maalesef.\n",

                    "İstihbaratçı Teğmen: \n" +
                            "Komutanım! Irak'taki muhbirlerimiz iyi haberler getirmedi.PKK Saddam'ın yaptıklarını propaganda aracına çevirerek Kuzey Irak'taki Kürtleri kendi amacı için devşiriyor.\n" +
                            "Talabani gibilerin de ses çıkarmaması işi iyice vahim hale sokmuş. Uyuşturucu ve fidyelerle kazandıkları parayla silahlanıyorlar. Ne yazık ki bir şey yapamıyoruz komutanım.\n",

                    "Kurmay Yüzbaşı:\n" +
                            "Komutanım, PKK'lı eşkıya şehir merkezlerine inmiş! Bölücü eşkıya il ve ilçelerde sivil halkı devlete karşı isyana çağırıyor ve bir kısım şimdiden bu hain çağrıya uyarak eylemlere başladı.\n" +
                            "Polis ve jandarma mümkün mertebe müdahale ediyorlar ama bu isyanın tekrarlanması ne yazık ki mümkün duruyor.\n",

                    "Genelkurmay Başkanı Doğan Güreş:\n" +
                            "Görev bölgenizde karşılaştığınız bölücü eşkıyanın güç toplamaya çalıştığı hakkında istihbarat raporları aldık.\n" +
                            "Bu nedenle Hava Kuvvetlerine teröristlerin muhtemel konumlarına saldırı düzenlemesi emrini verdim, umarım yardımcı olabilmişizdir.\n"

            };
    public Chapter5Events(int i)
    {
        super("Yeni Olay!   :\n"+Events[i],new String[] {"Onaylamak için enter a basın"});
    }
    public void oynat(IndikatorlerCh5 indikatorlerCh5, int i) {
        indikatorlerCh5.chapter5DurumYazdir();
        System.out.println(
                "---------------------------------------------\n" +
                        "!!!Planda olmayan bir durum oluştu!!!\n" +
                        "Olayı görüntülemek için Enter'a basın...\n");
        sc.nextLine();
        soruSor();
        sc.nextLine();
        if (i==0){
            indikatorlerCh5.setTskGucu(indikatorlerCh5.getTskGucu() + 1);
            indikatorlerCh5.setHalkDestegi(indikatorlerCh5.getHalkDestegi() + 1);
        }
        if (i==1){
            indikatorlerCh5.setPkkGucu(indikatorlerCh5.getPkkGucu() + 1);
            indikatorlerCh5.setTskGucu(indikatorlerCh5.getTskGucu() - 1);
        }
        if (i==2){
            indikatorlerCh5.setPkkGucu(indikatorlerCh5.getPkkGucu() + 2);
        }
        if(i==3){
            indikatorlerCh5.setHalkDestegi(indikatorlerCh5.getHalkDestegi() - 1);
            indikatorlerCh5.setPkkGucu(indikatorlerCh5.getPkkGucu() + 1);
            indikatorlerCh5.setTskGucu(indikatorlerCh5.getTskGucu() - 1);
        }
        if(i==4){
            indikatorlerCh5.setAskerMorali(indikatorlerCh5.getAskerMorali() + 1);
            indikatorlerCh5.setPkkGucu(indikatorlerCh5.getPkkGucu() - 2);
        }
    }
    @Override
    public void oynat(Object indikatorler) {

    }
}