
package grupo12_tp6_2marianela;

       

import static grupo12_tp6_2marianela.Productos.productos;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class GestionDeProductos extends javax.swing.JInternalFrame {
        public static DefaultTableModel modelo = new DefaultTableModel(); // Se utilizará para gestionar las columnas y filas de la tabla, usando sus metodos.

   
    public GestionDeProductos() {
        initComponents();
        modelo = new DefaultTableModel();
        cargarCombo ();//(1)Inicializamos el ComboBox cargado.
        cargarCombo2 ();
        armarCabecera();
        cargarTabla(); //muestra la tabla vacia o si cargamos datos
       
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jcbCategoria = new javax.swing.JComboBox<String>();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtProductos = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jtCodigo = new javax.swing.JTextField();
        jtDescripcion = new javax.swing.JTextField();
        jtPrecio = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtRubro = new javax.swing.JComboBox<String>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jsStock = new javax.swing.JSpinner();
        jbBuscar = new javax.swing.JButton();
        jbCerrar = new javax.swing.JButton();
        jbEliminar = new javax.swing.JButton();
        jbNuevo = new javax.swing.JButton();
        jbActualizar = new javax.swing.JButton();
        jbGuardar = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Gestión de Productos");

        jcbCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbCategoriaActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setText("Filtrar por categoría :");

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

        jLabel3.setText("Código:");

        jLabel4.setText("Descripcion:");

        jLabel5.setText("Precio:");

        jLabel6.setText("Rubro:");

        jLabel7.setText("Stock:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtRubro, 0, 254, Short.MAX_VALUE)
                            .addComponent(jsStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addGap(27, 27, 27))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtCodigo)
                            .addComponent(jtDescripcion)
                            .addComponent(jtPrecio))))
                .addGap(21, 21, 21))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jtRubro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jsStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55))
        );

        jbBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/grupo12_tp6_2marianela/imagenes/buscador (2).jpg"))); // NOI18N
        jbBuscar.setText("Buscar por codigo");
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        jbCerrar.setText("Cerrar");
        jbCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCerrarActionPerformed(evt);
            }
        });

        jbEliminar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Francisco\\Downloads\\eliminar posta.jpg")); // NOI18N
        jbEliminar.setText("Eliminar");
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });

        jbNuevo.setIcon(new javax.swing.ImageIcon("C:\\Users\\Francisco\\Downloads\\nuevo (2).jpg")); // NOI18N
        jbNuevo.setText("Nuevo");
        jbNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevoActionPerformed(evt);
            }
        });

        jbActualizar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Francisco\\Downloads\\actualizar.jpg")); // NOI18N
        jbActualizar.setText("Actualizar");
        jbActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbActualizarActionPerformed(evt);
            }
        });

        jbGuardar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Francisco\\Downloads\\guardar (1).jpg")); // NOI18N
        jbGuardar.setText("Guardar");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbCerrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(24, 24, 24))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(jcbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jbNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbGuardar)
                        .addGap(17, 17, 17)
                        .addComponent(jbActualizar)
                        .addGap(38, 38, 38)
                        .addComponent(jbEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(jbCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jbGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jbActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    //(a)Boton de 'Cerrar de la ventana Gestion Productos'
    private void jbCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCerrarActionPerformed
      
        this.dispose();     
    }//GEN-LAST:event_jbCerrarActionPerformed

    //(b)Boton de 'Guardar producto'
    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
        // Validar que los campos no estén vacíos
  
    if (jtCodigo.getText().isEmpty() || jtDescripcion.getText().isEmpty() ||
        jtPrecio.getText().isEmpty() || jtRubro.getSelectedItem() == null) {
        JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos.", "Error", JOptionPane.ERROR_MESSAGE);
        return; // Salir del método si hay campos vacíos
    }

    try {
        // Obtener los valores de los campos de texto y spinner
        int codigo = Integer.parseInt(jtCodigo.getText()); // Convertir el texto a entero
        String descripcion = jtDescripcion.getText(); // Obtener la descripción del producto
        double precio = Double.parseDouble(jtPrecio.getText()); // Convertir el texto a double
        String rubro = (String) jtRubro.getSelectedItem(); // Obtener el rubro/categoría del JComboBox
        int stock = (int) jsStock.getValue(); // Obtener el valor del spinner

        // Crear un nuevo producto con los valores obtenidos
        Producto nuevoProducto = new Producto(codigo, descripcion, precio, rubro, stock );

        // Agregar el producto al TreeSet (se ordenará automáticamente por código)
        if (productos.add(nuevoProducto)) {
            JOptionPane.showMessageDialog(this, "Producto agregado correctamente.");
        } else {
            JOptionPane.showMessageDialog(this, "El producto ya existe en la lista.");
        }

        // Limpiar los campos después de guardar
        jtCodigo.setText("");
        jtDescripcion.setText("");
        jtPrecio.setText("");
        jtRubro.setSelectedIndex(-1); // Reiniciar el JComboBox
        jsStock.setValue(0);
        cargarTabla(); //llamaos a la tabla

    }catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Error: Verifique que los campos codigo y precio sean correctos.", "Error", JOptionPane.ERROR_MESSAGE);
        jtCodigo.setText("");
        jtDescripcion.setText("");
        jtPrecio.setText("");
        
        jsStock.setValue(0);
    }
    }//GEN-LAST:event_jbGuardarActionPerformed

    
    //(c)Boton de 'Nuevo' limpia los campos de productos
    private void jbNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevoActionPerformed
       jtCodigo.setText("");
       jtDescripcion.setText("");
       jtPrecio.setText("");
       //jtRubro.setSelectedIndex(-1);// no hace falta reiniciar el comboBox.
       jsStock.setValue(0);
        
        
    }//GEN-LAST:event_jbNuevoActionPerformed

    //(d)Seleccionar categoria-rubro en el jcbCategoria
    private void jcbCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbCategoriaActionPerformed
       // Obtener la categoría seleccionada
    String categoriaSeleccionada = (String) jcbCategoria.getSelectedItem();
    
    // Cargar la tabla con los productos filtrados
    cargarTabla(categoriaSeleccionada);
        
        
    }//GEN-LAST:event_jcbCategoriaActionPerformed

    
    //(e)Boton de 'Buscar' por codigo
    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        // Obtener el código ingresado en el JTextField (por ejemplo: jtCodigoBuscar)
    String codigoIngresado = jtCodigo.getText();
    
    if (codigoIngresado.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Por favor, ingrese un código.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    try {
        // Convertir el código a entero
        int codigo = Integer.parseInt(codigoIngresado);
        
        // Limpiar la tabla antes de mostrar el producto
        DefaultTableModel modelo = (DefaultTableModel) jtProductos.getModel();
        modelo.setRowCount(0);

        // Buscar el producto en el TreeSet de productos
        for (Producto producto : productos) {
            if (producto.getCodigo() == codigo) {
                // Si se encuentra el producto, agregarlo a la tabla
                modelo.addRow(new Object[]{
                    producto.getCodigo(),
                    producto.getDescripcion(),
                    producto.getPrecio(),
                    producto.getRubro(),
                    producto.getStock()
                });
                return; // Salir del método una vez encontrado
            }
        }

        // Si no se encontró el producto, mostrar un mensaje
        JOptionPane.showMessageDialog(this, "Producto no encontrado.", "Información", JOptionPane.INFORMATION_MESSAGE);
        
    } catch (NumberFormatException e) {
        // Manejar error si el código ingresado no es un número válido
        JOptionPane.showMessageDialog(this, "Por favor, ingrese un código numérico válido.", "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_jbBuscarActionPerformed

    
    //(f)Boton de 'Actualizar' llena los campos y segun el codigo actualiza los datos del producto
    private void jbActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbActualizarActionPerformed
        try {
        // Obtener el código del producto desde el campo (el código no se debe modificar)
        int codigo = Integer.parseInt(jtCodigo.getText());

        // Buscar el producto por su código en el TreeSet
        Producto productoAActualizar = null;
        
        for (Producto producto : productos) {
            if (producto.getCodigo() == codigo) {
                productoAActualizar = producto;
                break;
            }
        }

        // Si el producto fue encontrado, actualizamos los atributos
        if (productoAActualizar != null) {
            // Actualizar los atributos del producto (excepto el código)
            productoAActualizar.setDescripcion(jtDescripcion.getText());
            productoAActualizar.setPrecio(Double.parseDouble(jtPrecio.getText()));
            productoAActualizar.setRubro((String) jtRubro.getSelectedItem());
            productoAActualizar.setStock((int) jsStock.getValue());

            // Mostrar un mensaje de confirmación
            JOptionPane.showMessageDialog(this, "Producto actualizado correctamente.");

            // Recargar la tabla para reflejar los cambios
            cargarTabla();

            // Limpiar los campos de texto después de actualizar
            jtCodigo.setText("");
            jtDescripcion.setText("");
            jtPrecio.setText("");
            jtRubro.setSelectedIndex(-1);
            jsStock.setValue(0);
        } else {
            JOptionPane.showMessageDialog(this, "Producto no encontrado.", "Error", JOptionPane.ERROR_MESSAGE);
        }

    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Error: Verifique que los campos son correctos.", "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_jbActualizarActionPerformed

    
    //(g)Boton de "Eliminar" segun el codigo ingresado elimina el producto
    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed
      try {
        // Obtener el código ingresado en el campo de texto
        int codigo = Integer.parseInt(jtCodigo.getText());
        
        // Buscar el producto por código en el TreeSet
        Producto productoAEliminar = null;
        for (Producto producto : productos) {
            if (producto.getCodigo() == codigo) {
                productoAEliminar = producto;
                break;
            }
        }
        
        // Verificar si el producto existe en el TreeSet
        if (productoAEliminar != null) {
            // Eliminar el producto del TreeSet
            productos.remove(productoAEliminar);
            
            // Actualizar la tabla para reflejar los cambios
            cargarTabla(); // Método que recarga los datos en la tabla
            
            // Confirmación de que el producto fue eliminado
            JOptionPane.showMessageDialog(this, "Producto eliminado correctamente.");
        } else {
            // Si no se encuentra el producto, mostrar un mensaje
            JOptionPane.showMessageDialog(this, "Producto no encontrado.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        // Limpiar el campo de texto después de eliminar
        jtCodigo.setText("");

    } catch (NumberFormatException e) {
        // En caso de que el código ingresado no sea un número válido
        JOptionPane.showMessageDialog(this, "Ingrese el codigo del producto.", "Error", JOptionPane.ERROR_MESSAGE);
    }
        
    }//GEN-LAST:event_jbEliminarActionPerformed

   
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbActualizar;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbCerrar;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbNuevo;
    private javax.swing.JComboBox<String> jcbCategoria;
    private javax.swing.JSpinner jsStock;
    private javax.swing.JTextField jtCodigo;
    private javax.swing.JTextField jtDescripcion;
    private javax.swing.JTextField jtPrecio;
    private javax.swing.JTable jtProductos;
    private javax.swing.JComboBox<String> jtRubro;
    // End of variables declaration//GEN-END:variables




    //(A)Cargamso el comboBox 1°
    public void cargarCombo (){
        // Limpiar el JComboBox antes de cargar elementos
        jtRubro.removeAllItems();

        // Agregar los elementos al JComboBox
        jtRubro.addItem("Comestible");
        jtRubro.addItem("Limpieza");
        jtRubro.addItem("Perfumería");
    }

    //(B)Armamos el combo 2°   
     public void cargarCombo2 (){
        // Limpiar el JComboBox antes de cargar elementos
        jcbCategoria.removeAllItems();

        // Agregar los elementos al JComboBox
        jcbCategoria.addItem("Comestible");
        jcbCategoria.addItem("Limpieza");
        jcbCategoria.addItem("Perfumería");
    }

    
     //(C)Armamos las columnas de la tabla
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
    
    
    //(d)Cargar datos a mi tabla productos
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
    
    
    //(e)Filtramos los datos segun la categoria seleccionada
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
    
    
  

