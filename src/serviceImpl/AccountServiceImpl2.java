package serviceImpl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.swing.JOptionPane;

import java.util.ArrayList;

import domain.AccountBean;
import domain.MinusAccountBean;
import service.AccountService;

public class AccountServiceImpl2 implements AccountService {
	List<AccountBean> list;
int start; int end;
	public AccountServiceImpl2() {
		list = new ArrayList<>();
		start=1;
		end=999;
	}

	@Override
	public void createAccount(AccountBean account) {
		account.setAccountType(AccountBean.ACCOUNT_TYPE);
		account.setCreateDate(createDate());
		account.setAccountNum(createAccountNum());
		list.add(account);
	}

	@Override
	public void createMinusAccount(AccountBean minusAccount) {
		minusAccount.setAccountType(MinusAccountBean.ACCOUNT_TYPE);
		minusAccount.setCreateDate(createDate());
		minusAccount.setAccountNum(createAccountNum());
		list.add(minusAccount);
	}

	@Override
	public List<AccountBean> list() {
		return list;
	}

	@Override
	public List<AccountBean> list(String param) {

		List<AccountBean> temp = new ArrayList<>();
		if (param.equals("")) {
		} else {
			for (AccountBean e: list ) {
				if (param.equals(e.getName())) {
					temp.add(e);
				}
			}
		}
		return temp;
	}

	@Override
	public AccountBean search(AccountBean account) {
		for (AccountBean e : list) { // 잘못 입력된 값 거르기
			if (account.getUid().equals(e.getUid()) && account.getPass().equals(e.getPass())) {
				account = e;
				break;
			} else {
				JOptionPane.showMessageDialog(null, "잘못입력");
				break;
			}
		}
		return account;
	}

	@Override
	public void update(AccountBean account) {
		String pass = account.getPass().split("/")[0];
		String newPass = account.getPass().split("/")[1];
		account.setPass(pass);
		list.get(list.indexOf(search(account))).setPass(newPass);
	}

	@Override
	public void delete(AccountBean account) {
		String pass = account.getPass().split("/")[0];
		String confirmPass = account.getPass().split("/")[1];
		account.setPass(pass);
		if(pass==confirmPass) {
			list.remove(list.get(list.indexOf(search(account)))); 
		}
	

	}

	@Override
	public String createAccountNum() {
		String num = "";
		for (int i = 0; i < 3; i++) {
			if (i != 2) {
				num += String.format("%03d", createRandom(start, end)) + "-";
			} else {
				num += String.format("%03d",createRandom(start, end)) + "";
			}
		}
		return num;
	}

	@Override
	public int createRandom(int start, int end) {
		
			int a = (int) (Math.random() * end) + start;
			
			return a;
	}

	@Override
	public String createDate() {
		// TODO Auto-generated method stub
		return null;
	}

}