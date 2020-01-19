/*Complete*/ public abstract class Ingrediente {

    private String nombre;

    private int precioCompra;

    private int cantidadDisponible;

    /*Constructor Vacio*/
    public  /*Complete*/Ingrediente(){

    }

    /*Constructor con parametro nombre*/
    public /*Complete*/ Ingrediente(String nombre){
        //Complete
        this.nombre=nombre;
    }

    /*Constructor con todos los parametros*/
    public /*Complete*/Ingrediente(String nombre, int cantidadDisponible, int precioCompra){
        //Complete
        this.nombre=nombre;
        this.cantidadDisponible = cantidadDisponible;
        this.precioCompra = precioCompra;
    }

    /*Registra una compra de este tipo de Ingrediente*/
    public void registrarCompra(int cantidad, int precioCompra) {
        //Complete
        this.cantidadDisponible = this.cantidadDisponible + cantidad;
        if(precioCompra>this.precioCompra){
            this.precioCompra = precioCompra;
        }
    }

    /*Registra una venta de este tipo de Ingrediente*/
    public void registrarVenta(int cantidad){
        //Complete
        this.cantidadDisponible= this.cantidadDisponible - cantidad;
    }

    //Complete GET/SET
    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String nombre){
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
        boolean rta = false;
        if(obj instanceof Object){
            
            Ingrediente x = (Ingrediente)obj;
            rta = this.nombre == x.nombre
                && this.precioCompra == x.precioCompra
                && this.cantidadDisponible == x.cantidadDisponible;
        }
        return rta;
    }

    public String toString(){
        //Complete
        return nombre+","+precioCompra+","+cantidadDisponible;
    }
}
