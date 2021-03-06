
public class interieurContrat extends graph{
	
	public String textmid;
	
	public void remplissageContrat(graph gr)
	{
		if(gr.getComboBox() == "CDI"){
			
			textmid = 		
			"\n Il est arr�t� et convenu ce qui suit :\n"
			+"\n\n"
			+"Date d�embauche et nature du contrat\n ,"
			+"\n\n"
			+"La maison des ligues de Lorraine engage M/MELLE/MME" +gr.getNom().getText()+ " � compter du " + gr.getQuand().getText()+" dans le cadre d�un contrat de travail �," 
			+"dur�e ind�termin�e." 
			+"\n\n"
			+"P�riode d�essai\n"
			+"\n"
			+"Cet engagement est conclu sous r�serve d�une p�riode d�essai de " + gr.getEssai().getText() +"  mois," 
			+"durant laquelle il pourra prendre fin � la volont� de l�une ou de "
			+"l�autre des parties � tout moment sans pr�avis, ni indemnit�."
			+"La p�riode d�essai, conform�ment � la convention collective nationale du sport, pourra �tre "
			+"renouvel�e. Ce renouvellement sera motiv� et signifi� par �crit. "
			+"\n\n"
			+"Lieu de travail" 
			+"\n\n"
			+"Le contrat de travail s�ex�cutera � " + gr.getLieuDeTravail().getText() + "."
			+"o� il exercera les fonctions de "+ gr.getFonction().getText()+ "sous l�autorit� et selon les directives "
			+"\n\n"
			+"Dur�e et horaires de travail\n"
			+"\nM/MME" +gr.getNom().getText()+ " est tenu d�effectuer une dur�e hebdomadaire de travail de 35h." 
			+"M/MME" +gr.getNom().getText()+ " est soumis(e) aux horaires en vigueur dans l�entreprise. Ces horaires ne "
			+"constituent pas un �l�ment essentiel du pr�sent contrat, et pourront en cons�quence, �tre "
			+"modifi�s en fonction de l�organisation de l�entreprise et des n�cessit�s de service. "
			+"M/MME" +gr.getNom().getText()+ " pourra �tre amen� � effectuer des heures suppl�mentaires, � la demande de "
			+"son employeur, conform�ment aux dispositions du Code du travail et de la Convention "
			+"collective." 
			+"\n\n"
			+"R�mun�ration "
			+"\n\n"
			+"En contrepartie, M/MME" +gr.getNom().getText()+ "percevra une r�mun�ration mensuelle brute de "+ gr.getSalaire().getText()+ "Euros." 
			+"\n\n"
			+"Repos hebdomadaire" 
			+"\n\n"
			+"Option 1 : travail r�gulier le dimanche \n"
			+"Compte tenu de l�emploi de M/MME "+gr.getNom().getText()+", le jour de" 
			+"repos hebdomadaire ne sera pas fix� le dimanche. "
			+"En contrepartie, il sera accord� � M/MME "+gr.getNom().getText()+" :\n" 
			+"- 11 dimanches non travaill�s par an hors cong�s pay�s. Son jour de repos "
			+"hebdomadaire est le "+ gr.getJourRepos().getText()+"\n" 
			+"Option 2 : travail exceptionnel le dimanche \n"
			+"Le jour de repos hebdomadaire est fix� le dimanche. "
			+"M/MME "+gr.getNom().getText()+" pourra cependant �tre amen� � travailler de mani�re exceptionnelle le "
			+"dimanche.\n "
			+"Les heures effectu�es seront alors r�mun�r�es ou r�cup�r�es conform�ment � l�article " 
			+"5.1.4.2 de la convention collective nationale du sport.";
			
		}
		if(gr.getComboBox() == "CDD"){
				
			textmid ="Engagement\n"
			+"\n"
			+"Le salari� est engag� en vue d'assurer les fonctions temporaires "
			+"suivantes :"+gr.getFonction().getText() +" pour lesquelles il est "
			+"d'usage constant de ne pas recourir � un contrat � dur�e ind�termin�e."
			+"Ce contrat prend effet � compter du "+ gr.getQuand().getText()+". Il est conclu pour la dur�e suivante"+ gr.getDuree().getText() +"semaines\n"
			+"Fonctions et attributions\n"
			+"Le salari� est engag� en qualit� de "+ gr.getFonction().getText()+"\n"
			+"\n"
			+"P�riode d'essai\n"
			+"\n"
			+"Il est convenu entre les parties au contrat de travail une p�riode d'essai de "+ gr.getEssai().getText()+" jours"
			+"au cours de laquelle chacune des parties pourra rompre le contrat sans indemnit� et sans avoir � motiver sa d�cision."
			+"L'employeur doit cependant respecter un d�lai de pr�venance :\n"
			+"de 24 heures si la dur�e de pr�sence dans l'entreprise est inf�rieure � 8 jours ;\n"
			+"de 48 heures de 8 jours � 1 mois de pr�sence.\n"
			+ "Si la dur�e de l'essai est inf�rieure � 1 semaine, aucun d�lai de pr�venance n'est pr�vu.\n" 
			+"En cas de suspension du contrat de travail, cette p�riode d'essai sera prolong�e d'une dur�e �gale � ladite suspension.\n"
			+"\n"
			+"Lieu du contrat\n"
			+"\n"
			+"Le salari� exercera ses fonctions au si�ge social de l'entreprise situ� � "+ gr.getLieuDeTravail().getText()+".\n"
			+"\n"
			+" R�mun�ration\n"
			+"\n"
			+"En contrepartie de son activit�, le salari� percevra une r�mun�ration mensuelle brute de " +gr.getSalaire().getText()+" euros\n"
			+"Frais professionnels\n"
			+"Les frais professionnels du salari� engag�s dans l'exercice de ses fonctions lui seront rembours�s sur pr�sentation des justificatifs. Les notes de frais devront �tre contresign�es par le sup�rieur hi�rarchique mentionn� � l'article 2 du pr�sent contrat\n"
			+"\n"
			+" Cong�s pay�s\n"
			+"\n"
			+"Le salari� b�n�ficiera des cong�s pay�s en vigueur pour les salari�s de la soci�t�, soit actuellement "+ gr.getConges().getText()+" jours par an"
			+"Les dates de cong�s sont arr�t�es par la direction.\n"	
			+"S'il n'a pu prendre ses cong�s pay�s, le salari� b�n�ficiera d'une indemnit� compensatrice de cong�s pay�s � la fin de son contrat\n"
			+"\n"
			+"Fin du contrat\n"
			+"\n"
			+"Au terme de son contrat, le salari� ne percevra pas d'indemnit� de fin de contrat\n"
			+"\n"
			;
			}
			/*if(gr.getComboBox() == "STAGE"){
				textmid = ""
						+ "";
			}*/
			
			if(gr.getComboBox() == "INTERIM/TEMPORAIRE"){
				textmid = "Article 1 � Objet du contrat\n\n"
						+"Le pr�sent contrat est propos� � "+ gr.getNom().getText()+ " , qui l�accepte, en qualit� de personnel temporaire"
						+"pour assurer les fonctions de "+gr.getFonction().getText()+" .\n\n"
						+"Article 2 � Dur�e du contrat, p�riode probatoire et r�siliation\n\n"
						+"Le pr�sent contrat est conclu pour la p�riode du " +gr.getQuand().getText()+ " pour une dur�e de "+gr.getDuree().getText()+ ".\n\n"
						+"Salaire\n\n"
						+"Le travailleur touche un salaire horaire brut de "+gr.getSalaire().getText()+" euros au minimum \n"
						+"Le salaire est vers� � la fin du mois \n\n"
						+"Temps d�essai\n\n"
						+"Un temps d�essai de "+gr.getEssai().getText()+"peut �tre pr�vu pour des missions de dur�e d�termin�e\n\n"
						+"Contrat de mission\n\n"
						+"Le contrat de mission r�gle :\n"
						+ "� le genre de travail � accomplir\n"
						+ "� le lieu de travail\n"
						+ "� le d�but de la mission\n"
						+ "� la dur�e de la mission en cas de dur�e d�termin�e et / ou le d�lai de cong�\n"
						+ "� l�horaire de travail\n"
						+ "� le salaire\n"
						+ "� �v. le 13e mois de salaire pro rata temporis, les allocations et les frais.\n\n"
						+ "Vacances\n\n"
						+ "Le travailleur a en principe droit � "+gr.getConges().getText()+" jours de vacances annuelles pay�es, calcul�es pro rata temporis si l�ann�e n�est pas compl�te.\n"
			;}
	}
	// getter setter

	public String getTextmid() {
		return textmid;
	}

	public void setTextmid(String textmid) {
		this.textmid = textmid;
	}

}
