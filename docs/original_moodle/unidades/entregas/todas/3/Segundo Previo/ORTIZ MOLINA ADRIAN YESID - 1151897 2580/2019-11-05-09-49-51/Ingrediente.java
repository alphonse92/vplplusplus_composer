/**
 * Clase Ingrediente
 *
 * @Desarroladores (Jhonny Guarín- 1151893, jhonnyesneidergcha@ufps.edu.co) && (Adrían Ortiz- 1151897, adrianyesidomol@ufps.edu.co)
 * Grupo #3 segundo parcial - POO I 
 * @version 0.0004 :'D
 */
public  abstract class Ingrediente {

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
        this.precioCompra = (this.precioCompra > precioCompra)? this.precioCompra : precioCompra;
        this.cantidadDisponible += cantidad;
        //Complete
    }

    /*Registra una venta de este tipo de Ingrediente*/
    public void registrarVenta(int cantidad){
        this.cantidadDisponible -= cantidad;
        //Complete
    }

    //Complete GET/SET
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
    public boolean equals(Object obj){
        boolean equal = false;
        if(obj instanceof String) equal = this.nombre.equals(obj);
        if(obj instanceof Ingrediente && this.getClass() == obj.getClass()) equal = this.nombre.equals(((Ingrediente)obj).getNombre());
        return equal;
        //Complete
    }

    public String toString(){
        String str="";
        str = this.nombre + ", " + this.precioCompra + ", " + this.cantidadDisponible;
        return str;
        //Complete
    }
}
