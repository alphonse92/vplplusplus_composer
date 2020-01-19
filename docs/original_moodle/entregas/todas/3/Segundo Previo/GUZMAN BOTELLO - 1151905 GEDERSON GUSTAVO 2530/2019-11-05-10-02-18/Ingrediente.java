public abstract class/*Complete*/ Ingrediente {

    private String nombre;

    private int precioCompra;

    private int cantidadDisponible;

    /*Constructor Vacio*/
    public Ingrediente/*Complete*/(){

    }

    /*Constructor con parametro nombre*/
    public Ingrediente/*Complete*/(String nombre){
        //Complete
        this.nombre=nombre;
    }

    /*Constructor con todos los parametros*/
    public Ingrediente/*Complete*/(String nombre, int cantidadDisponible, int precioCompra){
        //Complete
        this.nombre=nombre;
        this.cantidadDisponible=cantidadDisponible;
        this.precioCompra=precioCompra;
    }

    /*Registra una compra de este tipo de Ingrediente*/
    public void registrarCompra(int cantidad, int precioCompra) {
        //Complete
        this.cantidadDisponible+=cantidad;
        if(precioCompra>this.precioCompra) this.precioCompra=precioCompra;
    }

    /*Registra una venta de este tipo de Ingrediente*/
    public void registrarVenta(int cantidad){
        //Complete
        if(this.cantidadDisponible>cantidad) this.cantidadDisponible-=cantidad;
    }

    //Complete GET/SET

    public boolean equals(Object obj){
        boolean rta = false;
        if(obj instanceof Ingrediente){
        if(obj instanceof Proteina && this instanceof Proteina){
            Ingrediente x = (Ingrediente) obj;
            rta = this.getNombre()==x.getNombre()&&
            this.getPrecioCompra()==x.getPrecioCompra()&&
            this.getCantidadDisponible()==x.getCantidadDisponible();
        }
        if(obj instanceof Grano && this instanceof Grano){
            Ingrediente x = (Ingrediente) obj;
            rta = this.getNombre()==x.getNombre()&&
            this.getPrecioCompra()==x.getPrecioCompra()&&
            this.getCantidadDisponible()==x.getCantidadDisponible();
        }
        if(obj instanceof Fruta && this instanceof Fruta){
            Ingrediente x = (Ingrediente) obj;
            rta = this.getNombre()==x.getNombre()&&
            this.getPrecioCompra()==x.getPrecioCompra()&&
            this.getCantidadDisponible()==x.getCantidadDisponible();
        }
        if(obj instanceof Almidon && this instanceof Almidon){
            Ingrediente x = (Ingrediente) obj;
            rta = this.getNombre()==x.getNombre()&&
            this.getPrecioCompra()==x.getPrecioCompra()&&
            this.getCantidadDisponible()==x.getCantidadDisponible();
        }
    }
        return rta;
    }

    public String toString(){
        //Complete
        String str = super.toString()+"\n";
        str+= "Nombre" + nombre + "\n";
        str+= "Precio de Compra" + precioCompra + "\n";
        str+= "Cantidad disponible" + cantidadDisponible + "\n";
        return str;
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
