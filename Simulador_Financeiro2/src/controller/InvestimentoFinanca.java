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

public class InvestimentoFinanca extends JFrame {

	private JTable tabela;

	JScrollPane barraRolagem;
	
	public InvestimentoFinanca(MainFrame mainframe) {
		build();
	}

	Object[][] dados = { { "Tesouro IPCA + 2024", "15/08/2024", "5.50%", "R$ 40.80" },
			{ "Tesouro IPCA + 2035", "15/08/2035", "5.49%", "R$ 34.55" },
			{ "Tesouro IPCA + 2045", "15/05/2045", "5.49%", "R$ 33.80" }, 
			{ "Tesouro IPCA + Com Juros Semestrais 2026", "15/05/2026", "5.62%", "R$ 31.30" }};

	String[] colunas = { "Título", "Vencimento", "Taxa Rendimento", "Valor Minimo" };

	private void build() {

		setLayout(new GridBagLayout());
		buildInvestimento();
		pack();
		setTitle("Investimentos");
		buildAcessoInvest();
		buildTable();
		setMinimumSize(new Dimension(500, 400));
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setVisible(true);
	}
	
	private void buildTable() {
		JPanel panel = new JPanel(new GridBagLayout());
		panel.setLayout(new GridLayout(1, 2));
		tabela = new JTable(dados, colunas);
		barraRolagem = new JScrollPane(tabela);
		panel.add(barraRolagem);

		setSize(500, 120);
		setVisible(true);

		add(panel, new GBC(0, 2).both());

	}
	
	private void buildAcessoInvest() {
		JPanel panel = new JPanel(new GridBagLayout());
		panel.setLayout(new GridLayout(0, 2));
		
		JButton tesouro = new JButton("Tesouro");
		panel.add(tesouro, new GBC(1, 2));
		add(panel,new GBC(0,1).right());
		tesouro.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JButton fundo = new JButton("Fundo");
		panel.add(fundo, new GBC(1, 2));
		add(panel,new GBC(0,2).right());
		
		setSize(500, 120);
		setVisible(true);

		add(panel, new GBC(0, 1));

	}
	
	
	private void buildInvestimento() {

		JPanel panel = new JPanel(new GridBagLayout());
		JButton voltar = new JButton("Voltar");
		panel.add(voltar, new GBC(1, 2));
		add(panel,new GBC(0,3).right());
		voltar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				
			}
		});

		JButton sendinvest = new JButton("Investir");
		panel.add(sendinvest, new GBC(0, 2));
		add(panel,new GBC(0,3).right());
		
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

	}

}
