public class Partido
{
    private Equipo local;
    private Equipo visitante;
    private int golesEquipoLocal;
    private int golesEquipoVisitante;
    public Partido(Equipo local, Equipo visitante, 
    int golesEquipoLocal, int golesEquipoVisitante){
        this.local = local;
        this.visitante = visitante;
        this.golesEquipoLocal = golesEquipoLocal;
        this.golesEquipoVisitante = golesEquipoVisitante;
    }

    public void registrarPartido(){
        local.registrarPartido(golesEquipoLocal, golesEquipoVisitante, true);
        visitante.registrarPartido(golesEquipoLocal, golesEquipoVisitante, false);
    }

    public boolean equals(Object otro){
        if(otro instanceof Partido) return this.local.equals(((Partido) otro).local.getNombreEquipo()) && this.visitante.equals(((Partido) otro).visitante.getNombreEquipo());
        return false;
    }

    public int getGolesEquipoLocal(){
        return this.golesEquipoLocal;
    }

    public int getGolesEquipoVisitante(){
        return this.golesEquipoVisitante;
    }
}
