/*
 Nama 		: Fachryzaidan Akmal
 NIM		: 24060122120001
 File		: Lingkaran.java
 Deskripsi 	: Kelas implementasi IArea brupa cara menghitung luas lingkaran
 Tanggal 	: 18 Maret 2024
*/

import static java.lang.Math.PI;

class Lingkaran implements IArea{
	private double jejari;

	public Lingkaran(double r){
		jejari = r;
	}

	public double hitungLuas(){
		return PI*jejari*jejari;
	}
}