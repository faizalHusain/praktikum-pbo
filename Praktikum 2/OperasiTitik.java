// MTitik.java 22/02/23
// Penulis  : Faizal Husain Adiasha
// NIM      : 24060121140115
// Deskripsi: Kelas Operasi titik yang didalamnya terdapat method untuk refleksi
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