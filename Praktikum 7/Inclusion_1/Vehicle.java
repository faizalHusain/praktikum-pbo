// Vehicle.java 5/10/23
// Penulis  : Faizal Husain Adiasha
// NIM      : 24060121140115
// Deskripsi: Kelas Vehicle sebagai superclass

 public class Vehicle {
    void calRent (int distance, float price) {
        float fare=distance* price;
        System.out.println("vehicle price = "+fare);
    }
}