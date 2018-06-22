package controller;

import javax.swing.JOptionPane;
import domain.*;
import service.*;
import serviceImpl.*;

public class AccountController {

	private static AccountController instance = new AccountController();

	public static AccountController getInstance() {
		return instance;
	}

	private AccountController() {
	}

	public void account(AccountBean account) {
		System.out.println(account);
		AccountServiceImpl.getInstance().createAccount(account);
	}

	public void minusAccount() {

		AccountBean account = new MinusAccountBean();
		account.setName(JOptionPane.showInputDialog("이름"));
		account.setPass(JOptionPane.showInputDialog("패스"));
		account.setUid(JOptionPane.showInputDialog("아이디"));
		((MinusAccountBean) account).setLimit(Integer.parseInt(JOptionPane.showInputDialog("한도")));
		AccountServiceImpl.getInstance().createMinusAccount((MinusAccountBean) account);
	}

	public void findById() {

		AccountBean account = new AccountBean();
		account.setUid(JOptionPane.showInputDialog("아이디"));
		account.setPass(JOptionPane.showInputDialog("패스"));
		JOptionPane.showMessageDialog(null, AccountServiceImpl.getInstance().findById(account));
	}

	public void changePass() {

		AccountBean account = new AccountBean();
		account.setUid(JOptionPane.showInputDialog("아이디"));
		account.setPass(JOptionPane.showInputDialog("패스") + "/" + JOptionPane.showInputDialog("새비번"));

		AccountServiceImpl.getInstance().updatePass(account);
	}

	public void deleteMember() {

		AccountBean account = new AccountBean();
		account.setUid(JOptionPane.showInputDialog("아이디"));
		account.setPass(JOptionPane.showInputDialog("패스") + "/" + JOptionPane.showInputDialog("비번확인"));
		AccountServiceImpl.getInstance().deleteAccount(account);
	}

}
