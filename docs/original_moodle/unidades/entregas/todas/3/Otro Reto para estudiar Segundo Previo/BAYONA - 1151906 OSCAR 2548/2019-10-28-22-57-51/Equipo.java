public class Equipo
{
    /*COMPLETE Propiedades de Equipo*/    
    private String nombreEquipo;
    private int partidosJugados;
    private int partidosGanadosLocal;
    private int partidosEmpatadosLocal;
    private int partidosPerdidosLocal;
    private int partidosGanadosVisitante;
    private int partidosEmpatadosVisitante;
    private int partidosPerdidosVisitante;
    private int golesFavorLocal;
    private int golesContraLocal;
    private int golesFavorVisitante;
    private int golesContraVisitante;
    private int puntos;
    private Futbolista nomina [] = new Futbolista[11];
    public Equipo(){
     /*COMPLETE*/
    }

    public Equipo(String nombreEquipo){
     /*COMPLETE*/ 
     this.nombreEquipo = nombreEquipo;
    }

    public boolean equals(Object otro){
      boolean rta = false;
      /*COMPLETE*/
      if(otro instanceof Equipo){
            Equipo x = (Equipo)otro;
            rta = this.nombreEquipo == x.nombreEquipo;            
        }
      return rta;
    }

    public void registrarPartido(int golesEsteEquipo, int golesEquipoContrario, boolean local){
      /*COMPLETE*/
      partidosJugados++;
      if(local){
          if(golesEsteEquipo>golesEquipoContrario){
              puntos+=3;
              partidosGanadosLocal++;                
            }
          if(golesEsteEquipo<golesEquipoContrario){
              partidosPerdidosLocal++;
          }
          if(golesEsteEquipo==golesEquipoContrario){
              partidosEmpatadosLocal++;
              puntos+=1;
          }
          golesFavorLocal+=golesEsteEquipo;
          golesContraLocal+=golesEquipoContrario;
      }
      else{
          if(golesEsteEquipo>golesEquipoContrario){
              puntos+=3;
              partidosGanadosVisitante++;                
          }
          if(golesEsteEquipo<golesEquipoContrario){
              partidosPerdidosVisitante++;
          }
          if(golesEsteEquipo==golesEquipoContrario){
              partidosEmpatadosVisitante++;
              puntos+=1;
          }
          golesFavorVisitante+=golesEsteEquipo;
          golesContraVisitante+=golesEquipoContrario;
      }
    }
    
    public boolean agregarFutbolista(String nombresYApellidos, int camiseta, boolean esPortero){
       boolean rta = false;
       /*COMPLETE*/
       Futbolista f = buscarFutbolista(camiseta);
       if(f==null){
            if(esPortero) f = new Portero(nombresYApellidos,camiseta);
            else f = new Futbolista(nombresYApellidos,camiseta);
            for(int i=0;i<nomina.length&&!rta;i++){
                if(nomina[i]==null){
                    nomina[i]=f;
                    rta = true;
                }
            }
       }
       return rta;
    }
    
    public Futbolista buscarFutbolista(int numeroCamiseta){
        
       for(int i=0;i<nomina.length;i++){
            if(nomina[i]!=null && nomina[i].getNumeroCamiseta()==numeroCamiseta)
                return nomina[i];
        }
        return null;
        /*COMPLETE*/
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

}
