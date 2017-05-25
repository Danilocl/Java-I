package Janela;

import java.awt.Dimension;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;

import Janela.MainFrame;

public class SobreDialogo extends JDialog {
	
		public SobreDialogo(MainFrame mainframe) {
			build(mainframe);
		}

		private void build(MainFrame mainframe) {
			addComponents();
			setSize(300, 200);
			// setIconImage();
			setMinimumSize(new Dimension(300, 200));
			setLocationRelativeTo(mainframe);
			setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			setVisible(true);
		}

		private void addComponents() {
			String s = "Programa de simulação - Versão beta";
			JLabel label = new JLabel(s);
			add(label);
		}
}
