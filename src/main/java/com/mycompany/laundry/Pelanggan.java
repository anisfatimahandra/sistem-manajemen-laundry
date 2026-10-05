/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.laundry;

/**
 *
 * @author Lenovo
 */
public abstract class Pelanggan {

    protected String nama;
    protected String noTelepon;

    public Pelanggan(String nama, String noTelepon) {
        this.nama = nama;
        this.noTelepon = noTelepon;
    }

    public abstract String getJenisPelanggan();

    public void tampilkanIdentitas() {
        System.out.println("Nama       : " + nama);
        System.out.println("No Telepon : " + noTelepon);
        System.out.println("Jenis      : " + getJenisPelanggan());
    }
}
