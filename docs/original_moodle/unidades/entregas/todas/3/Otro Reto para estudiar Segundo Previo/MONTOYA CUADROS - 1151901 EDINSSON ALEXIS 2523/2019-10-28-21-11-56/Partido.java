public class Partido
{
    /*COMPLETE Propiedades de Partido*/
    private int golesEquipoLocal;
    private int golesEquipoVisitante;
    private Equipo local;
    private Equipo visitante;

    public Partido(Equipo local, Equipo visitante, 
                    int golesEquipoLocal, int golesEquipoVisitante){
        /*COMPLETE*/
        local = local;
        visitante = visitante;
        this.golesEquipoLocal = golesEquipoLocal;
        this.golesEquipoVisitante = golesEquipoVisitante;
    }

    public void registrarPartido(){
        /*COMPLETE*/
    }

    public boolean equals(Object otro){
        if(otro instanceof Partido) return this.local.getNombreEquipo().equals(((Partido)otro).local.getNombreEquipo()) && 
                                           this.visitante.getNombreEquipo().equals(((Partido)otro).visitante.getNombreEquipo()); 
        return false;/*COMPLETE*/
    }

    public int getGolesEquipoLocal(){
        return this.golesEquipoLocal;/*COMPLETE*/
    }

    public int getGolesEquipoVisitante(){
        return this.golesEquipoVisitante;/*COMPLETE*/
    }
}
