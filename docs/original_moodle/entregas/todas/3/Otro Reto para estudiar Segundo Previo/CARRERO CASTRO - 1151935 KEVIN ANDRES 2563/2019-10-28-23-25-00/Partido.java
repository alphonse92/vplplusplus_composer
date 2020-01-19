public class Partido
{
    private int golesEquipoLocal;
    private int golesEquipoVisitante;
    private Equipo local;
    private Equipo visitante;

    public Partido(Equipo local, Equipo visitante, int golesEquipoLocal, int golesEquipoVisitante){
        this.local = local;
        this.visitante = visitante;
        this.golesEquipoLocal = golesEquipoLocal;
        this.golesEquipoVisitante = golesEquipoVisitante;
    }
    
    public void registrarPartido(){
     local.registrarPartido(golesEquipoLocal, golesEquipoVisitante, true);
     visitante.registrarPartido(golesEquipoVisitante, golesEquipoLocal, false);
    }
    
    public boolean equals(Object otro){
        Partido partido = (Partido)otro;
        if(otro instanceof Partido)return this.local.equals(partido.local) && this.visitante.equals(partido.visitante);
        return false;
    }

    public int getGolesEquipoLocal(){
        return this.golesEquipoLocal;
    }

    public int getGolesEquipoVisitante(){
        return this.golesEquipoVisitante;
    }
}
