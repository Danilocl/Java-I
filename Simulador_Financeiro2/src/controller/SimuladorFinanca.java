package controller;

import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import model.Simulador;

public class SimuladorFinanca extends JDialog {



	public SimuladorFinanca(MainFrame mainframe) {
		build();
	}

	private void build() {

		setLayout(new GridBagLayout());
		addbuildSimulador();
		pack();
		setTitle("Simulador");
		setMinimumSize(new Dimension(500, 400));
		setLocationRelativeTo(null);
		setResizable(false);
		setModal(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setVisible(true);
	}

	private void addbuildSimulador() {
		JPanel panel = new JPanel(new GridBagLayout());

		JLabel vlrInicial = new JLabel("Valor Inicial:");
		panel.add(vlrInicial, new GBC(0, 0));
		JTextField vlrInicialField = new JTextField(20);
		panel.add(vlrInicialField, new GBC(1, 0).horizontal());
		
		JLabel vlrMensal = new JLabel("Valor Mensal:");
		panel.add(vlrMensal, new GBC(0, 1));
		JTextField vlrMensalField = new JTextField(20);
		panel.add(vlrMensalField, new GBC(1, 1).horizontal());

		JLabel taxaJuros = new JLabel("Taxa Juros:");
		panel.add(taxaJuros, new GBC(0, 2));
		JTextField taxaJurosField = new JTextField(20);
		panel.add(taxaJurosField, new GBC(1, 2).horizontal());
		// float valor3 = Float.parseFloat(taxaJurosField.getText());

		JLabel periodo = new JLabel("Periodo em anos:");
		panel.add(periodo, new GBC(0, 3));
		JTextField periodoField = new JTextField(20);
		panel.add(periodoField, new GBC(1, 3).horizontal());

		JLabel totalInvestido = new JLabel("Total Investido:");
		panel.add(totalInvestido, new GBC(0, 4));

		JTextField totalInvestidoField = new JTextField(20);
		panel.add(totalInvestidoField, new GBC(1, 4).horizontal());
		totalInvestidoField.setEditable(false);

		JLabel totalJuros = new JLabel("Total Ganho com Juros:");
		panel.add(totalJuros, new GBC(0, 5));
		JTextField totalJurosField = new JTextField(20);
		panel.add(totalJurosField, new GBC(1, 5).horizontal());
		totalJurosField.setEditable(false);

		JLabel total = new JLabel("Total:");
		panel.add(total, new GBC(0, 6));
		JTextField totalField = new JTextField(20);
		panel.add(totalField, new GBC(1, 6).horizontal());
		totalField.setEditable(false);

		JButton voltar = new JButton("Voltar");
		panel.add(voltar, new GBC(1, 7).right());

		voltar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});

		JButton Apagar = new JButton("Apagar");
		panel.add(Apagar, new GBC(1, 7).insets(1,130,1,1));
		Apagar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				vlrInicialField.setText(" ");
				vlrMensalField.setText(" ");
				taxaJurosField.setText(" ");
				periodoField.setText(" ");
				totalInvestidoField.setText(" ");
				totalJurosField.setText(" ");
				totalField.setText(" ");
			}
		});
		
		JButton calcular = new JButton("Calcular");
		panel.add(calcular, new GBC(1, 7).insets(1,-35,1,1));

		calcular.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try{
	
				double capital = Double.parseDouble((vlrInicialField.getText()));
				double acumMes = Double.parseDouble(vlrMensalField.getText());
				double juros = Double.parseDouble(taxaJurosField.getText());
				double periodo = (int) Double.parseDouble(periodoField.getText());

				Simulador sm = new Simulador(capital, acumMes, juros, periodo);

				float valorInvestido = (float) ((sm.getValorInicial() + ((sm.getValorMensal()) * sm.getPeriodo()) * 12));
				totalInvestidoField.setText(String.valueOf(valorInvestido));
			
				float vlrJuros = (float) ((sm.getValorInicial() * Math.pow(1+juros/100, periodo -1)));
				totalJurosField.setText(String.valueOf(vlrJuros));

				float vlrTotal = (float) (sm.getValorInicial() * ((1 + sm.getTaxaJuros())));
				totalField.setText(String.valueOf(vlrTotal));

				if (periodo > 90) {
					periodoField.setText(" ");
					totalJurosField.setText("");
					totalInvestidoField.setText("");
					totalField.setText("");
					JOptionPane.showMessageDialog(null, "Período não pode ser maior que 90 anos. Tente novamente");

				}}
				
				catch(Exception g){
					JOptionPane.showMessageDialog(null, "Favor inserir valor");
				}
			}
		});
		
		JButton BTexcel = new JButton("Gerar Excel");
		panel.add(BTexcel, new GBC(1, 7).insets(1,-225,1,1));
		
		add(panel, new GBC(0, 0).both());
	}

}
