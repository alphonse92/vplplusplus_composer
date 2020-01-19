import java.util.ArrayList;
/*COMPLETE import*/
public class Campeonato
{
    public ArrayList<Equipo> equipos = new ArrayList<Equipo>();
    public ArrayList<Partido> partidos = new ArrayList<Partido>();
    /*COMPLETE propiedades de Campeonato*/
    
    public Campeonato(){
        equipos = new ArrayList<Equipo>();
        partidos = new ArrayList<Partido>();
     /*COMPLETE*/
    }
    
    public boolean inscribirEquipo(String nombreEquipo){
      if (buscarEquipo(nombreEquipo) != null) return false;
      Equipo obj = new Equipo();
      obj.nombreEquipo = nombreEquipo;
      equipos.add(obj);
      return true;/*COMPLETE*/
    }
    
    public boolean registrarPartido(String nombreEquipoLocal, String nombreEquipoVisitante, 
                                    int golesEquipoLocal, int golesEquipoVisitante){
      boolean rta = false;
      if (buscarEquipo(nombreEquipoLocal) == null || buscarEquipo(nombreEquipoVisitante) == null || nombreEquipoLocal == nombreEquipoVisitante) return false;
      Partido obj = new Partido(buscarEquipo(nombreEquipoLocal), buscarEquipo(nombreEquipoVisitante) ,
                                golesEquipoLocal, golesEquipoVisitante);
                                
      if(!partidos.contains(obj)){
          partidos.add(obj);
          obj.registrarPartido();
          rta = true;
        }
      /**boolean esta = false;
      for(int i = 0; !esta && i < partidos.size() ; ++i){
          if(partidos.get(i).equals(obj)) esta = true;
          
          if (!esta){
              partidos.add(obj);
              obj.registrarPartido();
              rta = true;
            }
        }**/
      /*COMPLETE*/
      return rta;
    }
    
    public Equipo buscarEquipo(String nombreEquipo){
        for (int i = 0 ; i < equipos.size() ; ++i ){
            if (equipos.get(i).nombreEquipo == nombreEquipo) return equipos.get(i);
        }
      return null;/*COMPLETE*/
    }

    public java.util.ArrayList<Equipo> getEquipos(){
        return this.equipos;/*COMPLETE*/
    }

    public java.util.ArrayList<Partido> getPartidos(){
        return this.partidos;/*COMPLETE*/
    }
}
