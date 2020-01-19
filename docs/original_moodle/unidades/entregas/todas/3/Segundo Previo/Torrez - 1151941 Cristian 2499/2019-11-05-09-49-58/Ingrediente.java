public abstract class Ingrediente {

    private String nombre;

    private int precioCompra;

    private int cantidadDisponible;
    
    /*Constructor Vacio*/
    public Ingrediente(){
     
    }
    
    /*Constructor con parametro nombre*/
    public Ingrediente(String nombre){
      this.nombre =  nombre;
    }
    
    
    /*Constructor con todos los parametros*/
    public Ingrediente (String nombre, int cantidadDisponible, int precioCompra){
     this.nombre = nombre;
     this.cantidadDisponible = cantidadDisponible;
     this.precioCompra = precioCompra;
    }
    
    /*Registra una compra de este tipo de Ingrediente*/
    public void registrarCompra(int cantidad, int precioCompra) {
     if(precioCompra > this.precioCompra) {
        this.precioCompra = precioCompra;
     }   
        
     this.cantidadDisponible -= cantidad;
    }
    
    /*Registra una venta de este tipo de Ingrediente*/
    public void registrarVenta(int cantidad){
      this.cantidadDisponible -= cantidad;
    }

    //Complete GET/SET
    
    public boolean equals(Object obj){
      Ingrediente otro = (Ingrediente) obj;
        
      return this.nombre.equals(otro.nombre) && this.precioCompra == (otro.precioCompra) && this.cantidadDisponible == otro.cantidadDisponible;
    }
    
    @Override
    public String toString(){
      return this.nombre;
    }

    //Start GetterSetterExtension Code
    /**Getter method nombre*/
    public String getNombre(){
        return this.nombre;
    }//end method getNombre

    /**Setter method nombre*/
    public void setNombre(String nombre){
        this.nombre = nombre;
    }//end method setNombre

    /**Getter method precioCompra*/
    public int getPrecioCompra(){
        return this.precioCompra;
    }//end method getPrecioCompra

    /**Setter method precioCompra*/
    public void setPrecioCompra(int precioCompra){
        this.precioCompra = precioCompra;
    }//end method setPrecioCompra

    /**Getter method cantidadDisponible*/
    public int getCantidadDisponible(){
        return this.cantidadDisponible;
    }//end method getCantidadDisponible

    /**Setter method cantidadDisponible*/
    public void setCantidadDisponible(int cantidadDisponible){
        this.cantidadDisponible = cantidadDisponible;
    }//end method setCantidadDisponible

    //End GetterSetterExtension Code
//!
}