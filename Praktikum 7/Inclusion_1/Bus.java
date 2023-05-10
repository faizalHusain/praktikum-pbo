// Bus.java 5/10/23
// Penulis  : Faizal Husain Adiasha
// NIM      : 24060121140115
// Deskripsi: Kelas Bus sebagai subclass

public class Bus extends Vehicle {
    void calRent (int jarak, float harga) {
        float fare=jarak*harga;
        fare=fare-100.00f;
        System.out.println("harga sewa bus = "+fare);
    }
}