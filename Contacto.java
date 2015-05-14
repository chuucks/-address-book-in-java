/*  1:   */ package agenda;
/*  2:   */ 
/*  3:   */ public class Contacto
/*  4:   */ {
/*  5:   */   private String nombre;
/*  6:   */   private String celular;
/*  7:   */   private String correo;
/*  8:   */   private String sexo;
/*  9:   */   
/* 10:   */   public Contacto(String nombre, String celular, String correo, String sexo)
/* 11:   */   {
/* 12:12 */     this.nombre = nombre;
/* 13:13 */     this.celular = celular;
/* 14:14 */     this.correo = correo;
/* 15:15 */     this.sexo = sexo;
/* 16:   */   }
/* 17:   */   
/* 18:   */   public String getNombre()
/* 19:   */   {
/* 20:19 */     return this.nombre;
/* 21:   */   }
/* 22:   */   
/* 23:   */   public void setNombre(String nombre)
/* 24:   */   {
/* 25:23 */     this.nombre = nombre;
/* 26:   */   }
/* 27:   */   
/* 28:   */   public String getCelular()
/* 29:   */   {
/* 30:27 */     return this.celular;
/* 31:   */   }
/* 32:   */   
/* 33:   */   public void setCelular(String celular)
/* 34:   */   {
/* 35:31 */     this.celular = celular;
/* 36:   */   }
/* 37:   */   
/* 38:   */   public String getCorreo()
/* 39:   */   {
/* 40:35 */     return this.correo;
/* 41:   */   }
/* 42:   */   
/* 43:   */   public void setCorreo(String correo)
/* 44:   */   {
/* 45:39 */     this.correo = correo;
/* 46:   */   }
/* 47:   */   
/* 48:   */   public String getSexo()
/* 49:   */   {
/* 50:43 */     return this.sexo;
/* 51:   */   }
/* 52:   */   
/* 53:   */   public void setSexo()
/* 54:   */   {
/* 55:47 */     if (this.sexo.equals("Male")) {
/* 56:48 */       this.sexo = "Female";
/* 57:49 */     } else if (this.sexo.equals("Female")) {
/* 58:50 */       this.sexo = "Male";
/* 59:   */     }
/* 60:   */   }
/* 61:   */   
/* 62:   */   public String toString()
/* 63:   */   {
/* 64:55 */     return "Name: " + this.nombre + "\nCellphone: " + this.celular + "\ne-Mail: " + this.correo + "\nGender: " + this.sexo + "\n\n";
/* 65:   */   }
/* 66:   */ }


/* Location:           C:\Users\Chuck\Documents\Dream Apps\Agenda 1.0\Agenda 1.0\Agenda.jar
 * Qualified Name:     agenda.Contacto
 * JD-Core Version:    0.7.0.1
 */