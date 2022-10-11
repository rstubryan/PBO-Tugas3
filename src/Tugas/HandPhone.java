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
public class HandPhone {
    String jenis_hp;
    int tahun_pembuatan;

    public HandPhone(String jenis_hp, int tahun_pembuatan) {
        this.jenis_hp = jenis_hp;
        this.tahun_pembuatan = tahun_pembuatan;
    }
    
    public void setJenis_hp(String jenis_hp) {
        this.jenis_hp = jenis_hp;
    }

    public void setTahun_pembuatan(int tahun_pembuatan) {
        this.tahun_pembuatan = tahun_pembuatan;
    }

    public String getJenis_hp() {
        return jenis_hp;
    }

    public int getTahun_pembuatan() {
        return tahun_pembuatan;
    }
    
    public void infoHandphone(){
        System.out.println("Nama HP : "+getJenis_hp());
        System.out.println("Tahun : "+getTahun_pembuatan());
    }
    
    /*public static void main(String[] args) {
        HandPhone hp = new HandPhone();
        
        hp.setDataHP("Nokia", 2020);
        
        System.out.println(hp.getJenisHp());
        System.out.println(hp.getTahunPembuatan());
    }*/
    
}
