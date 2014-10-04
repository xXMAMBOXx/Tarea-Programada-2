
import java.awt.Image;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author mambocoto
 */
public class Program extends javax.swing.JFrame {

    /**
     * Creates new form Program
     */
    public Program(Banco x) {
        this.Bank=x;
        System.out.println(this.Bank.getImage()+" "+x.getNombre());
        initComponents();
        InstallBanco(x);this.TCliente.setSelectedIndex(4);
        
    }
    public void InstallBanco(Banco banco){
        ImageIcon logo= new ImageIcon(this.Bank.getImage());
        logo.setImage(logo.getImage().getScaledInstance(250, 125, Image.SCALE_SMOOTH));
        BLogo.setIcon(logo);
        System.out.println(this.Bank.getNombre());
        LBanco.setText(this.Bank.getNombre());
        ajustarCajeros();
        
       
    }
    public void ajustarCajeros(){
        Lcajeros=new DefaultListModel();
        for(int i=0;i!=Bank.getNCajeros();i++){
         Lcajeros.addElement(Bank.getCajeros()[i]);}
        LCajeros.setListData(this.Bank.getNombres());}
    public void checkear(){
        for(int i=0;this.Bank.Cajeros.length!=i&&this.clientes.lenght()!=0;i++){
            if (this.Bank.getCajeros()[i].getStatus()==true){
                System.out.println("SE INFORMO QUE HAY DESOCUPADO TAMBN");
                //pba this.clientes.getFront().informarCliente(true,this.Bank.getImage());
                this.dia.atendido(this.clientes.getFront());
               
                this.clientes.dequeue();
                this.Bank.getCajeros()[i].setStatus(false);
            }
        }
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        BLogo = new javax.swing.JLabel();
        LBanco = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        LCajeros = new javax.swing.JList();
        Cajeros = new javax.swing.JLabel();
        Liberar = new javax.swing.JButton();
        CNombre = new javax.swing.JTextField();
        CCorreo = new javax.swing.JTextField();
        TCliente = new javax.swing.JComboBox();
        Añadir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(228, 133, 38));

        jPanel1.setBackground(new java.awt.Color(230, 128, 26));
        jPanel1.setForeground(new java.awt.Color(244, 132, 21));

        BLogo.setText("jLabel1");

        LBanco.setFont(new java.awt.Font("Liberation Serif", 3, 36)); // NOI18N
        LBanco.setForeground(new java.awt.Color(249, 239, 239));
        LBanco.setText("jLabel1");

        jScrollPane1.setViewportView(LCajeros);

        Cajeros.setFont(new java.awt.Font("Liberation Serif", 3, 18)); // NOI18N
        Cajeros.setForeground(new java.awt.Color(250, 234, 234));
        Cajeros.setText("Cajeros:");

        Liberar.setFont(new java.awt.Font("Liberation Serif", 0, 18)); // NOI18N
        Liberar.setText("Disponible");
        Liberar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LiberarActionPerformed(evt);
            }
        });

        CNombre.setFont(new java.awt.Font("Liberation Serif", 0, 17)); // NOI18N

        CCorreo.setFont(new java.awt.Font("Liberation Serif", 0, 17)); // NOI18N

        TCliente.setFont(new java.awt.Font("Liberation Serif", 0, 17)); // NOI18N
        TCliente.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Cliente Especial", "Adulto Mayor", "Mujer Embarazada", "Cliente Corporotivo", "Cliente Regular" }));

        Añadir.setFont(new java.awt.Font("Liberation Serif", 0, 18)); // NOI18N
        Añadir.setText("Añadir");
        Añadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AñadirActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Liberation Serif", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(247, 237, 237));
        jLabel1.setText("Nombre:");

        jLabel2.setFont(new java.awt.Font("Liberation Serif", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(252, 240, 240));
        jLabel2.setText("Correo:");

        jButton1.setText("ocupar");
        jButton1.setToolTipText("");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(LBanco, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(CCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(3, 3, 3)
                                        .addComponent(CNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(TCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(Añadir, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton1)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 166, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Liberar)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Cajeros, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(24, 24, 24))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LBanco, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Cajeros, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Liberar)
                        .addGap(0, 9, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(41, 41, 41)
                        .addComponent(TCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(75, 75, 75)
                                .addComponent(Añadir)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1)
                                .addGap(72, 72, 72))))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LiberarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LiberarActionPerformed
        try{
        this.Bank.setCactual((Banco.Cajero)Lcajeros.get(LCajeros.getSelectedIndex()));}catch(Exception e){JOptionPane.showMessageDialog(rootPane,"Seleccione un cajero a liberar");return;}
        System.out.println(this.Bank.getCactual().getStatus());
        if(this.Bank.getCactual().getStatus()){
            JOptionPane.showMessageDialog(rootPane,"El cajero ya esta Disponible");return;
        }
        if (this.clientes.lenght()!=0){
            System.out.println("informará:  "+this.clientes.getFront().getNombre()+this.clientes.getFront().getCorreo());
            //pbathis.clientes.getFront().informarCliente(true,this.Bank.getImage());
            this.Bank.getCactual().setStatus(false);JOptionPane.showMessageDialog(rootPane,"Se le asigno un nuevo cliente al cajero liberado \n Nombre de cliente: "+this.clientes.getFront().getNombre());
            this.clientes.dequeue();return;
        }
        this.Bank.getCactual().setStatus(true); LCajeros.setListData(this.Bank.getNombres());
    }//GEN-LAST:event_LiberarActionPerformed

    private void AñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AñadirActionPerformed
        if (this.CNombre.getText()==""||this.CCorreo.getText()==""){JOptionPane.showMessageDialog(rootPane,"Información de cliente incompleta");return;}
        System.out.println(new Cliente (this.CNombre.getText(),this.CCorreo.getText(),this.TCliente.getSelectedIndex()).getNombre());
        //pbanew Cliente (this.CNombre.getText(),this.CCorreo.getText(),this.TCliente.getSelectedIndex()).informarCliente(false, Bank.getImage());
        this.clientes.queue(new Cliente (this.CNombre.getText(),this.CCorreo.getText(),this.TCliente.getSelectedIndex()));
        this.checkear();
        LCajeros.setListData(this.Bank.getNombres());
    }//GEN-LAST:event_AñadirActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       this.Bank.setCactual((Banco.Cajero)Lcajeros.get(LCajeros.getSelectedIndex()));
       this.Bank.getCactual().setStatus(false); LCajeros.setListData(this.Bank.getNombres());
       System.out.println(this.dia.horavshora(0,7));
    }//GEN-LAST:event_jButton1ActionPerformed

    Dia dia=new Dia();
    DefaultListModel Lcajeros;
    private Banco Bank;
    Queue clientes=new Queue();
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Añadir;
    private javax.swing.JLabel BLogo;
    private javax.swing.JTextField CCorreo;
    private javax.swing.JTextField CNombre;
    private javax.swing.JLabel Cajeros;
    private javax.swing.JLabel LBanco;
    private javax.swing.JList LCajeros;
    private javax.swing.JButton Liberar;
    private javax.swing.JComboBox TCliente;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
