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
public class CambioDeBoleto extends javax.swing.JFrame {

    /**
     * Creates new form CambioDeBoleto
     */
    public CambioDeBoleto() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        listaDestinoActual = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        listaHorarioActual = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        listaDestinoCambio = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        listaHorarioCambio = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        botonHacerCambio = new javax.swing.JButton();
        botonCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Boleto Actual");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 30, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Destino");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 80, -1, -1));

        listaDestinoActual.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        listaDestinoActual.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elige el destino", "Faultad de Matematicas", "Facultad de Derecho", "Facultad de Medicina" }));
        jPanel1.add(listaDestinoActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 120, 290, 40));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("Horario");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 160, -1, -1));

        listaHorarioActual.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        listaHorarioActual.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elige le horario", "6:00", "7:00", "8:00", "9:00" }));
        jPanel1.add(listaHorarioActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 190, 290, 40));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel4.setText("Boleto de Cambio");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 250, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setText("Desino");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 290, -1, -1));

        listaDestinoCambio.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        listaDestinoCambio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elige el destino", "Faultad de Matematicas", "Facultad de Derecho", "Facultad de Medicina" }));
        jPanel1.add(listaDestinoCambio, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 320, 290, 40));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setText("Horario");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 370, -1, -1));

        listaHorarioCambio.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        listaHorarioCambio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elige el horario", "6:00", "7:00", "8:00", "9:00" }));
        jPanel1.add(listaHorarioCambio, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 400, 290, 40));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Ticket.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 177, -1, -1));

        botonHacerCambio.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botonHacerCambio.setText("Hacer Cambio");
        jPanel1.add(botonHacerCambio, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 460, 170, 49));

        botonCancelar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botonCancelar.setText("Cancelar");
        jPanel1.add(botonCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(592, 520, 170, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 820, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 609, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(CambioDeBoleto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CambioDeBoleto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CambioDeBoleto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CambioDeBoleto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CambioDeBoleto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton botonCancelar;
    public javax.swing.JButton botonHacerCambio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JComboBox<String> listaDestinoActual;
    public javax.swing.JComboBox<String> listaDestinoCambio;
    public javax.swing.JComboBox<String> listaHorarioActual;
    public javax.swing.JComboBox<String> listaHorarioCambio;
    // End of variables declaration//GEN-END:variables

    public JButton getBotonCancelar() {
        return botonCancelar;
    }

    public void setBotonCancelar(JButton botonCancelar) {
        this.botonCancelar = botonCancelar;
    }

    public JButton getBotonHacerCambio() {
        return botonHacerCambio;
    }

    public void setBotonHacerCambio(JButton botonHacerCambio) {
        this.botonHacerCambio = botonHacerCambio;
    }

    public JComboBox<String> getListaDestinoActual() {
        return listaDestinoActual;
    }

    public void setListaDestinoActual(JComboBox<String> listaDestinoActual) {
        this.listaDestinoActual = listaDestinoActual;
    }

    public JComboBox<String> getListaDestinoCambio() {
        return listaDestinoCambio;
    }

    public void setListaDestinoCambio(JComboBox<String> listaDestinoCambio) {
        this.listaDestinoCambio = listaDestinoCambio;
    }

    public JComboBox<String> getListaHorarioActual() {
        return listaHorarioActual;
    }

    public void setListaHorarioActual(JComboBox<String> listaHorarioActual) {
        this.listaHorarioActual = listaHorarioActual;
    }

    public JComboBox<String> getListaHorarioCambio() {
        return listaHorarioCambio;
    }

    public void setListaHorarioCambio(JComboBox<String> listaHorarioCambio) {
        this.listaHorarioCambio = listaHorarioCambio;
    }

    
    
}
