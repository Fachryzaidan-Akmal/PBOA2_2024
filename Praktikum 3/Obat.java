/*
 Nama 		: Fachryzaidan Akmal
 NIM		: 24060122120001
 File		: Obat.java
 Deskripsi 	: File modul Obat.java
 Tanggal 	: 7 Maret 2024
*/

public class Obat {
    private String nama;
    private boolean tersedia;

    public Obat(String nama, boolean tersedia) {
        this.nama = nama;
        this.tersedia = tersedia;
    }

    public String getNama() {
        return nama;
    }

    public boolean isTersedia() {
        return tersedia;
    }

    public void setTersedia(boolean tersedia) {
        this.tersedia = tersedia;
    }
}