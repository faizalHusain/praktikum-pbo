// BujurSangkar.java 8/03/23
// Penulis  : Faizal Husain Adiasha
// NIM      : 24060121140115
// Deskripsi: Kelas Bujur Sangkar pada Package Bangundatar
package org.bangundatar;

import org.poligon.Poligon;
public class BujurSangkar extends Poligon{
    private double panjangSisi;

    public BujurSangkar(double panjangSisi) {
        this.panjangSisi = panjangSisi;
        this.jumlahSisi = 4;
    }

    public double hitungLuas() {
        return this.panjangSisi * this.panjangSisi;
    }

    public double getPanjangSisi() {
        return this.panjangSisi;
    }
}
