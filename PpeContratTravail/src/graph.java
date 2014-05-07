import java.awt.Component;
import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;


/**
* This code was edited or generated using CloudGarden's Jigloo
* SWT/Swing GUI Builder, which is free for non-commercial
* use. If Jigloo is being used commercially (ie, by a corporation,
* company or business for any purpose whatever) then you
* should purchase a license for each developer using Jigloo.
* Please visit www.cloudgarden.com for details.
* Use of Jigloo implies acceptance of these licensing terms.
* A COMMERCIAL LICENSE HAS NOT BEEN PURCHASED FOR
* THIS MACHINE, SO JIGLOO OR THIS CODE CANNOT BE USED
* LEGALLY FOR ANY CORPORATE OR COMMERCIAL PURPOSE.
*/
public class graph extends javax.swing.JFrame implements ActionListener {
	
	private JButton annulerButton;
	private JTextField prenom;
	private JTextField periodeessai;
	private JTextField cp;
	private JTextField nss;
	private JTextField numeroRue;
	private JTextField dureejours;
	private JComboBox contratCombo;
	private JTextField lieu;
	private JEditorPane jEditorPane1;
	private JTextField horraire;
	private JTextField conges;
	private JTextField salaire;
	private JTextField fonction;
	private JTextField repos;
	private JTextField debut;
	private JTextField nationalite;
	private JTextField adresse;
	private JTextField nom;
	private JButton validerButton;

	/**
	* Auto-generated main method to display this JFrame
	*/
	/*public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				graph inst = new graph();
				inst.setTitle("Contrat de Travail");
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
				inst.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			}
		});
	}*/
	
	public graph() {
		super();
		initGUI();
	}
		
		public void runGraph() {
			graph inst = new graph();
			inst.setTitle("Contrat de Travail");
			inst.setLocationRelativeTo(null);
			inst.setVisible(true);
			inst.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
	
	private void initGUI() {
		try {
			GroupLayout thisLayout = new GroupLayout((JComponent)getContentPane());
			getContentPane().setLayout(thisLayout);
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			

			
			
			{
				annulerButton = new JButton();
				annulerButton.setText("Annuler");
				annulerButton.addActionListener(this);
		
			}
			{
				validerButton = new JButton();
				validerButton.setText("OK");
				validerButton.addActionListener(this);
			}
			{
				nom = new JTextField();
				nom.setText("nom");
				//nom.addKeyListener(this);
				
			}
			{
				prenom = new JTextField();
				prenom.setText("prenom");
				
			}
			{
				adresse = new JTextField();
				adresse.setText("adresse");
			}
			{
				nationalite = new JTextField();
				nationalite.setText("nationalite");
			}
			{
				debut = new JTextField();
				debut.setText("debut");
			}
			{
				repos = new JTextField();
				repos.setText("repos");
			}
			{
				fonction = new JTextField();
				fonction.setText("fonction");
			}
			{
				lieu = new JTextField();
				lieu.setText("Lieu");
			}
			{
				ComboBoxModel contratComboModel = new DefaultComboBoxModel(
				new String[] { "CDD", "CDI", "INTERIM", "ALTERNANCE" });
				contratCombo = new JComboBox();
				contratCombo.setModel(contratComboModel);
				contratCombo.getSelectedItem().toString();
			}
			{
				jEditorPane1 = new JEditorPane();
				jEditorPane1.setText("duree ");
			}
			{
				horraire = new JTextField();
				horraire.setText("horaire");
			}
			{
				conges = new JTextField();
				conges.setText("congés (en jours)");
			}
			{
				salaire = new JTextField();
				salaire.setText("Salaire");
			}
			{
				periodeessai = new JTextField();
				periodeessai.setText("Période essai (en jours)");
			}
			{
				cp = new JTextField();
				cp.setText("code postal");
			}
			{
				dureejours = new JTextField();
				dureejours.setText("duree jours (autre que CDI)");
			}
			{
				numeroRue = new JTextField();
				numeroRue.setText("numéro rue");
			}
			{
				nss = new JTextField();
				nss.setText("numero Sécurité Social");
			}
			thisLayout.setVerticalGroup(thisLayout.createSequentialGroup()
				.addContainerGap(18, 18)
				.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				    .addComponent(nom, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				    .addComponent(prenom, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				    .addComponent(debut, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				    .addComponent(lieu, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
				.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				    .addComponent(repos, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				    .addComponent(fonction, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				    .addComponent(nationalite, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
				.addGroup(thisLayout.createParallelGroup()
				    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				        .addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				            .addComponent(salaire, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				            .addComponent(conges, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
				        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
				        .addComponent(horraire, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
				    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				        .addGap(11)
				        .addComponent(nss, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
				        .addGap(21)))
				.addComponent(adresse, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
				.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				    .addComponent(numeroRue, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				    .addComponent(cp, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
				.addComponent(periodeessai, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
				.addGroup(thisLayout.createParallelGroup()
				    .addComponent(dureejours, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
				    .addComponent(jEditorPane1, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 0, Short.MAX_VALUE)
				.addComponent(contratCombo, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				.addGap(0, 39, GroupLayout.PREFERRED_SIZE)
				.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				    .addComponent(annulerButton, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				    .addComponent(validerButton, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
				.addContainerGap(63, 63));
			thisLayout.setHorizontalGroup(thisLayout.createSequentialGroup()
				.addGap(7)
				.addGroup(thisLayout.createParallelGroup()
				    .addGroup(thisLayout.createSequentialGroup()
				        .addGroup(thisLayout.createParallelGroup()
				            .addComponent(numeroRue, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE)
				            .addComponent(nationalite, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE)
				            .addComponent(nom, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE))
				        .addGap(19)
				        .addGroup(thisLayout.createParallelGroup()
				            .addComponent(cp, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 157, GroupLayout.PREFERRED_SIZE)
				            .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				                .addPreferredGap(cp, prenom, LayoutStyle.ComponentPlacement.INDENT)
				                .addComponent(prenom, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE)
				                .addGap(42))))
				    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				        .addComponent(nss, GroupLayout.PREFERRED_SIZE, 145, GroupLayout.PREFERRED_SIZE)
				        .addGap(134))
				    .addComponent(adresse, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 279, GroupLayout.PREFERRED_SIZE)
				    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				        .addGap(95)
				        .addComponent(contratCombo, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE)
				        .addGap(66)))
				.addGap(66)
				.addGroup(thisLayout.createParallelGroup()
				    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				        .addGap(0, 0, Short.MAX_VALUE)
				        .addComponent(salaire, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE)
				        .addGap(134))
				    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				        .addGap(0, 0, Short.MAX_VALUE)
				        .addComponent(horraire, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE)
				        .addGap(134))
				    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				        .addGap(0, 0, Short.MAX_VALUE)
				        .addComponent(fonction, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE)
				        .addGap(134))
				    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				        .addGap(0, 0, Short.MAX_VALUE)
				        .addComponent(debut, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE)
				        .addGap(134))
				    .addGroup(thisLayout.createSequentialGroup()
				        .addGap(26)
				        .addGroup(thisLayout.createParallelGroup()
				            .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				                .addGap(0, 0, Short.MAX_VALUE)
				                .addComponent(jEditorPane1, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
				                .addGap(12)
				                .addGroup(thisLayout.createParallelGroup()
				                    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				                        .addComponent(periodeessai, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
				                        .addGap(11))
				                    .addComponent(dureejours, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 161, GroupLayout.PREFERRED_SIZE)))
				            .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				                .addGap(0, 25, Short.MAX_VALUE)
				                .addComponent(validerButton, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE)
				                .addGroup(thisLayout.createParallelGroup()
				                    .addComponent(conges, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE)
				                    .addComponent(repos, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE)
				                    .addComponent(lieu, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE)
				                    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				                        .addGap(0, 25, GroupLayout.PREFERRED_SIZE)
				                        .addComponent(annulerButton, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)))
				                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)))))
				.addContainerGap());
			thisLayout.linkSize(SwingConstants.HORIZONTAL, new Component[] {validerButton, annulerButton});
		
			pack();
			this.setSize(617, 448);
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
	}
	
	//get set
	public JTextField getPrenom() {
		return prenom;
	}
	
	public void setPrenom(JTextField prenom) {
		this.prenom = prenom;
	}
	
	public JTextField getNom() {
		return nom;
	}
	
	public void setNom(JTextField nom) {
		this.nom = nom;
	}
	
	public JTextField getNationalite() {
		return nationalite;
	}
	
	public void setNationalite(JTextField nationalite) {
		this.nationalite = nationalite;
	}
	
	public JTextField getAdresse() {
		return adresse;
	}
	
	public void setAdresse(JTextField adresse) {
		this.adresse = adresse;
	}
	
	public JTextField getNrue() {
		return numeroRue;
	}
	
	public void setNrue(JTextField numeroRue) {
		this.numeroRue= numeroRue;
	}
	public JTextField getCp() {
		return cp;
	}
	
	public void setcp(JTextField cp) {
		this.cp = cp;
	}
	
	public JTextField getHorraire() {
		return horraire;
	}
	
	public void setHorraire(JTextField horraire) {
		this.horraire = horraire;
	}
	
	public JTextField getSalaire() {
		return salaire;
	}
	
	public void setSalaire(JTextField salaire) {
		this.salaire = salaire;
	}
	
	public JTextField getConges() {
		return conges;
	}
	
	public void setConges(JTextField conges) {
		this.conges = conges;
	}
	
	public JTextField getFonction() {
		return fonction;
	}
	
	public void setFonction(JTextField fonction) {
		this.fonction = fonction;
	}

	public JTextField getLieuDeTravail() {
		return lieu;
	}
	public void setLieuDeTravail(JTextField lieuDeTravail) {
		lieu = lieuDeTravail;
	}
	
	public JTextField getNSS() {
		return nss;
	}
	public void setNSS(JTextField nss) {
		this.nss = nss;
	}
	
	public JTextField getQuand() {
		return debut;
	}
	
	public void setQuand(JTextField debut) {
		this.debut = debut;
	}
	
	public JTextField getEssai() {
		return periodeessai;
	}
	
	public void setEssai(JTextField periodeessai) {
		this.periodeessai = periodeessai;
	}
	
	public JTextField getJourRepos() {
		return repos;
	}
	
	public void setJourRepos(JTextField repos) {
		this.repos = repos;
	}
	
	public JTextField getDuree() {
		return dureejours;
	}
	
	public void setDuree(JTextField dureejours) {
		this.dureejours = dureejours;
	}
	
	public String getComboBox()
	{
		 return (String)this.contratCombo.getSelectedItem();
	}
	


	// actionlistener
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource() == validerButton)
		{
			
			Itext app = new Itext();
			
			app.run(this);
			app.remplissageContrat(this);
			try {
				Desktop d = Desktop.getDesktop();
				d.open(new File(this.getNom().getText()+".pdf"));
			} catch (IOException f) {
				// TODO Auto-generated catch block
				f.printStackTrace();
			}			
		}
		if(e.getSource() == annulerButton){
			runGraph();
		}
	}
		
	
}
