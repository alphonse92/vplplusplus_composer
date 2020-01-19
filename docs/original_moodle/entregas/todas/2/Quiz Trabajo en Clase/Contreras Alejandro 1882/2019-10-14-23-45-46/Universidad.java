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
        this.materias= new Materia [MAX_MATERIAS];
        this.alumnos= new Alumno [MAX_ALUMNOS];
    }//fin constructor

    public boolean agregarMateria(String nombre, int maximoDeAlumnosPorGrupo)
    {
        boolean agrego = false;
        Materia x= new Materia(nombre , maximoDeAlumnosPorGrupo);
        if(!contieneMateria(x)&&contadorMaterias< MAX_MATERIAS)
        {
            materias[contadorMaterias++]= x;
            agrego= true;
        }
        return agrego;
    }//fin agregarMateria

    public boolean contieneMateria(Materia materia){
        boolean existe = false;
        for(int i=0; existe==false && i<materias.length; i++)
        {
            if(materias[i]!=null&&materias[i].equals(materia))
            {
                existe= true;
            }
        }
        return existe;
    }  

    public boolean agregarAlumno(String codigo, String nombres, String apellidos, int edad, float promedio)
    {
        boolean agrego = false;
        Alumno x= new Alumno(codigo , nombres, apellidos,edad,promedio);
        if(!contieneAlumno(x)&&contadorAlumnos< MAX_ALUMNOS)
        {
            alumnos[contadorAlumnos++]= x;
            agrego= true;
        }
        return agrego;
    }//fin agregarAlumno

    public boolean contieneAlumno(Alumno alumno){
        boolean existe = false;
        for(int i=0; i<alumnos.length;i++)
        {
            if(alumnos[i]!=null && alumnos[i].equals(alumno))
            {
                existe = true;
                break;
            }
        }
        return existe;
    }

    /**Regresa el alumno en la posicion numero o null si no existe*/
    public Alumno getAlumno(int numero)
    {
        if(numero > 0 && numero <= this.alumnos.length)
        {
            return this.alumnos[numero-1];
        }else 
            return null;
    }//fin getAlumno

    /**Regresa el Materia en la posicion numero o null si no existe*/
    public Materia getMateria(int numero)
    {
        if(numero > 0 && numero <= this.materias.length) 
        {
            return this.materias[numero-1];
        }else 
            return null;
    }//fin getMateria   

    /**
     * Elimina el alumno en la posicion numero.
     * Regresa el objeto eliminado si existe o NULL si no existe.
     * Reacomoda el arreglo para que todos los elementos queden contiguos y no queden vacios
     */
    public Alumno eliminarAlumno(int numero){
          Alumno x = null;
        if(alumnos[numero-1] != null)
        {
            x = alumnos[numero-1];
            alumnos[numero-1] = null;
            
            for(int i=numero-1; i<alumnos.length-1; i++)
            {
                this.alumnos[i] = this.alumnos[i+1];
            }
            this.alumnos[alumnos.length-1] = null;
            this.contadorAlumnos --;
        }
        return x;
    }

    /**
     * Elimina la materia en la posicion numero.
     * Regresa el objeto eliminado si existe o NULL si no existe.
     * Reacomoda el arreglo para que todos los elementos queden contiguos y no queden vacios
     */
    public Materia eliminarMateria(int numero){
        Materia x = null;
        if(materias[numero-1] != null)
        {
            x = materias[numero-1];
            materias[numero-1] = null;
            
            for(int i=numero-1; i<materias.length-1; i++)
            {
                this.materias[i] = this.materias[i+1];
            }
            this.materias[materias.length-1] = null;
            this.contadorMaterias --;
        }
        return x;
    }

}//fin class Universi