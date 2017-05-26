package controller;

import java.awt.Dimension;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class SobreAjudaDialogo extends JDialog {

	public SobreAjudaDialogo(MainFrame mainframe) {

		build(mainframe);
	}

	private void build(MainFrame mainframe) {
		addComentario();
		setSize(400, 300);
		setMinimumSize(new Dimension(300, 200));
		setLocationRelativeTo(mainframe);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setVisible(true);

	}

	private void addComentario() {
		
		String s = "Programa de versão 1.0V";
		JLabel j = new JLabel(s);
		add(j);
	}
}