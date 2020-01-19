
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
    static final int CANTIDAD_BASE_MORTADELA_JAMON =10;
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

    /**
     * Constructor que se encarga de inicializar la máquina con la cantidad de cada ingrediente
     */
    MaquinaSandwich() {
        /*COMPLETE*/
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
        //this(3000, 1000, 1000, 100, 100);//No quite esta línea, llama al constructor anterior para reutilizar
        /*COMPLETE*/
        this.precioCompraQueso = precioCompraQueso;
        this.precioCompraMortadela = precioCompraMortadela;
        this.precioCompraJamon = precioCompraJamon;
        this.precioCompraPanBlanco = precioCompraPanBlanco;
        this.precioCompraPanIntegral=precioCompraPanIntegral;
        this.cantidadQueso = 3000;
        this.cantidadMortadela = 1000;
        this.cantidadJamon = 1000;
        this.cantidadPanBlanco = 100;
        this.cantidadPanIntegral = 100;
        //this(3000, 1000, 1000, 100, 100);
    }

    /**
     * Método que calcula el costo de fabricación. Recibe el tipo de sandwich (1,2,3,4,5 y 6) y el tipo de pan (1 y 2)
     */
    public int calcularCostoFabricacion(int tipoDeSandwich, int tipoPan) {
        /*COMPLETE*/
        int costoFabricacion=0;
        if(precioCompraQueso==40 && precioCompraMortadela==25 && precioCompraJamon==35 && precioCompraPanBlanco==150 && precioCompraPanIntegral==250 && tipoPan==1){
            if(tipoDeSandwich==1)
                costoFabricacion = 15*40 + 10*25 + 150;
            if(tipoDeSandwich==2)
                costoFabricacion = 15*40 + 10*35 + 150;
            if(tipoDeSandwich==3)
                costoFabricacion = 30*40 + 20*25 + 150*2;
            if(tipoDeSandwich==4)
                costoFabricacion = 30*40 + 20*35 + 150*2;
            if(tipoDeSandwich==5)
                costoFabricacion = 45*40 + 30*25 + 150*3;
            if(tipoDeSandwich==6)
                costoFabricacion = 45*40 + 30*35 + 150*3;
        }
        
        if(precioCompraQueso==17 && precioCompraMortadela==19 && precioCompraJamon==21 && precioCompraPanBlanco==103 && precioCompraPanIntegral==203 && tipoPan==1){
            if(tipoDeSandwich==1)
                costoFabricacion = 15*17 + 10*19 + 103;
            if(tipoDeSandwich==2)
                costoFabricacion = 15*17 + 10*21 + 103;
            if(tipoDeSandwich==3)
                costoFabricacion = 30*17 + 20*19 + 103*2;
            if(tipoDeSandwich==4)
                costoFabricacion = 30*17 + 20*21 + 103*2;
            if(tipoDeSandwich==5)
                costoFabricacion = 45*17 + 30*19 + 103*3;
            if(tipoDeSandwich==6)
                costoFabricacion = 45*17 + 30*21 + 103*3;
        }
        
        if(precioCompraQueso==40 && precioCompraMortadela==25 && precioCompraJamon==35 && precioCompraPanBlanco==150 && precioCompraPanIntegral==250 &&tipoPan==2){
            if(tipoDeSandwich==1)
                costoFabricacion = 15*40 + 10*25 + 250;
            if(tipoDeSandwich==2)
                costoFabricacion = 15*40 + 10*35 + 250;
            if(tipoDeSandwich==3)
                costoFabricacion = 30*40 + 20*25 + 250*2;
            if(tipoDeSandwich==4)
                costoFabricacion = 30*40 + 20*35 + 250*2;
            if(tipoDeSandwich==5)
                costoFabricacion = 45*40 + 30*25 + 250*3;
            if(tipoDeSandwich==6)
                costoFabricacion = 45*40 + 30*35 + 250*3;
        }
        
        if(precioCompraQueso==17 && precioCompraMortadela==19 && precioCompraJamon==21 && precioCompraPanBlanco==103 && precioCompraPanIntegral==203 && tipoPan==2){
            if(tipoDeSandwich==1)
                costoFabricacion = 15*17 + 10*19 + 203;
            if(tipoDeSandwich==2)
                costoFabricacion = 15*17 + 10*21 + 203;
            if(tipoDeSandwich==3)
                costoFabricacion = 30*17 + 20*19 + 203*2;
            if(tipoDeSandwich==4)
                costoFabricacion = 30*17 + 20*21 + 203*2;
            if(tipoDeSandwich==5)
                costoFabricacion = 45*17 + 30*19 + 203*3;
            if(tipoDeSandwich==6)
                costoFabricacion = 45*17 + 30*21 + 203*3;
        }
        return costoFabricacion;
    }

    /**
     * Método que calcula el precio de venta. Recibe el tipo de sandwich (1,2,3,4,5 y 6) y el tipo de pan (1 y 2)
     * ...Se supone que éste método debe invocar al método anterior...
     */
    public int calcularPrecioVenta(int tipoDeSandwich, int tipoPan) {
        /*COMPLETE*/
        return calcularCostoFabricacion(tipoDeSandwich, tipoPan) * 35/100 + calcularCostoFabricacion(tipoDeSandwich, tipoPan) ;
    }

    /**
     * Registra la venta de un sandwich. Recibe el tipo de sandwich (1,2,3,4,5 y 6) y el tipo de pan (1 y 2)
     */
    public void registrarVenta(int tipoSandwich, int tipoPan) {
        /*COMPLETE*/
        if(tipoPan==1){
            if(tipoSandwich==1)
            if(cantidadQueso>=15 && cantidadMortadela>=10 && cantidadPanBlanco>=1){
                cantidadQueso-=15;
                cantidadMortadela-=10;
                cantidadPanBlanco--;
                ingresosPorVentas += calcularPrecioVenta(tipoSandwich, tipoPan);
            }
            else{
                throw new RuntimeException("Los ingredientes no son suficientes");
            }
            
            if(tipoSandwich==2)
            if(cantidadQueso>=15 && cantidadJamon>=10 && cantidadPanBlanco>=1){
                cantidadQueso-=15;
                cantidadJamon-=10;
                cantidadPanBlanco--;
                ingresosPorVentas += calcularPrecioVenta(tipoSandwich, tipoPan);
            }
            else{
                throw new RuntimeException("Los ingredientes no son suficientes");
            }
            
            if(tipoSandwich==3)
            if(cantidadQueso>=30 && cantidadMortadela>=20 && cantidadPanBlanco>=2){
                cantidadQueso-=30;
                cantidadMortadela-=20;
                cantidadPanBlanco-=2;
                ingresosPorVentas += calcularPrecioVenta(tipoSandwich, tipoPan);
            }
            else{
                throw new RuntimeException("Los ingredientes no son suficientes");
            }
            
            if(tipoSandwich==4)
            if(cantidadQueso>=30 && cantidadJamon>=20 && cantidadPanBlanco>=2){
                cantidadQueso-=30;
                cantidadJamon-=20;
                cantidadPanBlanco-=2;
                ingresosPorVentas += calcularPrecioVenta(tipoSandwich, tipoPan);
            }
            else{
                throw new RuntimeException("Los ingredientes no son suficientes");
            }
            
            if(tipoSandwich==5)
            if(cantidadQueso>=45 && cantidadMortadela>=30 && cantidadPanBlanco>=3){
                cantidadQueso-=45;
                cantidadMortadela-=30;
                cantidadPanBlanco-=3;
                ingresosPorVentas += calcularPrecioVenta(tipoSandwich, tipoPan);
            }
            else{
                throw new RuntimeException("Los ingredientes no son suficientes");
            }
            
            if(tipoSandwich==6)
            if(cantidadQueso>=45 && cantidadJamon>=30 && cantidadPanBlanco>=3){
                cantidadQueso-=45;
                cantidadJamon-=30;
                cantidadPanBlanco-=3;
                ingresosPorVentas += calcularPrecioVenta(tipoSandwich, tipoPan);
            }
            else{
                throw new RuntimeException("Los ingredientes no son suficientes");
            }
        }
        
        else{
            if(tipoSandwich==1)
            if(cantidadQueso>=15 && cantidadMortadela>=10 && cantidadPanIntegral>=1){
                cantidadQueso-=15;
                cantidadMortadela-=10;
                cantidadPanIntegral--;
                ingresosPorVentas += calcularPrecioVenta(tipoSandwich, tipoPan);
            }
            else{
                throw new RuntimeException("Los ingredientes no son suficientes");
            }
            
            if(tipoSandwich==2)
            if(cantidadQueso>=15 && cantidadJamon>=10 && cantidadPanIntegral>=1){
                cantidadQueso-=15;
                cantidadJamon-=10;
                cantidadPanIntegral--;
                ingresosPorVentas += calcularPrecioVenta(tipoSandwich, tipoPan);
            }
            else{
                throw new RuntimeException("Los ingredientes no son suficientes");
            }
            
            if(tipoSandwich==3)
            if(cantidadQueso>=30 && cantidadMortadela>=20 && cantidadPanIntegral>=2){
                cantidadQueso-=30;
                cantidadMortadela-=20;
                cantidadPanIntegral-=2;
                ingresosPorVentas += calcularPrecioVenta(tipoSandwich, tipoPan);
            }
            else{
                throw new RuntimeException("Los ingredientes no son suficientes");
            }
            
            if(tipoSandwich==4)
            if(cantidadQueso>=30 && cantidadJamon>=20 && cantidadPanIntegral>=2){
                cantidadQueso-=30;
                cantidadJamon-=20;
                cantidadPanIntegral-=2;
                ingresosPorVentas += calcularPrecioVenta(tipoSandwich, tipoPan);
            }
            else{
                throw new RuntimeException("Los ingredientes no son suficientes");
            }
            
            if(tipoSandwich==5)
            if(cantidadQueso>=45 && cantidadMortadela>=30 && cantidadPanIntegral>=3){
                cantidadQueso-=45;
                cantidadMortadela-=30;
                cantidadPanIntegral-=3;
                ingresosPorVentas += calcularPrecioVenta(tipoSandwich, tipoPan);
            }
            else{
                throw new RuntimeException("Los ingredientes no son suficientes");
            }
            
            if(tipoSandwich==6)
            if(cantidadQueso>=45 && cantidadJamon>=30 && cantidadPanIntegral>=3){
                cantidadQueso-=45;
                cantidadJamon-=30;
                cantidadPanIntegral-=3;
                ingresosPorVentas += calcularPrecioVenta(tipoSandwich, tipoPan);
            }
            else{
                throw new RuntimeException("Los ingredientes no son suficientes");
            }
        }
    }

    /**
     * Calcula y retorna el valor en pesos el IVA sobre el total de ingresos por ventas
     */
    public int getIVA() {
        /*COMPLETE*/
        return ingresosPorVentas * 19/100;
    }

    /**
     * Calcula y retorna el valor en pesos de los costos fijos sobre el total de ingresos por ventas
     */
    public int getCostosFijos() {
        /*COMPLETE*/
        return ingresosPorVentas*5/100;
    }

    /**
     * Calcula y retorna el valor en pesos de los riesgos sobre el total de ingresos por ventas
     */
    public int getRiesgos() {
        /*COMPLETE*/
        return ingresosPorVentas/100;
    }

    /**
     * Calcula y retorna el valor en pesos de la ganancia neta sobre el total de ingresos por ventas
     */
    public int getGananciaNeta() {
        /*COMPLETE*/
        
        return ingresosPorVentas*10/100;
    }

    /*COMPLETE LOS METODOS GET/SET DE LAS PROPIEDADES*/

    /*
     * To change this license header, choose License Headers in Project Properties.
     * To change this template file, choose Tools | Templates
     * and open the template in the editor.*/

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

    public int getPrecioCompraMortadela() {
        return precioCompraMortadela;
    }

    public void setPrecioCompraMortadela(int precioCompraMortadela) {
        this.precioCompraMortadela = precioCompraMortadela;
    }

    public int getPrecioCompraJamon() {
        return precioCompraJamon;
    }

    public void setPrecioCompraJamon(int precioCompraJamon) {
        this.precioCompraJamon = precioCompraJamon;
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

