/*  1:   */ package agenda;
/*  2:   */ 
/*  3:   */ import java.awt.event.FocusEvent;
/*  4:   */ import java.awt.event.FocusListener;
/*  5:   */ import javax.swing.JTextArea;
/*  6:   */ 
/*  7:   */ public class ValidaCorreo
/*  8:   */   implements FocusListener
/*  9:   */ {
/* 10:   */   public void focusGained(FocusEvent e)
/* 11:   */   {
/* 12:14 */     if (AgregarContacto.campo_correo.getText().equals("e-Mail")) {
/* 13:15 */       AgregarContacto.campo_correo.setText("");
/* 14:   */     }
/* 15:   */   }
/* 16:   */   
/* 17:   */   public void focusLost(FocusEvent e)
/* 18:   */   {
/* 19:20 */     if (AgregarContacto.campo_correo.getText().equals("")) {
/* 20:21 */       AgregarContacto.campo_correo.setText("e-Mail");
/* 21:   */     }
/* 22:   */   }
/* 23:   */ }


/* Location:           C:\Users\Chuck\Documents\Dream Apps\Agenda 1.0\Agenda 1.0\Agenda.jar
 * Qualified Name:     agenda.ValidaCorreo
 * JD-Core Version:    0.7.0.1
 */