public class Partido
{
    public Equipo local;
    public Equipo visitante;
    public int golesEquipoLocal;
    public int golesEquipoVisitante;
    /*COMPLETE Propiedades de Partido*/

    public Partido(Equipo local, Equipo visitante, 
                    int golesEquipoLocal, int golesEquipoVisitante){
     this.local = local;                 
     this.visitante = visitante;                   
     this.golesEquipoLocal = golesEquipoLocal;
     this.golesEquipoVisitante = golesEquipoVisitante;
     /*COMPLETE*/
    }
    
    public void registrarPartido(){
     local.registrarPartido(this.golesEquipoLocal, this.golesEquipoVisitante, true);
     visitante.registrarPartido(this.golesEquipoVisitante, this.golesEquipoLocal, false);
     /*COMPLETE*/
    }
    
    public boolean equals(Object otro){
        boolean rta = false;
        if (otro instanceof Partido) rta = local.equals(((Partido)otro).local) && visitante.equals(((Partido)otro).visitante);
     return false;/*COMPLETE*/
    }

    public int getGolesEquipoLocal(){
        return this.golesEquipoLocal;/*COMPLETE*/
    }

    public int getGolesEquipoVisitante(){
        return this.golesEquipoVisitante;/*COMPLETE*/
    }
}
