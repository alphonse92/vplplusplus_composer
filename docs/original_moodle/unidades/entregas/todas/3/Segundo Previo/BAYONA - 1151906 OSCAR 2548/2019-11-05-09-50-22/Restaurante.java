import java.util.ArrayList;

//Complete Grupo 10

public class Restaurante {

    //Complete
    private ArrayList <Ingrediente> ingredientes;

    protected int egresosPorCompras;

    protected int ingresosPorVentas;

    public Restaurante() {
      //Complete
      ingredientes = new ArrayList();
    }

    /**Busca un Ingrediente por el nombre y regresa el objeto dentro del ArrayList*/
    public Ingrediente buscarIngrediente(String nombre) {
        //Complete
        Ingrediente tmp = null;
        for(int i=0;i<ingredientes.size()&&tmp==null;i++){
            if(ingredientes.get(i).getNombre().equals(nombre)){
                tmp = ingredientes.get(i);
            }
        }
        return tmp;
    }

    /*Regresa un array simple con los nombres String de todas las frutas*/
    public String [ ] getNombresFrutas() {
       //Complete
       String frutas []= new String [ingredientes.size()];
        for(int i=0,f=0; i<ingredientes.size(); i++){
            if(ingredientes.get(i) instanceof Fruta){
                frutas[f] = ingredientes.get(i).getNombre();
                f++;
            }
        }
        return frutas;
    }
    
    /*Regresa un array simple con los nombres String de todas las proteinas*/
    public String [ ] getNombresProteinas() {
       //Complete
       String proteinas []= new String [ingredientes.size()];
        for(int i=0,p=0; i<ingredientes.size(); i++){
            if(ingredientes.get(i) instanceof Proteina){
                proteinas[p] = ingredientes.get(i).getNombre();
                p++;
            }
        }
        return proteinas;
    }
    
    /*Regresa un array simple con los nombres String de todos los granos*/
    public String [ ] getNombresGranos() {
        //Complete
        String granos []= new String [ingredientes.size()];
        for(int i=0,g=0; i<ingredientes.size(); i++){
            if(ingredientes.get(i) instanceof Grano){
                granos[g] = ingredientes.get(i).getNombre();
                g++;
            }
        }
        return granos;
    }
    
    /*Regresa un array simple con los nombres String de todos las almidones*/
    public String [ ] getNombresAlmidones() {
       //Complete
       String almidones []= new String [ingredientes.size()];
        for(int i=0,a=0; i<ingredientes.size(); i++){
            if(ingredientes.get(i) instanceof Almidon){
                almidones[a] = ingredientes.get(i).getNombre();
                a++;
            }
        }
        return almidones;
    }
    
    /*Regresa un array simple con los nombres String de todos los ingredientes, no importa el tipo*/
     public String [ ] getNombresIngredientes() {
     //Complete
     String nombres []= new String [ingredientes.size()];
        for(int i=0; i<ingredientes.size(); i++){
            if(ingredientes.get(i) instanceof Ingrediente){
                nombres[i] = ingredientes.get(i).getNombre();
                
            }
        }
        return nombres;
    }

    /*Registra la compra de un Ingrediente*/
    public void registrarCompraIngrediente(String nombre, int cantidad, int precioCompra, int tipo) {
      //Complete
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
    public java.util.ArrayList<Ingrediente> getIngredientes(){
        return ingredientes;
    }
    
    public void setIngredientes(ArrayList ingredientes){
        this.ingredientes = ingredientes;
    }
    
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
    
    
}
