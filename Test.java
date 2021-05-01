/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package h6uyg;

/**
 *
 * @author Muhammed
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         System.out.println(Kitap.isbnNedir());
        
        
        Kitap kitap1 = new Kitap("Kitap1","Yazar1","1234");
        Kitap kitap2 = new Kitap("Kitap2","Yazar2","1235");
        Kitap kitap3 = new Kitap("Kitap3","Yazar3","1236");
        System.out.println(kitap1);
        kitap1.setAd("Kitap2");
        System.out.println(kitap1);
        System.out.println(kitap1.isbnNedir());
        System.out.println(Kitap.getkitapSayiyi());
        
//        Raf raf1 = new Raf();
//        raf1.kitapEkle(kitap1);
//        raf1.kitapEkle(kitap2);
//        raf1.kitapEkle(kitap3);
//        raf1.rafGoster();
//        raf1.KitapSilSıraNo(1);
//        raf1.kitapSil(kitap3);
//        raf1.rafGoster();
        Kitap kitap4 = new Kitap("Kitap4","Yazar4","1237");
        Kitap kitap5 = new Kitap("Kitap5","Yazar5","1238");
        Kitap kitap6 = new Kitap("Kitap6","Yazar6","1239");
        Kitaplik kitaplık = new Kitaplik(5);
        
        kitaplık.kitapEkle(kitap3, 0);
        kitaplık.kitapEkle(kitap1, 0);
        kitaplık.kitapEkle(kitap2, 0);
        
        kitaplık.kitapEkle(kitap4, 1);
        kitaplık.kitapEkle(kitap5, 1);
        kitaplık.kitapEkle(kitap6, 2);
        
//        kitaplık.tumRaflariGoster();
        
        kitaplık.kitapSil(0, kitap1);
        kitaplık.kitapSil(1, 1);
        
//        kitaplık.tumRaflariGoster();
        
        System.out.println("----Uyg2----");
        
        kitaplık.kitapEkle(kitap1, 0);
        kitaplık.kitapEkle(kitap1, 0);
        kitaplık.kitapEkle(kitap1, 0);
        
        kitaplık.kitapEkle(kitap1, 1);
        kitaplık.kitapEkle(kitap1, 1);
        kitaplık.kitapEkle(kitap1, 2);
        
//        YetiskinKart kart1 = new YetiskinKart(0,"Ali",50);
        Kart kart1 = new YetiskinKart(0,"Ali",50);
//        OgrenciKart kart2 = new OgrenciKart(1,"Ayşe",50);
        Kart kart2 = new OgrenciKart(1,"Ayşe",50);
//        System.out.println(kart2);
//        kart2.odemeYap(30);
//        System.out.println(kart2);
System.out.println("----------------");
        KitaplikYonetim kitaplıkYonetim = new KitaplikYonetim(kitaplık);
        kitaplıkYonetim.kitapSat(kitap1, kart1);
        kitaplıkYonetim.kitapSat(kitap1, kart1);
        kitaplıkYonetim.kitapSat(kitap1, kart1);
        kitaplıkYonetim.kitapSat(kitap1, kart1);
        kitaplıkYonetim.kitapSat(kitap1, kart1);
        kitaplıkYonetim.kitapSat(kitap1, kart1);
        System.out.println(kart1);

        kitaplıkYonetim.kitapSat(kitap1, kart2);
        kitaplıkYonetim.kitapSat(kitap1, kart2);
        kitaplıkYonetim.kitapSat(kitap1, kart2);
        kitaplıkYonetim.kitapSat(kitap1, kart2);
        kitaplıkYonetim.kitapSat(kitap1, kart2);
        kitaplıkYonetim.kitapSat(kitap1, kart2);
        kitaplıkYonetim.kitapSat(kitap1, kart2);
        kitaplıkYonetim.kitapSat(kitap1, kart2);
        System.out.println(kart2);
    }
    
}
