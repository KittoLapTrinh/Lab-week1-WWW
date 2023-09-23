package fit.edu.iuh.vn.labweek1www.services;

import fit.edu.iuh.vn.labweek1www.models.Account;

import java.sql.SQLException;
import java.util.List;

public interface AccountService {
    int login(String username, String password) throws SQLException;
    List<Account> getAllAccount() throws SQLException;
    Account getAccountById(String id) throws SQLException;
    boolean createAccount(Account account);
    void deleteAccount(String accountId);
}
