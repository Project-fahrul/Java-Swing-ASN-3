/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.asn3;

/**
 *
 * @author helberindo
 */
public class ASN3 {

    /*
        main method
    */
    public static void main(String[] args) {
        /*
        Membuat koneksi ke database
        */
        Koneksi.getConnection();
        /*
        Memanggil dan menampilkan GUI
        */
        GUI.main(args);
    }
}
