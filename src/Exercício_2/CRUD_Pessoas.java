package Exercício_2;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class CRUD_Pessoas extends JFrame implements ActionListener {

	private JList<String> listaPessoas;
	private JButton buttonNovo, buttonEditar, buttonRemover;
	private JPanel paneButtons;

	public CRUD_Pessoas() {
		iniciarComponentes();
		configJanela();
	}

	private void iniciarComponentes() {

		paneButtons = new JPanel(new FlowLayout());

		buttonNovo = new JButton("Novo");
		buttonEditar = new JButton("Editar");
		buttonRemover = new JButton("Remover");

		paneButtons.add(buttonNovo);
		paneButtons.add(buttonEditar);
		paneButtons.add(buttonRemover);

		buttonNovo.addActionListener(this);

		listaPessoas = new JList<>();

		getContentPane().add(listaPessoas, BorderLayout.NORTH);
		getContentPane().add(paneButtons, BorderLayout.SOUTH);

	}

	private void configJanela() {

		setSize(300, 300);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("CRUD de Pessoas");
	}

	public static void main(String[] args) {
		new CRUD_Pessoas();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		new FormularioPessoa();
		dispose();
	}

}
