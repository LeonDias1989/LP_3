package Exercício_4;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class Calculadora2 extends JFrame {

	private JButton calcular, zerar;

	private JRadioButton[] rationButtons = new JRadioButton[4];

	private JLabel numero1, numero2, resultado, soma, subtracao, multiplicacao,
			divisao;
	private JTextField textoNum1, textoNum2, textoResultado;

	public Calculadora2() {
		super("Calculadora 2");
		iniciarComponentes();
		configJanela();

	}

	private void iniciarComponentes() {

		numero1 = new JLabel("Número 1:");
		numero2 = new JLabel("Número 2:");
		resultado = new JLabel("Resultado:");

		calcular = new JButton("Calcular");
		zerar = new JButton("Zerar");

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

		for (int i = 0; i < rationButtons.length; i++) {
			rationButtons[i] = new JRadioButton();

		}

		soma = new JLabel("Soma");
		subtracao = new JLabel("Subtração");
		multiplicacao = new JLabel("Multiplicação");
		divisao = new JLabel("Divisão");

		JPanel paneRations = new JPanel(new FlowLayout());

		paneRations.add(rationButtons[0]);
		paneRations.add(soma);
		paneRations.add(rationButtons[1]);
		paneRations.add(subtracao);
		paneRations.add(rationButtons[2]);
		paneRations.add(multiplicacao);
		paneRations.add(rationButtons[3]);
		paneRations.add(divisao);

		getContentPane().add(paneRations, BorderLayout.CENTER);

		JPanel paneButtons = new JPanel(new FlowLayout());

		calcular = new JButton("Calcular");
		zerar = new JButton("Zerar");

		paneButtons.add(calcular);
		paneButtons.add(zerar);

		getContentPane().add(paneButtons, BorderLayout.SOUTH);

	}

	private void configJanela() {

		setSize(400, 250);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		new Calculadora2();
	}
}
