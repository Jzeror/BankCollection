package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CreateTextField {
	JTextField idTxt;
	JPanel idPan;

	public void createButton() {
		idTxt = new JTextField(); // 텅 비어있어야함. 입력을 받아야하니까
		idPan = new JPanel();
		idPan.add(idTxt);
	}
}
