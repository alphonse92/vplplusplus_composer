import java.util.ArrayList;

public class Restaurante {

    protected ArrayList<Ingrediente> ingredientes;

    protected int egresosPorCompras;

    protected int ingresosPorVentas;

    public Restaurante() {
      this.ingredientes = new ArrayList<Ingrediente>();
    }

    /**Busca un Ingrediente por el nombre y regresa el objeto dentro del ArrayList*/
    public Ingrediente buscarIngrediente(String nombre) {
        Ingrediente ingrediente = null;
        
        for(int i = 0; i < this.ingredientes.size(); i++) {
            
            if(nombre.equals(this.ingredientes.get(i))) {
                ingrediente = this.ingredientes.get(i);
            }
            
        }
        
        return ingrediente;
    }

    /*Regresa un array simple con los nombres String de todas las frutas*/
    public String [ ] getNombresFrutas() {
       int cantidad = 0;
       
       for(int i = 0; i < this.ingredientes.size(); i++) {
           
           if(this.ingredientes.get(i) instanceof Fruta) {
               cantidad++;
           }
       }

       String arreglo[] = new String[cantidad];
       
       for(int i = 0; i < cantidad; i ++) {
           arreglo[i] = this.ingredientes.get(i).toString();
       }
       
       return arreglo;
    }
    
    /*Regresa un array simple con los nombres String de todas las proteinas*/
    public String [ ] getNombresProteinas() {
       int cantidad = 0;
       
       for(int i = 0; i < this.ingredientes.size(); i++) {
           
           if(this.ingredientes.get(i) instanceof Proteina) {
               cantidad++;
           }
       }

       String arreglo[] = new String[cantidad];
       
       for(int i = 0; i < cantidad; i ++) {
           arreglo[i] = this.ingredientes.get(i).toString();
       }
       
       return arreglo;
    }
    
    /*Regresa un array simple con los nombres String de todos los granos*/
    public String [ ] getNombresGranos() {
       int cantidad = 0;
       
       for(int i = 0; i < this.ingredientes.size(); i++) {
           
           if(this.ingredientes.get(i) instanceof Grano) {
               cantidad++;
           }
       }

       String arreglo[] = new String[cantidad];
       
       for(int i = 0; i < cantidad; i ++) {
           arreglo[i] = this.ingredientes.get(i).toString();
       }
       
       return arreglo;
    }
    
    /*Regresa un array simple con los nombres String de todos las almidones*/
    public String [ ] getNombresAlmidones() {
       int cantidad = 0;
       
       for(int i = 0; i < this.ingredientes.size(); i++) {
           
           if(this.ingredientes.get(i) instanceof Almidon) {
               cantidad++;
           }
       }

       String arreglo[] = new String[cantidad];
       
       for(int i = 0; i < cantidad; i ++) {
           arreglo[i] = this.ingredientes.get(i).toString();
       }
       
       return arreglo;
    }
    
    /*Regresa un array simple con los nombres String de todos los ingredientes, no importa el tipo*/
     public String [ ] getNombresIngredientes() {
       String arreglo[] = new String[this.ingredientes.size()];
       
       for(int i = 0; i < this.ingredientes.size(); i++) {
           arreglo[i] = this.ingredientes.get(i).toString();
       }
       
       return arreglo;
    }

    /*Registra la compra de un Ingrediente*/
    public void registrarCompraIngrediente(String nombre, int cantidad, int precioCompra, int tipo) {
      //Complete
    }

    /*Calcula el precio de venta de un Almuerzo, dados los ingredientes deseados*/
    public int consultarPrecioVenta(String fruta, String proteina, String grano, String almidon) {
       Almuerzo almuerzo = new Almuerzo(this, fruta, proteina, grano, almidon);
       return almuerzo.getPrecioVenta();
    }

    /*Verifica si se puede preparar un almuerzo, si hay ingredientes suficientes*/
    public boolean sePuedePreparar(String fruta, String proteina, String grano, String almidon) {
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
