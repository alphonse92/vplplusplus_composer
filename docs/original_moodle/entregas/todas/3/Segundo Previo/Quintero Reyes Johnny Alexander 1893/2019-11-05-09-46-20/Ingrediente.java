




/*Complete*/public abstract class Ingrediente {
/*
 * Grupo 1
 * Johnny Quintero 1151870
 * Daniela Sanchez 1151947
 */
    private String nombre;

    private int precioCompra;

    private int cantidadDisponible;
    
    /*Constructor Vacio*/
    public /*Complete*/ Ingrediente(){
     
    }
    
    /*Constructor con parametro nombre*/
    public /*Complete*/Ingrediente(String nombre){
      //Complete
      this.nombre=nombre;
      precioCompra=0;
      cantidadDisponible=0;
    }
    
    
    /*Constructor con todos los parametros*/
    public /*Complete*/Ingrediente(String nombre, int cantidadDisponible, int precioCompra){
     //Complete
     this.nombre=nombre;
     this.cantidadDisponible=cantidadDisponible;
     this.precioCompra=precioCompra;
    }
    
    /*Registra una compra de este tipo de Ingrediente*/
    public void registrarCompra(int cantidad, int precioCompra) {
     //Complete
     this.cantidadDisponible += cantidad;
     this.precioCompra = (this.precioCompra > precioCompra)? this.precioCompra : precioCompra;
    }
    
    /*Registra una venta de este tipo de Ingrediente*/
    public void registrarVenta(int cantidad){
      //Complete
      this.cantidadDisponible-=cantidad;
    }

    //Complete GET/SET
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the precioCompra
     */
    public int getPrecioCompra() {
        return precioCompra;
    }

    /**
     * @param precioCompra the precioCompra to set
     */
    public void setPrecioCompra(int precioCompra) {
        this.precioCompra = precioCompra;
    }

    /**
     * @return the cantidadDisponible
     */
    public int getCantidadDisponible() {
        return cantidadDisponible;
    }

    /**
     * @param cantidadDisponible the cantidadDisponible to set
     */
    public void setCantidadDisponible(int cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
    }
    
    public boolean equals(Object obj){
      //Complete
      if(this.getClass()==obj.getClass())  return this.nombre.equals(((Ingrediente)obj).getNombre());
      return false;
    }
    
    public String toString(){
      //Complete
      String str="";
      str = this.getNombre() + ", " + this.getPrecioCompra() + ", " + this.getCantidadDisponible();
      return str;
    }
}
