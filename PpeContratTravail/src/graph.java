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
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
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
	private JLabel jLabel9;
	private JLabel jLabel8;
	private JLabel jLabel7;
	private JLabel horaire;
	private JLabel jLabel6;
	private JLabel jLabel5;
	private JLabel jLabel2;
	private JLabel numss;
	private JLabel jLabel4;
	private JLabel codep;
	private JLabel numero;
	private JLabel jLabel3;
	private JLabel nationalité;
	private JLabel jLabel1;
	private JLabel Duree;
	private JLabel periodeEssai;
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
				new String[] { "CDD", "CDI", "INTERIM/TEMPORAIRE", "STAGE" });
				contratCombo = new JComboBox();
				contratCombo.setModel(contratComboModel);
				contratCombo.getSelectedItem().toString();
			}
			{
				periodeEssai = new JLabel();
				periodeEssai.setText("Période essai");
			}
			{
				Duree = new JLabel();
				Duree.setText("Durée");
			}
			{
				jLabel1 = new JLabel();
				jLabel1.setText("Prénom");
			}
			{
				jLabel2 = new JLabel();
				jLabel2.setText("Nom");
			}
			{
				nationalité = new JLabel();
				nationalité.setText("nationalité");
			}
			{
				numss = new JLabel();
				numss.setText("numero Sécurité");
			}
			{
				jLabel3 = new JLabel();
				jLabel3.setText("adresse");
			}
			{
				numero = new JLabel();
				numero.setText("numero Rue");
			}
			{
				codep = new JLabel();
				codep.setText("code postal");
			}
			{
				jLabel4 = new JLabel();
				jLabel4.setText("début");
			}
			{
				jLabel5 = new JLabel();
				jLabel5.setText("fonction");
			}
			{
				jLabel6 = new JLabel();
				jLabel6.setText("salaire");
			}
			{
				horaire = new JLabel();
				horaire.setText("horaire");
			}
			{
				jLabel7 = new JLabel();
				jLabel7.setText("congés");
			}
			{
				jLabel8 = new JLabel();
				jLabel8.setText("repos");
			}
			{
				jLabel9 = new JLabel();
				jLabel9.setText("lieu");
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
			thisLayout.setVerticalGroup(thisLayout.createSequentialGroup()
				.addContainerGap(16, 16)
				.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				    .addComponent(prenom, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				    .addComponent(debut, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				    .addComponent(jLabel1, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				    .addComponent(jLabel4, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
				.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				    .addComponent(fonction, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				    .addComponent(nom, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				    .addComponent(jLabel2, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				    .addComponent(jLabel5, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
				.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				    .addComponent(salaire, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				    .addComponent(nationalite, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				    .addComponent(nationalité, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				    .addComponent(jLabel6, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
				.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				    .addComponent(nss, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
				    .addComponent(horraire, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				    .addComponent(numss, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
				    .addComponent(horaire, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
				.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				    .addComponent(conges, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				    .addComponent(jLabel7, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGroup(thisLayout.createParallelGroup()
				    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				        .addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
				        .addComponent(adresse, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
				        .addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				            .addComponent(numeroRue, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				            .addComponent(numero, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)))
				    .addGroup(thisLayout.createSequentialGroup()
				        .addGap(12)
				        .addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				            .addComponent(repos, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				            .addComponent(jLabel8, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
				        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
				        .addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				            .addComponent(lieu, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				            .addComponent(jLabel9, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
				        .addGap(16)))
				.addGroup(thisLayout.createParallelGroup()
				    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				        .addComponent(periodeessai, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				        .addComponent(periodeEssai, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
				    .addGroup(thisLayout.createSequentialGroup()
				        .addGap(10)
				        .addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				            .addComponent(cp, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				            .addComponent(codep, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))))
				.addGap(16)
				.addGroup(thisLayout.createParallelGroup()
				    .addComponent(dureejours, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
				    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				        .addGap(8)
				        .addComponent(Duree, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)))
				.addComponent(contratCombo, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				    .addComponent(annulerButton, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				    .addComponent(validerButton, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
				.addContainerGap(40, 40));
			thisLayout.setHorizontalGroup(thisLayout.createSequentialGroup()
				.addGap(7)
				.addGroup(thisLayout.createParallelGroup()
				    .addComponent(adresse, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 279, GroupLayout.PREFERRED_SIZE)
				    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				        .addComponent(numss, 0, 103, Short.MAX_VALUE)
				        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
				        .addGroup(thisLayout.createParallelGroup()
				            .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				                .addComponent(numeroRue, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE)
				                .addGap(54))
				            .addComponent(cp, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 157, GroupLayout.PREFERRED_SIZE)
				            .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				                .addComponent(nss, GroupLayout.PREFERRED_SIZE, 145, GroupLayout.PREFERRED_SIZE)
				                .addGap(12))
				            .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				                .addComponent(nationalite, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE)
				                .addGap(54))
				            .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				                .addComponent(nom, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE)
				                .addGap(54))
				            .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				                .addComponent(prenom, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE)
				                .addGap(54)))
				        .addGap(19))
				    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				        .addGroup(thisLayout.createParallelGroup()
				            .addComponent(codep, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
				            .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				                .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
				                .addGap(10))
				            .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				                .addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
				                .addGap(38))
				            .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				                .addComponent(nationalité, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
				                .addGap(7))
				            .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				                .addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
				                .addGap(15))
				            .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				                .addComponent(numero, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
				                .addGap(7)))
				        .addComponent(contratCombo, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE)
				        .addGap(86)))
				.addGap(23)
				.addGroup(thisLayout.createParallelGroup()
				    .addComponent(periodeEssai, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)
				    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				        .addGap(22)
				        .addComponent(Duree, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
				        .addGap(26)))
				.addGroup(thisLayout.createParallelGroup()
				    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				        .addGroup(thisLayout.createParallelGroup()
				            .addComponent(jLabel4, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
				            .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				                .addComponent(jLabel5, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
				                .addGap(7))
				            .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				                .addComponent(jLabel6, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
				                .addGap(13))
				            .addComponent(horaire, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
				            .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				                .addComponent(jLabel7, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
				                .addGap(7))
				            .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				                .addComponent(jLabel8, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
				                .addGap(21))
				            .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				                .addComponent(jLabel9, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
				                .addGap(21)))
				        .addGap(48)
				        .addComponent(annulerButton, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 0, Short.MAX_VALUE))
				    .addGroup(thisLayout.createSequentialGroup()
				        .addGap(7)
				        .addGroup(thisLayout.createParallelGroup()
				            .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				                .addComponent(validerButton, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE)
				                .addGroup(thisLayout.createParallelGroup()
				                    .addGroup(thisLayout.createSequentialGroup()
				                        .addComponent(salaire, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE))
				                    .addGroup(thisLayout.createSequentialGroup()
				                        .addComponent(conges, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE))
				                    .addGroup(thisLayout.createSequentialGroup()
				                        .addComponent(horraire, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE))
				                    .addGroup(thisLayout.createSequentialGroup()
				                        .addComponent(repos, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE))
				                    .addGroup(thisLayout.createSequentialGroup()
				                        .addComponent(fonction, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE))
				                    .addGroup(thisLayout.createSequentialGroup()
				                        .addComponent(debut, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE))
				                    .addGroup(thisLayout.createSequentialGroup()
				                        .addComponent(lieu, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE)))
				                .addGap(0, 0, Short.MAX_VALUE))
				            .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				                .addComponent(dureejours, GroupLayout.PREFERRED_SIZE, 161, GroupLayout.PREFERRED_SIZE)
				                .addGap(0, 20, Short.MAX_VALUE))
				            .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				                .addComponent(periodeessai, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
				                .addGap(0, 31, Short.MAX_VALUE)))))
				.addContainerGap(19, 19));
			thisLayout.linkSize(SwingConstants.HORIZONTAL, new Component[] {validerButton, annulerButton});
			}

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
			
			app.remplissageContrat(this);
			app.run(this, app);
			
			
			try {
				Desktop d = Desktop.getDesktop();
				d.open(new File(this.getNom().getText()+".pdf"));
			} catch (IOException f) {
				// TODO Auto-generated catch block
				f.printStackTrace();
			}
			System.out.println();
		}
		if(e.getSource() == annulerButton){
			runGraph();
		}
	}
		
	
}
