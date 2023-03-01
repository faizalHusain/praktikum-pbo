// Nama : Faizal Husain Adiasha
// NIM  : 24060121140115
// LAB  : B2
// Tanggal : 1 Maret 2023
// Deskripsi : Class Operasi Titik
class OperasiTitik{
    private void refleksiSumbuX(Titik titik) {
        titik.setOrdinat(-titik.getOrdinat());
    }

    private void refleksiSumbuY(Titik titik) {
        titik.setAbsis(-titik.getAbsis());
    }

    public Titik refleksiX(Titik titik) {
        refleksiSumbuX(titik);
        return titik;
    }
    public Titik refleksiY(Titik titik){
        refleksiSumbuY(titik);
        return titik;
    }
}