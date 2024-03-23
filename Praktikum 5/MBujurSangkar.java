/*
 Nama 		: Fachryzaidan Akmal
 NIM		: 24060122120001
 File		: MBujurSangkar.java
 Deskripsi 	: Kelas yang mengimplementasikan cara menghitung luas bujur sangkar
 Tanggal 	: 18 Maret 2024
*/

import java.util.Scanner;

class MBujurSangkar{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		BujurSangkar bs = new BujurSangkar();
		System.out.println("Masukkan sisi bujur sangkar: ");
		double sisi = scan.nextDouble();
		System.out.println("Luas bujur sangkar dengan sisi "+sisi+" satuan adalah "+bs.hitungLuas(sisi));
	}
}

/* Pertanyaan :
   apa yang terjadi apablia kelas BujurSangkar tidak membuat implementasi metode abstrak yang ada pada kelas BangunDatar ? jelaskan !
   Jawab :
   Jika kelas BujurSangkar tidak memberikan implementasi untuk metode abstrak yang ada pada kelas BangunDatar, maka akan terjadi kesalahan kompilasi (compile-time error)
*/