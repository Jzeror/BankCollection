package service;

import domain.*;
import java.util.Map;

public interface AccountService {
public void createAccount(AccountBean account);
public void createMinusAccount(MinusAccountBean minusAccount);
public Map<String, AccountBean> list();
public Map<String, AccountBean> findByName(String param);
public AccountBean findById(AccountBean account);
public void updatePass(AccountBean account);
public void deleteAccount(AccountBean account);
public String createAccountNum();
public int createRandom(int Start, int end);
public String createDate();
}