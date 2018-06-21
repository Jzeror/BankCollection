package controller;

import javax.swing.JOptionPane;
import domain.*;
import service.*;
import serviceImpl.*;

//JOIN은 일반유저 추가 , ADD는 직원 추가
enum AdminButt {
	EXIT, ADD, LIST, FIND_BY_ID, FIND_BY_NAME, COUNT, UPDATE, REMOVE
}

public class AdminController {

	public static void main(String[] args) {
		AdminButt[] buttons = { AdminButt.EXIT, AdminButt.ADD, AdminButt.LIST,
				AdminButt.FIND_BY_ID, AdminButt.FIND_BY_NAME, AdminButt.COUNT, AdminButt.UPDATE,
				AdminButt.REMOVE };
		// Account account = null;
		MemberService service = new MemberServiceImpl();
		MemberBean member = null;
		while (true) {
			AdminButt select = (AdminButt) JOptionPane.showInputDialog(null, // frame
					"선택", // frame title
					"기능을 선택하시오", // order
					JOptionPane.QUESTION_MESSAGE, // type
					null, // icon
					buttons, // Array of choices
					buttons[1]); // default
			switch (select) {
			case EXIT:
				JOptionPane.showMessageDialog(null, "종료함다");
				return;
				
			case ADD:
				member = new StaffBean();
				member.setUid(JOptionPane.showInputDialog("아이디?"));
				member.setPass(JOptionPane.showInputDialog("비밀번호?"));
				member.setName(JOptionPane.showInputDialog("이름?"));
				member.setSsn(JOptionPane.showInputDialog("주민등록번호?"));
				member.setAddr(JOptionPane.showInputDialog("주소?"));
				member.setPhone(JOptionPane.showInputDialog("폰번호?"));
				member.setEmail(JOptionPane.showInputDialog("이메일?"));
				service.createUser((UserBean) member);
				break;
			case LIST:
			
				break;

			case FIND_BY_ID:
				
				break;
			case FIND_BY_NAME:
			
				break;
			case COUNT:
			
				break;
			case UPDATE:
			
				break;
			case REMOVE:
			
				break;
			}
		}
	}
}
