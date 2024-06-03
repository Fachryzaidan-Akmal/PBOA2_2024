/**
 * File : Main.java
 * Deskripsi : Tugas mengubah notasi ke bahasa java
 */

import java.util.*;

public class  Main{
    private int elemen;
    private List L;

    public static List<Integer> tambahElemen(List<Integer> L, int elemen){
        L.add(elemen);
        return L;
    }

    public static void main(String[] args) {
        List<Integer> L = new ArrayList<>();
        L.add(1);
        L.add(2);
        L.add(3);

        System.out.println("Sebelum menambah elemen: "+ L);

        L = tambahElemen(L, 4);

        System.out.println("Setelah menambah elemen: " + L);
    }

}
