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
    public Materia(){
    }
    public Materia(String nombre, int maximoDeAlumnosPorGrupo)
    {
      //COMPLETE
      setNombre(nombre);
      setMaximoDeAlumnosPorGrupo(maximoDeAlumnosPorGrupo);
      inscripciones = new ArrayList<Inscripcion>();
    }//fin constructor
    
    public boolean inscribir(Alumno alumno)
    {
      boolean inscribio = false;
      //COMPLETE
      Inscripcion inscripcion = new Inscripcion(alumno,this);
      if(!inscripciones.contains(inscripcion) && !alumno.tienePromedioCondicional()){
          this.inscripciones.add(inscripcion);
         inscribio=true; 
        }
      return inscribio;
    }//fin inscribir
    
    public int generarGrupos()
    {
      int totalGrupos = 0;
      //COMPLETE      
      int k=0;
      for(int i=0; i<maximoDeAlumnosPorGrupo;i++){
          for(int j=0; j<totalGrupos-(this.inscripciones.size()  %  this.maximoDeAlumnosPorGrupo !=0 ? 1: 0); j++)
       {
          this.grupos.get(j).agregarAlumno(this.inscripciones.get(k++).getAlumno());
          totalGrupos++;
       }
          
       }
       /*
        for(int i=k;i<this.inscripciones.size();i++){
        this.grupos.get(i).agregarAlumno(this.inscripciones.get(i).getAlumno());
        
    }
    */
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
      //COMPLETE
       if(other instanceof String) return this.nombre.equals(other);
      if(other instanceof Materia) return this.nombre.equals(((Materia)other).getNombre());
      return false;
    }//fin equals

}//fin class Materia