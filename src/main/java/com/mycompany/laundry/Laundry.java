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

        LaundryApp laundry1 = new LaundryApp(
                "Anis",
                "08123456789",
                "Cuci Setrika",
                3,
                10000
        );

        LaundryExpress laundry2 = new LaundryExpress(
                "Tima",
                "08234567890",
                "Express",
                2,
                15000,
                5000
        );

        System.out.println(" LAUNDRY BIASA ");

        laundry1.tampilkanIdentitas();
        laundry1.lakukanLayanan();
        laundry1.tampilkanInfo();
        laundry1.tampilkanTransaksi();

        System.out.println();

        System.out.println(" LAUNDRY EXPRESS ");

        laundry2.tampilkanIdentitas();
        laundry2.lakukanLayanan();
        laundry2.tampilkanInfo();
        laundry2.tampilkanTransaksi();

        System.out.println();

        System.out.println(
                "Total setelah diskon: Rp"
                + laundry1.hitungTotal(5000)
        );
    }
}