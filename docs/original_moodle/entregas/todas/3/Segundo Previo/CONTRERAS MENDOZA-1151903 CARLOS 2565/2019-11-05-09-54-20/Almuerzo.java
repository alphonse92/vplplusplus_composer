
public class Almuerzo {

    private static final int PORCION_FRUTA = 30;
    private static final int PORCION_PROTEINA = 200;
    private static final int PORCION_GRANO = 100;
    private static final int PORCION_ALMIDON = 50;

    //Complete
    Restaurante restaurante;
    Fruta fruta;
    Proteina proteina;
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
       int precioVenta = 0;
       precioVenta += this.fruta.getPrecioCompra() * PORCION_FRUTA;
       precioVenta += this.proteina.getPrecioCompra() * PORCION_PROTEINA;
       precioVenta += this.grano.getPrecioCompra() * PORCION_GRANO;
       precioVenta += this.almidon.getPrecioCompra() * PORCION_ALMIDON;
       precioVenta = precioVenta + precioVenta * 35 / 100;
       return precioVenta;
    }

    /*Verifica si se puede preparar este Almuerzo*/
    public boolean sePuedePreparar() {
        //Complete
        boolean sePuede = false;
        sePuede = (this.fruta.getCantidadDisponible() >= PORCION_FRUTA 
            && this.proteina.getCantidadDisponible() >= PORCION_PROTEINA 
            && this.grano.getCantidadDisponible() >= PORCION_GRANO   
            && this.almidon.getCantidadDisponible() >= PORCION_ALMIDON);
        return sePuede;
    }
    
    /*Le informa a cada ingrediente de este Almuerzo que se realizo una venta, para que se registre*/
    public void registrarVenta(){
        //Complete
        this.fruta.registrarVenta(PORCION_FRUTA);
        this.proteina.registrarVenta(PORCION_PROTEINA);
        this.grano.registrarVenta(PORCION_GRANO);
        this.almidon.registrarVenta(PORCION_ALMIDON);
    }
    
    public boolean equals(Object obj){
      //Complete
      boolean rta = false;
        if(obj instanceof Object){
            Almuerzo x = (Almuerzo)obj;
            rta = this.fruta.getNombre() == x.fruta.getNombre()
                && this.proteina.getNombre() == x.proteina.getNombre()
                    && this.grano.getNombre() == x.grano.getNombre()
                    && this.almidon.getNombre() == x.almidon.getNombre();
        }
        return rta;
    }
}
