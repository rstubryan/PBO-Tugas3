/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Mahasiswa21A extends Mahasiswa {
    
    Mahasiswa21A(String nim, String nama, int nilai){
        //super("20210040006","Restu",90);
        super(nim,nama,nilai);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Isikan NIM : ");
        String nim = sc.nextLine();
        
        System.out.print("Isikan Nama : ");
        String nama = sc.nextLine();
        
        System.out.print("Isikan Nilai : ");
        int nilai = Integer.parseInt(sc.nextLine());
        
        Mahasiswa21A asep = new Mahasiswa21A(nim,nama,nilai);
        
        asep.infoMahasiswa();
    }
}
