/*COMPLETE import*/
import java.util.ArrayList;
public class Campeonato
{
    /*COMPLETE propiedades de Campeonato*/
    ArrayList<Equipo> listaEquipos;
    ArrayList<Partido> listaPartidos;
    public Campeonato(){
        /*COMPLETE*/
        listaEquipos = new ArrayList<Equipo>();
        listaPartidos = new ArrayList<Partido>();
    }

    public boolean inscribirEquipo(String nombreEquipo){
        boolean rta = false;
        Equipo e = new Equipo(nombreEquipo);
        if(!this.listaEquipos.contains(e)){
            rta=true;
            this.listaEquipos.add(e);
        }
        return rta;/*COMPLETE*/
    }

    public boolean registrarPartido(String nombreEquipoLocal, String nombreEquipoVisitante, 
                                    int golesEquipoLocal, int golesEquipoVisitante){
        boolean rta = false;
        Equipo l = buscarEquipo(nombreEquipoLocal);
        Equipo v = buscarEquipo(nombreEquipoVisitante);
        if(l!=null&&v!=null&&!l.equals(v)){
            Partido p = new Partido(l,v,golesEquipoLocal,golesEquipoVisitante);
            if(!listaPartidos.contains(p)){
                listaPartidos.add(p);
                rta = true;
                p.registrarPartido();
            }
        }
        return rta;
    }

    public Equipo buscarEquipo(String nombreEquipo){
        Equipo tmp = new Equipo(nombreEquipo);
        for(int i=0; i<listaEquipos.size(); i++){
            if(listaEquipos.get(i).getNombreEquipo().equals(tmp.getNombreEquipo()))
                return tmp;
        }
        return null;
    }


    public java.util.ArrayList<Equipo> getEquipos(){
        return listaEquipos;/*COMPLETE*/
    }

    public java.util.ArrayList<Partido> getPartidos(){
        return listaPartidos;/*COMPLETE*/
    }
}
