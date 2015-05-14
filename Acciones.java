/*  1:   */ package agenda;
/*  2:   */ 
/*  3:   */ import java.awt.event.ActionEvent;
/*  4:   */ import java.awt.event.ActionListener;
/*  5:   */ import javax.swing.JButton;
/*  6:   */ 
/*  7:   */ public class Acciones
/*  8:   */   implements ActionListener
/*  9:   */ {
/* 10:   */   public void actionPerformed(ActionEvent evento)
/* 11:   */   {
/* 12:15 */     JButton pivote = (JButton)evento.getSource();
/* 13:17 */     switch (pivote.getText())
/* 14:   */     {
/* 15:   */     case "Add": 
/* 16:20 */       AgregarContacto ac = new AgregarContacto("Add Contact");
/* 17:21 */       ac.requestFocus();
/* 18:22 */       ac.setFocusable(true);
/* 19:23 */       ac.setSize(320, 280);
/* 20:24 */       ac.setResizable(false);
/* 21:25 */       ac.setVisible(true);
/* 22:26 */       break;
/* 23:   */     case "Remove": 
/* 24:29 */       BorrarContacto bc = new BorrarContacto("Remove Contact");
/* 25:30 */       bc.requestFocus();
/* 26:31 */       bc.setFocusable(true);
/* 27:32 */       bc.setSize(330, 130);
/* 28:33 */       bc.setResizable(false);
/* 29:34 */       bc.setVisible(true);
/* 30:35 */       break;
/* 31:   */     case "Edit": 
/* 32:38 */       EditaContacto ec = new EditaContacto("Edit Contact");
/* 33:39 */       ec.requestFocus();
/* 34:40 */       ec.setFocusable(true);
/* 35:41 */       ec.setSize(340, 180);
/* 36:42 */       ec.setResizable(false);
/* 37:43 */       ec.setVisible(true);
/* 38:   */     }
/* 39:   */   }
/* 40:   */ }


/* Location:           C:\Users\Chuck\Documents\Dream Apps\Agenda 1.0\Agenda 1.0\Agenda.jar
 * Qualified Name:     agenda.Acciones
 * JD-Core Version:    0.7.0.1
 */