package repository;
import domain.*;
import java.util.List;

public interface MemberDAO {
	public void insertMember(MemberBean member);
	public List<MemberBean> selectListMember();
	public List<MemberBean> selectMemberByName(String name);
	public MemberBean selectMemberById(String id);
	public MemberBean login(MemberBean member);
	public int countMembers();
	public void updateMember(MemberBean member);
	public void deleteMember(MemberBean member);
		
	}

