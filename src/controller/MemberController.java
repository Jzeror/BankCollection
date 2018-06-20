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

	public static void main(String[] args) {
		MemberButt[] buttons = { MemberButt.EXIT, MemberButt.JOIN, MemberButt.ADD, MemberButt.LIST,
				MemberButt.FIND_BY_ID, MemberButt.FIND_BY_NAME, MemberButt.COUNT, MemberButt.UPDATE,
				MemberButt.WITHDRAWAL };
		// Account account = null;
		MemberService service = new MemberServiceImpl();
		MemberBean member = null;
		while (true) {
			MemberButt select = (MemberButt) JOptionPane.showInputDialog(null, // frame
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
			case JOIN:
				member=new UserBean();
				break;
			case ADD:
			
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
			case WITHDRAWAL:
			
				break;
			}
		}
	}
}
