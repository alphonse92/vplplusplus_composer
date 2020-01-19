public class Futbolista
{
    /*COMPLETE Propiedades de Futbolista*/;
     protected String nombresYApellidos;
     protected int numeroCamiseta;
    
     
     

    public Futbolista(){}

    public Futbolista(String nombresYApellidos, int numeroCamiseta){
        /*COMPLETE*/
        this.nombresYApellidos=nombresYApellidos;
        this.numeroCamiseta=numeroCamiseta;
       
    }

    public boolean equals(Object otro){
        
        if (otro instanceof String)
        return this.nombresYApellidos.equals(otro);
        if (otro instanceof Futbolista)
        return this.nombresYApellidos.equals(((Futbolista)otro).getNombresYApellidos());
        return false;
      
    }

    public String getNombresYApellidos(){
        return nombresYApellidos;
        /*COMPLETE*/
    }

    /**Setter method nombresYApellidos*/
    public void setNombresYApellidos(String nombresYApellidos){
        this.nombresYApellidos=nombresYApellidos;
        /*COMPLETE*/
    }

    /**Getter method numeroCamiseta*/
    public int getNumeroCamiseta(){
      return numeroCamiseta;
      /*COMPLETE*/
    }

    public void setNumeroCamiseta(int numeroCamiseta){
       this.numeroCamiseta=numeroCamiseta;
        /*COMPLETE*/
    }
}
