public class Partido
{
    /*COMPLETE Propiedades de Partido*/
    Equipo local;
    Equipo visitante;
    private int golesEquipoLocal;
    private int golesEquipoVisitante;

    public Partido(Equipo local, Equipo visitante, 
                    int golesEquipoLocal, int golesEquipoVisitante){
     /*COMPLETE*/
     this.local=local;
     this.visitante=visitante;
     this.golesEquipoLocal=golesEquipoLocal;
     this.golesEquipoVisitante=golesEquipoVisitante;
    }
    
    public void registrarPartido(){
     /*COMPLETE*/
     local.registrarPartido(golesEquipoLocal,golesEquipoVisitante,true);
     visitante.registrarPartido(golesEquipoVisitante,golesEquipoLocal,false);
    }
    
    public boolean equals(Object otro){
        boolean rta = false;
        if (otro instanceof Partido){
            Partido p = (Partido)otro;
            rta = this.local == p.local && this.visitante == p.visitante;
        }
        return rta;/*COMPLETE*/
    }

    public int getGolesEquipoLocal(){
        return this.golesEquipoLocal;/*COMPLETE*/
    }

    public int getGolesEquipoVisitante(){
        return this.golesEquipoVisitante;/*COMPLETE*/
    }
}
