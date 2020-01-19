public class Equipo
{
    /*COMPLETE Propiedades de Equipo*/
    String nombreEquipo;
    int partidosJugados;
    int partidosGanadosLocal;
    int partidosEmpatadosLocal;
    int partidosPerdidosLocal;
    int partidosGanadosVisitante;
    int partidosEmpatadosVisitante;
    int partidosPerdidosVisitante;
    int golesFavorLocal;
    int golesContraLocal;
    int golesFavorVisitante;
    int golesContraVisitante;
    int puntos;
    Futbolista[] nomina = new Futbolista[11];
    int futbolistas = 0;
    
    public Equipo(){
     /*COMPLETE*/
        nombreEquipo = null;
        partidosJugados = 0;
        partidosGanadosLocal = 0;
        partidosEmpatadosLocal = 0;
        partidosPerdidosLocal = 0;
        partidosGanadosVisitante = 0;
        partidosEmpatadosVisitante = 0;
        partidosPerdidosVisitante = 0;
        golesFavorLocal = 0;
        golesContraLocal = 0;
        golesFavorVisitante = 0;
        golesContraVisitante = 0;
        puntos = 0;
    }

    public Equipo(String nombreEquipo){
     /*COMPLETE*/ 
        this();
        this.nombreEquipo = nombreEquipo;
    }

    public boolean equals(Object otro){
      boolean rta = otro instanceof String ? this.nombreEquipo.equals(otro) :
                    otro instanceof Equipo ? this.nombreEquipo.equals(((Equipo)otro).getNombreEquipo()) :
                    false;
      /*COMPLETE*/
      return rta;
    }

    public void registrarPartido(int golesEsteEquipo, int golesEquipoContrario, boolean local){
      /*COMPLETE*/
      partidosJugados++;
      if(local){
          golesFavorLocal += golesEsteEquipo;
          golesContraLocal += golesEquipoContrario;          
          if(golesEsteEquipo > golesEquipoContrario){
              partidosGanadosLocal++;
              puntos += 3;
          }
          else if(golesEsteEquipo < golesEquipoContrario) partidosPerdidosLocal++;
          else{
              partidosEmpatadosLocal++;
              puntos++;
            }
        }
      else{
          golesFavorVisitante += golesEsteEquipo;
          golesContraVisitante += golesEquipoContrario;          
          if(golesEsteEquipo > golesEquipoContrario){
              partidosGanadosVisitante++;
              puntos += 3;
          }
          else if(golesEsteEquipo < golesEquipoContrario) partidosPerdidosVisitante++;
          else{
              partidosEmpatadosVisitante++;
              puntos++;
            }
        }
    }
    
    public boolean agregarFutbolista(String nombresYApellidos, int camiseta, boolean esPortero){
      boolean rta = false;
            Futbolista jugador = buscarFutbolista(camiseta);
            if(jugador == null){
                if(esPortero) jugador = new Portero(nombresYApellidos, camiseta);
                else if(!esPortero) jugador = new Futbolista(nombresYApellidos, camiseta);
                for(int i = 0; i < 11; i++){
                    if(nomina[i] == null){
                        nomina[i] = jugador;
                        return true;
                    }
                }
            }
      /*COMPLETE*/
      return false;
    }
    
    public Futbolista buscarFutbolista(int numeroCamiseta){
        for(Futbolista x : nomina)
            if(x != null &&x.getNumeroCamiseta() == numeroCamiseta) return x;
        return null;/*COMPLETE*/
    }

    public String getNombreEquipo(){
        return nombreEquipo;/*COMPLETE*/
    }

    public int getPartidosJugados(){
        return partidosJugados;/*COMPLETE*/
    }

    public int getPartidosGanadosLocal(){
        return partidosGanadosLocal;/*COMPLETE*/
    }

    public int getPartidosEmpatadosLocal(){
        return partidosEmpatadosLocal;/*COMPLETE*/
    }

    public int getPartidosPerdidosLocal(){
        return partidosPerdidosLocal;/*COMPLETE*/
    }

    public int getPartidosGanadosVisitante(){
       return partidosGanadosVisitante;/*COMPLETE*/
    }

    public int getPartidosEmpatadosVisitante(){
       return partidosEmpatadosVisitante;/*COMPLETE*/
    }

    public int getPartidosPerdidosVisitante(){
        return partidosPerdidosVisitante;/*COMPLETE*/
    }

    public int getGolesFavorLocal(){
        return golesFavorLocal;/*COMPLETE*/
    }

    public int getGolesContraLocal(){
       return golesContraLocal;/*COMPLETE*/
    }

    public int getGolesFavorVisitante(){
      return golesFavorVisitante;/*COMPLETE*/
    }

    public int getGolesContraVisitante(){
      return golesContraVisitante;/*COMPLETE*/
    }

    public int getPuntos(){
      return puntos;/*COMPLETE*/
    }

}
