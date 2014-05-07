//import java.awt.Desktop;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;


public class Main extends graph{

	public static void main(String[] args) {
		
		//Itext app = new Itext();
		
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				graph inst = new graph();
				inst.setTitle("Contrat de Travail");
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
				inst.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			}
		});
		//app.personne();
		//app.runGraph();
		//app.remplissageContrat();
		//app.run();
		
		/*Desktop d = Desktop.getDesktop();
		try {
			d.open(new File(app.getNom() +".pdf"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	}

}
