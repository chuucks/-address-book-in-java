/*  1:   */ package agenda;
/*  2:   */ 
/*  3:   */ import java.io.File;
/*  4:   */ import javax.swing.JOptionPane;
/*  5:   */ 
/*  6:   */ public class Test
/*  7:   */ {
/*  8:   */   public static void main(String[] args)
/*  9:   */   {
/* 10:15 */     Agenda agenda = new Agenda("D.A. People");
/* 11:   */     
/* 12:17 */     agenda.setSize(575, 550);
/* 13:18 */     agenda.setResizable(false);
/* 14:   */     
/* 15:20 */     agenda.setDefaultCloseOperation(3);
/* 16:   */     
/* 17:22 */     agenda.creaBarraSuperior();
/* 18:23 */     agenda.crearPanel();
/* 19:   */     
/* 20:25 */     agenda.setFocusable(true);
/* 21:26 */     agenda.requestFocus();
/* 22:   */     
/* 23:28 */     agenda.setVisible(true);
/* 24:   */     
/* 25:30 */     File directorio = new File("./xml");
/* 26:31 */     File archivo = new File("./xml/contactos.xml");
/* 27:33 */     if (!directorio.exists()) {
/* 28:   */       try
/* 29:   */       {
/* 30:35 */         directorio.mkdir();
/* 31:   */       }
/* 32:   */       catch (Exception e)
/* 33:   */       {
/* 34:37 */         JOptionPane.showMessageDialog(null, "Couldn´t create a directory to store the contacts, please chek security permisions", "Warning", 2);
/* 35:   */       }
/* 36:40 */     } else if (archivo.exists()) {
/* 37:41 */       Xml.leeXml();
/* 38:   */     }
/* 39:   */   }
/* 40:   */ }


/* Location:           C:\Users\Chuck\Documents\Dream Apps\Agenda 1.0\Agenda 1.0\Agenda.jar
 * Qualified Name:     agenda.Test
 * JD-Core Version:    0.7.0.1
 */