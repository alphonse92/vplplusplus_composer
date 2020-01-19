
/**
 *
 * @author (Oscar Bayona - 1151906)
 * @version 1 :) --> Math.sin(Math.PI-Double.MIN_VALUE)
 * 
 * Nota, para lanzar un error use throw new RuntimeException("Mensaje de Error");
 * Pruebe en BlueJ en el Codepad para que comprenda lo que sucede y pregunte al profesor...
 */
class MaquinaSandwich {

    static final int CANTIDAD_BASE_QUESO = 15;
    static final int CANTIDAD_BASE_MORTADELA_JAMON = 10;
    static final int CANTIDAD_BASE_PAN = 1;

    int cantidadQueso;
    int cantidadMortadela;
    int cantidadJamon;
    int cantidadPanBlanco;
    int cantidadPanIntegral;

    int precioCompraQueso;
    int precioCompraMortadela;
    int precioCompraJamon;
    int precioCompraPanBlanco;
    int precioCompraPanIntegral;

    int ingresosPorVentas;

    /*Recuerde que no necesita declarar propiedades adicionales*/

    /**
     * Constructor que se encarga de inicializar la máquina con la cantidad de cada ingrediente
     */
    MaquinaSandwich() {
        this.cantidadQueso = 3000;
        this.cantidadMortadela = 1000;
        this.cantidadJamon = 1000;
        this.cantidadPanBlanco = 100;
        this.cantidadPanIntegral = 100;
    }

    /**
     * Constructor que se encarga de inicializar la máquina con los precios de compra de los ingredientes
     */
    MaquinaSandwich(int precioCompraQueso, int precioCompraMortadela, int precioCompraJamon, int precioCompraPanBlanco, int precioCompraPanIntegral) {
        this();//No quite esta línea, llama al constructor anterior para reutilizar
        this.precioCompraQueso = precioCompraQueso;
        this.precioCompraMortadela = precioCompraMortadela;
        this.precioCompraJamon = precioCompraJamon;
        this.precioCompraPanBlanco = precioCompraPanBlanco;
        this.precioCompraPanIntegral = precioCompraPanIntegral;
    }

    /**
     * Método que calcula el costo de fabricación. Recibe el tipo de sandwich (1,2,3,4,5 y 6) y el tipo de pan (1 y 2)
     */
    public int calcularCostoFabricacion(int tipoSandwich, int tipoPan) {
        /*COMPLETE*/
        int costo = 0;
        int a=0,b=0;
        if (tipoPan == 1){  a = 1;  b = 0;}
        else {  a = 0;  b = 1;}
        if (tipoSandwich == 1 || tipoSandwich == 3 || tipoSandwich == 5 ){
            costo = ((tipoSandwich+1)/2) * 15 * precioCompraQueso + precioCompraMortadela * 10 * ((tipoSandwich+1)/2) 
            + ((tipoSandwich+1)/2)*a*precioCompraPanBlanco + ((tipoSandwich+1)/2)*b*precioCompraPanIntegral;
        }
        else{
            costo = ((tipoSandwich+1)/2) * 15 * precioCompraQueso + precioCompraJamon * 10 * ((tipoSandwich+1)/2) 
            + ((tipoSandwich+1)/2)*a*precioCompraPanBlanco + ((tipoSandwich+1)/2)*b*precioCompraPanIntegral;
        }
        return costo;
    }

    /**
     * Método que calcula el precio de venta. Recibe el tipo de sandwich (1,2,3,4,5 y 6) y el tipo de pan (1 y 2)
     * ...Se supone que éste método debe invocar al método anterior...
     */
    public int calcularPrecioVenta(int tipoSandwich, int tipoPan) {
        /*COMPLETE*/
        int costo = calcularCostoFabricacion( tipoSandwich,  tipoPan);
        return costo + costo*35/100;
    }

    /**
     * Registra la venta de un sandwich. Recibe el tipo de sandwich (1,2,3,4,5 y 6) y el tipo de pan (1 y 2)
     */
    public void registrarVenta(int tipoSandwich, int tipoPan) {
        if (tipoSandwich == 1 || tipoSandwich == 3 || tipoSandwich == 5 )  {
            if (tipoPan == 1){
                if (cantidadQueso>=(((tipoSandwich+1)/2) * 15) && cantidadMortadela>=(10 * ((tipoSandwich+1)/2)) && cantidadPanBlanco>=((tipoSandwich+1)/2)){
                    this.cantidadQueso = this.cantidadQueso - (((tipoSandwich+1)/2) * 15);
                    this.cantidadMortadela = this.cantidadMortadela - (10 * ((tipoSandwich+1)/2));
                    this.cantidadPanBlanco = this.cantidadPanBlanco - ((tipoSandwich+1)/2);
                    this.ingresosPorVentas = this.ingresosPorVentas + calcularPrecioVenta(tipoSandwich,tipoPan);
                }
                else {throw new RuntimeException("Ingredientes Insuficientes");}
            }
            else {
                if(cantidadQueso>=(((tipoSandwich+1)/2) * 15) && cantidadMortadela>=(10 * ((tipoSandwich+1)/2)) && cantidadPanIntegral>=((tipoSandwich+1)/2)){
                    this.cantidadQueso = this.cantidadQueso - (((tipoSandwich+1)/2) * 15);
                    this.cantidadMortadela = this.cantidadMortadela - (10 * ((tipoSandwich+1)/2));
                    this.cantidadPanIntegral = this.cantidadPanIntegral - ((tipoSandwich+1)/2);
                    this.ingresosPorVentas = this.ingresosPorVentas + calcularPrecioVenta(tipoSandwich,tipoPan);
                }
                else {throw new RuntimeException("Ingredientes Insuficientes");}
            }
        }
        else {
            if (tipoPan == 1){
                if (cantidadQueso>=(((tipoSandwich+1)/2) * 15) && cantidadJamon>=(10 * ((tipoSandwich+1)/2)) && cantidadPanBlanco>=((tipoSandwich+1)/2)){
                    this.cantidadQueso = this.cantidadQueso - (((tipoSandwich+1)/2) * 15);
                    this.cantidadJamon = this.cantidadJamon - (10 * ((tipoSandwich+1)/2));
                    this.cantidadPanBlanco = this.cantidadPanBlanco - ((tipoSandwich+1)/2);
                    this.ingresosPorVentas = this.ingresosPorVentas + calcularPrecioVenta(tipoSandwich,tipoPan);
                }
                else {throw new RuntimeException("Ingredientes Insuficientes");}
            }
            else {
                if(cantidadQueso>=(((tipoSandwich+1)/2) * 15) && cantidadJamon>=(10 * ((tipoSandwich+1)/2)) && cantidadPanIntegral>=((tipoSandwich+1)/2)){
                    this.cantidadQueso = this.cantidadQueso - (((tipoSandwich+1)/2) * 15);
                    this.cantidadJamon = this.cantidadJamon - (10 * ((tipoSandwich+1)/2));
                    this.cantidadPanIntegral = this.cantidadPanIntegral - ((tipoSandwich+1)/2);
                    this.ingresosPorVentas = this.ingresosPorVentas + calcularPrecioVenta(tipoSandwich,tipoPan);
                }
                else {throw new RuntimeException("Ingredientes Insuficientes");}
            }
        }
    }

    /**
     * Calcula y retorna el valor en pesos el IVA sobre el total de ingresos por ventas
     */
    public int getIVA() {
        /*COMPLETE*/
        return (this.ingresosPorVentas*19)/100;
    }

    /**
     * Calcula y retorna el valor en pesos de los costos fijos sobre el total de ingresos por ventas
     */
    public int getCostosFijos() {
        /*COMPLETE*/
        return (this.ingresosPorVentas*5)/100;
    }

    /**
     * Calcula y retorna el valor en pesos de los riesgos sobre el total de ingresos por ventas
     */
    public int getRiesgos() {
        /*COMPLETE*/
        return (this.ingresosPorVentas*1)/100;
    }

    /**
     * Calcula y retorna el valor en pesos de la ganancia neta sobre el total de ingresos por ventas
     */
    public int getGananciaNeta() {
        /*COMPLETE*/
        return this.ingresosPorVentas/10;
    }

    /*COMPLETE LOS METODOS GET/SET DE LAS PROPIEDADES*/

    //Start GetterSetterExtension Code
    /**Getter method CANTIDAD_BASE_QUESO*/
    public int getCANTIDAD_BASE_QUESO(){
        return this.CANTIDAD_BASE_QUESO;
    }//end method getCANTIDAD_BASE_QUESO

    /**Getter method CANTIDAD_BASE_MORTADELA_JAMON*/
    public int getCANTIDAD_BASE_MORTADELA_JAMON(){
        return this.CANTIDAD_BASE_MORTADELA_JAMON;
    }//end method getCANTIDAD_BASE_MORTADELA_JAMON

    /**Getter method CANTIDAD_BASE_PAN*/
    public int getCANTIDAD_BASE_PAN(){
        return this.CANTIDAD_BASE_PAN;
    }//end method getCANTIDAD_BASE_PAN

    /**Getter method cantidadQueso*/
    public int getCantidadQueso(){
        return this.cantidadQueso;
    }//end method getCantidadQueso

    /**Setter method cantidadQueso*/
    public void setCantidadQueso(int cantidadQueso){
        this.cantidadQueso = cantidadQueso;
    }//end method setCantidadQueso

    /**Getter method cantidadMortadela*/
    public int getCantidadMortadela(){
        return this.cantidadMortadela;
    }//end method getCantidadMortadela

    /**Setter method cantidadMortadela*/
    public void setCantidadMortadela(int cantidadMortadela){
        this.cantidadMortadela = cantidadMortadela;
    }//end method setCantidadMortadela

    /**Getter method cantidadJamon*/
    public int getCantidadJamon(){
        return this.cantidadJamon;
    }//end method getCantidadJamon

    /**Setter method cantidadJamon*/
    public void setCantidadJamon(int cantidadJamon){
        this.cantidadJamon = cantidadJamon;
    }//end method setCantidadJamon

    /**Getter method cantidadPanBlanco*/
    public int getCantidadPanBlanco(){
        return this.cantidadPanBlanco;
    }//end method getCantidadPanBlanco

    /**Setter method cantidadPanBlanco*/
    public void setCantidadPanBlanco(int cantidadPanBlanco){
        this.cantidadPanBlanco = cantidadPanBlanco;
    }//end method setCantidadPanBlanco

    /**Getter method cantidadPanIntegral*/
    public int getCantidadPanIntegral(){
        return this.cantidadPanIntegral;
    }//end method getCantidadPanIntegral

    /**Setter method cantidadPanIntegral*/
    public void setCantidadPanIntegral(int cantidadPanIntegral){
        this.cantidadPanIntegral = cantidadPanIntegral;
    }//end method setCantidadPanIntegral

    /**Getter method precioCompraQueso*/
    public int getPrecioCompraQueso(){
        return this.precioCompraQueso;
    }//end method getPrecioCompraQueso

    /**Setter method precioCompraQueso*/
    public void setPrecioCompraQueso(int precioCompraQueso){
        this.precioCompraQueso = precioCompraQueso;
    }//end method setPrecioCompraQueso

    /**Getter method precioCompraMortadela*/
    public int getPrecioCompraMortadela(){
        return this.precioCompraMortadela;
    }//end method getPrecioCompraMortadela

    /**Setter method precioCompraMortadela*/
    public void setPrecioCompraMortadela(int precioCompraMortadela){
        this.precioCompraMortadela = precioCompraMortadela;
    }//end method setPrecioCompraMortadela

    /**Getter method precioCompraJamon*/
    public int getPrecioCompraJamon(){
        return this.precioCompraJamon;
    }//end method getPrecioCompraJamon

    /**Setter method precioCompraJamon*/
    public void setPrecioCompraJamon(int precioCompraJamon){
        this.precioCompraJamon = precioCompraJamon;
    }//end method setPrecioCompraJamon

    /**Getter method precioCompraPanBlanco*/
    public int getPrecioCompraPanBlanco(){
        return this.precioCompraPanBlanco;
    }//end method getPrecioCompraPanBlanco

    /**Setter method precioCompraPanBlanco*/
    public void setPrecioCompraPanBlanco(int precioCompraPanBlanco){
        this.precioCompraPanBlanco = precioCompraPanBlanco;
    }//end method setPrecioCompraPanBlanco

    /**Getter method precioCompraPanIntegral*/
    public int getPrecioCompraPanIntegral(){
        return this.precioCompraPanIntegral;
    }//end method getPrecioCompraPanIntegral

    /**Setter method precioCompraPanIntegral*/
    public void setPrecioCompraPanIntegral(int precioCompraPanIntegral){
        this.precioCompraPanIntegral = precioCompraPanIntegral;
    }//end method setPrecioCompraPanIntegral

    /**Getter method ingresosPorVentas*/
    public int getIngresosPorVentas(){
        return this.ingresosPorVentas;
    }//end method getIngresosPorVentas

    /**Setter method ingresosPorVentas*/
    public void setIngresosPorVentas(int ingresosPorVentas){
        this.ingresosPorVentas = ingresosPorVentas;
    }//end method setIngresosPorVentas

    //End GetterSetterExtension Code
    //!
}
