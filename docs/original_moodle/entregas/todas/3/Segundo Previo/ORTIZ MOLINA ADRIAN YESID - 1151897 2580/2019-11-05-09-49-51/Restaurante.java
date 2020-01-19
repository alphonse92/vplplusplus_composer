import java.util.ArrayList;
//Complete
/**
 * Clase Restaurante
 *
 * @Desarroladores (Jhonny Guarín- 1151893, jhonnyesneidergcha@ufps.edu.co) && (Adrían Ortiz- 1151897, adrianyesidomol@ufps.edu.co)
 * Grupo #3 segundo parcial - POO I 
 * @version 0.0004 :'D
 */
public class Restaurante {

    //Complete
    private ArrayList<Ingrediente> ingredientes;
    protected int egresosPorCompras;

    protected int ingresosPorVentas;

    public Restaurante() {
        ingredientes = new  ArrayList();
        this.egresosPorCompras = 0;
        this.ingresosPorVentas = 0;
        //Complete
    }

    /**Busca un Ingrediente por el nombre y regresa el objeto dentro del ArrayList*/
    public Ingrediente buscarIngrediente(String nombre) {
        Ingrediente ingrediente = null;
        for(Ingrediente i : getIngredientes()){
            if(i.getNombre().equals(nombre)) ingrediente = i;
        }
        return ingrediente;
        //Complete
    }

    /*Regresa un array simple con los nombres String de todas las frutas*/
    public String [ ] getNombresFrutas() {
        String [] s = null;
        ArrayList<String> nombresFrutas = new ArrayList();
        for(Ingrediente i : getIngredientes()){
            if(i instanceof Fruta) nombresFrutas.add(((Fruta)i).getNombre());
        }
        s = new String[nombresFrutas.size()];
        for(int i=0; i<nombresFrutas.size(); i++) s[i] = nombresFrutas.get(i);
        return s;
        //Complete
    }

    /*Regresa un array simple con los nombres String de todas las proteinas*/
    public String [ ] getNombresProteinas() {
        String [] s = null;
        ArrayList<String> nombresProteinas = new ArrayList();
        for(Ingrediente i : getIngredientes()){
            if(i instanceof Proteina) nombresProteinas.add(((Proteina)i).getNombre());
        }
        s = new String[nombresProteinas.size()];
        for(int i=0; i<nombresProteinas.size(); i++) s[i] = nombresProteinas.get(i);
        return s;
        //Complete
    }

    /*Regresa un array simple con los nombres String de todos los granos*/
    public String [ ] getNombresGranos() {
        String [] s = null;
        ArrayList<String> nombresGranos = new ArrayList();
        for(Ingrediente i : getIngredientes()){
            if(i instanceof Grano) nombresGranos.add(((Grano)i).getNombre());
        }
        s = new String[nombresGranos.size()];
        for(int i=0; i<nombresGranos.size(); i++) s[i] = nombresGranos.get(i);
        return s;
        //Complete
    }

    /*Regresa un array simple con los nombres String de todos las almidones*/
    public String [ ] getNombresAlmidones() {
        String [] s = null;
        ArrayList<String> nombresAlmidones = new ArrayList();
        for(Ingrediente i : getIngredientes()){
            if(i instanceof Almidon) nombresAlmidones.add(((Almidon)i).getNombre());
        }
        s = new String[nombresAlmidones.size()];
        for(int i=0; i<nombresAlmidones.size(); i++) s[i] = nombresAlmidones.get(i);
        return s;
        //Complete
    }

    /*Regresa un array simple con los nombres String de todos los ingredientes, no importa el tipo*/
    public String [ ] getNombresIngredientes() {
        String [] s = new String[ingredientes.size()];
        for(int i=0; i<ingredientes.size(); i++){
            s[i] = getIngredientes().get(i).getNombre();
        }
        return s;
        //Complete
    }

    /*Registra la compra de un Ingrediente*/
    public void registrarCompraIngrediente(String nombre, int cantidad, int precioCompra, int tipo) {
        Ingrediente ingrediente = null;
        switch(tipo){
            case 1:
            ingrediente = new Fruta(nombre, cantidad, precioCompra);
            break;
            case 2:
            ingrediente = new Proteina(nombre, cantidad, precioCompra);
            break;
            case 3:
            ingrediente = new Grano(nombre, cantidad, precioCompra);
            break;
            case 4:
            ingrediente = new Almidon(nombre, cantidad, precioCompra);
            break;
            default:
            //owo
            break;
        }
        Ingrediente i = buscarIngrediente(ingrediente.getNombre());
        if (i == null) {
            getIngredientes().add(ingrediente);
        }
        else {
            if (ingrediente.getPrecioCompra() > this.ingresosPorVentas - getIVA())
                throw new RuntimeException("No hay dinero suficiente"); 
            i.registrarCompra(ingrediente.getCantidadDisponible(), ingrediente.getPrecioCompra());
        } 
        this.egresosPorCompras += ingrediente.getCantidadDisponible() * ingrediente.getPrecioCompra();

    }

    /*Calcula el precio de venta de un Almuerzo, dados los ingredientes deseados*/
    public int consultarPrecioVenta(String fruta, String proteina, String grano, String almidon) {
        Almuerzo a = new Almuerzo(this, fruta, proteina, grano, almidon);
        return a.getPrecioVenta();
        //Complete
    }

    /*Verifica si se puede preparar un almuerzo, si hay ingredientes suficientes*/
    public boolean sePuedePreparar(String fruta, String proteina, String grano, String almidon) {
        Almuerzo a = new Almuerzo(this, fruta, proteina, grano, almidon);
        return a.sePuedePreparar();
        //Complete
    }

    /*Registra la venta de un almuerzo. Primero valida si se puede preparar el plato
     * Debe lanzar un error RuntimeException cuando no hay suficientes ingredientes
     */
    public void registrarVenta(String fruta, String proteina, String grano, String almidon) {
        Almuerzo a = new Almuerzo(this, fruta, proteina, grano, almidon);
        if (a.sePuedePreparar()) {
            this.ingresosPorVentas += a.getPrecioVenta();
            a.registrarVenta();
        } else {
            throw new RuntimeException("No hay suficientes ingredientes...");
        }
        //Complete
    }

    public int getIVA() {
        return this.ingresosPorVentas * 19 / 100;//Esto es un regalo ;) Gracias Milton
    }

    public int getGananciasNetas() {
        return this.ingresosPorVentas - this.egresosPorCompras - this.getIVA(); //Esto es un regalo ;) Gracias Milton 
    }

    //Complete GET/SET
    public ArrayList<Ingrediente> getIngredientes(){
        return ingredientes;
    }

    //Start GetterSetterExtension Code
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
