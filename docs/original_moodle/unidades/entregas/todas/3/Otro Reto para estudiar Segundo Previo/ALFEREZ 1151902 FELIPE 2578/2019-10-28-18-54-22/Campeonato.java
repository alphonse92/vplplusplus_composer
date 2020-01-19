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
        Equipo e = buscarEquipo(nombreEquipo);
        if(e==null){//if(!listaEquipos.contains(e))
            listaEquipos.add(e);
            rta=true;
        }
        return rta;/*COMPLETE*/
    }

    public boolean registrarPartido(String nombreEquipoLocal, String nombreEquipoVisitante, 
                                    int golesEquipoLocal, int golesEquipoVisitante){
        boolean rta = false;
        Equipo local = buscarEquipo(nombreEquipoLocal);
        Equipo visitante = buscarEquipo(nombreEquipoVisitante);
        if(local!=null && visitante!=null && local.equals(visitante)){
            Partido p = new Partido(local, visitante, golesEquipoLocal, golesEquipoVisitante);
            if(!listaPartidos.contains(p)){
                rta=true;
                listaPartidos.add(p);
            }
        }
        return rta;
    }

    public Equipo buscarEquipo(String nombreEquipo){
        Equipo e = new Equipo(nombreEquipo);
        for(int i=0; i<listaEquipos.size() && listaEquipos.get(i)!=null; i++)
            if(listaEquipos.get(i).equals(e.getNombreEquipo()))
                return e;
        return null;
    }

    public java.util.ArrayList<Equipo> getEquipos(){
        return listaEquipos;/*COMPLETE*/
    }

    public java.util.ArrayList<Partido> getPartidos(){
        return listaPartidos;/*COMPLETE*/
    }
}
