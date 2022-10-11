/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

/**
 *
 * @author ASUS
 */
public class HandPhoneP {
    public static void main(String[] args) {
        HandPhone HP1 = new HandPhone("IPONG X",2039);
        HandPhone HP2 = new HandPhone("IPONG XX",2088);
        
        /*mobil1.setMerk("BMW");
        mobil2.setMerk("Mazda");
        
        mobil1.setTahunPembuatan(2000);
        mobil2.setTahunPembuatan(1000);
        
        System.out.println(mobil1.getMerk());
        System.out.println(mobil1.getTahunPembuatan());
        
        System.out.println(mobil2.getMerk());
        System.out.println(mobil2.getTahunPembuatan());*/
        
        System.out.println("//////////////////////////////");
        HP1.infoHandphone();
        System.out.println("//////////////////////////////");
        HP2.infoHandphone();
    }
}
