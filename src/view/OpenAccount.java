package view;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import controller.AccountController;
import controller.AdminController;
import controller.MemberController;
import domain.AccountBean;
import domain.StaffBean;
import domain.UserBean;

public class OpenAccount extends JFrame{

	private static final long serialVersionUID = 1L;
	JLabel topLab, idLab, passLab, nameLab;
	JTextField idTxt, passTxt, nameTxt;
	JButton addBtn;
	JPanel bottomPan, centerPan, idPan, passPan, namePan;
	JComboBox<?> combo;
	String[] menu = { "보통예금", "마이너스통장" };

	public OpenAccount() {
		makeGui(); // 화면구성
		this.setSize(400, 300);
		this.setVisible(true);
	}

	public void makeGui() {
		topLab = new JLabel("통장생성", JLabel.CENTER);

		combo = new JComboBox<>(menu);
		idLab = new JLabel("아이디 : ", JLabel.CENTER);
		idTxt = new JTextField(15);
		idPan = new JPanel();
		idPan.add(idLab);
		idPan.add(idTxt);

		passLab = new JLabel("비밀번호 : ");
		passTxt = new JTextField(15);
		passPan = new JPanel();
		passPan.add(passLab);
		passPan.add(passTxt);

		nameLab = new JLabel("이 름 : ");
		nameTxt = new JTextField(15);
		namePan = new JPanel();
		namePan.add(nameLab);
		namePan.add(nameTxt);

		centerPan = new JPanel();
		centerPan.setLayout(new GridLayout(8, 1));
		centerPan.add(combo);
		centerPan.add(idPan);
		centerPan.add(passPan);
		centerPan.add(namePan);

		addBtn = new JButton("추가");
		addBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				AccountBean ac = new AccountBean();
				ac.setUid(idTxt.getText());
				ac.setPass(passTxt.getText());
				ac.setName(nameTxt.getText());

				if (((String) combo.getSelectedItem()).equals(menu[0])) {
					AccountController.getInstance().account(ac);
				} else {
					StaffBean staff = new StaffBean();
					staff.setUid(idTxt.getText());
					staff.setPass(passTxt.getText());
					staff.setName(nameTxt.getText());

					AdminController.getInstance().add(staff);
				}
			}
		});

		bottomPan = new JPanel();
		bottomPan.add(addBtn);

		add(topLab, "North");
		add(centerPan, "Center");
		add(bottomPan, "South");
	}
	
}
