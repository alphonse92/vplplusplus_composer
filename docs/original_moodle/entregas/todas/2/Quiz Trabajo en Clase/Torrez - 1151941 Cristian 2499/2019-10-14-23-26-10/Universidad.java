import java.util.ArrayList;
/**
* Escriba en lenguaje natural una descripcion de los objetos
* que caben en el concepto de la clase Universidad.
* 
* @author (Milton Jes&uacute;s Vera Contreras - miltonjesusvc@ufps.edu.co) 
* @version Math.sin(Math.PI-Double.MIN_VALUE) :) 
*/
public class Universidad
{
    public static final int MAX_ALUMNOS = 100;
    public static final int MAX_MATERIAS = 10;
    protected Materia [] materias;
    protected Alumno [] alumnos;
    protected int contadorMaterias;
    protected int contadorAlumnos;
    
    public Universidad() {
     this.materias = new Materia[MAX_MATERIAS];
     this.alumnos = new Alumno[MAX_ALUMNOS];
    }//fin constructor
    
    public boolean agregarMateria(String nombre, int maximoDeAlumnosPorGrupo){
        boolean agrego = false;
        Materia materia = new Materia(nombre, maximoDeAlumnosPorGrupo);
        
        if(!contieneMateria(materia) && contadorMaterias < MAX_MATERIAS){
            this.materias[contadorMaterias++] = materia;
            agrego = true;
        }
        
        return agrego;
    }
    
    public boolean contieneMateria(Materia materia){
        boolean existe = false;
        
        for(int i = 0; i < contadorMaterias; i++) {
            
            if(materia.equals(this.materias[i].nombre))
                existe = true;
            
        }
        
        return existe;
    }
    
    public boolean agregarAlumno(String codigo, String nombres, String apellidos, int edad, float promedio){
        boolean agrego = false;
        
        Alumno alumno = new Alumno(codigo, nombres, apellidos, edad, promedio);
        
        if(!contieneAlumno(alumno) && contadorAlumnos < MAX_ALUMNOS) {
            this.alumnos[contadorAlumnos] = alumno;
            contadorAlumnos++;
            agrego = true;
        }
        
        return agrego;
    }//fin agregarAlumno
    
    public boolean contieneAlumno(Alumno alumno){
        boolean existe = false;
        
        for(int i = 0; i < contadorAlumnos; i++) {
            
            if(alumno.equals(alumnos[i]))
                existe = true;
                
        }
        
        return existe;
    }
    
    /**Regresa el alumno en la posicion numero o null si no existe*/
    public Alumno getAlumno(int numero){
      if(numero > 0 && numero <= this.alumnos.length) {
          return this.alumnos[numero-1];
      }
      
      else {
          return null;
      }
    }//fin getAlumno
    
    /**Regresa el Materia en la posicion numero o null si no existe*/
    public Materia getMateria(int numero){
      if(numero > 0 && numero <= this.materias.length) {
          return this.materias[numero - 1];
      } 
      
      else {
          return null;
      }
    }//fin getMateria   
    
    /**
     * Elimina el alumno en la posicion numero.
     * Regresa el objeto eliminado si existe o NULL si no existe.
     * Reacomoda el arreglo para que todos los elementos queden contiguos y no queden vacios
     */
    
    public Alumno eliminarAlumno(int numero){
      Alumno alumno = getAlumno(numero);
      
      if(alumno != null) {
          for(int i = numero - 1; i < contadorAlumnos - 1; i++) {    
              alumnos[i] = alumnos[i+1];
          }
          
          alumnos[contadorAlumnos - 1] = null;
          contadorAlumnos--;
      }
      
      return alumno;
    }
    
    /**
    * Elimina la materia en la posicion numero.
    * Regresa el objeto eliminado si existe o NULL si no existe.
    * Reacomoda el arreglo para que todos los elementos queden contiguos y no queden vacios
    */
    public Materia eliminarMateria(int numero){
        Materia materia = getMateria(numero);
        
        if(materia != null) {
            for(int i = numero -1 ; i < contadorMaterias - 1; i++) {    
              materias[i] = materias[i+1];
            }
            
            materias[contadorMaterias - 1] = null;
            contadorMaterias--;   
        }
        
        return materia;
    }
    
}//fin class Universidad