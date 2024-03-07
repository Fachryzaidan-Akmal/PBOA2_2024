/*
 Nama 		: Fachryzaidan Akmal
 NIM		: 24060122120001
 File		: Pembeli.java
 Deskripsi 	: File modul Pembeli.java
 Tanggal 	: 7 Maret 2024
*/

public class Pembeli {
    private String nama;
    private Obat[] keranjangObat;
    private int jumlahObat;

    public Pembeli(String nama) {
        this.nama = nama;
        keranjangObat = new Obat[5];
        jumlahObat = 0;
    }
	
	public String getNama() {
        return nama;
    }

    public Obat[] getKeranjangObat() {
        return keranjangObat;
    }

    public int getJumlahObat() {
        return jumlahObat;
    }

    public void beliObat(Obat obat) throws BatasObatPenuhException, ObatTidakTersediaException {
        try{
			if (jumlahObat >= 5) {
                throw new BatasObatPenuhException();
            }

            if (!obat.isTersedia()) {
                throw new ObatTidakTersediaException();
            }
			obat.setTersedia(false);
			keranjangObat[jumlahObat] = obat;
			jumlahObat++; 
		}
		catch (BatasObatPenuhException e) {
            throw e;
        } 
		catch (ObatTidakTersediaException e) {
            throw e;
        }
	}
}