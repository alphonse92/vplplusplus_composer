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
    private Futbolista nomina [] = new Futbolista[11];

    public Equipo(){
    }

    public Equipo(String nombreEquipo){
        this.nombreEquipo=nombreEquipo;
    }

    public boolean equals(Object otro){
        boolean rta = false;
        if(otro instanceof Equipo){
            Equipo x = (Equipo)otro;
            rta = this.nombreEquipo == x.nombreEquipo;            
        }
        return rta;
    }

    public void registrarPartido(int golesEsteEquipo, int golesEquipoContrario, boolean local){
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
    }

    public String getNombreEquipo(){
        return this.nombreEquipo;
    }

    public int getPartidosJugados(){
        return this.partidosJugados;
    }

    public int getPartidosGanadosLocal(){
        return this.partidosGanadosLocal;
    }

    public int getPartidosEmpatadosLocal(){
        return this.partidosEmpatadosLocal;
    }

    public int getPartidosPerdidosLocal(){
        return this.partidosPerdidosLocal;
    }

    public int getPartidosGanadosVisitante(){
        return this.partidosGanadosVisitante;
    }

    public int getPartidosEmpatadosVisitante(){
        return this.partidosEmpatadosVisitante;
    }

    public int getPartidosPerdidosVisitante(){
        return this.partidosPerdidosVisitante;
    }

    public int getGolesFavorLocal(){
        return this.golesFavorLocal;
    }

    public int getGolesContraLocal(){
        return this.golesContraLocal;
    }

    public int getGolesFavorVisitante(){
        return this.golesFavorVisitante;
    }

    public int getGolesContraVisitante(){
        return this.golesContraVisitante;
    }

    public int getPuntos(){
        return this.puntos;
    }

}
