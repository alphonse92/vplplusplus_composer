/*Complete*/public class Ingrediente {

    private String nombre;

    private int precioCompra;

    private int cantidadDisponible;
    
    /*Constructor Vacio*/
    public Ingrediente/*Complete*/(){
     
    }
    
    /*Constructor con parametro nombre*/
    public Ingrediente/*Complete*/(String nombre){
       this.nombre = nombre;
      //Complete
    }
    
    
    /*Constructor con todos los parametros*/
    public Ingrediente/*Complete*/(String nombre, int cantidadDisponible, int precioCompra){
        this.nombre = nombre;
        this.cantidadDisponible = cantidadDisponible;
        this.precioCompra = precioCompra;
     //Complete
    }
    
    /*Registra una compra de este tipo de Ingrediente*/
    public void registrarCompra(int cantidad, int precioCompra) {
        
     //Complete
    }
    
    /*Registra una venta de este tipo de Ingrediente*/
    public void registrarVenta(int cantidad){
       
      //Complete
    }

    //Complete GET/SET
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(int precioCompra) {
        this.precioCompra = precioCompra;
    }

    public int getCantidadDisponible() {
        return cantidadDisponible;
    }

    public void setCantidadDisponible(int cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
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
        final Restaurante other = (Restaurante) obj;
        if (this.precioCompra != other.precioCompra) {
            return false;
        }
        if (this.cantidadDisponible != other.cantidadDisponible) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Restaurante{" + "nombre=" + nombre + ", precioCompra=" + precioCompra + ", cantidadDisponible=" + cantidadDisponible + '}';
    }
      //Complete

}
