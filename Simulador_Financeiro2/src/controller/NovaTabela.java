package controller;

import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

 public class NovaTabela extends JFrame {

	private JTable tabela;

	JScrollPane barraRolagem;
	
	public NovaTabela(MainFrame mainframe) {
		build(mainframe);
	}

	Object[][] dados = { { "Easynvest IPCA + 2024", "15/08/2024", "5.50%", "R$ 40.80" },
			{ "Easynvest IPCA + 2035", "15/08/2035", "5.49%", "R$ 34.55" },
			{ "Easynvest IPCA + 2045", "15/05/2045", "5.49%", "R$ 33.80" }, 
			{ "Easynvest IPCA + Juros Semestrais 2026", "15/05/2026", "5.62%", "R$ 31.30" }};

	String[] colunas = { "Título", "Vencimento", "Taxa Rendimento", "Valor Minimo" };
	
	Object[][] dados2 = { { "Vale IPCA + 2024", "15/08/2024", "5.50%", "R$ 40.80" },
			{ "Vale IPCA + 2035", "15/08/2035", "5.49%", "R$ 34.55" },
			{ "Vale IPCA + 2045", "15/05/2045", "5.49%", "R$ 33.80" }, 
			{ "Vale IPCA + Juros Semestrais", "15/05/2026", "5.62%", "R$ 31.30" }};

	String[] colunas2 = { "Título", "Vencimento", "Taxa Rendimento", "Valor Minimo" };

	private void build(MainFrame mainframe) {
		setLayout(new GridBagLayout());
		buildInvestimento();
		pack();
		setTitle("Investimentos");
//		buildAcessoInvest();
		buildTable();
		buildTable2();
		setMinimumSize(new Dimension(790, 400));
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

		setSize(500,120);
		setVisible(true);

		add(panel, new GBC(0, 2).both());

	}
	
	private void buildTable2() {
		JPanel panel = new JPanel(new GridBagLayout());
		panel.setLayout(new GridLayout(1, 2));
		tabela = new JTable(dados2, colunas2);
		barraRolagem = new JScrollPane(tabela);
		panel.add(barraRolagem);

		setSize(500, 120);
		setVisible(true);

		add(panel, new GBC(0, 3).both());

	}
	
	private void buildInvestimento() {

		JPanel panel = new JPanel(new GridBagLayout());
		JButton voltar = new JButton("Voltar");
		panel.add(voltar, new GBC(2,5));
		add(panel,new GBC(0,5).right());
		voltar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				
			}
		});

		JButton sendinvest = new JButton("Investir");
		panel.add(sendinvest, new GBC(1,5));
		add(panel,new GBC(0,5).right());
		
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

		JButton back = new JButton("Anterior");
		panel.add(back,new GBC(3, 5));
		add(panel,new GBC(0, 5).right());
		back.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				new InvestimentoFinanca(null);
			}
		});
		
	}
 }