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
    protected Materia []materias;
    protected Alumno [] alumnos;
    protected int contadorMaterias;
    protected int contadorAlumnos;
    
    public Universidad()
    {
      //COMPLETE
      this.materias = new Materia[MAX_MATERIAS];
      this.alumnos = new Alumno[MAX_ALUMNOS];
      this.contadorAlumnos=0;
      this.contadorMaterias=0;
   }//fin constructor

    public boolean agregarMateria(String nombre, int maximoDeAlumnosPorGrupo)
    {
        boolean agrego = false;
        //COMPLETE
        Materia nueva = new Materia(nombre,maximoDeAlumnosPorGrupo);
        if(contadorMaterias<this.materias.length && !contieneMateria(nueva)){
        materias[contadorMaterias++]=nueva;
        agrego=true;
        }
        return agrego;
    }//fin agregarMateria

    public boolean contieneMateria(Materia materia){
        boolean existe = false;
        //COMPLETE
        for(int i=0; !existe && i<contadorMaterias;i++){
              existe=materias[i].equals(materia);
          }
           return existe;

    }

    public boolean agregarAlumno(String codigo, String nombres, String apellidos, int edad, float promedio)
    {
        boolean agrego = false;
        //COMPLETE
        Alumno nuevo = new Alumno(codigo,nombres,apellidos,edad,promedio);
        if(contadorAlumnos<alumnos.length && !contieneAlumno(nuevo)){
            this.alumnos[contadorAlumnos++] = nuevo;
            agrego=true;
        }
        return agrego;
        
    }//fin agregarAlumno
    
    public boolean contieneAlumno(Alumno alumno){
        boolean existe = false;
        //COMPLETE
        for(int i=0; i<this.alumnos.length;i++){
         if(alumnos[i] != null && alumnos[i].equals(alumno) ){
          existe=true;    
          }
        }
        return existe;
     
    }

    /**Regresa el alumno en la posicion numero o null si no existe*/
    public Alumno getAlumno(int numero)
    {
      //COMPLETE
     if(numero>0 && numero<=this.contadorAlumnos)
      return this.alumnos[numero-1];
      else
      return null;
    }//fin getAlumno

    /**Regresa el Materia en la posicion numero o null si no existe*/
    public Materia getMateria(int numero)
    {
      //COMPLETE
      if(numero>0 && numero<=this.contadorMaterias)
      return this.materias[numero-1];
      else
      return null;
    }//fin getMateria   
    
    /**
     * Elimina el alumno en la posicion numero.
     * Regresa el objeto eliminado si existe o NULL si no existe.
     * Reacomoda el arreglo para que todos los elementos queden contiguos y no queden vacios
     */
    public Alumno eliminarAlumno(int numero){
      //COMPLETE
      Alumno a = getAlumno(numero);
      if(a!=null){
            for(int i =numero-1;i<this.contadorAlumnos-1;i++){
            alumnos[i]=alumnos[i+1];
            }
            alumnos[contadorAlumnos-1]=null;
            contadorAlumnos--;
        }
        return a;
    }
    
     /**
     * Elimina la materia en la posicion numero.
     * Regresa el objeto eliminado si existe o NULL si no existe.
     * Reacomoda el arreglo para que todos los elementos queden contiguos y no queden vacios
     */
    public Materia eliminarMateria(int numero){
      //COMPLETE
       Materia a = getMateria(numero);
       if(a!=null){
           for(int i=numero-1;i<this.contadorMaterias-1;i++){
            materias[i]=materias[i+1];
            }
            materias[contadorMaterias-1]=null;
            contadorMaterias--;
    }
    return a;
}//fin class Universidad
}