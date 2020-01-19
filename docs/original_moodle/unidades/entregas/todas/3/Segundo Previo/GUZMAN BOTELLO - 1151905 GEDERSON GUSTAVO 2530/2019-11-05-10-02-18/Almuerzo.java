public class Almuerzo {

    private static final int PORCION_FRUTA = 30;
    private static final int PORCION_PROTEINA = 200;
    private static final int PORCION_GRANO = 100;
    private static final int PORCION_ALMIDON = 50;

    //Complete
    Almidon almidon;
    Grano grano;
    Proteina proteina;
    Fruta fruta;
    Restaurante restaurante;

    public Almuerzo(Restaurante restaurante, String nombreFruta, String nombreProteina, String nombreGrano, String nombreAlmidon) {
        this.restaurante = restaurante;
        try {
            this.fruta = (Fruta) this.restaurante.buscarIngrediente(nombreFruta);
            this.proteina = (Proteina) this.restaurante.buscarIngrediente(nombreProteina);
            this.grano = (Grano) this.restaurante.buscarIngrediente(nombreGrano);
            this.almidon = (Almidon) this.restaurante.buscarIngrediente(nombreAlmidon);
            
            if(this.fruta == null || this.proteina == null || this.grano == null || this.almidon == null) throw new RuntimeException("No hay suficientes ingredientes...");
            
        } catch (Exception e) {
            throw new RuntimeException("Error en clase Almuerzo: " + e.getMessage());
        }
    }

    /*Calcula el precio de venta de este Almuerzo*/
    public int getPrecioVenta() {
       //Complete
       int total=0;
       total+=fruta.getPrecioCompra()*PORCION_FRUTA;
       total+=proteina.getPrecioCompra()*PORCION_PROTEINA;
       total+=grano.getPrecioCompra()*PORCION_GRANO;
       total+=almidon.getPrecioCompra()*PORCION_ALMIDON;
       total+=total*0.35;
       return total;
    }

    /*Verifica si se puede preparar este Almuerzo*/
    public boolean sePuedePreparar() {
        //Complete
        if(fruta.getCantidadDisponible()>=PORCION_FRUTA&&proteina.getCantidadDisponible()>=PORCION_PROTEINA&&
        almidon.getCantidadDisponible()>=PORCION_ALMIDON&&grano.getCantidadDisponible()>=PORCION_GRANO){
            registrarVenta();
            return true;
        }
        return false;
    }
    
    /*Le informa a cada ingrediente de este Almuerzo que se realizo una venta, para que se registre*/
    public void registrarVenta(){
        //Complete
        fruta.registrarVenta(PORCION_FRUTA);
        almidon.registrarVenta(PORCION_ALMIDON);
        grano.registrarVenta(PORCION_GRANO);
        proteina.registrarVenta(PORCION_PROTEINA);        
    }
    
    public boolean equals(Object obj){
      //Complete
      return false;
    }

    //Start GetterSetterExtension Code    

    /**Getter method almidon*/
    public Almidon getAlmidon(){
        return this.almidon;
    }//end method getAlmidon

    /**Setter method almidon*/
    public void setAlmidon(Almidon almidon){
        this.almidon = almidon;
    }//end method setAlmidon

    /**Getter method grano*/
    public Grano getGrano(){
        return this.grano;
    }//end method getGrano

    /**Setter method grano*/
    public void setGrano(Grano grano){
        this.grano = grano;
    }//end method setGrano

    /**Getter method proteina*/
    public Proteina getProteina(){
        return this.proteina;
    }//end method getProteina

    /**Setter method proteina*/
    public void setProteina(Proteina proteina){
        this.proteina = proteina;
    }//end method setProteina

    /**Getter method fruta*/
    public Fruta getFruta(){
        return this.fruta;
    }//end method getFruta

    /**Setter method fruta*/
    public void setFruta(Fruta fruta){
        this.fruta = fruta;
    }//end method setFruta

    /**Getter method restaurante*/
    public Restaurante getRestaurante(){
        return this.restaurante;
    }//end method getRestaurante

    /**Setter method restaurante*/
    public void setRestaurante(Restaurante restaurante){
        this.restaurante = restaurante;
    }//end method setRestaurante

    //End GetterSetterExtension Code
//!
}
