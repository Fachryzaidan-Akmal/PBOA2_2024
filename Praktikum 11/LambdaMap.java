/**
 * File : LambdaMap.java
 * Deskripsi : Program menampilkan pasangan key dan value dari sebuah Map,
               di mana key adalah NIM dan value adalah nama mahasiswa
               menggunakan ekspresi lambda
 * @author Zaidan
 */
import java.util.HashMap;
import java.util.Map;

public class LambdaMap {
    public static void main(String[] args) {
        Map<String, String> mahasiswaMap = new HashMap<>();
        mahasiswaMap.put("001", "Adi");
        mahasiswaMap.put("003", "Bambang");
        mahasiswaMap.put("007", "Cici");
        mahasiswaMap.put("008", "Didi");
        
        mahasiswaMap.forEach((nim, nama) -> System.out.println(nama + "(" + nim + ")" ));
    }
}
