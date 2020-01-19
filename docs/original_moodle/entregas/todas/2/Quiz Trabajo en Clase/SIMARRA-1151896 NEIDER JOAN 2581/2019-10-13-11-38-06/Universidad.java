
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

    public Universidad()
    {
      //COMPLETE
      this.contadorMaterias=contadorMaterias;
      this.contadorAlumnos=contadorAlumnos;
      this.materias=new Materia[10];
      this.alumnos=new Alumno[100];
   }//fin constructor

    public boolean agregarMateria(String nombre, int maximoDeAlumnosPorGrupo)
    {
      boolean agrego = false;
      //COMPLETE
      Materia materia = new Materia(nombre, maximoDeAlumnosPorGrupo);
     for(int i=0;i<contadorMaterias;i++){
     if(this.materias[i]!=materia){
        
        this.materias[i]=new materia[contadorMateria++];
        agrego=true;
         
         
     }
     //if(this.materias[i]==materia) agrego=true;
     
    }
    
    return agrego;
    }//fin agregarMateria

    public boolean contieneMateria(Materia materia){
        boolean existe = false;
        //COMPLETE
        
        
        return existe;
    }

    public boolean agregarAlumno(String codigo, String nombres, String apellidos, int edad, float promedio)
    {
     boolean agrego = false;
     //COMPLETE
     Alumno alumno = new Alumno(codigo, nombres, apellidos, edad, promedio);
    for(int i=0;i<contadorAlumnos;i++){
    if(this.alumnos[i]!=alumno){
    }
    if(this.alumnos[i]==alumno) agrego=true;
    }
    return agrego;
   
    }//fin agregarAlumno

    public boolean contieneAlumno(Alumno alumno){
        boolean existe = false;
        //COMPLETE
        return existe;
    }

    /**Regresa el alumno en la posicion numero o null si no existe*/
    public Alumno getAlumno(int numero)
    {
      //COMPLETE
      return null;
    }//fin getAlumno

    /**Regresa el Materia en la posicion numero o null si no existe*/
    public Materia getMateria(int numero)
    {
      //COMPLETE
      return null;
    }//fin getMateria   
    
    /**
     * Elimina el alumno en la posicion numero.
     * Regresa el objeto eliminado si existe o NULL si no existe.
     * Reacomoda el arreglo para que todos los elementos queden contiguos y no queden vacios
     */
    public Alumno eliminarAlumno(int numero){
      //COMPLETE
      return null;
    }
    
     /**
     * Elimina la materia en la posicion numero.
     * Regresa el objeto eliminado si existe o NULL si no existe.
     * Reacomoda el arreglo para que todos los elementos queden contiguos y no queden vacios
     */
    public Materia eliminarMateria(int numero){
      //COMPLETE
      return null;
    }

}//fin class Universidad