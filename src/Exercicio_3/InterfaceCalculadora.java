package Exercicio_3;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class InterfaceCalculadora extends JFrame {

	private JButton[] button = new JButton[16];

	private String[] nomes = { "7", "8", "9", "/", "4", "5", "6", "*", "1",
			"2", "3", "-", "", "0", "=", "+" };

	private JPanel paneButtons;

	private JTextField textField;

	public InterfaceCalculadora() {
		iniciarComponentes();
		configJanela();

	}

	private void iniciarComponentes() {

		paneButtons = new JPanel(new GridLayout(4, 4));

		for (int i = 0; i < button.length; i++) {
			button[i] = new JButton(nomes[i]);
		}

		button[12].setEnabled(false);

		for (int i = 0; i < button.length; i++) {
			paneButtons.add(button[i]);
		}

		textField = new JTextField();

		getContentPane().add(textField, BorderLayout.NORTH);
		getContentPane().add(paneButtons, BorderLayout.CENTER);

	}

	private void configJanela() {

		pack();
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Calculadora");
	}

	public static void main(String[] args) {
		new InterfaceCalculadora();
	}
}
