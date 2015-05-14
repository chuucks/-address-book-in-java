/*   1:    */ package agenda;
/*   2:    */ 
/*   3:    */ import java.awt.BorderLayout;
/*   4:    */ import java.awt.Color;
/*   5:    */ import java.awt.Font;
/*   6:    */ import java.awt.GridLayout;
/*   7:    */ import java.awt.event.ActionEvent;
/*   8:    */ import java.awt.event.ActionListener;
/*   9:    */ import javax.swing.ImageIcon;
/*  10:    */ import javax.swing.JButton;
/*  11:    */ import javax.swing.JCheckBox;
/*  12:    */ import javax.swing.JFrame;
/*  13:    */ import javax.swing.JLabel;
/*  14:    */ import javax.swing.JOptionPane;
/*  15:    */ import javax.swing.JPanel;
/*  16:    */ import javax.swing.JScrollPane;
/*  17:    */ import javax.swing.JTextArea;
/*  18:    */ 
/*  19:    */ class AgregarContacto
/*  20:    */   extends JFrame
/*  21:    */   implements ActionListener
/*  22:    */ {
/*  23:    */   private JPanel contenedor;
/*  24:    */   private JPanel panel_nombre;
/*  25:    */   private JPanel panel_celular;
/*  26:    */   private JPanel panel_correo;
/*  27:    */   private JPanel campo_sexo;
/*  28:    */   private JPanel panel_boton;
/*  29:    */   private ImageIcon icono_principal;
/*  30:    */   private ImageIcon imagen_nombre;
/*  31:    */   private ImageIcon imagen_celular;
/*  32:    */   private ImageIcon imagen_correo;
/*  33:    */   private ImageIcon imagen_sexo;
/*  34:    */   private ImageIcon icono_bien;
/*  35:    */   private JLabel etiqueta_nombre;
/*  36:    */   private JLabel etiqueta_celular;
/*  37:    */   private JLabel etiqueta_correo;
/*  38:    */   private JLabel etiqueta_sexo;
/*  39:    */   public static JTextArea campo_nombre;
/*  40:    */   public static JTextArea campo_celular;
/*  41:    */   public static JTextArea campo_correo;
/*  42:    */   private JScrollPane deslizable_nombre;
/*  43:    */   private JScrollPane deslizable_celular;
/*  44:    */   private JScrollPane deslizable_correo;
/*  45:    */   public static JCheckBox femenino;
/*  46:    */   public static JCheckBox masculino;
/*  47:    */   private String nombre;
/*  48:    */   private String celular;
/*  49:    */   private String correo;
/*  50:    */   private String sexo;
/*  51:    */   private JButton ok;
/*  52:    */   private boolean formulario_ok;
/*  53:    */   
/*  54:    */   public AgregarContacto(String nombre)
/*  55:    */   {
/*  56: 37 */     super(nombre);
/*  57: 38 */     setLayout(new BorderLayout());
/*  58: 39 */     this.icono_principal = new ImageIcon("./img/agregar.jpg");
/*  59: 40 */     setIconImage(this.icono_principal.getImage());
/*  60:    */     
/*  61: 42 */     this.contenedor = new JPanel(new GridLayout(4, 2));
/*  62:    */     
/*  63: 44 */     this.imagen_nombre = new ImageIcon("./img/nombre.jpg");
/*  64: 45 */     this.etiqueta_nombre = new JLabel(this.imagen_nombre);
/*  65: 46 */     this.contenedor.add(this.etiqueta_nombre);
/*  66:    */     
/*  67: 48 */     campo_nombre = new JTextArea("Name", 2, 14);
/*  68: 49 */     campo_nombre.setBackground(Color.LIGHT_GRAY);
/*  69: 50 */     campo_nombre.setFont(new Font("Comics Sans Ms", 1, 11));
/*  70: 51 */     campo_nombre.addFocusListener(new ValidaNombre());
/*  71: 52 */     campo_nombre.setEditable(true);
/*  72: 53 */     this.deslizable_nombre = new JScrollPane(campo_nombre);
/*  73: 54 */     this.panel_nombre = new JPanel();
/*  74: 55 */     this.panel_nombre.add(this.deslizable_nombre);
/*  75: 56 */     this.contenedor.add(this.panel_nombre);
/*  76:    */     
/*  77: 58 */     this.imagen_celular = new ImageIcon("./img/celular.jpg");
/*  78: 59 */     this.etiqueta_celular = new JLabel(this.imagen_celular);
/*  79: 60 */     this.contenedor.add(this.etiqueta_celular);
/*  80:    */     
/*  81: 62 */     campo_celular = new JTextArea("Cellphone", 2, 14);
/*  82: 63 */     campo_celular.setFont(new Font("Comics Sans Ms", 1, 11));
/*  83: 64 */     campo_celular.setBackground(Color.LIGHT_GRAY);
/*  84: 65 */     campo_celular.addFocusListener(new ValidaCelular());
/*  85: 66 */     campo_celular.setEditable(true);
/*  86: 67 */     this.deslizable_celular = new JScrollPane(campo_celular);
/*  87: 68 */     this.panel_celular = new JPanel();
/*  88: 69 */     this.panel_celular.add(this.deslizable_celular);
/*  89: 70 */     this.contenedor.add(this.panel_celular);
/*  90:    */     
/*  91: 72 */     this.imagen_correo = new ImageIcon("./img/correo.jpg");
/*  92: 73 */     this.etiqueta_correo = new JLabel(this.imagen_correo);
/*  93: 74 */     this.contenedor.add(this.etiqueta_correo);
/*  94:    */     
/*  95: 76 */     campo_correo = new JTextArea("e-Mail", 2, 14);
/*  96: 77 */     campo_correo.setFont(new Font("Comics Sans Ms", 1, 11));
/*  97: 78 */     campo_correo.setBackground(Color.LIGHT_GRAY);
/*  98: 79 */     campo_correo.addFocusListener(new ValidaCorreo());
/*  99: 80 */     campo_correo.setEditable(true);
/* 100: 81 */     this.deslizable_correo = new JScrollPane(campo_correo);
/* 101: 82 */     this.panel_correo = new JPanel();
/* 102: 83 */     this.panel_correo.add(this.deslizable_correo);
/* 103: 84 */     this.contenedor.add(this.panel_correo);
/* 104:    */     
/* 105: 86 */     this.imagen_sexo = new ImageIcon("./img/sexo.jpg");
/* 106: 87 */     this.etiqueta_sexo = new JLabel(this.imagen_sexo);
/* 107: 88 */     this.contenedor.add(this.etiqueta_sexo);
/* 108:    */     
/* 109: 90 */     this.campo_sexo = new JPanel(new GridLayout(1, 2));
/* 110: 91 */     femenino = new JCheckBox("Female", false);
/* 111: 92 */     femenino.addActionListener(new ValidaFemenino());
/* 112: 93 */     this.campo_sexo.add(femenino);
/* 113: 94 */     masculino = new JCheckBox("Male", false);
/* 114: 95 */     masculino.addActionListener(new ValidaMasculino());
/* 115: 96 */     this.campo_sexo.add(masculino);
/* 116: 97 */     this.contenedor.add(this.campo_sexo);
/* 117:    */     
/* 118: 99 */     add(this.contenedor, "Center");
/* 119:    */     
/* 120:101 */     this.ok = new JButton("Ok");
/* 121:102 */     this.ok.addActionListener(this);
/* 122:103 */     this.panel_boton = new JPanel();
/* 123:104 */     this.panel_boton.add(this.ok);
/* 124:105 */     add(this.panel_boton, "South");
/* 125:    */   }
/* 126:    */   
/* 127:    */   public void actionPerformed(ActionEvent e)
/* 128:    */   {
/* 129:111 */     this.formulario_ok = true;
/* 130:113 */     if ((!campo_nombre.getText().equals("Name")) && (!campo_nombre.getText().equals("")) && (!campo_celular.getText().equals("Cellphone")) && (!campo_celular.getText().equals("")) && (!campo_correo.getText().equals("Name")) && (!campo_correo.getText().equals("")))
/* 131:    */     {
/* 132:114 */       this.nombre = campo_nombre.getText();
/* 133:115 */       this.celular = campo_celular.getText();
/* 134:116 */       this.correo = campo_correo.getText();
/* 135:    */     }
/* 136:    */     else
/* 137:    */     {
/* 138:119 */       this.formulario_ok = false;
/* 139:    */     }
/* 140:121 */     if (femenino.isSelected()) {
/* 141:122 */       this.sexo = "Female";
/* 142:123 */     } else if (masculino.isSelected()) {
/* 143:124 */       this.sexo = "Male";
/* 144:    */     } else {
/* 145:126 */       this.formulario_ok = false;
/* 146:    */     }
/* 147:128 */     if (this.formulario_ok)
/* 148:    */     {
/* 149:129 */       Contacto c = new Contacto(this.nombre, this.celular, this.correo, this.sexo);
/* 150:130 */       MostrarLista.añadirLista(c);
/* 151:131 */       Xml.escribeXml();
/* 152:132 */       this.icono_bien = new ImageIcon("./img/bien.jpg");
/* 153:133 */       JOptionPane.showMessageDialog(this, "Contact added succesfully", "Great!", 1, this.icono_bien);
/* 154:134 */       dispose();
/* 155:    */     }
/* 156:    */     else
/* 157:    */     {
/* 158:136 */       JOptionPane.showMessageDialog(this, "Please, type a value for all the fields, if one is not requeried just type '-' ", "Wait!", 2);
/* 159:    */     }
/* 160:    */   }
/* 161:    */ }


/* Location:           C:\Users\Chuck\Documents\Dream Apps\Agenda 1.0\Agenda 1.0\Agenda.jar
 * Qualified Name:     agenda.AgregarContacto
 * JD-Core Version:    0.7.0.1
 */