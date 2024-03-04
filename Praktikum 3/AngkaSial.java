/*
 Nama 		: Fachryzaidan Akmal
 NIM		: 24060122120001
 File		: AngkaSial.java
 Deskripsi 	: Program penggunaan exception buatan sendiri
				Pengenalan klausa 'throw' dan 'throws'
 Tanggal 	: 4 Maret 2024
*/

public class AngkaSial{
	public void cobaAngka(int angka) throws AngkaSialException{
		if(angka==13){
			throw new AngkaSialException();
		}
		System.out.println(angka+" bukan angka sial");
	}
	
	public static void main(String[] main){
		AngkaSial as = new AngkaSial();
		try{
			as.cobaAngka(10);
			as.cobaAngka(12);
			as.cobaAngka(13);
		} catch (AngkaSialException ase){
			//method getMessage() telah ada pada kelas "Exception"
			System.out.println(ase.getMessage());
			System.out.println("hati-hati memasukkan angka!!!");
		}
	}
}

/*
 Pertanyaan : Ketika eksepsi terjadi, apakah baris 12 pada AngkaSial.java di atas dieksekusi?
 Jawaban	: Tidak, program akan langsung menampilkan pesan exception
 
 Pertanyaan : Apakah baris 21 pada AngkaSial.java di atas dieksekusi?
 Jawaban	: Iya jika as.cobaAngka memiliki input berupa angka 13
 */