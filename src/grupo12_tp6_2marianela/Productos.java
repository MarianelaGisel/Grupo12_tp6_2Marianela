
package grupo12_tp6_2marianela;

import java.util.TreeSet;


public class Productos {
    public static TreeSet <Producto> productos = new TreeSet<>();
    
    //Constructor

    public Productos() {
    }
    
    //(A)Agregar un "Producto" al TreeSet de productos
    public boolean agregarProducto(Producto producto) {
        return productos.add(producto); // El TreeSet no agrega elementos duplicados
}
    
 //(B)Buscamos el producto por el codigo
 public boolean eliminarProducto(int codigo) {
        Producto producto = buscarProductoPorCodigo(codigo);
        if (producto != null) {
            return productos.remove(producto);
        }
        return false;
}
    
    //(C)Nos ayuda a buscar por codigo
 public Producto buscarProductoPorCodigo(int codigo) {
    for (Producto producto : productos) {
        if (producto.getCodigo() == codigo) {
            return producto;
        }
    }
    return null;
}
    
    
    //(D)Modificar los productos
 public boolean modificarProducto(int codigo, String descripcion, double precio, int stock, String rubro) {
    Producto producto = buscarProductoPorCodigo(codigo);
    if (producto != null) {
        producto.setDescripcion(descripcion);
        producto.setPrecio(precio);
        producto.setStock(stock);
        producto.setRubro(rubro);
        return true;
    }
    return false;
}
    
    
    
}
