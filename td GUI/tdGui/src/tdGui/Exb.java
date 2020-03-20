package tdGui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Exb extends JFrame implements ActionListener{
	private JPanel pan = new JPanel();
	private ButtonGroup bg = new ButtonGroup();
	private JRadioButton rouge = new JRadioButton("Rouge");
	private JRadioButton jaune = new JRadioButton("Jaune");
	private JRadioButton vert = new JRadioButton("Vert");
	private JLabel label = new JLabel("Le JLabel");
	
	public Exb(){
		bg.add(rouge);
		bg.add(jaune);
		bg.add(vert);
		this.setTitle("Exercice B");
		this.setSize(300, 150);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		rouge.addActionListener(this);
		jaune.addActionListener(this);
		vert.addActionListener(this);
		
		pan.add(rouge);
		pan.add(jaune);
		pan.add(vert);
		pan.add(label);
		this.setContentPane(pan);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		Exb fen = new Exb();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		this.label.setText("Vous avez sélectionné le " + e.getActionCommand());
		if (e.getActionCommand()=="Vert"){
				this.pan.setBackground(Color.green);
		}
		else if(e.getActionCommand()=="Rouge") {
				this.pan.setBackground(Color.red);
		}
		else {
			this.pan.setBackground(Color.yellow);
		}
	}
}