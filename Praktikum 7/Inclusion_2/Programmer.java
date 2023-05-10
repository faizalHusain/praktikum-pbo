// Programmer.java 5/10/23
// Penulis  : Faizal Husain Adiasha
// NIM      : 24060121140115
// Deskripsi: Kelas Programmer sebagai subclass

public class Programmer extends Pegawai {
    private int bonus = 450000;

    Programmer(String nama) {
        setNama(nama);
    }
    void tampilData() {
        super.tampilData();
        System.out.println("Bonus : " + this.bonus);
    }
}
