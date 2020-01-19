import java.util.ArrayList;

/**
 * Escriba en lenguaje natural una descripcion de los objetos
 * que caben en el concepto de la clase Materia.
 * 
 * @author (Milton Jes&uacute;s Vera Contreras - miltonjesusvc@ufps.edu.co) 
 * @version Math.sin(Math.PI-Double.MIN_VALUE) :) 
 */
public class Materia {
    protected ArrayList<Grupo> grupos;
    protected ArrayList<Inscripcion> inscripciones;
    protected String nombre;
    protected int maximoDeAlumnosPorGrupo;
  
    public Materia(String nombre, int maximoDeAlumnosPorGrupo){
      this.nombre = nombre;
      this.maximoDeAlumnosPorGrupo = maximoDeAlumnosPorGrupo;
      this.inscripciones = new ArrayList<Inscripcion>();
      this.grupos = null;
    }//fin constructor
    
    public boolean inscribir(Alumno alumno){
      boolean inscribio = false;
      boolean existe = false;
      Inscripcion inscripcion = new Inscripcion(alumno, this);
      
      for(int i = 0; i < inscripciones.size(); i++) {
          if(inscripcion.equals(inscripciones.get(i)))
              existe = true;
      }
      
      if(!existe && !alumno.tienePromedioCondicional()) {
          inscribio = true;
          inscripciones.add(inscripcion);
          System.out.println(inscripciones.size());
      }
      
      return inscribio;
    }//fin inscribir
    
    public int generarGrupos(){
      int totalGrupos = this.inscripciones.size() / this.maximoDeAlumnosPorGrupo;
      int count = 0;
      Grupo grupo = new Grupo(this);
      this.grupos = new ArrayList <Grupo> (totalGrupos);
      

    for(int i = 0; i < totalGrupos; i++){
        this.grupos.add(grupo);
    }

    for(int i = 0 ; i < totalGrupos; i++) {
        for(int j = 0; j < maximoDeAlumnosPorGrupo; j++) {
            this.grupos.get(i).agregarAlumno(this.inscripciones.get(count++).getAlumno());
        }
    } 
      
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
    public Grupo getGrupo(int numero){
      if(numero < 1 || numero > this.grupos.size())
          return null;
      
      else
         return this.grupos.get(numero - 1);
    }//fin getGrupo
    
    /**Compara el nombre de this con un String u otro Materia*/ 
    public boolean equals(Object other){
        
      if(other instanceof String)
            return this.nombre.equals(other);
        
      if(other instanceof Materia) {
            Materia materia = (Materia) other;
            return this.nombre.equals(materia.getNombre());
      }
        
      return false;
    }
}//fin class Materia