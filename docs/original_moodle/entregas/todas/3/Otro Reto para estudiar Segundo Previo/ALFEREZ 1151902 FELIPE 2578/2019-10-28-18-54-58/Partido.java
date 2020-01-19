public class Partido
{
    /*COMPLETE Propiedades de Partido*/
    Equipo local; Equipo visitante;
    int golesEquipoLocal, golesEquipoVisitante;
    public Partido(Equipo local, Equipo visitante, 
                    int golesEquipoLocal, int golesEquipoVisitante){
     /*COMPLETE*/
     this.local = local;
     this.visitante = visitante;
     this.golesEquipoLocal=golesEquipoLocal;
     this.golesEquipoVisitante=golesEquipoVisitante;
    }
    
    public void registrarPartido(){
     /*COMPLETE*/
     local.registrarPartido(golesEquipoLocal, golesEquipoVisitante, true);
     visitante.registrarPartido(golesEquipoVisitante, golesEquipoLocal, false);
    }
    
    public boolean equals(Object otro){
     return false;/*COMPLETE*/
    }

    public int getGolesEquipoLocal(){
        return golesEquipoLocal;/*COMPLETE*/
    }

    public int getGolesEquipoVisitante(){
        return golesEquipoVisitante;/*COMPLETE*/
    }
}
