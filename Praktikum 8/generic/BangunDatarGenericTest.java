// BangunDatarGenericTest.java 5/18/23
// Penulis  : Faizal Husain Adiasha
// NIM      : 24060121140115
// Deskripsi: Driver Bangun Datar Generic
public class BangunDatarGenericTest {
    public static void main(String[] args) {
        // membuat objek Lingkaran
        Lingkaran l = new Lingkaran(2);
        // membuat objek BangunDatarGeneric
        BangunDatarGeneric<Lingkaran> bdg = new BangunDatarGeneric<Lingkaran>();
        bdg.set(l);
        // memanggil method hitungKeliling
        System.out.println("Keliling Lingkaran: " + bdg.hitungKeliling());
        System.out.println("tipe generic: " + bdg.get().getClass().getName());
    }
}