public class Equipo
{
    /*COMPLETE Propiedades de Equipo*/    
    private String nombreEquipo;
    private int partidosJugados;
    private int ganadosLocal;
    private int empatadosLocal;
    private int perdidosLocal;
    private int ganadosVisitante;
    private int empatadosVisitante;
    private int perdidosVisitante;
    private int golesFavorLocal;
    private int golesContraLocal;
    private int golesFavorVisitante;
    private int golesContraVisitante;
    private int puntos;
    private Futbolista [] nomina = new Futbolista [11];

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
        return futbolista;/*COMPLETE*/
    }

    public String getNombreEquipo(){
        return this.nombreEquipo;/*COMPLETE*/
    }

    public int getPartidosJugados(){
        return this.partidosJugados;/*COMPLETE*/
    }

    public int getPartidosGanadosLocal(){
        return this.ganadosLocal;/*COMPLETE*/
    }

    public int getPartidosEmpatadosLocal(){
        return this.empatadosLocal;/*COMPLETE*/
    }

    public int getPartidosPerdidosLocal(){
        return this.perdidosLocal;/*COMPLETE*/
    }

    public int getPartidosGanadosVisitante(){
        return this.ganadosVisitante;/*COMPLETE*/
    }

    public int getPartidosEmpatadosVisitante(){
        return this.empatadosVisitante;/*COMPLETE*/
    }

    public int getPartidosPerdidosVisitante(){
        return this.perdidosVisitante;/*COMPLETE*/
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
