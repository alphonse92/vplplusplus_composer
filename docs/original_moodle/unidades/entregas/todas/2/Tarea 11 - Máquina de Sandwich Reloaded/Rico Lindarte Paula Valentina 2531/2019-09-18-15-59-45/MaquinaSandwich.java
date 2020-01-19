
/**
 *
 * @author (Escriba nombres y codigos)
 * @version 0.000000000000001 :) --> Math.sin(Math.PI-Double.MIN_VALUE)
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
        this();
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
        int aux = tipoSandwich / 2;
        int precioPan, precioMortadelaJamon;
        if(tipoSandwich % 2 == 0) precioMortadelaJamon = getPrecioCompraJamon();
        else{
            aux = (++aux * 2) / 2;
            precioMortadelaJamon = getPrecioCompraMortadela();
        }

        if(tipoPan == 1) precioPan = getPrecioCompraPanBlanco();
        else precioPan = getPrecioCompraPanIntegral();

        return getPrecioCompraQueso() * (10 * aux + aux*5) + precioMortadelaJamon * (aux*10) + precioPan * aux;
    }

    /**
     * Método que calcula el precio de venta. Recibe el tipo de sandwich (1,2,3,4,5 y 6) y el tipo de pan (1 y 2)
     * ...Se supone que éste método debe invocar al método anterior...
     */
    public int calcularPrecioVenta(int tipoSandwich, int tipoPan) {
        int costoFabricacion = calcularCostoFabricacion(tipoSandwich, tipoPan);
        return costoFabricacion + (int) (costoFabricacion * 0.35);
    }

    /**
     * Registra la venta de un sandwich. Recibe el tipo de sandwich (1,2,3,4,5 y 6) y el tipo de pan (1 y 2)
     */
    public void registrarVenta(int tipoSandwich, int tipoPan) {
        int aux = tipoSandwich / 2;
        if(tipoPan == 1){
            if (tipoSandwich % 2 == 0 ){
                if(getCantidadQueso() >= 10*aux+aux*5 && getCantidadJamon() >= aux*10 && getCantidadPanBlanco() >= aux){
                    this.cantidadQueso -= 10 * aux + aux*5;
                    this.cantidadJamon -= aux*10;
                    this.cantidadPanBlanco -= aux;
                    this.ingresosPorVentas += calcularPrecioVenta(tipoSandwich, tipoPan);
                }
                else throw new RuntimeException("Mensaje de Error");
            }
            else{
                aux = (++aux * 2) / 2;
                if(getCantidadQueso() >= 10*aux+aux*5 && getCantidadMortadela() >= aux*10 && getCantidadPanBlanco() >= aux){
                    this.cantidadQueso -= 10 * aux + aux*5;
                    this.cantidadMortadela -= aux*10;
                    this.cantidadPanBlanco -= aux;
                    this.ingresosPorVentas += calcularPrecioVenta(tipoSandwich, tipoPan);
                }
                else throw new RuntimeException("Mensaje de Error");
            }
        }
        else{
            if (tipoSandwich % 2 == 0 ){
                if(getCantidadQueso() >= 10*aux+aux*5 && getCantidadJamon() >= aux*10 && getCantidadPanIntegral() >= aux){
                    this.cantidadQueso -= 10 * aux + aux*5;
                    this.cantidadJamon -= aux*10;
                    this.cantidadPanIntegral -= aux;
                    this.ingresosPorVentas += calcularPrecioVenta(tipoSandwich, tipoPan);
                }
                else throw new RuntimeException("Mensaje de Error");
            }
            else{
                aux = (++aux * 2) / 2;
                if(getCantidadQueso() >= 10*aux+aux*5 && getCantidadMortadela() >= aux*10 && getCantidadPanIntegral() >= aux){
                    this.cantidadQueso -= 10 * aux + aux*5;
                    this.cantidadMortadela -= aux*10;
                    this.cantidadPanIntegral -= aux;
                    this.ingresosPorVentas += calcularPrecioVenta(tipoSandwich, tipoPan);
                }
                else throw new RuntimeException("Mensaje de Error");
            }
        }
    }

    /**
     * Calcula y retorna el valor en pesos el IVA sobre el total de ingresos por ventas
     */
    public int getIVA() {
        return (int) (getIngresosPorVentas() * 0.19);
    }

    /**
     * Calcula y retorna el valor en pesos de los costos fijos sobre el total de ingresos por ventas
     */
    public int getCostosFijos() {
        return (int) (getIngresosPorVentas() * 0.05);
    }

    /**
     * Calcula y retorna el valor en pesos de los riesgos sobre el total de ingresos por ventas
     */
    public int getRiesgos() {
        return (int) (getIngresosPorVentas() * 0.01);
    }

    /**
     * Calcula y retorna el valor en pesos de la ganancia neta sobre el total de ingresos por ventas
     */
    public int getGananciaNeta() {
        return (int) (getIngresosPorVentas() * 0.10);
    }

    /*COMPLETE LOS METODOS GET/SET DE LAS PROPIEDADES*/

    public int getCantidadQueso() {
        return cantidadQueso;
    }

    public void setCantidadQueso(int cantidadQueso) {
        this.cantidadQueso = cantidadQueso;
    }

    public int getCantidadMortadela() {
        return cantidadMortadela;
    }

    public void setCantidadMortadela(int cantidadMortadela) {
        this.cantidadMortadela = cantidadMortadela;
    }

    public int getCantidadJamon() {
        return cantidadJamon;
    }

    public void setCantidadJamon(int cantidadJamon) {
        this.cantidadJamon = cantidadJamon;
    }

    public int getCantidadPanBlanco() {
        return cantidadPanBlanco;
    }

    public void setCantidadPanBlanco(int cantidadPanBlanco) {
        this.cantidadPanBlanco = cantidadPanBlanco;
    }

    public int getCantidadPanIntegral() {
        return cantidadPanIntegral;
    }

    public void setCantidadPanIntegral(int cantidadPanIntegral) {
        this.cantidadPanIntegral = cantidadPanIntegral;
    }

    public int getPrecioCompraQueso() {
        return precioCompraQueso;
    }

    public void setPrecioCompraQueso(int precioCompraQueso) {
        this.precioCompraQueso = precioCompraQueso;
    }

    public int getPrecioCompraJamon() {
        return precioCompraJamon;
    }

    public void setPrecioCompraJamon(int precioCompraJamon) {
        this.precioCompraJamon = precioCompraJamon;
    }

    public int getPrecioCompraMortadela() {
        return precioCompraMortadela;
    }

    public void setPrecioCompraMortadela(int precioCompraMortadela) {
        this.precioCompraMortadela = precioCompraMortadela;
    }

    public int getPrecioCompraPanBlanco() {
        return precioCompraPanBlanco;
    }

    public void setPrecioCompraPanBlanco(int precioCompraPanBlanco) {
        this.precioCompraPanBlanco = precioCompraPanBlanco;
    }

    public int getPrecioCompraPanIntegral() {
        return precioCompraPanIntegral;
    }

    public void setPrecioCompraPanIntegral(int precioCompraPanIntegral) {
        this.precioCompraPanIntegral = precioCompraPanIntegral;
    }

    public int getIngresosPorVentas() {
        return ingresosPorVentas;
    }

    public void setIngresosPorVentas(int ingresosPorVentas) {
        this.ingresosPorVentas = ingresosPorVentas;
    }

}
