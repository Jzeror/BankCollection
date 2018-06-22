package repository;

import java.util.List;

import domain.AccountBean;
import domain.MemberBean;

public interface AccountDAO {
public void insertAccount(AccountBean account);
public List<AccountBean> selectAccountList();
public List<AccountBean> selectAccountByName(String name);
public AccountBean selectMemberById(String id);
public int countAccount();
public void updateAccount(AccountBean account);
public void deleteAccount(AccountBean account);
}
