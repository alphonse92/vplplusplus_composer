public class Equipo
{
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
    private Futbolista equipo[];

    public Equipo(){

    }

    public Equipo(String nombreEquipo){
        this.equipo = new Futbolista[11];
        this.nombreEquipo = nombreEquipo;
    }

    public boolean equals(Object otro){
        boolean rta = false;
        if(otro instanceof String) rta = this.nombreEquipo.equals(otro);
        if(otro instanceof Equipo) rta = this.nombreEquipo.equals(((Equipo)otro).getNombreEquipo());
        return rta;
    }

    public void registrarPartido(int golesEsteEquipo, int golesEquipoContrario, boolean local){
        this.partidosJugados++;
        if(local){
            this.golesFavorLocal += golesEsteEquipo;
            this.golesContraLocal += golesEquipoContrario;
            
            if(golesEsteEquipo > golesEquipoContrario){
                this.partidosGanadosLocal++;
                this.puntos += 3;
            }
            else if(golesEsteEquipo < golesEquipoContrario){
                this.partidosPerdidosLocal++;
            }
            else{
                this.partidosEmpatadosLocal++;
                this.puntos++;
            }
        }
        else{
            this.golesFavorVisitante += golesEsteEquipo;
            this.golesContraVisitante += golesEquipoContrario;
            if(golesEsteEquipo > golesEquipoContrario){
                this.partidosGanadosVisitante++;
                this.puntos += 3;
            }
            else if(golesEsteEquipo < golesEquipoContrario){
                this.partidosPerdidosVisitante++;
            }
            else{
                this.partidosEmpatadosVisitante++;
                this.puntos++;
            }
        }
    }

    public boolean agregarFutbolista(String nombresYApellidos, int camiseta, boolean esPortero){
        
        Futbolista futbolistaAgregar = buscarFutbolista(camiseta);
        if(futbolistaAgregar == null){
            if(esPortero){
                for(int i = 0; i < 11; i++){
                    equipo[i] = new Futbolista(nombresYApellidos, camiseta);
                    
                    return true;
                }
            }
            else if(!esPortero){
                for(int i = 0; i < 11; i++){
                    if(this.equipo[i] == null){
                        equipo[i] = new Futbolista(nombresYApellidos, camiseta);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public Futbolista buscarFutbolista(int numeroCamiseta){
        Futbolista futbolistaBuscado = null;
        for (int i=0; i < 11 && futbolistaBuscado == null; i++) {
            if (this.equipo[i] != null && this.equipo[i].getNumeroCamiseta() == numeroCamiseta){
                futbolistaBuscado = this.equipo[i];
            }
        }
        return futbolistaBuscado;
    }

    public String getNombreEquipo(){
        return nombreEquipo;
    }

    public int getPartidosJugados(){
        return partidosJugados;
    }

    public int getPartidosGanadosLocal(){
        return partidosGanadosLocal;
    }

    public int getPartidosEmpatadosLocal(){
        return partidosEmpatadosLocal;
    }

    public int getPartidosPerdidosLocal(){
        return partidosPerdidosLocal;
    }

    public int getPartidosGanadosVisitante(){
        return partidosGanadosVisitante;
    }

    public int getPartidosEmpatadosVisitante(){
        return partidosEmpatadosVisitante;
    }

    public int getPartidosPerdidosVisitante(){
        return partidosPerdidosVisitante;
    }

    public int getGolesFavorLocal(){
        return golesFavorLocal;
    }

    public int getGolesContraLocal(){
        return golesContraLocal;
    }

    public int getGolesFavorVisitante(){
        return golesFavorVisitante;
    }

    public int getGolesContraVisitante(){
        return golesContraVisitante;
    }

    public int getPuntos(){
        return puntos;
    }

}
