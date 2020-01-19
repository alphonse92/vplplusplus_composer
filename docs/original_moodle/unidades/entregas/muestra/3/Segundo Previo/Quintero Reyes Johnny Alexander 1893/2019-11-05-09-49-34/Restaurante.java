
//Complete
import java.util.*;
/*
 * Grupo 1
 * Johnny Quintero 1151870
 * Daniela Sanchez 1151947
 */

public class Restaurante {

    //Complete
    ArrayList<Ingrediente> ingredientes;

    protected int egresosPorCompras;

    protected int ingresosPorVentas;

    public Restaurante() {
      //Complete
      this.ingredientes =new ArrayList<>();
      this.egresosPorCompras=0;
      this.ingresosPorVentas=0;
    }

    /**Busca un Ingrediente por el nombre y regresa el objeto dentro del ArrayList*/
    public Ingrediente buscarIngrediente(String nombre) {
        //Complete
         Ingrediente ingrediente = null;
           for(int i = 0; i<ingredientes.size() && ingrediente == null; i++){
            if(ingredientes.get(i).getNombre().equals(nombre)){
                ingrediente = ingredientes.get(i);
            }
        }
        return ingrediente;
    }

    /*Regresa un array simple con los nombres String de todas las frutas*/
    public String [ ] getNombresFrutas() {
       //Complete
        String [] s = null;
        ArrayList<String> nombresFrutas = new ArrayList();
        for(Ingrediente i : getIngredientes()){
            if(i instanceof Fruta) 
            nombresFrutas.add(i.getNombre());
        }
        s = new String[nombresFrutas.size()];
        for (int i=0; i< nombresFrutas.size(); i++) 
        s[i] = nombresFrutas.get(i);
        return s;
    }
    
    /*Regresa un array simple con los nombres String de todas las proteinas*/
    public String [ ] getNombresProteinas() {
       //Complete
        String [] s = null;
        ArrayList<String> nombresProteinas = new ArrayList();
        for(Ingrediente i : getIngredientes()){
            if(i instanceof Proteina) 
            nombresProteinas.add(i.getNombre());
        }
        s = new String[nombresProteinas.size()];
        for (int i=0; i< nombresProteinas.size(); i++) 
        s[i] = nombresProteinas.get(i);
        return s;
    }
    
    /*Regresa un array simple con los nombres String de todos los granos*/
    public String [ ] getNombresGranos() {
        //Complete
        String [] s = null;
        ArrayList<String> nombresGranos = new ArrayList();
        for(Ingrediente i : getIngredientes()){
            if(i instanceof Grano) 
            nombresGranos.add(i.getNombre());
        }
        s = new String[nombresGranos.size()];
        for (int i=0; i< nombresGranos.size(); i++) 
        s[i] = nombresGranos.get(i);
        return s;
    }
    
    /*Regresa un array simple con los nombres String de todos las almidones*/
    public String [ ] getNombresAlmidones() {
       //Complete
        String [] s = null;
        ArrayList<String> nombresAlmidones = new ArrayList();
        for(Ingrediente i : getIngredientes()){
            if(i instanceof Almidon)
            nombresAlmidones.add(i.getNombre());
        }
        s = new String[nombresAlmidones.size()];
        for (int i=0; i< nombresAlmidones.size(); i++) 
        s[i] = nombresAlmidones.get(i);
        return s;
    }
    
    /*Regresa un array simple con los nombres String de todos los ingredientes, no importa el tipo*/
     public String [ ] getNombresIngredientes() {
     //Complete
     String [] s = null;
        ArrayList<String> nombresIngredientes = new ArrayList();
        for(Ingrediente i : getIngredientes()){
            if(i instanceof Ingrediente)
            nombresIngredientes.add(i.getNombre());
        }
        s = new String[nombresIngredientes.size()];
        for (int i=0; i< nombresIngredientes.size(); i++) 
        s[i] = nombresIngredientes.get(i);
        return s;
    }

    /*Registra la compra de un Ingrediente*/
    public void registrarCompraIngrediente(String nombre, int cantidad, int precioCompra, int tipo) {
      //Complete
    
    }

    /*Calcula el precio de venta de un Almuerzo, dados los ingredientes deseados*/
    public int consultarPrecioVenta(String fruta, String proteina, String grano, String almidon) {
       //Complete
       Almuerzo almuerzo = new Almuerzo(this,fruta, proteina, grano, almidon);
       return almuerzo.getPrecioVenta();
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
        if (almuerzo.sePuedePreparar()) {
            this.ingresosPorVentas +=almuerzo.getPrecioVenta();
            almuerzo.registrarVenta();
        } else {
            throw new RuntimeException("No hay ingredientes suficientes :(");
        }
    }

    public int getIVA() {
      return this.ingresosPorVentas * 19 / 100;//Esto es un regalo ;)
    }

    public int getGananciasNetas() {
        return this.ingresosPorVentas - this.egresosPorCompras - this.getIVA(); //Esto es un regalo ;)
    }
    
    /**
     * @return the egresosPorCompras
     */
    public int getEgresosPorCompras() {
        return egresosPorCompras;
    }

    /**
     * @param egresosPorCompras the egresosPorCompras to set
     */
    public void setEgresosPorCompras(int egresosPorCompras) {
        this.egresosPorCompras = egresosPorCompras;
    }

    /**
     * @return the ingresosPorVentas
     */
    public int getIngresosPorVentas() {
        return ingresosPorVentas;
    }

    /**
     * @param ingresosPorVentas the ingresosPorVentas to set
     */
    public void setIngresosPorVentas(int ingresosPorVentas) {
        this.ingresosPorVentas = ingresosPorVentas;
    }

    /**
     * @return the ingredientes
     */
    public ArrayList<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    /**
     * @param ingredientes the ingredientes to set
     */
    public void setIngredientes(ArrayList<Ingrediente> ingredientes) {
        this.ingredientes = ingredientes;
    }
    //Complete GET/SET
}
