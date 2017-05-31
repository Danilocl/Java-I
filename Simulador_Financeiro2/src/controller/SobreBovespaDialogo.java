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
				"A Bolsa de Valores de S�o Paulo - Bovespa era a bolsa oficial do Brasil, at� iniciar um processo de fus�o com a BM&F que culminou na cria��o de uma nova institui��o, denominada BM&FBovespa no dia 8 de maio de 2008. Ap�s nova fus�o, desta vez com a CETIP, ocorrida em 23 de mar�o de 2017, a institui��o passou a ser denominada B3 - BRASIL, BOLSA, BALC�O. Sua sede localiza-se no centro da cidade de S�o Paulo e seu principal �ndice econ�mico � o IBOVESPA."
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
