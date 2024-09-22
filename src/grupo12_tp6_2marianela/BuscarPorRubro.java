
package grupo12_tp6_2marianela;

import static grupo12_tp6_2marianela.GestionDeProductos.modelo;
import static grupo12_tp6_2marianela.Productos.productos;
import javax.swing.table.DefaultTableModel;


public class BuscarPorRubro extends javax.swing.JInternalFrame {
    public static DefaultTableModel modelo = new DefaultTableModel(); // Se utilizará para gestionar las columnas y filas de la tabla, usando sus metodos.

  
    public BuscarPorRubro() {
        initComponents();
        modelo = new DefaultTableModel();
        cargarCombo ();//(1)Inicializamos el ComboBox cargado.
        armarCabecera();
        cargarTabla(); //muestra la tabla vacia o si cargamos datos
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jcbCategoria = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtProductos = new javax.swing.JTable();
        jbSalir = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setText("Listado por Rubro");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Rubro:");

        jcbCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbCategoriaActionPerformed(evt);
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
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jcbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(43, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jcbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    //(a)Evento al ComboBox 'jcbCategoria'
    private void jcbCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbCategoriaActionPerformed
        filtrarPorCategoria();
    }//GEN-LAST:event_jcbCategoriaActionPerformed

    //(b)Boton 'Salir'
    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
      this.dispose();
    }//GEN-LAST:event_jbSalirActionPerformed


    
    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbSalir;
    private javax.swing.JComboBox<String> jcbCategoria;
    private javax.swing.JTable jtProductos;
    // End of variables declaration//GEN-END:variables


    //(a)Cargamso el comboBox 1°
    public void cargarCombo (){
        // Limpiar el JComboBox antes de cargar elementos
        jcbCategoria.removeAllItems();

        // Agregar los elementos al JComboBox
        jcbCategoria.addItem("Comestible");
        jcbCategoria.addItem("Limpieza");
        jcbCategoria.addItem("Perfumería");
    }


    //(b)Armamos las columnas de la tabla
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
    
    
    //(c)Cargar datos a mi tabla productos
    public void cargarTabla(){
    jtProductos.getTableHeader().setReorderingAllowed(false); //para q no podamos mover las columnas de la tabla.
    
    // Limpiar cualquier dato anterior en la tabla
    DefaultTableModel modelo = (DefaultTableModel) jtProductos.getModel();
    modelo.setRowCount(0);

    // Recorrer el TreeSet de productos y agregar cada producto a la tabla
    for (Producto producto : productos) {
        // Agregar una fila con los detalles del producto a la tabla
        modelo.addRow(new Object[]{producto.getCodigo(),producto.getDescripcion(), producto.getPrecio(), producto.getRubro(), producto.getStock(),});    
    }

    }//fin metodo 'cargarTabla
    
    
    //(d)Filtramos la categoria q seleccionamos en el comboBox 'jcbCategoria'
    private void filtrarPorCategoria() {
        // Obtener la categoría seleccionada
        String categoriaSeleccionada = (String) jcbCategoria.getSelectedItem();

        // Limpiar la tabla antes de agregar productos filtrados
        DefaultTableModel modelo = (DefaultTableModel) jtProductos.getModel();
        modelo.setRowCount(0);

        // Recorrer el TreeSet y agregar los productos que coincidan con la categoría seleccionada
        for (Producto producto : productos) {
            if (producto.getRubro().equals(categoriaSeleccionada)) {
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
