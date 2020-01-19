import java.util.ArrayList;
//Complete
public class Restaurante {

    //Complete
    Restaurante[] almuerzos;
    
    ArrayList<Ingrediente>ingredientes;
    
    protected int egresosPorCompras;

    protected int ingresosPorVentas;

    public Restaurante() {
        Restaurante[]almuerzos = new Restaurante[1];
        //Complete
    }

    /**Busca un Ingrediente por el nombre y regresa el objeto dentro del ArrayList*/
    public Ingrediente buscarIngrediente(String nombre) {
        Ingrediente tmp = null;
        for(int i=0;i<ingredientes.size()&&tmp==null;i++){
            if(ingredientes.get(i).getNombre().equals(nombre))
                tmp=ingredientes.get(i);
        }
        return tmp;
    }

    /*Regresa un array simple con los nombres String de todas las frutas*/
    public String [ ] getNombresFrutas() {
        //Complete
        String frutas[]=new String [ingredientes.size()];
        for(int i = 0,o=0;i<ingredientes.size();i++){
            if(ingredientes.get(i) instanceof Fruta){
                frutas[o]=ingredientes.get(i).getNombre();
                o++;
            }
        }
        return frutas;
    }

    /*Regresa un array simple con los nombres String de todas las proteinas*/
    public String [ ] getNombresProteinas() {
        //Complete
        String proteinas[]=new String [ingredientes.size()];
        for(int i = 0,o=0;i<ingredientes.size();i++){
            if(ingredientes.get(i) instanceof Proteina){
                proteinas[o]=ingredientes.get(i).getNombre();
                o++;
            }
        }
        return proteinas;
    }

    /*Regresa un array simple con los nombres String de todos los granos*/
    public String [ ] getNombresGranos() {
        //Complete
        String granos[]=new String [ingredientes.size()];
        for(int i = 0,o=0;i<ingredientes.size();i++){
            if(ingredientes.get(i) instanceof Grano){
                granos[o]=ingredientes.get(i).getNombre();
                o++;
            }
        }
        return granos;
    }

    /*Regresa un array simple con los nombres String de todos las almidones*/
    public String [ ] getNombresAlmidones() {
        //Complete
        String almidones[]=new String [ingredientes.size()];
        for(int i = 0,o=0;i<ingredientes.size();i++){
            if(ingredientes.get(i) instanceof Almidon){
                almidones[o]=ingredientes.get(i).getNombre();
                o++;
            }
        }
        return almidones;
    }

    /*Regresa un array simple con los nombres String de todos los ingredientes, no importa el tipo*/
    public String [ ] getNombresIngredientes() {
        //Complete
        String nombres[]=new String[ingredientes.size()];
        for(int i = 0,o=0;i<ingredientes.size();i++){
            if(ingredientes.get(i) instanceof Ingrediente){
                nombres[o]=ingredientes.get(i).getNombre();
                o++;
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

    //Start GetterSetterExtension Code
    /**Getter method almuerzos*/
    public Restaurante[] getAlmuerzos(){
        return this.almuerzos;
    }//end method getAlmuerzos

    /**Setter method almuerzos*/
    public void setAlmuerzos(Restaurante[] almuerzos){
        this.almuerzos = almuerzos;
    }//end method setAlmuerzos

    /**Getter method ingredientes*/
    public java.util.ArrayList<Ingrediente> getIngredientes(){
        return this.ingredientes;
    }//end method getIngredientes

    /**Setter method ingredientes*/
    public void setIngredientes(java.util.ArrayList<Ingrediente> ingredientes){
        this.ingredientes = ingredientes;
    }//end method setIngredientes

    /**Getter method egresosPorCompras*/
    public int getEgresosPorCompras(){
        return this.egresosPorCompras;
    }//end method getEgresosPorCompras

    /**Setter method egresosPorCompras*/
    public void setEgresosPorCompras(int egresosPorCompras){
        this.egresosPorCompras = egresosPorCompras;
    }//end method setEgresosPorCompras

    /**Getter method ingresosPorVentas*/
    public int getIngresosPorVentas(){
        return this.ingresosPorVentas;
    }//end method getIngresosPorVentas

    /**Setter method ingresosPorVentas*/
    public void setIngresosPorVentas(int ingresosPorVentas){
        this.ingresosPorVentas = ingresosPorVentas;
    }//end method setIngresosPorVentas

    //End GetterSetterExtension Code
//!
}
