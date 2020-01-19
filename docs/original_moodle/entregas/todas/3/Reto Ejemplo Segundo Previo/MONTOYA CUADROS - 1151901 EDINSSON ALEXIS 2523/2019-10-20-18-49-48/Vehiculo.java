public abstract class Vehiculo {
    /**
     * No modifico los "final" por si acaso, pero según el enunciado estan mal ;)
    */
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
        this.horaIngreso = new Hora(hora,minuto,segundo);
        this.horaSalida = null;
        this.tarifa = 0;
        this.tiempoServicio = 0;
        //COMPLETE
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
        horaSalida = new Hora(hora,minuto,segundo);
        
        tiempoServicio = horaSalida.restar(horaIngreso);
        getValorTotalServicio();
        //COMPLETE
    }

    public double getValorTotalServicio() {
        double total=0;
        if(horaSalida!=null){
            if(this instanceof CarroGrande){
                total = tiempoServicio*TARIFA_CARRO_GRANDE;
                total += total*0.19;
            }
            if(this instanceof CarroPequeno){
                total = tiempoServicio*TARIFA_CARRO_PEQUENO;
                total += total*0.19;
            }
            if(this instanceof Moto){
                total = tiempoServicio*TARIFA_MOTO;
                total += total*0.19;
            }
            if(this instanceof Bicicleta){
                total = tiempoServicio*TARIFA_BICICLETA;
                total += total*0.19;
            }
        }
        return total;//COMPLETE
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
