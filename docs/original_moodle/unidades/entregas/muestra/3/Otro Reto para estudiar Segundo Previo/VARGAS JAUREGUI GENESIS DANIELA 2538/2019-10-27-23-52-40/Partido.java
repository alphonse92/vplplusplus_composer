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
     this.local = local;
     this.visitante = visitante;
     this.golesEquipoLocal = golesEquipoLocal;
     this.golesEquipoVisitante = golesEquipoVisitante;
    }
    
    public void registrarPartido(){
     /*COMPLETE*/
     local.registrarPartido(this.golesEquipoLocal, this.golesEquipoVisitante, true);
     visitante.registrarPartido(this.golesEquipoVisitante, this.golesEquipoLocal, false);
    }
    
    public boolean equals(Object otro){
     return this.equals(otro);/*COMPLETE*/
    }

    public int getGolesEquipoLocal(){
        return this.golesEquipoLocal;/*COMPLETE*/
    }

    public int getGolesEquipoVisitante(){
        return this.golesEquipoVisitante;/*COMPLETE*/
    }
}
