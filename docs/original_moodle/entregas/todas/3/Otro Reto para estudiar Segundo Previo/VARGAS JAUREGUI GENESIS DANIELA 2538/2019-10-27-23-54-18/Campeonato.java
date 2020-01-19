import java.util.ArrayList;

public class Campeonato
{
    ArrayList<Equipo> equipos;
    ArrayList<Partido> partidos;
    public Campeonato(){
        this.equipos = new ArrayList<Equipo>();
        this.partidos = new ArrayList<Partido>();
    }

    public boolean inscribirEquipo(String nombreEquipo){
        boolean rta = false;
        if(buscarEquipo(nombreEquipo) == null) rta = true;
        Equipo equipoIns = new Equipo(nombreEquipo);
        this.equipos.add(equipoIns);
        return rta;
    }

    public boolean registrarPartido(String nombreEquipoLocal, String nombreEquipoVisitante, 
    int golesEquipoLocal, int golesEquipoVisitante){
        boolean rta = false;
        Equipo equipoLocalBuscado = buscarEquipo(nombreEquipoLocal);
        Equipo equipoVisitanteBuscado = buscarEquipo(nombreEquipoVisitante);
        if(equipoLocalBuscado == null || equipoVisitanteBuscado == null || nombreEquipoLocal.equals(nombreEquipoVisitante)) return rta;
        Partido partidoRegistrado = new Partido(equipoLocalBuscado, equipoVisitanteBuscado, golesEquipoLocal, golesEquipoVisitante);
        if(!partidos.contains(partidoRegistrado)){
            partidos.add(partidoRegistrado);
            partidoRegistrado.registrarPartido();
            rta = true;
        }
        return rta;
    }

    public Equipo buscarEquipo(String nombreEquipo){
        Equipo equipoBuscado = null;
        for(int i = 0; i < equipos.size(); i++) if(equipos.get(i).getNombreEquipo().equals(nombreEquipo)) return equipos.get(i);
        return null;
    }

    public ArrayList<Equipo> getEquipos(){
        return equipos;
    }

    public ArrayList<Partido> getPartidos(){
        return partidos;
    }
}
