package fit.edu.iuh.vn.labweek1www.models;

import fit.edu.iuh.vn.labweek1www.enums.Status;
import jakarta.persistence.*;
import java.util.List;
import java.io.Serializable;

@Entity
@Table(name = "role")
public class Role implements Serializable {
    @Id
    @Column(name = "role_id", columnDefinition = "varchar(50)")
    private String roleId;
    @Column(name = "role_name",columnDefinition = "varchar(50)", nullable = false)
    private String rolename;
    @Column(columnDefinition = "varchar(50)")
    private String description;

    @Column(columnDefinition = "tinyint(4)", nullable = false)
    private Status status;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "role")
    private List<GrantAccess> grantAccess;


    @Override
    public String toString() {
        return "Role{" +
                "roleId='" + roleId + '\'' +
                ", rolename='" + rolename + '\'' +
                ", description='" + description + '\'' +
                ", status=" + status +
                ", grantAccess=" + grantAccess +
                '}';
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public List<GrantAccess> getGrantAccess() {
        return grantAccess;
    }

    public void setGrantAccess(List<GrantAccess> grantAccess) {
        this.grantAccess = grantAccess;
    }

    public Role(String roleId, String rolename, String description, Status status, List<GrantAccess> grantAccess) {
        this.roleId = roleId;
        this.rolename = rolename;
        this.description = description;
        this.status = status;
        this.grantAccess = grantAccess;
    }

    public Role(String string, String rsString, String s, int anInt) {

    }



}
