// MLingkaran.java 29/03/23
// Penulis  : Faizal Husain Adiasha
// NIM      : 24060121140115
// Deskripsi: Kelas Main Lingkaran
import java.util.Scanner;
public class MLingkaran {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan jejari lingkaran: ");
        double jejari = scan.nextDouble();
        Lingkaran lingkaran = new Lingkaran(jejari);
        System.out.println("Luas lingkaran dengan jejari "+jejari+" satuan adalah " + lingkaran.hitungLuas());
    }
}
