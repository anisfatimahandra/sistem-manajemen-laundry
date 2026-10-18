/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */


package com.mycompany.laundry;

import javax.swing.JOptionPane;

public class Laundry {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(
                null, "SISTEM MANAJEMEN LAUNDRY");

        String nama = JOptionPane.showInputDialog(
                "Masukkan nama pelanggan:");
        if (nama == null || nama.trim().isEmpty()) {
            return;
        }

        String telepon = JOptionPane.showInputDialog(
                "Masukkan nomor telepon:");
        if (telepon == null || telepon.trim().isEmpty()) {
            return;
        }

        String[] pilihan = {
            "Cuci Kering", "Cuci Setrika", "Express"
        };

        String layanan = (String) JOptionPane.showInputDialog(
                null,
                "Pilih layanan laundry:",
                "Pilihan Layanan",
                JOptionPane.QUESTION_MESSAGE,
                null,
                pilihan,
                pilihan[0]
        );

        if (layanan == null) {
            return;
        }

        String inputBerat = JOptionPane.showInputDialog(
                "Masukkan berat cucian (Kg):");

        if (inputBerat == null) {
            return;
        }

        double berat;

        try {
            berat = Double.parseDouble(
                    inputBerat.trim().replace(",", "."));

            if (berat <= 0) {
                JOptionPane.showMessageDialog(
                        null, "Berat harus lebih dari 0 Kg.");
                return;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(
                    null, "Berat harus berupa angka.");
            return;
        }

        double harga;
        double biayaExpress = 0;
        LaundryApp pesanan;

        switch (layanan) {
            case "Cuci Kering":
                harga = 7000;
                pesanan = new LaundryApp(
                        nama, telepon, layanan, berat, harga);
                break;

            case "Cuci Setrika":
                harga = 10000;
                pesanan = new LaundryApp(
                        nama, telepon, layanan, berat, harga);
                break;

            default:
                harga = 15000;
                pesanan = new LaundryExpress(
                        nama, telepon, layanan,
                        berat, harga, biayaExpress);
                break;
        }

        double total = pesanan.hitungTotal();

        String rincian =
                " RINCIAN PESANAN LAUNDRY \n\n"
                + "Nama Pelanggan : " + nama + "\n"
                + "No. Telepon    : " + telepon + "\n"
                + "Jenis Layanan  : " + layanan + "\n"
                + "Berat Cucian   : " + berat + " Kg\n"
                + "Harga per Kg   : Rp" + harga + "\n"
                + "Total Bayar    : Rp" + total;

        JOptionPane.showMessageDialog(null, rincian);

        int konfirmasi = JOptionPane.showConfirmDialog(
                null,
                "Proses pembayaran tunai sebesar Rp"
                + total + "?",
                "Pembayaran",
                JOptionPane.YES_NO_OPTION
        );

        if (konfirmasi == JOptionPane.YES_OPTION) {
            Pembayaran pembayaran = new PembayaranTunai();
            pembayaran.prosesPembayaran(total);

            JOptionPane.showMessageDialog(
                    null, "Pembayaran berhasil!");
        }
    }
}
