public class Futbolista
{
    String nombresYApellidos;
    int numeroCamiseta;

    public Futbolista(){}

    public Futbolista(String nombresYApellidos, int numeroCamiseta){
        this.nombresYApellidos = nombresYApellidos;
        this.numeroCamiseta = numeroCamiseta;
    }

    public boolean equals(Object otro){
        if(otro instanceof String){return this.nombresYApellidos.equals(otro);}else
        return false;
    }

    public String getNombresYApellidos(){
        return nombresYApellidos;/*COMPLETE*/
    }

    /**Setter method nombresYApellidos*/
    public void setNombresYApellidos(String nombresYApellidos){
        this.nombresYApellidos = nombresYApellidos;
    }

    /**Getter method numeroCamiseta*/
    public int getNumeroCamiseta(){
      return numeroCamiseta;
    }

    public void setNumeroCamiseta(int numeroCamiseta){
        this.numeroCamiseta = numeroCamiseta;
    }
}
