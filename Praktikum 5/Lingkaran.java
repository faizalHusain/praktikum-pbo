// Lingkaran.java 29/03/23
// Penulis  : Faizal Husain Adiasha
// NIM      : 24060121140115
// Deskripsi: Kelas Lingkaran yang mengimplementasikan interface IArea
import static java.lang.Math.PI;
class Lingkaran implements IArea {
    private double jejari;

    public Lingkaran(double r) {
        jejari = r;
    }
    public double hitungLuas() {
        return PI * jejari * jejari;
    }
}
