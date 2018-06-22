package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class CreateButton {
	JButton btn1;
public void createButton() {
 btn1= new JButton("회원가입");
	btn1.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			new Register();
		}
	});
	//this.add(btn1); this 는 상위 컴포넌트. 여기까지가 버튼 하나
}
}
