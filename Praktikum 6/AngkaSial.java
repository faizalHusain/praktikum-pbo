// AngkaSial.java 5/04/23
// Penulis  : Faizal Husain Adiasha
// NIM      : 24060121140115
// Deskripsi: Kelas Angka SIal
public class AngkaSial {
    public void cobaAngka(int angka) throws AngkaSialException {
        if (angka == 13) {
            throw new AngkaSialException();
        }
        System.out.println(angka + " bukan angka sial");
    }
    public static void main(String[] args) {
        AngkaSial as = new AngkaSial();
        try {
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(11);
        } catch (AngkaSialException ase) {
            System.out.println(ase.getMessage());
            System.out.println("Hati-hati memasukkan angka!!");
        }
    }
}
// PERTANYAAN: 
// *Ketika eksepsi terjadi, apakah baris 12 pada AngkaSial.java di atas dieksekusi? 
// *Apakah baris 21 pada AngkaSial.java di atas dieksekusi?
// Jawaban
// baris 12 tidak dieksekusi karena terjadi eksepsi sehingga langsung menuju ke baris 21 yang merupakan catch untuk menangani eksepsi