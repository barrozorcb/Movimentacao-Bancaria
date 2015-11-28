package Controller;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Exec extends JFrame {

	private JPanel jPanel;
	private JComboBox jComboBox;
	private JLabel jLabel;
	private JButton jButton;
	private IConta iConta;

	public Exec() {
		setTitle("Movimentação Bancaria");
	}
	
	public void configuraTela(){
		setSize(500, 500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public void montaTela(){
		jPanel = new JPanel();
		setLayout(new FlowLayout(FlowLayout.CENTER));
		jPanel.setLayout(new GridLayout(3, 2, 10, 10));

		jLabel = new JLabel("Selecione qual tipo de conta voce quer criar.");

		String[] opcoesContas = new String[]{" ", "Conta-Corrente", "Conta-Poupanca", "Conta-Salario"};
		jComboBox = new JComboBox(opcoesContas);

		jButton = new JButton("Enviar");


		jPanel.add(jLabel);
		jPanel.add(jComboBox);
		jPanel.add(jButton);
		add(jPanel);

		jButton.addActionListener(new CriaConta());

	}

	public class CriaConta implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {

			IConta contaSelecionada = IConta.fabricaConta.criaConta(jComboBox.getSelectedIndex());

			Exec exec = new Exec();
			new Exec2(contaSelecionada);
			exec.setVisible(false);
		}
	}

	public static void main(String[] args) {
		Exec exec = new Exec();

		exec.montaTela();
		exec.configuraTela();
	}

}
