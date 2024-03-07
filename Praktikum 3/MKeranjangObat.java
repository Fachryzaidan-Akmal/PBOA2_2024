/*
 Nama 		: Fachryzaidan Akmal
 NIM		: 24060122120001
 File		: MKeranjangObat.java
 Deskripsi 	: Program main keranjang obat
 Tanggal 	: 7 Maret 2024
*/

public class MKeranjangObat {
    public static void main(String[] args) {
        KeranjangObat keranjangObat = new KeranjangObat();
        keranjangObat.tambahObat("Paracetamol");
        keranjangObat.tambahObat("Vitamin C");
        keranjangObat.tambahObat("Antibiotik");
        keranjangObat.tambahObat("Obat Flu");
        keranjangObat.tambahObat("Obat Batuk");
        keranjangObat.tambahObat("Obat Sakit Kepala");
        keranjangObat.tampilkanObat();
    }
}