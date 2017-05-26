package controller;

import java.awt.Dimension;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import controller.MainFrame;

public class SobreDialogoTesouro extends JDialog {

	public SobreDialogoTesouro(MainFrame mainframe) {

		build(mainframe);
	}

	private void build(MainFrame mainframe) {

		addComponents();
		setSize(400,300);
		setMinimumSize(new Dimension(300, 200));
		setLocationRelativeTo(mainframe);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setVisible(true);

	}

	private void addComponents() {

		String s = "O Tesouro Direto é uma iniciativa do Tesouro Nacional, em conjunto com a BM&F Bovespa, para comercializar os títulos públicos federais para pessoas físicas. O programa surgiu em 2002 para facilitar o acesso aos títulos, que podem ser adquiridos a partir de 30 reais e em 3 tipos: Tesouro Prefixado, Tesouro Selic e o Tesouro IPCA. A Taxa anual sobre o valor dos títulos é de 0,3%, referente aos serviços de guarda, às informações e movimentações dos saldos. O Imposto de renda é  sobre o rendimento e regressivo, ou seja, quanto mais tempo você investe, menos você paga quando resgatar. Até 180 dias - 22,5% De 181 a 360 dias - 20% De 361 a 720 dias - 17,5% Acima de 720 dias - 15%";
		JLabel label = new JLabel(s);
		add(label);
		
	}

}
