
/**
 * Main / ejecutable para realizar calculos con fracciones.
 * @author (Milton Jesús Vera Contreras - miltonjesusvc@ufps.edu.co)
 * @version 0.000000000000001 :) --> Math.sin(Math.PI-Double.MIN_VALUE)
 */
public class MainDesktopGUIFraccionario {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Fraccionario f1 = new Fraccionario();
       Fraccionario f2 = new Fraccionario();
       Fraccionario f3 = new Fraccionario();
       DesktopGUIFraccionario  gui = new DesktopGUIFraccionario (f1, f2, f3);
       gui.setVisible(true);
    }

}
