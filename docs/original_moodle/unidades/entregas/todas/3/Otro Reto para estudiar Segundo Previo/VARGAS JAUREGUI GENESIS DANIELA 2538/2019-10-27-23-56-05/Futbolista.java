public class Futbolista
{
    /*COMPLETE Propiedades de Futbolista*/;
    private String nombresYApellidos;
    private int numeroCamiseta;
    public Futbolista(){}

    public Futbolista(String nombresYApellidos, int numeroCamiseta){
        /*COMPLETE*/
        this.nombresYApellidos = nombresYApellidos;
        this.numeroCamiseta = numeroCamiseta;
    }

    public boolean equals(Object otro){
        boolean rta = false;
        if(otro instanceof String) rta =  this.nombresYApellidos.equals(otro);
        if(otro instanceof Futbolista) rta = this.nombresYApellidos.equals(((Futbolista)otro).getNombresYApellidos()) 
            && this.numeroCamiseta==(((Futbolista)otro).getNumeroCamiseta());
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
        /*COMPLETE*/
        return this.numeroCamiseta;
    }

    public void setNumeroCamiseta(int numeroCamiseta){
        /*COMPLETE*/
        this.numeroCamiseta = numeroCamiseta;
    }
}
