
import java.util.Scanner;

public class Formulaire{
	
	private Scanner sc = new Scanner(System.in);
	private String nom;//
	private String prenom;//
	private String adresse;//
	private int Nrue;//
	private int age;
	private int cp;//
	private int horraire;
	private int salaire;//
	private int conges; //
	private String fonction;
	private String LieuDeTravail;//
	private String nationalite;//
	private int NSS;
	private int typeContrat;
	private String quand;//
	private int essai;//
	private String jourRepos;//
	private String duree;

	
	public void personne(){
		
		System.out.println("Nom:");
		setNom(sc.nextLine());
		
		System.out.println("Prénom:");
		setPrenom(sc.nextLine());
		
		System.out.println("Nationalité:");
		setPrenom(sc.nextLine());
		
		System.out.println("Adresse:");
		setAdresse(sc.nextLine());
		
		System.out.println("Début:");
		setQuand(sc.nextLine());
		
		System.out.println("Repos:");
		setJourRepos(sc.nextLine());
		
		System.out.println("Fonction:");
		setFonction(sc.nextLine());
		
		System.out.println("Lieu:");
		setLieuDeTravail(sc.nextLine());
		
		System.out.println("durée jours:");
		setDuree(sc.nextLine());
		
		System.out.println("Numéro Rue:"); 
		while (!sc.hasNextInt())  
				{  
				    sc.next();  
				    System.err.print("il faut des chiffres");  
				} 
				setNrue(sc.nextInt());
				
		/*System.out.println("Age:");
		while (!sc.hasNextInt())  
		{  
		    sc.next();  
		    System.err.print("il faut des chiffres");  
		} 
		setAge(sc.nextInt());
		*/
		
		System.out.println("N# SS:");
		while (!sc.hasNextInt())  
		{  
		    sc.next();  
		    System.err.print("il faut des chiffres");  
		} 
		setNSS(sc.nextInt());
		
		
		System.out.println("Code postal");
		while (!sc.hasNextInt())  
		{  
		    sc.next();  
		    System.err.print("il faut des chiffres");  
		} 
		setCp(sc.nextInt());
		
		
		System.out.println("Période essai:");
		while (!sc.hasNextInt())  
		{  
		    sc.next();  
		    System.err.print("il faut des chiffres");  
		} 
		setEssai(sc.nextInt());
		
		
		System.out.println("Salaire:");
		while (!sc.hasNextInt())  
		{  
		    sc.next();  
		    System.err.print("il faut des chiffres");  
		} 
		setSalaire(sc.nextInt());
		
		System.out.println("congés en jours:");
		while (!sc.hasNextInt())  
		{  
		    sc.next();  
		    System.err.print("il faut des chiffres");  
		} 
		setConges(sc.nextInt());
		
		//choix type contrat 
	        	System.out.println("--Contrat--");
	        	System.out.println("CDI : tapez 1");
	        	System.out.println("CDD : tapez 2");
	        	System.out.println("Interim : tapez 3");
	        setTypeContrat(sc.nextInt());
	}
	
	public void affichage(){
		
		System.out.println("contrat de " + prenom +" "+ nom + " habitant au " + Nrue +" "+ adresse + " " + cp + " agé de "+ age);
	}

	//Getter Setter
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getNationalite() {
		return nationalite;
	}

	public void setNationalite(String nationalite) {
		this.nationalite = nationalite;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public int getNrue() {
		return Nrue;
	}

	public void setNrue(int nrue) {
		Nrue = nrue;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getCp() {
		return cp;
	}

	public void setCp(int cp) {
		this.cp = cp;
	}
	public int getHorraire() {
		return horraire;
	}

	public void setHorraire(int horraire) {
		this.horraire = horraire;
	}

	public int getSalaire() {
		return salaire;
	}

	public void setSalaire(int salaire) {
		this.salaire = salaire;
	}

	public int getConges() {
		return conges;
	}

	public void setConges(int conges) {
		this.conges = conges;
	}


	public String getFonction() {
		return fonction;
	}

	public void setFonction(String fonction) {
		this.fonction = fonction;
	}

	public String getLieuDeTravail() {
		return LieuDeTravail;
	}

	public void setLieuDeTravail(String lieuDeTravail) {
		LieuDeTravail = lieuDeTravail;
	}

	public int getNSS() {
		return NSS;
	}

	public void setNSS(int nSS) {
		NSS = nSS;
	}

	public int getTypeContrat() {
		return typeContrat;
	}

	public void setTypeContrat(int typeContrat) {
		this.typeContrat = typeContrat;
	}

	public String getQuand() {
		return quand;
	}

	public void setQuand(String quand) {
		this.quand = quand;
	}

	public int getEssai() {
		return essai;
	}

	public void setEssai(int essai) {
		this.essai = essai;
	}

	public String getJourRepos() {
		return jourRepos;
	}

	public void setJourRepos(String jourRepos) {
		this.jourRepos = jourRepos;
	}

	public String getDuree() {
		return duree;
	}

	public void setDuree(String duree) {
		this.duree = duree;
	}

}
