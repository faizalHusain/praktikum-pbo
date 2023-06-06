// DAOManager.java 6/6/23
// Penulis  : Faizal Husain Adiasha
// NIM      : 24060121140115
// Deskripsi: Kelas Lambda HashMap
import java.util.HashMap;
public class LambdaHashmap {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("24060121140115", "Faizal Husain Adiasha");
        map.put("24060121140063", "Givandra Haikal Adjie");
        map.put("24060121140064", "Hafizh Fadhlurrahman");

        map.forEach((nim, nama) -> System.out.println("NIM :"+ nim + " Nama :"+ nama));
    }
}