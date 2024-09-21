
package grupo12_tp6_2marianela;


public class Producto implements Comparable <Producto> {
   //Atributos
    private int codigo;
    private String descripcion;
    private double precio; //double
    private String rubro;
    private int stock;
    

    
    //Constructor
    public Producto(int codigo, String descripcion, double precio,  String rubro,int stock) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.rubro=rubro;
        this.stock = stock;
        
    }

    //codigo getter
    public int getCodigo() {
        return codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }

    public String getRubro() {
        return rubro;
    }

    
    //codigo setter
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPrecio(double precio) {
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
    
    
    //Principalmente se usa para un TreeSet de productos, segun el codigo
    @Override
    public int compareTo(Producto otro) {
        if(this.codigo == otro.codigo)
            return 0 ;//si this.codigo == otro.codigo (son iguales)
        else
            if(this.codigo > otro.codigo)
                return  1;//si: this.codigo > otro.codigo  
            else
                return -1 ; //si: this.codigo < otro.codigo
    }
    
   
    
}
