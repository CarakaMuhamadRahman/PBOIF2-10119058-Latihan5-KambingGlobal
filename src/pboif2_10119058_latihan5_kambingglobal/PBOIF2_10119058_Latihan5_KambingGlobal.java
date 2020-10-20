/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2_10119058_latihan5_kambingglobal;

/**
 *
 * @author
 * NAMA     : Caraka Muhamad Rahman
 * KELAS    : PBOIF2
 * NIM      : 10119058
 * Deskripsi Program : Program ini berisi program untuk menghitung jumlah
 *                     kambing global
 */
public class PBOIF2_10119058_Latihan5_KambingGlobal {

// Variabel jumlahKambing menjadi variabel instance    
int jumlahKambing = 88;

// Method untuk menampilkan jumlah kambing
public void getJumlahKambing() {
    System.out.println("Jumlah kambing: " + jumlahKambing);
}

public void tambahKambing() {
    jumlahKambing = jumlahKambing + 5;
    System.out.println("JUmlah kambing setelah ditambah: " +
                        jumlahKambing);
}

    public static void main(String[] args) {
        PBOIF2_10119058_Latihan5_KambingGlobal kambingSusu = new PBOIF2_10119058_Latihan5_KambingGlobal();
        
        // Menampilkan jumlah kambing yang ada saat program pertama x berjalan
        kambingSusu.getJumlahKambing();
        
        // Menambah satu kambing
        kambingSusu.tambahKambing();
        
        // Menampilkan jumlah kambing yang ada
        kambingSusu.getJumlahKambing();
    }
    
}
