// BangunDatar.java 29/03/23
// Penulis  : Faizal Husain Adiasha
// NIM      : 24060121140115
// Deskripsi: Kelas Abstrak Bangun Datar
public abstract class BangunDatar {
    protected double luas;

    public abstract double hitungLuas(double sisi);

    public void setLuas(double l) {
        luas = l;
    }
    public double getLuas() {
        return luas;
    }
}
