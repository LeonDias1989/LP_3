package Exercicio_Aula_22_04;

import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JToolBar;

@SuppressWarnings("serial")
public class Janela extends JFrame {

	private JToolBar bar;
	private ImageIcon squareImage, circleImage;
	private JButton buttonLimpar, buttonTexto, buttonCircle, buttonSqure;

	public Janela() {
		super("Formas");

		iniciarComponentes();

		setSize(400, 400);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	private void iniciarComponentes() {

		iniciarBar();

		getContentPane().add(bar, BorderLayout.NORTH);

	}

	private void iniciarBar() {

		iniciarImagens();
		iniciarButtons();

		bar = new JToolBar();

		bar.add(buttonCircle);
		bar.add(buttonSqure);
		bar.add(buttonTexto);
		bar.add(buttonLimpar);

		bar.setRollover(true);

	}

	private void iniciarButtons() {

		buttonLimpar = new JButton("Limpar");
		buttonTexto = new JButton("Texto");
		buttonCircle = new JButton(circleImage);
		buttonSqure = new JButton(squareImage);

	}

	private void iniciarImagens() {

		String urlSquare = "C:/Users/631120051/Documents/GitHub/LP_3/ícones/square.jpg";
		String urlCircle = "C:/Users/631120051/Documents/GitHub/LP_3/ícones/circle.jpg";

		squareImage = new ImageIcon(urlSquare);
		circleImage = new ImageIcon(urlCircle);

	}

	public static void main(String[] args) {
		new Janela();
	}

}
