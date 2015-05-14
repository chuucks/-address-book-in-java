/*  1:   */ package agenda;
/*  2:   */ 
/*  3:   */ import java.io.File;
/*  4:   */ import java.io.FileOutputStream;
/*  5:   */ import javax.swing.JOptionPane;
/*  6:   */ import org.jdom2.Document;
/*  7:   */ import org.jdom2.Element;
/*  8:   */ import org.jdom2.Text;
/*  9:   */ import org.jdom2.input.SAXBuilder;
/* 10:   */ import org.jdom2.output.Format;
/* 11:   */ import org.jdom2.output.XMLOutputter;
/* 12:   */ 
/* 13:   */ public class Xml
/* 14:   */ {
/* 15:   */   public static void leeXml()
/* 16:   */   {
/* 17:21 */     SAXBuilder sax = new SAXBuilder();
/* 18:   */     try
/* 19:   */     {
/* 20:24 */       Document lectura = sax.build(new File("./xml/contactos.xml"));
/* 21:25 */       Element contactos = lectura.getRootElement();
/* 22:27 */       for (Element valor : contactos.getChildren("contact"))
/* 23:   */       {
/* 24:28 */         Contacto creador = new Contacto(valor.getChildText("name"), valor.getChildText("cellphone"), valor.getChildText("e-Mail"), valor.getChildText("gender"));
/* 25:29 */         MostrarLista.añadirLista(creador);
/* 26:   */       }
/* 27:31 */       MostrarLista.mostrarPantalla();
/* 28:   */     }
/* 29:   */     catch (Exception e)
/* 30:   */     {
/* 31:33 */       JOptionPane.showMessageDialog(null, "Couldn´t read contacts, please chek security permisions", "Warning", 2);
/* 32:   */     }
/* 33:   */   }
/* 34:   */   
/* 35:   */   public static void escribeXml()
/* 36:   */   {
/* 37:   */     try
/* 38:   */     {
/* 39:40 */       Document documento = new Document();
/* 40:   */       
/* 41:42 */       Element contactos = new Element("CONTACTS");
/* 42:43 */       documento.setRootElement(contactos);
/* 43:46 */       for (Contacto valor : MostrarLista.contactos)
/* 44:   */       {
/* 45:47 */         Element contacto = new Element("contact");
/* 46:48 */         contactos.addContent(contacto);
/* 47:   */         
/* 48:50 */         Element nombre = new Element("name");
/* 49:51 */         nombre.addContent(new Text(valor.getNombre()));
/* 50:52 */         contacto.addContent(nombre);
/* 51:   */         
/* 52:54 */         Element celular = new Element("cellphone");
/* 53:55 */         celular.addContent(new Text(valor.getCelular()));
/* 54:56 */         contacto.addContent(celular);
/* 55:   */         
/* 56:58 */         Element correo = new Element("e-Mail");
/* 57:59 */         correo.addContent(new Text(valor.getCorreo()));
/* 58:60 */         contacto.addContent(correo);
/* 59:   */         
/* 60:62 */         Element sexo = new Element("gender");
/* 61:63 */         sexo.addContent(new Text(valor.getSexo()));
/* 62:64 */         contacto.addContent(sexo);
/* 63:   */       }
/* 64:67 */       XMLOutputter xmlo = new XMLOutputter(Format.getPrettyFormat());
/* 65:68 */       xmlo.output(documento, new FileOutputStream(new File("./xml/contactos.xml")));
/* 66:   */     }
/* 67:   */     catch (Exception ex)
/* 68:   */     {
/* 69:70 */       JOptionPane.showMessageDialog(null, "Not allowed to write or create xml file to store Contacts, data will be lost", "Warning", 2);
/* 70:71 */       ex.printStackTrace();
/* 71:   */     }
/* 72:   */   }
/* 73:   */ }


/* Location:           C:\Users\Chuck\Documents\Dream Apps\Agenda 1.0\Agenda 1.0\Agenda.jar
 * Qualified Name:     agenda.Xml
 * JD-Core Version:    0.7.0.1
 */