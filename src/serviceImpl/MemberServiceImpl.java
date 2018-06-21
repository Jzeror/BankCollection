package serviceImpl;

import java.util.*;

import domain.*;
import service.*;

import service.MemberService;

public class MemberServiceImpl implements MemberService {
	Map<String, MemberBean> map;

	public MemberServiceImpl() {
		map = new HashMap<>();
	}

	@Override
	public void createUser(UserBean user) {
		user.setCreditRating("7등급");
		map.put(user.getUid(), user);
		/*
		 * boolean flag = list.add(user); if(flag) {res="등록성공";}else {res="등록실패";}
		 */
	}

	@Override
	public void createStaff(StaffBean staff) {
		staff.setAccessNum("123-456-789");
		map.put(staff.getUid(), staff);

	}

	@Override
	public Map<String, MemberBean> list() {

		return map;
	}

	@Override
	public List<MemberBean> findByName(String name) {
		List<MemberBean> temp = new ArrayList<>();
		Set<MemberBean> set = new HashSet<>();
		for (Map.Entry<String, MemberBean> e : map.entrySet()) {
			if (name.equals(e.getValue().getName())) {
				set.add(e.getValue());
			}
		}
		Iterator<MemberBean> it = set.iterator();
		while (it.hasNext()) {
			temp.add(it.next());
		}
		return temp;
	}

	@Override
	public MemberBean findById(MemberBean member) {
		System.out.println("찾는 아이디에 해당하는 이름:" + map.get(member.getUid()).getName());
		return map.get(member.getUid());
	}

	@Override
	public void updatePass(MemberBean member) {
		String id = member.getUid();
		String oldPass = member.getPass().split("/")[0];
		String newPass = member.getPass().split("/")[1];
		MemberBean mem = map.get(member.getUid());
		if (mem == null) {
			System.out.println("수정하려는 ID 가 없음!!");
		} else {
			if (oldPass.equals(mem.getPass())) {
				mem.setPass(newPass);
				map.put(id, mem);
			}
		}
	}

	@Override
	public void deleteMember(MemberBean member) {
		map.remove(findById(member));
		// list.remove(search(member)); 결과 같음
	}

}
