
import java.awt.Image;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;

public class BReportes extends javax.swing.JFrame {
    public BReportes() {
        initComponents();
        this.llenarTable();
        this.ajustarFechas();
        this.Bank=Bank.selfCargar();
        this.Ldias=this.diaA.leer();
        ImageIcon logo= new ImageIcon(this.Bank.getImage());
        this.LBanco.setText(this.Bank.getNombre());
        logo.setImage(logo.getImage().getScaledInstance(250, 125, Image.SCALE_SMOOTH));
        BLogo.setIcon(logo);
        RHora.setSelected(true);      
    }
    public void llenarTable(){
        this.Lreportes.readList().ToString();
        this.Lreportes=this.Lreportes.readList();
        this.Lreportes.moveToFirst();
        DefaultTableModel modelo= (DefaultTableModel)TablaDinamica.getModel();
        String [] fila=new String[5*this.Lreportes.getSize()];
        System.out.println(this.Lreportes.getSize()+" != "+0);
        
        for(int j=0;this.Lreportes.getSize()!=j;j++){
            for (int i=0;i!=fila.length;i+=5){
             fila[i]=this.Lreportes.getDataActual().getNombre(); 
        
             fila[i+1]=this.Lreportes.getDataActual().getCorreo();
        
             fila[i+2]=this.Lreportes.getDataActual().horaAtendido();
             
             fila[i+3]=this.Lreportes.getDataActual().fechaAtendido();
            
             fila[i+4]=this.Lreportes.getDataActual().getTipo();
            }
            this.Lreportes.moveNext();
            modelo.addRow(fila);
        } 
        TablaDinamica.setAutoResizeMode(TablaDinamica.getAutoResizeMode());
        TablaDinamica.setModel(modelo);
    }
    public void eliminarTable(){
        DefaultTableModel modelo= (DefaultTableModel)this.TablaDinamica.getModel();
        for(int i=0;i!=modelo.getRowCount();i+=0){
            modelo.removeRow(i);
        }
        this.TablaDinamica.setModel(modelo);
    }
    public void llenarTable(Lista Lreportes){
        Lreportes.readList().ToString();
        Lreportes.moveToFirst();
        DefaultTableModel modelo= (DefaultTableModel)TablaDinamica.getModel();
        String [] fila=new String[5*this.Lreportes.getSize()];
        
        for(int j=0;Lreportes.getSize()!=j;j++){
            for (int i=0;i!=fila.length;i+=5){
             fila[i]=Lreportes.getDataActual().getNombre(); 
             
             fila[i+1]=Lreportes.getDataActual().getCorreo();
        
             fila[i+2]=Lreportes.getDataActual().horaAtendido();
            
             fila[i+3]=Lreportes.getDataActual().fechaAtendido();
        
             fila[i+4]=Lreportes.getDataActual().getTipo();  
             
            }
            Lreportes.moveNext();
            modelo.addRow(fila);
        } 
        TablaDinamica.setModel(modelo);
    }
    public void ajustarFechas(){
         model=new DefaultListModel();
         for(int i=0;this.diaA.listaDias()[i]!=null;i++){
             model.addElement(this.diaA.listaDias()[i]);
         }
         this.LFechas.setModel(model);
         
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TipoOrdenamiento = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        scroll = new javax.swing.JScrollPane();
        TablaDinamica = new javax.swing.JTable();
        RNombre = new javax.swing.JRadioButton();
        RCorreo = new javax.swing.JRadioButton();
        RHora = new javax.swing.JRadioButton();
        RFecha = new javax.swing.JRadioButton();
        RPriory = new javax.swing.JRadioButton();
        BLogo = new javax.swing.JLabel();
        LBanco = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        LFechas = new javax.swing.JList();
        jLabel2 = new javax.swing.JLabel();
        CAntendidos = new javax.swing.JLabel();
        Cespeciales = new javax.swing.JLabel();
        Amayor = new javax.swing.JLabel();
        LEmbarazada = new javax.swing.JLabel();
        Ccorporativo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(238, 133, 28));

        TablaDinamica.setFont(new java.awt.Font("Liberation Serif", 2, 15)); // NOI18N
        TablaDinamica.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Correo", "Hora", "Fecha", "Tipo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scroll.setViewportView(TablaDinamica);

        RNombre.setBackground(new java.awt.Color(238, 133, 28));
        TipoOrdenamiento.add(RNombre);
        RNombre.setFont(new java.awt.Font("Ubuntu", 3, 14)); // NOI18N
        RNombre.setForeground(new java.awt.Color(243, 229, 229));
        RNombre.setText("Nombre");
        RNombre.setFocusPainted(false);
        RNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RNombreActionPerformed(evt);
            }
        });

        RCorreo.setBackground(new java.awt.Color(238, 133, 28));
        TipoOrdenamiento.add(RCorreo);
        RCorreo.setText("Correo");
        RCorreo.setFocusPainted(false);
        RCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RCorreoActionPerformed(evt);
            }
        });

        RHora.setBackground(new java.awt.Color(238, 133, 28));
        TipoOrdenamiento.add(RHora);
        RHora.setText("Hora");
        RHora.setFocusPainted(false);
        RHora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RHoraActionPerformed(evt);
            }
        });

        RFecha.setBackground(new java.awt.Color(238, 133, 28));
        TipoOrdenamiento.add(RFecha);
        RFecha.setText("Fecha");
        RFecha.setFocusPainted(false);
        RFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RFechaActionPerformed(evt);
            }
        });

        RPriory.setBackground(new java.awt.Color(238, 133, 28));
        TipoOrdenamiento.add(RPriory);
        RPriory.setText("Prioridad");
        RPriory.setFocusPainted(false);
        RPriory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RPrioryActionPerformed(evt);
            }
        });

        BLogo.setBackground(new java.awt.Color(243, 131, 19));
        BLogo.setText("jLabel1");

        LBanco.setFont(new java.awt.Font("Liberation Serif", 3, 36)); // NOI18N
        LBanco.setForeground(new java.awt.Color(249, 239, 239));
        LBanco.setText("jLabel1");

        jLabel1.setFont(new java.awt.Font("Liberation Serif", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(253, 243, 243));
        jLabel1.setText("Lista de Clientes ordenada por:");

        jButton1.setText("jButton1");

        jButton2.setText("jButton2");

        LFechas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LFechasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(LFechas);

        jLabel2.setFont(new java.awt.Font("Liberation Serif", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(249, 239, 239));
        jLabel2.setText("Fechas de ateción al clienta:");

        CAntendidos.setFont(new java.awt.Font("Ubuntu", 3, 15)); // NOI18N
        CAntendidos.setForeground(new java.awt.Color(251, 241, 241));
        CAntendidos.setText("Cantidad de atendidos:");

        Cespeciales.setFont(new java.awt.Font("Ubuntu", 3, 15)); // NOI18N
        Cespeciales.setForeground(new java.awt.Color(254, 247, 247));
        Cespeciales.setText("Especiales:");

        Amayor.setFont(new java.awt.Font("Ubuntu", 3, 15)); // NOI18N
        Amayor.setForeground(new java.awt.Color(254, 247, 247));
        Amayor.setText("A.Mayor:");

        LEmbarazada.setFont(new java.awt.Font("Ubuntu", 3, 15)); // NOI18N
        LEmbarazada.setForeground(new java.awt.Color(252, 240, 240));
        LEmbarazada.setText("M.Embarazada:");

        Ccorporativo.setFont(new java.awt.Font("Ubuntu", 3, 15)); // NOI18N
        Ccorporativo.setForeground(new java.awt.Color(254, 254, 254));
        Ccorporativo.setText("C.Corporativo");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(RNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(RCorreo)
                        .addGap(78, 78, 78)
                        .addComponent(RHora)
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(RFecha)
                        .addGap(71, 71, 71)
                        .addComponent(RPriory)
                        .addGap(91, 91, 91))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(LBanco, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(CAntendidos, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(Amayor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(Cespeciales, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(LEmbarazada, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(Ccorporativo, javax.swing.GroupLayout.Alignment.LEADING))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addComponent(scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 683, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 30, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LBanco, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(RNombre)
                            .addComponent(RCorreo)
                            .addComponent(RHora)
                            .addComponent(RFecha)
                            .addComponent(RPriory))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(CAntendidos)
                                .addGap(18, 18, 18)
                                .addComponent(Cespeciales)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Amayor)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(LEmbarazada)
                                .addGap(18, 18, 18)
                                .addComponent(Ccorporativo))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addGap(14, 14, 14))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RNombreActionPerformed
        this.Lreportes.bubbleName();
        this.eliminarTable();
        this.llenarTable(this.Lreportes);
    }//GEN-LAST:event_RNombreActionPerformed
    
    private void RPrioryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RPrioryActionPerformed
        this.Lreportes.bubbleSort();
        this.eliminarTable();
        this.llenarTable(Lreportes);
    }//GEN-LAST:event_RPrioryActionPerformed

    private void RFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RFechaActionPerformed
       this.Lreportes.readList();
       this.eliminarTable();
       this.llenarTable();
    }//GEN-LAST:event_RFechaActionPerformed

    private void RCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RCorreoActionPerformed
       this.Lreportes.bubbleCorreo();
       this.eliminarTable();
       this.llenarTable(this.Lreportes); 
    }//GEN-LAST:event_RCorreoActionPerformed

    private void RHoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RHoraActionPerformed
       this.Lreportes.readList();
       this.eliminarTable();
       this.llenarTable();
    }//GEN-LAST:event_RHoraActionPerformed

    private void LFechasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LFechasMouseClicked
        this.CAntendidos.setText("Cantidad de atendidos: "+Integer.toString(this.Ldias[this.LFechas.getSelectedIndex()].getTotal()));
        this.Cespeciales.setText("C.Especial: "+Integer.toString(this.Ldias[this.LFechas.getSelectedIndex()].getEspecial()));
        this.Amayor.setText("A.Mayor: "+Integer.toString(this.Ldias[this.LFechas.getSelectedIndex()].getAmayor()));
        this.LEmbarazada.setText("M.Embarazada: "+Integer.toString(this.Ldias[this.LFechas.getSelectedIndex()].getEmbrazadas()));
        this.Ccorporativo.setText("C.Corporativo: "+Integer.toString(this.Ldias[this.LFechas.getSelectedIndex()].getCorporativos()));
    }//GEN-LAST:event_LFechasMouseClicked

    /**
     * @param args the command line arguments
     */
   
    Lista Lreportes=new Lista();
    Banco Bank= new Banco();
    Dia diaA= new Dia();
    DefaultListModel model;
    Dia [] Ldias=new Dia[this.diaA.leer().length];
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Amayor;
    private javax.swing.JLabel BLogo;
    private javax.swing.JLabel CAntendidos;
    private javax.swing.JLabel Ccorporativo;
    private javax.swing.JLabel Cespeciales;
    private javax.swing.JLabel LBanco;
    private javax.swing.JLabel LEmbarazada;
    private javax.swing.JList LFechas;
    private javax.swing.JRadioButton RCorreo;
    private javax.swing.JRadioButton RFecha;
    private javax.swing.JRadioButton RHora;
    private javax.swing.JRadioButton RNombre;
    private javax.swing.JRadioButton RPriory;
    private javax.swing.JTable TablaDinamica;
    private javax.swing.ButtonGroup TipoOrdenamiento;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane scroll;
    // End of variables declaration//GEN-END:variables
}
