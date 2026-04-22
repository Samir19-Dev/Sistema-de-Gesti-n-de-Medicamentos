package Interfaces;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import parcialfinalpoo.CRUDMedicamento; 
import parcialfinalpoo.Medicamento;
import parcialfinalpoo.TipoMedicamento;

public class Principal extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Principal.class.getName());
    
    private String codigo;
    private String nombre;
    private String descripcion;
    private String tipo;
    private Double precio;
    private int stock;
    private String proveedor;
    private String nombreTipo;
    private String codigoTipo;
    private String detallesTipo;
    
    public Principal() {
        initComponents();
        setLocationRelativeTo(null);
       CRUDMedicamento.cargarDatos();
       cargarComboBoxTipos();  
       cargarTablaMedicamentos();
       actualizarEstadisticas();
        ContainerSelect1.setVisible(false);
        ContainerSelect2.setVisible(false);
        ContainerSelect3.setVisible(false);
        
    }
    
public int ocultarConteiners(int pane){
        ContainerSelect.setVisible(false);
        ContainerSelect1.setVisible(false);
        ContainerSelect2.setVisible(false);
        ContainerSelect3.setVisible(false);     
        switch (pane) {
            case 0:
                ContainerSelect.setVisible(true);
                break;  
                
            case 1:
                ContainerSelect1.setVisible(true);
                break;
                
            case 2:
                ContainerSelect2.setVisible(true);
                break;
                
            case 3:
                ContainerSelect3.setVisible(true);
                break;
                
            default:
                System.out.println(" " + pane);
                break;
        }
        return 0;
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelMain = new javax.swing.JPanel();
        Sidebar = new javax.swing.JPanel();
        TxtVersion = new javax.swing.JLabel();
        BtnTipos = new javax.swing.JButton();
        BtnInventario = new javax.swing.JButton();
        BtnGestion = new javax.swing.JButton();
        BtnDash = new javax.swing.JButton();
        ContainerSelect2 = new javax.swing.JLabel();
        ContainerSelect3 = new javax.swing.JLabel();
        ContainerSelect1 = new javax.swing.JLabel();
        ContainerSelect = new javax.swing.JLabel();
        Logo = new javax.swing.JLabel();
        SideBarBackground = new javax.swing.JLabel();
        BtnSalir = new javax.swing.JButton();
        TextTitle = new javax.swing.JLabel();
        TopBarBackground = new javax.swing.JLabel();
        ContainerMain = new javax.swing.JTabbedPane();
        ContainerDash = new javax.swing.JPanel();
        BtnMainVerInventario = new javax.swing.JButton();
        BtnMainBuscar = new javax.swing.JButton();
        BtnMainRegistrar = new javax.swing.JButton();
        SubText = new javax.swing.JLabel();
        TxtBajoStock = new javax.swing.JLabel();
        CardBajoStock = new javax.swing.JLabel();
        TxtEnStock = new javax.swing.JLabel();
        CardEnStock = new javax.swing.JLabel();
        TxtTotalMedi = new javax.swing.JLabel();
        CardTotal = new javax.swing.JLabel();
        TxtSubTitulo = new javax.swing.JLabel();
        TxtTitulo = new javax.swing.JLabel();
        ContainerGestion = new javax.swing.JPanel();
        BtnGestionAgregar = new javax.swing.JButton();
        BtnGestionActualizar = new javax.swing.JButton();
        BtnGestionEliminar = new javax.swing.JButton();
        BtnGestionBuscar = new javax.swing.JButton();
        BtnGestionLimpiar = new javax.swing.JButton();
        ComboBoxGestion = new javax.swing.JComboBox<>();
        Tipodemedicamento = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TxtDescripcion = new javax.swing.JTextArea();
        Descripcion = new javax.swing.JLabel();
        TxtProveedor = new javax.swing.JTextField();
        Proveedor = new javax.swing.JLabel();
        TxtStock = new javax.swing.JTextField();
        Stock = new javax.swing.JLabel();
        TxtPrecio = new javax.swing.JTextField();
        Precio = new javax.swing.JLabel();
        TxtCodigo = new javax.swing.JTextField();
        Codigo = new javax.swing.JLabel();
        TxtNombre = new javax.swing.JTextField();
        Nombre = new javax.swing.JLabel();
        CardContainer = new javax.swing.JLabel();
        TxtSubTitulo1 = new javax.swing.JLabel();
        TxtTitulo1 = new javax.swing.JLabel();
        ContainerInventario = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TableMedicamentos = new javax.swing.JTable();
        ContainerTable = new javax.swing.JLabel();
        ListadodeMedicamentos = new javax.swing.JLabel();
        ContainerTiposMedicamentos = new javax.swing.JPanel();
        BtnTipoAgregar = new javax.swing.JButton();
        BtnTipoActualizar = new javax.swing.JButton();
        BtnTipoEliminar = new javax.swing.JButton();
        BtnTipoBuscar = new javax.swing.JButton();
        ScrollTextDetalleTipo = new javax.swing.JScrollPane();
        TxtDetallesTipo = new javax.swing.JTextArea();
        DetallesTipo = new javax.swing.JLabel();
        TxtCodigoTipo = new javax.swing.JTextField();
        CodigoTipo = new javax.swing.JLabel();
        CardContainerTipo2 = new javax.swing.JLabel();
        BtnLimpiarTipo = new javax.swing.JButton();
        TxtNombreTipo = new javax.swing.JTextField();
        NombreTipos = new javax.swing.JLabel();
        CardContainerTipos = new javax.swing.JLabel();
        AgreguebusqueactualiceoelimineTiposdeMedicamentos = new javax.swing.JLabel();
        GestióndeTiposdeMedicamentos = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelMain.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Sidebar.setBackground(new java.awt.Color(255, 255, 255));
        Sidebar.setPreferredSize(new java.awt.Dimension(236, 596));
        Sidebar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TxtVersion.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        TxtVersion.setForeground(new java.awt.Color(0, 0, 0));
        TxtVersion.setText("v. 1.5.0");
        Sidebar.add(TxtVersion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 570, -1, -1));

        BtnTipos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Botones/BtnTipos.png"))); // NOI18N
        BtnTipos.setBorder(null);
        BtnTipos.setBorderPainted(false);
        BtnTipos.setContentAreaFilled(false);
        BtnTipos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BtnTipos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnTiposMouseClicked(evt);
            }
        });
        BtnTipos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnTiposActionPerformed(evt);
            }
        });
        Sidebar.add(BtnTipos, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, -1, -1));

        BtnInventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Botones/BtnInventario.png"))); // NOI18N
        BtnInventario.setBorder(null);
        BtnInventario.setBorderPainted(false);
        BtnInventario.setContentAreaFilled(false);
        BtnInventario.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BtnInventario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnInventarioMouseClicked(evt);
            }
        });
        BtnInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnInventarioActionPerformed(evt);
            }
        });
        Sidebar.add(BtnInventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, -1, -1));

        BtnGestion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Botones/BtnGestion.png"))); // NOI18N
        BtnGestion.setBorder(null);
        BtnGestion.setBorderPainted(false);
        BtnGestion.setContentAreaFilled(false);
        BtnGestion.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BtnGestion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnGestionMouseClicked(evt);
            }
        });
        BtnGestion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGestionActionPerformed(evt);
            }
        });
        Sidebar.add(BtnGestion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, -1, -1));

        BtnDash.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Botones/BtnDash.png"))); // NOI18N
        BtnDash.setBorder(null);
        BtnDash.setBorderPainted(false);
        BtnDash.setContentAreaFilled(false);
        BtnDash.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BtnDash.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnDashMouseClicked(evt);
            }
        });
        BtnDash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDashActionPerformed(evt);
            }
        });
        Sidebar.add(BtnDash, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));

        ContainerSelect2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Botones/Select.png"))); // NOI18N
        Sidebar.add(ContainerSelect2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 210, 60));

        ContainerSelect3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Botones/Select.png"))); // NOI18N
        Sidebar.add(ContainerSelect3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 210, 60));

        ContainerSelect1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Botones/Select.png"))); // NOI18N
        Sidebar.add(ContainerSelect1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 210, 60));

        ContainerSelect.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Botones/Select.png"))); // NOI18N
        Sidebar.add(ContainerSelect, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Logo.png"))); // NOI18N
        Sidebar.add(Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 200, 200));

        SideBarBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/SideBarBackground.png"))); // NOI18N
        Sidebar.add(SideBarBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        PanelMain.add(Sidebar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        BtnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Botones/BtnSalir.png"))); // NOI18N
        BtnSalir.setBorder(null);
        BtnSalir.setBorderPainted(false);
        BtnSalir.setContentAreaFilled(false);
        BtnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BtnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnSalirMouseClicked(evt);
            }
        });
        PanelMain.add(BtnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 20, -1, -1));

        TextTitle.setBackground(new java.awt.Color(0, 0, 0));
        TextTitle.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        TextTitle.setForeground(new java.awt.Color(0, 0, 0));
        TextTitle.setText("Panel de Administación");
        PanelMain.add(TextTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, -1, -1));

        TopBarBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/TopBar2.png"))); // NOI18N
        PanelMain.add(TopBarBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, -20, -1, 90));

        ContainerDash.setBackground(new java.awt.Color(246, 247, 248));
        ContainerDash.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnMainVerInventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Botones/BotonMainVerInventario.png"))); // NOI18N
        BtnMainVerInventario.setBorder(null);
        BtnMainVerInventario.setBorderPainted(false);
        BtnMainVerInventario.setContentAreaFilled(false);
        BtnMainVerInventario.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BtnMainVerInventario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnMainVerInventarioMouseClicked(evt);
            }
        });
        BtnMainVerInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMainVerInventarioActionPerformed(evt);
            }
        });
        ContainerDash.add(BtnMainVerInventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 400, -1, -1));

        BtnMainBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Botones/BotonMainBuscar.png"))); // NOI18N
        BtnMainBuscar.setBorder(null);
        BtnMainBuscar.setBorderPainted(false);
        BtnMainBuscar.setContentAreaFilled(false);
        BtnMainBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BtnMainBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnMainBuscarMouseClicked(evt);
            }
        });
        ContainerDash.add(BtnMainBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 400, -1, -1));

        BtnMainRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Botones/BotonMainRegistrar.png"))); // NOI18N
        BtnMainRegistrar.setBorder(null);
        BtnMainRegistrar.setBorderPainted(false);
        BtnMainRegistrar.setContentAreaFilled(false);
        BtnMainRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BtnMainRegistrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnMainRegistrarMouseClicked(evt);
            }
        });
        BtnMainRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMainRegistrarActionPerformed(evt);
            }
        });
        ContainerDash.add(BtnMainRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, -1, -1));

        SubText.setBackground(new java.awt.Color(0, 0, 0));
        SubText.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        SubText.setForeground(new java.awt.Color(0, 0, 0));
        SubText.setText("Acciones Rápidas");
        ContainerDash.add(SubText, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 340, -1, -1));

        TxtBajoStock.setFont(new java.awt.Font("Dialog", 1, 35)); // NOI18N
        TxtBajoStock.setForeground(new java.awt.Color(126, 35, 35));
        TxtBajoStock.setText("0");
        ContainerDash.add(TxtBajoStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 210, -1, -1));

        CardBajoStock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Cards/CardStockBajo.png"))); // NOI18N
        ContainerDash.add(CardBajoStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 140, -1, -1));

        TxtEnStock.setFont(new java.awt.Font("Dialog", 1, 35)); // NOI18N
        TxtEnStock.setForeground(new java.awt.Color(0, 0, 0));
        TxtEnStock.setText("0");
        ContainerDash.add(TxtEnStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 210, -1, -1));

        CardEnStock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Cards/CardStockMedicamentos.png"))); // NOI18N
        ContainerDash.add(CardEnStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 140, -1, -1));

        TxtTotalMedi.setFont(new java.awt.Font("Dialog", 1, 35)); // NOI18N
        TxtTotalMedi.setForeground(new java.awt.Color(0, 0, 0));
        TxtTotalMedi.setText("0");
        ContainerDash.add(TxtTotalMedi, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, -1, -1));

        CardTotal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Cards/CardTotalMedicamentos.png"))); // NOI18N
        ContainerDash.add(CardTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, -1, -1));

        TxtSubTitulo.setText("Aquí tienes un resumen del estado actual de tu inventario.");
        ContainerDash.add(TxtSubTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        TxtTitulo.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        TxtTitulo.setForeground(new java.awt.Color(0, 0, 0));
        TxtTitulo.setText("Bienvenido, Administrador");
        ContainerDash.add(TxtTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        ContainerMain.addTab("Dash", ContainerDash);

        ContainerGestion.setBackground(new java.awt.Color(246, 247, 248));
        ContainerGestion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnGestionAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Botones/BotonGestionAgregar.png"))); // NOI18N
        BtnGestionAgregar.setBorder(null);
        BtnGestionAgregar.setBorderPainted(false);
        BtnGestionAgregar.setContentAreaFilled(false);
        BtnGestionAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BtnGestionAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnGestionAgregarMouseClicked(evt);
            }
        });
        BtnGestionAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGestionAgregarActionPerformed(evt);
            }
        });
        ContainerGestion.add(BtnGestionAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 390, -1, -1));

        BtnGestionActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Botones/BotonGestionActualizar.png"))); // NOI18N
        BtnGestionActualizar.setBorder(null);
        BtnGestionActualizar.setBorderPainted(false);
        BtnGestionActualizar.setContentAreaFilled(false);
        BtnGestionActualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BtnGestionActualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnGestionActualizarMouseClicked(evt);
            }
        });
        ContainerGestion.add(BtnGestionActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 390, -1, -1));

        BtnGestionEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Botones/BotonGestionEliminar.png"))); // NOI18N
        BtnGestionEliminar.setBorder(null);
        BtnGestionEliminar.setBorderPainted(false);
        BtnGestionEliminar.setContentAreaFilled(false);
        BtnGestionEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BtnGestionEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnGestionEliminarMouseClicked(evt);
            }
        });
        BtnGestionEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGestionEliminarActionPerformed(evt);
            }
        });
        ContainerGestion.add(BtnGestionEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 390, -1, -1));

        BtnGestionBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Botones/BotonGestionBuscar.png"))); // NOI18N
        BtnGestionBuscar.setBorder(null);
        BtnGestionBuscar.setBorderPainted(false);
        BtnGestionBuscar.setContentAreaFilled(false);
        BtnGestionBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BtnGestionBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnGestionBuscarMouseClicked(evt);
            }
        });
        ContainerGestion.add(BtnGestionBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 390, -1, -1));

        BtnGestionLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Botones/BotonInventarioLimpiar.png"))); // NOI18N
        BtnGestionLimpiar.setBorder(null);
        BtnGestionLimpiar.setBorderPainted(false);
        BtnGestionLimpiar.setContentAreaFilled(false);
        BtnGestionLimpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnGestionLimpiarMouseClicked(evt);
            }
        });
        ContainerGestion.add(BtnGestionLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, -1, -1));

        ComboBoxGestion.setBackground(new java.awt.Color(255, 255, 255));
        ComboBoxGestion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Desinflamatorio", "Antibiotico", "Item 3", "Item 4" }));
        ComboBoxGestion.setBorder(null);
        ComboBoxGestion.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ComboBoxGestion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxGestionActionPerformed(evt);
            }
        });
        ContainerGestion.add(ComboBoxGestion, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 280, 160, 20));

        Tipodemedicamento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Inputs/ComboBoxGestionMedicamento.png"))); // NOI18N
        ContainerGestion.add(Tipodemedicamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 250, -1, -1));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        TxtDescripcion.setBackground(new java.awt.Color(255, 255, 255));
        TxtDescripcion.setColumns(20);
        TxtDescripcion.setRows(5);
        TxtDescripcion.setToolTipText("");
        TxtDescripcion.setWrapStyleWord(true);
        TxtDescripcion.setBorder(null);
        jScrollPane1.setViewportView(TxtDescripcion);

        ContainerGestion.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 280, 350, 50));

        Descripcion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Inputs/TxtGestionDescripcion.png"))); // NOI18N
        ContainerGestion.add(Descripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, -1, -1));

        TxtProveedor.setBackground(new java.awt.Color(255, 255, 255));
        TxtProveedor.setBorder(null);
        ContainerGestion.add(TxtProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 280, 160, 20));

        Proveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Inputs/TxtGestionProveedor.png"))); // NOI18N
        ContainerGestion.add(Proveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, -1));

        TxtStock.setBackground(new java.awt.Color(255, 255, 255));
        TxtStock.setBorder(null);
        ContainerGestion.add(TxtStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 210, 150, 20));

        Stock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Inputs/TxtGestionStock.png"))); // NOI18N
        ContainerGestion.add(Stock, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 180, -1, -1));

        TxtPrecio.setBackground(new java.awt.Color(255, 255, 255));
        TxtPrecio.setBorder(null);
        ContainerGestion.add(TxtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 210, 150, 20));

        Precio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Inputs/TxtGestionPrecio.png"))); // NOI18N
        ContainerGestion.add(Precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 180, -1, -1));

        TxtCodigo.setBackground(new java.awt.Color(255, 255, 255));
        TxtCodigo.setBorder(null);
        ContainerGestion.add(TxtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, 150, 20));

        Codigo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Inputs/TxtGestionCodigo.png"))); // NOI18N
        ContainerGestion.add(Codigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, -1, -1));

        TxtNombre.setBackground(new java.awt.Color(255, 255, 255));
        TxtNombre.setToolTipText("");
        TxtNombre.setBorder(null);
        TxtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtNombreActionPerformed(evt);
            }
        });
        ContainerGestion.add(TxtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 150, 20));

        Nombre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Inputs/TxtGestionNombre.png"))); // NOI18N
        ContainerGestion.add(Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        CardContainer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Cards/CardCRUD.png"))); // NOI18N
        ContainerGestion.add(CardContainer, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        TxtSubTitulo1.setText("Agregue, busque, actualice o elimine registros de medicamentos.");
        ContainerGestion.add(TxtSubTitulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        TxtTitulo1.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        TxtTitulo1.setForeground(new java.awt.Color(0, 0, 0));
        TxtTitulo1.setText("Gestión de Medicamentos");
        ContainerGestion.add(TxtTitulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        ContainerMain.addTab("Gestion", ContainerGestion);

        ContainerInventario.setBackground(new java.awt.Color(246, 247, 248));
        ContainerInventario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setBorder(null);
        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        TableMedicamentos.setBackground(new java.awt.Color(255, 255, 255));
        TableMedicamentos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Código", "Nombre", "Descripción", "Precio", "Proveedor", "Stock", "Código Tipo", "Tipo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TableMedicamentos.setToolTipText("");
        TableMedicamentos.getTableHeader().setReorderingAllowed(false);
        TableMedicamentos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TableMedicamentosKeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(TableMedicamentos);

        ContainerInventario.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 770, 320));

        ContainerTable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Cards/CarList.png"))); // NOI18N
        ContainerInventario.add(ContainerTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, -20, -1, 520));

        ListadodeMedicamentos.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        ListadodeMedicamentos.setForeground(new java.awt.Color(0, 0, 0));
        ListadodeMedicamentos.setText("Listado de Medicamentos");
        ContainerInventario.add(ListadodeMedicamentos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        ContainerMain.addTab("Inventario", ContainerInventario);

        ContainerTiposMedicamentos.setBackground(new java.awt.Color(246, 247, 248));
        ContainerTiposMedicamentos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnTipoAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Botones/BotonGestionAgregar.png"))); // NOI18N
        BtnTipoAgregar.setBorder(null);
        BtnTipoAgregar.setBorderPainted(false);
        BtnTipoAgregar.setContentAreaFilled(false);
        BtnTipoAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BtnTipoAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnTipoAgregarMouseClicked(evt);
            }
        });
        BtnTipoAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnTipoAgregarActionPerformed(evt);
            }
        });
        ContainerTiposMedicamentos.add(BtnTipoAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 390, -1, -1));

        BtnTipoActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Botones/BotonGestionActualizar.png"))); // NOI18N
        BtnTipoActualizar.setBorder(null);
        BtnTipoActualizar.setBorderPainted(false);
        BtnTipoActualizar.setContentAreaFilled(false);
        BtnTipoActualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BtnTipoActualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnTipoActualizarMouseClicked(evt);
            }
        });
        ContainerTiposMedicamentos.add(BtnTipoActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 390, -1, -1));

        BtnTipoEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Botones/BotonGestionEliminar.png"))); // NOI18N
        BtnTipoEliminar.setBorder(null);
        BtnTipoEliminar.setBorderPainted(false);
        BtnTipoEliminar.setContentAreaFilled(false);
        BtnTipoEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BtnTipoEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnTipoEliminarMouseClicked(evt);
            }
        });
        BtnTipoEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnTipoEliminarActionPerformed(evt);
            }
        });
        ContainerTiposMedicamentos.add(BtnTipoEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 390, -1, -1));

        BtnTipoBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Botones/BotonGestionBuscar.png"))); // NOI18N
        BtnTipoBuscar.setBorder(null);
        BtnTipoBuscar.setBorderPainted(false);
        BtnTipoBuscar.setContentAreaFilled(false);
        BtnTipoBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BtnTipoBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnTipoBuscarMouseClicked(evt);
            }
        });
        BtnTipoBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnTipoBuscarActionPerformed(evt);
            }
        });
        ContainerTiposMedicamentos.add(BtnTipoBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 390, -1, -1));

        ScrollTextDetalleTipo.setBackground(new java.awt.Color(255, 255, 255));
        ScrollTextDetalleTipo.setBorder(null);
        ScrollTextDetalleTipo.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        ScrollTextDetalleTipo.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        TxtDetallesTipo.setBackground(new java.awt.Color(255, 255, 255));
        TxtDetallesTipo.setColumns(20);
        TxtDetallesTipo.setRows(5);
        TxtDetallesTipo.setBorder(null);
        ScrollTextDetalleTipo.setViewportView(TxtDetallesTipo);

        ContainerTiposMedicamentos.add(ScrollTextDetalleTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 200, 320, 110));

        DetallesTipo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Inputs/TxtTiposDescripcion.png"))); // NOI18N
        DetallesTipo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ContainerTiposMedicamentos.add(DetallesTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 170, -1, -1));

        TxtCodigoTipo.setBackground(new java.awt.Color(255, 255, 255));
        TxtCodigoTipo.setBorder(null);
        ContainerTiposMedicamentos.add(TxtCodigoTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, 150, 20));

        CodigoTipo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Inputs/TxtTiposCodigo.png"))); // NOI18N
        ContainerTiposMedicamentos.add(CodigoTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, -1, -1));

        CardContainerTipo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Cards/CardTipos2.png"))); // NOI18N
        ContainerTiposMedicamentos.add(CardContainerTipo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, -1, -1));

        BtnLimpiarTipo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Botones/BotonTIposLimpiar.png"))); // NOI18N
        BtnLimpiarTipo.setBorder(null);
        BtnLimpiarTipo.setBorderPainted(false);
        BtnLimpiarTipo.setContentAreaFilled(false);
        BtnLimpiarTipo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BtnLimpiarTipo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnLimpiarTipoMouseClicked(evt);
            }
        });
        ContainerTiposMedicamentos.add(BtnLimpiarTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, -1, -1));

        TxtNombreTipo.setBackground(new java.awt.Color(255, 255, 255));
        TxtNombreTipo.setForeground(new java.awt.Color(0, 0, 0));
        TxtNombreTipo.setBorder(null);
        ContainerTiposMedicamentos.add(TxtNombreTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 150, 20));

        NombreTipos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Inputs/TxtTiposNombre.png"))); // NOI18N
        ContainerTiposMedicamentos.add(NombreTipos, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        CardContainerTipos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Cards/CardGetionTIpoMedicamento.png"))); // NOI18N
        ContainerTiposMedicamentos.add(CardContainerTipos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        AgreguebusqueactualiceoelimineTiposdeMedicamentos.setText("Agregue, busque, actualice o elimine Tipos de Medicamentos.");
        ContainerTiposMedicamentos.add(AgreguebusqueactualiceoelimineTiposdeMedicamentos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        GestióndeTiposdeMedicamentos.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        GestióndeTiposdeMedicamentos.setForeground(new java.awt.Color(0, 0, 0));
        GestióndeTiposdeMedicamentos.setText("Gestión de Tipos de Medicamentos");
        ContainerTiposMedicamentos.add(GestióndeTiposdeMedicamentos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        ContainerMain.addTab("TIposMedicamento", ContainerTiposMedicamentos);

        PanelMain.add(ContainerMain, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, 830, 570));

        getContentPane().add(PanelMain, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 590));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnMainVerInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMainVerInventarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnMainVerInventarioActionPerformed

    private void TxtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtNombreActionPerformed

    private void ComboBoxGestionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxGestionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBoxGestionActionPerformed

    private void BtnGestionBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnGestionBuscarMouseClicked

        try {
        String codigo = TxtCodigo.getText().trim();
        
        if (codigo.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingrese el código del medicamento a buscar", "Campo requerido", JOptionPane.WARNING_MESSAGE);
            return;
        }
         
        Medicamento med = CRUDMedicamento.buscarMedicamentoPorCodigo(codigo);
             
        if (med != null) {
            TxtCodigo.setText(med.getCodigo());
            TxtNombre.setText(med.getNombre());
            TxtDescripcion.setText(med.getDescripcion());
            TxtProveedor.setText(med.getNombreProveedor());
            TxtPrecio.setText(String.valueOf(med.getPrecio()));
            TxtStock.setText(String.valueOf(med.getStock()));
            ComboBoxGestion.setSelectedItem(med.getNombreTipo());
            
            JOptionPane.showMessageDialog(null, "Medicamento encontrado", "Éxito",  JOptionPane.INFORMATION_MESSAGE);
        }
        
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error al buscar: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }       
         
    }//GEN-LAST:event_BtnGestionBuscarMouseClicked

    private void BtnGestionEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGestionEliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnGestionEliminarActionPerformed

    private void BtnGestionEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnGestionEliminarMouseClicked

         try {
      
        codigo = TxtCodigo.getText().trim();
        nombre = TxtNombre.getText().trim();
        
        
        if (codigo.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Primero debe buscar un medicamento para eliminarlo.\n" + "Use el botón 'Buscar' o ingrese el código manualmente.",  "Código requerido", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
    
        int respuesta = JOptionPane.showConfirmDialog(null, "¿Está seguro de eliminar este medicamento?", "Confirmar eliminación", JOptionPane.YES_NO_OPTION,  JOptionPane.WARNING_MESSAGE);
        
        if (respuesta == JOptionPane.YES_OPTION) {
       
            boolean estado = CRUDMedicamento.eliminarMedicamento(codigo);
            
            if (estado) {
                limpiarCampos();
                cargarTablaMedicamentos();
                actualizarEstadisticas();
            }
        }
        
    } catch (Exception e) {
        JOptionPane.showMessageDialog(rootPane, "Error inesperado: " + e.getMessage(), "Error",  JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_BtnGestionEliminarMouseClicked

    private void BtnGestionActualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnGestionActualizarMouseClicked

        try {
  
        codigo = TxtCodigo.getText().trim();
        nombre = TxtNombre.getText().trim();
        descripcion = TxtDescripcion.getText().trim();
        tipo = ComboBoxGestion.getSelectedItem().toString();
        proveedor = TxtProveedor.getText().trim();
        String txtP = TxtPrecio.getText().trim();
        String txtS = TxtStock.getText().trim();
        
        
        if (codigo.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Primero debe buscar un medicamento para actualizarlo.\n" +  "Use el botón 'Buscar' o ingrese el código manualmente.",  "Código requerido",  JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        
        if (txtP.isEmpty() || txtS.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Precio y Stock no pueden estar vacíos", "Campos vacíos",JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        
        precio = Double.parseDouble(txtP);
        stock = Integer.parseInt(txtS);
        
    
        int respuesta = JOptionPane.showConfirmDialog(null, "¿Está seguro de actualizar este medicamento?\n\n" + "Código: " + codigo + "\n" + "Nuevo nombre: " + nombre, "Confirmar actualización", JOptionPane.YES_NO_OPTION,  JOptionPane.QUESTION_MESSAGE);
        
        if (respuesta == JOptionPane.YES_OPTION) {

            boolean estado = CRUDMedicamento.actualizarMedicamento(
                codigo, nombre, descripcion, tipo, precio, stock, proveedor
            );
            
            if (estado) {
                limpiarCampos();
                cargarTablaMedicamentos();
                actualizarEstadisticas();
            }
        }
        
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(rootPane, "Error: Precio debe ser un número decimal (ej: 15.50) y Stock un número entero (ej: 10)",  "Formato incorrecto",JOptionPane.ERROR_MESSAGE);
    } catch (Exception e) {
        JOptionPane.showMessageDialog(rootPane, "Error inesperado: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_BtnGestionActualizarMouseClicked

    private void BtnGestionAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnGestionAgregarMouseClicked

        try {
       
        codigo = TxtCodigo.getText().trim();
        nombre = TxtNombre.getText().trim();
        descripcion = TxtDescripcion.getText().trim();
        tipo = ComboBoxGestion.getSelectedItem().toString();
        proveedor = TxtProveedor.getText().trim();
        String txtP = TxtPrecio.getText().trim();
        String txtS = TxtStock.getText().trim();
        
      
        if (txtP.isEmpty() || txtS.isEmpty()) {
            JOptionPane.showMessageDialog(null,  "Precio y Stock no pueden estar vacíos", "Campos vacíos", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        precio = Double.parseDouble(txtP);
        stock = Integer.parseInt(txtS);
        
        boolean estado = CRUDMedicamento.agregarMedicamento(
            codigo, nombre, descripcion, tipo, precio, stock, proveedor
        );
        
        if (estado) {
            limpiarCampos();
            cargarTablaMedicamentos();
            actualizarEstadisticas();
            JOptionPane.showMessageDialog(rootPane, "Medicamento agregado correctamente", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        }
        
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(rootPane,"Error: Precio debe ser un número decimal (ej: 15.50) y Stock un número entero (ej: 10)", "Formato incorrecto", JOptionPane.ERROR_MESSAGE);
    } catch (Exception e) {
        JOptionPane.showMessageDialog(rootPane, "Error inesperado: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
         
    }//GEN-LAST:event_BtnGestionAgregarMouseClicked
private void limpiarCampos() {
    TxtCodigo.setText("");
    TxtNombre.setText("");
    TxtDescripcion.setText("");
    TxtPrecio.setText("");
    TxtStock.setText("");
    TxtProveedor.setText("");

    if (ComboBoxGestion.getItemCount() > 0) {
        ComboBoxGestion.setSelectedIndex(0);
    }
    
}
 
    private void BtnMainRegistrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnMainRegistrarMouseClicked

        ContainerMain.setSelectedIndex(1);
        int pane = ContainerMain.getSelectedIndex();       
        ocultarConteiners(pane);
    }//GEN-LAST:event_BtnMainRegistrarMouseClicked

    private void BtnMainBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnMainBuscarMouseClicked

        ContainerMain.setSelectedIndex(2);
        int pane = ContainerMain.getSelectedIndex();       
        ocultarConteiners(pane);
    }//GEN-LAST:event_BtnMainBuscarMouseClicked

    private void BtnMainVerInventarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnMainVerInventarioMouseClicked

        ContainerMain.setSelectedIndex(2);
        int pane = ContainerMain.getSelectedIndex();       
        ocultarConteiners(pane);
    }//GEN-LAST:event_BtnMainVerInventarioMouseClicked

    private void BtnDashMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnDashMouseClicked
        ContainerMain.setSelectedIndex(0);
        int pane = ContainerMain.getSelectedIndex();       
        ocultarConteiners(pane);
        
    }//GEN-LAST:event_BtnDashMouseClicked

    private void BtnDashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDashActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnDashActionPerformed

    private void BtnGestionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGestionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnGestionActionPerformed

    private void BtnGestionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnGestionMouseClicked
        ContainerMain.setSelectedIndex(1);
        int pane = ContainerMain.getSelectedIndex();       
        ocultarConteiners(pane);
    }//GEN-LAST:event_BtnGestionMouseClicked

    private void BtnInventarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnInventarioMouseClicked
        ContainerMain.setSelectedIndex(2);
        int pane = ContainerMain.getSelectedIndex();       
        ocultarConteiners(pane);
    }//GEN-LAST:event_BtnInventarioMouseClicked

    private void BtnTiposMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnTiposMouseClicked
        ContainerMain.setSelectedIndex(3);
        int pane = ContainerMain.getSelectedIndex();       
        ocultarConteiners(pane);
    }//GEN-LAST:event_BtnTiposMouseClicked

    private void BtnInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnInventarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnInventarioActionPerformed

    private void BtnMainRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMainRegistrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnMainRegistrarActionPerformed

    private void BtnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnSalirMouseClicked
        dispose();
    }//GEN-LAST:event_BtnSalirMouseClicked

    private void BtnTiposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnTiposActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnTiposActionPerformed

    private void BtnTipoBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnTipoBuscarMouseClicked

       String criterio = TxtCodigoTipo.getText().trim();
    
        if (criterio.isEmpty()) {
            criterio = TxtNombreTipo.getText().trim();
        }

        TipoMedicamento tipo = CRUDMedicamento.buscarTipoPorNombreOCodigo(criterio);

        if (tipo != null) {
            TxtCodigoTipo.setText(tipo.getCodigo());
            TxtNombreTipo.setText(tipo.getNombre());
            TxtDetallesTipo.setText(tipo.getDetalles());
    }
        
    }//GEN-LAST:event_BtnTipoBuscarMouseClicked

    private void BtnTipoEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnTipoEliminarMouseClicked

        try {
        String codigo = TxtCodigoTipo.getText().trim();
        String nombre = TxtNombreTipo.getText().trim();
        
        if (codigo.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Busque primero el tipo a eliminar", "Codigo requerido", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        int confirmacion = JOptionPane.showConfirmDialog(null, "¿Eliminar el tipo '" + nombre + "'?\n\n" + "Código: " + codigo + "\n" + "Esta acción no se puede deshacer.\n", "Confirmar eliminación",  JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        
        if (confirmacion == JOptionPane.YES_OPTION) {
            if (CRUDMedicamento.eliminarTipo(codigo)) {
                limpiarCamposTipo();
                cargarTablaMedicamentos();
                cargarComboBoxTipos();
            }
        }
        
    } catch (Exception e) {
        JOptionPane.showMessageDialog(rootPane, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
       
    }//GEN-LAST:event_BtnTipoEliminarMouseClicked

    private void BtnTipoEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnTipoEliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnTipoEliminarActionPerformed

    private void BtnTipoAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnTipoAgregarMouseClicked

         nombreTipo = TxtNombreTipo.getText();
         codigoTipo = TxtCodigoTipo.getText();
         detallesTipo = TxtDetallesTipo.getText();
         
         boolean estado = CRUDMedicamento.agregarTipoMedicamento(codigoTipo, nombreTipo, detallesTipo);
         
         if (estado){
             cargarComboBoxTipos();
             cargarTablaMedicamentos();
             TxtNombreTipo.setText("");
             TxtCodigoTipo.setText("");
             TxtDetallesTipo.setText("");
             JOptionPane.showMessageDialog(rootPane, "Tipo de Medicamento agregado correctamente");
             
         } else {
             JOptionPane.showMessageDialog(rootPane, "No se pudo agregar correctamente el tipo de medicamento");
         }
    }//GEN-LAST:event_BtnTipoAgregarMouseClicked

    private void BtnTipoActualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnTipoActualizarMouseClicked
      
    String codigo = TxtCodigoTipo.getText().trim();
    String nuevoNombre = TxtNombreTipo.getText().trim();
    String nuevosDetalles = TxtDetallesTipo.getText().trim();
  
    if (codigo.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Primero debe buscar un tipo para editarlo.\n" + "Use el botón 'Buscar' o ingrese el código manualmente.", "Código requerido", JOptionPane.WARNING_MESSAGE);
        return;
    }
    
    
    int respuesta = JOptionPane.showConfirmDialog(null, "¿Está seguro de actualizar este tipo?\n\n" + "Código: " + codigo + "\n" + "Nuevo nombre: " + nuevoNombre, "Confirmar actualización", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
    
    if (respuesta == JOptionPane.YES_OPTION) {
        boolean exito = CRUDMedicamento.actualizarTipo(codigo, nuevoNombre, nuevosDetalles);
        
        if (exito) {
            limpiarCamposTipo();
            cargarComboBoxTipos();
            cargarTablaMedicamentos();
            
        }
    }

    }//GEN-LAST:event_BtnTipoActualizarMouseClicked

    
    private void limpiarCamposTipo() {
    TxtCodigoTipo.setText("");
    TxtNombreTipo.setText("");
    TxtDetallesTipo.setText("");
    TxtCodigoTipo.requestFocus();
}
    
    private void BtnGestionAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGestionAgregarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnGestionAgregarActionPerformed

    private void BtnTipoBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnTipoBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnTipoBuscarActionPerformed

    private void BtnGestionLimpiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnGestionLimpiarMouseClicked

        limpiarCampos();
    }//GEN-LAST:event_BtnGestionLimpiarMouseClicked

    private void BtnTipoAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnTipoAgregarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnTipoAgregarActionPerformed

    private void BtnLimpiarTipoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnLimpiarTipoMouseClicked
       limpiarCamposTipo();
    }//GEN-LAST:event_BtnLimpiarTipoMouseClicked

    private void TableMedicamentosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TableMedicamentosKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_TableMedicamentosKeyPressed
   
    private void BtnAgregarActionPerformed(java.awt.event.ActionEvent evt) {
    try {
        codigo = TxtCodigo.getText().trim();
        nombre = TxtNombre.getText().trim();
        descripcion = TxtDescripcion.getText().trim();
        tipo = ComboBoxGestion.getSelectedItem().toString();
        proveedor = TxtProveedor.getText().trim();
        String txtP = TxtPrecio.getText().trim();
        String txtS = TxtStock.getText().trim();
        
        if (txtP.isEmpty() || txtS.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Precio y Stock no pueden estar vacíos",  "Campos vacíos", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        precio = Double.parseDouble(txtP);
        stock = Integer.parseInt(txtS);
        
        boolean estado = CRUDMedicamento.agregarMedicamento(
            codigo, nombre, descripcion, tipo, precio, stock, proveedor
        );
        
        if (estado) {
            limpiarCampos();
            cargarTablaMedicamentos(); 
            JOptionPane.showMessageDialog(rootPane, "Medicamento agregado correctamente", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        }
        
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(rootPane, "Error: Precio debe ser un número decimal (ej: 15.50) y Stock un número entero (ej: 10)", "Formato incorrecto",  JOptionPane.ERROR_MESSAGE);
    } catch (Exception e) {
        JOptionPane.showMessageDialog(rootPane,"Error inesperado: " + e.getMessage(),"Error", JOptionPane.ERROR_MESSAGE);
    }
}
    
    
// ==================== CARGAR TABLA DE MEDICAMENTOS ====================
private void cargarTablaMedicamentos() {
    
    DefaultTableModel modelo = (DefaultTableModel) TableMedicamentos.getModel();

    modelo.setRowCount(0);
    
    Medicamento[] medicamentos = CRUDMedicamento.obtenerTodosMedicamentos();
    
    for (Medicamento med : medicamentos) {
        if (med != null) {

            TipoMedicamento tipo = CRUDMedicamento.buscarTipoPorNombre(med.getNombreTipo());
            String codigoTipo = (tipo != null) ? tipo.getCodigo() : "N/A";
            
            Object[] fila = {
                med.getCodigo(),                       
                med.getNombre(),  
                med.getDescripcion(),  
                String.format("$%.2f", med.getPrecio()),
                med.getNombreProveedor(), 
                med.getStock(),    
                codigoTipo,  
                med.getNombreTipo() 
            };
            
            modelo.addRow(fila);
        }
    }

}

// ==================== AJUSTAR ANCHO DE COLUMNAS ====================

    public void cargarComboBoxTipos() {
    ComboBoxGestion.removeAllItems(); 
    
    String[] nombresTipos = CRUDMedicamento.obtenerNombresTipos();
    
    if (nombresTipos.length == 0) {
        ComboBoxGestion.addItem("-- Sin tipos disponibles --");
        ComboBoxGestion.setEnabled(false);
    } else {
        ComboBoxGestion.setEnabled(true);
        
        for (int i = 0; i < nombresTipos.length; i++) {
            ComboBoxGestion.addItem(nombresTipos[i]);
        }
    }
}
    
    // ==================== ACTUALIZAR ESTADÍSTICAS EN CARDS ====================
private void actualizarEstadisticas() {

        // Total de UNIDADES de medicamentos (suma de todos los stocks)
    int totalUnidades = CRUDMedicamento.obtenerTotalUnidadesMedicamentos();
    TxtTotalMedi.setText(String.valueOf(totalUnidades));
    
    // Medicamentos en stock (cantidad de medicamentos con stock > 0)
    int enStock = CRUDMedicamento.obtenerMedicamentosEnStock();
    TxtEnStock.setText(String.valueOf(enStock));
    
    // Medicamentos con bajo stock (stock <= 10, INCLUYE los que tienen 0)
    int bajoStock = CRUDMedicamento.obtenerMedicamentosBajoStock();
    TxtBajoStock.setText(String.valueOf(bajoStock));
    
} 
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new Principal().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AgreguebusqueactualiceoelimineTiposdeMedicamentos;
    private javax.swing.JButton BtnDash;
    private javax.swing.JButton BtnGestion;
    private javax.swing.JButton BtnGestionActualizar;
    private javax.swing.JButton BtnGestionAgregar;
    private javax.swing.JButton BtnGestionBuscar;
    private javax.swing.JButton BtnGestionEliminar;
    private javax.swing.JButton BtnGestionLimpiar;
    private javax.swing.JButton BtnInventario;
    private javax.swing.JButton BtnLimpiarTipo;
    private javax.swing.JButton BtnMainBuscar;
    private javax.swing.JButton BtnMainRegistrar;
    private javax.swing.JButton BtnMainVerInventario;
    private javax.swing.JButton BtnSalir;
    private javax.swing.JButton BtnTipoActualizar;
    private javax.swing.JButton BtnTipoAgregar;
    private javax.swing.JButton BtnTipoBuscar;
    private javax.swing.JButton BtnTipoEliminar;
    private javax.swing.JButton BtnTipos;
    private javax.swing.JLabel CardBajoStock;
    private javax.swing.JLabel CardContainer;
    private javax.swing.JLabel CardContainerTipo2;
    private javax.swing.JLabel CardContainerTipos;
    private javax.swing.JLabel CardEnStock;
    private javax.swing.JLabel CardTotal;
    private javax.swing.JLabel Codigo;
    private javax.swing.JLabel CodigoTipo;
    private javax.swing.JComboBox<String> ComboBoxGestion;
    private javax.swing.JPanel ContainerDash;
    private javax.swing.JPanel ContainerGestion;
    private javax.swing.JPanel ContainerInventario;
    private javax.swing.JTabbedPane ContainerMain;
    private javax.swing.JLabel ContainerSelect;
    private javax.swing.JLabel ContainerSelect1;
    private javax.swing.JLabel ContainerSelect2;
    private javax.swing.JLabel ContainerSelect3;
    private javax.swing.JLabel ContainerTable;
    private javax.swing.JPanel ContainerTiposMedicamentos;
    private javax.swing.JLabel Descripcion;
    private javax.swing.JLabel DetallesTipo;
    private javax.swing.JLabel GestióndeTiposdeMedicamentos;
    private javax.swing.JLabel ListadodeMedicamentos;
    private javax.swing.JLabel Logo;
    private javax.swing.JLabel Nombre;
    private javax.swing.JLabel NombreTipos;
    private javax.swing.JPanel PanelMain;
    private javax.swing.JLabel Precio;
    private javax.swing.JLabel Proveedor;
    private javax.swing.JScrollPane ScrollTextDetalleTipo;
    private javax.swing.JLabel SideBarBackground;
    private javax.swing.JPanel Sidebar;
    private javax.swing.JLabel Stock;
    private javax.swing.JLabel SubText;
    private javax.swing.JTable TableMedicamentos;
    private javax.swing.JLabel TextTitle;
    private javax.swing.JLabel Tipodemedicamento;
    private javax.swing.JLabel TopBarBackground;
    private javax.swing.JLabel TxtBajoStock;
    private javax.swing.JTextField TxtCodigo;
    private javax.swing.JTextField TxtCodigoTipo;
    private javax.swing.JTextArea TxtDescripcion;
    private javax.swing.JTextArea TxtDetallesTipo;
    private javax.swing.JLabel TxtEnStock;
    private javax.swing.JTextField TxtNombre;
    private javax.swing.JTextField TxtNombreTipo;
    private javax.swing.JTextField TxtPrecio;
    private javax.swing.JTextField TxtProveedor;
    private javax.swing.JTextField TxtStock;
    private javax.swing.JLabel TxtSubTitulo;
    private javax.swing.JLabel TxtSubTitulo1;
    private javax.swing.JLabel TxtTitulo;
    private javax.swing.JLabel TxtTitulo1;
    private javax.swing.JLabel TxtTotalMedi;
    private javax.swing.JLabel TxtVersion;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
