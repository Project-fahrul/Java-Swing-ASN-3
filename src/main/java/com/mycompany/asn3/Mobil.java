/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.asn3;

/**
 *
 * @author helberindo
 */
public class Mobil extends Mesin{
    private String bahanBakar;
    private int jumlahKursi;
    
    
    public Mobil(String bahanBakar, int jumlahKursi, int jumlahSilinder, int kapasitasSilinder){
        this.bahanBakar = bahanBakar;
        this.jumlahKursi = jumlahKursi;
        this.jumlahSilinder = jumlahSilinder;
        this.kapasitasSilinder = kapasitasSilinder;
    }

    public Mobil() {
        bahanBakar = "";
        jumlahKursi = 0;
        this.jumlahSilinder = 0;
        this.kapasitasSilinder = 0;
    }
    
    public void setBahanBakar(String bahanBakar){
        this.bahanBakar = bahanBakar;
    }
    
    public String getBahanBakar(){
        return this.bahanBakar;
    }
    
    public void setJumlahKursi(int jumlahKursi){
        this.jumlahKursi = jumlahKursi;
    }
    
    public int getJumlahKursi(){
        return this.jumlahKursi;
    }
}
