package fit.edu.iuh.vn.labweek1www.services;

import fit.edu.iuh.vn.labweek1www.models.Log;

import java.sql.SQLException;

public interface LogService {
    boolean insertLogs(Log object) throws SQLException;
}
