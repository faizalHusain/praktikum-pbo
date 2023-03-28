// MBangungDatar.java 29/03/23
// Penulis  : Faizal Husain Adiasha
// NIM      : 24060121140115
// Deskripsi: Kelas Main Bangun Datar
import java.util.Scanner;

public class MBangunDatar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BujurSangkar bs = new BujurSangkar();
        System.out.print("Masukkan sisi bujur sangkar: ");
        double sisi = scan.nextDouble();
        System.out.println("Luas bujur sangkar dengan sisi " + sisi + " satuan adalah " + bs.hitungLuas(sisi));
    }
}


// Pertanyaan :
// 1. apa yang terjadi apablia kelas BujurSangkar tidak membuat implementasi metode abstrak yang ada pada kelas BangunDatar ? jelaskan ! 

// jawaban :
// akan terjadi error saat mengcompile karena Kelas bujur sangkar tidak mengimplementasi metode abstrak yang ada pada kelas abstarct BangunDatar. 
// sesuai definisi kelas abstrak, setiap kelas yang merupakan pewarisan dari kelas abstrak harus mengimplementasikan 
// semua metode abstrak yang ada pada kelas abstrak tersebut.