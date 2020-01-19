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
    private int golesFavorVisitante;
    private int golesContraLocal;
    private int golesContraVisitante;
    private int puntos;
    Futbolista jugadores[]= new Futbolista[Integer.MAX_VALUE];;
    public Equipo(){
        /*COMPLETE*/
    }

    public Equipo(String nombreEquipo){
        /*COMPLETE*/ 
        this.nombreEquipo=nombreEquipo;
    }

    public boolean equals(Object otro){
        boolean rta = false;
        /*COMPLETE*/
        return rta;
    }

    public void registrarPartido(int golesEsteEquipo, int golesEquipoContrario, boolean local){
        /*COMPLETE*/
        partidosJugados++;
        if(local){
            if(golesEsteEquipo<golesEquipoContrario)
                partidosPerdidosLocal++;
            if(golesEsteEquipo>golesEquipoContrario){
                puntos+=3;
                partidosGanadosLocal++;
            }
            if(golesEsteEquipo==golesEquipoContrario){
                puntos++;
                partidosEmpatadosLocal++;
            }
            golesFavorLocal += golesEsteEquipo;
            golesContraLocal += golesEquipoContrario;
        }
        else{
            if(golesEsteEquipo<golesEquipoContrario)
                partidosPerdidosVisitante++;
            if(golesEsteEquipo>golesEquipoContrario){
                partidosGanadosVisitante++;
                puntos+=3;
            }
            if(golesEsteEquipo==golesEquipoContrario){
                partidosEmpatadosVisitante++;
                puntos++;
            }
            golesFavorVisitante += golesEsteEquipo;
            golesContraVisitante += golesEquipoContrario;
        }
    }

    public boolean agregarFutbolista(String nombresYApellidos, int camiseta, boolean esPortero){
        boolean rta = false;
        Futbolista f = buscarFutbolista(camiseta);
        if(f==null){
            if(esPortero) f = new Portero(nombresYApellidos, camiseta);
            else if(!esPortero) f = new Futbolista(nombresYApellidos, camiseta);
            for(int i=0; i<11; i++){
                if(jugadores[i]==null){
                    jugadores[i]=f;
                    return true;
                }
            }
        }
        return rta;
    }

    public Futbolista buscarFutbolista(int numeroCamiseta){
        for(int i=0; i<11 && jugadores[i]!=null; i++){
            if(jugadores[i].getNumeroCamiseta() == numeroCamiseta)
                return jugadores[i];
        }
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
