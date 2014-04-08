package Exercicio_4;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class Calculadora3 extends JFrame {

	private JButton calcular, zerar;

	private JLabel numero1, numero2, resultado, operacao;
	private JTextField textoNum1, textoNum2, textoResultado;

	private String[] textCombo = new String[] { "Soma", "Subtração",
			"Multiplicação", "Divisão" };
	private JComboBox<String> combo = new JComboBox<>(textCombo);

	public Calculadora3() {
		super("Calculadora 3");
		iniciarComponentes();
		configJanela();

	}

	private void iniciarComponentes() {

		numero1 = new JLabel("Número 1:");
		numero2 = new JLabel("Número 2:");
		resultado = new JLabel("Resultado:");
		operacao = new JLabel("Operação: ");

		calcular = new JButton("Calcular");
		zerar = new JButton("Zerar");

		textoNum1 = new JTextField();
		textoNum2 = new JTextField();
		textoResultado = new JTextField();

		JPanel paneLabels = new JPanel(new GridLayout(4, 1));

		paneLabels.add(numero1);
		paneLabels.add(textoNum1);

		paneLabels.add(numero2);
		paneLabels.add(textoNum2);

		paneLabels.add(operacao);
		paneLabels.add(combo);

		paneLabels.add(resultado);
		paneLabels.add(textoResultado);

		getContentPane().add(paneLabels, BorderLayout.NORTH);

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
		new Calculadora3();
	}

}
