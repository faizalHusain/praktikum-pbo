// Sewa.java 5/10/23
// Penulis  : Faizal Husain Adiasha
// NIM      : 24060121140115
// Deskripsi: Kelas Sewa sebagai driver
public class Sewa {
    public static void main(String[] args){
        Vehicle kendaraan = new Vehicle();
        Vehicle mobil = new Car();
        Vehicle bis = new Bus() ;
        kendaraan.calRent (50, 1000);
        mobil.calRent (50, 1000);
        bis.calRent (50, 1000);
    }
}