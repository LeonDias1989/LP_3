package Exercicio_Aula_22_04;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JToolBar;

@SuppressWarnings("serial")
public class Janela extends JFrame {

	private JToolBar bar;
	private ImageIcon square, circle;
	private JButton buttonLimpar, buttonTexto, buttonCircle, buttonSqure;
	private JPanel pane;

	public Janela() {
		super("Formas");

		iniciarComponentes();

		setSize(400, 400);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	private void iniciarComponentes() {

		iniciarBar();
		iniciarPainel();

		getContentPane().add(bar, BorderLayout.NORTH);
		getContentPane().add(pane, BorderLayout.CENTER);

	}

	private void iniciarPainel() {
		pane = new JPanel();

	}

	private void iniciarBar() {

		iniciarImagens();
		iniciarButtons();

		bar = new JToolBar();

		bar.add(buttonCircle);
		bar.add(Box.createHorizontalStrut(5));
		bar.add(buttonSqure);
		bar.add(Box.createHorizontalStrut(5));
		bar.add(buttonTexto);
		bar.add(Box.createHorizontalStrut(5));
		bar.add(buttonLimpar);

		buttonCircle.addActionListener(new ButtonCircleAction());
		buttonSqure.addActionListener(new ButtonSquareAction());

		bar.setRollover(true);

	}

	private void iniciarButtons() {

		buttonLimpar = new JButton("Limpar");
		buttonTexto = new JButton("Texto");
		buttonCircle = new JButton(circle);
		buttonSqure = new JButton(square);

	}

	private void iniciarImagens() {

		String urlSquare = "C:/Users/Leon/Documents/GitHub/LP_3/ícones/square.jpg";
		String urlCircle = "C:/Users/Leon/Documents/GitHub/LP_3/ícones/circle.jpg";

		square = new ImageIcon(urlSquare);
		circle = new ImageIcon(urlCircle);

	}

	class ButtonCircleAction implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {

		}
	}

	class ButtonSquareAction implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {

		}
	}

	class ButtonTextoAction implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {

		}
	}

	class ButtonLimparAction implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {

		}
	}

	public static void main(String[] args) {
		new Janela();
	}

}
