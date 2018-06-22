package serviceImpl;

import java.text.SimpleDateFormat;
import java.util.*;

import javax.swing.JOptionPane;

import domain.*;
import repository.MemberDAO;
import repositoryImpl.MemberDAOImpl;
import service.*;

public class AdminServiceImpl implements AdminService {
	private static AdminService instance = new AdminServiceImpl();

	public static AdminService getInstance() {
		return instance;
	}

	private AdminServiceImpl() {
		start = 1;
		end = 999;
	}

	int start;
	int end;

	@Override
	public void createStaff(StaffBean staff) {
		staff.setAccessNum("123-123-123");
		MemberDAOImpl.getInstance().insertMember(staff);
	}

	@Override
	public List<MemberBean> listMember() {
		return MemberDAOImpl.getInstance().selectListMember();
	}

	@Override
	public List<MemberBean> findMemberByName(String name) {
		/*
		 * List<MemberBean> temp = new ArrayList<>(); for (MemberBean e :
		 * MemberDAOImpl.getInstance()) { if (name.equals(e.getName())) { temp.add(e); }
		 * }
		 */
		return null;
	}

	@Override
	public MemberBean findMemberById(MemberBean member) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AccountBean> listAccount() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AccountBean> findAccountByName(String param) {
		/*
		 * List<AccountBean> list = new ArrayList<>(); for (AccountBean e : listAccount)
		 * { if (param.equals(e.getName())) { list.add(e); } }
		 */

		return null;
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
	public int createRandom(int Start, int end) {
		int a = (int) (Math.random() * end) + start;
		return a;
	}

	@Override
	public String createDate() {
		// TODO Auto-generated method stub
		return new SimpleDateFormat("yyyy년 MM월 dd일").format(new Date());
	}

}
