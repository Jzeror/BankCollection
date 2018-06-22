package view;

import java.awt.GridLayout;

import javax.swing.JComboBox;
import javax.swing.JPanel;

public class CreateComboBox {
	JPanel centerPan;
	JComboBox<?> combo;
	String[] menu = { "사용자 등록", "직원 추가" };

	public void create() {
		centerPan = new JPanel();
		combo = new JComboBox<>(menu);
		centerPan.setLayout(new GridLayout(8, 1));
		centerPan.add(combo);
	}
}
