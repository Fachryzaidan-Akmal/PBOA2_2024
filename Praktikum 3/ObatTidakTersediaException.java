/*
 Nama 		: Fachryzaidan Akmal
 NIM		: 24060122120001
 File		: ObatTidakTersediaException.java
 Deskripsi 	: Program menampilkan pesan jika obat tidak tersedia
 Tanggal 	: 7 Maret 2024
*/

public class ObatTidakTersediaException extends Exception {
    public ObatTidakTersediaException() {
        super("Obat tidak tersedia");
    }
}
