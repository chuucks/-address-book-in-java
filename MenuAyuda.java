/*  1:   */ package agenda;
/*  2:   */ 
/*  3:   */ import java.awt.event.ActionEvent;
/*  4:   */ import java.awt.event.ActionListener;
/*  5:   */ import javax.swing.JOptionPane;
/*  6:   */ 
/*  7:   */ public class MenuAyuda
/*  8:   */   implements ActionListener
/*  9:   */ {
/* 10:   */   public void actionPerformed(ActionEvent e)
/* 11:   */   {
/* 12:15 */     JOptionPane.showMessageDialog(null, " How to use D.A. People\n\n  1.- Add.- Click the button add, and type all the values for the new contact\n\n 2.- Edit.- Click the button edit, and type the name of the contact to edit, select the value to change and type the new value\n\n 3.- Remove.- Type the name of the contact to delete\n\n 4.- Find.- Type the name of the name of the contact to find", "Dream Apps Help", -1);
/* 13:   */   }
/* 14:   */ }


/* Location:           C:\Users\Chuck\Documents\Dream Apps\Agenda 1.0\Agenda 1.0\Agenda.jar
 * Qualified Name:     agenda.MenuAyuda
 * JD-Core Version:    0.7.0.1
 */