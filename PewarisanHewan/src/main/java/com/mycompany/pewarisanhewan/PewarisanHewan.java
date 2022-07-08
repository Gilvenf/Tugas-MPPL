/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.pewarisanhewan;

/**
 *
 * @author Reza
 */
public class PewarisanHewan {

    public static void main(String[] args) {
        Kucing kucing1 = new Kucing("putih");
        Kucing kucing2 = new Kucing("Hitam");
        
        Burung burung1 = new Burung("Kuning-Hijau");
        Burung burung2 = new Burung("Merah-Kuning");
        
        Ikan ikan1     = new Ikan("Putih-Orange");
        Ikan ikan2     = new Ikan("Hitam-Kuning");
        
        System.out.println("Kucing 1 ---> " + kucing1.toString());
        System.out.println("Kucing 2 ---> " + kucing2.toString());
        
        System.out.println("Burung 1 ---> " + burung1.toString());
        System.out.println("Burung 2 ---> " + burung2.toString());
        
        System.out.println("Ikan 1 ---> "+ ikan1.toString());
        System.out.println("Ikan 2 ---> "+ ikan2.toString());
    }    

}
