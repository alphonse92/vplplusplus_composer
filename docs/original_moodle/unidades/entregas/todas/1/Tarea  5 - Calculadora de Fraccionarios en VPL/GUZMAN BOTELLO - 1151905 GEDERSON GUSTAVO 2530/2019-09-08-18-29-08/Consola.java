import java.io.InputStreamReader;
/**
 * <p>
 * La clase Consola encapsula y facilita el uso de las instrucciones de entrada/salida del computador.
 * </p>
 * <p>
 * Todo computador tiene una entrada y salida est&aacute;ndar: la entrada est&aacute;ndar es el teclado y 
 * la salida est&aacute;ndar es la pantalla.
 * La entrada y la salida est&aacute;ndar constituyen el mecanismo b&aacute;sico de comunicaci&oacute;n entre
 * la m&aacute;quina y el usuario final, lo que se conoce como la interfaz humano-m&aacute;quina.
 * </p>
 * <p>
 * La interfaz puede ser, entre muchos otros tipos:<br/>
 * <ul>
 * <li>S&oacute;lo texto, sencilla, usando caracteres est&aacute;ndar</li>
 * <li>S&oacute;lo texto, b&aacute;sica, usando caracteres especiales como recuadros &#172; &#746; &#741; </li>
 * <li>Gr&aacute;fica usando elementos tipo ventanas (windows),etiquetas(label),botones(button),cuadros de texto(textfield),etc.</li>
 * <li>Web, caso en el cual se usan otros lenguajes de marca como HTML, XML y de formato como CSS</li>
 * <li>M&oacute;vil, por la tendencia de micro dispositivos</li>
 * <li>Biom&eacute;trica, cuando se usa voz, imagen, huella digital. Requiere hardware especializado</li>
 * </ul>
 * </p>
 * <p>
 * La clase Consola ofrece una interfaz sencilla, s&oacute;lo texto plano. Lo que se conoce t&iacute;picamente 
 * en ingles como shell. Se ofrecen m&eacute;todos para leer e imprimnir datos de todos los tipos b&aacute;sicos de Java.
 * </p>
 * @author (Milton Jes&uacute;s Vera Contreras - miltonjesusvc@ufps.edu.co) 
 * @version 0.0000000000000003 --> 3*Math.sin(Math.PI-Double.MIN_VALUE) --> :)
 */
class Consola {

    private InputStreamReader in;
    /**
     * Default constructor
     */
    public Consola(){
      in = new InputStreamReader(System.in);
    }

    /**
     * Lee una cadena de caracteres usando separdores est&aacute;ndar. Cualquier cantidad de caracteres UNICODE.
     * Usa como separadores los caracteres est&aacute;ndar: 
     * <ul>
     * <li>Tecla ENTER: ASCII/UNICODE 10 CR (Carriage Return) = 10 y ASCII/UNICODE 13 LF (Line Feed). Ver <a href="https://danielmiessler.com/study/crlf/#gs.oVKPY7s">https://danielmiessler.com/study/crlf/#gs.oVKPY7s</a></li>
     * <li>Tecla SPACE (barra espaciadora): ASCII/UNICODE 32</li>
     * <li>Tecla TAB (tabulador): ASCII/UNICODE 9</li>
     * <li>Teclas ESC (escape): ASCII/UNICODE 27</li>
     * </ul>
     * @param  * NO recibe parametros. Si desea imprimir un mensaje al usuario use el m&eacute;todo imprimir o el m&eacute;todo sobrecargado.
     * @return un String
     */
    public String leerCadena( ){
        StringBuffer str=new StringBuffer();
        String s = null;
        char c=0;
        try{
            do{              
                c = (char)in.read();
                str.append(c);
            }
            while (c!=32 && c!=9 && c!=13 && c!=10 && c!=27);
            s = str.substring(0, str.length()-1);
        }
        catch(Exception e){
            System.err.println("Error al leer: " + e.getMessage());
            e.printStackTrace();
            s = null;
        }
        return s;
    }

    /**
     * Sobrecarga leerCadena para imprimir un aviso.
     */
    public String leerCadena(String aviso){
        imprimir(aviso);
        return leerCadena();
    }

    /**
     * Lee una cadena de caracteres hasta encontrar un caracter separador. Cualquier cantidad de caracteres UNICODE.
     * Usa como separador el caracter recibido como par&aacute;metro. Por ejemplo, para leer una hora en formato
     * HH:MM:SS, puede invocar leerCadena(':')
     * @param  separador El caracter ASCII/UNICODE que marca el fin de la cadena
     * @return un String
     */
    public String leerCadena(char separador){
        StringBuffer str=new StringBuffer();
        String s = null;
        char c=0;
        try{
            do{              
                c = (char)in.read();
                str.append(c);
            }
            while (c!=separador);
            s = str.substring(0, str.length()-1);
        }
        catch(Exception e){
            System.err.println("Error al leer: " + e.getMessage());
            e.printStackTrace();
            s = null;
        }
        return s;
    }    

    /**
     * Sobrecarga leerCadena(char) para imprimir un aviso.
     */
    public String leerCadena(String aviso, char separador){
        imprimir(aviso);
        return leerCadena(separador);
    }

    /**
     * Lee un entero en el rango de los byte (-128 a 127).
     * @return un byte
     */
    public  byte leerByte( ){
        Byte numero = null;
        boolean hayError=false;
        String aviso = " \n('Ingrese s"+((char)243)+"lo un valor entero de tipo byte [" + Byte.MIN_VALUE + "," + Byte.MAX_VALUE + "]')";
        do{
            try{
                numero = Byte.valueOf(this.leerCadena( ));
                hayError=false;
            }//fin try
            catch(Exception e){
                hayError=true;
                System.err.println("Error: " + aviso);
            }//fin catch
        }//fin do
        while(hayError);
        return numero.byteValue();
    }//Fin leerByte

    /**
     * Sobrecarga leerByte() para imprimir un aviso.
     * @param  aviso   Un aviso que indique al usuario el significado del valor a ingresar.
     * @return un byte
     */
    public  byte leerByte(String aviso){
        imprimir(aviso);
        return leerByte();
    }

    /**
     * Lee un entero en el rango de los short (-32768 a 32767).
     * @return un short
     */
    public  short leerShort(){
        Short numero=null;
        boolean hayError=false;
        String aviso = " \n('Ingrese s"+((char)243)+"lo un valor entero de tipo short [" + Short.MIN_VALUE + "," + Short.MAX_VALUE + "]')";
        do{
            try{
                numero = Short.valueOf(this.leerCadena( ));
                hayError=false;
            }//fin try
            catch(Exception e){
                hayError=true;
                System.err.println("Error: " + aviso);
            }//fin catch
        }//fin do
        while(hayError);
        return numero.shortValue();
    }//Fin leerShort

    /**
     * Sobrecarga leerShort para imprimir un aviso.
     * @param  aviso   Un aviso que indique al usuario el significado del valor a ingresar.
     * @return un short
     */
    public  short leerShort(String aviso){
        imprimir(aviso);
        return leerShort();
    }//fin leerShort

    /**
     * Lee un entero en el rango de los int (-2147483648 a 2147483647).
     * @return un int
     */
    public  int leerEntero(){
        Integer numero=null;
        boolean hayError=false;
        String aviso = " \n('Ingrese s"+((char)243)+"lo un valor entero de tipo Integer [" + Integer.MIN_VALUE + "," + Integer.MAX_VALUE + "]')";
        do{
            try{
                numero = Integer.valueOf(this.leerCadena( ));
                hayError=false;
            }//fin try
            catch(Exception e){
                hayError=true;
                System.err.println("Error: " + aviso);
            }//fin catch
        }//fin do
        while(hayError);
        return numero.intValue();
    }//Fin leerEntero

    /**
     * Sobrecarga leerEntero para imprimir un aviso.
     * @param  aviso   Un aviso que indique al usuario el significado del valor a ingresar.
     * @return un int
     */
    public  int leerEntero(String aviso){    
        imprimir(aviso);
        return leerEntero();
    }//fin leerEntero

    /**
     * Lee un entero en el rango de los long (-9223372036854775808 a 9223372036854775807).
     * @return un long
     */
    public  long leerLong( ){
        Long numero=null;
        boolean hayError=false;
        String aviso = " \n('Ingrese s"+((char)243)+"lo un valor entero de tipo long [" + Long.MIN_VALUE + "," + Long.MAX_VALUE + "]')";
        do{
            try{
                numero = Long.valueOf(this.leerCadena( ));
                hayError=false;
            }//fin try
            catch(Exception e){
                hayError=true;
                System.err.println("Error: " + aviso);
            }//fin catch
        }//fin do
        while(hayError);
        return numero.longValue();
    }//Fin leerLong

    /**
     * Sobrecarga leerLong para imprimir un aviso.
     * @param  aviso   Un aviso que indique al usuario el significado del valor a ingresar.
     * @return un long
     */
    public  long leerLong(String aviso){
        imprimir(aviso);
        return leerLong();
    }//fin leerLong

    /**
     * Lee un real en el rango de los float (1.4E-45 a 3.4028235E38).
     * @return un float
     */
    public  float leerFloat(){
        Float numero=null;
        boolean hayError=false;
        String aviso = " \n('Ingrese s"+((char)243)+"lo un valor real de tipo float [" + Float.MIN_VALUE + "," + Float.MAX_VALUE + "]')";
        do{
            try{
                numero = Float.valueOf(this.leerCadena( ));
                hayError=false;
            }//fin try
            catch(Exception e){
                hayError=true;
                System.err.println("Error: " + aviso);
            }//fin catch
        }//fin do
        while(hayError);
        return numero.floatValue();
    }//Fin leerFloat

    /**
     * Sobrecarga leerFloat para imprimir un aviso.
     * @param  aviso   Un aviso que indique al usuario el significado del valor a ingresar.
     * @return un float
     */
    public  float leerFloat(String aviso){    
        imprimir(aviso);
        return leerFloat();
    }//fin leerFloat

    /**
     * Lee un real en el rango de los double (4.9E-324 a  1.7976931348623157E308).
     * @param  aviso   Un aviso que indique al usuario el significado del valor a ingresar.
     * @return un double
     */
    public  double leerDouble( ){
        Double numero=null;
        boolean hayError=false;
        String aviso = " \n('Ingrese s"+((char)243)+"lo un valor real de tipo double [" + Double.MIN_VALUE + "," + Double.MAX_VALUE + "]')";
        do{
            try{
                numero = Double.valueOf(this.leerCadena( ));
                hayError=false;
            }//fin try
            catch(Exception e){
                hayError=true;
                System.err.println("Error: " + aviso);
            }//fin catch
        }//fin do
        while(hayError);
        return numero.doubleValue();
    }//Fin leerDouble

    /**
     * Sobrecarga leerDouble para imprimir un aviso.
     * @param  aviso   Un aviso que indique al usuario el significado del valor a ingresar.
     * @return un double
     */
    public double leerDouble(String aviso){
        imprimir(aviso);
        return leerDouble();
    }//Fin leerDouble

    /**
     * Lee un sólo caracter char. Cualquier caracter UNICODE (0 -65536) Omite las teclas:
     * <ul>
     * <li>Tecla ENTER: ASCII/UNICODE 10 CR (Carriage Return) = 10 y ASCII/UNICODE 13 LF (Line Feed). Ver <a href="https://danielmiessler.com/study/crlf/#gs.oVKPY7s">https://danielmiessler.com/study/crlf/#gs.oVKPY7s</a></li>
     * <li>Tecla SPACE (barra espaciadora): ASCII/UNICODE 32</li>
     * <li>Tecla TAB (tabulador): ASCII/UNICODE 9</li>
     * <li>Teclas ESC (escape): ASCII/UNICODE 27</li>
     * </ul>
     * @view http://www.unicode.org
     * @link http://www.unicode.org
     * @return un char
     */
    public  char leerCaracter( ){
        char caracter = 0;
        String linea = null;
        boolean hayError=false;
        String aviso = " \n('Ingrese s"+((char)243)+"lo un caracter - tipo char ASCII/UNICODE')";
        do{
            try{
                linea = leerCadena();
                caracter = linea.charAt(0);
                hayError=false;
            }//fin try
            catch(Exception e){
                hayError=true;
                System.err.println("Error: " + aviso + " -->linea " + linea);
            }//fin catch
        }//fin do
        while(hayError && caracter!=32 && caracter!=9 && caracter!=13 && caracter!=10 && caracter!=27);
        return caracter;
    }//Fin leerCaracter

    /**
     * Sobrecarga leerCaracter para imprimir una aviso.
     * Omite las teclas:
     * <ul>
     * <li>Tecla ENTER: ASCII/UNICODE 10 CR (Carriage Return) = 10 y ASCII/UNICODE 13 LF (Line Feed). Ver <a href="https://danielmiessler.com/study/crlf/#gs.oVKPY7s">https://danielmiessler.com/study/crlf/#gs.oVKPY7s</a></li>
     * <li>Tecla SPACE (barra espaciadora): ASCII/UNICODE 32</li>
     * <li>Tecla TAB (tabulador): ASCII/UNICODE 9</li>
     * <li>Teclas ESC (escape): ASCII/UNICODE 27</li>
     * </ul>
     * @param  aviso   Un aviso que indique al usuario el significado del valor a ingresar.
     * @view http://www.unicode.org
     * @link http://www.unicode.org
     * @return un char
     */
    public  char leerCaracter(String aviso){
        imprimir(aviso);
        return leerCaracter();
    }

    /**
     * Lee un valor lógico: true | false
     * @return un boolean
     */
    public  boolean leerBoolean(){
        boolean valor=false;
        boolean hayError=false;
        String cadena = null;
        String aviso = " ('Escriba s"+((char)243)+"lo true | false')";
        do{
            try{
                cadena = this.leerCadena( );
                hayError = ! "true".equals(cadena) && ! "false".equals(cadena);
                valor = !hayError && "true".equals(cadena);
            }//fin try
            catch(Exception e){
                hayError=true;
                System.err.println("Error: " + aviso);
            }//fin catch
        }//fin do
        while(hayError);
        return valor;
    }//Fin leerBoolean

    /**
     * Sobrecarga leerBoolean para imprimir un aviso.
     * @param  aviso   Un aviso que indique al usuario el significado del valor a ingresar.
     * @return un boolean
     */
    public  boolean leerBoolean(String aviso){
        imprimir(aviso);
        return leerBoolean();
    }//fin  leerBoolean

    /**
     * Muestra un menú de opciones y regresa la posición de la opción seleccionada.
     * @param  opciones    Un arreglo con las opciones a seleccionar
     * @param  aviso   Un aviso que indique al usuario el significado del valor a ingresar.
     * @return un String que indica la opción seleccionada - 1 (de 0 a length)
     */
    public  int menu(String [] opciones, String aviso){
        int opcion;
        System.out.println("**********Menu**********");
        for(int i=0; i<opciones.length; i++)
            System.out.println((i+1)+"- "+opciones[i]);
        imprimir("Escriba una opci"+((char)243)+"n ");
        opcion = this.leerEnteroEnRango(0, opciones.length+1);
        return opcion;
    }//fin menu

    /**
     * Lee un entero como int en un rango dado MIN-MAX
     * @param  MIN el valor entero m&iacute;nimo del rango
     * @param  MAX el valor entero m&acute;ximo del rango
     * @return  un valor entero (int) mayor o igual que MIN y menor o igual que MAX (MIN <= numero <= MAX
     */
    public  int leerEnteroEnRango(final int MIN, final int MAX){

        int numero=0;
        do{
            numero = leerEntero();
        }
        while(numero<MIN || numero>MAX);
        return numero;
    }//fin leerEnteroEnRango

    /**
     * Sobrecarga leerEnteroEnRango para imprimir un aviso.
     * @param  aviso   Un aviso que indique al usuario el significado del valor a ingresar.
     * @param  MIN el valor entero m&iacute;nimo del rango
     * @param  MAX el valor entero m&acute;ximo del rango
     * @return  un valor entero (int) mayor o igual que MIN y menor o igual que MAX (MIN <= numero <= MAX
     */
    public  int leerEnteroEnRango(String aviso, final int MIN, final int MAX){
        imprimir(aviso);
        return leerEnteroEnRango(MIN, MAX);
    }//fin leerEnteroEnRango

    /**
     * Imprime una cadena. Puede usar concatenacion con "+" para unir varios tipos de dato. Por ejemplo:
     * imprimir(1 + "+" + "1" + "=" + 2)
     * @param aviso el aviso a imprimir
     */
    public void imprimir(String aviso)
    {
        System.out.println(aviso);
    } 

    /**
     * Imprime un char
     * @param caracter el char a imprimir
     */
    public void imprimir(char caracter)
    {
        System.out.println(caracter);
    }

    /**
     * Imprime un byte
     * @param numeroByte el numero a imprimir
     */
    public void imprimir(byte numeroByte)
    {
        System.out.println(numeroByte);
    }    

    /**
     * Imprime un short
     * @param numeroShort el numero a imprimir
     */
    public void imprimir(short numeroShort)
    {
        System.out.println(numeroShort);
    }

    /**
     * Imprime un int
     * @param numeroInt el numero a imprimir
     */
    public void imprimir(int numeroInt)
    {
        System.out.println(numeroInt);
    }

    /**
     * Imprime un long
     * @param numeroLong el numero a imprimir
     */
    public void imprimir(long numeroLong)
    {
        System.out.println(numeroLong);
    }

    /**
     * Imprime un float sin formato. Si desea dar formato use el m&eacute;todo sobrecargado.
     * @param numeroFloat el numero a imprimir
     */
    public void imprimir(float numeroFloat)
    {
        System.out.println(numeroFloat);
    }

    /**
     * Imprime un float con formato segun el valor de decimalesPrecision.
     * @param numeroFloat el numero a imprimir
     * @param decimalesPrecision la cantidad de decimales a imprimir
     */
    public void imprimir(float numeroFloat, int decimalesPrecision)
    {
        String formato = "##";
        if(decimalesPrecision>0) formato+=".";
        for(int i=1;i<=decimalesPrecision;i++) formato += "#";
        java.text.DecimalFormat df = new java.text.DecimalFormat(formato);
        System.out.println(df.format(numeroFloat));
    }

    /**
     * Imprime un double sin formato. Si desea dar formato use el m&eacute;todo sobrecargado.
     * @param numeroDouble el numero a imprimir
     */
    public void imprimir(double numeroDoble)
    {
        System.out.println(numeroDoble);
    }

    /**
     * Imprime un double con formato segun el valor de decimalesPrecision.
     * @param numeroDouble el numero a imprimir
     * @param decimalesPrecision la cantidad de decimales a imprimir
     */
    public void imprimir(double numeroDouble, int decimalesPrecision)
    {
        String formato = "##";
        if(decimalesPrecision>0) formato+=".";
        for(int i=1;i<=decimalesPrecision;i++) formato += "#";
        java.text.DecimalFormat df = new java.text.DecimalFormat(formato);
        System.out.println(df.format(numeroDouble));
    }    

    /**
     * Imprime un arreglo char. Cada letra se imprime separada por espacio en blanco y al final ENTER
     * @param arreglo Un arreglo char
     */
    public void imprimir(char [] arreglo)
    {
        for(int i=0; i<arreglo.length; i++)
            System.out.print(arreglo[i]+(i!=arreglo.length-1?" ":"\n"));
    }    
    
    /**
     * Imprime un arreglo int. Cada numero se imprime separado por espacio en blanco y al final ENTER
     * @param arreglo Un arreglo int
     */
    public void imprimir(int [] arreglo)
    {
        for(int i=0; i<arreglo.length; i++)
            System.out.print(arreglo[i]+(i!=arreglo.length-1?" ":"\n"));
    }        
    
    /**
     * Imprime un arreglo float. Cada numero se imprime separado por espacio en blanco y al final ENTER
     * @param arreglo Un arreglo float
     */
    public void imprimir(float [] arreglo)
    {
        for(int i=0; i<arreglo.length; i++)
            System.out.print(arreglo[i]+(i!=arreglo.length-1?" ":"\n"));
    }            
    
    /**
     * Imprime un arreglo double. Cada numero se imprime separado por espacio en blanco y al final ENTER
     * @param arreglo Un arreglo double
     */
    public void imprimir(double [] arreglo)
    {
        for(int i=0; i<arreglo.length; i++)
            System.out.print(arreglo[i]+(i!=arreglo.length-1?" ":"\n"));
    }            

}//fin clase Consola
