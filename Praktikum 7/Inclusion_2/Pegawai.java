// Pegawai.java 5/10/23
// Penulis  : Faizal Husain Adiasha
// NIM      : 24060121140115
// Deskripsi: Kelas Pegawai sebagai superclass

public class Pegawai {
    private String nama;
    private int gajiPokok = 5000000;

    void setNama(String nama){
        this.nama = nama;
    }

    void tampilData() {
        System.out.println("Nama : " + this.nama + ", Gaji Pokok: " + this.gajiPokok);
    }
}
