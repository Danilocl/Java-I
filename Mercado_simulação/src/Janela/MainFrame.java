package Janela;

import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTable;

//import view.ClientDialog;
import Janela.GBC;
import Janela.MainFrame;

public class MainFrame extends JFrame {

	private JTable table;

	/**
	 * Construtor.
	 */
	public MainFrame() {
		build();
	}

	/**
	 * Constrói a janela.
	 */
	private void build() {
		setLayout(new GridBagLayout());
		buildMenu();
		setTitle("Gestão de Clientes");
		// buildComponents();
		setSize(600, 400);
		// setIconImage();
		setMinimumSize(new Dimension(400, 300));
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		buildButton();
	}

	private void buildButton() {
		JPanel panel = new JPanel(new GridBagLayout());
		JButton simulação = new JButton("Simulação");
		panel.add(simulação, new GBC(1,0).horizontal());
		JButton mercado = new JButton("Mercado");
		panel.add(mercado, new GBC(2,0).horizontal());
		JButton investimento = new JButton("Investimento");
		panel.add(investimento, new GBC(3,0).horizontal());

		add(panel, new GBC(1, 0));
		
		// newButton.addActionListener(new ActionListener()
		// {

		// @Override
		// public void actionPerformed(ActionEvent e) {
		// new ClientDialog(MainFrame.this);
		// }
		// });

	}

	private void buildMenu() {

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		JMenu aboutMenu = new JMenu("Sobre");
		menuBar.add(aboutMenu);
		JMenu helpMenu = new JMenu("Ajuda");
		menuBar.add(helpMenu);
		JMenuItem exitItem = new JMenuItem("Sair");
		helpMenu.add(exitItem);
		
		aboutMenu.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new SobreDialogo(MainFrame.this);
			}
		});


		aboutMenu.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});

	}
	

}
