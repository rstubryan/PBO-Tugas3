/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class Mobil {
    
    String merk;
    int tahunPembuatan;
    
    Mobil(String merk, int tahunPembuatan) {
        this.merk = merk;
        this.tahunPembuatan = tahunPembuatan;
    }
    
    public void setMerk(String merkM) {
        merk = merkM;
    }

    public void setTahunPembuatan(int tahunPembuatanM) {
        tahunPembuatan = tahunPembuatanM;
    }

    public String getMerk() {
        return merk;
    }

    public int getTahunPembuatan() {
        return tahunPembuatan;
    }
    
    public void infoMobil(){
        System.out.println("Nama mobil : "+getMerk());
        System.out.println("Tahun : "+getTahunPembuatan());
    }


    
    
}
