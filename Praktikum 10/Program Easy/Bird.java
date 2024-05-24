/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * File : Bird.java
 * Deskripsi : File mengimplementasikan IFlyer dan meng-extend Animal 
               merepresentasikan burung
 * @author Zaidan
 */
public class Bird extends Animal implements IFlyer {

    @Override
    public void fly() {
        System.out.println("Burung terbang!");
    }

    @Override
    public void eat() {
        System.out.println("Makanan Burung");
    }
}
