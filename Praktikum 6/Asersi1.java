// Asersi1.java 5/04/23
// Penulis  : Faizal Husain Adiasha
// NIM      : 24060121140115
// Deskripsi: Kelas Asersi 1
public class Asersi1 {
    public static void main(String[] args) {
        int x = 0;
        if(x>0) {
            System.out.println("x bilangan bulat positif");
        } else {
            assert (x<0) : "ada kesalahan kode";
            System.out.println("x bilangan bulat negatif");
        }
    }
}