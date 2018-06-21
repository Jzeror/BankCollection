package service;

import java.util.Map;
import java.util.List;
import domain.*;

public interface MemberService {
	public void createUser(UserBean user);

	public void createStaff(StaffBean staff);

	public Map<String,MemberBean> list();
	
	public List<MemberBean> findByName(String name);
	
	public MemberBean findById(MemberBean member);
	
	public void updatePass(MemberBean member);
	
	public void deleteMember(MemberBean member);

}
