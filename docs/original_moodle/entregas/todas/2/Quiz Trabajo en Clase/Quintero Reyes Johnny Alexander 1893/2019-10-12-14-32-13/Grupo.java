 

import java.util.ArrayList;

/**
 * Escriba en lenguaje natural una descripcion de los objetos
 * que caben en el concepto de la clase Grupo.
 * 
 * @author (Milton Jes&uacute;s Vera Contreras - miltonjesusvc@ufps.edu.co) 
 * @version Math.sin(Math.PI-Double.MIN_VALUE) :) 
 */
public class Grupo
{
  protected Alumno[] alumnos;
  protected Materia materia;
  protected int contadorDeAlumnos;
  
  public Grupo(Materia materia)
  {
    //COMPLETE
    this.alumnos = new Alumno[materia.getMaximoDeAlumnosPorGrupo()];
     this.materia=materia;
  }//fin construuctor
  
  public boolean agregarAlumno(Alumno alumno)
  {
    boolean puedeAgregar = false;
    if(getContadorDeAlumnos() < alumnos.length && !contieneAlumno(alumno)) {
        puedeAgregar=true;
    alumnos[contadorDeAlumnos++]=alumno;
    
}
    return puedeAgregar;
  }//fin agregarAlumno
  
  public boolean contieneAlumno(Alumno alumno){
    boolean rta = false; 
    for(int i=0;i<alumnos.length;i++){
        if(alumnos[i]!=null&&alumnos[i].equals(alumno)){
         rta=true;   
         break;
        }
        
    }
    return rta;
  }
  
    /**Metodo de modificacion a la propiedad contadorDeAlumnos*/
    public void setContadorDeAlumnos(int contadorDeAlumnos){
        this.contadorDeAlumnos = contadorDeAlumnos;
    }//end method setContadorDeAlumnos

    /**Metodo de acceso a la propiedad contadorDeAlumnos*/
    public int getContadorDeAlumnos(){
        return this.contadorDeAlumnos;
    }//end method getContadorDeAlumnos


}//fin class Grupo