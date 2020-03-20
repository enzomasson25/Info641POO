package tdGui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Exc extends JFrame implements ActionListener{
	private JPanel pan = new JPanel();
	private JButton bouton = new JButton("+1");
	private int compteur = 0;
	private boolean whichEx = true;
	private JLabel label = new JLabel("Le JLabel");
	private ButtonGroup bg = new ButtonGroup();
	private JRadioButton rouge = new JRadioButton("Rouge");
	private JRadioButton jaune = new JRadioButton("Jaune");
	private JRadioButton vert = new JRadioButton("Vert");
	private ButtonGroup bgSelect = new ButtonGroup();
	private JRadioButton exa = new JRadioButton("Exercice A");
	private JRadioButton exb = new JRadioButton("Exercice B");
	
	public Exc(){
		this.setTitle("Exercice C");
		this.setSize(500, 150);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		bg.add(rouge);
		bg.add(jaune);
		bg.add(vert);
		
		bgSelect.add(exa);
		bgSelect.add(exb);
		
		exa.addActionListener(this);
		exb.addActionListener(this);
		
		rouge.addActionListener(this);
		jaune.addActionListener(this);
		vert.addActionListener(this);
		
		pan.add(exa);
		pan.add(exb);
		pan.add(rouge);
		pan.add(jaune);
		pan.add(vert);
		pan.add(label);
		pan.add(bouton);
		bouton.addActionListener(this);
		this.setContentPane(pan);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		Exc fen = new Exc();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand()=="Exercice A") {
			whichEx = true;
		}
		else if(e.getActionCommand()=="Exercice B") {
			whichEx = false;
		}
		else if ((e.getActionCommand()=="+1")&(whichEx == true)) {
			this.compteur++;
			label.setText("Vous avez cliqué " + this.compteur
			+ " fois");
		}
		else if (((e.getActionCommand()=="Rouge")|(e.getActionCommand()=="Jaune")|(e.getActionCommand()=="Vert"))&(whichEx == false)){
			this.label.setText("Vous avez sélectionné le " + e.getActionCommand());
		}
	
	}
}
