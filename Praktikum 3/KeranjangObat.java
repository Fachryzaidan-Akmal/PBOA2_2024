/*
 Nama 		: Fachryzaidan Akmal
 NIM		: 24060122120001
 File		: KeranjangObat.java
 Deskripsi 	: Program menambahkan obat ke dalam keranjang dan memberikan asersi jika keranjang sudah penuh
 Tanggal 	: 7 Maret 2024
*/

public class KeranjangObat {
    private String[] keranjang;
	private int totalObat;

    public KeranjangObat() {
        keranjang = new String[5];
		totalObat = 0;
    }

    public void tambahObat(String obat) {
        if (totalObat < keranjang.length) {
            keranjang[totalObat] = obat;
            totalObat++;
        } else {
			assert (totalObat < keranjang.length) : "Keranjang sudah penuh";
            System.out.println("Keranjang sudah penuh. Tidak dapat menambahkan obat.");
        }
    }

    public void tampilkanObat() {
        for (int i = 0; i < keranjang.length; i++) {
            System.out.println(keranjang[i]);
        }
    }
}