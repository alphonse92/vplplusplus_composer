 
/**
 * Escriba en lenguaje natural una descripcion de los objetos
 * que caben en el concepto de la clase Inscripcion.
 * 
 * @author (Milton Jes&uacute;s Vera Contreras - miltonjesusvc@ufps.edu.co) 
 * @version Math.sin(Math.PI-Double.MIN_VALUE) :) 
 */
public class Inscripcion
{
    protected Alumno alumno;
    protected Materia materia;

    public Inscripcion(Alumno alumno, Materia materia)
    {
        this.alumno = alumno;
        this.materia = materia;
    }//fin constructor

    /**Metodo de acceso a la propiedad alumno*/
    public Alumno getAlumno(){
        return this.alumno;
    }//end method getAlumno

    public Materia getMateria(){
        return this.materia;
    }

    /**Compara el Materia y alumno de this con el Materia y Alumno de other*/
    public boolean equals(Object other)
    {
        boolean equals = false;
        if(other instanceof Inscripcion) 
        {
            equals = this.materia.equals(((Inscripcion)other).materia) && this.alumno.equals(((Inscripcion)other).alumno);
        }
        return equals;
    }//fin equals    

}//fin class Inscripcion