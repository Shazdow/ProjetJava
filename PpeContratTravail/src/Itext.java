
import java.io.FileOutputStream;





import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfWriter;

public class Itext extends interieurContrat{
	
	
	public void run(graph gr, interieurContrat inte) 
	{
		//test
		//creation doc
		Document document = new Document();
		
	try{
		//doc pdf > output stream
		PdfWriter.getInstance(document, new FileOutputStream(gr.getNom().getText()+".pdf"));
		//ouverture
		document.open();
		//ajout item
		populate(document, gr, inte);
		}
		catch(Exception e){
		// fail
		System.err.println(e);
		}
		
		finally{
			document.close();
		}
	
	}
	private void populate(Document document, graph gr, interieurContrat inte) throws DocumentException {
		// TODO Auto-generated method stub
		//add paragraphe
		
        String extractsTexte[] = {
        	/* 1 */
        	"Entre les soussignés :\n"
        	+" La Société Maison des Ligues de Lorraine,\n" 
        	+"Nancy, Lorraine, France,\n"
        	+"Représentée par M. Lucien Sapin,\n"
        	+"D’une part,\n"
        	+"\n",
        	
        	/*2*/
        	"Melle/Mr/Mme " +gr.getPrenom().getText()+" "+ gr.getNom().getText() +" ,\n"
			+"demeurant à "+gr.getNrue().getText()+" "+gr.getAdresse().getText()+ " " +gr.getCp().getText()+" ,\n"
			+"de nationalité "+ gr.getNationalite().getText()+",\n"
			+"N° national identification" + gr.getNSS().getText()+",\n"
			+"d’autre part, \n"
			+"\n",
			
			/*3*/
			// todo interface
			inte.getTextmid()
			+"\n",
			
			/*4*/
			"Fait en deux exemplaires Fait en deux exemplaires \n"
			+"à Metz, le  \n"
			+"Signature de l’employeur Signature de l’employeur \n" 
			+"Faire précéder la signature de la mention « lu et \n"
			+"approuvé »\n"
			+"\n"
			+"\n"
			+"\n"
			+"Signature du salarié Signature du salarié \n"
			+"Faire précéder la signature de la mention « lu et approuvé »,\n", 
			
        };
		document.add(new Paragraph(extractsTexte[0]));
		document.add(new Paragraph(extractsTexte[1]));
		document.add(new Paragraph(extractsTexte[2]));
		document.add(new Paragraph(extractsTexte[3]));
		
	}
}