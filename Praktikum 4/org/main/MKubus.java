// MKubus.java 15/03/23
// Penulis  : Faizal Husain Adiasha
// NIM      : 24060121140115
// Deskripsi: Driver Main MKubus pada Package main
package org.main;
import org.bangundatar.*;
import org.bangunruang.*;

public class MKubus {
    public static void main(String[] args) {
        BujurSangkar persegi = new BujurSangkar(4);
        Kubus kubus = new Kubus(persegi);
        System.out.println("Volume Kubus : " + kubus.hitungVolume());
        System.out.println("Luas Alas Kubus : " + kubus.hitungLuasAlas());
        
    }
}
