package fit.edu.iuh.vn.labweek1www.responsitories;

import fit.edu.iuh.vn.labweek1www.enums.Status;
import fit.edu.iuh.vn.labweek1www.models.Role;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class RoleReponsitories {
    public static Connection connection;

    public RoleReponsitories() throws ClassNotFoundException, SQLException {
        Class.forName("org.mariadb.jdbc.Driver");
        String url = "jdbc:mariadb://localhost:3306/mydb?createDatabaseIfNotExist=true";
        connection = (Connection) DriverManager.getConnection(url, "root", "sapassword");
    }
    public void deleteRole(String id) throws SQLException {
        String sql="delete from role where role_id=?";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, id);
        ps.executeUpdate();
    }
    public void updateRole(Role role) throws SQLException {
        String sql ="update role set role_name=?, " +
                "description=?, " +
                "status=? " +
                "where role_id=?";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, role.getRolename());
        ps.setString(2, role.getDescription());
        ps.setInt(3, role.getStatus().compareTo(Status.DEACTIVE));
        ps.setString(4, role.getRoleId());
        ps.executeUpdate();
    }
    public void insertRole(Role role) throws Exception{
        String sql ="insert into role values(?,?,?,?)";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1,role.getRoleId());
        ps.setString(2, role.getRolename());
        ps.setString(3, role.getDescription());
        ps.setInt(4, role.getStatus().compareTo(Status.DEACTIVE));
        ps.executeUpdate();
    }
    public List<Role> getAllRole() throws SQLException {
        String sql ="select * from role";
        PreparedStatement ps = connection.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        List<Role> list = new ArrayList<>();
        while (rs.next()){
            Role role = new Role(rs.getString(1), rs.getString(2),
                    rs.getString(3), rs.getInt(4));
            list.add(role);
        }
        return list;
    }
    public Role getRoleById(String id) throws SQLException {
        String sql ="select * from role where role_id=?";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, id);
        ResultSet rs = ps.executeQuery();
        while (rs.next()){
            return new Role(rs.getString(1), rs.getString(2),
                    rs.getString(3), rs.getInt(4));
        }
        return null;
    }
}
