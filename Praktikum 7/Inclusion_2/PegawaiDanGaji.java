// PegawaiDanGaji.java 5/10/23
// Penulis  : Faizal Husain Adiasha
// NIM      : 24060121140115
// Deskripsi: Kelas Pegawai dan Gaji sebagai driver

public class PegawaiDanGaji{
    public static void main(String args[]) { 
    Pegawai pegawai = new Programmer("Mira");
    Pegawai pegawai2 = new Manajer("Joko");
    Pegawai pegawai3 = new Manajer("Argo");

    Payroll payroll = new Payroll();
    payroll.cetakGaji(pegawai);
    payroll.cetakGaji(pegawai2); 
    payroll.cetakGaji(pegawai3);
    }
}