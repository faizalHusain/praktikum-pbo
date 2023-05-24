// MapTest.java 5/18/23
// Penulis  : Faizal Husain Adiasha
// NIM      : 24060121140115
// Deskripsi: Kelas MapTest menunjukkan penggunaan kelas Map bawaan Java

import java.util.*;
    public class MapTest {
    public static void main(String[] args) { 
        //kunci-> integer, nilai-> string
        Map<Integer, String> map = new HashMap<Integer,String>() ;
        //menempatkan elemen kunci dan nilai
        map.put(1, "satu");
        map.put(2, "dua");
        map.put(3, "tiga");
        map.put(4, "empat");
        map.put(10, "sepuluh");
        map.put(14, "empat belas");
        map.put(15, "lima belas");
        //mengambil elemen pertama
        System.out.println(map.get(1));
        //mengambil keseluruhan kunci sebagai objek collection Set
        Set<Integer> key = map.keySet();
        //bagaimana iterasi untuk mengambil keseluruhan
        // nilai dari kunci ? tulis pada laporan anda!
        // petunjuk : gunakan iterasi seperti program ArrayListTest
        for (Integer i : key) {
            System.out.println("nilai key " + i + ": " + map.get(i));
        }
        // penjelesan :
        // untuk mengambil keseluruhan nilai dari kunci
        // dapat menggunakan perulangan for
        // dengan tipe data Integer
        // dan variabel i sebagai penampung nilai kunci
        // yang akan diambil
        // kemudian gunakan method get() untuk mengambil nilai
        // dari kunci yang disimpan pada variabel i
    }
}
