package com.mycompany.pewarisanhewan;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Reza
 */
public class Hewan {

    private String namaHewan;
    private int jumlahKaki;
    private String warna;

    public Hewan(String namaHewan, int jumlahKaki, String warna) {
        setNamaHewan(namaHewan);
        setJumlahKaki(jumlahKaki);
        setWarna(warna);
    }

    public String getNamaHewan() {
        return namaHewan;
    }

    public void setNamaHewan(String namaHewan) {
        this.namaHewan = namaHewan;
    }

    public int getJumlahKaki() {
        return jumlahKaki;
    }

    public void setJumlahKaki(int jumlahKaki) {
        this.jumlahKaki = jumlahKaki;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public String berpindahTempat() {
        return "berpindah tempat";
    }

    public String bersuara() {
        return "bersuara";
    }
}
