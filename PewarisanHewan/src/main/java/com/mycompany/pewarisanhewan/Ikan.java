package com.mycompany.pewarisanhewan;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Reza
 */
public class Ikan extends Hewan {
    public Ikan (String warna){
        super("Ikan", 0, warna);
    }
    
    public String berpindahTempat(){
        return "Ikan berpindah tempat dengan cara berenang";
    }
    
    public String bersuara(){
        return "Tidak bersuara";
    }
    
    public String toString(){
        return getNamaHewan() + ", " + berpindahTempat() + ", " +
bersuara();
    }
}
