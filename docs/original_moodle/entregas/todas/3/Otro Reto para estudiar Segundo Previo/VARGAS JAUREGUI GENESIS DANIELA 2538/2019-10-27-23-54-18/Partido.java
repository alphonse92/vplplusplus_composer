public class Partido
{
    private int golesEquipoLocal;
    private int golesEquipoVisitante;
    private Equipo local;
    private Equipo visitante;
    
    public Partido(Equipo local, Equipo visitante, 
    int golesEquipoLocal, int golesEquipoVisitante){
        this.local = local;
        this.visitante = visitante;
        this.golesEquipoVisitante = golesEquipoVisitante;
        this.golesEquipoLocal = golesEquipoLocal;
    }

    public void registrarPartido(){
        local.registrarPartido(golesEquipoLocal, golesEquipoVisitante, true);
        visitante.registrarPartido(golesEquipoVisitante, golesEquipoLocal, false);
    }

    public boolean equals(Object otro){
        if (otro instanceof Partido) return local.equals(((Partido)otro).local) && visitante.equals(((Partido)otro).visitante);
        return false;
    }

    public int getGolesEquipoLocal(){
        return golesEquipoLocal;
    }

    public int getGolesEquipoVisitante(){
        return golesEquipoVisitante;
    }
}
