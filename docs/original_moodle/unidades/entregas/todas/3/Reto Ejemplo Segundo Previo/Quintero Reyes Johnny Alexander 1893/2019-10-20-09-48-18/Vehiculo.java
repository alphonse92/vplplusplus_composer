
public abstract class Vehiculo {

    public static final int TARIFA_BICICLETA = 1000;
    public static final int TARIFA_MOTO = 2000;
    public static final int TARIFA_CARRO_GRANDE = 5000;
    public static final int TARIFA_CARRO_PEQUENO = 10000;

    private String placa;
    private String cedulaPropietario;
    private Hora horaIngreso;
    private Hora horaSalida;
    private int tarifa;
    private double tiempoServicio;
    public Vehiculo(){
    }
    public Vehiculo(String placa, String cedulaPropietario, int hora, int minuto, int segundo) {
        //COMPLETE
        this.placa=placa;
        this.cedulaPropietario=cedulaPropietario;
        this.tarifa=0;
        this.tiempoServicio=0;
        this.horaIngreso=new Hora(hora,minuto,segundo);
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
        //COMPLETE
        this.horaSalida = new Hora(hora,minuto,segundo);
    }

    public double getValorTotalServicio() {
        //COMPLETE
        double tiempo,total;
        
        if(this.horaSalida!=null && this.horaIngreso.esMenor(horaSalida)){
        tiempo=this.horaIngreso.restar(this.horaSalida);
        
        }
       return 0;
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
