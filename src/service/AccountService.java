package service;

import domain.*;
import java.util.Map;

public interface AccountService {
public void createAccount(AccountBean account);
public void createMinusAccount(MinusAccountBean minusAccount);
public AccountBean findById(AccountBean account);
public void updatePass(AccountBean account);
public void deleteAccount(AccountBean account);
}