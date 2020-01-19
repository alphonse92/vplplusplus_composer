public abstract class Ingrediente {

    private String nombre;

    private int precioCompra;

    private int cantidadDisponible;

    /*Constructor Vacio*/
    public Ingrediente/*Complete*/(){
    }

    /*Constructor con parametro nombre*/
    public Ingrediente/*Complete*/(String nombre){
        this(nombre, 0, 0);
        //Complete
    }

    /*Constructor con todos los parametros*/
    public Ingrediente /*Complete*/(String nombre, int cantidadDisponible, int precioCompra){
        this.nombre = nombre;
        this.cantidadDisponible = cantidadDisponible;
        this.precioCompra = precioCompra;
        //Complete
    }

    /*Registra una compra de este tipo de Ingrediente*/
    public void registrarCompra(int cantidad, int precioCompra) {
        if(precioCompra > this.precioCompra) this.precioCompra = precioCompra;
        this.cantidadDisponible += cantidad;
        //Complete
    }

    /*Registra una venta de este tipo de Ingrediente*/
    public void registrarVenta(int cantidad){
        this.cantidadDisponible -= cantidad;
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

    public boolean equals(Object obj){
        boolean equal = false;
        if(obj instanceof String) equal = this.nombre.equals(obj);
        if(obj instanceof Ingrediente && this.getClass() == obj.getClass()) equal = this.nombre.equals(((Ingrediente)obj).getNombre());
        return equal;
        //Complete
    }

    public String toString(){
        return this.getNombre() + ", " + String.valueOf(this.getPrecioCompra()) + ", " + String.valueOf(this.getCantidadDisponible());//Complete
    }
}