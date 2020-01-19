public class Futbolista
{
    String nombresYApellidos;
    int numeroCamiseta;

    public Futbolista(){
        nombresYApellidos = "";
        numeroCamiseta = 0;
    }

    public Futbolista(String nombresYApellidos, int numeroCamiseta){
        this.nombresYApellidos = nombresYApellidos;
        this.numeroCamiseta = numeroCamiseta;
    }

    public boolean equals(Object otro){
        boolean rta = false;
        if(otro instanceof Futbolista){
            rta = this.nombresYApellidos.equals(((Futbolista)otro).getNombresYApellidos())
            && this.numeroCamiseta == ((Futbolista)otro).getNumeroCamiseta();
        }
        return rta;
    }

    public String getNombresYApellidos(){
        return nombresYApellidos; 
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
