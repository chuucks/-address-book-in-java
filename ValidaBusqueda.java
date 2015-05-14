/*  1:   */ package agenda;
/*  2:   */ 
/*  3:   */ import java.awt.event.FocusEvent;
/*  4:   */ import java.awt.event.FocusListener;
/*  5:   */ import javax.swing.JTextArea;
/*  6:   */ 
/*  7:   */ public class ValidaBusqueda
/*  8:   */   implements FocusListener
/*  9:   */ {
/* 10:   */   public void focusGained(FocusEvent e)
/* 11:   */   {
/* 12:14 */     if (Agenda.busqueda.getText().equals("Find")) {
/* 13:15 */       Agenda.busqueda.setText("");
/* 14:   */     }
/* 15:   */   }
/* 16:   */   
/* 17:   */   public void focusLost(FocusEvent e)
/* 18:   */   {
/* 19:20 */     if (Agenda.busqueda.getText().equals(""))
/* 20:   */     {
/* 21:21 */       Agenda.busqueda.setText("Find");
/* 22:22 */       MostrarLista.mostrarPantalla();
/* 23:   */     }
/* 24:   */   }
/* 25:   */ }


/* Location:           C:\Users\Chuck\Documents\Dream Apps\Agenda 1.0\Agenda 1.0\Agenda.jar
 * Qualified Name:     agenda.ValidaBusqueda
 * JD-Core Version:    0.7.0.1
 */