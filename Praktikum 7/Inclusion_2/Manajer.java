// Manajer.java 5/10/23
// Penulis  : Faizal Husain Adiasha
// NIM      : 24060121140115
// Deskripsi: Kelas Manajer sebagai subclass

public class Manajer extends Pegawai {
    private int tunjangan = 700000;

    Manajer(String nama) {
        setNama(nama);
    }
    void tampilData() {
        super.tampilData();
        System.out.println("Tunjangan : " + this.tunjangan);
    }
}
