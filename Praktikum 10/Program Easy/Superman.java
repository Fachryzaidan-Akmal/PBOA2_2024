/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * File : Superman.java
 * Deskripsi : File mengimplementasikan IFlyer dan meng-extend Animal merepresentasikan
               superman yang bisa terbang
 * @author Zaidan
 */
public class Superman extends Animal implements IFlyer {
    private String nama;

    public Superman(String nama) {
        this.nama = nama;
    }

    public String getName() {
        return nama;
    }

    @Override
    public void fly() {
        System.out.println(nama + " terbang!");
    }

    @Override
    public void eat() {
        System.out.println("Nasi Goreng");
    }
}
