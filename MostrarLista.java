/*  1:   */ package agenda;
/*  2:   */ 
/*  3:   */ import java.util.ArrayList;
/*  4:   */ import java.util.List;
/*  5:   */ import javax.swing.JTextArea;
/*  6:   */ 
/*  7:   */ public class MostrarLista
/*  8:   */ {
/*  9:12 */   public static List<Contacto> contactos = new ArrayList();
/* 10:   */   
/* 11:   */   public static void añadirLista(Contacto contacto)
/* 12:   */   {
/* 13:15 */     contactos.add(contacto);
/* 14:16 */     mostrarPantalla();
/* 15:   */   }
/* 16:   */   
/* 17:   */   public static void mostrarPantalla()
/* 18:   */   {
/* 19:20 */     Agenda.contenedor.setText("");
/* 20:21 */     for (Contacto valor : contactos) {
/* 21:22 */       Agenda.contenedor.append(valor.toString());
/* 22:   */     }
/* 23:   */   }
/* 24:   */ }


/* Location:           C:\Users\Chuck\Documents\Dream Apps\Agenda 1.0\Agenda 1.0\Agenda.jar
 * Qualified Name:     agenda.MostrarLista
 * JD-Core Version:    0.7.0.1
 */