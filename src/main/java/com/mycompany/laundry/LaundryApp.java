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

public class LaundryApp {

    protected String namaPelanggan;
    protected String jenisLayanan;
    protected double berat;
    protected double hargaPerKg;

    public LaundryApp(String namaPelanggan, String jenisLayanan,
            double berat, double hargaPerKg) {

        this.namaPelanggan = namaPelanggan;
        this.jenisLayanan = jenisLayanan;
        this.berat = berat;
        this.hargaPerKg = hargaPerKg;
    }

    public String getNamaPelanggan() {
        return namaPelanggan;
    }

    public String getJenisLayanan() {
        return jenisLayanan;
    }

    public double getBerat() {
        return berat;
    }

    public double getHargaPerKg() {
        return hargaPerKg;
    }

    public void setNamaPelanggan(String namaPelanggan) {
        this.namaPelanggan = namaPelanggan;
    }

    public void setJenisLayanan(String jenisLayanan) {
        this.jenisLayanan = jenisLayanan;
    }

    public void setBerat(double berat) {

        if (berat > 0) {
            this.berat = berat;

            JOptionPane.showMessageDialog(
                    null,
                    "Berat berhasil diubah menjadi " + berat + " Kg"
            );

        } else {

            JOptionPane.showMessageDialog(
                    null,
                    "Berat tidak valid! Berat harus lebih dari 0 Kg."
            );
        }
    }

    public void setHargaPerKg(double hargaPerKg) {
        this.hargaPerKg = hargaPerKg;
    }

    public double hitungTotal() {
        return berat * hargaPerKg;
    }

    public void tampilkanData() {

        JOptionPane.showMessageDialog(
                null,
                " DATA LAUNDRY \n\n"
                + "Nama Pelanggan : " + getNamaPelanggan() + "\n"
                + "Jenis Layanan  : " + getJenisLayanan() + "\n"
                + "Berat Cucian   : " + getBerat() + " Kg\n"
                + "Harga / Kg     : Rp" + getHargaPerKg() + "\n"
                + "Total Bayar    : Rp" + hitungTotal()
        );
    }
}