package Controller;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Exec extends JFrame {

	private JPanel jPanel;
	public JComboBox jComboBox;
	private JLabel jLabel;
    private JLabel jlNome;
    private JLabel jlCPF;
    private JLabel jlNumConta;
    private JLabel jlSaldoInicial;
    public JTextField jtfNome;
    public JTextField jtfCPF;
    public JTextField jtfNumConta;
    public JTextField jtfSaldoInicial;
	private JButton jButton;

	public Exec() {
		setTitle("Movimentação Bancaria");
	}
	
	public void configuraTela(){
		setSize(800, 500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
	}
	
	public void montaTela(){
		jPanel = new JPanel();
		setLayout(new FlowLayout(FlowLayout.CENTER));
		jPanel.setLayout(new GridLayout(6, 2, 10, 10));

        jlNome = new JLabel("Nome do Titular:");
        jtfNome = new JTextField();
        jlCPF = new JLabel("Digite o CPF do titular:");
        jtfCPF = new JTextField();
        jlNumConta = new JLabel("Digite o numero da conta");
        jtfNumConta = new JTextField();
        jlSaldoInicial = new JLabel("Digite o saldo inicial da conta. Ex 100.00, 500.16");
        jtfSaldoInicial = new JTextField();
		jLabel = new JLabel("Selecione qual tipo de conta voce quer criar.");

		String[] opcoesContas = new String[]{" ", "Conta-Corrente", "Conta-Poupanca", "Conta-Salario"};
		jComboBox = new JComboBox(opcoesContas);

		jButton = new JButton("Enviar");

        jPanel.add(jlNome);
        jPanel.add(jtfNome);
        jPanel.add(jlCPF);
        jPanel.add(jtfCPF);
        jPanel.add(jlNumConta);
        jPanel.add(jtfNumConta);
        jPanel.add(jlSaldoInicial);
        jPanel.add(jtfSaldoInicial);
		jPanel.add(jLabel);
		jPanel.add(jComboBox);
		jPanel.add(jButton);
		add(jPanel);

		jButton.addActionListener(new EventoCriarConta(this));

	}

	public static void main(String[] args) {
		Exec exec = new Exec();
		exec.montaTela();
		exec.configuraTela();
	}

}
