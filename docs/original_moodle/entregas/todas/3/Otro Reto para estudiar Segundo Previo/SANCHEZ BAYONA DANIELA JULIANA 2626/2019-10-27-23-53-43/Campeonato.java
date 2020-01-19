/*COMPLETE import*/
import java.util.ArrayList;

public class Campeonato
{
    /*COMPLETE propiedades de Campeonato*/
    private ArrayList<Equipo> equipos;
    private ArrayList<Partido> partidos;
    
    
    public Campeonato(){
       equipos = new ArrayList<Equipo>();
       partidos=new ArrayList<Partido>();
       /*COMPLETE*/
    }
    
    public boolean inscribirEquipo(String nombreEquipo){
      boolean rta = false;
      Equipo equipo=new Equipo (nombreEquipo);
      if(!this.equipos.contains(equipo)){
          this.equipos.add(equipo);
          rta=true;
        }
      return rta;
      /*COMPLETE*/
    }
    
  
    public boolean registrarPartido(String nombreEquipoLocal, String nombreEquipoVisitante, 
                                    int golesEquipoLocal, int golesEquipoVisitante){
      boolean rta = false;
      /*COMPLETE*/
      return rta;
      
    }
    
    public Equipo buscarEquipo(String nombreEquipo){
       return null;
    }

    public java.util.ArrayList<Equipo> getEquipos(){
        return equipos;
        /*COMPLETE*/
        
    }

    public java.util.ArrayList<Partido> getPartidos(){
        return partidos;
        /*COMPLETE*/
    }
}
