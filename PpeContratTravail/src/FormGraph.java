
import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
//		import javax.swing.JLabel;
import javax.swing.JPanel;

public class FormGraph extends JFrame{
	
	private JPanel pan = new JPanel();
	private JComboBox type = new JComboBox();
	private JLabel label = new JLabel();
	
	public FormGraph(){
		//titre
		this.setTitle("Contrat de Travail");
		//taille
		this.setSize(700,700);
		//endroit
		this.setLocationRelativeTo(null);
		//sortir
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setLayout(new BorderLayout());
		//ajout button 
		this.getContentPane().add(new JButton("envoyer"), BorderLayout.SOUTH);
		//vidible
		this.setVisible(true);
		
		JPanel top = new JPanel();
	    top.add(label);
	    top.add(type);
	    pan.add(top, BorderLayout.NORTH);
	    this.setContentPane(pan);
	    
	    /* choix combox
	    type.setPreferredSize(new Dimension(100, 20));
	    type.addItem("CDD");
	    type.addItem("CDI");
	    type.addItem("INTERIM");
	    type.addItem("");
	    */
	}
}
