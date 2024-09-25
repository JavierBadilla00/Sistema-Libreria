/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyecto_libreria;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
/**
 *
 * @author Javie
 */
public class Formulario_Prestamos extends javax.swing.JFrame {

    /**
     * Creates new form Formulario_Prestamos
     */
    
    DefaultTableModel modelo = new DefaultTableModel();
    private ArrayList<Prestamo> PrestamoLista = new ArrayList();
    
    private final Connection cn = null;
    
    public Formulario_Prestamos() throws SQLException {
       ImagenPrestamos iP = new ImagenPrestamos();
         this.setContentPane(iP);
         
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        
        modelo = (DefaultTableModel) jTablaPrestamos.getModel();
        modelo.setColumnIdentifiers(new Object[]{"ID", "Fecha", "Lector", "Libro", "Precio","Cantidad","Total"});
        PrestamosCarga();
        ClientesCBX(jCBCliente);
        LibrosCBX(jCBLibro);
 
        jTablaPrestamos.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                int row = jTablaPrestamos.getSelectedRow();
                if (row >= 0) {
                    TablaInformacion(row);
                    
                    jTID.enable(false);
                    
                }
            }
        });
        
    }
    
     public void refrescarTabla(){
    //
    while(modelo.getRowCount()>0){
        modelo.removeRow(0);
    }
    
    for(Prestamo p : PrestamoLista){
    Object aa[] = new Object[7];
       aa[0] = p.getID();
       aa[1] = p.getFecha(); 
       aa[2] = p.getID_Lector(); 
       aa[3] = p.getID_Libro(); 
       aa[4] = p.getPrecio(); 
       aa[5] = p.getCantidad(); 
       aa[6] = p.getTotal(); 
       

       modelo.addRow(aa);
    }    
    jTablaPrestamos.setModel(modelo);
    
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
        jTFecha = new javax.swing.JTextField();
        jTID = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablaPrestamos = new javax.swing.JTable();
        jBAgregar = new javax.swing.JButton();
        jBModificar = new javax.swing.JButton();
        jBEliminar = new javax.swing.JButton();
        jBSalir = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTPrecio = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTCantidad = new javax.swing.JTextField();
        jCBCliente = new javax.swing.JComboBox<>();
        jCBLibro = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ID");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Fecha");

        jTablaPrestamos.setBackground(new java.awt.Color(0, 0, 0));
        jTablaPrestamos.setForeground(new java.awt.Color(255, 255, 255));
        jTablaPrestamos.setModel(new javax.swing.table.DefaultTableModel(
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
        jTablaPrestamos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablaPrestamosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTablaPrestamos);

        jBAgregar.setBackground(new java.awt.Color(0, 0, 0));
        jBAgregar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jBAgregar.setForeground(new java.awt.Color(255, 255, 255));
        jBAgregar.setText("Agregar");
        jBAgregar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBAgregar.setBorderPainted(false);
        jBAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAgregarActionPerformed(evt);
            }
        });

        jBModificar.setBackground(new java.awt.Color(0, 0, 0));
        jBModificar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jBModificar.setForeground(new java.awt.Color(255, 255, 255));
        jBModificar.setText("Modificar");
        jBModificar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBModificar.setBorderPainted(false);
        jBModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBModificarActionPerformed(evt);
            }
        });

        jBEliminar.setBackground(new java.awt.Color(0, 0, 0));
        jBEliminar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jBEliminar.setForeground(new java.awt.Color(255, 255, 255));
        jBEliminar.setText("Eliminar");
        jBEliminar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBEliminar.setBorderPainted(false);
        jBEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEliminarActionPerformed(evt);
            }
        });

        jBSalir.setBackground(new java.awt.Color(0, 0, 0));
        jBSalir.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jBSalir.setForeground(new java.awt.Color(255, 255, 255));
        jBSalir.setText("Salir");
        jBSalir.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBSalir.setBorderPainted(false);
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Lector");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Libro");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Precio");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Cantidad");

        jCBCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jCBLibro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Prestamos");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(197, 197, 197))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 614, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jBAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jBModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jBEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(157, 157, 157)
                        .addComponent(jBSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(203, 203, 203)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel7)
                    .addComponent(jLabel5))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTID, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jCBCliente, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTFecha, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jCBLibro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCBCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCBLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTCantidad, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jBEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jBAgregar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jBSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jBModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTablaPrestamosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablaPrestamosMouseClicked

    }//GEN-LAST:event_jTablaPrestamosMouseClicked

    private void jBAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAgregarActionPerformed

        String ID = jTID.getText();
        String Fecha = jTFecha.getText();
        String Cliente = jCBCliente.getSelectedItem().toString();
        String Libro = jCBLibro.getSelectedItem().toString();
        int Precio = Integer.parseInt(jTPrecio.getText());
        int Cantidad = Integer.parseInt(jTCantidad.getText());
        int Total = Precio * Cantidad;

        try (Connection conn = Base_De_Datos_Conexion.getConnection()) {
            String sql = "INSERT INTO Prestamos (ID, Fecha, ID_Lector, ID_Libro, Precio, Cantidad, Total) VALUES (?,?,?,?,?,?,?)";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, ID);
            statement.setString(2, Fecha);
            statement.setString(3, Cliente);
            statement.setString(4, Libro);
            statement.setInt(5, Precio);
            statement.setInt(6, Cantidad);
            statement.setInt(7, Total);

            statement.executeUpdate();

            JOptionPane.showMessageDialog(null, "El prestado se ha agregado exitosamente");
            PrestamosCarga();
            limpia();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jBAgregarActionPerformed

    private void jBModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBModificarActionPerformed

        int TablaSeleccionada = jTablaPrestamos.getSelectedRow();

        if (TablaSeleccionada >=0 ){

            String ID = jTID.getText();
            String Fecha = jTFecha.getText();
            String Cliente = jCBCliente.getSelectedItem().toString();
            String Libro = jCBLibro.getSelectedItem().toString();
            int Precio = Integer.parseInt(jTPrecio.getText());
            int Cantidad = Integer.parseInt(jTCantidad.getText());
            int Total = Precio * Cantidad;

            try (Connection conn = Base_De_Datos_Conexion.getConnection()) {
                String sql = "UPDATE Prestamos SET Fecha = ?, ID_Lector = ?, ID_Libro = ?, Precio = ?, Cantidad = ?, Total = ? WHERE ID = ?";
                PreparedStatement statement = conn.prepareStatement(sql);
                statement.setString(1, Fecha);
                statement.setString(2, Cliente);
                statement.setString(3, Libro);
                statement.setInt(4, Precio);
                statement.setInt(5, Cantidad);
                statement.setInt(6, Total);
                statement.setString(7, ID);

                statement.executeUpdate();
                JOptionPane.showMessageDialog(null, "El prestado se ha modificado exitosamente");
                PrestamosCarga();
                limpia();
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }
    }//GEN-LAST:event_jBModificarActionPerformed

    private void jBEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminarActionPerformed

        int TablaFila = jTablaPrestamos.getSelectedRow();

        try (Connection conn = Base_De_Datos_Conexion.getConnection()) {
            String sql = "DELETE from Prestamos WHERE ID = ?";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, jTID.getText());
            statement.executeUpdate();
            JOptionPane.showMessageDialog(null, "El prestado se ha elininado exitosamente");
            PrestamosCarga();
            limpia();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jBEliminarActionPerformed

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed

   Principal principal = new Principal();

        principal.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_jBSalirActionPerformed

    
    private void PrestamosCarga() {
        PrestamoLista.clear();
        modelo.setRowCount(0);
 
        try (Connection conn = Base_De_Datos_Conexion.getConnection()) {
            String sql = "SELECT * FROM Prestamos";
            PreparedStatement statement = conn.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
 
            while (resultSet.next()) {
                String ID = resultSet.getString("ID");
                Date Fecha = resultSet.getDate("Fecha");
                String Cliente = resultSet.getString("ID_Lector");
                String Libro = resultSet.getString("ID_Libro");
                int Precio = resultSet.getInt("Precio");
                int Cantidad = resultSet.getInt("Cantidad");
                int Total = resultSet.getInt("Total");

               Prestamo p = new Prestamo(ID, Fecha, Libro, Libro, Precio, Cantidad, Total);
               PrestamoLista.add(p);
                modelo.addRow(new Object[]{ID, Fecha, Cliente, Libro, Precio, Cantidad, Total});
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    private void limpia(){
        
        
        jTID.setText("");
        jTFecha.setText("");
        jTPrecio.setText("");
        jTCantidad.setText("");
       
    }
    
    private void TablaInformacion(int row) {
       jTID.setText(modelo.getValueAt(row, 0).toString());
       jTFecha.setText(modelo.getValueAt(row, 1).toString());
       jCBCliente.setSelectedItem(modelo.getValueAt(row, 2).toString());
       jCBLibro.setSelectedItem(modelo.getValueAt(row, 3).toString());
       jTPrecio.setText(modelo.getValueAt(row, 4).toString());
       jTCantidad.setText(modelo.getValueAt(row, 5).toString());
       
       int Precio = Integer.parseInt(modelo.getValueAt(row, 4).toString());
       int Cantidad = Integer.parseInt(modelo.getValueAt(row, 5).toString());
    
    int Total = Precio * Cantidad;
    
    
      modelo.setValueAt(Total, row, 6);

    }
    
    private void ClientesCBX(JComboBox<String> prov) throws SQLException {
    DefaultComboBoxModel<String> cbx = new DefaultComboBoxModel<>();
    prov.setModel(cbx);
    
    try (Connection conn = Base_De_Datos_Conexion.getConnection()) {
        String sql = "SELECT Nombre FROM Lectores";
        PreparedStatement statement = conn.prepareStatement(sql);
        ResultSet resultSet = statement.executeQuery();

        while (resultSet.next()) {
            
            cbx.addElement(resultSet.getString("Nombre"));
        }
    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error al cargar lectores: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
}
 
    private void LibrosCBX(JComboBox<String> prov) throws SQLException {
    DefaultComboBoxModel<String> cbx = new DefaultComboBoxModel<>();
    prov.setModel(cbx);
    
    try (Connection conn = Base_De_Datos_Conexion.getConnection()) {
        String sql = "SELECT Nombre FROM Libros";
        PreparedStatement statement = conn.prepareStatement(sql);
        ResultSet resultSet = statement.executeQuery();

        while (resultSet.next()) {
            
            cbx.addElement(resultSet.getString("Nombre"));
        }
    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error al cargar libros: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
}
    
    
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
            java.util.logging.Logger.getLogger(Formulario_Prestamos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Formulario_Prestamos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Formulario_Prestamos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Formulario_Prestamos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Formulario_Prestamos().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Formulario_Prestamos.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAgregar;
    private javax.swing.JButton jBEliminar;
    private javax.swing.JButton jBModificar;
    private javax.swing.JButton jBSalir;
    private javax.swing.JComboBox<String> jCBCliente;
    private javax.swing.JComboBox<String> jCBLibro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTCantidad;
    private javax.swing.JTextField jTFecha;
    private javax.swing.JTextField jTID;
    private javax.swing.JTextField jTPrecio;
    private javax.swing.JTable jTablaPrestamos;
    // End of variables declaration//GEN-END:variables
}

class ImagenPrestamos extends JPanel{
            
            private Image imagen;
            
            public void paint(Graphics g){
                
                imagen = new ImageIcon(getClass().getResource("pngtree-an-old-library-or-book-room-with-some-books-and-plants-image_2521166.jpg")).getImage();
                g.drawImage(imagen, 0, 0, getWidth(),getHeight(),this);
                setOpaque(false);
                
                super.paint(g);
                
            }
            
    }
