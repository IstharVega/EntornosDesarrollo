package lib;
import java.io.FileOutputStream;

import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class CrearPDF {
    public void añadirTexto() throws Exception{
        Document document = new Document();
String parrafo = "Calificaciones inventadas de Esther, "
+ "Podía ponerme todo sobresalientes, pero hay que ser modesta y con un notable me conformo, "
+ "ale, pues ya estaría, estas son mis notas, pero si no le gustan, tengo otras."
+ "TODO NOTABLES, porque Esther es muy notable";
PdfWriter.getInstance(document, new FileOutputStream("Calificaciones_ESTHER.pdf"));
document.open();
document.add(new Paragraph(parrafo));
document.close();
    }
    public static void main(String args[]){
        try{
            CrearPDF cpd=new CrearPDF();
            cpd.añadirTexto();
            }catch (Exception e){System.out.println(e);}
    }
    }

