//JAVIER ALONSO PARADA CABALLERO Y FELIPE ALFEREZ VILLAMIZAR GRUPO 9
public class Ingrediente {

    private String nombre;

    private int precioCompra;

    private int cantidadDisponible;

    /*Constructor Vacio*/
    public /*Complete*/Ingrediente(){
        this.nombre ="";
        this.precioCompra=0;
        this.cantidadDisponible=0;
    }

    /*Constructor con parametro nombre*/
    public /*Complete*/Ingrediente(String nombre){
        //Complete
        this.nombre = nombre;
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
        this.cantidadDisponible +=  cantidad;
        if(precioCompra>this.precioCompra){
            this.precioCompra = precioCompra;
        }
    }

    /*Registra una venta de este tipo de Ingrediente*/
    public void registrarVenta(int cantidad){
        this.cantidadDisponible-=cantidad;
    }

    //Complete GET/SET

    public boolean equals(Object obj){
        //Complete
        if(obj instanceof Ingrediente){
            if(obj instanceof Grano && this instanceof Grano){
                Ingrediente ingrediente = (Ingrediente)obj;
                return this.toString().equals(ingrediente.toString());
            }
            if(obj instanceof Almidon && this instanceof Almidon){
                Ingrediente ingrediente = (Ingrediente)obj;
                return this.toString().equals(ingrediente.toString());
            }
            if(obj instanceof Proteina && this instanceof Proteina){
                Ingrediente ingrediente = (Ingrediente)obj;
                return this.toString().equals(ingrediente.toString());
            }
            if(obj instanceof Fruta && this instanceof Fruta){
                Ingrediente ingrediente = (Ingrediente)obj;
                return this.toString().equals(ingrediente.toString());
            }
        }
        return false;
    }

    public String toString(){
        //Complete
        return nombre+""+precioCompra+""+cantidadDisponible;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return this.nombre;
    }

    public int getCantidadDisponible(){
        return this.cantidadDisponible;
    }

    public void setCantidadDisponible( int cantidadDisponible){
        this.cantidadDisponible = cantidadDisponible;
    }    

    public int getPrecioCompra(){
        return precioCompra;
    }

    public void setPrecioCompra(int precioCompra){
        this.precioCompra = precioCompra;
    }
}
