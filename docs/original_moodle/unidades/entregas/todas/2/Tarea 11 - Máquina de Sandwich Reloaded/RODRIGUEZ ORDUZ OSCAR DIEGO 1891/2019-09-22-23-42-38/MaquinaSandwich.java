/**
 *
 * @author (Escriba nombres y codigos)
 * @version 0.000000000000001 :) --> Math.sin(Math.PI-Double.MIN_VALUE)
 * 
 * Nota, para lanzar un error use throw new RuntimeException("Mensaje de Error");
 * Pruebe en BlueJ en el Codepad para que comprenda lo que sucede y pregunte al profesor...
 */
class MaquinaSandwich{

    /**Cantidad base de queso para la receta del Sandwich*/
    static final int CANTIDAD_BASE_QUESO = 15;
    /**Cantidad base de mortadela para la receta del Sandwich*/
    static final int CANTIDAD_BASE_MORTADELA_JAMON = 10;
    /**Cantidad base de pan (blanco o integral) para la receta del Sandwich*/
    static final int CANTIDAD_BASE_PAN = 1;

    /**Cantidad de queso que tiene la maquina. No puede ser una cantidad negativa*/
    int cantidadQueso;

    /**Cantidad de mostadela que tiene la maquina. No puede ser una cantidad negativa*/
    int cantidadMortadela;

    /**Cantidad de jamon que tiene la maquina. No puede ser una cantidad negativa*/
    int cantidadJamon;

    /**Cantidad de pan blanco que tiene la maquina. No puede ser una cantidad negativa*/
    int cantidadPanBlanco;

    /**Cantidad de pan integral que tiene la maquina. No puede ser una cantidad negativa*/
    int cantidadPanIntegral;

    /**Precio de compra del queso. Se establece al crear la maquina*/
    int precioCompraQueso;

    /**Precio de compra de la mortadela. Se establece al crear la maquina*/
    int precioCompraMortadela;

    /**Precio de compra del jamon. Se establece al crear la maquina*/
    int precioCompraJamon;

    /**Precio de compra del pan blanco. Se establece al crear la maquina*/
    int precioCompraPanBlanco;

    /**Precio de compra del pan integral. Se establece al crear la maquina*/
    int precioCompraPanIntegral;

    /**Dinero que ha ingresado por las ventas de Sandwich de la maquina*/
    int ingresosPorVentas;

    MaquinaSandwich() {
        this.cantidadQueso = 3000;
        this.cantidadMortadela  =1000;
        this.cantidadJamon = 1000;
        this.cantidadPanBlanco = 100;
        this.cantidadPanIntegral = 100;
        this.ingresosPorVentas = 0;
    }

    /**
     * Constructor con parametros.
     * Recibe el precio de los ingredientes
     * @param precioCompraQueso Precio al cual se compra el ingrediente, requerido para calcular precios de fabricacion y venta.
     * @param precioCompraMortadela Precio al cual se compra el ingrediente, requerido para calcular precios de fabricacion y venta.
     * @param precioCompraJamon Precio al cual se compra el ingrediente, requerido para calcular precios de fabricacion y venta.
     * @param precioCompraPanBlanco Precio al cual se compra el ingrediente, requerido para calcular precios de fabricacion y venta.
     * @param precioCompraPanIntegral Precio al cual se compra el ingrediente, requerido para calcular precios de fabricacion y venta.
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
     * Calcula el costo de fabricacion de un Sandwich, segun el tipo de sandwich y de pan.
     * @param tipoSandwich Un numero de 1 a 6 segun el tipo de sandwich
     * @param tipoPan Un numero 1 o 2. Pan Blanco es 1 y Pan Integral 2.
     * @return El costo de fabricar de un Sandwich, segun el tipo de sandwich y de pan.
     */
    public int calcularCostoFabricacion(int tipoSandwich, int tipoPan) {
        int rta = 0;
        if(tipoSandwich == 1 && tipoPan == 1)
            rta=this.precioCompraQueso*15+this.precioCompraMortadela*10+this.precioCompraPanBlanco*1;
        if(tipoSandwich == 1 && tipoPan == 2)
            rta=this.precioCompraQueso*15+this.precioCompraMortadela*10+this.precioCompraPanIntegral*1;

        if(tipoSandwich == 2 && tipoPan == 1)
            rta=this.precioCompraQueso*15+this.precioCompraJamon*10+this.precioCompraPanBlanco*1;
        if(tipoSandwich == 2 && tipoPan == 2)
            rta=this.precioCompraQueso*15+this.precioCompraJamon*10+this.precioCompraPanIntegral*1;

        if(tipoSandwich == 3 && tipoPan == 1)
            rta=(this.precioCompraQueso*30)+(this.precioCompraMortadela*20)+(this.precioCompraPanBlanco*2);
        if(tipoSandwich == 3 && tipoPan == 2)
            rta=(this.precioCompraQueso*30)+(this.precioCompraMortadela*20)+(this.precioCompraPanIntegral*2);

        if(tipoSandwich == 4&& tipoPan == 1)
            rta=(this.precioCompraQueso*30)+(this.precioCompraJamon*20)+(this.precioCompraPanBlanco*2);
        if(tipoSandwich == 4 && tipoPan == 2)
            rta=(this.precioCompraQueso*30)+(this.precioCompraJamon*20)+(this.precioCompraPanIntegral*2);

        if(tipoSandwich == 5&& tipoPan == 1)
            rta=(this.precioCompraQueso*45)+(this.precioCompraMortadela*30)+(this.precioCompraPanBlanco*3);
        if(tipoSandwich == 5 && tipoPan == 2)
            rta=(this.precioCompraQueso*45)+(this.precioCompraMortadela*30)+(this.precioCompraPanIntegral*3);

        if(tipoSandwich == 6&& tipoPan == 1)
            rta=(this.precioCompraQueso*45)+(this.precioCompraJamon*30)+(this.precioCompraPanBlanco*3);
        if(tipoSandwich == 6 && tipoPan == 2)
            rta = (this.precioCompraQueso*45)+(this.precioCompraJamon*30)+(this.precioCompraPanIntegral*3);
        return rta;
    }//fin getTipo

    /**
     * Calcula el precio de venta de un Sandwich, segun el tipo de sandwich y de pan.
     * @param tipoSandwich Un numero de 1 a 6 segun el tipo de sandwich
     * @param tipoPan Un numero 1 o 2. Pan Blanco es 1 y Pan Integral 2.
     * @return El precio de venta de un Sandwich, segun el tipo de sandwich y de pan.
     */
    public int calcularPrecioVenta(int tipoSandwich, int tipoPan) {
        int venta = calcularCostoFabricacion (tipoSandwich,tipoPan);
        int precioVenta = venta + (venta*35/100);
        return precioVenta;
    }

    /**
     * Registra la venta de un Sandwich, segun el tipo de sandwich y de pan.
     * @param tipoSandwich Un numero de 1 a 6 segun el tipo de sandwich
     * @param tipoPan Un numero 1 o 2. Pan Blanco es 1 y Pan Integral 2.
     * @return true si pudo preparar y vender el sandwich, false en caso contrario
     */
    public boolean registrarVenta(int tipoSandwich, int tipoPan) {
        int venta = calcularPrecioVenta(tipoSandwich,tipoPan);

        boolean queso = ((tipoSandwich == 1||tipoSandwich == 2)&& this.cantidadQueso>=15)||
            ((tipoSandwich == 3||tipoSandwich == 4)&& this.cantidadQueso>=30)||
            ((tipoSandwich == 5||tipoSandwich == 6)&& this.cantidadQueso>=45);

        boolean mortadela = (tipoSandwich == 1)|| (this.cantidadMortadela>=10)||
            (tipoSandwich == 3)|| (this.cantidadMortadela>=20)||
            (tipoSandwich == 5)|| (this.cantidadMortadela>=30);

        boolean jamon = ((tipoSandwich == 2)|| this.cantidadJamon>=10)||
            ((tipoSandwich == 4)|| this.cantidadJamon>=20)||
            ((tipoSandwich == 6)|| this.cantidadJamon>=30);

        boolean panBlanco = ((tipoSandwich == 1||tipoSandwich == 2)&& tipoPan == 1 && this.cantidadPanBlanco>=1)||
            ((tipoSandwich == 3||tipoSandwich == 4)&& tipoPan == 1&& this.cantidadPanBlanco>=2)||
            ((tipoSandwich == 5||tipoSandwich == 6)&& tipoPan == 1&& this.cantidadPanBlanco>=3);

        boolean panIntegral =   ((tipoSandwich==1||tipoSandwich == 2)&& tipoPan == 2&& this.cantidadPanIntegral>=1)||
                                ((tipoSandwich == 3||tipoSandwich == 4)&& tipoPan == 2&& this.cantidadPanIntegral>=2)||
                                ((tipoSandwich == 5||tipoSandwich == 6)&& tipoPan == 2&& this.cantidadPanIntegral>=3);

        boolean registra = queso && (mortadela || jamon) && (panBlanco || panIntegral);

        if(tipoSandwich==1&& tipoPan==1 && this.cantidadQueso>=15 && this.cantidadMortadela>=10 && this.cantidadPanBlanco>=1){
            this.ingresosPorVentas += venta;
            this.cantidadQueso-=15;
            this.cantidadMortadela-=10;
            this.cantidadPanBlanco-=1;
        }

        if(tipoSandwich==1&& tipoPan==2 && this.cantidadQueso>=15 && this.cantidadMortadela>=10 && this.cantidadPanIntegral>=1 ){
            this.ingresosPorVentas += venta;
            this.cantidadQueso-=15;
            this.cantidadMortadela-=10;
            this.cantidadPanIntegral-=1;
        }

        if(tipoSandwich==2&& tipoPan==1 && this.cantidadQueso>=15 && this.cantidadJamon>=10 && this.cantidadPanBlanco>=1){
            this.ingresosPorVentas += venta;
            this.cantidadQueso-=15;
            this.cantidadJamon-=10;
            this.cantidadPanBlanco-=1;
        }
        if(tipoSandwich==2&& tipoPan==2 && this.cantidadQueso>=15 && this.cantidadJamon>=10 && this.cantidadPanIntegral>=1){
            this.ingresosPorVentas += venta; 
            this.cantidadQueso-=15;
            this.cantidadJamon-=10;
            this.cantidadPanIntegral-=1;
        }

        if(tipoSandwich==3&& tipoPan==1 && this.cantidadQueso>=30 && this.cantidadMortadela>=20 && this.cantidadPanBlanco>=2){
            this.ingresosPorVentas+=venta; 
            this.cantidadQueso-=30;
            this.cantidadMortadela-=20;
            this.cantidadPanBlanco-=2;
        }
        if(tipoSandwich==3&& tipoPan==2 && this.cantidadQueso>=30 && this.cantidadMortadela>=20 && this.cantidadPanIntegral>=2){
            this.ingresosPorVentas+=venta; 
            this.cantidadQueso-=30;
            this.cantidadMortadela-=20;
            this.cantidadPanIntegral-=2;
        }
        if(tipoSandwich==4&& tipoPan==1 && this.cantidadQueso>=30 && this.cantidadJamon>=20 && this.cantidadPanBlanco>=2){
            this.ingresosPorVentas+=venta;
            this.cantidadQueso-=30;
            this.cantidadJamon-=20;
            this.cantidadPanBlanco-=2;
        }
        if(tipoSandwich==4&& tipoPan==2 && this.cantidadQueso>=30 && this.cantidadJamon>=20 && this.cantidadPanIntegral>=2){
            this.ingresosPorVentas+=venta;
            this.cantidadQueso-=30;
            this.cantidadJamon-=20;
            this.cantidadPanIntegral-=2;
        }
        if(tipoSandwich==5&& tipoPan==1 && this.cantidadQueso>=45 && this.cantidadMortadela>=30 && this.cantidadPanBlanco>=3){
            this.ingresosPorVentas+=venta;
            this.cantidadQueso-=45;
            this.cantidadMortadela-=30;
            this.cantidadPanBlanco-=3;
        }
        if(tipoSandwich==5&& tipoPan==2 && this.cantidadQueso>=45 && this.cantidadMortadela>=30 && this.cantidadPanIntegral>=3){
            this.ingresosPorVentas+=venta;
            this.cantidadQueso-=45;
            this.cantidadMortadela-=30;
            this.cantidadPanIntegral-=3;
        }
        if(tipoSandwich==6&& tipoPan==1 && this.cantidadQueso>=45 && this.cantidadJamon>=30 && this.cantidadPanBlanco>=3){
            this.ingresosPorVentas+=venta;
            this.cantidadQueso-=45;
            this.cantidadJamon-=30;
            this.cantidadPanBlanco-=3;
        }
        if(tipoSandwich==6&& tipoPan==2 && this.cantidadQueso>=45 && this.cantidadJamon>=30 && this.cantidadPanIntegral>=3){
            this.ingresosPorVentas+=venta;
            this.cantidadQueso-=45;
            this.cantidadJamon-=30;
            this.cantidadPanIntegral-=3;
        }

        return registra;//registrarVenta();
    }

    /**
     * Regresa la cantidad de dinero a pagar por impuesto de IVA (19%), calculado segun los ingresos por ventas.
     * @return El 19% de ingresosPorVentas en ENTERO, lo que corresponde al impuesto de IVA.
     */
    public int getIVA() {
        return (this.ingresosPorVentas*19)/100;
    }

    /**
     * Calcula los costos fijos de preparacion (5%), calculado segun los ingresos por ventas.
     * @return El 5% de ingresosPorVentas en ENTERO, lo que corresponde a los costos fijos.
     */
    public int getCostosFijos() {
        return (this.ingresosPorVentas*5)/100;
    }

    /**
     * Calcula los costos por riesgos (1%), calculado segun los ingresos por ventas.
     * @return El 1% de ingresosPorVentas en ENTERO, lo que corresponde al costo por riesgos.
     */
    public int getRiesgos() {
        return (this.ingresosPorVentas*1)/100;
    }

    /**
     * Calcula las ganancias netas (10%), calculado segun los ingresos por ventas.
     * @return El 10% de ingresosPorVentas en ENTERO, lo que corresponde a las ganancias netas.
     */
    public int getGananciaNeta() {
        return (this.ingresosPorVentas*10)/100;
    }

    public int getCantidadQueso(){
        return this.cantidadQueso;
    }

    public int getCantidadMortadela(){
        return this.cantidadMortadela;
    }

    public int getCantidadJamon(){
        return this.cantidadJamon;
    }

    public int getCantidadPanBlanco(){
        return this.cantidadPanBlanco;
    }

    public int getCantidadPanIntegral(){
        return this.cantidadPanIntegral;
    }

    public int getPrecioCompraQueso(){
        return this.precioCompraQueso;
    }

    public int getPrecioCompraMortadela(){
        return this.precioCompraMortadela;
    }

    public int getPrecioCompraJamon(){
        return this.precioCompraJamon;
    }

    public int getPrecioCompraPanBlanco(){
        return this.precioCompraPanBlanco;
    }

    public int getPrecioCompraPanIntegral(){
        return this.precioCompraPanIntegral;
    }

    public int getIngresosPorVentas(){
        return this.ingresosPorVentas;
    }
}