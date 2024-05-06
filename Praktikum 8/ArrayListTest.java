/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package praktikum_8;

/**
 * File : ArrayListTest.java
 * Deskripsi : program penggunaan objek ArrayList sebagai Collection class
 * @author Zaidan
 */
import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();
        // menambah elemen
        strings.add("praktikum");
        strings.add("collecton");
        strings.add("add generics");
        //menghapus elemen
        strings.remove("praktikum");
        //iterasi pada keseluruhan ArrayList
        for(String s : strings){
            System.out.print(s+" ");
            System.out.println(" ");
        }
    }
}
