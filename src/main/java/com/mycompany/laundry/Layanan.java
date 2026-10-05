/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.laundry;

/**
 *
 * @author Lenovo
 */
public interface Layanan {

    void lakukanLayanan();

    default void tampilkanInfo() {
        System.out.println("Informasi layanan belum tersedia.");
    }
}
