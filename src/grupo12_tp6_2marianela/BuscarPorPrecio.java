
package grupo12_tp6_2marianela;

import static grupo12_tp6_2marianela.BuscarPorNombre.modelo;
import static grupo12_tp6_2marianela.Productos.productos;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class BuscarPorPrecio extends javax.swing.JInternalFrame {
    public static DefaultTableModel modelo = new DefaultTableModel(); // Se utilizará para gestionar las columnas y filas de la tabla, usando sus metodos.

    
    public BuscarPorPrecio() {
        initComponents();
         modelo = new DefaultTableModel();
        armarCabecera();
        cargarTabla(); //muestra la tabla vacia o si cargamos datos
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtEntre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtEntreDos = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtProductos = new javax.swing.JTable();
        jbSalir = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setText("Listado por precio");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Entre $");

        jtEntre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtEntreKeyReleased(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("y");

        jtEntreDos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtEntreDosKeyReleased(evt);
            }
        });

        jtProductos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jtProductos);

        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(9, 9, 9)
                                .addComponent(jtEntre, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jtEntreDos, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jtEntre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtEntreDos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    //(a)Campo del precio 'Entre'
    private void jtEntreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtEntreKeyReleased
         filtrarPorPrecio();
    }//GEN-LAST:event_jtEntreKeyReleased

    //(b)Campo del precio 'EntreDos'
    private void jtEntreDosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtEntreDosKeyReleased
        filtrarPorPrecio();
    }//GEN-LAST:event_jtEntreDosKeyReleased

    //(c)Boton 'Salir' de la ventana.
    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbSalir;
    private javax.swing.JTextField jtEntre;
    private javax.swing.JTextField jtEntreDos;
    private javax.swing.JTable jtProductos;
    // End of variables declaration//GEN-END:variables


//METODOS PARA MI TABLA DE PRODUCTOS

//(a)Armamos las columnas de la tabla
    private void armarCabecera() {

    if (modelo.getColumnCount() == 0) {
        modelo.addColumn("Codigo");
        modelo.addColumn("Descripcion");
        modelo.addColumn("Precio");
        modelo.addColumn("Rubro");
        modelo.addColumn("Stock");
        // Configurar el modelo en la tabla
        jtProductos.setModel(modelo);
    }
    }
    
    
//(b)Cargar datos a mi tabla productos
    public void cargarTabla(){
    jtProductos.getTableHeader().setReorderingAllowed(false); //para q no podamos mover las columnas de la tabla.
    
    // Limpiar cualquier dato anterior en la tabla
    DefaultTableModel modelo = (DefaultTableModel) jtProductos.getModel();
    modelo.setRowCount(0);

    // Recorrer el TreeSet de productos y agregar cada producto a la tabla
    for (Producto producto : productos) {
        // Agregar una fila con los detalles del producto a la tabla
        modelo.addRow(new Object[]{
            producto.getCodigo(),
            producto.getDescripcion(),
            producto.getPrecio(),
            producto.getRubro(),
            producto.getStock(),
            
        });
       
    }
  
    }
    
    
    
//(c)
private void filtrarPorPrecio() {
    // Obtener los valores ingresados en los campos de texto
    String precioDesdeStr = jtEntre.getText();
    String precioHastaStr = jtEntreDos.getText();

    // Convertir a números, manejando excepciones
    double precioDesde = 0;
    double precioHasta = Double.MAX_VALUE; // Si no hay valor, tomamos un máximo

    try {
        if (!precioDesdeStr.isEmpty()) {
            precioDesde = Double.parseDouble(precioDesdeStr);
        }
        if (!precioHastaStr.isEmpty()) {
            precioHasta = Double.parseDouble(precioHastaStr);
        }
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Por favor, ingrese valores válidos para los precios.", "Error", JOptionPane.ERROR_MESSAGE);
        return; // Salir si hay un error en la conversión
    }

    // Limpiar la tabla antes de agregar productos filtrados
    DefaultTableModel modelo = (DefaultTableModel) jtProductos.getModel();
    modelo.setRowCount(0);

    // Recorrer el TreeSet y agregar los productos que estén en el rango de precios
    for (Producto producto : productos) {
        if (producto.getPrecio() >= precioDesde && producto.getPrecio() <= precioHasta) {
            modelo.addRow(new Object[]{
                producto.getCodigo(),
                producto.getDescripcion(),
                producto.getPrecio(),
                producto.getRubro(),
                producto.getStock(),
            });
        }
    }


}
}
