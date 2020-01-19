 

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
       materias = new Materia[MAX_MATERIAS];
       alumnos = new Alumno[MAX_ALUMNOS];
       contadorMaterias = 0;
       contadorAlumnos = 0;
   }//fin constructor

    public boolean agregarMateria(String nombre, int maximoDeAlumnosPorGrupo)
    {
    boolean agrego = false;
    Materia materia= new Materia (nombre, maximoDeAlumnosPorGrupo);
     
    if(contadorMaterias<this.materias.length && !contieneMateria(materia)){
       this.materias[contadorMaterias++] = materia;
       agrego=true;
     }
    return agrego;//fin agregarMateria
    }

    public boolean contieneMateria(Materia materia){
       boolean existe = false;
       for(int i=0;i<contadorMaterias && !existe;i++){
         if(materias[i].nombre.equals(materia.nombre)){
         existe=true;
         break;
         }
       }
       return existe;
    }

    public boolean agregarAlumno(String codigo, String nombres, String apellidos, int edad, float promedio)
    {
      
        boolean agrego=false;
         Alumno alumno= new Alumno (codigo, nombres, apellidos, edad, promedio);
         if(contadorAlumnos<this.alumnos.length && !contieneAlumno(alumno)){
         alumnos[contadorAlumnos++] = alumno;
         agrego=true;
        }
        return agrego;
    }//fin agregarAlumno

    public boolean contieneAlumno(Alumno alumno){
    boolean existe = false; 
    for(int i=0; i<contadorAlumnos && !existe;i++){
      if(alumnos[i].codigo.equals(alumno.codigo) || (alumnos[i].nombres.equals(alumno.nombres)
         && alumnos[i].apellidos.equals(alumno.apellidos))){
        existe = true;
        break;
      }
    }
    return existe;
    }

    /**Regresa el alumno en la posicion numero o null si no existe*/
    public Alumno getAlumno(int numero)
    {
     if(numero > 0 && numero <= this.alumnos.length){
      numero=numero-1;
      return this.alumnos[numero];
     }else 
      return null;
    }//fin getAlumno

    /**Regresa el Materia en la posicion numero o null si no existe*/
    public Materia getMateria(int numero)
    {
     if(numero > 0 && numero <= this.materias.length){
      numero=numero-1;
      return this.materias[numero];
     }else 
      return null;
    }//fin getMateria   
    
    /**
     * Elimina el alumno en la posicion numero.
     * Regresa el objeto eliminado si existe o NULL si no existe.
     * Reacomoda el arreglo para que todos los elementos queden contiguos y no queden vacios
     */
    public Alumno eliminarAlumno(int numero){
      if(getAlumno(numero) == null) 
       return null;
      Alumno eliminado = getAlumno(numero);
      alumnos[numero-1] = null;
      Alumno[] tmp = new Alumno[alumnos.length];
      for(int i=0, j=0; i < alumnos.length; i++) {
          if(alumnos[i] != null){
              tmp[j] = alumnos[i];
              j++;
            }
        }
      this.alumnos = tmp;
           
      contadorAlumnos--;
      return eliminado;
    }
    
     /**
     * Elimina la materia en la posicion numero.
     * Regresa el objeto eliminado si existe o NULL si no existe.
     * Reacomoda el arreglo para que todos los elementos queden contiguos y no queden vacios
     */
    public Materia eliminarMateria(int numero){
      if(getMateria(numero) == null) 
      return null;
      Materia eliminado = getMateria(numero);
      materias[numero-1] = null;
      Materia[] tmp = new Materia[materias.length];
      for(int i=0, j=0; i < materias.length; i++) {
          if(materias[i] != null){
              tmp[j] = materias[i];
              j++;
            }
        }
      this.materias = tmp;
           
      contadorMaterias--;
      return eliminado;
    }

}//fin class Universidad