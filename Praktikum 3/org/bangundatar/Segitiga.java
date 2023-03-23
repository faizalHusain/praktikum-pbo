// Segitiga.java 1/03/23
// Penulis  : Faizal Husain Adiasha
// NIM      : 24060121140115
// Deskripsi: Kelas Segitiga pada Package Bangundatar
package org.bangundatar;
import org.poligon.Poligon;
public class Segitiga extends Poligon {
    private double alas, tinggi;

    public Segitiga(double alas, double tinggi, int jumlahSisi) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.jumlahSisi = jumlahSisi;
    }

    public double hitungLuas() {
        return 0.5 * alas * tinggi;
    }
    public void printInfo() {
        System.out.println("Bangun Segitiga Bersisi " + this.getJumlahSisi());
    }
}
