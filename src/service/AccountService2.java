package service;

import domain.*;
import java.util.List;

public interface AccountService2 {
public void createAccount(AccountBean account);
public void createMinusAccount(AccountBean account);
public List<AccountBean> list();
public List<AccountBean> list(String param);
public AccountBean search(AccountBean account);
public void update(AccountBean account);
public void delete(AccountBean account);
public String createAccountNum();
public int createRandom(int Start, int end);
public String createDate();
}