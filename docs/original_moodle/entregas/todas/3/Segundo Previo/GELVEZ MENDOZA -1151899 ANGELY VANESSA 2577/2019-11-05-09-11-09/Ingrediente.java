/*Complete*/ public class Ingrediente{

    private String nombre;

    private int precioCompra;

    private int cantidadDisponible;

    /*Constructor Vacio*/
    public /*Complete*/ Ingrediente(){

        this.nombre = nombre;
        this.precioCompra = 0;
        this.cantidadDisponible = 0;
    }

    /*Constructor con parametro nombre*/
    public /*Complete*/Ingrediente(String nombre){
        //Complete
        this.nombre = nombre;
    }

    /*Constructor con todos los parametros*/
    public /*Complete*/Ingrediente (String nombre, int cantidadDisponible, int precioCompra){
        //Complete
        this.nombre = nombre;
        this.cantidadDisponible = cantidadDisponible;
        this.precioCompra = precioCompra;
    }

    /*Registra una compra de este tipo de Ingrediente*/
    public void registrarCompra(int cantidad, int precioCompra) {
        //Complete
        this.precioCompra = (this.precioCompra > precioCompra)? this.precioCompra : precioCompra;
        this.cantidadDisponible += cantidad;
    }

    /*Registra una venta de este tipo de Ingrediente*/
    public void registrarVenta(int cantidad){
        //Complete
        this.cantidadDisponible -= cantidad;
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
        boolean equal = false;
        if(obj instanceof String) equal = this.nombre.equals(obj);
        if(obj instanceof Ingrediente && this.getClass() == obj.getClass()) equal = this.nombre.equals(((Ingrediente)obj).getNombre());
        return equal;
    }

    public String toString(){
        //Complete
        String str="";
        str = this.nombre + "," + this.precioCompra + "," + this.cantidadDisponible;
        return str;
    }
}
