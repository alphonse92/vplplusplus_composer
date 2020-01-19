
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
    protected Materia materias[];
    protected Alumno alumnos[];
    protected int contadorMaterias;
    protected int contadorAlumnos;

    public Universidad()
    {
        //COMPLETE
        materias = new Materia[MAX_MATERIAS];
        alumnos = new Alumno[MAX_ALUMNOS];
    }//fin constructor

    public boolean agregarMateria(String nombre, int maximoDeAlumnosPorGrupo)
    {
        boolean agrego = false;
        //COMPLETE
        Materia materia = new Materia(nombre, maximoDeAlumnosPorGrupo);
        if(!contieneMateria(materia) && contadorMaterias<MAX_MATERIAS){
            agrego=true;
            materias[contadorMaterias++]=materia;
        }
        return agrego;
    }//fin agregarMateria

    public boolean contieneMateria(Materia materia){
        boolean existe = false;
        //COMPLETE
        for(int i=0; i<materias.length && materias[i]!=null; i++){
            if(materia.nombre.equals(materias[i].nombre)){
                existe=true;
                //break;
            }
        }
        return existe;
    }

    public boolean agregarAlumno(String codigo, String nombres, String apellidos, int edad, float promedio)
    {
        boolean agrego = false;
        //COMPLETE
        Alumno a = new Alumno(codigo, nombres, apellidos, edad, promedio);
        int i=0;
        if(!contieneAlumno(a) && contadorAlumnos<MAX_ALUMNOS){
            agrego=true;
            this.alumnos[contadorAlumnos++]=a;
        }
        return agrego;
    }//fin agregarAlumno

    public boolean contieneAlumno(Alumno alumno){
        boolean existe = false;
        //COMPLETE
        for(int i=0; i<alumnos.length && alumnos[i]!=null; i++){
            if(alumno.codigo.equals(alumnos[i].codigo) || alumno.nombres.equals(alumnos[i].nombres) &&
            alumno.apellidos.equals(alumnos[i].apellidos)){
                existe=true;
                //break;
            }
        }
        return existe;
    }

    /**Regresa el alumno en la posicion numero o null si no existe*/
    public Alumno getAlumno(int numero)
    {
        //COMPLETE
        if(numero>0 && numero<alumnos.length) 
            return alumnos[numero-1];
        else
            return null;
    }//fin getAlumno

    /**Regresa el Materia en la posicion numero o null si no existe*/
    public Materia getMateria(int numero)
    {
        //COMPLETE
        if(numero>0 && numero<materias.length)
            return materias[numero-1];
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
        Alumno a = alumnos[numero-1];
        for(int i=numero-1; i<alumnos.length-1 && alumnos[i+1]!=null; i++)
            alumnos[i]=alumnos[i+1];
            
        if(a!=null){
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
        Materia a = materias[numero-1];
        for(int i=numero-1; i<materias.length-1 && materias[i+1]!=null; i++)
            materias[i]=materias[i+1];
            
        if(a!=null){
            materias[contadorMaterias-1]=null;
            contadorMaterias--;
        }
        return a;
    }

}//fin class Universidad