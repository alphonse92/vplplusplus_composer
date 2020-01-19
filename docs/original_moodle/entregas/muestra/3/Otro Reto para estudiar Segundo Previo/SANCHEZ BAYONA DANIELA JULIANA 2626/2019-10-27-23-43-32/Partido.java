public class Partido
{
    /*COMPLETE Propiedades de Partido*/
    protected Equipo local;
    protected Equipo visitante;
    protected int golesEquipoLocal;
    protected int golesEquipoVisitante;
    

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
    }
    
    public boolean equals(Object otro){
        
        if(otro instanceof Partido) {
            return this.local.equals(((Partido)otro).getLocal()) && 
            this.visitante.equals(((Partido)otro).getVisitante());
        }
        return false;
        /*COMPLETE*/
    }

    public int getGolesEquipoLocal(){
        return golesEquipoLocal;/*COMPLETE*/
    }

    public int getGolesEquipoVisitante(){
        return golesEquipoVisitante;/*COMPLETE*/
    }
    
    public Equipo getLocal(){
        return local;
    }
    
      public Equipo getVisitante(){
        return visitante;
    }
}
