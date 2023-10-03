
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;


public class MenuTurnos extends javax.swing.JFrame {
   Operaciones objetoLista=new Operaciones();
    SimpleDateFormat formato=new SimpleDateFormat("dd-MM-yyyy");
    public MenuTurnos() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        IngresarCliente = new javax.swing.JButton();
        buscar = new javax.swing.JButton();
        imprimirLista = new javax.swing.JButton();
        cargar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        IngresarCliente.setText("Ingresar Cliente");
        IngresarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngresarClienteActionPerformed(evt);
            }
        });

        buscar.setText("Buscar");

        imprimirLista.setText("Imprimir Lista");
        imprimirLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imprimirListaActionPerformed(evt);
            }
        });

        cargar.setText("Cargar ");
        cargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 36)); // NOI18N
        jLabel1.setText("Asignación de Turnos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(IngresarCliente)
                    .addComponent(imprimirLista))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 106, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buscar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cargar, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(115, 115, 115))
            .addGroup(layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IngresarCliente)
                    .addComponent(buscar))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(imprimirLista)
                    .addComponent(cargar))
                .addContainerGap(213, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void IngresarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngresarClienteActionPerformed
      try {
         objetoLista.crearLista(JOptionPane.showInputDialog("Ingresar Documento:"),JOptionPane.showInputDialog("Ingresar Nombre:"),formato.parse(JOptionPane.showInputDialog("Ingresar Fecha de Nacimiento:")),Double.parseDouble(JOptionPane.showInputDialog("Ingresar Saldo:")));
     } catch (ParseException ex) {
          System.out.println("Error");
     }
    }//GEN-LAST:event_IngresarClienteActionPerformed

    private void cargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargarActionPerformed
        File archivo=new File ("D:\\Trabajos\\Estructura\\Ejercicios\\EjercicioTurnosBanco\\src\\ListaClientes.txt");
        String datos= "";
        
        try{
            FileReader lector=new FileReader(archivo);
            BufferedReader recibirLectura=new BufferedReader(lector);
            String temporal=recibirLectura.readLine();
            while(temporal!=null){
               datos+=temporal;
               temporal=recibirLectura.readLine();
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "No se encontro el archivo");
        }
        String [] datosClientes=datos.split(";");
        for (String datosCliente : datosClientes) {
            String [] informacionClientes=datosCliente.split(",");
            try{
                objetoLista.crearLista(informacionClientes[0], informacionClientes[1],formato.parse (informacionClientes[2]),Double.parseDouble(informacionClientes[3]));
            }catch(ParseException ex){
                System.out.println("Error");
            }
        }
    }//GEN-LAST:event_cargarActionPerformed

    private void imprimirListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imprimirListaActionPerformed
     objetoLista.imprimir();
    }//GEN-LAST:event_imprimirListaActionPerformed

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
            java.util.logging.Logger.getLogger(MenuTurnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuTurnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuTurnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuTurnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuTurnos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton IngresarCliente;
    private javax.swing.JButton buscar;
    private javax.swing.JButton cargar;
    private javax.swing.JButton imprimirLista;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
