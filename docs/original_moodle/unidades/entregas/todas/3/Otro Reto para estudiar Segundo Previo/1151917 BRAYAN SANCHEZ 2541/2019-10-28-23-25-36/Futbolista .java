public class Futbolista{
    private String nombresYApellidos;
    private int numeroCamiseta;

    public Futbolista(){
    
    }

    public Futbolista(String nombresYApellidos, int numeroCamiseta){
        this.nombresYApellidos = nombresYApellidos;
        this.numeroCamiseta = numeroCamiseta;
    }

    public boolean equals(Object otro){
      if(otro instanceof Futbolista) return this.nombresYApellidos.equals(((Futbolista)otro).getNombresYApellidos());
      return false;
    }

    public String getNombresYApellidos(){
        return this.nombresYApellidos;
    }

    /**Setter method nombresYApellidos*/
    public void setNombresYApellidos(String nombresYApellidos){
        this.nombresYApellidos = nombresYApellidos;
    }

    /**Getter method numeroCamiseta*/
    public int getNumeroCamiseta(){
      return this.numeroCamiseta;
    }

    public void setNumeroCamiseta(int numeroCamiseta){
        this.numeroCamiseta = numeroCamiseta;
    }
}
