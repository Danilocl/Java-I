package controller;

import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
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
		addbuildInvestimento();
		buildMenu();
		pack();
		setMinimumSize(new Dimension(500, 400));
		setLocationRelativeTo(null);
		setResizable(false);
		setModal(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setVisible(true);
	}

	private void addbuildInvestimento() {

		JPanel panel = new JPanel(new GridBagLayout());

		JLabel empresa = new JLabel("Empresa:");
		panel.add(empresa, new GBC(0, 0).top());
		String[] items = { "Petrobras", "Vale", "Amazon" };
		JComboBox<String> comboBox = new JComboBox<>(items);
		panel.add(comboBox, new GBC(1, 0).horizontal());

		JLabel vlrinvest = new JLabel("Valor a ser Investido:");
		panel.add(vlrinvest, new GBC(0, 1));
		JTextField vlr = new JTextField(20);
		panel.add(vlr, new GBC(1, 1).horizontal());

		JLabel tipoinvest = new JLabel("Tipo de investimento:");
		panel.add(tipoinvest, new GBC(0, 2));
		JTextField invest = new JTextField(20);
		panel.add(invest, new GBC(1, 2).horizontal());

		JLabel meses = new JLabel("Período em meses:");
		panel.add(meses, new GBC(0, 3));
		JTextField mesesfield = new JTextField(20);
		panel.add(mesesfield, new GBC(1, 3).horizontal());

		JLabel juros = new JLabel("Taxa de Juros:");
		panel.add(juros, new GBC(0, 4));
		JTextField jurosfield = new JTextField(20);
		panel.add(jurosfield, new GBC(1, 4).horizontal());
		jurosfield.setEditable(false);

		JLabel taxainvest = new JLabel("Taxa de Investimento:");
		panel.add(taxainvest, new GBC(0, 5));
		JTextField taxa = new JTextField(20);
		panel.add(taxa, new GBC(1, 5).horizontal());
		taxa.setEditable(false);

		JLabel total = new JLabel("Total:");
		panel.add(total, new GBC(0, 6));
		JTextField totalfield = new JTextField(20);
		panel.add(totalfield, new GBC(1, 6).horizontal());
		totalfield.setEditable(false);

		JButton cancel = new JButton("Voltar");
		panel.add(cancel, new GBC(1, 7).right());
		cancel.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				
			}
		});

		JButton sendinvest = new JButton("Investir");
		panel.add(sendinvest, new GBC(1, 7).left());
		
		sendinvest.addActionListener(new ActionListener() {
			
			private String title;

			@Override
			public void actionPerformed(ActionEvent e) {
				
			int resposta = JOptionPane.showConfirmDialog(null, "Deseja investir?",title, JOptionPane.YES_NO_OPTION);
				if(resposta == JOptionPane.YES_OPTION){
					JOptionPane.showMessageDialog(null, "XP Investimentos = https://investimentos.xpi.com.br/");
					JOptionPane.showMessageDialog(null, "Tesouro Fazenda = http://www.tesouro.fazenda.gov.br/");
					
				}else if (resposta == JOptionPane.NO_OPTION){
					dispose();
				}
			}

		});

		// add(panel, new GBC(0, 0).both());
		// panel.setLayout(new GridLayout(0, 1));
		// tabela = new JTable(dados, colunas);
		// barraRolagem = new JScrollPane(tabela);
		// panel.add(barraRolagem);
		//
		// setSize(500, 120);
		// setVisible(true);
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

		add(panel, new GBC(0, 0));
	}

	private void janela() {

	}
}
