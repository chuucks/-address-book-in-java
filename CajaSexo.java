/*  1:   */ package agenda;
/*  2:   */ 
/*  3:   */ import java.awt.event.ActionEvent;
/*  4:   */ import java.awt.event.ActionListener;
/*  5:   */ import javax.swing.JCheckBox;
/*  6:   */ import javax.swing.JTextArea;
/*  7:   */ 
/*  8:   */ public class CajaSexo
/*  9:   */   implements ActionListener
/* 10:   */ {
/* 11:   */   public void actionPerformed(ActionEvent e)
/* 12:   */   {
/* 13:14 */     if (EditaContacto.caja_sexo.isSelected())
/* 14:   */     {
/* 15:15 */       EditaContacto.caja_nombre.setSelected(false);
/* 16:16 */       EditaContacto.caja_correo.setSelected(false);
/* 17:17 */       EditaContacto.caja_celular.setSelected(false);
/* 18:18 */       EditaContacto.area_editar.setText("Click Ok\ngender change will be automatically");
/* 19:19 */       EditaContacto.area_editar.setEditable(false);
/* 20:   */     }
/* 21:   */   }
/* 22:   */ }


/* Location:           C:\Users\Chuck\Documents\Dream Apps\Agenda 1.0\Agenda 1.0\Agenda.jar
 * Qualified Name:     agenda.CajaSexo
 * JD-Core Version:    0.7.0.1
 */