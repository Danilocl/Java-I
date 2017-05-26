package controller;

import java.awt.Dimension;
import java.awt.GridBagLayout;

import javax.swing.JDialog;
import javax.swing.JFrame;

public class MercadoFinanca extends JDialog {

	public MercadoFinanca(MainFrame mainframe) {
		build();
	}

	private void build() {
		
		setLayout(new GridBagLayout());
		addbuildMercado();
		pack();
		setMinimumSize(new Dimension(500, 400));
		setLocationRelativeTo(null);
		setResizable(false);
		setModal(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setVisible(true);
	}

	private void addbuildMercado() {
		// TODO Auto-generated method stub
		
	}
}
