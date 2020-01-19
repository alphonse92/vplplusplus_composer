/*
 * Grupo 1
 * Johnny Quintero 1151870
 * Daniela Sanchez 1151947
 */
public class Almuerzo {

    private static final int PORCION_FRUTA = 30;
    private static final int PORCION_PROTEINA = 200;
    private static final int PORCION_GRANO = 100;
    private static final int PORCION_ALMIDON = 50;

    //Complete
    private Fruta fruta;
    private Proteina proteina;
    private Grano grano;
    private Almidon almidon;
    private Restaurante restaurante;

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
       int precio=0;
       precio+=((fruta.getPrecioCompra()*PORCION_FRUTA)+(proteina.getPrecioCompra()*PORCION_PROTEINA) + (grano.getPrecioCompra()*PORCION_GRANO) + 
              (almidon.getPrecioCompra()*PORCION_ALMIDON))*1.35;
       return precio;
    }

    /*Verifica si se puede preparar este Almuerzo*/
    public boolean sePuedePreparar() {
        //Complete
        boolean sePuedePreparar=false;
        if (fruta.getCantidadDisponible()>= PORCION_FRUTA && proteina.getCantidadDisponible()>= PORCION_PROTEINA && grano.getCantidadDisponible()>= PORCION_GRANO &&
               almidon.getCantidadDisponible()>= PORCION_ALMIDON)
        sePuedePreparar=true;
        return sePuedePreparar;
    }
    
    /*Le informa a cada ingrediente de este Almuerzo que se realizo una venta, para que se registre*/
    public void registrarVenta(){
        //Complete
        this.fruta.registrarVenta(PORCION_FRUTA);
        this.almidon.registrarVenta(PORCION_ALMIDON);
        this.grano.registrarVenta(PORCION_GRANO);
        this.proteina.registrarVenta(PORCION_PROTEINA);
    }
    
    public boolean equals(Object obj){
      //Complete
      boolean equal = false;
        if(obj instanceof Almuerzo){
            Almuerzo x = (Almuerzo)obj;
            equal = this.fruta == x.fruta &&  this.proteina == x.proteina &&  this.grano == x.grano &&
                    this.almidon==x.almidon;            
        }
        return equal;
    }
}
