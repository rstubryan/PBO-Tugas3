/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kelompok;

/**
 *
 * @author ASUS
 */
public class Motor {
    boolean mesinOn = false;
    int kecepatan = 0;
    int persneling = 0;
    
    public void setMesinOn(boolean mesinOn) {
        this.mesinOn = mesinOn;
    }

    public void setKecepatan(int kecepatan) {
        this.kecepatan = kecepatan;
    }

    public void setPersneling(int persneling) {
        this.persneling = persneling;
    }

    public boolean isMesinOn() {
        return mesinOn;
    }

    public int getKecepatan() {
        return kecepatan;
    }

    public int getPersneling() {
        return persneling;
    }
}
