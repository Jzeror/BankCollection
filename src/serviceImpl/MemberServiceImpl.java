package serviceImpl;

import java.util.*;

import domain.*;
import service.*;
import repository.*;
import repositoryImpl.*;
import service.MemberService;

public class MemberServiceImpl implements MemberService {
	private static MemberService instance = new MemberServiceImpl();

	public static MemberService getInstance() {
		return instance;
	}

	private MemberServiceImpl() {
	}

	@Override
	public void createUser(UserBean user) {
		user.setCreditRating("7등급");
		MemberDAOImpl.getInstance().insertMember(user);
	}
	
	@Override
	public String login(MemberBean member) {
		// System.out.println("찾는 아이디에 해당하는 이름:" + map.get(member.getUid()).getName());
		return "";
	}
	
	@Override
	public void updatePass(MemberBean member) {
		/*
		 * String id = member.getUid(); String oldPass = member.getPass().split("/")[0];
		 * String newPass = member.getPass().split("/")[1]; MemberBean mem =
		 * map.get(member.getUid()); if (mem == null) {
		 * System.out.println("수정하려는 ID 가 없음!!"); } else { if
		 * (oldPass.equals(mem.getPass())) { mem.setPass(newPass); map.put(id, mem); } }
		 */
	}

	@Override
	public void deleteMember(MemberBean member) {
		// map.remove(findById(member));
		// list.remove(search(member)); 결과 같음
	}

}
