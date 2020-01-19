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
        Equipo l = new Equipo(nombreEquipoLocal);
        Equipo v = new Equipo(nombreEquipoVisitante);
        if(this.listaEquipos.contains(l) && this.listaEquipos.contains(v)){
            Partido unPartido = new Partido(l, v, golesEquipoLocal, golesEquipoVisitante);
            if(!listaPartidos.contains(unPartido)){
                rta=true;
                listaPartidos.add(unPartido);
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
