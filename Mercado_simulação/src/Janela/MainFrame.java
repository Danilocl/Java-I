package Janela;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridBagLayout;
import java.awt.Image;
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

//import view.ClientDialog;
import Janela.GBC;
import Janela.MainFrame;

public class MainFrame extends JFrame {

	private Image image;

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
		setTitle("Faça já sua simulação!!");
		// buildComponents();
		setSize(600, 400);
		setIconImage();
		setMinimumSize(new Dimension(400, 300));
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		buildButton();
		setimage();
		
	}

	private void buildButton() {
		JPanel panel = new JPanel(new GridBagLayout());

		JButton simulação = new JButton("Simulação");
		panel.add(simulação, new GBC(1, 3).horizontal());
		JButton mercado = new JButton("Mercado");
		panel.add(mercado, new GBC(2, 3).horizontal());
		JButton investimento = new JButton("Investimento");
		panel.add(investimento, new GBC(3, 3).horizontal());

		add(panel, new GBC(1, 0).both());

	}

	public void setimage() {

		this.image = this.getImage("/images/grafico.jpg");
		this.setLayout(new BorderLayout());
	}

	public Image getImage(String path) {
		URL imageURL = getClass().getResource(path);
		if (imageURL == null)
			return null;
		return new ImageIcon(imageURL).getImage();

	}
	
	public void paintComponent(Graphics g) {
		super.paintComponents(g);
		Dimension desktop = this.getSize();
		double width = desktop.getWidth();
		double height = desktop.getHeight();
		Image background = new ImageIcon(this.image.getScaledInstance((int) width, (int) height,1)).getImage();
		g.drawImage(background,0,0, this);
	}

	public void setIconImage() {
		URL iconimage = getClass().getResource("/images/table.png");
		ImageIcon icon = new ImageIcon(iconimage);
		setIconImage(icon.getImage());
	}

	private void buildMenu() {

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu helpMenu = new JMenu("Ajuda");
		menuBar.add(helpMenu);

		JMenuItem aboutMenu = new JMenuItem("Sobre");
		helpMenu.add(aboutMenu);
		aboutMenu.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new SobreDialogo(MainFrame.this);
			}
		});

		JMenuItem exitItem = new JMenuItem("Sair");
		helpMenu.add(exitItem);
		exitItem.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});

	}

}
