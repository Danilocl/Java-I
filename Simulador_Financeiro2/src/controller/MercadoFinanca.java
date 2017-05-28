package controller;

import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class MercadoFinanca extends JFrame {

	private JTable tabela;

	JPanel panel = new JPanel(new GridBagLayout());
	JPanel painelFundo;
	JScrollPane barraRolagem;

	public MercadoFinanca(MainFrame mainframe) {
		build();
	}

	Object[][] dados = { { "Ana Monteiro", "48 9923-7898", "ana.monteiro@gmail.com" },
			{ "João da Silva", "48 8890-3345", "joaosilva@hotmail.com" },
			{ "Pedro Cascaes", "48 9870-5634", "pedrinho@gmail.com" } };

	String[] colunas = { "Nome", "Telefone", "Email"};
	
	
	private void build() {

		setLayout(new GridBagLayout());
		pack();
		setMinimumSize(new Dimension(500, 400));
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setVisible(true);
		getColumnCount();
		buildTable();
	}

	private void buildTable() {
		panel.setLayout(new GridLayout(0, 1));
		getColumnCount();
		tabela = new JTable(dados, colunas);
		barraRolagem = new JScrollPane(tabela);
		panel.add(barraRolagem);

		setSize(500, 120);
		setVisible(true);

		add(panel, new GBC(0, 0).both());

	}

	public int getColumnCount() {
		return colunas.length;
	}

}
