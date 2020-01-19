public class Almuerzo {

    private static final int PORCION_FRUTA = 30;
    private static final int PORCION_PROTEINA = 200;
    private static final int PORCION_GRANO = 100;
    private static final int PORCION_ALMIDON = 50;

    //Complete
    private Restaurante restaurante;
    private Fruta fruta;
    private Proteina proteina;
    private Grano grano;
    private Almidon almidon;

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
       int precio = (this.fruta.getPrecioCompra() * PORCION_FRUTA) + (this.proteina.getPrecioCompra() * PORCION_PROTEINA) + 
       (this.grano.getPrecioCompra() * PORCION_GRANO) + (this.almidon.getPrecioCompra() * PORCION_ALMIDON);
       
       return (int) (precio * 1.35);
    }

    /*Verifica si se puede preparar este Almuerzo*/
    public boolean sePuedePreparar() {
        return this.fruta.getCantidadDisponible() >= PORCION_FRUTA && this.proteina.getCantidadDisponible() >= PORCION_PROTEINA
        && this.grano.getCantidadDisponible() >= PORCION_GRANO && this.almidon.getCantidadDisponible() >= PORCION_ALMIDON;
    }
    
    /*Le informa a cada ingrediente de este Almuerzo que se realizo una venta, para que se registre*/
    public void registrarVenta(){
        this.fruta.setCantidadDisponible(this.fruta.getCantidadDisponible() - PORCION_FRUTA);
        this.proteina.setCantidadDisponible(this.proteina.getCantidadDisponible() - PORCION_PROTEINA);
        this.grano.setCantidadDisponible(this.grano.getCantidadDisponible() - PORCION_GRANO);
        this.almidon.setCantidadDisponible(this.almidon.getCantidadDisponible() - PORCION_ALMIDON);
    }
    
    public boolean equals(Object obj){
      return false;
    }
}
