/*COMPLETE import*/
import java.util.ArrayList;

public class Campeonato
{
    ArrayList <Equipo> equipos = new ArrayList<Equipo>();
    ArrayList <Partido> partidos = new ArrayList<Partido>();
    /*COMPLETE propiedades de Campeonato*/

    public Campeonato(){
        /*COMPLETE*/
    }

    public boolean inscribirEquipo(String nombreEquipo){
        boolean rta = true;
        Equipo equipo = new Equipo(nombreEquipo);
        for(int i=0; i<equipos.size();i++){
            if(this.equipos.get(i).getNombreEquipo().equals(nombreEquipo))rta=false;
        }
        if(rta == true){
            this.equipos.add(equipo);
        }
        return rta;/*COMPLETE*/
    }

    public boolean registrarPartido(String nombreEquipoLocal, String nombreEquipoVisitante, 
    int golesEquipoLocal, int golesEquipoVisitante){
        boolean rta = false;
        /*COMPLETE*/
        return rta;
    }

    public Equipo buscarEquipo(String nombreEquipo){
        Equipo equipo = new Equipo(nombreEquipo);
        int posicion=-1;
        for(int i=0; i<equipos.size();i++){
            if(equipos.get(i).getNombreEquipo().equals(nombreEquipo))posicion = i;
        }
        if(posicion == -1) equipo = null;
        else equipo = equipos.get(posicion);
        return equipo;/*COMPLETE*/
    }

    public java.util.ArrayList<Equipo> getEquipos(){
        return equipos;/*COMPLETE*/
    }

    public java.util.ArrayList<Partido> getPartidos(){
        return partidos;/*COMPLETE*/
    }
}
