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
        this.placa = placa;
        this.cedulaPropietario = cedulaPropietario;
        horaIngreso = new Hora(hora, minuto, segundo);
        this.tiempoServicio = 0;
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
        this.horaSalida = new Hora(hora, minuto, segundo);
        this.tiempoServicio = 0;
        if (this.horaIngreso.esMenor(this.horaSalida)) {
            this.tiempoServicio = getHoraSalida().restar(getHoraIngreso());
        } 
    }

    public double getValorTotalServicio() {
        double valorServicio = 0;
        if (getHoraSalida() != null) {
            valorServicio = getTiempoServicio() * getTarifa() * 1.19;
        } 
        return valorServicio;
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