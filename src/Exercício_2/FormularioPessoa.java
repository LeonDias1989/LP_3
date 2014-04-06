package Exercício_2;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class FormularioPessoa extends JFrame implements ActionListener {

	private JLabel labelNome, labelIdade;
	private JTextField textNome, textIdade;
	private JButton buttonOk, buttonCancel;

	private JPanel paneForms, paneButtons;

	public FormularioPessoa() {
		iniciarComponentes();
		configJanela();
	}

	private void iniciarComponentes() {

		paneForms = new JPanel(new GridLayout(2, 2));

		labelNome = new JLabel("Nome:");
		labelIdade = new JLabel("Idade:");

		textNome = new JTextField();

		textNome.addActionListener(this);

		textIdade = new JTextField();

		paneForms.add(labelNome);
		paneForms.add(textNome);
		paneForms.add(labelIdade);
		paneForms.add(textIdade);

		paneButtons = new JPanel(new FlowLayout());

		buttonOk = new JButton("OK");
		buttonCancel = new JButton("Cancel");

		buttonCancel.addActionListener(this);

		paneButtons.add(buttonOk);
		paneButtons.add(buttonCancel);

		getContentPane().add(paneForms, BorderLayout.NORTH);
		getContentPane().add(paneButtons, BorderLayout.SOUTH);

	}

	private void configJanela() {

		setSize(300, 300);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Formulário Pessoa");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		new CRUD_Pessoas();
		dispose();
	}

}
