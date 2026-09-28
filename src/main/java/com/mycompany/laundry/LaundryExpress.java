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

    public LaundryExpress(String namaPelanggan, String jenisLayanan,
            double berat, double hargaPerKg, double biayaExpress) {

        super(namaPelanggan, jenisLayanan, berat, hargaPerKg);

        this.biayaExpress = biayaExpress;
    }

    public double getBiayaExpress() {
        return biayaExpress;
    }

    public void setBiayaExpress(double biayaExpress) {
        this.biayaExpress = biayaExpress;
    }

    public double hitungTotalExpress() {
        return hitungTotal() + biayaExpress;
    }

    @Override
    public void tampilkanData() {

        JOptionPane.showMessageDialog(
                null,
                " DATA LAUNDRY EXPRESS \n\n"
                + "Nama Pelanggan : " + getNamaPelanggan() + "\n"
                + "Jenis Layanan  : " + getJenisLayanan() + "\n"
                + "Berat Cucian   : " + getBerat() + " Kg\n"
                + "Harga / Kg     : Rp" + getHargaPerKg() + "\n"
                + "Biaya Express  : Rp" + getBiayaExpress() + "\n"
                + "Total Bayar    : Rp" + hitungTotalExpress()
        );
    }
}