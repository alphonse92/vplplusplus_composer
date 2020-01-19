
/**
 * ShellGUIFraccionario una GUI modo consola, texto...
 *
 * @author (Milton Jesús Vera Contreras - miltonjesusvc@ufps.edu.co)
 * @version 0.000000000000001 :) --> Math.sin(Math.PI-Double.MIN_VALUE)

 */
public class ShellGUIFraccionario
{
    Consola c;
    Fraccionario f1;
    Fraccionario f2;
    Fraccionario f3;
    
    public ShellGUIFraccionario(Fraccionario f1, Fraccionario f2, Fraccionario f3){
      this.f1 = f1;
      this.f2 = f2;
      this.f3 = f3;
      c = new Consola();
    }
    
    public void menu(){
        int opcion = 0;
        String [] menu = {"Leer Fraccionario 1",
                "Leer Fraccionario 2",
                "Sumar", 
                "Restar", 
                "Multiplicar", 
                "Dividir", 
                "Simplificar Fraccionario 1", 
                "Simplificar Fraccionario 2", 
                "Simplificar Fraccionario 3",
                "Mostrar Datos",
                "Salir"
            };

        do{
            opcion = c.menu(menu, "Seleccione una opción");
            switch(opcion){
                case 1:{
                    leerFraccionario(f1, "Leer Fraccionario 1");
                    break;
                }
                case 2:{
                    leerFraccionario(f2, "Leer Fraccionario 2");
                    break;
                }
                case 3:{
                    f3 = f1.sumar(f2);
                    imprimirFraccionario(f3, "Suma Fraccionarios");
                    break;
                }
                case 4:{
                    f3 = f1.restar(f2);
                    imprimirFraccionario(f3, "Resta Fraccionarios");
                    break;
                }
                case 5:{
                    f3 = f1.multiplicar(f2);
                    imprimirFraccionario(f3, "Multiplicación Fraccionarios");
                    break;
                }
                case 6:{
                    f3 = f1.dividir(f2);
                    imprimirFraccionario(f3, "División Fraccionarios");
                    break;
                }
                case 7:{
                    f1.simplificar();
                    imprimirFraccionario(f1, "Simplificación Fraccionario 1");
                    break;
                }
                case 8:{
                    f2.simplificar();
                    imprimirFraccionario(f2, "Simplificación Fraccionario 2");
                    break;
                }
                case 9:{
                    f3.simplificar();
                    imprimirFraccionario(f3, "Simplificación Fraccionario 3");
                    break;
                }
                case 10:{
                    imprimirFraccionario(f1, "Fraccionario 1");
                    imprimirFraccionario(f2, "Fraccionario 2");
                    imprimirFraccionario(f3, "Fraccionario 3");
                    break;
                }
            }
        }while(opcion!=11);
        c.imprimir("*****End*****\n");
    }

    public void leerFraccionario(Fraccionario f, String aviso){
        c.imprimir("----------"+aviso+"----------\n");
        int n = c.leerEntero("Numerador: ");
        int d = c.leerEntero("Denominador: ");
        f.setNumerador(n);
        f.setDenominador(d);
    }

    public void imprimirFraccionario(Fraccionario f, String aviso){
        c.imprimir("----------"+aviso+"----------\n");
        c.imprimir("Numerador: "+ f.getNumerador()+"\n");
        c.imprimir("Denominador: " + f.getDenominador()+"\n");
    }
}
