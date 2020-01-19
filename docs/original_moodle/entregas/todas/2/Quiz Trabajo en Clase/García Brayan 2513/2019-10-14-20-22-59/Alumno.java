 
/**
 * Escriba en lenguaje natural una descripcion de los objetos
 * que caben en el concepto de la clase Alumno.
 * 
 * @author (Milton Jes&uacute;s Vera Contreras - miltonjesusvc@ufps.edu.co) 
 * @version Math.sin(Math.PI-Double.MIN_VALUE) :) 
 */
public class Alumno
{
    protected String codigo;
    protected String nombres;
    protected String apellidos;
    protected int edad;
    protected float promedio;

    public Alumno(String codigo, String nombres, String apellidos, int edad, float promedio)
    {
        this.codigo = codigo;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.edad = edad;
        this.promedio = promedio;
    }//fin constructor

    public boolean tienePromedioCondicional(){
        boolean tienePromedioCondicional = this.promedio <= 3.1;
        return tienePromedioCondicional;
    }

    /**Metodo de acceso a la propiedad codigo*/
    public String getCodigo(){
        return this.codigo;
    }//end method getCodigo

    /**Metodo de modificacion a la propiedad codigo*/
    public void setCodigo(String codigo){
        this.codigo = codigo;
    }//end method setCodigo

    /**Metodo de acceso a la propiedad nombres*/
    public String getNombres(){
        return this.nombres;
    }//end method getNombres

    /**Metodo de modificacion a la propiedad nombres*/
    public void setNombres(String nombres){
        this.nombres = nombres;
    }//end method setNombres

    /**Metodo de acceso a la propiedad apellidos*/
    public String getApellidos(){
        return this.apellidos;
    }//end method getApellidos

    /**Metodo de modificacion a la propiedad apellidos*/
    public void setApellidos(String apellidos){
        this.apellidos = apellidos;
    }//end method setApellidos

    /**Metodo de acceso a la propiedad edad*/
    public int getEdad(){
        return this.edad;
    }//end method getEdad

    /**Metodo de modificacion a la propiedad edad*/
    public void setEdad(int edad){
        this.edad = edad;
    }//end method setEdad

    /**Metodo de acceso a la propiedad promedio*/
    public float getPromedio(){
        return this.promedio;
    }//end method getEdad

    /**Metodo de modificacion a la propiedad promedio*/
    public void setPromedio(float promedio){
        this.promedio = promedio;
    }//end method setEdad

    /**Compara el codigo de this con un String u otro Alumno*/
    public boolean equals(Object other)
    {
        boolean equals = false;
        if(other instanceof String)
        {
            equals = this.codigo.equals(other);
        }
        if(other instanceof Alumno)
        {
            equals =  this.codigo.equals(((Alumno)other).getCodigo()) || (this.nombres.equals(((Alumno)other).getNombres()) && this.apellidos.equals(((Alumno)other).getApellidos()));
        }
        return equals;
    }//fin equals

}//fin class Alumn