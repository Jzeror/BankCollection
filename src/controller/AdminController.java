package controller;

import javax.swing.JOptionPane;
import domain.*;
import service.*;
import serviceImpl.*;

//JOIN은 일반유저 추가 , ADD는 직원 추가

public class AdminController {
	private static AdminController instance = new AdminController();

	public static AdminController getInstance() {
		return instance;
	}

	private AdminController() {
	};

	public void add(StaffBean staff) {
		AdminServiceImpl.getInstance().createStaff(staff);
	}

	public void listMember() {
		// JOptionPane.showMessageDialog(null, service.list());
	}

	public void findMemberByName() {
		// JOptionPane.showMessageDialog(null,
		// service.findByName(JOptionPane.showInputDialog("이름?")));
	}

	public void findMemberById() {
		MemberBean member = new MemberBean();
		member.setName(JOptionPane.showInputDialog("이름?"));
		member.setSsn(JOptionPane.showInputDialog("주민번호?"));
		// JOptionPane.showMessageDialog(null, service.findById(member));
	}

	public void listAccount() {

		// JOptionPane.showMessageDialog(null, ( service).listAccount());
	}

	public void findAccountByName() {

		// JOptionPane.showMessageDialog(null,
		// service.findByName(JOptionPane.showInputDialog("이름?")));
	}

}
