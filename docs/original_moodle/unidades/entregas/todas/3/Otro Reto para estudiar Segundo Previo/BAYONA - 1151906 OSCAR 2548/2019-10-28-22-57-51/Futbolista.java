public class Futbolista
{
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
        if(otro instanceof  Futbolista){
            Futbolista f = (Futbolista)otro;
            rta = this.nombresYApellidos == f.nombresYApellidos ||
                this.numeroCamiseta == f.numeroCamiseta;
        }
        
        return rta;
    }

    public String getNombresYApellidos(){
        return this.nombresYApellidos;/*COMPLETE*/
    }

    /**Setter method nombresYApellidos*/
    public void setNombresYApellidos(String nombresYApellidos){
        this.nombresYApellidos = nombresYApellidos;
    }

    /**Getter method numeroCamiseta*/
    public int getNumeroCamiseta(){
      return this.numeroCamiseta;/*COMPLETE*/
    }

    public void setNumeroCamiseta(int numeroCamiseta){
        this.numeroCamiseta = numeroCamiseta;
    }
}
