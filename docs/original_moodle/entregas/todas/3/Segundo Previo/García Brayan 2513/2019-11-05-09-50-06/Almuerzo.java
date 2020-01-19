
public class Almuerzo {

    private static final int PORCION_FRUTA = 30;
    private static final int PORCION_PROTEINA = 200;
    private static final int PORCION_GRANO = 100;
    private static final int PORCION_ALMIDON = 50;

    //Complete
    protected Restaurante restaurante;
    protected Fruta fruta;
    protected Proteina proteina;
    protected Grano grano;
    protected Almidon almidon;
    
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
        int precioVenta = 0;
        precioVenta += PORCION_FRUTA*fruta.getPrecioCompra() + PORCION_GRANO*grano.getPrecioCompra() + PORCION_PROTEINA*proteina.getPrecioCompra() +
                       PORCION_ALMIDON*almidon.getPrecioCompra();
        precioVenta *= 1.35;
        return precioVenta;
       //Complete
    }

    /*Verifica si se puede preparar este Almuerzo*/
    public boolean sePuedePreparar() {
        return this.fruta.getCantidadDisponible() > PORCION_FRUTA && this.proteina.getCantidadDisponible() > PORCION_PROTEINA &&
               this.grano.getCantidadDisponible() > PORCION_GRANO && this.almidon.getCantidadDisponible() > PORCION_ALMIDON;
        //Complete
    }
    
    /*Le informa a cada ingrediente de este Almuerzo que se realizo una venta, para que se registre*/
    public void registrarVenta(){
        //Complete
        fruta.registrarVenta(PORCION_FRUTA);
        proteina.registrarVenta(PORCION_PROTEINA);
        grano.registrarVenta(PORCION_GRANO);
        almidon.registrarVenta(PORCION_ALMIDON);
    }
    
    public boolean equals(Object obj){
      //Complet      
      if(obj instanceof Almuerzo) return ((Almuerzo)obj).restaurante.equals(this.restaurante) && ((Almuerzo)obj).fruta.equals(this.fruta) && ((Almuerzo)obj).grano.equals(this.grano)&&
                                         ((Almuerzo)obj).proteina.equals(this.proteina) && ((Almuerzo)obj).almidon.equals(this.almidon);
      return false;
    }
}
