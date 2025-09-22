/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum5_tugas;

/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args) {
        Kucing kucing = new Kucing();
        System.out.println("--- Informasi Kucing ---");
        kucing.nama = "Miko";
        kucing.jenis = "Persia";
        kucing.suara = "Miaw";
        kucing.tampilkanInfo();
        
        Anjing anjing = new Anjing();
        System.out.println("--- Informasi Anjing ---");
        anjing.nama = "Kely";
        anjing.jenis = "Poodle";
        anjing.suara = "wouk wouk";
        anjing.tampilkanInfo(); 
        
        System.out.println("------------------------");
        
        // Bagian Kendaraan
        Mobil mobil = new Mobil();
        System.out.println("--- Informasi Mobil ---");
        mobil.nama = "Honda Civic";
        mobil.kecepatan = 180;
        mobil.jumlahRoda = 4;  // from KendaraanDarat
        mobil.jumlahPintu = 4;
        mobil.tampilkanInfo();
        
        SepedaMotor motor = new SepedaMotor();
        System.out.println("--- Informasi Motor ---");
        motor.nama = "Yamaha";
        motor.kecepatan = 120;
        motor.jumlahRoda = 2;  // from KendaraanDarat
        motor.jenisMesin = "2-tak";
        motor.tampilkanInfo();     
    }   
}
