package fit.edu.iuh.vn.labweek1www.connection;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Persistence;
import jakarta.persistence.EntityManagerFactory;


public class Connection {
    private static Connection instance;
    private EntityManagerFactory emf;
    private EntityManager em;
    private Connection() {

        emf = Persistence.createEntityManagerFactory("lab-week1-WWW");
    }
    public static Connection getInstance() {
        if (instance ==null)
            instance = new Connection();
        return instance;
    }
    public EntityManagerFactory getEntityManagerFactory() {
        return emf;
    }

    public EntityManager getEntityManager() {
        return em;
    }
}
