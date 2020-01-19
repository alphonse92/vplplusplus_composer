
public class Almuerzo  extends Restaurante {

    private static final int PORCION_FRUTA = 30;
    private static final int PORCION_PROTEINA = 200; 
    private static final int PORCION_GRANO = 100;
    private static final int PORCION_ALMIDON = 50;

    public String restaurante;
    public int fruta;
    public int proteina;
    public int grano;
    public int almidon;
    //Complete

    public Almuerzo(Restaurante restaurante, String nombreFruta, String nombreProteina, String nombreGrano, String nombreAlmidon) {
        this.restaurante = restaurante;
        try {
            this.fruta = (Fruta) this.restaurante.buscarIngrediente(nombreFruta);
            this.proteina = (Proteina) this.restaurante.buscarIngrediente(nombreProteina);
            this.grano = (Grano) this.restaurante.buscarIngrediente(nombreGrano);
            this.almidon = (Almidon) this.restaurante.buscarIngrediente(nombreAlmidon);
            
            if(this.fruta == PORCION_FRUTA|| this.proteina == PORCION_PROTEINA || this.grano == PORCION_GRANO || this.almidon == PORCION_ALMIDON) throw new RuntimeException("No hay suficientes ingredientes...");
            
        } catch (Exception e) {
            throw new RuntimeException("Eror en clase Almuerzo: " + e.getMessage());
        }
    }

    /*Calcula el precio de venta de este Almuerzo*/
    public int getPrecioVenta() {
       //Complete
    }

    /*Verifica si se puede preparar este Almuerzo*/
    public boolean sePuedePreparar() {
        //Complete
    }
    
    /*Le informa a cada ingrediente de este Almuerzo que se realizo una venta, para que se registre*/
    public void registrarVenta(){
        //Complete
    }
    
    public boolean equals(Object obj){
      //Complete
    }
}
