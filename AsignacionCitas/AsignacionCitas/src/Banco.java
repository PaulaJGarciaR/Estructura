
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Banco extends javax.swing.JFrame {

    Operaciones objetoLista = new Operaciones();
    SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
    public Banco() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        ingreseCliente = new javax.swing.JButton();
        imprimirLista = new javax.swing.JButton();
        buscar = new javax.swing.JButton();
        cargarDatos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 36)); // NOI18N
        jLabel1.setText("Asignación de Turnos");

        ingreseCliente.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        ingreseCliente.setText("Ingresar cliente");
        ingreseCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingreseClienteActionPerformed(evt);
            }
        });

        imprimirLista.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        imprimirLista.setText("Imprimir lista");
        imprimirLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imprimirListaActionPerformed(evt);
            }
        });

        buscar.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        buscar.setText("Buscar");
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });

        cargarDatos.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        cargarDatos.setText("Cargar Datos");
        cargarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargarDatosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ingreseCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(imprimirLista, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(78, 78, 78)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cargarDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 123, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ingreseCliente)
                    .addComponent(buscar))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cargarDatos)
                    .addComponent(imprimirLista))
                .addContainerGap(283, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ingreseClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingreseClienteActionPerformed
    
        try {
            objetoLista.crearLista(JOptionPane.showInputDialog("Ingresar documento:"),JOptionPane.showInputDialog("Ingresar nombre:"),formato.parse(JOptionPane.showInputDialog("Ingrese fecha de nacimiento:")),Double.parseDouble(JOptionPane.showInputDialog("Ingresar saldo:")));
        } catch (ParseException ex) {
            Logger.getLogger(Banco.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ingreseClienteActionPerformed

    private void imprimirListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imprimirListaActionPerformed
        objetoLista.imprimirLista();
    }//GEN-LAST:event_imprimirListaActionPerformed

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        objetoLista.Buscar(JOptionPane.showInputDialog("Ingrese documento"));
    }//GEN-LAST:event_buscarActionPerformed

    private void cargarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargarDatosActionPerformed
        File archivoDatos = new File("D:\\Trabajos\\Estructura\\Ejercicios\\AsignacionCitas\\AsignacionCitas\\src\\DatosCliente.txt");
        String datosClientes = "";
        
        try{
            FileReader lector = new FileReader(archivoDatos);
            BufferedReader recibeLectura = new BufferedReader(lector);
            String temporal = recibeLectura.readLine();
            
            while(temporal != null){
                datosClientes += temporal;
                temporal = recibeLectura.readLine();
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "No se encuentra el archivo");
            return;
        }
        
        String[] datosDelCliente = datosClientes.split(";");
        
        for (String cliente : datosDelCliente) {
            String[] informacionCliente = cliente.split(",");
            try{
                 objetoLista.crearLista(informacionCliente[0],informacionCliente [1],formato.parse(informacionCliente [2]),Double.parseDouble(informacionCliente [3]));
            } catch (ParseException ex) {
                System.out.println("Error");
        }
           
        }
    }//GEN-LAST:event_cargarDatosActionPerformed

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
            java.util.logging.Logger.getLogger(Banco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Banco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Banco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Banco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Banco().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscar;
    private javax.swing.JButton cargarDatos;
    private javax.swing.JButton imprimirLista;
    private javax.swing.JButton ingreseCliente;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
