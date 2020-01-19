

public abstract class Vehiculo {

    public static final int TARIFA_BICICLETA = 1000;
    public static final int TARIFA_MOTO = 2000;
    public static final int TARIFA_CARRO_GRANDE = 10000;
    public static final int TARIFA_CARRO_PEQUENO = 5000;

    private String placa;
    private String cedulaPropietario;
    private Hora horaIngreso;
    private Hora horaSalida;
    private int tarifa;
    private double tiempoServicio;

    public Vehiculo(String placa, String cedulaPropietario, int hora, int minuto, int segundo) {
        
        this.placa=placa;
        this.cedulaPropietario=cedulaPropietario;
        this.horaIngreso=new Hora (hora, minuto, segundo);
        
    }

    /**
     * @return the placa
     */
    public String getPlaca() {
        return placa;
    }

    /**
     * @param placa the placa to set
     */
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    /* El tiempo de servicio se calcula restando las dos horas. El tiempo de servicio sólo se puede calcular cuando el
     * Vehículo sale del parqueadero. La Hora de Salida siempre debe ser posterior a la Hora de Ingreso. Si no se cumple esta 
     * condición debe generarse un error. 
     * Los errores son controlados en la GUI, dependiendo del resultado de los métodos de la clase Parqueadero.
     */ 
    public void registrarSalida(int hora, int minuto, int segundo) {
        //COMPLETE
        
    }
     
    /* El valor total del servicio se puede calcular sólo cuando se tiene la Hora de Salida, en caso contrario debe generarse un error.
     *  El valor total del servicio es la multiplicación de la tarifa y el tiempo de servicio, además debe sumarse el 19% del 
     *  impuesto de IVA.
     */ 
     
    public double getValorTotalServicio() {
        //COMPLETE
        String existe;
        double  valorTotalServicio;
        if (horaSalida==null)
        throw new RuntimeException("No se Puede Calcular");
        else {
        valorTotalServicio=tarifa*tiempoServicio+0.19;
        }
        return valorTotalServicio;
    }

    /**
     * @return the horaIngreso
     */
    public Hora getHoraIngreso() {
        return horaIngreso;
    }

    /**
     * @return the horaSalida
     */
    public Hora getHoraSalida() {
        return horaSalida;
    }

    /**
     * @return the tarifa
     */
    public int getTarifa() {
        return tarifa;
    }

    /**
     * @return the cedulaPropietario
     */
    public String getCedulaPropietario() {
        return cedulaPropietario;
    }

    /**
     * @param cedulaPropietario the cedulaPropietario to set
     */
    public void setCedulaPropietario(String cedulaPropietario) {
        this.cedulaPropietario = cedulaPropietario;
    }

    /**
     * @return the tiempoServicio
     */
    public double getTiempoServicio() {
        return tiempoServicio;
    }

    /**
     * @param tarifa the tarifa to set
     */
    public void setTarifa(int tarifa) {
        this.tarifa = tarifa;
    }
}
