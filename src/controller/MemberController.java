package controller;

import javax.swing.JOptionPane;
import domain.*;
import service.*;
import serviceImpl.*;

//JOIN은 일반유저 추가 , ADD는 직원 추가
enum MemberButt {
	EXIT, JOIN, ADD, LIST, FIND_BY_ID, FIND_BY_NAME, COUNT, UPDATE, WITHDRAWAL
}

public class MemberController {

	public void join() {
		MemberService service = new MemberServiceImpl();
		MemberBean member = new UserBean();
		member.setUid(JOptionPane.showInputDialog("아이디?"));
		member.setPass(JOptionPane.showInputDialog("비밀번호?"));
		member.setName(JOptionPane.showInputDialog("이름?"));
		member.setSsn(JOptionPane.showInputDialog("주민등록번호?"));
		member.setAddr(JOptionPane.showInputDialog("주소?"));
		member.setPhone(JOptionPane.showInputDialog("폰번호?"));
		member.setEmail(JOptionPane.showInputDialog("이메일?"));
		service.createUser((UserBean) member);
	}

	public void add() {
		MemberService service = new MemberServiceImpl();
		MemberBean member = new StaffBean();
		member.setUid(JOptionPane.showInputDialog("아이디?"));
		member.setPass(JOptionPane.showInputDialog("비밀번호?"));
		member.setName(JOptionPane.showInputDialog("이름?"));
		member.setSsn(JOptionPane.showInputDialog("주민등록번호?"));
		member.setAddr(JOptionPane.showInputDialog("주소?"));
		member.setPhone(JOptionPane.showInputDialog("폰번호?"));
		member.setEmail(JOptionPane.showInputDialog("이메일?"));
		service.createStaff((StaffBean) member);
	}

	public void list() {
		MemberService service = new MemberServiceImpl();
		JOptionPane.showMessageDialog(null, service.list());
	}

	public void findById() {
		MemberService service = new MemberServiceImpl();
		MemberBean member = new MemberBean();
		member.setName(JOptionPane.showInputDialog("이름?"));
		member.setSsn(JOptionPane.showInputDialog("주민번호?"));
		JOptionPane.showMessageDialog(null, service.findById(member));
	}

	public void findByName() {
		MemberService service = new MemberServiceImpl();
		JOptionPane.showMessageDialog(null, service.findByName(JOptionPane.showInputDialog("이름?")));
	}

	public void updatePass() {
		MemberService service = new MemberServiceImpl();
		MemberBean member = new MemberBean();
		member.setUid(JOptionPane.showInputDialog("아이디?"));
		member.setPass(JOptionPane.showInputDialog("비밀번호?") + "/" + JOptionPane.showInputDialog("새 비밀번호?"));
	}

	public void deleteMember() {
		MemberService service = new MemberServiceImpl();
		MemberBean member = new MemberBean();
		member.setUid(JOptionPane.showInputDialog("아이디?"));
		member.setPass(JOptionPane.showInputDialog("비밀번호?") + "/" + JOptionPane.showInputDialog("비밀번호 확인"));
	}

	public static void main(String[] args) {
		MemberService service = new MemberServiceImpl();
		MemberBean member = null;
		while (true) {

		}
	}
}
