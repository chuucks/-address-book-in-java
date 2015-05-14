/*  1:   */ package agenda;
/*  2:   */ 
/*  3:   */ import java.awt.event.ActionEvent;
/*  4:   */ import java.awt.event.ActionListener;
/*  5:   */ import javax.swing.JCheckBox;
/*  6:   */ 
/*  7:   */ public class ValidaFemenino
/*  8:   */   implements ActionListener
/*  9:   */ {
/* 10:   */   public void actionPerformed(ActionEvent e)
/* 11:   */   {
/* 12:14 */     if (AgregarContacto.masculino.isSelected()) {
/* 13:15 */       AgregarContacto.masculino.setSelected(false);
/* 14:   */     }
/* 15:   */   }
/* 16:   */ }


/* Location:           C:\Users\Chuck\Documents\Dream Apps\Agenda 1.0\Agenda 1.0\Agenda.jar
 * Qualified Name:     agenda.ValidaFemenino
 * JD-Core Version:    0.7.0.1
 */