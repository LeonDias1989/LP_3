package Exercicio_Aula_22_04;

import java.awt.Graphics;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class TelaDesenho extends JPanel{

	public TelaDesenho() {
	 
	}
	
	@Override
	public void paintComponents(Graphics g) {
		super.paintComponents(g);
		g.drawRect(100, 100, 100, 100);
	}
	

}
