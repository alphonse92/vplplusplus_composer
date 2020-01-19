/*COMPLETE import*/
import java.util.ArrayList;

public class Campeonato
{
    /*COMPLETE propiedades de Campeonato*/
    ArrayList<Partido> partidos;
    ArrayList<Equipo> equipos;
    
    public Campeonato(){
        partidos = new ArrayList<Partido>();
        equipos = new ArrayList<Equipo>();
     /*COMPLETE*/
    }
    
    public boolean inscribirEquipo(String nombreEquipo){
      boolean rta = false;
        if(buscarEquipo(nombreEquipo) == null){
            Equipo equipo = new Equipo(nombreEquipo);
            equipos.add(equipo);
            rta = true;
        }      
      return rta;/*COMPLETE*/
    }
    
    public boolean registrarPartido(String nombreEquipoLocal, String nombreEquipoVisitante, 
                                    int golesEquipoLocal, int golesEquipoVisitante){
      boolean rta = false;
      if(buscarEquipo(nombreEquipoLocal) == null || buscarEquipo(nombreEquipoVisitante) == null || nombreEquipoLocal.equals(nombreEquipoVisitante)) return rta;
      
      Partido partido = new Partido(buscarEquipo(nombreEquipoLocal), buscarEquipo(nombreEquipoVisitante),
                            golesEquipoLocal, golesEquipoVisitante);
      
      if(!partidos.contains(partido)){
          partidos.add(partido);
          partido.registrarPartido();
          rta = true;
        }
      /*boolean esta = false;
      for(int i = 0; !esta && i < partidos.size(); i++)
          if(partidos.get(i).equals(partido)) esta = true;
          
      if(!esta){
          partidos.add(partido);
          partido.registrarPartido();
          rta= true;
        }*/
      
      /*COMPLETE*/
      return rta;
    }
    
    public Equipo buscarEquipo(String nombreEquipo){
      for(int i = 0; i < equipos.size(); i++)
          if(equipos.get(i).getNombreEquipo().equals(nombreEquipo)) return equipos.get(i);        
      return null;/*COMPLETE*/
    }

    public java.util.ArrayList<Equipo> getEquipos(){
        return equipos;/*COMPLETE*/
    }

    public java.util.ArrayList<Partido> getPartidos(){
        return partidos;/*COMPLETE*/
    }
}
