package Exercício_4;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class Calculadora1 extends JFrame {

	private JButton somar, limpar;

	private JLabel numero1, numero2, resultado;
	private JTextField textoNum1, textoNum2, textoResultado;

	public Calculadora1() {
		super("Calculadora 1");
		iniciarComponentes();
		configJanela();
		
	}

	private void iniciarComponentes() {

		numero1 = new JLabel("Número 1:");
		numero2 = new JLabel("Número 2:");
		resultado = new JLabel("Resultado:");

		somar = new JButton("Somar");
		limpar = new JButton("Limpar");

		textoNum1 = new JTextField();
		textoNum2 = new JTextField();
		textoResultado = new JTextField();

		JPanel jPanel = new JPanel(new GridLayout(3, 2));

		jPanel.add(numero1);
		jPanel.add(textoNum1);

		jPanel.add(numero2);
		jPanel.add(textoNum2);

		jPanel.add(resultado);
		jPanel.add(textoResultado);

		getContentPane().add(jPanel, BorderLayout.NORTH);

		JPanel paneButtons = new JPanel(new FlowLayout());

		somar = new JButton("Somar");
		limpar = new JButton("Limpar");

		paneButtons.add(somar);
		paneButtons.add(limpar);

		getContentPane().add(paneButtons, BorderLayout.SOUTH);

	}

	private void configJanela() {
		setSize(300,250);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		new Calculadora1();
	}

}
