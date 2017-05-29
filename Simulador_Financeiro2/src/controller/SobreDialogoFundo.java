package controller;

import java.awt.Dimension;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class SobreDialogoFundo extends JDialog {

	public SobreDialogoFundo(MainFrame mainframe) {

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
				"O fundo de investimento é um mecanismo que reúne o dinheiro de diversas pessoas (chamadas de cotistas) com o objetivo de contratar um gestor profissional para cuidar do dinheiro ali investido. O objetivo final dos cotistas é obter ganhos a partir da aplicação do mercado financeiro. Existem diversas modalidades como Fundo de Ações, Fundos de Renda Fixa, Fundo Multimercado, entre outras. Além dessa aplicação ser tributada pelo imposto de renda, existem alguns custos como taxa de administração, taxa de Performance e taxa de resgate.");
		area.setPreferredSize(new Dimension(300, 150));
		area.setLineWrap(true);
		area.setWrapStyleWord(true);

		JScrollPane scrollPane = new JScrollPane(area, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);

		add(scrollPane);
		area.setEditable(false);
	}
}
