

/*import java.io.IOException;

import org.apache.pdfbox.exceptions.COSVisitorException;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.edit.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDFont;
import org.apache.pdfbox.pdmodel.font.PDType1Font;

public class ExportPDF {
	
	public static void main(String[] args) {
		
		Formulaire fp = new Formulaire();
		fp.personne();
		
	  try {
	   PDDocument document = new PDDocument();
	   PDPage page = new PDPage();
	   document.addPage( page );
	   PDFont font = PDType1Font.HELVETICA_BOLD;
	   PDPageContentStream contentStream = new PDPageContentStream(document, page);
	   contentStream.beginText();
	   contentStream.setFont( font, 12 );
	   contentStream.moveTextPositionByAmount( 100, 700 );
	   contentStream.drawString("contrat de "+ fp.getNom(), fp.getPrenom(), fp.getAdresse());
	   //contentStream.drawString( "teste retstte tsfghsqgh " );
	   contentStream.endText();
	   contentStream.close();
	   document.save("sandeep-demo.pdf");
	   document.close();
	   System.out.println("coucou");
	  } catch (IOException g) {
	   g.printStackTrace();
	  } catch (COSVisitorException f) {
	   f.printStackTrace();
	  }
	   
	 }
	 
	}
	*/ 


