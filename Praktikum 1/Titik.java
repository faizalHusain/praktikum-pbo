// Nama : Faizal Husain Adiasha
// NIM  : 24060121140115
// LAB  : B2
// Tanggal : 22 Februari 2023
// Deskripsi : Class Titik
class Titik{
    double absis;
    double ordinat;
    static double counterTitik;

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
    void setAbsis(double a) {
        absis = a ;
    }

    void setOrdinat(double o) {
        ordinat = o;
    }
    double getAbsis() {
        return absis;
    }

    double getOrdinat() {
        return ordinat;
    }
    double getCounterTitik() {
        return counterTitik;
    }
    
}