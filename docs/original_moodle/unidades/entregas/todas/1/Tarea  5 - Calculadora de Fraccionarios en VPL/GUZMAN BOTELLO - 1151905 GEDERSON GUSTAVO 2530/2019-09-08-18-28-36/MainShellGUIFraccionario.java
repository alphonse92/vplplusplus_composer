
/**
 * Write a description of class MainShellGUIFraccionario here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MainShellGUIFraccionario
{
   /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Fraccionario f1 = new Fraccionario();
       Fraccionario f2 = new Fraccionario();
       Fraccionario f3 = new Fraccionario();
       ShellGUIFraccionario  gui = new ShellGUIFraccionario (f1, f2, f3);
       gui.menu();
    }
}
