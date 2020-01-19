public class Equipo
{
    /*COMPLETE Propiedades de Equipo*/    
    public String nombreEquipo;
    int partidosJugados;
    int partidosGanadosLocal;
    int partidosEmpatadosLocal;
    int partidosPerdidosLocal;
    int partidosGanadosVisitantes;
    int partidosEmpatadosVisitantes;
    int partidosPerdidosVisitantes;
    int golesFavorLocal;
    int golesContraLocal;
    int golesFavorVisitante;
    int golesContraVisitante;
    int puntos;
    public Futbolista nomina[];
    public Equipo(){
    this.nombreEquipo = "";
    this.partidosJugados = 0;
    this.partidosGanadosLocal = 0;
    this.partidosEmpatadosLocal = 0;
    this.partidosPerdidosLocal = 0;
    this.partidosGanadosVisitantes = 0;
    this.partidosEmpatadosVisitantes = 0;
    this.partidosPerdidosVisitantes = 0;
    this.golesFavorLocal = 0;
    this.golesContraLocal = 0;
    this.golesFavorVisitante = 0;
    this.golesContraVisitante = 0;
    this.puntos = 0;
    this.nomina = new Futbolista[11];
     /*COMPLETE*/
    }

    public Equipo(String nombreEquipo){
        this();
    this.nombreEquipo = nombreEquipo;
     /*COMPLETE*/ 
    }

    public boolean equals(Object otro){
      boolean rta = false;
      if(otro instanceof String) rta = this.nombreEquipo.equals(otro);
      else if(otro instanceof Equipo) rta = this.nombreEquipo.equals(((Equipo)otro).getNombreEquipo());
      /*COMPLETE*/
      return rta;
    }

    public void registrarPartido(int golesEsteEquipo, int golesEquipoContrario, boolean local){
        ++partidosJugados;
        if (golesEsteEquipo > golesEquipoContrario){
            if(local)++partidosGanadosLocal;
            else ++partidosGanadosVisitantes;
            puntos += 3;
    }
        else { if (golesEsteEquipo < golesEquipoContrario){
            if (local) ++partidosPerdidosLocal;
            else ++partidosPerdidosVisitantes;
        }
            else{ 
               if(local) ++partidosEmpatadosLocal;
               else ++partidosEmpatadosVisitantes;
               ++puntos;
            }
        }
        if (local){
            golesFavorLocal += golesEsteEquipo;
            golesContraLocal += golesEquipoContrario;
        }
        else{
            golesFavorVisitante += golesEsteEquipo;
            golesContraVisitante += golesEquipoContrario;
        }
    }
    
    
    public boolean agregarFutbolista(String nombresYApellidos, int camiseta, boolean esPortero){
      int portero = 0;
      Futbolista agg = buscarFutbolista(camiseta);
      if(agg == null){
          if(esPortero && portero<1){
              for(int i =0 ; i < 11; ++i){
                  nomina[i] = new Futbolista(nombresYApellidos, camiseta);
                  ++portero;
                  return true;
                }
            }
            else if(!esPortero){
                for (int i = 0; i < 11 ; ++i){
                    if(this.nomina[i] == null){
                        nomina[i] = new Futbolista(nombresYApellidos, camiseta);
                        return true;
                    }
                }
            }
        }
      /*COMPLETE*/
      return false;
    }
    
    public Futbolista buscarFutbolista(int numeroCamiseta){
        for(int i = 0 ; i < 11; ++i){
            if (nomina[i].numeroCamiseta == numeroCamiseta) return nomina[i];
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
       return this.partidosGanadosVisitantes;/*COMPLETE*/
    }

    public int getPartidosEmpatadosVisitante(){
       return this.partidosEmpatadosVisitantes;/*COMPLETE*/
    }

    public int getPartidosPerdidosVisitante(){
        return this.partidosPerdidosVisitantes;/*COMPLETE*/
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
