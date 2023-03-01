// Nama : Faizal Husain Adiasha
// NIM  : 24060121140115
// LAB  : B2
// Tanggal : 22 Februari 2023
// Deskripsi : Class Titik
class Titik{
    private double absis;
    private double ordinat;
    private static int counterTitik;

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