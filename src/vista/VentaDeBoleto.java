/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import javax.swing.JButton;
import javax.swing.JComboBox;

/**
 *
 * @author Daniel
 */
public class VentaDeBoleto extends javax.swing.JFrame {

    /**
     * Creates new form VentaDeBoleto
     */
    public VentaDeBoleto() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        BotonVender = new javax.swing.JButton();
        BotonCambiar = new javax.swing.JButton();
        ListaDestino = new javax.swing.JComboBox<>();
        ListaHorario = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        jLabel6.setText("jLabel6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BotonVender.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        BotonVender.setText("Vender Boleto");
        BotonVender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonVenderActionPerformed(evt);
            }
        });
        jPanel1.add(BotonVender, new org.netbeans.lib.awtextra.AbsoluteConstraints(832, 381, 180, 55));

        BotonCambiar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        BotonCambiar.setText("CambiarBoleto");
        BotonCambiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCambiarActionPerformed(evt);
            }
        });
        jPanel1.add(BotonCambiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(832, 464, 180, 55));

        ListaDestino.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ListaDestino.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Facultad de Matematicas", "Facultad de Derecho", "Facultad de Medicina" }));
        jPanel1.add(ListaDestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(746, 116, 271, 40));

        ListaHorario.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ListaHorario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "10:00", "11:00", "12:00", "13:00", "14:00", "15:00", "16:00", "18:00", "19:00", "20:00" }));
        jPanel1.add(ListaHorario, new org.netbeans.lib.awtextra.AbsoluteConstraints(746, 203, 271, 40));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Destino");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(746, 81, 271, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Horario");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(746, 168, -1, -1));

        jLabel4.setFont(new java.awt.Font("Eras Demi ITC", 0, 80)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 153));
        jLabel4.setText("UADY");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(282, 81, -1, -1));

        jLabel5.setFont(new java.awt.Font("MV Boli", 3, 48)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 153));
        jLabel5.setText("BUSSS");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(387, 179, 190, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Bus2.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 179, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonCambiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCambiarActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_BotonCambiarActionPerformed

    private void BotonVenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonVenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonVenderActionPerformed

    /**
     * @param args the command line arguments
     */
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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentaDeBoleto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentaDeBoleto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentaDeBoleto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentaDeBoleto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentaDeBoleto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton BotonCambiar;
    public javax.swing.JButton BotonVender;
    public javax.swing.JComboBox<String> ListaDestino;
    public javax.swing.JComboBox<String> ListaHorario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    public JButton getBotonCambiar() {
        return BotonCambiar;
    }

    public void setBotonCambiar(JButton BotonCambiar) {
        this.BotonCambiar = BotonCambiar;
    }

    public JButton getBotonVender() {
        return BotonVender;
    }

    public void setBotonVender(JButton BotonVender) {
        this.BotonVender = BotonVender;
    }

    public JComboBox<String> getListaDestino() {
        return ListaDestino;
    }

    public void setListaDestino(JComboBox<String> ListaDestino) {
        this.ListaDestino = ListaDestino;
    }

    public JComboBox<String> getListaHorario() {
        return ListaHorario;
    }

    public void setListaHorario(JComboBox<String> ListaHorario) {
        this.ListaHorario = ListaHorario;
    }



}
