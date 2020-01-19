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
    Futbolista jugadores[]= new Futbolista[100000000];
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
        return rta;
    }

    public void registrarPartido(int golesEsteEquipo, int golesEquipoContrario, boolean local){
        /*COMPLETE*/
        if(local && golesEsteEquipo<golesEquipoContrario){
            partidosJugados++;
            partidosPerdidosLocal++;
            golesFavorLocal += golesEsteEquipo;
            golesContraLocal += golesEquipoContrario;
        }
        else if(local && golesEsteEquipo>golesEquipoContrario){
            partidosJugados++;
            partidosGanadosLocal++;
            golesFavorLocal += golesEsteEquipo;
            golesContraLocal += golesEquipoContrario;
            puntos +=3;
        }
        else if(local && golesEsteEquipo==golesEquipoContrario){
            partidosJugados++;
            partidosEmpatadosLocal++;
            golesFavorLocal += golesEsteEquipo;
            golesContraLocal += golesEquipoContrario;
            puntos++;
        }
        else if(!local && golesEsteEquipo<golesEquipoContrario){
            partidosJugados++;
            partidosPerdidosVisitante++;
            golesFavorVisitante+=golesEsteEquipo;
            golesContraVisitante+=golesEquipoContrario;
        }
        else if(!local && golesEsteEquipo>golesEquipoContrario){
            partidosJugados++;
            partidosGanadosVisitante++;
            golesFavorVisitante+=golesEsteEquipo;
            golesContraVisitante+=golesEquipoContrario;
            puntos+=3;
        }
        else if(!local && golesEsteEquipo==golesEquipoContrario){
            partidosJugados++;
            partidosEmpatadosVisitante++;
            golesFavorVisitante+=golesEsteEquipo;
            golesContraVisitante+=golesEquipoContrario;
            puntos++;
        }
        else{
            ; 
        } 
    }

    public boolean agregarFutbolista(String nombresYApellidos, int camiseta, boolean esPortero){
        boolean rta = false;
        /*COMPLETE*/
        Futbolista f = new Futbolista(nombresYApellidos, camiseta);
        for(int i=0; i<jugadores.length-1; i++){
            if(jugadores[i].getNombresYApellidos()!=f.getNombresYApellidos() || jugadores[i].getNumeroCamiseta()!=f.getNumeroCamiseta()){
                rta=true;
                jugadores[i]=f;
            }
        }
        return rta;
    }

    public Futbolista buscarFutbolista(int numeroCamiseta){
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
        return golesFavorVisitante;/*COMPLETE*/
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
