public class Futbolista
{
    public String nombresYApellidos;
    public int numeroCamiseta;
    /*COMPLETE Propiedades de Futbolista*/;

    public Futbolista(){}

    public Futbolista(String nombresYApellidos, int numeroCamiseta){
        this.nombresYApellidos = nombresYApellidos;
        this.numeroCamiseta = numeroCamiseta;
        /*COMPLETE*/
    }

    public boolean equals(Object otro){
        boolean rta = false;
        if (otro instanceof String) rta = this.nombresYApellidos.equals(otro);
        if (otro instanceof Futbolista) rta = this.nombresYApellidos.equals(((Futbolista)otro).getNombresYApellidos());
        /*COMPLETE*/
        return rta;
    }

    public String getNombresYApellidos(){
        return this.nombresYApellidos;/*COMPLETE*/
    }

    /**Setter method nombresYApellidos*/
    public void setNombresYApellidos(String nombresYApellidos){
        this.nombresYApellidos = nombresYApellidos;
        /*COMPLETE*/
    }

    /**Getter method numeroCamiseta*/
    public int getNumeroCamiseta(){
      return this.numeroCamiseta;/*COMPLETE*/
    }

    public void setNumeroCamiseta(int numeroCamiseta){
        this.numeroCamiseta = numeroCamiseta;
        /*COMPLETE*/
    }
}
