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
