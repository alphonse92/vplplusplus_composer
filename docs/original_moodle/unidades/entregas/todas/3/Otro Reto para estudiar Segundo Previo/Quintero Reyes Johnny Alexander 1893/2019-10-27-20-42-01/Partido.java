public class Partido
{
    /*COMPLETE Propiedades de Partido*/
    private int golesEquipoLocal , golesEquipoVisitante;
    private Equipo local;
    private Equipo visitante;
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
     this.local.registrarPartido(golesEquipoLocal,golesEquipoVisitante, true);
     this.visitante.registrarPartido(golesEquipoVisitante, golesEquipoLocal, false);
    }
    
    
    public boolean equals(Object otro){
      if(otro instanceof Partido) return this.local.equals(((Partido)otro).getLocal())
                                  || this.visitante.equals(((Partido)otro).getVisitante());
     return false;/*COMPLETE*/
    }

    public int getGolesEquipoLocal(){
        return this.golesEquipoLocal;/*COMPLETE*/
    }

    public int getGolesEquipoVisitante(){
        return this.golesEquipoVisitante;/*COMPLETE*/
    }

    //Start GetterSetterExtension Code
    /**Setter method golesEquipoLocal*/
    public void setGolesEquipoLocal(int golesEquipoLocal){
        this.golesEquipoLocal = golesEquipoLocal;
    }//end method setGolesEquipoLocal

    /**Setter method golesEquipoVisitante*/
    public void setGolesEquipoVisitante(int golesEquipoVisitante){
        this.golesEquipoVisitante = golesEquipoVisitante;
    }//end method setGolesEquipoVisitante

    /**Getter method local*/
    public Equipo getLocal(){
        return this.local;
    }//end method getLocal

    /**Setter method local*/
    public void setLocal(Equipo local){
        this.local = local;
    }//end method setLocal

    /**Getter method visitante*/
    public Equipo getVisitante(){
        return this.visitante;
    }//end method getVisitante

    /**Setter method visitante*/
    public void setVisitante(Equipo visitante){
        this.visitante = visitante;
    }//end method setVisitante

    //End GetterSetterExtension Code
//!
}
