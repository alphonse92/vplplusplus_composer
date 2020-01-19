
public class Almuerzo {

    private static final int PORCION_FRUTA = 30;
    private static final int PORCION_PROTEINA = 200;
    private static final int PORCION_GRANO = 100;
    private static final int PORCION_ALMIDON = 50;

    //Complete
    Fruta fruta;
    Proteina presa;
    Grano grano;
    Almidon almidon;

    public Almuerzo(Restaurante restaurante, String nombreFruta, String nombreProteina, String nombreGrano, String nombreAlmidon) {
        this.restaurante = restaurante;
        try {
            this.fruta = (Fruta) this.restaurante.buscarIngrediente(nombreFruta);
            this.proteina = (Proteina) this.restaurante.buscarIngrediente(nombreProteina);
            this.grano = (Grano) this.restaurante.buscarIngrediente(nombreGrano);
            this.almidon = (Almidon) this.restaurante.buscarIngrediente(nombreAlmidon);
            
            if(this.fruta == null || this.proteina == null || this.grano == null || this.almidon == null) throw new RuntimeException("No hay suficientes ingredientes...");
            
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
        boolean aux = false;
        if(fruta >= PORCION_FRUTA && proteina >= PORCION_PROTEINA && grano >= PORCION_GRANO && almidon >= PORCION_ALMIDON){
            aux = true;
        }
        return aux;
    }
    
    /*Le informa a cada ingrediente de este Almuerzo que se realizo una venta, para que se registre*/
    public void registrarVenta(){
        //Complete
        if(sePuedePreparar() == true){
            fruta -= PORCION_FRUTA;
            proteina -= PORCION_PROTEINA;
            grano -= PORCION_GRANO;
            almidon -= PORCION_ALMIDON;
        }
            
    }
    
    public boolean equals(Object obj){
        //Complete
        Almuerzo almuerzo = (Almuerzo)obj;
        //if(obj instanceof Almuerzo) return ;
        return false;
    }
}
