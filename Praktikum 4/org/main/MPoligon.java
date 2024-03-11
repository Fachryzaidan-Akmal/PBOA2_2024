/*
 Nama 		: Fachryzaidan Akmal
 NIM		: 24060122120001
 File		: Poligon.java
 Deskripsi 	: driver class untuk poligon dan persegi panjang
 Tanggal 	: 11 Maret 2024
*/

package org.main;

import org.bangundatar.*;

public class MPoligon{
	public static void main(String[] args){
		PersegiPanjang persegi = new PersegiPanjang(10,10,4);
		persegi.printInfo();
		System.out.println("Luas Persegi Panjang: "+persegi.hitungLuas());
	}
}