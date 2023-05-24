// BangunDatarGeneric.java 5/18/23
// Penulis  : Faizal Husain Adiasha
// NIM      : 24060121140115
// Deskripsi: Kelas Bangun Datar Generic
public class BangunDatarGeneric<T1 extends BangunDatar> {
    private T1 bangunDatar;

    public void set(T1 tipeBangunDatar) {
        bangunDatar = tipeBangunDatar;
    }

    public T1 get(){
        return bangunDatar;
    }    

    public double hitungKeliling() {
        return bangunDatar.hitungKeliling();
    }
    //Cobalah pada saat praktikum : Gantilah ‘T’ (dan segala T) pada BangunDatarGeneric.java diganti 
    //dengan karakter yang lain seperti, T1,T2,T1234. Simpulkan apa yang anda lakukan !
    // Jawab : 
    // T diganti dengan T1,T2,T1234, dan hasilnya tetap sama.
    // T1,T2,T1234 dapat diganti dengan karakter lainnya, karena karakter tersebut hanya
    // sebagai nama variabel saja. 
}
