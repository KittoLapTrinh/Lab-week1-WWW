package fit.edu.iuh.vn.labweek1www.models;

import fit.edu.iuh.vn.labweek1www.enums.Status;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "account")
public class Account implements Serializable {
    @Id
    @Column(name = "account_id", columnDefinition = "varchar(50)")
    private String accountId;
    @Column(name = "full_name", columnDefinition = "varchar(50)", nullable = false)
    private String fullname;
    @Column(columnDefinition = "varchar(50)", nullable = false)
    private String password;
    @Column(columnDefinition = "varchar(50)")
    private String email;
    @Column(columnDefinition = "varchar(50)")
    private String phone;
    @Column(columnDefinition = "tinyint(4)", nullable = false)
    private Status status;

    @OneToMany(fetch = FetchType.LAZY,mappedBy = "account")
    private List<GrantAccess> listGA;



    public List<GrantAccess> getListGA() {
        return listGA;
    }

    public void setListGA(List<GrantAccess> listGA) {
        this.listGA = listGA;
    }

    public Account(String accountId, String fullname, String password, String email, String phone, Status status, List<GrantAccess> listGA) {
        this.accountId = accountId;
        this.fullname = fullname;
        this.password = password;
        this.email = email;
        this.phone = phone;
        this.status = status;
        this.listGA = listGA;
    }

    public Account() {

    }

    @Override
    public String toString() {
        return "Account{" +
                "accountId='" + accountId + '\'' +
                ", fullname='" + fullname + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", status=" + status +

                '}';
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }







    public Account(String accountId, String fullname, String password, String email, String phone, Status status) {
        this.accountId = accountId;
        this.fullname = fullname;
        this.password = password;
        this.email = email;
        this.phone = phone;
        this.status = status;

    }
}
