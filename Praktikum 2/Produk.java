/* Program   : Produk.java */
/* Deskripsi : file modul Produk */
/* NIM/Nama  : 24060122120001/Fachryzaidan Akmal */
/* Tanggal   : 29 Februari 2024 */
/***********************************/

public class Produk {

    private String nama;
    private double harga;
    private int stok;
    private String deskripsi;
    private Penjual penjual;


    public Produk(String nama, double harga, int stok, String deskripsi, Penjual penjual) {
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
        this.deskripsi = deskripsi;
        this.penjual = penjual;
    }


    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getHarga() {
        return harga;
    }
	
	public void setHarga(double harga) {
        this.harga = harga;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }
	
	public void getInfoProduk() {
        System.out.println("Nama Produk: " + nama);
        System.out.println("Harga: " + harga);
        System.out.println("Stok: " + stok);
        System.out.println("Deskripsi: " + deskripsi);
		System.out.println("Penjual: " + penjual.getNama());
    }
	
	public Penjual getPenjual() {
        return penjual;
	}

}