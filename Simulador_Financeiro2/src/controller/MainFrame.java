package controller;

import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTable;

import model.Investimento;

public class MainFrame extends JFrame {

	private JTable table;

	public MainFrame() {
		build();
	}

	private void build() {
		setLayout(new GridBagLayout());
		buildMenu();
		buildButtonPanel();
		setSize(800, 600);
		setMinimumSize(new Dimension(400, 300));
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setIconImage();
		

	}

	private void buildMenu() {

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu investimentoMenu = new JMenu("Investimento");
		menuBar.add(investimentoMenu);
		JMenu sobreMenu = new JMenu("Tipos");
		investimentoMenu.add(sobreMenu);
		JMenu ajudaMenu = new JMenu("Ajuda");
		menuBar.add(ajudaMenu);

		JMenuItem tesouroItem = new JMenuItem("Tesuro");
		sobreMenu.add(tesouroItem);
		tesouroItem.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				new SobreDialogoTesouro(MainFrame.this);
			}
		});

		JMenuItem investimentoItem = new JMenuItem("Fundo de Investimento");
		sobreMenu.add(investimentoItem);
		investimentoItem.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new SobreDialogoFundo(MainFrame.this);
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

		JMenuItem sairMenuItem = new JMenuItem("Sair");
		ajudaMenu.add(sairMenuItem);
		sairMenuItem.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
	}

	
	private void buildButtonPanel() {

		JPanel panel = new JPanel(new GridBagLayout());
		JButton investimento = new JButton("Investimento");
		panel.add(investimento, new GBC(1, 3).top().horizontal());
		
		investimento.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new InvestimentoFinanca(MainFrame.this);
			}
		});
		
		ImageIcon img = new ImageIcon("images/simulacao-casa.jpg");
		JButton mercado = new JButton("Mercado", img);
		panel.add(mercado, new GBC(2, 3).horizontal());
		mercado.addActionListener(new ActionListener() {
		
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new MercadoFinanca(MainFrame.this);	
			}
		});
		
		JButton simulacao = new JButton("Simulação");;
		panel.add(simulacao, new GBC(3, 3).horizontal());
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
