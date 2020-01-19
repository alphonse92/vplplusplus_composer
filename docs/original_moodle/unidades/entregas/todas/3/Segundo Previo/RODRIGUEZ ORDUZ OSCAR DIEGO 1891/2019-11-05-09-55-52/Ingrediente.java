   public abstract class Ingrediente {

    private String nombre;

    private int precioCompra;

    private int cantidadDisponible;
    
    /*Constructor Vacio*/
    public Ingrediente(){
        
    }
    
    /*Constructor con parametro nombre*/
    public Ingrediente(String nombre){
      this.nombre = nombre;
    }    
    
    /*Constructor con todos los parametros*/
    public Ingrediente(String nombre, int cantidadDisponible, int precioCompra){
     this.nombre = nombre;
     this.cantidadDisponible = cantidadDisponible;
     this.precioCompra = precioCompra;
    }
    
    /*Registra una compra de este tipo de Ingrediente*/
    public void registrarCompra(int cantidad, int precioCompra) {
     this.cantidadDisponible = cantidad;
     this.precioCompra = precioCompra;
    }
    
    /*Registra una venta de este tipo de Ingrediente*/
    public void registrarVenta(int cantidad){
      this.cantidadDisponible-=cantidad;
    }

    public String getNombre(){
        return this.nombre;
    }
    
    public void setNombre(String nombreNuevo){
        this.nombre = nombreNuevo;
    }
    public int getCantidadDisponible(){
        return this.cantidadDisponible;
    }
    
    public void setCantidadDisponible(int cantidadDisponibleNuevo){
        this.cantidadDisponible = cantidadDisponibleNuevo;
    }
    public int getPrecioCompra(){
        return this.precioCompra;
    }
    
    public void setPrecioCompra(int precioCompraNuevo){
        this.precioCompra = precioCompraNuevo;
    }
    public boolean equals(Object obj){
      //Complete
    }
    
    public String toString(){
      
    }
}
