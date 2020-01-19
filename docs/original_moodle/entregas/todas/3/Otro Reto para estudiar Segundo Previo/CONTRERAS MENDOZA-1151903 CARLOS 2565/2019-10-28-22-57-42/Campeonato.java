import java.util.ArrayList;

public class Campeonato
{
    ArrayList<Equipo> equipos;
    ArrayList<Partido> partidos;
    
    public Campeonato(){
       equipos = new ArrayList<Equipo>();
       partidos = new ArrayList<Partido>();
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
        return rta;
    }
    
    public boolean registrarPartido(String nombreEquipoLocal, String nombreEquipoVisitante, 
                                    int golesEquipoLocal, int golesEquipoVisitante){
      boolean rta = false;
      /*COMPLETE*/
      return rta;
    }
    
    public Equipo buscarEquipo(String nombreEquipo){
        Equipo equipo = new Equipo(nombreEquipo);
        for(int i = 0; i < equipos.size() && equipos.get(i)!=null; i++){
            if(equipos.get(i).nombreEquipo.equals(nombreEquipo))
            return equipo;
            }
       return null;
    }

    public java.util.ArrayList<Equipo> getEquipos(){
        return equipos;/*COMPLETE*/
    }

    public java.util.ArrayList<Partido> getPartidos(){
        return partidos;/*COMPLETE*/
    }
}
