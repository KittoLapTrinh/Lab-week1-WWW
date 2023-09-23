package fit.edu.iuh.vn.labweek1www.services;

import fit.edu.iuh.vn.labweek1www.models.Role;

import java.sql.SQLException;
import java.util.List;

public interface RoleService {
    List<Role> getAllRole() throws SQLException;
}
