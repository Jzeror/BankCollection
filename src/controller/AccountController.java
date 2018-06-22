package controller;

import javax.swing.JOptionPane;
import domain.*;
import service.*;
import serviceImpl.*;

public class AccountController {

	public void account() {
		AccountService service = new AccountServiceImpl();
		AccountBean account = new AccountBean();
		account.setName(JOptionPane.showInputDialog("이름"));
		account.setPass(JOptionPane.showInputDialog("패스"));
		account.setUid(JOptionPane.showInputDialog("아이디"));
		service.createAccount(account);
	}

	public void minusAccount() {
		AccountService service = new AccountServiceImpl();
		AccountBean account = new MinusAccountBean();
		account.setName(JOptionPane.showInputDialog("이름"));
		account.setPass(JOptionPane.showInputDialog("패스"));
		account.setUid(JOptionPane.showInputDialog("아이디"));
		((MinusAccountBean) account).setLimit(Integer.parseInt(JOptionPane.showInputDialog("한도")));
		service.createMinusAccount((MinusAccountBean) account);
	}

	public void list() {
		AccountService service = new AccountServiceImpl();
//JOptionPane.showMessageDialog(null, ( service).listAccount());
	}

	public void findById() {
		AccountService service = new AccountServiceImpl();
		AccountBean account = new AccountBean();
		account.setUid(JOptionPane.showInputDialog("아이디"));
		account.setPass(JOptionPane.showInputDialog("패스"));
		JOptionPane.showMessageDialog(null, service.findById(account));
	}

	public void findByName() {
		AccountService service = new AccountServiceImpl();
	//	JOptionPane.showMessageDialog(null, service.findByName(JOptionPane.showInputDialog("이름?")));
	}

	public void changePass() {
		AccountService service = new AccountServiceImpl();
		AccountBean account = new AccountBean();
		account.setUid(JOptionPane.showInputDialog("아이디"));
		account.setPass(JOptionPane.showInputDialog("패스") + "/" + JOptionPane.showInputDialog("새비번"));

		service.updatePass(account);
	}

	public void deleteMember() {
		AccountService service = new AccountServiceImpl();
		AccountBean account = new AccountBean();
		account.setUid(JOptionPane.showInputDialog("아이디"));
		account.setPass(JOptionPane.showInputDialog("패스") + "/" + JOptionPane.showInputDialog("비번확인"));
		service.deleteAccount(account);
	}

}
