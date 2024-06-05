/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc.model;

/**
 * File : Mahasiswa.java
 * Deskripsi : Class untuk objek Mahasiswa dengan atribut id dan nama, 
               serta getter dan setter untuk atribut tersebut
 * @author Zaidan
 */
public class Mahasiswa {
    //atribut
    private int id;
    private String nama;
    
    // Constructor
    public Mahasiswa(){
        
    }
    
    public Mahasiswa(int id, String nama){
        this.id = id;
        this.nama = nama;
    }
    
    // getter adn setter
    public int getId(){
        return id;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public String getNama(){
        return nama;
    }
    
    public void setNama (String nama){
        this.nama = nama;
    }
    
    @Override
    public String toString(){
        return "Mahasiswa {" + "id=" + id + ", nama=" + nama + "}";
    }
} 
