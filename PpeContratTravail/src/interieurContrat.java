
public class interieurContrat extends graph{
	
	public String textmid;
	
	public void remplissageContrat(graph gr)
	{
		if(gr.getComboBox() == "CDI"){
			
			textmid = 		
			"\n Il est arrêté et convenu ce qui suit :\n"
			+"\n\n"
			+"Date d’embauche et nature du contrat\n ,"
			+"\n\n"
			+"La maison des ligues de Lorraine engage M/MELLE/MME" +gr.getNom().getText()+ " à compter du " + gr.getQuand().getText()+" dans le cadre d’un contrat de travail à," 
			+"durée indéterminée." 
			+"\n\n"
			+"Période d’essai\n"
			+"\n"
			+"Cet engagement est conclu sous réserve d’une période d’essai de " + gr.getEssai().getText() +"  mois," 
			+"durant laquelle il pourra prendre fin à la volonté de l’une ou de "
			+"l’autre des parties à tout moment sans préavis, ni indemnité."
			+"La période d’essai, conformément à la convention collective nationale du sport, pourra être "
			+"renouvelée. Ce renouvellement sera motivé et signifié par écrit. "
			+"\n\n"
			+"Lieu de travail" 
			+"\n\n"
			+"Le contrat de travail s’exécutera à " + gr.getLieuDeTravail().getText() + "."
			+"où il exercera les fonctions de "+ gr.getFonction().getText()+ "sous l’autorité et selon les directives "
			+"\n\n"
			+"Durée et horaires de travail\n"
			+"\nM/MME" +gr.getNom().getText()+ " est tenu d’effectuer une durée hebdomadaire de travail de 35h." 
			+"M/MME" +gr.getNom().getText()+ " est soumis(e) aux horaires en vigueur dans l’entreprise. Ces horaires ne "
			+"constituent pas un élément essentiel du présent contrat, et pourront en conséquence, être "
			+"modifiés en fonction de l’organisation de l’entreprise et des nécessités de service. "
			+"M/MME" +gr.getNom().getText()+ " pourra être amené à effectuer des heures supplémentaires, à la demande de "
			+"son employeur, conformément aux dispositions du Code du travail et de la Convention "
			+"collective." 
			+"\n\n"
			+"Rémunération "
			+"\n\n"
			+"En contrepartie, M/MME" +gr.getNom().getText()+ "percevra une rémunération mensuelle brute de "+ gr.getSalaire().getText()+ "Euros." 
			+"\n\n"
			+"Repos hebdomadaire" 
			+"\n\n"
			+"Option 1 : travail régulier le dimanche \n"
			+"Compte tenu de l’emploi de M/MME "+gr.getNom().getText()+", le jour de" 
			+"repos hebdomadaire ne sera pas fixé le dimanche. "
			+"En contrepartie, il sera accordé à M/MME "+gr.getNom().getText()+" :\n" 
			+"- 11 dimanches non travaillés par an hors congés payés. Son jour de repos "
			+"hebdomadaire est le "+ gr.getJourRepos().getText()+"\n" 
			+"Option 2 : travail exceptionnel le dimanche \n"
			+"Le jour de repos hebdomadaire est fixé le dimanche. "
			+"M/MME "+gr.getNom().getText()+" pourra cependant être amené à travailler de manière exceptionnelle le "
			+"dimanche.\n "
			+"Les heures effectuées seront alors rémunérées ou récupérées conformément à l’article " 
			+"5.1.4.2 de la convention collective nationale du sport.";
			
		}
		if(gr.getComboBox() == "CDD"){
				
			textmid ="Engagement\n"
			+"\n"
			+"Le salarié est engagé en vue d'assurer les fonctions temporaires "
			+"suivantes :"+gr.getFonction().getText() +" pour lesquelles il est "
			+"d'usage constant de ne pas recourir à un contrat à durée indéterminée."
			+"Ce contrat prend effet à compter du "+ gr.getQuand().getText()+". Il est conclu pour la durée suivante"+ gr.getDuree().getText() +"semaines\n"
			+"Fonctions et attributions\n"
			+"Le salarié est engagé en qualité de "+ gr.getFonction().getText()+"\n"
			+"\n"
			+"Période d'essai\n"
			+"\n"
			+"Il est convenu entre les parties au contrat de travail une période d'essai de "+ gr.getEssai().getText()+" jours"
			+"au cours de laquelle chacune des parties pourra rompre le contrat sans indemnité et sans avoir à motiver sa décision."
			+"L'employeur doit cependant respecter un délai de prévenance :\n"
			+"de 24 heures si la durée de présence dans l'entreprise est inférieure à 8 jours ;\n"
			+"de 48 heures de 8 jours à 1 mois de présence.\n"
			+ "Si la durée de l'essai est inférieure à 1 semaine, aucun délai de prévenance n'est prévu.\n" 
			+"En cas de suspension du contrat de travail, cette période d'essai sera prolongée d'une durée égale à ladite suspension.\n"
			+"\n"
			+"Lieu du contrat\n"
			+"\n"
			+"Le salarié exercera ses fonctions au siège social de l'entreprise situé à "+ gr.getLieuDeTravail().getText()+".\n"
			+"\n"
			+" Rémunération\n"
			+"\n"
			+"En contrepartie de son activité, le salarié percevra une rémunération mensuelle brute de " +gr.getSalaire().getText()+" euros\n"
			+"Frais professionnels\n"
			+"Les frais professionnels du salarié engagés dans l'exercice de ses fonctions lui seront remboursés sur présentation des justificatifs. Les notes de frais devront être contresignées par le supérieur hiérarchique mentionné à l'article 2 du présent contrat\n"
			+"\n"
			+" Congés payés\n"
			+"\n"
			+"Le salarié bénéficiera des congés payés en vigueur pour les salariés de la société, soit actuellement "+ gr.getConges().getText()+" jours par an"
			+"Les dates de congés sont arrêtées par la direction.\n"	
			+"S'il n'a pu prendre ses congés payés, le salarié bénéficiera d'une indemnité compensatrice de congés payés à la fin de son contrat\n"
			+"\n"
			+"Fin du contrat\n"
			+"\n"
			+"Au terme de son contrat, le salarié ne percevra pas d'indemnité de fin de contrat\n"
			+"\n"
			;
			}
			if(gr.getComboBox() == "STAGE"){
				textmid = "";
			}
			
			if(gr.getComboBox() == "INTERIM/TEMPORAIRE"){
				textmid = "Article 1 – Objet du contrat\n\n"
						+"Le présent contrat est proposé à "+ gr.getNom().getText()+ " , qui l’accepte, en qualité de personnel temporaire"
						+"pour assurer les fonctions de "+gr.getFonction().getText()+" .\n\n"
						+"Article 2 – Durée du contrat, période probatoire et résiliation\n\n"
						+ "Le présent contrat est conclu pour la période du " +gr.getQuand().getText()+ " pour une durée de "+gr.getDuree().getText()+ "."
						+ "";
			}
	}
	// getter setter

	public String getTextmid() {
		return textmid;
	}

	public void setTextmid(String textmid) {
		this.textmid = textmid;
	}

}
