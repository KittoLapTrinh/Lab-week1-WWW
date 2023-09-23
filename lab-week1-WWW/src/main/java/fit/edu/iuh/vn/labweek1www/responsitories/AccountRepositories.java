package fit.edu.iuh.vn.labweek1www.responsitories;

import fit.edu.iuh.vn.labweek1www.models.Account;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import fit.edu.iuh.vn.labweek1www.connection.Connection;

import java.sql.*;

import java.util.List;
import java.util.logging.Logger;

public class AccountRepositories {
   private final Logger logger = Logger.getLogger(AccountRepositories.class.getName());
    private static EntityManager em;
    private static EntityTransaction trans;

    public AccountRepositories(){
        em = Connection.getInstance().getEntityManager().getEntityManagerFactory().createEntityManager();
        trans = em.getTransaction();
    }

    public static List<Object> getAllAccount() {
        return null;
    }

    public Account getAccountByID(String id){
        return em.find(Account.class, id);
    }

    public static Account getAccountByEmailAndPassword(String email, String password){
        trans.begin();
        try{
            Account account = em.createQuery("SELECT a FROM Account a WHERE a.email = :email" + " and a.password =: password", Account.class).setParameter("email", email).setParameter("password", password).getSingleResult();
            trans.commit();
            return account;
        }catch (Exception ex){
            ex.printStackTrace();
            trans.rollback();
        }
        return null;
    }




}
