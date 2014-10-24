
import java.awt.Image;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class FBanco extends javax.swing.JFrame {

    /**
     * Creates new form FBanco
     */
    public FBanco() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PBanco = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        NBanco = new javax.swing.JTextField();
        BAceptar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        Ncajeros = new javax.swing.JTextField();
        Slogo = new javax.swing.JButton();
        BLogo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Banco's Service");
        setBackground(new java.awt.Color(242, 241, 100));

        PBanco.setBackground(new java.awt.Color(232, 135, 38));

        jLabel1.setFont(new java.awt.Font("Liberation Serif", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(249, 239, 239));
        jLabel1.setText("    !Bienvenido a su sistema de servicio al cliente¡");

        jLabel2.setBackground(new java.awt.Color(251, 245, 238));
        jLabel2.setFont(new java.awt.Font("Liberation Serif", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(242, 226, 226));
        jLabel2.setText("Nombre del banco:");

        NBanco.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, java.awt.Color.gray));

        BAceptar.setFont(new java.awt.Font("Liberation Serif", 0, 18)); // NOI18N
        BAceptar.setText("Aceptar");
        BAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BAceptarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Liberation Serif", 3, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(238, 239, 244));
        jLabel3.setText("Número de cajeros disponibles:");

        Slogo.setFont(new java.awt.Font("Liberation Serif", 0, 18)); // NOI18N
        Slogo.setText("Logo");
        Slogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SlogoActionPerformed(evt);
            }
        });

        BLogo.setText("jLabel4");

        javax.swing.GroupLayout PBancoLayout = new javax.swing.GroupLayout(PBanco);
        PBanco.setLayout(PBancoLayout);
        PBancoLayout.setHorizontalGroup(
            PBancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PBancoLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(PBancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PBancoLayout.createSequentialGroup()
                        .addGroup(PBancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PBancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Ncajeros, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NBanco, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(PBancoLayout.createSequentialGroup()
                        .addGroup(PBancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(BAceptar, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                            .addComponent(Slogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(60, 60, 60)
                        .addComponent(BLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(147, 147, 147))))
            .addGroup(PBancoLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        PBancoLayout.setVerticalGroup(
            PBancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PBancoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(PBancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NBanco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PBancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Ncajeros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(PBancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PBancoLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(Slogo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BAceptar))
                    .addGroup(PBancoLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(BLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PBanco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PBanco, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SlogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SlogoActionPerformed
        Bank.setImage();Logo=Bank.getImage();System.out.println(Logo);
        ImageIcon logo=new ImageIcon(Logo); 
        logo.setImage(logo.getImage().getScaledInstance(250, 125, Image.SCALE_SMOOTH));
        BLogo.setIcon(logo); 
        
    }//GEN-LAST:event_SlogoActionPerformed

    private void BAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BAceptarActionPerformed
       if(Bank.getImage()==null||NBanco.getText()==""||Ncajeros.getText()==""){
           JOptionPane.showMessageDialog(rootPane, "Información insuficiente");
           return;}
      
       else{try{
            this.Bank.setCajeros(Integer.parseInt(Ncajeros.getText()));
            this.Bank.setNombre(NBanco.getText());
       }catch(Exception e){JOptionPane.showMessageDialog(rootPane, "Digite el numero de cajeros");return;}
            this.setVisible(false);
            try{
            this.Bank.selfsave();
            this.Bank.selfCargar();}catch(Exception e){}
            java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Program(Bank).setVisible(true);
            }
        });
        }
    }//GEN-LAST:event_BAceptarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        File existe=new File("Banco.obj");
        System.out.println("banco"+!existe.exists());
        if(!existe.exists()){
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Lista initDatos=new Lista();
                initDatos.saveList();
                new FBanco().setVisible(true);  
            }
        });}else{java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Bank=Bank.selfCargar();
                Program Programa=new Program(Bank);
                Programa.setVisible(true);
                Programa.checkear();
                
            }
        });}
       
       
    }
    
    static private Banco Bank=new Banco();
    private String Logo;
    ObjectOutputStream oos;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BAceptar;
    private javax.swing.JLabel BLogo;
    private javax.swing.JTextField NBanco;
    private javax.swing.JTextField Ncajeros;
    private javax.swing.JPanel PBanco;
    private javax.swing.JButton Slogo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
