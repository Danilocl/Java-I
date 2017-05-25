package janela2;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;

public class MainFrame extends JFrame {

	public void MainFrame() {
		build();
	}

	public void build() {
		setLayout(new GridBagLayout());
		setSize(600, 400);
		setMinimumSize(new Dimension(400, 300));
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		buildMenu();
	}
	
	private void buildMenu() {
		JMenuBar menubar = new JMenuBar();
		setJMenuBar(menubar);
		
		JMenu sobre = new JMenu("Sobre");
		menubar.add(sobre);
		
		JMenu ajuda = new JMenu("Ajuda");
		sobre.add(ajuda);
		
		
		
		
	}

}
