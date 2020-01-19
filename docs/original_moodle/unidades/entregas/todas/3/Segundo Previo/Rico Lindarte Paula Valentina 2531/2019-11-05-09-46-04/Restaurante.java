/**
* Grupo 8: Valentina Rico      1151910
*          Edinsson Montoya    1151901
*
*/
import java.util.ArrayList;
//Complete

public class Restaurante {

    //Complete
    private ArrayList<Ingrediente> ingredientes;

    private int egresosPorCompras;

    private int ingresosPorVentas;

    public Restaurante() {
        ingredientes = new ArrayList();
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
    }

    /*Regresa un array simple con los nombres String de todas las frutas*/
    public String [ ] getNombresFrutas() {
        String [] s = null;
        ArrayList<String> frutas = new ArrayList();
        for(Ingrediente i : getIngredientes()){
            if(i instanceof Fruta) frutas.add(((Fruta)i).getNombre());
        }

        s = new String[frutas.size()];
        for(int i=0; i<frutas.size(); i++){
            s[i] = frutas.get(i);
        }
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
        for(int i=0; i<nombresProteinas.size(); i++){
            s[i] = nombresProteinas.get(i);
        }
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
        for(int i=0; i<nombresGranos.size(); i++){
            s[i] = nombresGranos.get(i);
        }
        return s;
        //complete
    }

    /*Regresa un array simple con los nombres String de todos las almidones*/
    public String [ ] getNombresAlmidones() {
        String [] s = null;
        ArrayList<String> nombresAlmidones = new ArrayList();
        for(Ingrediente i : getIngredientes()){
            if(i instanceof Almidon) nombresAlmidones.add(((Almidon)i).getNombre());
        }

        s = new String[nombresAlmidones.size()];
        for(int i=0; i<nombresAlmidones.size(); i++){
            s[i] = nombresAlmidones.get(i);
        }
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
        Ingrediente ingrediente = buscarIngrediente(nombre);
        if(precioCompra * cantidad <= getGananciasNetas()){
            switch(tipo){
                case 1:
                if(ingrediente == null){
                    ingrediente = new Fruta(nombre, cantidad, precioCompra);
                    this.ingredientes.add(ingrediente);
                }            
                break;
                case 2:
                if(ingrediente == null){
                    ingrediente = new Fruta(nombre, cantidad, precioCompra);
                    this.ingredientes.add(ingrediente);
                }
                case 3:
                if(ingrediente == null){
                    ingrediente = new Fruta(nombre, cantidad, precioCompra);
                    this.ingredientes.add(ingrediente);
                }
                case 4:
                if(ingrediente == null){
                    ingrediente = new Fruta(nombre, cantidad, precioCompra);
                    this.ingredientes.add(ingrediente);
                }
            }
        }
        ingrediente.registrarCompra(cantidad, precioCompra);
        egresosPorCompras += precioCompra * cantidad;
        //Complete
    }

    /*Calcula el precio de venta de un Almuerzo, dados los ingredientes deseados*/
    public int consultarPrecioVenta(String fruta, String proteina, String grano, String almidon) {
        int precioCompra = 0;
        precioCompra += buscarIngrediente(fruta).getPrecioCompra()*30;
        precioCompra += buscarIngrediente(proteina).getPrecioCompra()*200;
        precioCompra += buscarIngrediente(grano).getPrecioCompra()*100;
        precioCompra += buscarIngrediente(almidon).getPrecioCompra()*50;
        return precioCompra;
        //complete
    }

    /*Verifica si se puede preparar un almuerzo, si hay ingredientes suficientes*/
    public boolean sePuedePreparar(String fruta, String proteina, String grano, String almidon) {
        boolean sePuede = false;
        int fruta1 = buscarIngrediente(fruta).getCantidadDisponible();
        int proteina1 = buscarIngrediente(proteina).getCantidadDisponible();
        int grano1 = buscarIngrediente(grano).getCantidadDisponible();
        int almidon1 = buscarIngrediente(almidon).getCantidadDisponible();
        sePuede = fruta1 >= 30 && proteina1 >= 200 && grano1 >= 100 && almidon1 >= 50;
        return sePuede;
        //Complete
    }

    /*Registra la venta de un almuerzo. Primero valida si se puede preparar el plato
     * Debe lanzar un error RuntimeException cuando no hay suficientes ingredientes
     */
    public void registrarVenta(String fruta, String proteina, String grano, String almidon) {
        try {
            Fruta fruta1 = (Fruta) buscarIngrediente(fruta);
            Proteina proteina1 = (Proteina) buscarIngrediente(proteina);
            Grano grano1 = (Grano) buscarIngrediente(grano);
            Almidon almidon1 = (Almidon) buscarIngrediente(almidon);

            if(fruta1 == null || proteina1 == null || grano1 == null || almidon1 == null) throw new RuntimeException("Hay un error en los ingredientes");
            else{
                if(sePuedePreparar(fruta, proteina, grano, almidon)) this.ingresosPorVentas += consultarPrecioVenta(fruta, proteina, grano, almidon);
            }

        } catch (Exception e) {
            throw new RuntimeException("No hay ingredientes suficientes");
        }//Complete
    }

    public int getIVA() {
        return this.ingresosPorVentas * 19 / 100;//Esto es un regalo ;) --> Gracias
    }

    public int getGananciasNetas() {
        return this.ingresosPorVentas - this.egresosPorCompras - this.getIVA(); //Esto es un regalo ;) --> Gracias
    }

    //Complete GET/SET

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

    public ArrayList<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(ArrayList<Ingrediente> ingredientes) {
        this.ingredientes = ingredientes;
    }
}