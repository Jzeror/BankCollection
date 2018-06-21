package controller;

import javax.swing.JOptionPane;
import domain.*;
import service.AccountService;
import serviceImpl.AccountServiceImpl;

enum AccountButt2 {
	EXIT, ACCOUNT, MINUS_ACCOUNT, LIST, FIND_BY_ID, FIND_BY_NAME, CHANGE_PASS, DELETE_ACCOUNT
}

public class AccountController {
	public static void main(String[] args) {
		AccountButt2[] buttons = { AccountButt2.EXIT, AccountButt2.ACCOUNT, AccountButt2.MINUS_ACCOUNT,
				AccountButt2.LIST, AccountButt2.FIND_BY_ID, AccountButt2.FIND_BY_NAME , AccountButt2.CHANGE_PASS, AccountButt2.DELETE_ACCOUNT

		};
		// Account account = null;
		AccountService service = new AccountServiceImpl();
		AccountBean account;
		while (true) {
			AccountButt2 select = (AccountButt2) JOptionPane.showInputDialog(null, // frame
					"선택", // frame title
					"기능을 선택하시오", // order
					JOptionPane.QUESTION_MESSAGE, // type
					null, // icon
					buttons, // Array of choices
					buttons[1]); // default
			switch (select) {
			case EXIT:
				JOptionPane.showInputDialog("종료되었습니다.");
				return;
			case ACCOUNT:
				account=new AccountBean();
				account.setName(JOptionPane.showInputDialog("이름"));
				account.setPass(JOptionPane.showInputDialog("패스"));
				account.setUid(JOptionPane.showInputDialog("아이디"));
		service.createAccount(account);
				
				break;
			case MINUS_ACCOUNT:
				account=new MinusAccountBean();
				account.setName(JOptionPane.showInputDialog("이름"));
				account.setPass(JOptionPane.showInputDialog("패스"));
				account.setUid(JOptionPane.showInputDialog("아이디"));
				((MinusAccountBean) account).setLimit(Integer.parseInt(JOptionPane.showInputDialog("한도")));
		service.createMinusAccount((MinusAccountBean) account);
				break;
			case LIST:
				JOptionPane.showMessageDialog(null, service.list());
				break;
				
			case FIND_BY_ID: 
				account=new AccountBean();
				account.setUid(JOptionPane.showInputDialog("아이디"));
				account.setPass(JOptionPane.showInputDialog("패스"));
			JOptionPane.showMessageDialog(null, service.findById(account));
				break;
			case FIND_BY_NAME: 
				JOptionPane.showMessageDialog(null,service.findByName(JOptionPane.showInputDialog("이름?")));
				
				break;
			case CHANGE_PASS:
				account=new AccountBean();
				account.setUid(JOptionPane.showInputDialog("아이디"));
				account.setPass(JOptionPane.showInputDialog("패스")+"/"+JOptionPane.showInputDialog("새비번"));
				
				service.updatePass(account);
				// ID, PASS, NEW PASS
			
				 break;
			case DELETE_ACCOUNT:
				account=new AccountBean();
				account.setUid(JOptionPane.showInputDialog("아이디"));
				account.setPass(JOptionPane.showInputDialog("패스")+"/"+JOptionPane.showInputDialog("비번확인"));
				service.deleteAccount(account);
	//계좌 삭제 후 총계좌수가 1 감소해야함.
			break;
			}
		}
	}
}