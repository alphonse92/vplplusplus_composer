
import java.util.ArrayList;
public class Campeonato
{
    private ArrayList <Equipo> equipos;
    private ArrayList <Partido> partidos;
    
    public Campeonato(){
     this.equipos = new ArrayList<Equipo>();
     this.partidos = new ArrayList<Partido>();
    }
    
    public boolean inscribirEquipo(String nombreEquipo){
      boolean rta = false;
        if(buscarEquipo(nombreEquipo) == null){
            Equipo equipo = new Equipo(nombreEquipo);
            equipos.add(equipo);
            rta = true;
        }
        return rta;
    }
    
    public boolean registrarPartido(String nombreEquipoLocal, String nombreEquipoVisitante, 
                                    int golesEquipoLocal, int golesEquipoVisitante){
      boolean rta = false;
      Equipo equipoL = buscarEquipo(nombreEquipoLocal);
      Equipo equipoV = buscarEquipo(nombreEquipoVisitante);   
      if(equipoL != null && equipoV != null && !equipoL.equals(equipoV)){
          Partido partido = new Partido(equipoL, equipoV, golesEquipoLocal, golesEquipoVisitante);
          if(!partidos.contains(partido)){
              partidos.add(partido);
              rta = true;
              partido.registrarPartido();
          }
      }
      return rta;
    }
    
    public Equipo buscarEquipo(String nombreEquipo){
      Equipo aux = null;
      for(int i = 0 ; i < equipos.size() && aux == null ; i++){
          if(equipos.get(i).getNombreEquipo().equals(nombreEquipo))
            aux = equipos.get(i);
      }
      return aux;
    }

    public java.util.ArrayList<Equipo> getEquipos(){
        return equipos;
    }

    public java.util.ArrayList<Partido> getPartidos(){
        return partidos;
    }
}
