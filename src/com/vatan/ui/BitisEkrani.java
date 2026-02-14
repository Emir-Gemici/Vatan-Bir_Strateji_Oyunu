package com.vatan.ui;

import com.vatan.core.RenkliYazici;

public class BitisEkrani implements RenkliYazici {
    private void bekle(int milisaniye) {
        try {
            Thread.sleep(milisaniye);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void Chapter3Bitis() {

    }
    public void Chapter5Bitis() {
        fenerYaz("Siz sevgili oyuncular bu oyunu oynarken neredeydiniz, zaman neydi, ne düşünüyordunuz ve oynarken sizi memnun edebildik mi bilmiyoruz fakat biz birkaç Türk genci bunu yaparken\n" +
                "aziz vatanımız bölücü eşkıya PKK ve onun siyasi kuklalarının tehdidini hissediyor ve vatansever duyguları perçinleyici bir içerik üretmek istiyorduk.\n" +
                "Bunun için de kararımızı memleketimizin üzerindeki terör gölgesinin en kesif olduğu dönemde Hakkari Dağ ve Komando Tugayı komutanı emekli General Osman Pamukoğlu'nun\n" +
                "görev süresince vatanı müdafaa ederken yaşadıkları üzerinden yapmak istedik. \n" +
                "Ulu Önder Mustafa Kamal Atatürk'ün emaneti Türkiye Cumhuriyeti'nin bölünmez bütünlüğü için mücadele ederken hayatlarını feda eden\n" +
                "asker, öğretmen, doktor, hemşire, savcı, kaymakam, polis, köy korucusu ve sivil şehitlerimize sesleniyoruz! Mukaddes hatıranızı unutturmayacağız.\n" +
                "İsmini hatırladığımız Aybüke öğretmenimiz ve Necmettin öğretmenimiz, Şehit Savcımız Mehmet Selim Kiraz, kundakta bebekken katledilen Bedirhan Karakaya ve annesi Nurcan Karakaya,\n" +
                "şehadetinden önce içimizi parçalayan görüntülerdeki Semih Özbey, Bingöl-Elazığ yolu üzerinde katledilen 33 neferimiz, Aktütün'de çevreleri sarılmasına rağmen \n" +
                "kendilerinden sayıca fazla olan hain eşkıyaya karşı bu vatan için göğsünü siper ederken şehit düşen 17 neferimiz, Diyarbakır'ın Bismil ilçesinde atandıktan 25 gün sonra\n" +
                "babası ile beraber şehit edilen Neşe öğretmenimiz, TUSAŞ'a yapılan hain saldırıda şehit düşen mühendislerimiz ve burada ismini yazamadığımız ama Türk Milleti'nin\n" +
                "bu vatan için hayatlarını feda ederek şehitler silsilesine altın harflerle geçen aziz şehitlerimiz, size söz veriyoruz! \n" +
                "Bu vatanın her bir karışı şehit kanları ile vatan kılınmıştır. 783 bin 562 kilometrekare üzerinde bir ve bölünmez \n" +
                "Türkiye Cumhuriyeti'nin yetiştirdiği vatanperver birkaç genç olarak\n" +
                "bütün Türk milleti adına size müteşekkir olduğumuzu belirtmek isteriz.\n" +
                "Alparslan'ın bizlere yurt kıldığı, bu iman dolu göğsü olan milletimizin de düşman işgalinden kurtardığı vatanımız için yaptığınız fedakarlık, Aziz Türk Milleti'nin dimağında daima yankılanacaktır. \n" +
                "\n" +
                "Ruhunuz şad, mekanınız cennet olsun.\n" +
                "Saygılarımızla.");
    }
    public void EmegiGecenlerBitis(){
        System.out.println("\n\n");
        maviYaz("===================================");
        sariYaz("      VATAN - YAPIM EKİBİ          ");
        maviYaz("===================================");
        bekle(1000);

        // --- PROJE SAHİBİ ---
        vurguluYaz("\nPROJE YÖNETİCİSİ VE BAŞ YAZILIMCI");
        bekle(1000);
        yesilYaz("Yunus Emir Gemici\n");
        bekle(1000);

        vurguluYaz("\nOYUN TASARIMI VE MEKANİKLER");
        bekle(1000);
        yesilYaz("Yunus Emir Gemici\n");
        bekle(1500);

        // --- SENARYO ---
        vurguluYaz("\nSENARYO VE KURGU");
        bekle(1000);
        yesilYaz("Emir Yiğit Ünleyen\n");
        bekle(1000);
        yesilYaz("Kaan Öztürk\n");
        bekle(1500);

        // --- CAST (SESLENDİRME) ---
        maviYaz("\n===================================");
        vurguluYaz("    SESLENDİRME KADROSU (CAST)     ");
        maviYaz("===================================");
        bekle(1000);

        morYaz("\nEvent Anlatıcısı");
        bekle(800);
        yesilYaz("-> Yunus Emir Gemici\n");
        bekle(1200);

        morYaz("\nTansu Çiller");
        bekle(800);
        yesilYaz("-> Yunus Emir Gemici\n");
        bekle(1200);

        morYaz("\nVeli Küçük");
        bekle(800);
        yesilYaz("-> Yunus Emir Gemici\n");
        bekle(1200);

        morYaz("\nKara Kuvvetleri Komutanı İsmail Hakkı Karadayı");
        bekle(800);
        yesilYaz("-> Yunus Emir Gemici\n");
        bekle(1200);

        morYaz("\nKurmay Yüzbaşı");
        bekle(800);
        yesilYaz("-> Emir Yiğit Ünleyen\n");
        bekle(1200);

        morYaz("\nVali Mehmet Lütfullah Bilgin:");
        bekle(800);
        yesilYaz("-> Emir Yiğit Ünleyen\n");
        bekle(1200);

        morYaz("\nGenelkurmay Başkanı Doğan Güreş");
        bekle(800);
        yesilYaz("-> Yahya Dayıoğlu\n");
        bekle(1200);

        morYaz("\n\"Yeşil\" Mahmut Yıldırım");
        bekle(800);
        yesilYaz("-> Yunus Emre Mergen\n");
        bekle(1200);

        morYaz("\n İstihbaratçı Teğmen");
        bekle(800);
        yesilYaz("-> Barış Eroğlu\n");
        bekle(1200);

        morYaz("\nJandarma Asayiş Komutan Yardımcısı İlker Başbuğ");
        bekle(800);
        yesilYaz("-> Eren Dede\n");
        bekle(1200);

        morYaz("\n Hain Terörist Elebaşı Abdullah Öcalan");
        bekle(800);
        yesilYaz("-> Kaan Öztürk\n");
        bekle(1200);

        // --- TEŞEKKÜR ---
        maviYaz("\n===================================");
        vurguluYaz("         ÖZEL TEŞEKKÜRLER          ");
        maviYaz("===================================");
        bekle(1000);

        yesilYaz("\nEfsane Komutan Osman Pamukoğlu\n");
        bekle(1000);
        yesilYaz("Şanlı Türk Silahlı Kuvvetleri\n");
        bekle(2000);

        // --- KAPANIŞ ---
        System.out.println("\n");
        maviYaz("===================================");
        kirmiziYaz("          COPYRIGHT 2026           \n");
        kirmiziYaz("         OYUN SONA ERDİ            \n");
        maviYaz("===================================");

        // Son bir selam duruşu için uzun bekleme
        bekle(3000);
    }
}