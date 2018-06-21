package view;

import javax.swing.JOptionPane;


import domain.*;
import service.*;
import serviceImpl.MemberServiceImpl;

enum IndexButt {
	EXIT, JOIN, ADD, LIST, FIND_BY_ID, FIND_BY_NAME, COUNT, UPDATE, WITHDRAWAL
}
public class Index {

	public static void main(String[] args) {
		IndexButt[] buttons = { IndexButt.EXIT, IndexButt.JOIN, IndexButt.ADD, IndexButt.LIST,
				IndexButt.FIND_BY_ID, IndexButt.FIND_BY_NAME, IndexButt.COUNT, IndexButt.UPDATE,
				IndexButt.WITHDRAWAL };
		// Account account = null;
		MemberService service = new MemberServiceImpl();
		MemberBean member = null;
		while (true) {
			IndexButt select = (IndexButt) JOptionPane.showInputDialog(null, // frame
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
