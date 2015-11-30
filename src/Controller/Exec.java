package Controller;

import View.TelaCriaConta;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Exec extends JFrame {

	private TelaCriaConta telaCriaConta;

	public static void main(String[] args) {
		TelaCriaConta telaCriaConta = new TelaCriaConta();
		telaCriaConta.montaTela();
		telaCriaConta.configuraTela();
	}

}
