
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
        //COMPLETE
    }//fin constructor

    public boolean agregarMateria(String nombre, int maximoDeAlumnosPorGrupo)
    {
        boolean agrego = false;
        Materia materia= new Materia (nombre, maximoDeAlumnosPorGrupo);

        if(contadorMaterias < this.materias.length && !contieneMateria(materia)){
            this.materias[contadorMaterias++] = materia;
            return true;
        }
        return agrego;//fin agregarMateria
    }//fin agregarMateria

    public boolean contieneMateria(Materia materia){
        boolean existe = false;
        for(int i = 0; i < contadorMaterias && !existe; i++) existe = materias[i].nombre.equals(materia.nombre);               
        //COMPLETE
        return existe;
    }

    public boolean agregarAlumno(String codigo, String nombres, String apellidos, int edad, float promedio)
    {
        boolean agrego = true;
        Alumno nuevo = new Alumno(codigo, nombres, apellidos, edad, promedio);
        if(contieneAlumno(nuevo) || contadorAlumnos == MAX_ALUMNOS) agrego = false;
        else alumnos[contadorAlumnos++] = nuevo;                   
        //COMPLETE
        return agrego;
    }//fin agregarAlumno

    public boolean contieneAlumno(Alumno alumno){
        boolean existe = false;
        for(int i = 0; i < contadorAlumnos && !existe; i++){
            existe = alumnos[i].codigo.equals(alumno.codigo) || (alumnos[i].nombres.equals(alumno.nombres)
                && alumnos[i].apellidos.equals(alumno.apellidos));
        }
        //COMPLETE
        return existe;
    }

    /**Regresa el alumno en la posicion numero o null si no existe*/
    public Alumno getAlumno(int numero)
    {
        //COMPLETE
        if(numero > 0 && numero <= this.alumnos.length) return this.alumnos[numero-1];
        else return null;
    }//fin getAlumno

    /**Regresa el Materia en la posicion numero o null si no existe*/
    public Materia getMateria(int numero)
    {
        //COMPLETE
        if(numero > 0 && numero <= this.materias.length) return this.materias[numero-1];
        else return null;
    }//fin getMateria   

    /**
     * Elimina el alumno en la posicion numero.
     * Regresa el objeto eliminado si existe o NULL si no existe.
     * Reacomoda el arreglo para que todos los elementos queden contiguos y no queden vacios
     */
    public Alumno eliminarAlumno(int numero){
        //COMPLETE
        if(getAlumno(numero) == null) return null;
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
        //COMPLETE
        if(getMateria(numero) == null) return null;
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