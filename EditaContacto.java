/*   1:    */ package agenda;
/*   2:    */ 
/*   3:    */ import java.awt.BorderLayout;
/*   4:    */ import java.awt.Color;
/*   5:    */ import java.awt.Font;
/*   6:    */ import java.awt.GridLayout;
/*   7:    */ import java.awt.event.ActionEvent;
/*   8:    */ import java.awt.event.ActionListener;
/*   9:    */ import java.util.List;
/*  10:    */ import javax.swing.ImageIcon;
/*  11:    */ import javax.swing.JButton;
/*  12:    */ import javax.swing.JCheckBox;
/*  13:    */ import javax.swing.JFrame;
/*  14:    */ import javax.swing.JLabel;
/*  15:    */ import javax.swing.JOptionPane;
/*  16:    */ import javax.swing.JPanel;
/*  17:    */ import javax.swing.JScrollPane;
/*  18:    */ import javax.swing.JTextArea;
/*  19:    */ 
/*  20:    */ public class EditaContacto
/*  21:    */   extends JFrame
/*  22:    */   implements ActionListener
/*  23:    */ {
/*  24:    */   public static JTextArea area_contacto;
/*  25:    */   public static JTextArea area_editar;
/*  26:    */   private JLabel etiqueta_nombre;
/*  27:    */   private JScrollPane deslizable_contacto;
/*  28:    */   private JScrollPane deslizable_editar;
/*  29:    */   private ImageIcon icono_principal;
/*  30:    */   private JPanel panel_area;
/*  31:    */   private JPanel panel_cajas;
/*  32:    */   private JPanel panel_ok;
/*  33:    */   private JPanel panel_editar;
/*  34:    */   private JPanel panel_inferior;
/*  35:    */   public static JCheckBox caja_nombre;
/*  36:    */   public static JCheckBox caja_celular;
/*  37:    */   public static JCheckBox caja_correo;
/*  38:    */   public static JCheckBox caja_sexo;
/*  39:    */   private JButton boton_ok;
/*  40:    */   
/*  41:    */   public EditaContacto(String nombre)
/*  42:    */   {
/*  43: 34 */     super(nombre);
/*  44: 35 */     this.icono_principal = new ImageIcon("./img/editar.jpg");
/*  45: 36 */     setIconImage(this.icono_principal.getImage());
/*  46: 37 */     setLayout(new BorderLayout());
/*  47:    */     
/*  48: 39 */     area_contacto = new JTextArea("Contact name", 2, 10);
/*  49: 40 */     area_contacto.setEditable(true);
/*  50: 41 */     area_contacto.setBackground(Color.LIGHT_GRAY);
/*  51: 42 */     area_contacto.setFont(new Font("Comics Sans Ms", 1, 12));
/*  52: 43 */     area_contacto.addFocusListener(new ValidaContacto());
/*  53: 44 */     this.deslizable_contacto = new JScrollPane(area_contacto);
/*  54:    */     
/*  55: 46 */     this.panel_area = new JPanel(new GridLayout(1, 2));
/*  56: 47 */     this.etiqueta_nombre = new JLabel(new ImageIcon("./img/nombre.jpg"));
/*  57: 48 */     this.panel_area.add(this.etiqueta_nombre);
/*  58: 49 */     this.panel_area.add(this.deslizable_contacto);
/*  59: 50 */     add(this.panel_area, "North");
/*  60:    */     
/*  61: 52 */     caja_nombre = new JCheckBox("Name");
/*  62: 53 */     caja_nombre.addActionListener(new CajaNombre());
/*  63: 54 */     caja_celular = new JCheckBox("Cellphone");
/*  64: 55 */     caja_celular.addActionListener(new CajaCelular());
/*  65: 56 */     caja_correo = new JCheckBox("e-Mail");
/*  66: 57 */     caja_correo.addActionListener(new CajaCorreo());
/*  67: 58 */     caja_sexo = new JCheckBox("Gender");
/*  68: 59 */     caja_sexo.addActionListener(new CajaSexo());
/*  69:    */     
/*  70:    */ 
/*  71: 62 */     this.panel_cajas = new JPanel(new GridLayout(1, 4));
/*  72: 63 */     this.panel_cajas.add(caja_nombre);
/*  73: 64 */     this.panel_cajas.add(caja_celular);
/*  74: 65 */     this.panel_cajas.add(caja_correo);
/*  75: 66 */     this.panel_cajas.add(caja_sexo);
/*  76: 67 */     add(this.panel_cajas, "Center");
/*  77:    */     
/*  78: 69 */     area_editar = new JTextArea("New Value", 2, 10);
/*  79: 70 */     area_editar.setEditable(true);
/*  80: 71 */     area_editar.addFocusListener(new ValidaEditar());
/*  81: 72 */     area_editar.setBackground(Color.LIGHT_GRAY);
/*  82: 73 */     area_editar.setFont(new Font("Comics Sans Ms", 1, 12));
/*  83: 74 */     this.deslizable_editar = new JScrollPane(area_editar);
/*  84: 75 */     this.panel_editar = new JPanel();
/*  85: 76 */     this.panel_editar.add(this.deslizable_editar);
/*  86:    */     
/*  87: 78 */     this.boton_ok = new JButton("Ok");
/*  88: 79 */     this.boton_ok.addActionListener(this);
/*  89: 80 */     this.panel_ok = new JPanel();
/*  90: 81 */     this.panel_ok.add(this.boton_ok);
/*  91:    */     
/*  92: 83 */     this.panel_inferior = new JPanel(new GridLayout(1, 2));
/*  93: 84 */     this.panel_inferior.add(this.panel_editar);
/*  94: 85 */     this.panel_inferior.add(this.panel_ok);
/*  95:    */     
/*  96: 87 */     add(this.panel_inferior, "South");
/*  97:    */   }
/*  98:    */   
/*  99:    */   public void actionPerformed(ActionEvent e)
/* 100:    */   {
/* 101: 94 */     int indice = 0;
/* 102: 95 */     boolean validador = false;
/* 103: 98 */     if ((!area_contacto.getText().equals("Contact name")) && (!area_contacto.getText().equals("")) && (!area_editar.getText().equals("New Value")) && (!area_editar.getText().equals("")))
/* 104:    */     {
/* 105:100 */       String contacto = area_contacto.getText();
/* 106:102 */       for (Contacto valor : MostrarLista.contactos)
/* 107:    */       {
/* 108:103 */         if (valor.getNombre().contains(contacto))
/* 109:    */         {
/* 110:104 */           validador = true;
/* 111:105 */           break;
/* 112:    */         }
/* 113:107 */         indice++;
/* 114:    */       }
/* 115:111 */       if (validador)
/* 116:    */       {
/* 117:112 */         String valor_nuevo = area_editar.getText();
/* 118:113 */         Contacto a_editar = (Contacto)MostrarLista.contactos.get(indice);
/* 119:114 */         if (caja_nombre.isSelected()) {
/* 120:115 */           a_editar.setNombre(valor_nuevo);
/* 121:116 */         } else if (caja_celular.isSelected()) {
/* 122:117 */           a_editar.setCelular(valor_nuevo);
/* 123:118 */         } else if (caja_correo.isSelected()) {
/* 124:119 */           a_editar.setCorreo(valor_nuevo);
/* 125:120 */         } else if (caja_sexo.isSelected()) {
/* 126:121 */           a_editar.setSexo();
/* 127:    */         }
/* 128:122 */         MostrarLista.mostrarPantalla();
/* 129:123 */         Xml.escribeXml();
/* 130:124 */         JOptionPane.showMessageDialog(this, "Contact edited succesfully", "Great!", 1, new ImageIcon("./img/bien.jpg"));
/* 131:125 */         dispose();
/* 132:    */       }
/* 133:    */       else
/* 134:    */       {
/* 135:127 */         JOptionPane.showMessageDialog(this, "No matches found", "Warning!", 2);
/* 136:    */       }
/* 137:    */     }
/* 138:    */     else
/* 139:    */     {
/* 140:129 */       JOptionPane.showMessageDialog(this, "Please, type a name and a new value", "Wait!", 2);
/* 141:    */     }
/* 142:    */   }
/* 143:    */ }


/* Location:           C:\Users\Chuck\Documents\Dream Apps\Agenda 1.0\Agenda 1.0\Agenda.jar
 * Qualified Name:     agenda.EditaContacto
 * JD-Core Version:    0.7.0.1
 */