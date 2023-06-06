// DAOManager.java 15/03/23
// Penulis  : Faizal Husain Adiasha
// NIM      : 24060121140115
// Deskripsi: Kelas Person Database Model
public class MainDAO {
    public static void main(String[] args) {
        Person person = new Person("Faizal Husain Adiasha");
        DAOManager m = new DAOManager();
        m.setPersonDAO(new MySQLPersonDao());
        try {
            m.getPersonDAO().savePerson(person);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
