 package com.mycompany.pewarisanhewan;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Reza
 */
public class Kucing extends Hewan {

    public Kucing(String warna) {
        super("Kucing", 4, warna);
    }

    public String berpindahTempat() {
        return "Kucing berpindah tempat dengan cara berjalan";
    }

    public String bersuara() {
        return "bersuara dengan mengeong";
    }

    public String toString() {
        return getNamaHewan() + ", " + berpindahTempat() + ", "
                + bersuara();
    }
}
