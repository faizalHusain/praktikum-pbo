// Nama : Faizal Husain Adiasha
// NIM  : 24060121140115
// LAB  : B2
// Tanggal : 22 Februari 2023
// Deskripsi : Driver Titik
public class MTitik {
    public static void main(String args[]) {
        Titik t1 = new Titik();
        t1.setAbsis(1);
        t1.setOrdinat(2);
        Titik t2 = new Titik();
        t2.setAbsis(3);
        t2.setOrdinat(4);
        Titik t3 = new Titik(5, 6);
        System.out.println("jumlah titik : "+t1.getCounterTitik());
        System.out.println("t1(" + t1.getAbsis() + "," + t1.getOrdinat() + ")");
        System.out.println("t2(" + t2.getAbsis() + "," + t2.getOrdinat() + ")");
        System.out.println("t3(" + t3.getAbsis() + "," + t3.getOrdinat() + ")");
    }
}
