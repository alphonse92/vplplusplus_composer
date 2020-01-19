
//grupo 7 el mejor grupo
//grupo 7 el mejor grupo
//grupo 7 el mejor grupo
//grupo 7 el mejor grupo
//grupo 7 el mejor grupo
//grupo 7 el mejor grupo
//grupo 7 el mejor grupo
//grupo 7 el mejor grupo
//grupo 7 el mejor grupo

import java.util.ArrayList;

public class Restaurante {

    private ArrayList<Ingrediente> ingredientes;
    private int egresosPorCompras;
    private int ingresosPorVentas;
    public Restaurante() {
        ingredientes = new  ArrayList();
        this.egresosPorCompras = 0;
        this.ingresosPorVentas = 0;
    }

    public Ingrediente buscarIngrediente(String nombre) {
        Ingrediente ingrediente = null;
        for(Ingrediente i : getIngredientes()){
            if(i.getNombre().equals(nombre)) ingrediente = i;
        }
        return ingrediente;
    }

    public String [ ] getNombresFrutas() {
        String [] s = null;
        ArrayList<String> nombresFrutas = new ArrayList();
        for(Ingrediente i : getIngredientes()){
            if(i instanceof Fruta) nombresFrutas.add(((Fruta)i).getNombre());
        }
        s = new String[nombresFrutas.size()];
        for(int i=0; i<nombresFrutas.size(); i++) s[i] = nombresFrutas.get(i);
        return s;
    }

    public String [ ] getNombresProteinas() {
        String [] s = null;
        ArrayList<String> nombresProteinas = new ArrayList();
        for(Ingrediente i : getIngredientes()){
            if(i instanceof Proteina) nombresProteinas.add(((Proteina)i).getNombre());
        }
        s = new String[nombresProteinas.size()];
        for(int i=0; i<nombresProteinas.size(); i++) s[i] = nombresProteinas.get(i);
        return s;
    }

    public String [ ] getNombresGranos() {
        String [] s = null;
        ArrayList<String> nombresGranos = new ArrayList();
        for(Ingrediente i : getIngredientes()){
            if(i instanceof Grano) nombresGranos.add(((Grano)i).getNombre());
        }
        s = new String[nombresGranos.size()];
        for(int i=0; i<nombresGranos.size(); i++) s[i] = nombresGranos.get(i);
        return s;
    }

    public String [ ] getNombresAlmidones() {
        String [] s = null;
        ArrayList<String> nombresAlmidones = new ArrayList();
        for(Ingrediente i : getIngredientes()){
            if(i instanceof Almidon) nombresAlmidones.add(((Almidon)i).getNombre());
        }
        s = new String[nombresAlmidones.size()];
        for(int i=0; i<nombresAlmidones.size(); i++) s[i] = nombresAlmidones.get(i);
        return s;
    }

    public String [ ] getNombresIngredientes() {
        String [] s = new String[ingredientes.size()];
        for(int i=0; i<ingredientes.size(); i++){
            s[i] = getIngredientes().get(i).getNombre();
        }
        return s;
    }

    public void registrarCompraIngrediente(String nombre, int cantidad, int precioCompra, int tipo) {
        
        if((ingresosPorVentas-(ingresosPorVentas*(19/100)))>=(precioCompra*cantidad)){
            ingresosPorVentas=ingresosPorVentas-(precioCompra*cantidad);
            
        }
    }

    public int consultarPrecioVenta(String fruta, String proteina, String grano, String almidon) {
        Almuerzo a = new Almuerzo(this, fruta, proteina, grano, almidon);
        return a.getPrecioVenta();
    }

    public boolean sePuedePreparar(String fruta, String proteina, String grano, String almidon) {
        Almuerzo a = new Almuerzo(this, fruta, proteina, grano, almidon);
        return a.sePuedePreparar();
    }

    public void registrarVenta(String fruta, String proteina, String grano, String almidon) {
        Almuerzo a = new Almuerzo(this, fruta, proteina, grano, almidon);
        if (a.sePuedePreparar()) {
            this.ingresosPorVentas += a.getPrecioVenta();
            a.registrarVenta();
        } else {
            throw new RuntimeException("No hay suficientes ingredientes...");
        }
    }

    public int getIVA() {
        return this.ingresosPorVentas * 19 / 100;
    }

    public int getGananciasNetas() {
        return this.ingresosPorVentas - this.egresosPorCompras - this.getIVA();
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
}
