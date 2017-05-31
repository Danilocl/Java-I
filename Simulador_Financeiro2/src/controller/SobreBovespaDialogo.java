package controller;

import java.awt.Dimension;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class SobreBovespaDialogo extends JDialog {

	public SobreBovespaDialogo(MainFrame mainframe) {
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
				"A Bolsa de Valores de São Paulo - Bovespa era a bolsa oficial do Brasil, até iniciar um processo de fusão com a BM&F que culminou na criação de uma nova instituição, denominada BM&FBovespa no dia 8 de maio de 2008. Após nova fusão, desta vez com a CETIP, ocorrida em 23 de março de 2017, a instituição passou a ser denominada B3 - BRASIL, BOLSA, BALCÃO. Sua sede localiza-se no centro da cidade de São Paulo e seu principal índice econômico é o IBOVESPA."
				+ "\n\nLink para acesso: http://www.bmfbovespa.com.br/pt_br/index.htm");
		area.setPreferredSize(new Dimension(300, 150));
		area.setLineWrap(true);
		area.setWrapStyleWord(true);

		JScrollPane scrollPane = new JScrollPane(area, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);

		add(scrollPane);
		area.setEditable(false);

	}
}
