// DAOManager.java 6/6/23
// Penulis  : Faizal Husain Adiasha
// NIM      : 24060121140115
// Deskripsi: Implementasi PersonDao untuk MySQL
public class DAOManager {
    private PersonDAO personDAO;

    public void setPersonDAO(PersonDAO personDAO) {
        this.personDAO = personDAO;
    }
    public PersonDAO getPersonDAO() {
        return this.personDAO;
    }
}
