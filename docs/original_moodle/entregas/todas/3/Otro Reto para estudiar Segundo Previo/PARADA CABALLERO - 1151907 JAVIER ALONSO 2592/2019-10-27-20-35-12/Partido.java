public class Partido
{
    Equipo local;
    Equipo visitante;
    int golesEquipoLocal;
    int golesEquipoVisitante;

    public Partido(Equipo local, Equipo visitante, 
                    int golesEquipoLocal, int golesEquipoVisitante){
        this.local = local;
        this.visitante = visitante;
        this.golesEquipoLocal = golesEquipoLocal;
        this.golesEquipoVisitante = golesEquipoVisitante;
    }

    public void registrarPartido(){
        
    }

    public boolean equals(Object otro){
        if(this.local.nombreEquipo.equals(((Partido)otro).local.nombreEquipo) 
            && this.visitante.nombreEquipo.equals(((Partido)otro).visitante.nombreEquipo)){
            return true;
        }
        return false;
    }

    public int getGolesEquipoLocal(){
        return golesEquipoLocal;
    }

    public int getGolesEquipoVisitante(){
        return golesEquipoVisitante;
    }
}
