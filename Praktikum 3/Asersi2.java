/*
 Nama 		: Fachryzaidan Akmal
 NIM		: 24060122120001
 File		: Asersi2.java
 Deskripsi 	: Program untuk demo asersi, yang akan menolak input 
				jari-jari lingkaran yang bernilai nol
 Tanggal 	: 4 Maret 2024
*/

//class Lingkaran
class Lingkaran{
	private double jariJari;
	public Lingkaran(double jariJari){
		this.jariJari = jariJari;
	}
	public double hitungKeliling(){
		double keliling = 2*Math.PI*jariJari;
		return keliling;
	}
}

//class Asersi2
public class Asersi2{
	public static void main(String[] args){
		double jariJari = 0;
		assert(jariJari > 0): "jari-jari tidak boleh nol!!!";
			Lingkaran l = new Lingkaran (jariJari);
			double kelilingLingkaran = l.hitungKeliling();
			System.out.println("keliling lingkaran = "+kelilingLingkaran);
	}
}

/* 
 Pertanyaan : secara konsep, ada yang kurang tepat pada program Asersi2 di atas?
 Jawaban	: Assert statement disini digunakan sebagai validasi input bukan sebagai logika aplikasi 
 */