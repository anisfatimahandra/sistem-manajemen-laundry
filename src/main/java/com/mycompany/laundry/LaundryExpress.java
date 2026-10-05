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
public class LaundryExpress extends LaundryApp {

    private double biayaExpress;

    public LaundryExpress(String nama, String noTelepon,
            String jenisLayanan, double berat,
            double hargaPerKg, double biayaExpress) {

        super(
                nama,
                noTelepon,
                jenisLayanan,
                berat,
                hargaPerKg
        );

        this.biayaExpress = biayaExpress;
    }

    public double getBiayaExpress() {
        return biayaExpress;
    }

    public void setBiayaExpress(double biayaExpress) {
        this.biayaExpress = biayaExpress;
    }

    @Override
    public String getJenisPelanggan() {
        return "Pelanggan Laundry Express";
    }

    @Override
    public void lakukanLayanan() {
        System.out.println(
                nama + " menggunakan layanan Laundry Express."
        );
    }

    @Override
    public double hitungTotal() {
        return (berat * hargaPerKg) + biayaExpress;
    }

    @Override
    public void tampilkanTransaksi() {

        super.tampilkanIdentitas();

        System.out.println("Jenis Layanan : " + jenisLayanan);
        System.out.println("Berat         : " + berat + " Kg");
        System.out.println("Harga / Kg    : Rp" + hargaPerKg);
        System.out.println("Biaya Express : Rp" + biayaExpress);
        System.out.println("Total Bayar   : Rp" + hitungTotal());
    }
}