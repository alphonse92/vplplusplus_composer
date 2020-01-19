import java.util.ArrayList;
public class Equipo
{
    private ArrayList <Futbolista> futbolistas;
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

    public Equipo(){
        this("");
    }

    public Equipo(String nombreEquipo){
        futbolistas = new ArrayList();
        this.nombreEquipo = nombreEquipo;
        this.partidosJugados = 0;
        this.partidosGanadosLocal = 0;
        this.partidosEmpatadosLocal = 0;
        this.partidosPerdidosLocal = 0;
        this.partidosGanadosVisitante = 0;
        this.partidosEmpatadosVisitante = 0;
        this.partidosPerdidosVisitante = 0;
        this.golesFavorLocal = 0;
        this.golesContraLocal = 0;
        this.golesFavorVisitante = 0;
        this.golesContraVisitante = 0;
        this.puntos = 0;
    }

    public boolean equals(Object otro){
        if(otro instanceof String) return this.nombreEquipo.equals(otro);
        if(otro instanceof Equipo) return this.nombreEquipo.equals(((Equipo)otro).getNombreEquipo());
        return false;
    }

    public void registrarPartido(int golesEsteEquipo, int golesEquipoContrario, boolean local){
        this.partidosJugados++;
        if(local){
            this.golesFavorLocal += golesEsteEquipo;
            this.golesContraLocal += golesEquipoContrario;
            if(golesEsteEquipo > golesEquipoContrario){ this.partidosGanadosLocal++; puntos += 3; }
            else if(golesEsteEquipo < golesEquipoContrario) this.partidosPerdidosLocal++;
            else{ this.partidosEmpatadosLocal++; puntos ++; }
        }
        else{
            this.golesContraVisitante += golesEsteEquipo;
            this.golesFavorVisitante += golesEquipoContrario;
            if(golesEsteEquipo < golesEquipoContrario){ this.partidosGanadosVisitante++; puntos += 3; }
            else if(golesEsteEquipo > golesEquipoContrario) this.partidosPerdidosVisitante++;
            else{ this.partidosEmpatadosVisitante++; puntos ++; }
        }
    }

    public boolean agregarFutbolista(String nombresYApellidos, int camiseta, boolean esPortero){
        Futbolista tmp = buscarFutbolista(camiseta);
        if(futbolistas.size() < 11){
            if(esPortero){
                Portero portero = new Portero(nombresYApellidos, camiseta);
                if(tmp == null){
                    futbolistas.add(portero);
                    return true;
                }
            }
            else{
                Futbolista futbolista = new Futbolista(nombresYApellidos, camiseta);            
                if(tmp == null){
                    futbolistas.add(futbolista);
                    return true;
                }
            }
        }
        return false;
    }

    public Futbolista buscarFutbolista(int numeroCamiseta){
        boolean encontrado = false;
        Futbolista futbolista = null;
        for(int i = 0; i<futbolistas.size() && !encontrado; i++){
            if(futbolistas.get(i).getNumeroCamiseta() == numeroCamiseta){ futbolista = futbolistas.get(i); encontrado = true; };
        }        
        return futbolista;
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
