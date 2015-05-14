/*  1:   */ package agenda;
/*  2:   */ 
/*  3:   */ import java.awt.BorderLayout;
/*  4:   */ import java.awt.Color;
/*  5:   */ import java.awt.Font;
/*  6:   */ import java.awt.GridLayout;
/*  7:   */ import java.awt.event.ActionEvent;
/*  8:   */ import java.awt.event.ActionListener;
/*  9:   */ import javax.swing.ImageIcon;
/* 10:   */ import javax.swing.JButton;
/* 11:   */ import javax.swing.JFrame;
/* 12:   */ import javax.swing.JLabel;
/* 13:   */ import javax.swing.JOptionPane;
/* 14:   */ import javax.swing.JPanel;
/* 15:   */ import javax.swing.JScrollPane;
/* 16:   */ import javax.swing.JTextArea;
/* 17:   */ 
/* 18:   */ public class BorrarContacto
/* 19:   */   extends JFrame
/* 20:   */   implements ActionListener
/* 21:   */ {
/* 22:   */   private ImageIcon icono_principal;
/* 23:   */   public static JTextArea ingresar_nombre;
/* 24:   */   private JScrollPane deslizable;
/* 25:   */   private JPanel panel_nombre;
/* 26:   */   private JPanel panel_borrar;
/* 27:   */   private JPanel panel_boton;
/* 28:   */   private JPanel panel_general;
/* 29:   */   private JLabel etiqueta_imagen;
/* 30:   */   private JButton boton_ok;
/* 31:   */   private boolean fue_borrado;
/* 32:   */   
/* 33:   */   public BorrarContacto(String nombre)
/* 34:   */   {
/* 35:33 */     super(nombre);
/* 36:34 */     this.icono_principal = new ImageIcon("./img/borrar.jpg");
/* 37:35 */     setIconImage(this.icono_principal.getImage());
/* 38:36 */     setLayout(new BorderLayout());
/* 39:   */     
/* 40:38 */     ingresar_nombre = new JTextArea("Name", 2, 10);
/* 41:39 */     ingresar_nombre.setBackground(Color.LIGHT_GRAY);
/* 42:40 */     ingresar_nombre.setFont(new Font("Comics Sans Ms", 1, 11));
/* 43:41 */     ingresar_nombre.setEditable(true);
/* 44:42 */     ingresar_nombre.addFocusListener(new ValidaBorrar());
/* 45:43 */     this.deslizable = new JScrollPane(ingresar_nombre);
/* 46:44 */     this.panel_nombre = new JPanel();
/* 47:45 */     this.panel_nombre.add(this.deslizable);
/* 48:   */     
/* 49:47 */     this.etiqueta_imagen = new JLabel(new ImageIcon("./img/nombre.jpg"));
/* 50:   */     
/* 51:49 */     this.panel_borrar = new JPanel(new GridLayout(1, 2));
/* 52:50 */     this.panel_borrar.add(this.etiqueta_imagen);
/* 53:51 */     this.panel_borrar.add(this.panel_nombre);
/* 54:   */     
/* 55:53 */     this.boton_ok = new JButton("Ok");
/* 56:54 */     this.boton_ok.addActionListener(this);
/* 57:55 */     this.panel_boton = new JPanel();
/* 58:56 */     this.panel_boton.add(this.boton_ok);
/* 59:   */     
/* 60:58 */     this.panel_general = new JPanel(new BorderLayout());
/* 61:59 */     this.panel_general.add(this.panel_borrar, "North");
/* 62:60 */     this.panel_general.add(this.panel_boton, "South");
/* 63:   */     
/* 64:62 */     add(this.panel_general, "Center");
/* 65:   */   }
/* 66:   */   
/* 67:   */   public void actionPerformed(ActionEvent e)
/* 68:   */   {
/* 69:68 */     this.fue_borrado = false;
/* 70:70 */     if ((!ingresar_nombre.getText().equals("Name")) && (!ingresar_nombre.getText().equals("")))
/* 71:   */     {
/* 72:71 */       this.fue_borrado = BorraContactos.borrarContacto(ingresar_nombre.getText());
/* 73:72 */       if (this.fue_borrado)
/* 74:   */       {
/* 75:73 */         JOptionPane.showMessageDialog(this, "Contact removed succesfully", "Great!", 1, new ImageIcon("./img/bien.jpg"));
/* 76:74 */         dispose();
/* 77:75 */         MostrarLista.mostrarPantalla();
/* 78:76 */         Xml.escribeXml();
/* 79:   */       }
/* 80:   */       else
/* 81:   */       {
/* 82:78 */         JOptionPane.showMessageDialog(this, "No matches found", "Warning!", 2);
/* 83:   */       }
/* 84:   */     }
/* 85:   */     else
/* 86:   */     {
/* 87:80 */       JOptionPane.showMessageDialog(this, "Type a valid name", "Wait!", 2);
/* 88:   */     }
/* 89:   */   }
/* 90:   */ }


/* Location:           C:\Users\Chuck\Documents\Dream Apps\Agenda 1.0\Agenda 1.0\Agenda.jar
 * Qualified Name:     agenda.BorrarContacto
 * JD-Core Version:    0.7.0.1
 */