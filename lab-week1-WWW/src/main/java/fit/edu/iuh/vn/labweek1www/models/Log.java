package fit.edu.iuh.vn.labweek1www.models;

import jakarta.persistence.*;

import java.io.Serializable;

import java.sql.Timestamp;

@Entity
@Table(name = "log")
public class Log implements Serializable {
    @Id
    @Column(columnDefinition = "BIGINT(20)")
    private long logId;
    @Column(columnDefinition = "VARCHAR(50)")
    private String accountId;
    @Column(columnDefinition = "DATETIME")
    private Timestamp loginTime;
    @Column(columnDefinition = "DATETIME")
    private Timestamp logoutTime;
    @Column(columnDefinition = "VARCHAR(250)")
    private String notes;

    @Override
    public String toString() {
        return "Log{" +
                "logId=" + logId +
                ", accountId='" + accountId + '\'' +
                ", loginTime=" + loginTime +
                ", logoutTime=" + logoutTime +
                ", notes='" + notes + '\'' +
                '}';
    }

    public long getLogId() {
        return logId;
    }

    public void setLogId(long logId) {
        this.logId = logId;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public Timestamp getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Timestamp loginTime) {
        this.loginTime = loginTime;
    }

    public Timestamp getLogoutTime() {
        return logoutTime;
    }

    public void setLogoutTime(Timestamp logoutTime) {
        this.logoutTime = logoutTime;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Log(long logId, String accountId, Timestamp loginTime, Timestamp logoutTime, String notes) {
        this.logId = logId;
        this.accountId = accountId;
        this.loginTime = loginTime;
        this.logoutTime = logoutTime;
        this.notes = notes;
    }




    public Log() {

    }
}
