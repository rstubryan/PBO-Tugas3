/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class MobilKampus {
    
    public static void main(String[] args) {
        Mobil mobil1 = new Mobil("ADA",2039);
        Mobil mobil2 = new Mobil("INI",2088);
        
        /*mobil1.setMerk("BMW");
        mobil2.setMerk("Mazda");
        
        mobil1.setTahunPembuatan(2000);
        mobil2.setTahunPembuatan(1000);
        
        System.out.println(mobil1.getMerk());
        System.out.println(mobil1.getTahunPembuatan());
        
        System.out.println(mobil2.getMerk());
        System.out.println(mobil2.getTahunPembuatan());*/
        
        System.out.println("//////////////////////////////");
        mobil1.infoMobil();
        System.out.println("//////////////////////////////");
        mobil2.infoMobil();
    }
    
}
