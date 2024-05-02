/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LatihanMedium;

/**
 *
 * @author Zaidan
 */
public class KontrolSenjata{
    
    Senjata senjata;
    
    public KontrolSenjata(Senjata senjata){
       this.senjata = senjata;
    }
    
    public boolean isAdaPeluru(){
        return senjata.getPeluru() > 0;
    }
    
    public void isiPeluru(int jumPeluru){
        senjata.setPeluru(jumPeluru);
        System.out.println(">> Peluru berhasil ditambah: "+jumPeluru);
    }
    
    public void menembak(int jumlah) {
        int jumlahPeluru = senjata.getPeluru();
        System.out.println(">> Siap menembak "+jumlah+" kali");
        if (jumlahPeluru == 0){
                System.out.println("Peluru Habis");
        } else {
            for (int i = 0; i < jumlah; i++){
                if (jumlahPeluru > 0){
                    System.out.print(senjata.getBunyi()+" ");
                    System.out.println("");
                    jumlahPeluru--;
                } else {
                    System.out.println("Gagal tembak, Peluru habis");
                }
            }
            System.out.println(">> Sisa peluru: "+jumlahPeluru);
        }
    }
    
    public String menusuk(){
        if(senjata.isMenusuk()){
            return "Jleb! ";
        }
        else {
            return "Gagal, belum pasang bayonet";
        }
    }
    
    public void pasangBayonet(){
        senjata.setMenusuk(true);
        System.out.println("Bayonet Terpasang");
    }
}

