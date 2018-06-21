package serviceImpl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.HashMap;

import javax.swing.JOptionPane;

import java.util.ArrayList;

import domain.AccountBean;
import domain.MinusAccountBean;
import service.AccountService;

public class AccountServiceImpl implements AccountService {
	Map<String, AccountBean> map;
	int start;
	int end;

	public AccountServiceImpl() {
		map = new HashMap<>();
		start = 1;
		end = 999;
	}

	@Override
	public void createAccount(AccountBean account) {
		account.setAccountType(AccountBean.ACCOUNT_TYPE);
		account.setCreateDate(createDate());
		account.setAccountNum(createAccountNum());
		map.put(account.getUid(), account);
	}

	@Override
	public void createMinusAccount(MinusAccountBean minusAccount) {
		minusAccount.setAccountType(MinusAccountBean.ACCOUNT_TYPE);
		minusAccount.setCreateDate(createDate());
		minusAccount.setAccountNum(createAccountNum());
		map.put(minusAccount.getUid(), minusAccount);
	}

	@Override
	public Map<String, AccountBean> list() {
		return map;
	}

	@Override
	public Map<String, AccountBean> findByName(String param) {

		Map<String, AccountBean> temp = new HashMap<>();
//		if (param.equals("")) {
//		} else {
//			for (int i = 0; i < list.size(); i++) {
//				if (param.equals(list.get(i).getName())) {
//					temp.add(list.get(i));
//				}
//			}
//		}
		return temp;
	}

	@Override
	public AccountBean findById(AccountBean account) {
		System.out.println(map.get(account.getUid()).getName());
		return map.get(account.getUid());
	}

	@Override
	public void updatePass(AccountBean account) {
		String pass = account.getPass().split("/")[0];
		String newPass = account.getPass().split("/")[1];
		AccountBean temp = map.get(account.getUid());
		if (temp == null) {
			System.out.println("수정하려는 ID 가 없음!!");
		} else {
			if (temp.getPass().equals(pass)) {
					map.get(account.getUid()).setPass(newPass); //이건 put보다 안좋나? get을 써서 찾긴 찾아야 하니까?
			}
		}
	}

	@Override
	public void deleteAccount(AccountBean account) {//로그인 상태라고 가정.
		if (account.getPass().split("/")[0].equals(account.getPass().split("/")[1])) {
		//	map.remove(map.get(account.getUid()).getUid());      ★key이기 때문에 map.get(account.getUid()).getUid() 와 account.getUid()는 차이가 없음.
			map.remove(account.getUid());         
		}else {System.out.println("입력오류");}
		

	}

	@Override
	public String createAccountNum() {
		String num = "";
		for (int i = 0; i < 3; i++) {
			if (i != 2) {
				num += String.format("%03d", createRandom(start, end)) + "-";
			} else {
				num += String.format("%03d", createRandom(start, end)) + "";
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