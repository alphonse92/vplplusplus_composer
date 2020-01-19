/*COMPLETE import*/
import java.util.*;

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
      Equipo nuevo = new Equipo(nombreEquipo);
      if(!this.equipos.contains(nuevo)){
         this.equipos.add(nuevo);
         rta = true;
      }
      return rta;/*COMPLETE*/
    }
    
    public boolean registrarPartido(String nombreEquipoLocal, String nombreEquipoVisitante, 
                                    int golesEquipoLocal, int golesEquipoVisitante){
      boolean rta = false;
      /*COMPLETE*/
      Equipo local = buscarEquipo(nombreEquipoLocal);
      Equipo visitante = buscarEquipo(nombreEquipoVisitante);
      Partido nuevo;
      if(local!=null && visitante!=null){
           nuevo = new Partido(local,visitante,golesEquipoLocal,golesEquipoVisitante);
          if(!this.partidos.contains((nuevo))){
             nuevo.registrarPartido();
              this.partidos.add(nuevo);
              rta=true;
            }
        }
      return rta;
    }
    
    public Equipo buscarEquipo(String nombreEquipo){
        //Equipo nuevo =null;
        Equipo aux=new Equipo(nombreEquipo);
        for(int i=0;i<equipos.size();i++){
            if(equipos.get(i).getNombreEquipo().equals(aux.getNombreEquipo())){
                return aux;
            }
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
