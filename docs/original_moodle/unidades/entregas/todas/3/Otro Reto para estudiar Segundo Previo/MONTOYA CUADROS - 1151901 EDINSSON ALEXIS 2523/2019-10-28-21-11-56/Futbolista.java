public class Futbolista
{
    /*COMPLETE Propiedades de Futbolista*/;
    protected String nombresYApellidos;
    protected int numeroCamiseta;

    public Futbolista(String nombresYApellidos, int numeroCamiseta){
        /*COMPLETE*/
        this.nombresYApellidos = nombresYApellidos;
        this.numeroCamiseta = numeroCamiseta;
    }

    public boolean equals(Object otro){
        boolean rta = false;
        /*COMPLETE*/
        return rta;
    }

    public String getNombresYApellidos(){
        return this.nombresYApellidos;/*COMPLETE*/
    }

    /**Setter method nombresYApellidos*/
    public void setNombresYApellidos(String nombresYApellidos){
        /*COMPLETE*/
        this.nombresYApellidos = nombresYApellidos;
    }

    /**Getter method numeroCamiseta*/
    public int getNumeroCamiseta(){
        return this.numeroCamiseta;/*COMPLETE*/
    }

    public void setNumeroCamiseta(int numeroCamiseta){
        /*COMPLETE*/
        this.numeroCamiseta = numeroCamiseta;
    }
}
