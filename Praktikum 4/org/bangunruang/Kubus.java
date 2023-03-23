// Kubus.java 15/03/23
// Penulis  : Faizal Husain Adiasha
// NIM      : 24060121140115
// Deskripsi: Kelas Kubus pada Package BangunRuang
package org.bangunruang;

import org.bangundatar.BujurSangkar;
public class Kubus{
    private BujurSangkar permukaan;
    public Kubus(BujurSangkar permukaan){
        this.permukaan = permukaan;
    }
    public double hitungVolume() {
        return permukaan.hitungLuas() * permukaan.getPanjangSisi();  
    }

    public double hitungLuasAlas() {
        return permukaan.hitungLuas();
    }
}
