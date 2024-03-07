/*
 Nama 		: Fachryzaidan Akmal
 NIM		: 24060122120001
 File		: MainObat.java
 Deskripsi 	: Program main exception obat
 Tanggal 	: 7 Maret 2024
*/

public class MainObat {
    public static void main(String[] args) {
        // Instansiasi kelas Pembeli dan Obat
        Pembeli pembeli = new Pembeli("Joshua");
        Obat obat1 = new Obat("Paracetamol", true);
        Obat obat2 = new Obat("Amoxicillin", true);
		Obat obat3 = new Obat("Vitamin C", true);
        Obat obat4 = new Obat("Antibiotik", true);
        Obat obat5 = new Obat("Obat Flu", false);
        Obat obat6 = new Obat("Obat Batuk", false);
        Obat obat7 = new Obat("Obat Sakit Kepala", true);

        try {
            pembeli.beliObat(obat1);
            pembeli.beliObat(obat2);
			pembeli.beliObat(obat3);
            pembeli.beliObat(obat4);
			pembeli.beliObat(obat5);
            pembeli.beliObat(obat6);
			pembeli.beliObat(obat7);
        } 
		catch (BatasObatPenuhException e) {
            System.out.println("Tidak dapat membeli obat, " + e.getMessage());
        }
		catch (ObatTidakTersediaException e) {
            System.out.println("Tidak dapat membeli obat, " + e.getMessage());
        }
		 
    }
}