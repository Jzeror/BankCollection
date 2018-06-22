package controller;

import javax.swing.JOptionPane;
import domain.*;
import service.*;
import serviceImpl.*;

//JOIN은 일반유저 추가 , ADD는 직원 추가



public class AdminController {
	private static AdminController  instance = new AdminController();
	public static AdminController getInstance() {return instance;}
	private AdminController() {};
	
	public void add(StaffBean staff) {
		AdminServiceImpl.getInstance().createStaff(staff);
	}
	
}
