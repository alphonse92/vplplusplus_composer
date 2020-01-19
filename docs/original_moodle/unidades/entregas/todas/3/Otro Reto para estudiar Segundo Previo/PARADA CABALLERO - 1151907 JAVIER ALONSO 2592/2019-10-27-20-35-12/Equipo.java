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
    Futbolista futbolistas [] = new Futbolista[100];

    public Equipo(){
        nombreEquipo="";
        partidosJugados=0;
        partidosGanadosLocal=0;
        partidosEmpatadosLocal=0;
        partidosPerdidosLocal=0;
        partidosGanadosVisitante=0;
        partidosEmpatadosVisitante=0;
        partidosPerdidosVisitante=0;
        golesFavorLocal=0;
        golesContraLocal=0;
        golesFavorVisitante=0;
        golesContraVisitante=0;
        puntos=0;
    }

    public Equipo(String nombreEquipo){
        this.nombreEquipo = nombreEquipo;
    }

    public boolean equals(Object otro){
        boolean rta = false;
        if(otro instanceof Equipo){
            rta = this.nombreEquipo.equals(((Equipo)otro).getNombreEquipo());
        }
        return rta;
    }

    public void registrarPartido(int golesEsteEquipo, int golesEquipoContrario, boolean local){
        partidosJugados++;
        if(local){
            if(golesEsteEquipo>golesEquipoContrario){
                partidosGanadosLocal++;
                this.golesFavorLocal += golesEsteEquipo;
                this.golesContraVisitante += golesEquipoContrario;
                puntos+=3;
            }
            if(golesEsteEquipo==golesEquipoContrario){
                partidosEmpatadosLocal++;
                this.golesFavorLocal += golesEsteEquipo;
                this.golesContraVisitante += golesEquipoContrario;
                puntos++;
            }
            if(golesEsteEquipo<golesEquipoContrario){
                partidosPerdidosLocal++;
                this.golesFavorLocal += golesEsteEquipo;
                this.golesContraVisitante += golesEquipoContrario;
            }
        }else{
            if(golesEquipoContrario>golesEsteEquipo){
                partidosGanadosVisitante++;
                this.golesFavorLocal += golesEquipoContrario;
                this.golesContraVisitante += golesEsteEquipo;
                puntos+=3;
            }
            if(golesEquipoContrario==golesEsteEquipo){
                partidosEmpatadosVisitante++;
                this.golesFavorLocal += golesEquipoContrario;
                this.golesContraVisitante += golesEsteEquipo;
                puntos++;
            }
            if(golesEquipoContrario<golesEsteEquipo){
                partidosPerdidosVisitante++;
                this.golesFavorLocal += golesEquipoContrario;
                this.golesContraVisitante += golesEsteEquipo;
            }
        }
    }

    public boolean agregarFutbolista(String nombresYApellidos, int camiseta, boolean esPortero){
        boolean rta = false;
        Futbolista f1 = new Futbolista(nombresYApellidos,camiseta);

        if(buscarFutbolista(camiseta)==null && camiseta<futbolistas.length){
            if(esPortero){
                futbolistas[0] = f1;  
                rta = true;
            }
            else{
                futbolistas[camiseta] = f1;
                rta = true;
            }
        }
        return rta;
    }

    public Futbolista buscarFutbolista(int numeroCamiseta){
        if(this.futbolistas[numeroCamiseta] != null && numeroCamiseta<futbolistas.length){
            return this.futbolistas[numeroCamiseta];
        }
        return null;
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
