
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class AsignacionTurnos extends javax.swing.JFrame {
   Operaciones objetoLista = new Operaciones();
    SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
    
    public AsignacionTurnos() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        IngresarCliente = new javax.swing.JButton();
        Buscar = new javax.swing.JButton();
        imprimirLista = new javax.swing.JButton();
        cargar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 36)); // NOI18N
        jLabel1.setText("Asignación Turnos");

        IngresarCliente.setText("IngresarCliente");
        IngresarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngresarClienteActionPerformed(evt);
            }
        });

        Buscar.setText("Buscar");
        Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarActionPerformed(evt);
            }
        });

        imprimirLista.setText("Imprimir Lista");
        imprimirLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imprimirListaActionPerformed(evt);
            }
        });

        cargar.setText("Cargar");
        cargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(82, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(68, 68, 68))
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(imprimirLista)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cargar))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(IngresarCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Buscar)))
                .addGap(55, 55, 55))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IngresarCliente)
                    .addComponent(Buscar))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(imprimirLista)
                    .addComponent(cargar))
                .addContainerGap(119, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void imprimirListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imprimirListaActionPerformed
        objetoLista.imprimir();
    }//GEN-LAST:event_imprimirListaActionPerformed

    private void BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BuscarActionPerformed

    private void IngresarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngresarClienteActionPerformed
        try {
            objetoLista.crearLista(JOptionPane.showInputDialog("Ingrese documento"),JOptionPane.showInputDialog("Ingrese nombre"),formato.parse(JOptionPane.showInputDialog("Ingrese fecha de nacimiento")),Double.parseDouble(JOptionPane.showInputDialog("Ingrese saldo")));
        } catch (ParseException ex) {
            System.out.println("Error");
        }
    }//GEN-LAST:event_IngresarClienteActionPerformed

    private void cargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargarActionPerformed
        File archivo = new File("D:\\Trabajos\\Estructura\\Ejercicios\\AsignacionCitasBanco\\src\\DatosClientes.txt");
        String informacionClientes = "";
        
        try{
            FileReader lector = new FileReader(archivo);
            BufferedReader recibeLectura = new BufferedReader(lector);
            String temporal = recibeLectura.readLine();
            
            while(temporal != null){
                informacionClientes += temporal;
                temporal = recibeLectura.readLine();
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "No se encuentra el archivo");
            return;
        }
        
        String[] clientes = informacionClientes.split(";");
        
        for (String cliente : clientes) {
            String[] agregarCliente = cliente.split(",");
            try{
                 objetoLista.crearLista(agregarCliente[0],agregarCliente[1],formato.parse(agregarCliente[2]),Double.parseDouble(agregarCliente[3]));
            } catch (ParseException ex) {
                System.out.println("Error");
        }
           
        }
    }//GEN-LAST:event_cargarActionPerformed

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
            java.util.logging.Logger.getLogger(AsignacionTurnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AsignacionTurnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AsignacionTurnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AsignacionTurnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AsignacionTurnos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Buscar;
    private javax.swing.JButton IngresarCliente;
    private javax.swing.JButton cargar;
    private javax.swing.JButton imprimirLista;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
