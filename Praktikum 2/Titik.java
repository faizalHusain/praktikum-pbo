// Titik.java 22/02/23
// Penulis  : Faizal Husain Adiasha
// NIM      : 24060121140115
// Deskripsi: Kelas Titik yang didalamnya berisi method method setter getter dan counter penghitung objek
class Titik{
    public double absis;
    public double ordinat;
    public static int counterTitik;

    Titik() {
        absis = 0;
        ordinat = 0;
        counterTitik++;
    }
    Titik(double a, double o) {
        absis = a;
        ordinat = o;
        counterTitik++;
    }
    public void setAbsis(double a) {
        absis = a ;
    }

    public void setOrdinat(double o) {
        ordinat = o;
    }
    public double getAbsis() {
        return absis;
    }

    public double getOrdinat() {
        return ordinat;
    }
    public double getCounterTitik() {
        return counterTitik;
    }
    
}