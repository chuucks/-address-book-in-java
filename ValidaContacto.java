/*  1:   */ package agenda;
/*  2:   */ 
/*  3:   */ import java.awt.event.FocusEvent;
/*  4:   */ import java.awt.event.FocusListener;
/*  5:   */ import javax.swing.JTextArea;
/*  6:   */ 
/*  7:   */ public class ValidaContacto
/*  8:   */   implements FocusListener
/*  9:   */ {
/* 10:   */   public void focusGained(FocusEvent e)
/* 11:   */   {
/* 12:14 */     if (EditaContacto.area_contacto.getText().equals("Contact name")) {
/* 13:15 */       EditaContacto.area_contacto.setText("");
/* 14:   */     }
/* 15:   */   }
/* 16:   */   
/* 17:   */   public void focusLost(FocusEvent e)
/* 18:   */   {
/* 19:20 */     if (EditaContacto.area_contacto.getText().equals("")) {
/* 20:21 */       EditaContacto.area_contacto.setText("Contact");
/* 21:   */     }
/* 22:   */   }
/* 23:   */ }


/* Location:           C:\Users\Chuck\Documents\Dream Apps\Agenda 1.0\Agenda 1.0\Agenda.jar
 * Qualified Name:     agenda.ValidaContacto
 * JD-Core Version:    0.7.0.1
 */