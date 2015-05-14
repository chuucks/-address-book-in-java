/*  1:   */ package agenda;
/*  2:   */ 
/*  3:   */ import java.awt.event.KeyEvent;
/*  4:   */ import java.awt.event.KeyListener;
/*  5:   */ import javax.swing.JTextArea;
/*  6:   */ 
/*  7:   */ public class BuscarContacto
/*  8:   */   implements KeyListener
/*  9:   */ {
/* 10:   */   public void keyTyped(KeyEvent e)
/* 11:   */   {
/* 12:14 */     Agenda.contenedor.setText("");
/* 13:15 */     for (Contacto valor : MostrarLista.contactos) {
/* 14:16 */       if (valor.getNombre().contains(Agenda.busqueda.getText())) {
/* 15:17 */         Agenda.contenedor.append(valor.toString());
/* 16:   */       }
/* 17:   */     }
/* 18:   */   }
/* 19:   */   
/* 20:   */   public void keyPressed(KeyEvent e) {}
/* 21:   */   
/* 22:   */   public void keyReleased(KeyEvent e) {}
/* 23:   */ }


/* Location:           C:\Users\Chuck\Documents\Dream Apps\Agenda 1.0\Agenda 1.0\Agenda.jar
 * Qualified Name:     agenda.BuscarContacto
 * JD-Core Version:    0.7.0.1
 */