
//Complete
import java.util.ArrayList;

public class Restaurante {

    //Complete
    
    protected ArrayList<Ingrediente> ingredientes;

    protected int egresosPorCompras;

    protected int ingresosPorVentas;

    public Restaurante() {
      //Complete
      ingredientes = new ArrayList<Ingrediente>();
    }

    /**Busca un Ingrediente por el nombre y regresa el objeto dentro del ArrayList*/
    public Ingrediente buscarIngrediente(String nombre) {
        //Complete
        for(int i = 0; i < ingredientes.size(); i++)
            if(ingredientes.get(i).getNombre().equals(nombre)) return ingredientes.get(i);
        
        return null;
    }

    /*Regresa un array simple con los nombres String de todas las frutas*/
    public String [ ] getNombresFrutas() {
       ArrayList<String> nFrutas = new ArrayList();
       for(Ingrediente i : ingredientes)
           if(i instanceof Fruta) nFrutas.add(i.getNombre());
       
       String[] arreglo = new String[nFrutas.size()];
       for(int j = 0; j < nFrutas.size(); j++) 
            arreglo[j] = nFrutas.get(j);
       return arreglo;
       //Complete
    }
    
    /*Regresa un array simple con los nombres String de todas las proteinas*/
    public String [ ] getNombresProteinas() {
       //Complete
       ArrayList<String> nProteinas = new ArrayList();
       for(Ingrediente i : ingredientes)
           if(i instanceof Proteina) nProteinas.add(i.getNombre());
       
       String[] arreglo = new String[nProteinas.size()];
       for(int j = 0; j < nProteinas.size(); j++) 
            arreglo[j] = nProteinas.get(j);
       return arreglo;
    }
    
    /*Regresa un array simple con los nombres String de todos los granos*/
    public String [ ] getNombresGranos() {
        //Complete
        ArrayList<String> nGranos = new ArrayList();
       for(Ingrediente i : ingredientes)
           if(i instanceof Grano) nGranos.add(i.getNombre());
       
       String[] arreglo = new String[nGranos.size()];
       for(int j = 0; j < nGranos.size(); j++) 
            arreglo[j] = nGranos.get(j);
       return arreglo;
    }
    
    /*Regresa un array simple con los nombres String de todos las almidones*/
    public String [ ] getNombresAlmidones() {
       //Complete
       ArrayList<String> nAlmidones = new ArrayList();
       for(Ingrediente i : ingredientes)
           if(i instanceof Almidon) nAlmidones.add(i.getNombre());
       
       String[] arreglo = new String[nAlmidones.size()];
       for(int j = 0; j < nAlmidones.size(); j++) 
            arreglo[j] = nAlmidones.get(j);
       return arreglo;
    }
    
    /*Regresa un array simple con los nombres String de todos los ingredientes, no importa el tipo*/
     public String [ ] getNombresIngredientes() {
     //Complete
        String[] arreglo = new String[ingredientes.size()];
       for(int j = 0; j < ingredientes.size(); j++) 
            arreglo[j] = ingredientes.get(j).getNombre();
       return arreglo;
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
      Almuerzo almuerzo = new Almuerzo(this, fruta, proteina, grano, almidon);
      return almuerzo.sePuedePreparar();
    }

    /*Registra la venta de un almuerzo. Primero valida si se puede preparar el plato
     * Debe lanzar un error RuntimeException cuando no hay suficientes ingredientes
     */
    public void registrarVenta(String fruta, String proteina, String grano, String almidon) {
       //Complete
       Almuerzo almuerzo = new Almuerzo(this, fruta, proteina, grano, almidon);
       almuerzo.registrarVenta();
    }

    public int getIVA() {
      return this.ingresosPorVentas * 19 / 100;//Esto es un regalo ;)
    }

    public int getGananciasNetas() {
        return this.ingresosPorVentas - this.egresosPorCompras - this.getIVA(); //Esto es un regalo ;)
    }
    
    public ArrayList<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(ArrayList<Ingrediente> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public int getEgresosPorCompras() {
        return egresosPorCompras;
    }

    public void setEgresosPorCompras(int egresosPorCompras) {
        this.egresosPorCompras = egresosPorCompras;
    }

    public int getIngresosPorVentas() {
        return ingresosPorVentas;
    }

    public void setIngresosPorVentas(int ingresosPorVentas) {
        this.ingresosPorVentas = ingresosPorVentas;
    }
    //Complete GET/SET
}
