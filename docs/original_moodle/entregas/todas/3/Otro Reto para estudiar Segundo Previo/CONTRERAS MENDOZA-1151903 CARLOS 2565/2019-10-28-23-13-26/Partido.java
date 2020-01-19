public class Partido
{
    private Equipo local;
    private Equipo visitante;
    int golesEquipoLocal;
    int golesEquipoVisitante;
    public Partido(Equipo local, Equipo visitante, 
                    int golesEquipoLocal, int golesEquipoVisitante){
    local = local;
     visitante = visitante;
     this.golesEquipoLocal = golesEquipoLocal;
     this.golesEquipoVisitante = golesEquipoVisitante;;
    }
    
    public void registrarPartido(){
  local.registrarPartido(golesEquipoLocal,golesEquipoVisitante,true);
        visitante.registrarPartido(golesEquipoVisitante,golesEquipoLocal,false);
    }
    
    public boolean equals(Object otro){
     if(otro instanceof Partido) return this.local.getNombreEquipo().equals(((Partido)otro).local.getNombreEquipo()) && 
                                           this.visitante.getNombreEquipo().equals(((Partido)otro).visitante.getNombreEquipo()); 
        return false;/*COMPLETE*/
    }

    public int getGolesEquipoLocal(){
        return golesEquipoLocal;/*COMPLETE*/
    }

    public int getGolesEquipoVisitante(){
        return golesEquipoVisitante;/*COMPLETE*/
    }
}
