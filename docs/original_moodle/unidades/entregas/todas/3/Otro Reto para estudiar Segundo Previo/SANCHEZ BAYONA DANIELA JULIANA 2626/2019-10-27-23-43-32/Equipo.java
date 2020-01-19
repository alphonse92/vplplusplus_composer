public class Equipo
{
    /*COMPLETE Propiedades de Equipo*/
    protected String nombreEquipo;
    protected int partidosJugados;
    protected int partidosGanadosLocal;
    protected int partidosEmpatadosLocal;
    protected int partidosPerdidosLocal;
    protected int partidosGanadosVisitante;
    protected int partidosEmpatadosVisitante;
    protected int partidosPerdidosVisitante;
    protected int golesFavorLocal;
    protected int golesContraLocal;
    protected int golesFavorVisitante;
    protected int golesContraVisitante;
    protected int puntos;
    protected Futbolista [] nomina;
    
    public Equipo(){
     /*COMPLETE*/
      this.nomina= new Futbolista [11];
    }

    public Equipo(String nombreEquipo){
     /*COMPLETE*/ 
     this.nombreEquipo=nombreEquipo;
    }

    public boolean equals(Object otro){
      
      if (otro instanceof String)
        return this.nombreEquipo.equals(otro);
      if (otro instanceof Equipo)
        return this.nombreEquipo.equals(((Equipo)otro).getNombreEquipo());
      return false;
      
    }

    public void registrarPartido(int golesEsteEquipo, int golesEquipoContrario, boolean local){
      /*COMPLETE*/
    }
    
    public boolean agregarFutbolista(String nombresYApellidos, int camiseta, boolean esPortero){
      
      boolean rta = false;
      
      return false;
     }
    
    public Futbolista buscarFutbolista(int numeroCamiseta){
    Futbolista futbolistaBuscado=null;
    for(int i=0; i<11 && futbolistaBuscado==null; i++){
        if(this.nomina[i] != null && this.nomina[i].getNumeroCamiseta()==numeroCamiseta){
            futbolistaBuscado=this.nomina[i];
        }
    
    }
    return futbolistaBuscado;
    
    }

    public String getNombreEquipo(){
        return nombreEquipo;
        /*COMPLETE*/
       
    }

    public int getPartidosJugados(){
        return partidosJugados;
        /*COMPLETE*/
    }

    public int getPartidosGanadosLocal(){
        return partidosGanadosLocal;
        /*COMPLETE*/
    }

    public int getPartidosEmpatadosLocal(){
        return partidosEmpatadosLocal;
        /*COMPLETE*/
    }

    public int getPartidosPerdidosLocal(){
        return partidosPerdidosLocal;
        /*COMPLETE*/
    }

    public int getPartidosGanadosVisitante(){
       return partidosGanadosVisitante;
       /*COMPLETE*/
    }

    public int getPartidosEmpatadosVisitante(){
       return partidosEmpatadosVisitante;
       /*COMPLETE*/
    }

    public int getPartidosPerdidosVisitante(){
        return partidosPerdidosVisitante;
        /*COMPLETE*/
    }

    public int getGolesFavorLocal(){
        return golesFavorLocal;
        /*COMPLETE*/
    }

    public int getGolesContraLocal(){
       return golesContraLocal;
       /*COMPLETE*/
    }

    public int getGolesFavorVisitante(){
      return golesFavorVisitante;
      /*COMPLETE*/
    }

    public int getGolesContraVisitante(){
      return golesContraVisitante;
      /*COMPLETE*/
    }

    public int getPuntos(){
      return puntos;
      /*COMPLETE*/
    }

}
