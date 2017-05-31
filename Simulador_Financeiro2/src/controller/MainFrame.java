package controller;

import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTable;

import model.Investimento;

public class MainFrame extends JFrame {

	private JTable table;
	JLabel recado = new JLabel();
	ImageIcon fundo = new ImageIcon(getClass().getResource("/images/investment.png"));
	
	public MainFrame() {
		build();
	}

	private void build() {
	    setLayout(new GridBagLayout());
	    buildMenu();
	    setResizable(false);
		setTitle("Gestão de Investimentos");
		buildButtonPanel();
		setSize(600, 400);
		setMinimumSize(new Dimension(400, 300));
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		recado.setIcon(fundo);
		add(recado);
		setIconImage();
	}

	private void buildMenu() {

		JFrame frame = new JFrame("Faça já sua simulação");
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu arquivoMenu = new JMenu("Arquivo");
		menuBar.add(arquivoMenu);
		JMenu investimentoMenu = new JMenu("Investimentos");
		arquivoMenu.add(investimentoMenu);
		JMenu mercadoMenu = new JMenu("Mercado");
		arquivoMenu.add(mercadoMenu);
		JMenu ajudaMenu = new JMenu("Ajuda");
		menuBar.add(ajudaMenu);

		JMenuItem tesouroItem = new JMenuItem("Tesuro");
		investimentoMenu.add(tesouroItem);
		tesouroItem.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				new SobreDialogoTesouro(MainFrame.this);
			}
		});

		JMenuItem fundoItem = new JMenuItem("Fundo de Investimento");
		investimentoMenu.add(fundoItem);
		fundoItem.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new SobreDialogoFundo(MainFrame.this);
			}
		});
		
		JMenuItem bovespaItem = new JMenuItem("Bovespa");
		mercadoMenu.add(bovespaItem);
		bovespaItem.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new SobreBovespaDialogo(MainFrame.this);
			}
		});

		JMenuItem ajudaItem = new JMenuItem("Sobre");
		ajudaMenu.add(ajudaItem);
		ajudaItem.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new SobreAjudaDialogo(MainFrame.this);
			}
		});

		JMenuItem sairmenuItem = new JMenuItem("Sair");  	  
		arquivoMenu.add(sairmenuItem);  
		sairmenuItem.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
		});
	}

	private void buildButtonPanel() {

		JPanel panel = new JPanel(new GridBagLayout());
		JButton investimento = new JButton("Investimento");
		panel.add(investimento, new GBC(1, 3).insets(-250,1,1,1).horizontal());

		investimento.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new InvestimentoFinanca(MainFrame.this);
			}
		});

		JButton mercado = new JButton("Mercado");
		panel.add(mercado, new GBC(2, 3).insets(-250,1,1,1).horizontal());
		mercado.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new MercadoFinanca(MainFrame.this);
			}
		});

		JButton simulacao = new JButton("Simulador");
		panel.add(simulacao, new GBC(3, 3).insets(-250,1,1,1).horizontal());
		simulacao.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				new SimuladorFinanca(MainFrame.this);
			}
		});

		add(panel, new GBC(1, 0).both());

	}

	public void setIconImage() {
		URL iconimage = getClass().getResource("/images/Investments_Insurance-512.png");
		ImageIcon icon = new ImageIcon(iconimage);
		setIconImage(icon.getImage());
	}
}