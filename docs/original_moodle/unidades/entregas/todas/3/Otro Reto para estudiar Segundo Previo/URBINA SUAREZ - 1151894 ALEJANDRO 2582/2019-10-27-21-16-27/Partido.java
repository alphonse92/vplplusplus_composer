public class Partido
{
    /*COMPLETE Propiedades de Partido*/
    int golesEquipoLocal;
    int golesEquipoVisitante;
    Equipo local;
    Equipo visitante;

    public Partido(Equipo local, Equipo visitante, 
                    int golesEquipoLocal, int golesEquipoVisitante){
     /*COMPLETE*/
        this.local = local;
        this.visitante = visitante;
        this.golesEquipoLocal = golesEquipoLocal;
        this.golesEquipoVisitante = golesEquipoVisitante;
    }
    
    public void registrarPartido(){
     /*COMPLETE*/
        local.registrarPartido(golesEquipoLocal, golesEquipoVisitante, true);
        visitante.registrarPartido(golesEquipoVisitante, golesEquipoLocal, false);
    }
    
    public boolean equals(Object otro){
        if(otro instanceof Partido) return local.equals(((Partido)otro).local) && visitante.equals(((Partido)otro).visitante);
     return false;/*COMPLETE*/
    }

    public int getGolesEquipoLocal(){
        return golesEquipoLocal;/*COMPLETE*/
    }

    public int getGolesEquipoVisitante(){
        return golesEquipoVisitante;/*COMPLETE*/
    }
}
