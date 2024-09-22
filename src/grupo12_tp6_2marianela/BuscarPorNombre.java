
package grupo12_tp6_2marianela;

import static grupo12_tp6_2marianela.GestionDeProductos.modelo;
import static grupo12_tp6_2marianela.Productos.productos;
import javax.swing.table.DefaultTableModel;


public class BuscarPorNombre extends javax.swing.JInternalFrame {
    public static DefaultTableModel modelo = new DefaultTableModel(); // Se utilizará para gestionar las columnas y filas de la tabla, usando sus metodos.

    
    public BuscarPorNombre() {
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
        jtDescripcion = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtProductos = new javax.swing.JTable();
        jbSalir = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setText("Listado por Nombre");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Ingrese descripcion:");

        jtDescripcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtDescripcionKeyReleased(evt);
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
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtDescripcion)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    //(a)Boton de "Salir"
    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
       this.dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    
    //(b)buscar por 'Descripcion' del producto al escribir.
    private void jtDescripcionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtDescripcionKeyReleased
     // Obtener el texto ingresado en el campo de texto
    String textoBusqueda = jtDescripcion.getText().toLowerCase();
    
    // Limpiar la tabla antes de agregar productos filtrados
    DefaultTableModel modelo = (DefaultTableModel) jtProductos.getModel();
    modelo.setRowCount(0);
    
    // Recorrer el TreeSet y agregar los productos que coincidan con la búsqueda
    for (Producto producto : productos) {
        if (producto.getDescripcion().toLowerCase().startsWith(textoBusqueda)) {
            modelo.addRow(new Object[]{
                producto.getCodigo(),
                producto.getDescripcion(),
                producto.getPrecio(),
                producto.getRubro(),
                producto.getStock(),
            });
        }
    }
        
        
        
    }//GEN-LAST:event_jtDescripcionKeyReleased


    
    
    
    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbSalir;
    private javax.swing.JTextField jtDescripcion;
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
    
    
    //(c)Filtramos los datos segun la categoria seleccionada
    public void cargarTabla(String categoria) {
    // Limpiar cualquier dato anterior en la tabla
    DefaultTableModel modelo = (DefaultTableModel) jtProductos.getModel();
    modelo.setRowCount(0);

    // Recorrer el TreeSet de productos y agregar los que coincidan con la categoría
    for (Producto producto : productos) {
        if (categoria == null || categoria.equals("Todos") || producto.getRubro().equals(categoria)) {
            // Agregar una fila con los detalles del producto a la tabla
            modelo.addRow(new Object[]{
                producto.getCodigo(),
                producto.getDescripcion(),
                producto.getPrecio(),
                producto.getRubro(),
                producto.getStock()
            });
        }
    }
}



}
