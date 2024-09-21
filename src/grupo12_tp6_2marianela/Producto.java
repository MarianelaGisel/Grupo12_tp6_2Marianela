
package grupo12_tp6_2marianela;


public class Producto {
    int codigo;
    String descripcion;
    long precio;
    int stock;
    String rubro;

    public Producto(int codigo, String descripcion, long precio, int stock, String rubro) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.stock = stock;
        this.rubro = rubro;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public long getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }

    public String getRubro() {
        return rubro;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPrecio(long precio) {
        this.precio = precio;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void setRubro(String rubro) {
        this.rubro = rubro;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + this.codigo;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Producto other = (Producto) obj;
        return this.codigo == other.codigo;
    }

    @Override
    public String toString() {
        return "codigo=" + codigo + ", " + descripcion;
    }
    
    
    
}
