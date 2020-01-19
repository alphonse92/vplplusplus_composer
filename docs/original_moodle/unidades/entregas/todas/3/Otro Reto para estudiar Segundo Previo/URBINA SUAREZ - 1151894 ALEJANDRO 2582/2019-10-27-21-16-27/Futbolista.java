public class Futbolista
{
    /*COMPLETE Propiedades de Futbolista*/
    String nombresYApellidos;
    int numeroCamiseta;    
    
    public Futbolista(){}

    public Futbolista(String nombresYApellidos, int numeroCamiseta){
        /*COMPLETE*/
        this.nombresYApellidos = nombresYApellidos;
        this.numeroCamiseta = numeroCamiseta;
    }

    public boolean equals(Object otro){
        boolean rta = otro instanceof String ? this.nombresYApellidos.equals(otro) :
                      otro instanceof Futbolista ? this.nombresYApellidos.equals(((Futbolista)otro).getNombresYApellidos()) :
                      false;
        /*COMPLETE*/
        return rta;
    }

    public String getNombresYApellidos(){
        return this.nombresYApellidos;/*COMPLETE*/
    }

    /**Setter method nombresYApellidos*/
    public void setNombresYApellidos(String nombresYApellidos){
        this.nombresYApellidos = nombresYApellidos;/*COMPLETE*/
    }

    /**Getter method numeroCamiseta*/
    public int getNumeroCamiseta(){
      return numeroCamiseta;/*COMPLETE*/
    }

    public void setNumeroCamiseta(int numeroCamiseta){
        this.numeroCamiseta = numeroCamiseta;/*COMPLETE*/
    }
}
