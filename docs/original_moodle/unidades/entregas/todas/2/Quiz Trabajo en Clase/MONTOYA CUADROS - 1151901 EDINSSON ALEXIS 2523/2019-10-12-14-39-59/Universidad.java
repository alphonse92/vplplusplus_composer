
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
        materias = new Materia[10];
        alumnos = new Alumno[100];
        rellenarArrelgos();
        this.contadorAlumnos = 0;
        this.contadorMaterias = 0;
        //COMPLETE
    }//fin constructor

    public void rellenarArrelgos(){
        Materia materia = new Materia(null, 0);
        for(int i = 0; i < 10; i++){
            materias[i] = materia;
        }

        Alumno alumno = new Alumno(null, null, null, 0, 0f);
        for(int i = 0; i < 100; i++){
            alumnos[i] = alumno;
        }
    }

    public boolean agregarMateria(String nombre, int maximoDeAlumnosPorGrupo)
    {
        Materia materia = new Materia(nombre, maximoDeAlumnosPorGrupo);
        boolean agrego = true;
        for(int i = 0; i < 10; i++){
            if(materias[i].nombre == nombre)agrego=false;
        }
        if(agrego == true && contadorMaterias<10){
            this.materias[contadorMaterias] = materia;
            contadorMaterias++;
        }
        //COMPLETE
        return agrego && contadorMaterias<10;
    }//fin agregarMateria

    public boolean contieneMateria(Materia materia){
        boolean existe = false;
        for(int i = 0; i < 10; i++){
            if(materias[i].nombre == materia.nombre) existe = true;
        }
        //COMPLETE
        return existe;
    }

    public boolean agregarAlumno(String codigo, String nombres, String apellidos, int edad, float promedio)
    {
        Alumno alumno = new Alumno(codigo, nombres, apellidos, edad, promedio);
        boolean agrego = true;
        for(int i = 0; i < 10; i++){
            if((alumnos[i].nombres == nombres && alumnos[i].apellidos == apellidos) || alumnos[i].codigo == codigo)agrego=false;
        }
        if(agrego == true && contadorAlumnos<100){
            this.alumnos[contadorAlumnos] = alumno;
            contadorAlumnos++;
        }
        //COMPLETE
        return agrego && contadorAlumnos<100;
    }//fin agregarAlumno

    public boolean contieneAlumno(Alumno alumno){
        boolean existe = false;
        for(int i = 0; i < 100; i++){
            if((alumnos[i].nombres == alumno.nombres && alumnos[i].apellidos == alumno.apellidos) || alumnos[i].codigo == alumno.codigo) existe = true;
        }
        //COMPLETE
        return existe;
    }

    /**Regresa el alumno en la posicion numero o null si no existe*/
    public Alumno getAlumno(int numero)
    {
        if(numero>0 && numero<=contadorMaterias) return alumnos[numero];
        else return null;
        //COMPLETE
    }//fin getAlumno

    /**Regresa el Materia en la posicion numero o null si no existe*/
    public Materia getMateria(int numero)
    {
        if(numero>0 && numero<=contadorMaterias) return materias[numero];
        else return null;
        //COMPLETE
    }//fin getMateria   

    /**
     * Elimina el alumno en la posicion numero.
     * Regresa el objeto eliminado si existe o NULL si no existe.
     * Reacomoda el arreglo para que todos los elementos queden contiguos y no queden vacios
     */
    public Alumno eliminarAlumno(int numero){
        alumnos[numero] = null;
        for(int i=numero; i<alumnos.length-1; i++){
            alumnos[i] = alumnos[i+1];
        }
        return null;
        //COMPLETE
    }

    /**
     * Elimina la materia en la posicion numero.
     * Regresa el objeto eliminado si existe o NULL si no existe.
     * Reacomoda el arreglo para que todos los elementos queden contiguos y no queden vacios
     */
    public Materia eliminarMateria(int numero){
        materias[numero] = null;
        for(int i=numero; i<materias.length-1; i++){
            materias[i] = materias[i+1];
        }
        //COMPLETE
        return null;
    }

}//fin class Universidad