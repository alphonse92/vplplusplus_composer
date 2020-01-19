import java.util.ArrayList;

public class Campeonato
{
    ArrayList<Partido> partidos;
    ArrayList<Equipo> equipos;

    public Campeonato(){
        this.partidos = new ArrayList<Partido>();
        this.equipos = new ArrayList<Equipo>();
    }

    public boolean inscribirEquipo(String nombreEquipo){
        boolean rta = false;

        Equipo equipo = new Equipo(nombreEquipo); 
        if(buscarEquipo(nombreEquipo)==null){
            equipos.add(equipo);
            rta=true;
        }

        return rta;
    }

    public boolean registrarPartido(String nombreEquipoLocal, String nombreEquipoVisitante, 
    int golesEquipoLocal, int golesEquipoVisitante){
        boolean rta = false;
        Equipo local = new Equipo(nombreEquipoLocal);
        Equipo visitante = new Equipo(nombreEquipoVisitante);
        Partido partido = new Partido(local,visitante, golesEquipoLocal,golesEquipoVisitante);

        if(buscarEquipo(nombreEquipoLocal)!=null && buscarEquipo(nombreEquipoVisitante)!=null &&
            nombreEquipoLocal!=nombreEquipoVisitante){
            partidos.add(partido);
            rta=true;
        }

        return rta;
    }

    public Equipo buscarEquipo(String nombreEquipo){

        for(int i=0; i<equipos.size(); i++){
            if(this.equipos.get(i).nombreEquipo.equals(nombreEquipo)){
                return this.equipos.get(i);
            }
        }   
        return null;
    }

    public java.util.ArrayList<Equipo> getEquipos(){
        return equipos;
    }

    public java.util.ArrayList<Partido> getPartidos(){
        return partidos;
    }
}
