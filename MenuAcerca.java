/*  1:   */ package agenda;
/*  2:   */ 
/*  3:   */ import java.awt.event.ActionEvent;
/*  4:   */ import java.awt.event.ActionListener;
/*  5:   */ import javax.swing.ImageIcon;
/*  6:   */ import javax.swing.JOptionPane;
/*  7:   */ 
/*  8:   */ public class MenuAcerca
/*  9:   */   implements ActionListener
/* 10:   */ {
/* 11:19 */   ImageIcon bien = new ImageIcon("./img/DreamApps.jpg");
/* 12:   */   
/* 13:   */   public void actionPerformed(ActionEvent e)
/* 14:   */   {
/* 15:23 */     JOptionPane.showMessageDialog(null, "            DREAM APPS PEOPLE\n\n Dream apps\n Version 1.2\n México DF  August 2014\n Desarrollador Carlos Salazar\n\n Contacto:\n   dream_apps@outlook.com\n   dreamappsmx@gmail.com\n   @DreamAppsMx\n   /DreamAppsMx\n ", "Acerca de D.A. People version 1.0", 1, this.bien);
/* 16:   */   }
/* 17:   */ }


/* Location:           C:\Users\Chuck\Documents\Dream Apps\Agenda 1.0\Agenda 1.0\Agenda.jar
 * Qualified Name:     agenda.MenuAcerca
 * JD-Core Version:    0.7.0.1
 */