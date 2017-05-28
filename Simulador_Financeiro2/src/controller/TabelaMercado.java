package controller;

import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class TabelaMercado extends DefaultTableModel {

	private JTable tabela;

	JPanel panel = new JPanel(new GridBagLayout());
	JPanel painelFundo;
	JScrollPane barraRolagem;

	public void main() {
		 buildTable();
	}
	Object[][] dados = { { "Ana Monteiro", "48 9923-7898", "ana.monteiro@gmail.com" },
			{ "João da Silva", "48 8890-3345", "joaosilva@hotmail.com" },
			{ "Pedro Cascaes", "48 9870-5634", "pedrinho@gmail.com" } };

	String[] colunas = { "Nome", "Telefone", "Email" };

	private void buildTable() {
		panel.setLayout(new GridLayout(0, 1));
		getColumnCount();
		tabela = new JTable(dados, colunas);
		barraRolagem = new JScrollPane(tabela);
		panel.add(barraRolagem);

		tabela.setSize(500, 120);
		tabela.setVisible(true);

		tabela.add(panel, new GBC(0, 0).both());
		

	}
}
