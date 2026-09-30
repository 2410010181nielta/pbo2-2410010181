/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.uniska.pbo2.p01;

/**
 *
 * @author ACER
 */
public class KartuMahasiswa {
   

    public static void main(String[] args) {

        // Data mahasiswa
        String nama = "Haura Nielta Azkiya";
        String npm = "2410010181";
        String prodi = "Teknik Informatika";
        int semester = 5;
        String alasan = "Ingin belajar membuat aplikasi";

        // Menampilkan kartu mahasiswa
        System.out.println("================================");
        System.out.println("      KARTU MAHASISWA PBO 2");
        System.out.println("================================");
        System.out.printf("%-10s: %s%n", "Nama", nama);
        System.out.printf("%-10s: %s%n", "NPM", npm);
        System.out.printf("%-10s: %s%n", "Prodi", prodi);
        System.out.printf("%-10s: %d%n", "Semester", semester);
        System.out.printf("%-10s: %s%n", "Alasan", alasan);
        System.out.println("================================");

    }
}
    
