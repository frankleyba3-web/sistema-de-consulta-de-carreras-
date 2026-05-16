
package carreras;


import Conexion.Conexion;
import java.sql.Connection;
import java.sql.ResultSet; 
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;


public class uasd extends javax.swing.JFrame {
    Conexion conl= new Conexion();
    Connection conet;
    DefaultTableModel modelo; 
    Statement st;
    ResultSet rs;
    int idc;
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(uasd.class.getName());

    
    public uasd() {
        initComponents();
        setLocationRelativeTo(null);
        consultar();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Area = new javax.swing.JComboBox<>();
        area = new javax.swing.JLabel();
        carreras = new javax.swing.JLabel();
        duracion = new javax.swing.JLabel();
        Codigo = new javax.swing.JTextField();
        Carreras = new javax.swing.JTextField();
        Duracion = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        Limpiar = new javax.swing.JButton();
        Consultar = new javax.swing.JButton();
        Salir = new javax.swing.JButton();
        Agregar = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla5 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(242, 242, 242));
        jLabel1.setText("Consulta de Carreras UASD");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(234, 234, 234))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Semibold", 0, 14), new java.awt.Color(0, 102, 102))); // NOI18N

        jLabel2.setText("Codigo");

        Area.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Artes", "Ciencias", "Ciencias de la Educacion", "Ciencias de la Salud" }));
        Area.addActionListener(this::AreaActionPerformed);

        area.setText("Area");

        carreras.setText("Carreras");

        duracion.setText("Duracion");

        Codigo.setEditable(false);
        Codigo.addActionListener(this::CodigoActionPerformed);

        Carreras.addActionListener(this::CarrerasActionPerformed);

        Duracion.addActionListener(this::DuracionActionPerformed);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(area)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(carreras)
                    .addComponent(duracion))
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(Carreras, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Area, javax.swing.GroupLayout.Alignment.LEADING, 0, 170, Short.MAX_VALUE)
                    .addComponent(Codigo, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Duracion))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(Codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Area, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(area))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(carreras)
                    .addComponent(Carreras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(duracion)
                    .addComponent(Duracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Operaciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Semibold", 0, 14))); // NOI18N

        Limpiar.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        Limpiar.setForeground(new java.awt.Color(0, 51, 51));
        Limpiar.setText("Limpiar");
        Limpiar.addActionListener(this::LimpiarActionPerformed);

        Consultar.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        Consultar.setForeground(new java.awt.Color(0, 51, 51));
        Consultar.setText("Consultar");
        Consultar.addActionListener(this::ConsultarActionPerformed);

        Salir.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        Salir.setForeground(new java.awt.Color(255, 0, 51));
        Salir.setText("Salir");
        Salir.addActionListener(this::SalirActionPerformed);

        Agregar.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        Agregar.setForeground(new java.awt.Color(0, 51, 51));
        Agregar.setText("Agregar");
        Agregar.addActionListener(this::AgregarActionPerformed);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(Consultar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(Agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(Limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Consultar, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        Agregar.getAccessibleContext().setAccessibleDescription("");

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Base de Datos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Semibold", 0, 14))); // NOI18N
        jPanel5.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N

        Tabla5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        Tabla5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tabla5MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tabla5);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 624, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AreaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AreaActionPerformed

    private void CodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CodigoActionPerformed

    private void CarrerasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CarrerasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CarrerasActionPerformed

    private void DuracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DuracionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DuracionActionPerformed

    private void ConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultarActionPerformed
    
    consultar();
    }//GEN-LAST:event_ConsultarActionPerformed

    private void LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimpiarActionPerformed
     limpiarCampos();                                           
    

    }//GEN-LAST:event_LimpiarActionPerformed

    private void AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarActionPerformed
      Agregar();
      consultar();
    }//GEN-LAST:event_AgregarActionPerformed

    private void Tabla5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tabla5MouseClicked
   
    int fila = Tabla5.getSelectedRow();

    if (fila >= 0) {
        Codigo.setText(Tabla5.getValueAt(fila, 0).toString());
        Carreras.setText(Tabla5.getValueAt(fila, 1).toString());
        Duracion.setText(Tabla5.getValueAt(fila, 2).toString());
    }


    }//GEN-LAST:event_Tabla5MouseClicked

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed

        int opcion = javax.swing.JOptionP
            javax.swing.JOptionPane.YES_NO_OPTION
        );
ane.showConfirmDialog(
            this,
            "¿Seguro que quieres salir?",
            "Confirmar salida",
        if (opcion == javax.swing.JOptionPane.YES_OPTION) {
            System.exit(0);

        }

    }//GEN-LAST:event_SalirActionPerformed

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new uasd().setVisible(true));
    }
    
   void consultar() {

    String areaSeleccionada = Area.getSelectedItem().toString();

    String sql = "SELECT * FROM carreras WHERE area = '" + areaSeleccionada + "'";

    try {
        conet = conl.conectar();
        st = conet.createStatement();
        rs = st.executeQuery(sql);

        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Código");
        modelo.addColumn("Carrera");
        modelo.addColumn("Duración");

        while (rs.next()) {

            Object[] datos = new Object[3];

            datos[0] = rs.getString("codigo");
            datos[1] = rs.getString("carrera");
            datos[2] = rs.getString("duracion");

            modelo.addRow(datos);
        }

        Tabla5.setModel(modelo);

    } catch (Exception e) {
        System.out.println("Error: " + e);
   
}
}
    
    void Agregar() {

    String codigo = Codigo.getText();
    String carrera = Carreras.getText();
    String duracion = Duracion.getText();
    String area = Area.getSelectedItem().toString();

    try {

        if (codigo.equals("") || carrera.equals("") || duracion.equals("")) {

            javax.swing.JOptionPane.showMessageDialog(this, "Faltan datos");

        } else {

            String sql = "INSERT INTO carreras(codigo, area, carrera, duracion) VALUES ('"
                    + codigo + "','" + area + "','" + carrera + "','" + duracion + "')";

            conet = conl.conectar();
            st = conet.createStatement();
            st.executeUpdate(sql);

            javax.swing.JOptionPane.showMessageDialog(this, "Carrera agregada");

            consultar();
            limpiarCampos();
        }

    } catch (Exception e) {
        System.out.println("Error: " + e);
    }
}
    void limpiarCampos() {
    Codigo.setText("");
    Carreras.setText("");
    Duracion.setText("");
    Area.setSelectedIndex(0);
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Agregar;
    private javax.swing.JComboBox<String> Area;
    private javax.swing.JTextField Carreras;
    private javax.swing.JTextField Codigo;
    private javax.swing.JButton Consultar;
    private javax.swing.JTextField Duracion;
    private javax.swing.JButton Limpiar;
    private javax.swing.JButton Salir;
    private javax.swing.JTable Tabla5;
    private javax.swing.JLabel area;
    private javax.swing.JLabel carreras;
    private javax.swing.JLabel duracion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
