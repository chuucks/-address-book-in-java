/*  1:   */ package agenda;
/*  2:   */ 
/*  3:   */ import java.util.List;
/*  4:   */ 
/*  5:   */ public class BorraContactos
/*  6:   */ {
/*  7:   */   public static boolean borrarContacto(String nombre)
/*  8:   */   {
/*  9:11 */     boolean fue_borrado = false;
/* 10:12 */     int indice_borrar = 0;
/* 11:14 */     if (!MostrarLista.contactos.isEmpty()) {
/* 12:15 */       for (Contacto valor : MostrarLista.contactos)
/* 13:   */       {
/* 14:16 */         if (valor.getNombre().contains(nombre))
/* 15:   */         {
/* 16:17 */           fue_borrado = true;
/* 17:18 */           break;
/* 18:   */         }
/* 19:20 */         indice_borrar++;
/* 20:   */       }
/* 21:   */     }
/* 22:24 */     if (fue_borrado) {
/* 23:25 */       MostrarLista.contactos.remove(indice_borrar);
/* 24:   */     }
/* 25:27 */     return fue_borrado;
/* 26:   */   }
/* 27:   */ }


/* Location:           C:\Users\Chuck\Documents\Dream Apps\Agenda 1.0\Agenda 1.0\Agenda.jar
 * Qualified Name:     agenda.BorraContactos
 * JD-Core Version:    0.7.0.1
 */