
import javax.swing.JOptionPane;


public class MenuTurnosListasDobles extends javax.swing.JFrame {
    OperacionesTurnosListasDobles objetoLista=new OperacionesTurnosListasDobles ();
    String nombre;
    int contadorTurnos;
    public MenuTurnosListasDobles() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        asignacionTurnos = new javax.swing.JButton();
        impresionTurnosInicioFinal = new javax.swing.JButton();
        impresionTurnosFinalInicio = new javax.swing.JButton();
        buscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 24)); // NOI18N
        jLabel1.setText("Menu Turnos");

        asignacionTurnos.setText("Asignación Turnos");
        asignacionTurnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asignacionTurnosActionPerformed(evt);
            }
        });

        impresionTurnosInicioFinal.setText("Impresión Turnos Inicio-Final");
        impresionTurnosInicioFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                impresionTurnosInicioFinalActionPerformed(evt);
            }
        });

        impresionTurnosFinalInicio.setText("Impresión Turnos Final-Inicio");
        impresionTurnosFinalInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                impresionTurnosFinalInicioActionPerformed(evt);
            }
        });

        buscar.setText("Buscar");
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(136, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(impresionTurnosFinalInicio)
                            .addComponent(impresionTurnosInicioFinal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(asignacionTurnos, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buscar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(127, 127, 127))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(201, 201, 201))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addComponent(asignacionTurnos)
                .addGap(18, 18, 18)
                .addComponent(buscar)
                .addGap(19, 19, 19)
                .addComponent(impresionTurnosInicioFinal)
                .addGap(27, 27, 27)
                .addComponent(impresionTurnosFinalInicio)
                .addContainerGap(127, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void asignacionTurnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asignacionTurnosActionPerformed
        nombre=JOptionPane.showInputDialog("Ingresar Nombre");
        contadorTurnos++;
        objetoLista.asignarTurnos(nombre,contadorTurnos);
        JOptionPane.showMessageDialog(null,"Turno:"+contadorTurnos);
    }//GEN-LAST:event_asignacionTurnosActionPerformed

    private void impresionTurnosFinalInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_impresionTurnosFinalInicioActionPerformed
     objetoLista.imprimirFinalInicio();
    }//GEN-LAST:event_impresionTurnosFinalInicioActionPerformed

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        String buscar=JOptionPane.showInputDialog("Ingresar Nombre a buscar");
        objetoLista.buscarPosicion(nombre, buscar);
        
    }//GEN-LAST:event_buscarActionPerformed

    private void impresionTurnosInicioFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_impresionTurnosInicioFinalActionPerformed
        objetoLista.imprimirListaInicioFinal();
    }//GEN-LAST:event_impresionTurnosInicioFinalActionPerformed

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
            java.util.logging.Logger.getLogger(MenuTurnosListasDobles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuTurnosListasDobles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuTurnosListasDobles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuTurnosListasDobles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuTurnosListasDobles().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton asignacionTurnos;
    private javax.swing.JButton buscar;
    private javax.swing.JButton impresionTurnosFinalInicio;
    private javax.swing.JButton impresionTurnosInicioFinal;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
