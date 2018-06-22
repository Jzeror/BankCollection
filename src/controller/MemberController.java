package controller;

import javax.swing.JOptionPane;
import domain.*;
import service.*;
import serviceImpl.*;

//JOIN은 일반유저 추가 , ADD는 직원 추가
public class MemberController {
	private static MemberController instance = new MemberController();
	public static MemberController getInstance() {
		return instance;
	}
private MemberController() {}
//셋은 삭제.

	public void join(UserBean user) {
		MemberServiceImpl.getInstance().createUser(user);
	}
	public void list() {
	//	JOptionPane.showMessageDialog(null, service.list());
	}

	public void findById() {
		MemberBean member = new MemberBean();
		member.setName(JOptionPane.showInputDialog("이름?"));
		member.setSsn(JOptionPane.showInputDialog("주민번호?"));
//		JOptionPane.showMessageDialog(null, service.findById(member));
	}

	public void findByName() {
	//	JOptionPane.showMessageDialog(null, service.findByName(JOptionPane.showInputDialog("이름?")));
	}

	public void updatePass() {
		MemberBean member = new MemberBean();
		member.setUid(JOptionPane.showInputDialog("아이디?"));
		member.setPass(JOptionPane.showInputDialog("비밀번호?") + "/" + JOptionPane.showInputDialog("새 비밀번호?"));
	}

	public void deleteMember() {
		MemberBean member = new MemberBean();
		member.setUid(JOptionPane.showInputDialog("아이디?"));
		member.setPass(JOptionPane.showInputDialog("비밀번호?") + "/" + JOptionPane.showInputDialog("비밀번호 확인"));
	}

	public static void main(String[] args) {
		MemberBean member = null;
		while (true) {

		}
	}
}
