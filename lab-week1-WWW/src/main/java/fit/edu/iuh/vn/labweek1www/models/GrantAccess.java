package fit.edu.iuh.vn.labweek1www.models;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "grant_access")
public class GrantAccess implements Serializable {
    @Id
    @ManyToOne
    @JoinColumn(name = "role_id")
    private Role role;
    @Id
    @ManyToOne
    @JoinColumn(name = "account_id")
    private Account account;

    @Column(name="is_grant", columnDefinition = "enum('1','0','-1')")
    private byte isGrant;
    @Column(name = "notes",columnDefinition = "VARCHAR(50)")
    private String note;


    public GrantAccess(){

    }

    @Override
    public String toString() {
        return "GrantAccess{" +
                "role=" + role +
                ", account=" + account +
                ", isGrant=" + isGrant +
                ", note='" + note + '\'' +
                '}';
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public byte getIsGrant() {
        return isGrant;
    }

    public void setIsGrant(byte isGrant) {
        this.isGrant = isGrant;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public GrantAccess(Role role, Account account, byte isGrant, String note) {
        this.role = role;
        this.account = account;
        this.isGrant = isGrant;
        this.note = note;
    }
}
