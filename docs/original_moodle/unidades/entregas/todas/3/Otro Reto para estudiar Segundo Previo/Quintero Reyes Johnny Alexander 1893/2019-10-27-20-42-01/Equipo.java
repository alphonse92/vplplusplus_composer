public class Equipo
{
    /*COMPLETE Propiedades de Equipo*/    
    private String nombreEquipo;
     private int partidosJugados,partidosGanadosLocal,partidosEmpatadosLocal
     ,partidosPerdidosLocal,partidosGanadosVisitante,partidosEmpatadosVisitante
     ,partidosPerdidosVisitante,golesFavorLocal,golesContraLocal
     ,golesFavorVisitante,golesContraVisitante,puntos;
     public static final int MAXIMOFUTBOLISTAS=11;
    private Futbolista[] nomina= new Futbolista[MAXIMOFUTBOLISTAS];
    
    public Equipo(){
     /*COMPLETE*/
     this.nombreEquipo="";
     this.partidosJugados=0;
     this.partidosGanadosLocal=0;
     this.partidosEmpatadosLocal=0;
     this.partidosPerdidosLocal=0;
     this.partidosGanadosVisitante=0;
     this.partidosEmpatadosVisitante=0;
     this.partidosPerdidosVisitante=0;
     this.golesFavorLocal=0;
     this.golesContraLocal=0;
     this.golesFavorVisitante=0;
     this.golesContraVisitante=0;
     this.puntos=0;
    }
    
    public Equipo(String nombreEquipo){
     /*COMPLETE*/ 
     setNombreEquipo(nombreEquipo);
     //this.nombreEquipo=nombreEquipo;
    }

    public boolean equals(Object otro){
      boolean rta = false;
      /*COMPLETE*/
      if(otro instanceof Equipo)
          rta= this.getNombreEquipo().equals(((Equipo)otro).getNombreEquipo());
        
      return rta;
    }

    public void registrarPartido(int golesEsteEquipo, int golesEquipoContrario, boolean local){
      /*COMPLETE*/
        partidosJugados++;
        partidosGanadosLocal+=(golesEsteEquipo>golesEquipoContrario && local) ? 1: 0;
        partidosEmpatadosLocal+=(golesEsteEquipo==golesEquipoContrario && local) ? 1: 0;
        partidosPerdidosLocal+=(golesEsteEquipo<golesEquipoContrario && local) ? 1: 0;
        partidosGanadosVisitante+=(golesEsteEquipo>golesEquipoContrario && !local) ? 1: 0;
        partidosEmpatadosVisitante+=(golesEsteEquipo==golesEquipoContrario && !local) ? 1: 0;
        partidosPerdidosVisitante+=(golesEsteEquipo<golesEquipoContrario && !local) ? 1: 0;
        golesFavorLocal+=(local) ? golesEsteEquipo :0 ;
        golesFavorVisitante+=(!local) ? golesEsteEquipo :0 ;
        golesContraLocal+=(local)?golesEquipoContrario : 0;
        golesContraVisitante+=(!local)?golesEquipoContrario : 0;
        puntos +=(golesEsteEquipo>golesEquipoContrario)? 3: golesEsteEquipo==golesEquipoContrario ? 1:0 ;
        
    }
    
    public boolean agregarFutbolista(String nombresYApellidos, int camiseta, boolean esPortero){
      boolean rta = false;
      /*COMPLETE*/
      Futbolista nuevo= new Futbolista(nombresYApellidos,camiseta);
      for(int i=0;i<nomina.length;i++){
        if(nomina[i]==null){
            nomina[i]=nuevo;
            rta=true;
            break;
        }
        if(nomina[i].equals(nuevo)) break;
        
        }
      return rta;
    }
    
    public Futbolista buscarFutbolista(int numeroCamiseta){
        Futbolista otro = new Futbolista(this.getNombreEquipo(),numeroCamiseta);
        for(int i=0;i<MAXIMOFUTBOLISTAS;i++){
            if(nomina[i]!=null && nomina[i].getNumeroCamiseta() == otro.getNumeroCamiseta())
            return otro;
        }
        
      return null;/*COMPLETE*/
    }

    public String getNombreEquipo(){
        return this.nombreEquipo;/*COMPLETE*/
    }

    public int getPartidosJugados(){
        return this.partidosJugados;/*COMPLETE*/
    }

    public int getPartidosGanadosLocal(){
        return this.partidosGanadosLocal;/*COMPLETE*/
    }

    public int getPartidosEmpatadosLocal(){
        return this.partidosEmpatadosLocal;/*COMPLETE*/
    }

    public int getPartidosPerdidosLocal(){
        return this.partidosPerdidosLocal;/*COMPLETE*/
    }

    public int getPartidosGanadosVisitante(){
       return this.partidosGanadosVisitante;/*COMPLETE*/
    }

    public int getPartidosEmpatadosVisitante(){
       return this.partidosEmpatadosVisitante;/*COMPLETE*/
    }

    public int getPartidosPerdidosVisitante(){
        return this.partidosPerdidosVisitante;/*COMPLETE*/
    }

    public int getGolesFavorLocal(){
        return this.golesFavorLocal;/*COMPLETE*/
    }

    public int getGolesContraLocal(){
       return this.golesContraLocal;/*COMPLETE*/
    }

    public int getGolesFavorVisitante(){
      return this.golesFavorVisitante;/*COMPLETE*/
    }

    public int getGolesContraVisitante(){
      return this.golesContraVisitante;/*COMPLETE*/
    }

    public int getPuntos(){
      return this.puntos;/*COMPLETE*/
    }


    //Start GetterSetterExtension Code
    /**Getter method golerFavorLocal*/
    public int getGolerFavorLocal(){
        return this.golesFavorLocal;
    }//end method getGolerFavorLocal

    //End GetterSetterExtension Code
//!

    //Start GetterSetterExtension Code
    /**Setter method puntos*/
    public void setPuntos(int puntos){
        this.puntos = puntos;
    }//end method setPuntos

    //End GetterSetterExtension Code
//!

    //Start GetterSetterExtension Code
    /**Setter method golesContraVisitante*/
    public void setGolesContraVisitante(int golesContraVisitante){
        this.golesContraVisitante = golesContraVisitante;
    }//end method setGolesContraVisitante

    //End GetterSetterExtension Code
//!

    //Start GetterSetterExtension Code
    /**Setter method golesFavorVisitante*/
    public void setGolesFavorVisitante(int golesFavorVisitante){
        this.golesFavorVisitante = golesFavorVisitante;
    }//end method setGolesFavorVisitante

    //End GetterSetterExtension Code
//!

    //Start GetterSetterExtension Code
    /**Setter method golesContraLocal*/
    public void setGolesContraLocal(int golesContraLocal){
        this.golesContraLocal = golesContraLocal;
    }//end method setGolesContraLocal

    //End GetterSetterExtension Code
//!

    //Start GetterSetterExtension Code
    /**Setter method golerFavorLocal*/
    public void setGolerFavorLocal(int golerFavorLocal){
        this.golesFavorLocal = golerFavorLocal;
    }//end method setGolerFavorLocal

    //End GetterSetterExtension Code
//!

    //Start GetterSetterExtension Code
    /**Setter method partidosPerdidosVisitante*/
    public void setPartidosPerdidosVisitante(int partidosPerdidosVisitante){
        this.partidosPerdidosVisitante = partidosPerdidosVisitante;
    }//end method setPartidosPerdidosVisitante

    //End GetterSetterExtension Code
//!

    //Start GetterSetterExtension Code
    /**Setter method partidosEmpatadosVisitante*/
    public void setPartidosEmpatadosVisitante(int partidosEmpatadosVisitante){
        this.partidosEmpatadosVisitante = partidosEmpatadosVisitante;
    }//end method setPartidosEmpatadosVisitante

    //End GetterSetterExtension Code
//!

    //Start GetterSetterExtension Code
    /**Setter method partidosGanadosVisitante*/
    public void setPartidosGanadosVisitante(int partidosGanadosVisitante){
        this.partidosGanadosVisitante = partidosGanadosVisitante;
    }//end method setPartidosGanadosVisitante

    //End GetterSetterExtension Code
//!

    //Start GetterSetterExtension Code
    /**Setter method partidosPerdidosLocal*/
    public void setPartidosPerdidosLocal(int partidosPerdidosLocal){
        this.partidosPerdidosLocal = partidosPerdidosLocal;
    }//end method setPartidosPerdidosLocal

    //End GetterSetterExtension Code
//!

    //Start GetterSetterExtension Code
    /**Setter method partidosEmpatadosLocal*/
    public void setPartidosEmpatadosLocal(int partidosEmpatadosLocal){
        this.partidosEmpatadosLocal = partidosEmpatadosLocal;
    }//end method setPartidosEmpatadosLocal

    //End GetterSetterExtension Code
//!

    //Start GetterSetterExtension Code
    /**Setter method partidosGanadosLocal*/
    public void setPartidosGanadosLocal(int partidosGanadosLocal){
        this.partidosGanadosLocal = partidosGanadosLocal;
    }//end method setPartidosGanadosLocal

    //End GetterSetterExtension Code
//!

    //Start GetterSetterExtension Code
    /**Setter method nombreEquipo*/
    public void setNombreEquipo(String nombreEquipo){
        this.nombreEquipo = nombreEquipo;
    }//end method setNombreEquipo

    //End GetterSetterExtension Code
//!

    //Start GetterSetterExtension Code
    /**Setter method partidosJugados*/
    public void setPartidosJugados(int partidosJugados){
        this.partidosJugados = partidosJugados;
    }//end method setPartidosJugados

    //End GetterSetterExtension Code
//!
}
