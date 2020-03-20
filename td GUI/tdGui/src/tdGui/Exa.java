package tdGui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Exa extends JFrame implements ActionListener{
	private JPanel pan = new JPanel();
	private JButton bouton = new JButton("Mon bouton");
	private int compteur = 0;
	private JLabel label = new JLabel("Le JLabel");
	
	public Exa(){
		this.setTitle("Exercice A");
		this.setSize(300, 150);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
		pan.add(label);
		pan.add(bouton);
		bouton.addActionListener(this);
		this.setContentPane(pan);
		this.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent arg0) {
		this.compteur++;
		label.setText("Vous avez cliqué " + this.compteur
		+ " fois");
		} 
	
	public static void main(String[] args) {
		Exa fen = new Exa();
	}
}

