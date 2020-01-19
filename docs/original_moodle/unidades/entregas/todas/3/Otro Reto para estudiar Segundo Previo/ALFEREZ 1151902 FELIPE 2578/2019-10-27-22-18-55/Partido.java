public class Partido
{
    /*COMPLETE Propiedades de Partido*/
    private int golesEquipoLocal;
    private int golesEquipoVisitante;
    public Partido(Equipo local, Equipo visitante, 
    int golesEquipoLocal, int golesEquipoVisitante){
        /*COMPLETE*/
        local = new Equipo();
        visitante = new Equipo();
        this.golesEquipoLocal=golesEquipoLocal;
        this.golesEquipoVisitante=golesEquipoVisitante; 
    }

    public void registrarPartido(){
        /*COMPLETE*/
        Equipo l = new Equipo();
        Equipo v = new Equipo(); 
        l.registrarPartido(golesEquipoLocal, golesEquipoVisitante, true);
        v.registrarPartido(golesEquipoLocal,  golesEquipoVisitante, false);
    }

    public boolean equals(Object otro){    
        if(otro instanceof Partido) return true; /**this.golesEquipoLocal==((Partido)otro).getGolesEquipoLocal() &&
            this.golesEquipoVisitante==((Partido)otro).getGolesEquipoVisitante();*/
        else 
            return false;
    }

    public int getGolesEquipoLocal(){
        return golesEquipoLocal;/*COMPLETE*/
    }

    public int getGolesEquipoVisitante(){
        return golesEquipoVisitante;/*COMPLETE*/
    }
}
