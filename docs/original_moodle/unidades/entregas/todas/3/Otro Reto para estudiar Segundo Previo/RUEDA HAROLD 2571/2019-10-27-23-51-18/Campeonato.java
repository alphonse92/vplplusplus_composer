import java.util.ArrayList;

public class Campeonato
{
    private ArrayList<Equipo> equipos;
    private ArrayList<Partido> partidos;

    public Campeonato(){
        equipos = new ArrayList<Equipo>();
        partidos = new ArrayList<Partido>();
    }

    public boolean inscribirEquipo(String nombreEquipo){
        boolean rta = false;
        Equipo x = buscarEquipo(nombreEquipo);
        if(x==null){
            Equipo e = new Equipo(nombreEquipo);
            equipos.add(e);
            rta = true;
        }
        return rta;
    }

    public boolean registrarPartido(String nombreEquipoLocal, String nombreEquipoVisitante, 
    int golesEquipoLocal, int golesEquipoVisitante){
        boolean rta = false;
        Equipo l = buscarEquipo(nombreEquipoLocal);
        Equipo v = buscarEquipo(nombreEquipoVisitante);
        if(l!=null&&v!=null&&!l.equals(v)){
            Partido p = new Partido(l,v,golesEquipoLocal,golesEquipoVisitante);
            if(!partidos.contains(p)){
                partidos.add(p);
                rta = true;
                p.registrarPartido();
            }
        }
        return rta;
    }

    public Equipo buscarEquipo(String nombreEquipo){
        Equipo tmp = null;
        for(int i=0;i<equipos.size()&&tmp==null;i++){
            if(equipos.get(i).getNombreEquipo().equals(nombreEquipo)){
                tmp = equipos.get(i);
            }
        }
        return tmp;
    }

    public java.util.ArrayList<Equipo> getEquipos(){
        return equipos;
    }

    public java.util.ArrayList<Partido> getPartidos(){
        return partidos;
    }
}
