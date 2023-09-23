package fit.edu.iuh.vn.labweek1www.responsitories;

import fit.edu.iuh.vn.labweek1www.connection.Connection;
import fit.edu.iuh.vn.labweek1www.models.Log;
import jakarta.persistence.EntityManager;

import java.util.List;
import java.util.Optional;

public class LogReponsitories extends CRUDReponsitories<Log, Long> {
    private EntityManager em;
    public Optional<Boolean> update(Log log) {
        return super.updateById(log, log.getLogId());
    }


    public LogReponsitories() {
        em = Connection.getInstance().getEntityManagerFactory().createEntityManager();

    }

    public List<Log> findAll(String accountID) {
        return em.createQuery("select l from Log l",Log.class).getResultList();
    }
}
