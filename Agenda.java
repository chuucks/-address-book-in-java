/*   1:    */ package agenda;
/*   2:    */ 
/*   3:    */ import java.awt.BorderLayout;
/*   4:    */ import java.awt.Color;
/*   5:    */ import java.awt.Dimension;
/*   6:    */ import java.awt.Font;
/*   7:    */ import java.awt.GridLayout;
/*   8:    */ import javax.swing.ImageIcon;
/*   9:    */ import javax.swing.JButton;
/*  10:    */ import javax.swing.JFrame;
/*  11:    */ import javax.swing.JLabel;
/*  12:    */ import javax.swing.JMenu;
/*  13:    */ import javax.swing.JMenuBar;
/*  14:    */ import javax.swing.JMenuItem;
/*  15:    */ import javax.swing.JPanel;
/*  16:    */ import javax.swing.JScrollPane;
/*  17:    */ import javax.swing.JTextArea;
/*  18:    */ 
/*  19:    */ public class Agenda
/*  20:    */   extends JFrame
/*  21:    */ {
/*  22:    */   private JMenuBar barra_menu;
/*  23:    */   private JMenu menu;
/*  24:    */   private JMenuItem ayuda;
/*  25:    */   private JMenuItem acerca;
/*  26:    */   private ImageIcon dream_apps;
/*  27:    */   private JPanel superior;
/*  28:    */   private JPanel panel_buscar;
/*  29:    */   private JPanel panel_busqueda;
/*  30:    */   private JPanel panel_añadir;
/*  31:    */   private JPanel panel_borrar;
/*  32:    */   private JPanel panel_editar;
/*  33:    */   private JPanel panel_izquierda;
/*  34:    */   public static JTextArea busqueda;
/*  35:    */   public static JTextArea contenedor;
/*  36:    */   private JLabel etiqueta_busqueda;
/*  37:    */   private JLabel titulo;
/*  38:    */   private JButton agregar;
/*  39:    */   private JButton borrar;
/*  40:    */   private JButton editar;
/*  41:    */   private JScrollPane deslizable_busqueda;
/*  42:    */   private JScrollPane deslizable;
/*  43:    */   
/*  44:    */   public Agenda(String nombre)
/*  45:    */   {
/*  46: 37 */     super(nombre);
/*  47: 38 */     this.dream_apps = new ImageIcon("./img/DreamApps.jpg");
/*  48: 39 */     setIconImage(this.dream_apps.getImage());
/*  49: 40 */     setLayout(new BorderLayout());
/*  50:    */   }
/*  51:    */   
/*  52:    */   public void creaBarraSuperior()
/*  53:    */   {
/*  54: 44 */     this.superior = new JPanel(new BorderLayout());
/*  55:    */     
/*  56: 46 */     this.titulo = new JLabel("Contacts:");
/*  57: 47 */     this.titulo.setPreferredSize(new Dimension(1, 25));
/*  58: 48 */     this.superior.add(this.titulo, "South");
/*  59:    */     
/*  60: 50 */     this.barra_menu = new JMenuBar();
/*  61: 51 */     this.menu = new JMenu("Help");
/*  62: 52 */     this.menu.setMnemonic(72);
/*  63: 53 */     this.ayuda = new JMenuItem("Help");
/*  64: 54 */     this.ayuda.addActionListener(new MenuAyuda());
/*  65: 55 */     this.acerca = new JMenuItem("About DA People");
/*  66: 56 */     this.acerca.addActionListener(new MenuAcerca());
/*  67: 57 */     this.menu.add(this.ayuda);
/*  68: 58 */     this.menu.addSeparator();
/*  69: 59 */     this.menu.add(this.acerca);
/*  70:    */     
/*  71: 61 */     this.barra_menu.add(this.menu);
/*  72: 62 */     setJMenuBar(this.barra_menu);
/*  73:    */     
/*  74: 64 */     busqueda = new JTextArea("Find", 2, 15);
/*  75: 65 */     busqueda.setBackground(Color.LIGHT_GRAY);
/*  76: 66 */     busqueda.setFont(new Font("Comics Sans Ms", 1, 12));
/*  77: 67 */     busqueda.setEditable(true);
/*  78: 68 */     busqueda.addFocusListener(new ValidaBusqueda());
/*  79: 69 */     busqueda.addKeyListener(new BuscarContacto());
/*  80: 70 */     this.deslizable_busqueda = new JScrollPane(busqueda);
/*  81: 71 */     this.panel_buscar = new JPanel();
/*  82: 72 */     this.panel_buscar.add(this.deslizable_busqueda);
/*  83: 73 */     this.etiqueta_busqueda = new JLabel(new ImageIcon("./img/buscar.jpg"));
/*  84: 74 */     this.panel_busqueda = new JPanel();
/*  85: 75 */     this.panel_busqueda.add(this.panel_buscar);
/*  86: 76 */     this.panel_busqueda.add(this.etiqueta_busqueda);
/*  87: 77 */     this.superior.add(this.panel_busqueda, "West");
/*  88:    */     
/*  89: 79 */     this.agregar = new JButton("Add", new ImageIcon("./img/agregar.jpg"));
/*  90: 80 */     this.agregar.addActionListener(new Acciones());
/*  91: 81 */     this.panel_añadir = new JPanel();
/*  92: 82 */     this.panel_añadir.add(this.agregar);
/*  93:    */     
/*  94: 84 */     this.borrar = new JButton("Remove", new ImageIcon("./img/borrar.jpg"));
/*  95: 85 */     this.borrar.addActionListener(new Acciones());
/*  96: 86 */     this.panel_borrar = new JPanel();
/*  97: 87 */     this.panel_borrar.add(this.borrar);
/*  98:    */     
/*  99: 89 */     this.editar = new JButton("Edit", new ImageIcon("./img/editar.jpg"));
/* 100: 90 */     this.editar.addActionListener(new Acciones());
/* 101: 91 */     this.panel_editar = new JPanel();
/* 102: 92 */     this.panel_editar.add(this.editar);
/* 103:    */     
/* 104: 94 */     this.panel_izquierda = new JPanel(new GridLayout(1, 3));
/* 105: 95 */     this.panel_izquierda.add(this.panel_añadir);
/* 106: 96 */     this.panel_izquierda.add(this.panel_editar);
/* 107: 97 */     this.panel_izquierda.add(this.panel_borrar);
/* 108:    */     
/* 109:    */ 
/* 110:100 */     this.superior.add(this.panel_izquierda, "East");
/* 111:    */     
/* 112:102 */     add(this.superior, "North");
/* 113:    */   }
/* 114:    */   
/* 115:    */   public void crearPanel()
/* 116:    */   {
/* 117:106 */     contenedor = new JTextArea();
/* 118:107 */     contenedor.setEditable(false);
/* 119:108 */     contenedor.setBackground(Color.LIGHT_GRAY);
/* 120:109 */     contenedor.setFont(new Font("Comics Sans Ms", 1, 14));
/* 121:110 */     this.deslizable = new JScrollPane(contenedor);
/* 122:111 */     add(this.deslizable, "Center");
/* 123:    */   }
/* 124:    */ }


/* Location:           C:\Users\Chuck\Documents\Dream Apps\Agenda 1.0\Agenda 1.0\Agenda.jar
 * Qualified Name:     agenda.Agenda
 * JD-Core Version:    0.7.0.1
 */