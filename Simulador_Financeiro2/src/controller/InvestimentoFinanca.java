package controller;

import java.awt.Dimension;
import java.awt.GridBagLayout;

import javax.swing.JDialog;
import javax.swing.JFrame;

public class InvestimentoFinanca extends JDialog {

	public InvestimentoFinanca(MainFrame mainframe) {
		build();
	}

	private void build() {
		
		setLayout(new GridBagLayout());
		addbuildInvestimento();
		pack();
		setMinimumSize(new Dimension(500, 400));
		setLocationRelativeTo(null);
		setResizable(false);
		setModal(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setVisible(true);
	}

	private void addbuildInvestimento() {
		// TODO Auto-generated method stub
		
	}
}
