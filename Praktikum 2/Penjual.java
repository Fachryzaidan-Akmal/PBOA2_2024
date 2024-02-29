/* Program   : Penjual.java */
/* Deskripsi : file modul Penjual */
/* NIM/Nama  : 24060122120001/Fachryzaidan Akmal */
/* Tanggal   : 29 Februari 2024 */
/***********************************/

public class Penjual{
    
    private String nama;
    private String alamat;
    private String nomorTelepon;


    public Penjual(String nama, String alamat, String nomorTelepon) {
        this.nama = nama;
        this.alamat = alamat;
        this.nomorTelepon = nomorTelepon;
    }


    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNomorTelepon() {
        return nomorTelepon;
    }

	public void setNomorTelepon(String nomorTelepon) {
		this.nomorTelepon = nomorTelepon;
    }
	
	public void getInfoPenjual() {
        System.out.println("Nama Penjual: " + nama);
        System.out.println("Alamat: " + alamat);
        System.out.println("Nomor Telepon: " + nomorTelepon);
    }


}