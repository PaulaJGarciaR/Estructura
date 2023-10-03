
import javax.swing.JOptionPane;
public class Menu extends javax.swing.JFrame {
    Operaciones objetoLista=new Operaciones();
    public Menu() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        crear = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        AgregarAlInicio = new javax.swing.JButton();
        AgregarAlFinal = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        crear.setText("Crear");
        crear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearActionPerformed(evt);
            }
        });

        jButton1.setText("Imprimir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        AgregarAlInicio.setText("Agregar al Inicio");
        AgregarAlInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarAlInicioActionPerformed(evt);
            }
        });

        AgregarAlFinal.setText("Agregar al Final");
        AgregarAlFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarAlFinalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(119, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AgregarAlFinal)
                    .addComponent(AgregarAlInicio)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButton1)
                        .addComponent(crear)))
                .addGap(106, 106, 106))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(crear)
                .addGap(26, 26, 26)
                .addComponent(jButton1)
                .addGap(28, 28, 28)
                .addComponent(AgregarAlInicio)
                .addGap(26, 26, 26)
                .addComponent(AgregarAlFinal)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void crearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearActionPerformed
        int valor=Integer.parseInt(JOptionPane.showInputDialog("Valor:"));
        objetoLista.crear(valor);
    }//GEN-LAST:event_crearActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        objetoLista.imprimir();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void AgregarAlInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarAlInicioActionPerformed
         int valor=Integer.parseInt(JOptionPane.showInputDialog("Valor a Ingresar:"));
        objetoLista.agregarInicio(valor);
    }//GEN-LAST:event_AgregarAlInicioActionPerformed

    private void AgregarAlFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarAlFinalActionPerformed
         int valor=Integer.parseInt(JOptionPane.showInputDialog("Valor a Ingresar:"));
        objetoLista.agregarAlFinal(valor);
    }//GEN-LAST:event_AgregarAlFinalActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AgregarAlFinal;
    private javax.swing.JButton AgregarAlInicio;
    private javax.swing.JButton crear;
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}
