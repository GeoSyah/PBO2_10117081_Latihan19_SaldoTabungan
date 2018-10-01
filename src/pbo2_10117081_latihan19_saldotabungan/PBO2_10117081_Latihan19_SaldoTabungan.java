/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2_10117081_latihan19_saldotabungan;

/**
 *
 * @author Geo Syah Alkautsar
 * NIM : 10117081  
 * Kelas : IF2/PBO2
 * Deskripsi Program : Memperlihatkan saldo nasabah setiap bulannya
 */
public class PBO2_10117081_Latihan19_SaldoTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double saldoTabung = 2500000;
        double bungaBulan = 0.15;
        int lamaBulan = 6;
        int i = 1;
        double saldoBulan;
        
        while (i <= lamaBulan) {
            saldoBulan = bungaBulan * saldoTabung;
            saldoTabung = (int) (saldoTabung + saldoBulan);
            System.out.println("Saldo Bulan ke-" + i + " Rp. " + (int) saldoTabung);
         i = i + 1;   
        }
        
    }
    
}
