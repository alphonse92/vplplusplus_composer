
//Complete
import java.util.ArrayList;
public class Restaurante {

    //Complete

    protected int egresosPorCompras;

    protected int ingresosPorVentas;

    public ArrayList<Ingrediente> ingredientes;

    public Restaurante() {
        //Complete
        this.egresosPorCompras = 0;
        this.ingresosPorVentas = 0;
        ingredientes = new ArrayList<Ingrediente>();
    }

    /**Busca un Ingrediente por el nombre y regresa el objeto dentro del ArrayList*/
    public Ingrediente buscarIngrediente(String nombre) {
        for(int i=0; i<ingredientes.size() && ingredientes.get(i) != null; i++){
            if(ingredientes.get(i).getNombre().equals(nombre)){
                return ingredientes.get(i);
            }
        }
        return null;
    }

    /*Regresa un array simple con los nombres String de todas las frutas*/
    public String [ ] getNombresFrutas() {
        //Complete
        String frutas []= new String [ingredientes.size()];
        for(int i=0,o=0; i<ingredientes.size(); i++){
            if(ingredientes.get(i) instanceof Fruta){
                frutas[o] = ingredientes.get(i).getNombre();
                o++;
            }
        }
        return frutas;
    }

    /*Regresa un array simple con los nombres String de todas las proteinas*/
    public String [ ] getNombresProteinas() {
        //Complete
        String proteinas []= new String [ingredientes.size()];
        for(int i=0,o=0; i<ingredientes.size(); i++){
            if(ingredientes.get(i) instanceof Proteina){
                proteinas[o] = ingredientes.get(i).getNombre();
                o++;
            }
        }
        return proteinas;
    }

    /*Regresa un array simple con los nombres String de todos los granos*/
    public String [ ] getNombresGranos() {
        //Complete
        String granos []= new String [ingredientes.size()];
        for(int i=0,o=0; i<ingredientes.size(); i++){
            if(ingredientes.get(i) instanceof Grano){
                granos[o] = ingredientes.get(i).getNombre();
                o++;
            }
        }
        return granos;
    }

    /*Regresa un array simple con los nombres String de todos las almidones*/
    public String [ ] getNombresAlmidones() {
        //Complete
        String almidon []= new String [ingredientes.size()];
        for(int i=0,o=0; i<ingredientes.size(); i++){
            if(ingredientes.get(i) instanceof Almidon){
                almidon[o] = ingredientes.get(i).getNombre();
                o++;
            }
        }
        return almidon;
    }

    /*Regresa un array simple con los nombres String de todos los ingredientes, no importa el tipo*/
    public String [ ] getNombresIngredientes() {
        //Complete
        String [] nombres = new String[ingredientes.size()];
        for(int i=0; i<nombres.length; i++){
            nombres[i] =  ingredientes.get(i).getNombre();
        }
        return nombres;
    }

    /*Registra la compra de un Ingrediente*/
    public void registrarCompraIngrediente(String nombre, int cantidad, int precioCompra, int tipo) {
        //Complete
        Ingrediente  i = new Ingrediente(nombre,cantidad,precioCompra);
        if(tipo==1){
            ingredientes.add(i);
        }
        else if(tipo==2){
            ingredientes.add(i);
        }
        else if(tipo==3){
            ingredientes.add(i);
        }
        else if(tipo==4){
            ingredientes.add(i);
        }
    }

    /*Calcula el precio de venta de un Almuerzo, dados los ingredientes deseados*/
    public int consultarPrecioVenta(String fruta, String proteina, String grano, String almidon) {
        //Complete
        return 0;
    }

    /*Verifica si se puede preparar un almuerzo, si hay ingredientes suficientes*/
    public boolean sePuedePreparar(String fruta, String proteina, String grano, String almidon) {
        //Complete
        return false;
    }

    /*Registra la venta de un almuerzo. Primero valida si se puede preparar el plato
     * Debe lanzar un error RuntimeException cuando no hay suficientes ingredientes
     */
    public void registrarVenta(String fruta, String proteina, String grano, String almidon) {
        //Complete
    }

    public int getIVA() {
        return this.ingresosPorVentas * 19 / 100;//Esto es un regalo ;)
    }

    public int getGananciasNetas() {
        return this.ingresosPorVentas - this.egresosPorCompras - this.getIVA(); //Esto es un regalo ;)
    }

    //Complete GET/SET
    public void setEgresosPorCompras(int egresosPorCompras){
        this.egresosPorCompras = egresosPorCompras;
    }
    
    public int getEgresosPorCompras(){
        return egresosPorCompras;
    }
    
    public int getIngresosPorVentas(){
        return ingresosPorVentas;
    }
    
    public void setIngresosPorVentas(int ingresosPorVentas){
        this.ingresosPorVentas = ingresosPorVentas;
    }
    
    public java.util.ArrayList<Ingrediente> getIngredientes(){
        return ingredientes;
    }
    
    public void setIngredientes(ArrayList ingredientes){
        this.ingredientes = ingredientes;
    }
    
}
