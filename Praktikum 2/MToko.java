/* Program   : MToko.java */
/* Deskripsi : file main Toko */
/* NIM/Nama  : 24060122120001/Fachryzaidan Akmal */
/* Tanggal   : 29 Februari 2024 */
/***********************************/

public class MToko {
    public static void main(String[] args) {
        
		Penjual penjual1 = new Penjual("Jane Doe", "123 Main St", "555-7878");
        
		Produk produk1 = new Produk("Pineapple", 10.99, 100, "Fruit", penjual1);
		
		System.out.println("Info Penjual");
        penjual1.getInfoPenjual();
		System.out.println("\n");
		System.out.println("Info Produk");
        produk1.getInfoProduk();
    }

}