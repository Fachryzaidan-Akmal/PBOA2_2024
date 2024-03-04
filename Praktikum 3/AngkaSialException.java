/*
 Nama 		: Fachryzaidan Akmal
 NIM		: 24060122120001
 File		: AngkaSialException.java
 Deskripsi 	: Program eksepsi buatan sendiri, menolak masukan angka 13!
 Tanggal 	: 4 Maret 2024
*/

public class AngkaSialException extends Exception{
	public AngkaSialException(){
		super("jangan memasukkan angka 13 karena angka sial !!!");
	}
}