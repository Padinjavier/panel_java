package TiendaForm;

import TiendaApp.Conexion;
import java.awt.Color;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author javie
 */
public class FromTienda extends javax.swing.JFrame {
//crear la conexion

    Conexion cc = new Conexion();
    Connection con = cc.getConnection();

    public FromTienda() {
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/UNDC.png")));

        //centrado
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(getBackground());
        mostrarDatos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtNombre = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtMarca = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtStock = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtFecha_v = new javax.swing.JTextField();
        Boton_Nuevo = new javax.swing.JButton();
        Boton_Guardar = new javax.swing.JButton();
        Boton_Eliminar = new javax.swing.JButton();
        Boton_Actualizar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaProducto = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        Comestible = new javax.swing.JComboBox<>();
        Boton_Luna = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        Boton_Sol = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ADMINISTRACION DE TIENDA");
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(780, 450));

        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        txtNombre.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        jLabel1.setText("Nombre");

        jLabel2.setText("Marca");

        jLabel3.setText("Stock");

        jLabel4.setText("Fecha.V");

        Boton_Nuevo.setForeground(new java.awt.Color(255, 51, 51));
        Boton_Nuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/NUEVO.png"))); // NOI18N
        Boton_Nuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Boton_Nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_NuevoActionPerformed(evt);
            }
        });

        Boton_Guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/GUARDAR.png"))); // NOI18N
        Boton_Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_GuardarActionPerformed(evt);
            }
        });

        Boton_Eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ELIMINAR.png"))); // NOI18N
        Boton_Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_EliminarActionPerformed(evt);
            }
        });

        Boton_Actualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ACTUALIZAR.png"))); // NOI18N
        Boton_Actualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Boton_ActualizarMouseClicked(evt);
            }
        });
        Boton_Actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_ActualizarActionPerformed(evt);
            }
        });

        jLabel6.setText("NUEVO");

        jLabel9.setText("ACTUALIZAR");

        jLabel8.setText("ELIMINAR");

        jLabel7.setText("GUARDAR");

        tablaProducto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tablaProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaProductoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaProducto);

        jLabel5.setText("Tipo");

        Comestible.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "COMESTIBLE", "NO COMESTIBLE" }));
        Comestible.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComestibleActionPerformed(evt);
            }
        });

        Boton_Luna.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/LUNA.png"))); // NOI18N
        Boton_Luna.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Boton_Luna.setMaximumSize(new java.awt.Dimension(48, 48));
        Boton_Luna.setMinimumSize(new java.awt.Dimension(48, 48));
        Boton_Luna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_LunaActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Modo Noche");

        Boton_Sol.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/SOL.png"))); // NOI18N
        Boton_Sol.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Boton_Sol.setMaximumSize(new java.awt.Dimension(48, 48));
        Boton_Sol.setMinimumSize(new java.awt.Dimension(48, 48));
        Boton_Sol.setVisible(false);
        Boton_Sol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_SolActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(Boton_Nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(Boton_Guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(Boton_Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(Boton_Actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Boton_Luna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Boton_Sol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMarca, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtStock)
                            .addComponent(txtFecha_v)
                            .addComponent(Comestible, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 643, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFecha_v, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(Comestible, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(Boton_Eliminar)
                            .addComponent(Boton_Guardar)
                            .addComponent(Boton_Nuevo)
                            .addComponent(Boton_Actualizar, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(34, 34, 34)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Boton_Sol, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Boton_Luna, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void mostrarDatos() {
        String[] cabecera = {"Código", "Nombres", "Marca", "Stock", "Vencimiento", "Tipo"};
        String[] registros = new String[10];//para q muestre 10 registros
        DefaultTableModel modelo = new DefaultTableModel(null, cabecera);
        //cando hay base  de datos es controlado
        String SQL = "select * from articulos";
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(SQL);
            //referencia a las cominas de la base de datos
            while (rs.next()) {
                registros[0] = rs.getString("idArticulo");
                registros[1] = rs.getString("Nombre");
                registros[2] = rs.getString("Marca");
                registros[3] = rs.getString("Stock");
                registros[4] = rs.getString("Fecha_v");
                registros[5] = rs.getString("Tipo");
                modelo.addRow(registros);
            }
            tablaProducto.setModel(modelo);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al mostrar datos" + e.getMessage());
        }
    }

    public void limpiarCajas() {
        txtNombre.setText(" ");
        txtMarca.setText(" ");
        txtStock.setText(" ");
        txtFecha_v.setText(" ");
        Comestible.setSelectedItem(null);
    }

    public void insertarDatos() {
        try {
            String SQL = "insert into articulos (Nombre,Marca,Stock,Fecha_v,Tipo) values(?,?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(SQL);
            pst.setString(1, txtNombre.getText());
            pst.setString(2, txtMarca.getText());
            pst.setString(3, txtStock.getText());
            pst.setString(4, txtFecha_v.getText());
            //combo box se usa select indes para que mando lo que esta seleccionado
            int selectTipo = Comestible.getSelectedIndex();
            pst.setString(5, Comestible.getItemAt(selectTipo));
            pst.execute();
            JOptionPane.showMessageDialog(null, "Articulo registrado");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error..." + e.getMessage());
        }
    }

    public void actualizarDatos() {
        try {
            String SQL = "UPDATE articulos SET Nombre=?,Marca=?,Stock=?,Fecha_v=?,Tipo=? WHERE idArticulo=?";
            int filaSeleccionada = tablaProducto.getSelectedRow();
            String actualiza = (String) tablaProducto.getValueAt(filaSeleccionada, 0);
            PreparedStatement pst = con.prepareStatement(SQL);
            pst.setString(1, txtNombre.getText());
            pst.setString(2, txtMarca.getText());
            pst.setString(3, txtStock.getText());
            pst.setString(4, txtFecha_v.getText());
            //combo box se usa select indes para que mando lo que esta seleccionado
            int selectTipo = Comestible.getSelectedIndex();
            pst.setString(5, Comestible.getItemAt(selectTipo));
            pst.setString(6, actualiza);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Registro actualizado");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error..." + e.getMessage());
        }
    }

    public void eliminarDatos() {
        int FilaSeleccionada = tablaProducto.getSelectedRow();
        try {
            String SQL = "DELETE FROM articulos WHERE idArticulo=" + tablaProducto.getValueAt(FilaSeleccionada, 0);
            Statement st = con.createStatement();
            int n = st.executeUpdate(SQL);
            if (n > 0) {
                JOptionPane.showMessageDialog(null, "Registro eliminado");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar" + e.getMessage());
        }

    }
    
    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void Boton_NuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_NuevoActionPerformed
        // TODO add your handling code here:
        limpiarCajas();
    }//GEN-LAST:event_Boton_NuevoActionPerformed

    private void Boton_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_GuardarActionPerformed
        // TODO add your handling code here:
        insertarDatos();
        limpiarCajas();
        mostrarDatos();
    }//GEN-LAST:event_Boton_GuardarActionPerformed

    private void Boton_EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_EliminarActionPerformed
        // TODO add your handling code here:
        eliminarDatos();
        mostrarDatos();
        limpiarCajas();
    }//GEN-LAST:event_Boton_EliminarActionPerformed

    private void tablaProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaProductoMouseClicked
        // TODO add your handling code here:
        //  se selecciona la fila en los campos para modificar y actualizar
        int filaSeleccionada = tablaProducto.rowAtPoint(evt.getPoint());
        txtNombre.setText(tablaProducto.getValueAt(filaSeleccionada, 1).toString());
        txtMarca.setText(tablaProducto.getValueAt(filaSeleccionada, 2).toString());
        txtStock.setText(tablaProducto.getValueAt(filaSeleccionada, 3).toString());
        txtFecha_v.setText(tablaProducto.getValueAt(filaSeleccionada, 4).toString());
        Comestible.setSelectedItem(tablaProducto.getValueAt(filaSeleccionada, 5).toString());
    }//GEN-LAST:event_tablaProductoMouseClicked

    private void Boton_ActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_ActualizarActionPerformed
        // TODO add your handling code here:
        actualizarDatos();
        limpiarCajas();
        mostrarDatos();
    }//GEN-LAST:event_Boton_ActualizarActionPerformed

    private void Boton_ActualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Boton_ActualizarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Boton_ActualizarMouseClicked

    private void Boton_LunaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_LunaActionPerformed

        //Variables de colores
        Color Botono_N = new Color(153, 153, 153);
        Color Panel_N = new Color(102, 102, 102);
        Color Text_N = new Color(255, 255, 255);

        Boton_Actualizar.setBackground(Botono_N);
        Boton_Eliminar.setBackground(Botono_N);
        Boton_Nuevo.setBackground(Botono_N);
        Boton_Guardar.setBackground(Botono_N);

        jPanel1.setBackground(Panel_N);

        jLabel1.setForeground(Text_N);
        jLabel2.setForeground(Text_N);
        jLabel3.setForeground(Text_N);
        jLabel4.setForeground(Text_N);
        jLabel5.setForeground(Text_N);
        jLabel6.setForeground(Text_N);
        jLabel7.setForeground(Text_N);
        jLabel8.setForeground(Text_N);
        jLabel9.setForeground(Text_N);
        jLabel10.setForeground(Text_N);

        Boton_Luna.setVisible(false);

        Boton_Sol.setVisible(true);
//        Boton_Sol.setLocation(100,100);
        jLabel10.setText("Modo Dia");
    }//GEN-LAST:event_Boton_LunaActionPerformed

    private void Boton_SolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_SolActionPerformed

        //Variables de colores
        Color Botono_D = new Color(255, 255, 255);
        Color Panel_D = new Color(255, 255, 255);
        Color Text_D = new Color(0, 0, 0);

        Boton_Actualizar.setBackground(Botono_D);
        Boton_Eliminar.setBackground(Botono_D);
        Boton_Nuevo.setBackground(Botono_D);
        Boton_Guardar.setBackground(Botono_D);

        jPanel1.setBackground(Panel_D);

        jLabel1.setForeground(Text_D);
        jLabel2.setForeground(Text_D);
        jLabel3.setForeground(Text_D);
        jLabel4.setForeground(Text_D);
        jLabel5.setForeground(Text_D);
        jLabel6.setForeground(Text_D);
        jLabel7.setForeground(Text_D);
        jLabel8.setForeground(Text_D);
        jLabel9.setForeground(Text_D);
        jLabel10.setForeground(Text_D);

        Boton_Sol.setVisible(false);

        Boton_Luna.setVisible(true);
//        Boton_Luna.setLocation(100,100);
        jLabel10.setText("Modo Noche");

    }//GEN-LAST:event_Boton_SolActionPerformed

    private void ComestibleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComestibleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComestibleActionPerformed

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
            java.util.logging.Logger.getLogger(FromTienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FromTienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FromTienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FromTienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FromTienda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Boton_Actualizar;
    private javax.swing.JButton Boton_Eliminar;
    private javax.swing.JButton Boton_Guardar;
    private javax.swing.JButton Boton_Luna;
    private javax.swing.JButton Boton_Nuevo;
    private javax.swing.JButton Boton_Sol;
    private javax.swing.JComboBox<String> Comestible;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaProducto;
    private javax.swing.JTextField txtFecha_v;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtStock;
    // End of variables declaration//GEN-END:variables
}
