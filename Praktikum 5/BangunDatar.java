/*
 Nama 		: Fachryzaidan Akmal
 NIM		: 24060122120001
 File		: BangunDatar.java
 Deskripsi 	: Kelas abstrak, berisi abstraksi bangun datar
 Tanggal 	: 18 Maret 2024
*/

public abstract class BangunDatar{
	protected double luas;

	public abstract double hitungLuas(double sisi);

	public void setLuas (double l){
		luas = l;
	}
	
	public double getLuas(){
		return luas;
	}
}
