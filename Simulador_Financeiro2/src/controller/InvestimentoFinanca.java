package controller;

import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import model.Mercado;

public class InvestimentoFinanca extends JDialog {

	private JTable tabela;

	JPanel panel = new JPanel(new GridBagLayout());
	JPanel painelFundo;
	JScrollPane barraRolagem;

	Object[][] dados = { { "Ana Monteiro", "48 9923-7898", "ana.monteiro@gmail.com", "fdfd" },
			{ "João da Silva", "48 8890-3345", "joaosilva@hotmail.com", "fdfd" },
			{ "Pedro Cascaes", "48 9870-5634", "pedrinho@gmail.com", "fdfd" } };

	String[] colunas = { "Nome", "Telefone", "Email", "fdf" };

	public InvestimentoFinanca(MainFrame mainframe) {
		build();
	}

	private void build() {

		setLayout(new GridBagLayout());
		janela();
		addbuildInvestimento();
		pack();
		setMinimumSize(new Dimension(500, 400));
		setLocationRelativeTo(null);
		setResizable(false);
		setModal(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setVisible(true);
		buildMenu();
		janela();
	}

	private void addbuildInvestimento() {

		JPanel panel = new JPanel(new GridBagLayout());

		JLabel empresa = new JLabel("Empresa:");
		panel.add(empresa, new GBC(0, 0).top());
		String[] items = { "Petrobras", "Vale","Amazon" };
		JComboBox<String> comboBox = new JComboBox<>(items);
		panel.add(comboBox, new GBC(1, 0).horizontal());

		JLabel taxainvest = new JLabel("Taxa de Investimento:");
		panel.add(taxainvest, new GBC(0, 1));
		JTextField taxa = new JTextField(20);
		panel.add(taxa, new GBC(1, 1).horizontal());

		JLabel tipoinvest = new JLabel("Tipo de investimento:");
		panel.add(tipoinvest, new GBC(0, 2));
		JTextField invest = new JTextField(20);
		panel.add(invest, new GBC(1, 2).horizontal());

//		add(panel, new GBC(0, 0).both());
//		panel.setLayout(new GridLayout(0, 1));
//		tabela = new JTable(dados, colunas);
//		barraRolagem = new JScrollPane(tabela);
//		panel.add(barraRolagem);
//
//		setSize(500, 120);
//		setVisible(true);
//
		add(panel, new GBC(0, 0).both());

	}

	private void buildMenu() {
		JMenuBar barra = new JMenuBar();
		setJMenuBar(barra);

		JMenu sobre = new JMenu("Sobre");
		barra.add(sobre);

		JMenu ajuda = new JMenu("Ajuda");
		barra.add(ajuda);

	}

	private void janela() {

	}
}
