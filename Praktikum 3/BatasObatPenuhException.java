/*
 Nama 		: Fachryzaidan Akmal
 NIM		: 24060122120001
 File		: BatasObatPenuhException.java
 Deskripsi 	: Program menampilkan pesan jika batas obat sudah tercapai
 Tanggal 	: 7 Maret 2024
*/

public class BatasObatPenuhException extends Exception {
    public BatasObatPenuhException() {
        super("Keranjang obat sudah penuh");
    }
}