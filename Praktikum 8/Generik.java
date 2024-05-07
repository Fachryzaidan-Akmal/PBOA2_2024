/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package praktikum_8;

/**
 * File : Generik.java
 * Deskripsi : Program implementasi polimerfisme menggunakan kelas generik Data<T> untuk menyimpan objek dari jenis kupu-kupu
 * @author Zaidan
 */

class Kupu {
    void gerak() {}
}

class Ulat extends Kupu {
    void gerak() {
        System.out.println("Ulat merayap");
    }
}

class Kepompong extends Kupu {
    void gerak() {
        System.out.println("Kepompong diam");
    }
}

class KupuDewasa extends Kupu {
    void gerak() {
        System.out.println("Kupu-kupu terbang");
    }
}

class Data<T> {
    private T isi;

    T getIsi() {
        return this.isi;
    }

    void setIsi(T x) {
        this.isi = x;
    }
}

public class Generik {
    public static void main(String[] args) {
        Ulat K = new Ulat();
        Kepompong A = new Kepompong();
        KupuDewasa B = new KupuDewasa();
        Data<Kupu> anu = new Data<>();

        anu.setIsi(K);
        anu.getIsi().gerak();
        
        anu.setIsi(A);
        anu.getIsi().gerak();
        
        anu.setIsi(B);
        anu.getIsi().gerak();
    }
    
}
