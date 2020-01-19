/*COMPLETE import*/
import java.util.ArrayList;

public class Campeonato
{
    /*COMPLETE propiedades de Campeonato*/
    private ArrayList<Equipo> equipos;
    private ArrayList<Partido> partidos;
    
    public Campeonato(){
      /*COMPLETE*/
      equipos = new ArrayList<Equipo>();
      partidos = new ArrayList<Partido>();
    }
    
    public boolean inscribirEquipo(String nombreEquipo){
      boolean rta = false;
      Equipo tmp = buscarEquipo(nombreEquipo);
      if(tmp==null){
         Equipo e = new Equipo(nombreEquipo);
         equipos.add(e);
         rta = true;
        }
      return rta;/*COMPLETE*/
    }
    
    public boolean registrarPartido(String nombreEquipoLocal, String nombreEquipoVisitante, 
                                    int golesEquipoLocal, int golesEquipoVisitante){
      boolean rta = false;
      /*COMPLETE*/
      Equipo l = buscarEquipo(nombreEquipoLocal);
      Equipo v = buscarEquipo(nombreEquipoVisitante);
       if(l!=null&&v!=null&&!l.equals(v)){
           Partido p = new Partido(l,v,golesEquipoLocal,golesEquipoVisitante);
           if(!partidos.contains(p)){
               partidos.add(p);
               p.registrarPartido();
               rta = true;
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
        return tmp;/*COMPLETE*/
    }

    public java.util.ArrayList<Equipo> getEquipos(){
        return equipos;/*COMPLETE*/
    }

    public java.util.ArrayList<Partido> getPartidos(){
        return partidos;/*COMPLETE*/
    }
}
