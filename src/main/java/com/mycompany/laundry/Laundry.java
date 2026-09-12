/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.laundry;

import javax.swing.JOptionPane;

class Laundryapp {

    // FIELD
    private String namaPelanggan;
    private String jenisLayanan;
    private double berat;
    private double hargaPerKg;

    public Laundryapp(String namaPelanggan, String jenisLayanan,
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
        this.berat = berat;
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

public class Laundry {

    public static void main(String[] args) {

        JOptionPane.showMessageDialog(
                null,
                " SISTEM MANAJEMEN LAUNDRY "
        );

        String nama = JOptionPane.showInputDialog(
                null,
                "Masukkan nama pelanggan:"
        );

        if (nama == null) {
            return;
        }

        String[] pilihanLayanan = {
            "Cuci Kering",
            "Cuci Setrika",
            "Express"
        };

        String layanan = (String) JOptionPane.showInputDialog(
                null,
                "Pilih jenis layanan:",
                "Layanan Laundry",
                JOptionPane.QUESTION_MESSAGE,
                null,
                pilihanLayanan,
                pilihanLayanan[0]
        );

        if (layanan == null) {
            return;
        }

        double harga;

        if (layanan.equals("Cuci Kering")) {
            harga = 7000;
        } else if (layanan.equals("Cuci Setrika")) {
            harga = 10000;
        } else {
            harga = 15000;
        }

        String inputBerat = JOptionPane.showInputDialog(
                null,
                "Masukkan berat cucian (Kg):"
        );

        if (inputBerat == null) {
            return;
        }

        double berat;

        try {
            berat = Double.parseDouble(inputBerat);
        } catch (NumberFormatException e) {

            JOptionPane.showMessageDialog(
                    null,
                    "Berat harus berupa angka!"
            );

            return;
        }

        Laundryapp laundry1 = new Laundryapp(
                nama,
                layanan,
                berat,
                harga
        );

        laundry1.tampilkanData();
    }
}