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
    Futbolista equipo[];

    public Equipo(){
        /*COMPLETE*/
        equipo = new Futbolista[11];
    }

    public Equipo(String nombreEquipo){
        /*COMPLETE*/ 
        this.nombreEquipo = nombreEquipo;
    }

    public boolean equals(Object otro){
        boolean rta = false;
        /*COMPLETE*/
        if(otro instanceof String) rta = nombreEquipo.equals(otro);
        if(otro instanceof Equipo) rta = this.nombreEquipo.equals(((Equipo)otro).getNombreEquipo());
        return rta;
    }

    public void registrarPartido(int golesEsteEquipo, int golesEquipoContrario, boolean local){
        /*COMPLETE*/
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
        boolean rta = false;
        int portero = 0;
        Futbolista futbolistaAgregar = buscarFutbolista(camiseta);
        if(futbolistaAgregar == null 
        ){
            if(esPortero && portero<=1){
                for(int i = 0; i < 11; i++){
                    this.equipo[i] = new Futbolista(nombresYApellidos, camiseta);
                    rta = true;
                }
                portero++;
            }
            else if(!esPortero){
                for(int i = 0; i < 11; i++){
                    if(equipo[i] == null){
                        this.equipo[i] = new Futbolista(nombresYApellidos, camiseta);
                        rta = true;
                    }
                }
            }
        }
        return rta;
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