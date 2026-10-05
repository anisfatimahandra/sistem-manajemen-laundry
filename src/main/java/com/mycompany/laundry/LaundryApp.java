/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.laundry;

/**
 *
 * @author Lenovo
 */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
import javax.swing.JOptionPane;

public class LaundryApp extends Pelanggan implements Layanan, Transaksi {

    protected String jenisLayanan;
    protected double berat;
    protected double hargaPerKg;

    public LaundryApp(String nama, String noTelepon,
            String jenisLayanan, double berat, double hargaPerKg) {

        super(nama, noTelepon);

        this.jenisLayanan = jenisLayanan;
        this.berat = berat;
        this.hargaPerKg = hargaPerKg;
    }

    public String getJenisLayanan() {
        return jenisLayanan;
    }

    public void setJenisLayanan(String jenisLayanan) {
        this.jenisLayanan = jenisLayanan;
    }

    public double getBerat() {
        return berat;
    }

    public void setBerat(double berat) {
        if (berat > 0) {
            this.berat = berat;
        } else {
            this.berat = 0;
        }
    }

    public double getHargaPerKg() {
        return hargaPerKg;
    }

    public void setHargaPerKg(double hargaPerKg) {
        this.hargaPerKg = hargaPerKg;
    }

    @Override
    public String getJenisPelanggan() {
        return "Pelanggan Laundry";
    }

    @Override
    public void lakukanLayanan() {
        System.out.println(
                nama + " menggunakan layanan " + jenisLayanan + "."
        );
    }

    @Override
    public void tampilkanInfo() {
        System.out.println(
                "Layanan: " + jenisLayanan
                + " dengan harga Rp" + hargaPerKg + "/Kg"
        );
    }

    @Override
    public double hitungTotal() {
        return berat * hargaPerKg;
    }

    @Override
    public void tampilkanTransaksi() {

        System.out.println("=== DATA LAUNDRY ===");
        System.out.println("Nama          : " + nama);
        System.out.println("No Telepon    : " + noTelepon);
        System.out.println("Jenis Layanan : " + jenisLayanan);
        System.out.println("Berat         : " + berat + " Kg");
        System.out.println("Harga / Kg    : Rp" + hargaPerKg);
        System.out.println("Total Bayar   : Rp" + hitungTotal());
    }

    public double hitungTotal(double diskon) {
        return hitungTotal() - diskon;
    }
}