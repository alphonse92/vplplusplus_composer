
import java.util.ArrayList;
/**
 * Escriba en lenguaje natural una descripcion de los objetos
 * que caben en el concepto de la clase Materia.
 * 
 * @author (Milton Jes&uacute;s Vera Contreras - miltonjesusvc@ufps.edu.co) 
 * @version Math.sin(Math.PI-Double.MIN_VALUE) :) 
 */
public class Materia
{
    protected ArrayList<Grupo> grupos;
    protected ArrayList<Inscripcion> inscripciones;
    protected String nombre;
    protected int maximoDeAlumnosPorGrupo;

    public Materia(String nombre, int maximoDeAlumnosPorGrupo)
    {
        this.nombre = nombre;
        this.maximoDeAlumnosPorGrupo = maximoDeAlumnosPorGrupo;
        this.inscripciones = new ArrayList<Inscripcion>();
        this.grupos = null;
        //COMPLETE
    }//fin constructor

    public boolean inscribir(Alumno alumno)
    {
        boolean inscribio = false;
        Inscripcion inscripcion = new Inscripcion(alumno, this);
        if(alumno.tienePromedioCondicional() == false && 
        this.inscripciones.contains(inscripcion ) == false){
            this.inscripciones.add(inscripcion);
            inscribio = true;
        }
        //COMPLETE
        return inscribio;
    }//fin inscribir

    public int generarGrupos()
    {
        int totalGrupos = 0;
        
        //COMPLETE      
        return totalGrupos;

    }//fin generarGrupos

    /**Metodo de acceso a la propiedad nombre*/
    public String getNombre(){
        return this.nombre;
    }//end method getNombre

    /**Metodo de modificacion a la propiedad nombre*/
    public void setNombre(String nombre){
        this.nombre = nombre;
    }//end method setNombre

    /**Metodo de acceso a la propiedad maximoDeAlumnosPorGrupo*/
    public int getMaximoDeAlumnosPorGrupo(){
        return this.maximoDeAlumnosPorGrupo;
    }//end method getMaximoDeAlumnosPorGrupo

    /**Metodo de modificacion a la propiedad maximoDeAlumnosPorGrupo*/
    public void setMaximoDeAlumnosPorGrupo(int maximoDeAlumnosPorGrupo){
        this.maximoDeAlumnosPorGrupo = maximoDeAlumnosPorGrupo;
    }//end method setMaximoDeAlumnosPorGrupo

    /***/
    public Grupo getGrupo(int numero)
    {
        return this.grupos.get(numero);
    }//fin getGrupo

    /**Compara el nombre de this con un String u otro Materia*/
    public boolean equals(Object other)
    {
        if(other instanceof String) return this.nombre.equals(other);
        if(other instanceof Materia) return this.nombre.equals(((Materia)other).getNombre());
        //COMPLETE
        return false;
    }//fin equals

}//fin class Materia