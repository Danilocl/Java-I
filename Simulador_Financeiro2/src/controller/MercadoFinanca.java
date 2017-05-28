package controller;

import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import model.Mercado;



public class MercadoFinanca extends JFrame {

	private JTable tabela;

	JPanel panel = new JPanel(new GridBagLayout());
	JPanel painelFundo;
	JScrollPane barraRolagem;

	
	public MercadoFinanca(MainFrame mainframe) {
		build();
	}

	Object[][] dados = { { "Petrobras", "15/05/17", "16/05/17","65.55","70.25","35.55" },
			{ "Petrobras", "15/05/17", "16/05/17","65.55","70.25","35.55" },
			{"Petrobras", "15/05/17", "16/05/17","65.55","70.25","35.55" } };

	String[] colunas = { "Empresa", "Dia Anterior", "Dia Posterior", "Taxa de Abertura","Taxa Alta","Taxa Baixa" };
	private void build() {

		setLayout(new GridBagLayout());
		pack();
		setMinimumSize(new Dimension(500, 400));
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setVisible(true);
		buildTable();
	}

	private void buildTable() {
		panel.setLayout(new GridLayout(0, 1));
		tabela = new JTable(dados, colunas);
		barraRolagem = new JScrollPane(tabela);
		panel.add(barraRolagem);

		setSize(500, 120);
		setVisible(true);

		add(panel, new GBC(0, 0).both());

	}


}
