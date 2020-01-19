import java.util.ArrayList;

public class Campeonato
{
    private ArrayList <Partido> partidos;
    private ArrayList <Equipo> equipos;

    public Campeonato(){
        partidos = new ArrayList();
        equipos = new ArrayList();
    }

    public boolean inscribirEquipo(String nombreEquipo){
        Equipo equipo = buscarEquipo(nombreEquipo);
        if(equipo == null){
            Equipo nuevo = new Equipo(nombreEquipo);
            equipos.add(nuevo);
            return true;
        }
        else return false;
    }

    public boolean registrarPartido(String nombreEquipoLocal, String nombreEquipoVisitante, 
    int golesEquipoLocal, int golesEquipoVisitante){
        Equipo equipoL = buscarEquipo(nombreEquipoLocal);
        Equipo equipoV = buscarEquipo(nombreEquipoVisitante);
        if(equipoL != null && equipoV != null && !(equipoL.equals(equipoV))){
            Partido partido = new Partido(equipoL, equipoV, golesEquipoLocal, golesEquipoVisitante);
            boolean encontrado = false;
            for(int i = 0; i<partidos.size() && !encontrado; i++){
                if(partidos.get(i).equals(partido)) encontrado = true;
            }
            
            if(!encontrado){
                partido.registrarPartido();
                partidos.add(partido);                
                return true;
            }
        }
        return false;
    }

    public Equipo buscarEquipo(String nombreEquipo){
        int posicion = -1;
        for(int i = 0; i<equipos.size() && posicion == -1; i++){
            if(equipos.get(i) != null)
                if(equipos.get(i).getNombreEquipo().equals(nombreEquipo)) posicion = i;
        }
        if(posicion != -1) return equipos.get(posicion);
        else return null;
    }

    public java.util.ArrayList<Equipo> getEquipos(){
        return this.equipos;
    }

    public java.util.ArrayList<Partido> getPartidos(){
        return this.partidos;
    }
}
