public class Futbolista
{
    /*COMPLETE Propiedades de Futbolista*/;
     private String nombresYAapellidos;
     private int numeroCamiseta;
    public Futbolista(){}

    public Futbolista(String nombresYApellidos, int numeroCamiseta){
        /*COMPLETE*/
        this.setNombresYApellidos(nombresYApellidos);
        this.setNumeroCamiseta(numeroCamiseta);
    }

    public boolean equals(Object otro){
        boolean rta = false;
        /*COMPLETE*/
        if(otro instanceof Futbolista) return this.nombresYAapellidos.equals(((Futbolista)otro).getNombresYApellidos()) && 
                                        this.numeroCamiseta==(((Futbolista)otro).getNumeroCamiseta());
        return rta;                     //EL ==
    }

    public String getNombresYApellidos(){
        return this.nombresYAapellidos;/*COMPLETE*/
    }

    /**Setter method nombresYApellidos*/
    public void setNombresYApellidos(String nombresYApellidos){
        /*COMPLETE*/
        this.nombresYAapellidos=nombresYApellidos;
    }

    /**Getter method numeroCamiseta*/
    public int getNumeroCamiseta(){
      return this.numeroCamiseta;/*COMPLETE*/
    }

    public void setNumeroCamiseta(int numeroCamiseta){
        /*COMPLETE*/
        this.numeroCamiseta=numeroCamiseta;
    }
}
