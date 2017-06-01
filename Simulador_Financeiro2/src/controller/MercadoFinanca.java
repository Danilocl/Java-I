package controller;

import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
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

	Object[][] dados = { { "Petrobras", "15/05/17", "16/05/17", "70.55", "30.25", "35.55", "R$ 185,134" },
			{ "Amazon", "19/05/17", "20/05/17", "45.55", "55.25", "67.55", "R$ 1.616,75" },
			{ "Vale", "21/05/17", "22/05/17", "27.55", "46.25", "29.55", "R$ 141,609" },
			{ "Bradesco", "23/06/17", "24/06/17", "37.55", "76.25", "40.55", "R$ 183,141 " },
			{ "Santander", "24/06/17", "25/06/17", "66.55", "55.25", "40.55", "R$ 104,746" },
			{ "Telefônica", "26/06/17", "27/06/17", "41.55", "35.25", "40.55", "R$ 74,090" },
			{ "Cielo", "30/06/17", "29/06/17", "70.55", "80.25", "40.55", "R$ 65,475" },
			{ "Nordo ON", "01/07/17", "02/07/17", "70.55", "80.25", "40.55", "R$ 39,729" },
			{ "Ultrapar", "03/07/17", "04/07/17", "70.55", "80.25", "40.55", "R$ 39,182" },
			{ "CCR", "05/07/17", "06/07/17", "70.55", "80.25", "40.55", "R$ 35,754" },
			{ "Brasil Foods", "07/07/17", "08/07/17", "70.55", "80.25", "40.55", "R$ 32,328 " },
			{ "Lojas Americanas", "09/07/17", "10/07/17", "70.55", "80.25", "40.55", "R$ 24,905" },
			{ "Tim", "11/07/17", "12/07/17", "70.55", "80.25", "40.55", "R$ 24,840" },
			{ "Pão de Açúcar", "13/07/17", "14/07/17", "70.55", "80.25", "40.55", "R$ 19,174" },
			{ "Renner", "15/07/17", "16/07/17", "70.55", "80.25", "40.55", "R$ 19,036" },
			{ "Hypermarcas", "17/07/17", "18/07/17", "70.55", "80.25", "40.55", "R$ 19,003 " },
			{ "Raia Drogasil", "19/07/17", "19/07/17", "70.55", "80.25", "40.55", "R$ 22,285" } };

	String[] colunas = { "Empresa", "Dia Anterior", "Dia Posterior", "Taxa de Abertura", "Taxa Alta", "Taxa Baixa",
			"valor de Mercado" };

	private void build() {

		setLayout(new GridBagLayout());
		buildButton();
		pack();
		setTitle("Mercado");
		setMinimumSize(new Dimension(710, 400));
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

		add(panel, new GBC(0, 1).both());

	}

	private void buildButton() {
		JPanel panel = new JPanel(new GridBagLayout());
		JButton voltar = new JButton("Voltar");
		panel.add(voltar, new GBC(1, 2));
		add(panel, new GBC(0, 2).right());

		voltar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				dispose();
			}
		});
	}
}