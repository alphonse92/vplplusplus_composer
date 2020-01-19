public class Partido
{   
    Equipo local;
    Equipo visitante;
    private int golesEquipoLocal;
    private int golesEquipoVisitante;

    public Partido(Equipo local, Equipo visitante, 
                    int golesEquipoLocal, int golesEquipoVisitante){
        this.local=local;
        this.visitante=visitante;
        this.golesEquipoLocal=golesEquipoLocal;
        this.golesEquipoVisitante=golesEquipoVisitante;
    }

    public void registrarPartido(){
        local.registrarPartido(golesEquipoLocal,golesEquipoVisitante,true);
        visitante.registrarPartido(golesEquipoVisitante,golesEquipoLocal,false);
    }

    public boolean equals(Object otro){
        boolean rta = false;
        if(otro instanceof Partido){
            Partido x = (Partido)otro;
            rta = this.local == x.local &&
                    this.visitante == x.visitante;            
        }
        return rta;
    }

    public int getGolesEquipoLocal(){
        return this.golesEquipoLocal;
    }

    public int getGolesEquipoVisitante(){
        return this.golesEquipoVisitante;
    }
}
