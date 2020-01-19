/**
 * Clase Vehiculo - Ejemplo de segundo parcial :D.
 *
 * @author (Jhonny Esneider Guarín Chavez - jhonnyesneidergcha@ufps.edu.co)
 * @version 0.003 :D
 */
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
    
    /**
     * Constructor que recibe la cedula del propietario y la hora de inreso del vehiculo.
     */
    public Vehiculo(String placa, String cedulaPropietario, int hora, int minuto, int segundo) {
        this.placa = placa;
        this.cedulaPropietario = cedulaPropietario;
        this.horaIngreso = new Hora (hora, minuto, segundo);
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
    
    /**
     * Metodo que recibe la hora de salida del vehiculo y calcula el tiempo del servicio 
     * si las horas de ingreso y salida coinciden, de lo contrario imprime un error.
     */
    public void registrarSalida(int hora, int minuto, int segundo) {
        this.horaSalida = new Hora(hora, minuto, segundo);
        this.tiempoServicio = 0.0d;
        if (this.horaSalida.esMayor(this.horaIngreso)){
            this.tiempoServicio = getHoraSalida().restar(getHoraIngreso());
        } else {
            throw new RuntimeException("ERROR: Verifique la hora de salida.");
        } 
    }

    /**
     * Metodo que retorna el valor neto total del servicio por vehiculo si hay un registro de salida, 
     * de lo contrario imprime un error.
     */
    public double getValorTotalServicio() {
        double valorTotalServicio = 0.0d;
        if(getHoraSalida() != null) valorTotalServicio = tiempoServicio * getTarifa() * 1.19;
        else throw new RuntimeException("ERROR: No se ha registrado la salida.");
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
