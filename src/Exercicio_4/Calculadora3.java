package Exercicio_4;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class Calculadora3 extends JFrame {

	private JButton calcular, zerar;

	private JLabel numero1, numero2, resultado, operacao;
	private JTextField textoNum1, textoNum2, textoResultado;

	private String[] textCombo = new String[] { "Soma", "Subtra��o",
			"Multiplica��o", "Divis�o" };
	private JComboBox<String> combo = new JComboBox<>(textCombo);

	public Calculadora3() {
		super("Calculadora 3");
		iniciarComponentes();
		configJanela();

	}

	private void iniciarComponentes() {

		numero1 = new JLabel("N�mero 1:");
		numero2 = new JLabel("N�mero 2:");
		resultado = new JLabel("Resultado:");
		operacao = new JLabel("Opera��o: ");

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

		calcular.addActionListener(new ButtonCalcularListener());
		zerar.addActionListener(new ButtonZerarListener());

		paneButtons.add(calcular);
		paneButtons.add(zerar);

		getContentPane().add(paneButtons, BorderLayout.SOUTH);

	}

	private void configJanela() {
		setSize(400, 250);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

	class ButtonZerarListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {

			textoNum1.setText(null);
			textoNum2.setText(null);
			textoResultado.setText(null);
		}

	}

	class ButtonCalcularListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {

			int a, b, result;

			a = Integer.parseInt(textoNum1.getText());
			b = Integer.parseInt(textoNum2.getText());

			if (combo.getSelectedItem().equals("Soma")) {

				result = a + b;

				textoResultado.setText(String.valueOf(result));
				
			} else if (combo.getSelectedItem().equals("Subtra��o")) {

				result = a - b;

				textoResultado.setText(String.valueOf(result));

			} else if (combo.getSelectedItem().equals("Multiplica��o")) {

				result = a * b;

				textoResultado.setText(String.valueOf(result));

			} else if (combo.getSelectedItem().equals("Divis�o")) {

				try {
					result = a / b;

					textoResultado.setText(String.valueOf(result));

				} catch (Exception exception) {
					JOptionPane.showMessageDialog(null,
							"Imposs�vel dividir por zero");
				}

			}

		}

	}

	public static void main(String[] args) {
		new Calculadora3();
	}

}
