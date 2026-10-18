/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.laundry;

public class PembayaranTunai implements Pembayaran {

    @Override
    public void prosesPembayaran(double total) {
        System.out.println(
                "Pembayaran tunai sebesar Rp"
                + total + " berhasil.");
    }
}
