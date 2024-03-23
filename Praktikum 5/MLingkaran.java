/*
 Nama 		: Fachryzaidan Akmal
 NIM		: 24060122120001
 File		: MLingkaran.java
 Deskripsi 	: Implementasi cara menghitung luas lingkaran
 Tanggal 	: 18 Maret 2024
*/

import java.util.Scanner;

public class MLingkaran{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Masukkan sisi bujur sangkar: ");
		double r = scan.nextDouble();
		Lingkaran l = new Lingkaran(r);
		System.out.println("Luas lingkaran dengan jejari "+r+" satuan adalah "+l.hitungLuas());
	}
}