package com.mycompany.pewarisanhewan;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Reza
 */
public class Burung extends Hewan {

    public Burung(String warna) {
        super("Burung", 2, warna);
    }

    public String berpindahTempat() {
        return "Burung berpindah tempat dengan cara terbang ";
    }

    public String bersuara() {
        return "bersuara dengan berkicau";
    }

    public String toString() {
        return getNamaHewan() + ", " + berpindahTempat() + ", "
                + bersuara();
    }
}
