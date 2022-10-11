/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

/**
 *
 * @author ASUS
 */
public class Mahasiswa {
    String nim;
    String nama;
    int nilai;
    String grade;

    
    public Mahasiswa(String nim, String nama, int nilai) {
        this.nim = nim;
        this.nama = nama;
        this.nilai = nilai;
    }

    
    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNilai(int nilai) {
        this.nilai = nilai;
    }

    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public int getNilai() {
        return nilai;
    }
    
    public String getGrade(){
        if(getNilai()>=80 && getNilai()<=100){
            return "A";
        }
        else if(getNilai()>=70 && getNilai()<=79){
            return "B";
        }
        else if(getNilai()>=60 && getNilai()<=69){
            return "C";
        }
        else if(getNilai()>=50 && getNilai()<=59){
            return "D";
        }
        else if(getNilai()>=0 && getNilai()<=49){
            return "E";
        }
        return "Inputan salah ";
    }
    
    public void infoMahasiswa(){
        System.out.println("////////////////////////////");
        System.out.println("NIM : "+nim);
        System.out.println("Nama : "+nama);
        System.out.println("Nilai : "+nilai);
        System.out.println("Grade : "+getGrade());
    }
}
