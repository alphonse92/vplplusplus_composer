
public class Vehiculo {
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
        Hora ingreso = new Hora(hora,minuto,segundo);
        this.horaIngreso=ingreso;
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

    public void registrarSalida(int hora, int minuto, int segundo) {
        Hora salida = new Hora(hora,minuto,segundo);
        this.horaSalida=salida;
        this.tiempoServicio=0;
        if(horaSalida.esMayor(horaIngreso)){
            this.tiempoServicio=horaSalida.restar(horaIngreso);            
        }

    }

    public double getValorTotalServicio() {
        return (tiempoServicio*tarifa)+(tiempoServicio*tarifa)*0.19;
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
