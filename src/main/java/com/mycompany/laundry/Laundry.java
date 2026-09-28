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
                null,
                " SISTEM MANAJEMEN LAUNDRY "
        );

        String nama = JOptionPane.showInputDialog(
                null,
                "Masukkan nama pelanggan:"
        );

        if (nama == null || nama.trim().isEmpty()) {
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

            if (berat <= 0) {
                JOptionPane.showMessageDialog(
                        null,
                        "Berat harus lebih dari 0 Kg!"
                );
                return;
            }

        } catch (NumberFormatException e) {

            JOptionPane.showMessageDialog(
                    null,
                    "Berat harus berupa angka!"
            );

            return;
        }

        LaundryApp laundry1;

        if (layanan.equals("Express")) {

            laundry1 = new LaundryExpress(
                    nama,
                    layanan,
                    berat,
                    harga,
                    5000
            );

        } else {

            laundry1 = new LaundryApp(
                    nama,
                    layanan,
                    berat,
                    harga
            );
        }

        JOptionPane.showMessageDialog(
                null,
                "Data melalui Getter:\n\n"
                + "Nama : " + laundry1.getNamaPelanggan() + "\n"
                + "Layanan : " + laundry1.getJenisLayanan() + "\n"
                + "Berat : " + laundry1.getBerat() + " Kg"
        );

        laundry1.tampilkanData();
    }
}