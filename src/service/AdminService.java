package service;

import java.util.List;
import domain.*;


public interface AdminService {//관리자 모드
	public void createStaff(StaffBean staff);
	public List<MemberBean> listMember();
	public List<MemberBean> findMemberByName(String name);
	public MemberBean findMemberById(MemberBean member);
	
	public List<AccountBean> listAccount();
	public List<AccountBean> findAccountByName(String param);
	public String createAccountNum();
	public int createRandom(int Start, int end);
	public String createDate();
}
