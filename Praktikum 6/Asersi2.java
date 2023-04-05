public class Asersi2 {
    public static void main(String[] args) {
        double jariJari = 0;
        assert (jariJari > 0) : "jari-jari tidak boleh nol!!";
        Lingkaran l = new Lingkaran(jariJari);
        double kelilingLingkaran = l.hitungKeliling();
        System.out.println("Keliling lingkaran: " + kelilingLingkaran);
    }
    // PERTANYAAN : secara konsep, ada yang kurang tepat pada program Asersi2 di atas? 
    // kesalahannya yaitu seharusna keluaran jika terjadi kesalahan adalah jari-jari harus lebih besar dari nol
}
class Lingkaran {
    private double jariJari;

    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }
    public double hitungKeliling() {
        return 2 * Math.PI * jariJari;
    }
}

