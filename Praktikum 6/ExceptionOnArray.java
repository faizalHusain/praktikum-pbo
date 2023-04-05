// ExceptionOnArray.java 5/04/23
// Penulis  : Faizal Husain Adiasha
// NIM      : 24060121140115
// Deskripsi: Kelas ExceptionOnArray
public class ExceptionOnArray {
    public static void main(String[] args) {
        Integer[] arrayInteger = new Integer[5];
        try {
            arrayInteger[2] = 11;
            arrayInteger[4] = 10;
        } catch (ArrayIndexOutOfBoundsException exception) {
            exception.printStackTrace();
        } finally {
            System.out.println("clean up code...");
        }
    }
}
