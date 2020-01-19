/**
* Grupo 8: Valentina Rico      1151910
*          Edinsson Montoya    1151901
*
*/
public class Almuerzo {

    private static final int PORCION_FRUTA = 30;
    private static final int PORCION_PROTEINA = 200;
    private static final int PORCION_GRANO = 100;
    private static final int PORCION_ALMIDON = 50;

    private Restaurante restaurante;

    private Fruta fruta;
    private Proteina proteina;
    private Grano grano;
    private Almidon almidon;
    //Complete

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
        int precio = 0;  
        precio += ((this.fruta.getPrecioCompra()*PORCION_FRUTA) + (this.proteina.getPrecioCompra()*PORCION_PROTEINA) 
            + (this.grano.getPrecioCompra()*PORCION_GRANO) + (this.almidon.getPrecioCompra()*PORCION_ALMIDON))*1.35;
        return precio;
        //Complete
    }

    /*Verifica si se puede preparar este Almuerzo*/
    public boolean sePuedePreparar() {
        boolean sePuede = false;
        sePuede = this.fruta.getCantidadDisponible()>=PORCION_FRUTA && this.proteina.getCantidadDisponible()>=PORCION_PROTEINA 
        && this.grano.getCantidadDisponible()>=PORCION_GRANO && this.almidon.getCantidadDisponible()>=PORCION_ALMIDON;
        return sePuede;
        //Complete
    }

    /*Le informa a cada ingrediente de este Almuerzo que se realizo una venta, para que se registre*/
    public void registrarVenta(){
        this.fruta.registrarVenta(PORCION_FRUTA);
        this.proteina.registrarVenta(PORCION_PROTEINA);
        this.grano.registrarVenta(PORCION_GRANO);
        this.almidon.registrarVenta(PORCION_ALMIDON);
        //Complete
    }

    public boolean equals(Object obj){
        boolean equal = false;
        Almuerzo almuerzo = null;
        if(obj instanceof Almuerzo){
            almuerzo = (Almuerzo)obj;
            equal = this.fruta.equals(almuerzo.fruta) && this.proteina.equals(almuerzo.proteina) && this.grano.equals(almuerzo.grano) 
            && this.almidon.equals(almuerzo.almidon);
        }
        return equal;
        //Complete
    }
}