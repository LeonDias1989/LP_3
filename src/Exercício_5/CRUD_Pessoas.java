package Exercício_5;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class CRUD_Pessoas extends JFrame {

	private JList<String> listaPessoas;
	private JButton buttonNovo, buttonEditar, buttonRemover;
	private JPanel paneButtons;
	private JMenuBar bar;
	private JMenu arquivo, editar, ajuda;
	private JMenuItem novoMenuItem, sairMenuItem, abrirMenuItem,
			salvarMenuItem, salvarComoMenuItem;

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

		buttonNovo.addActionListener(new ButtonNovoListener());

		listaPessoas = new JList<>();

		bar = new JMenuBar();

		arquivo = new JMenu("Arquivo");

		novoMenuItem = new JMenuItem("Novo");
		abrirMenuItem = new JMenuItem("Abrir...");
		salvarMenuItem = new JMenuItem("Salvar");
		salvarComoMenuItem = new JMenuItem("Salvar Como...");
		sairMenuItem = new JMenuItem("Sair");

		arquivo.add(novoMenuItem);
		arquivo.add(abrirMenuItem);
		arquivo.add(salvarMenuItem);
		arquivo.add(salvarComoMenuItem);
		arquivo.add(sairMenuItem);

		novoMenuItem.addActionListener(new ButtonNovoListener());
		abrirMenuItem.addActionListener(new ButtonAbrirListener());
		sairMenuItem.addActionListener(new ButtonSairListener());
		
		

		editar = new JMenu("Editar");
		ajuda = new JMenu("Ajuda");

		bar.add(arquivo);
		bar.add(editar);
		bar.add(ajuda);

		getContentPane().add(listaPessoas, BorderLayout.CENTER);
		getContentPane().add(paneButtons, BorderLayout.SOUTH);
		getContentPane().add(bar, BorderLayout.NORTH);

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

	class ButtonNovoListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			new FormularioPessoa();
			dispose();
		}
	}

	class ButtonSairListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			System.exit(0);

		}
	}
	
	class ButtonAbrirListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			JFileChooser chooser = new JFileChooser();
			chooser.showOpenDialog(chooser);
			
		}
		
		
	}

}
