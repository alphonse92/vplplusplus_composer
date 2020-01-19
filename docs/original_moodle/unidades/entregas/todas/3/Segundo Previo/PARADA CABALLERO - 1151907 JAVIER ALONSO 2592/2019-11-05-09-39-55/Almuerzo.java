//JAVIER ALONSO PARADA CABALLERO Y FELIPE ALFEREZ VILLAMIZAR GRUPO 9
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
        int precioVenta = 0;
        precioVenta += this.fruta.getPrecioCompra() * 30;
        precioVenta += this.proteina.getPrecioCompra() * 200;
        precioVenta += this.grano.getPrecioCompra() * 100;
        precioVenta += this.almidon.getPrecioCompra() * 50;
        precioVenta += precioVenta * 35 / 100;
        return precioVenta;
    }

    /*Verifica si se puede preparar este Almuerzo*/
    public boolean sePuedePreparar() {
        boolean sePuede = false;
        sePuede = (this.fruta.getCantidadDisponible() >= 30 && this.proteina.getCantidadDisponible() >= 200 && this.grano.getCantidadDisponible() >= 100 && this.almidon.getCantidadDisponible() >= 50);
        return sePuede;
    }

    /*Le informa a cada ingrediente de este Almuerzo que se realizo una venta, para que se registre*/
    public void registrarVenta(){
        //Complete
        this.fruta.registrarVenta(30);
        this.proteina.registrarVenta(200);
        this.grano.registrarVenta(100);
        this.almidon.registrarVenta(50);
    }

    public boolean equals(Object obj){
        //Complete
        return false;
    }
}
