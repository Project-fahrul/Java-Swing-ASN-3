/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.asn3;

/**
 *
 * @author helberindo
 */
public class Mesin {
    public int jumlahSilinder, kapasitasSilinder;
    
    public Mesin(int jumlahSilinder, int kapasitasSilinder){
        this.jumlahSilinder = jumlahSilinder;
        this.kapasitasSilinder = kapasitasSilinder;
    }

    Mesin() {
       jumlahSilinder = 0;
       kapasitasSilinder = 0;
    }
    
    public void setJumlahSilinder(int jumlahSilinder){
        this.jumlahSilinder = jumlahSilinder;
    }
    
    public int getJumlahSilinder(){
        return jumlahSilinder;
    }
    
    public void setKapasitasSilinder(int kapasitasSilinder){
        this.kapasitasSilinder = kapasitasSilinder;
    }
    
    public int getKapasitasSilinder(){
        return kapasitasSilinder;
    }
}
