/*Complete*/ 
    public  class Ingrediente {

    private String nombre;

    private int precioCompra;

    private int cantidadDisponible;
    
    /*Constructor Vacio*/
    public Ingrediente/*Complete*/(){
     
    }
    
    /*Constructor con parametro nombre*/
    public Ingrediente/*Complete*/(String nombre){
      //Complete
      this.nombre = nombre;
    }
    
    
    /*Constructor con todos los parametros*/
    public Ingrediente/*Complete*/(String nombre, int cantidadDisponible, int precioCompra){
        //Complete
        this.nombre = nombre;
        this.cantidadDisponible = cantidadDisponible;
        this.precioCompra = precioCompra;
    }
    
    /*Registra una compra de este tipo de Ingrediente*/
    public void registrarCompra(int cantidad, int precioCompra) {
        //Complete
        if(this.precioCompra < precioCompra){
            this.precioCompra = precioCompra;
        }
        this.cantidadDisponible += cantidad;
    }
    
    /*Registra una venta de este tipo de Ingrediente*/
    public void registrarVenta(int cantidad){
      //Complete
      this.cantidadDisponible -= cantidad;
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
    
    public boolean equals(Object obj){
        //Complete
        Ingrediente ingrediente = (Ingrediente)obj;
        if(obj instanceof Ingrediente) return this.nombre.equals(ingrediente.precioCompra);
        return false;
    }
    
    public String toString(){
      //Complete
      String aux = "";
      aux = this.nombre + "," + this.precioCompra + "," + this.cantidadDisponible;
      return aux;
    }
}
