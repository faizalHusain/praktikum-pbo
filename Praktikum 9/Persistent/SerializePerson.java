import java.io.*;

public class SerializePerson {
    public static void main(String[] args) {
        Person person = new Person("Faizal Husain Adiasha");
        try {
            FileOutputStream f = new FileOutputStream("person.ser");
            ObjectOutputStream s = new ObjectOutputStream(f);
            s.writeObject(person);
            System.out.println("Selesai menulis objek person");
            s.close();
        } catch (IOException i) {
            i.printStackTrace();
        }
    }
}
