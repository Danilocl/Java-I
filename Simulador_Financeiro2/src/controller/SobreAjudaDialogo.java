package controller;

import java.awt.Dimension;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class SobreAjudaDialogo extends JDialog {

	public SobreAjudaDialogo(MainFrame mainframe) {

		build(mainframe);
	}

	private void build(MainFrame mainframe) {
		addComentario();
		setSize(400, 300);
		setResizable(false);
		setMinimumSize(new Dimension(300, 200));
		setLocationRelativeTo(mainframe);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setVisible(true);

	}

	private void addComentario() {
		
		JTextArea area = new JTextArea(
				"Programa de Simulação de Investimentos. versão 1.0V");
		area.setPreferredSize(new Dimension(300, 150));
		area.setLineWrap(true);
		area.setWrapStyleWord(true);

		JScrollPane scrollPane = new JScrollPane(area, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);

		add(scrollPane);
		area.setEditable(false);
	}
}