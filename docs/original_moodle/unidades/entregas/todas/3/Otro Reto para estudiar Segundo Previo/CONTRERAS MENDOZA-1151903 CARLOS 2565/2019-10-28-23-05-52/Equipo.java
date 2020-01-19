public class Equipo
{
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
    private Futbolista [] nomina = new Futbolista [11];
    public Equipo(){
     /*COMPLETE*/
    }

    public Equipo(String nombreEquipo){
     this.nombreEquipo = nombreEquipo;
    }

    public boolean equals(Object otro){
      if(otro instanceof String){return this.nombreEquipo.equals(otro);}else
        return false;
    }

    public void registrarPartido(int golesEsteEquipo, int golesEquipoContrario, boolean local){
      /*COMPLETE*/
    }
    
    public boolean agregarFutbolista(String nombresYApellidos, int camiseta, boolean esPortero){
      boolean rta = false;
        int cantidadPorteros=0;
        if(esPortero == true && cantidadPorteros == 0){
            Futbolista futbolista = new Portero(nombresYApellidos, camiseta);
            boolean existe = true;
            boolean repetido = false;
            for(int j=0;j<11;j++){
                if(nomina[j] != null){
                    repetido = nomina[j].getNombresYApellidos().equals(nombresYApellidos) || nomina[j].getNumeroCamiseta() == camiseta;
                }
            }
            for(int i=0;i<11 && existe == true;i++){
                existe = nomina[i] != null;
                if(!existe && !repetido) {nomina[i] = futbolista; rta = true;}
            }
        }else{
            Futbolista futbolista = new Futbolista(nombresYApellidos, camiseta);
            boolean existe = true;
            boolean repetido = false;
            for(int j=0;j<11;j++){
                if(nomina[j] != null){
                    repetido = nomina[j].getNombresYApellidos().equals(nombresYApellidos) || nomina[j].getNumeroCamiseta() == camiseta;
                }
            }
            for(int i=0;i<11 && existe == true;i++){
                existe = nomina[i] != null;
                if(!existe && !repetido) {nomina[i] = futbolista; rta = true;}
            }
        }
        /*COMPLETE*/
        return rta;
    }
    
    public Futbolista buscarFutbolista(int numeroCamiseta){
              int posicion = -1;
        Futbolista futbolista;
        for(int i=0; i<11;i++){
            if(nomina[i]!=null){
                if(nomina[i].getNumeroCamiseta() == numeroCamiseta) posicion = i;
            }
        }
        if(posicion == -1) futbolista = null;
        else futbolista = nomina[posicion];
        return futbolista;
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
