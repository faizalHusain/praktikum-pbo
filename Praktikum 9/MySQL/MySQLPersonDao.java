// Person.java 6/6/23
// Penulis  : Faizal Husain Adiasha
// NIM      : 24060121140115
// Deskripsi: Implementasi PersonDao untuk MySQL
import java.sql.*;
public class MySQLPersonDao implements PersonDAO {
    public void savePerson(Person person) throws Exception {
        String name = person.getName();
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3310/Person", "root", "");
        String query = "INSERT INTO Person (name) VALUES ('" + name + "')";
        Statement s = con.createStatement();
        s.executeUpdate(query);
        s.close();
    }
}
