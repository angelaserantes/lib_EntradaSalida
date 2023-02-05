import javax.swing.*;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * Libreria para sacar por dispositivos un mensaje y
 * pedir por consola distintos tipos de datos
 * @version 0.2
 * @author Angela Serantes
 */
public class EntradaSalida {
    /**
     * opción de uso de la consola para imprimir un mensaje
     */
    public static final int SALIDA_CONSOLA = 1;
    /**
     * opción de uso de utilizar una ventana en el escritorio para sacar un mensaje
     */
    public static final int SALIDA_WINDOW = 2;



    /**
     * opción para recoger un string
     */
    public static final int STRING_COMENTARIO = 1;
    /**
     * opción para recoger un entero
     */
    public static final int INT_COMENTARIO =2;

    private void EntradaSalida(){};

    /**
     * Salida por ventana o consala de un mensaje
     * @param msj cadena que queremos imprimir
     * @param device dispositivo de salida<br>consola: SALIDA_CONSOLA<br>ventana:SALIDA_VENTANA
     * @return si es true: correcto si no false
     */
    public static boolean salida(String msj, int device) {
        switch (device) {
            case SALIDA_CONSOLA:
                try {
                    System.out.println("Consola: " + msj);
                    return true;
                } catch (Exception e) {
                    return false;
                }

            case SALIDA_WINDOW:
                try {
                    JOptionPane.showMessageDialog(null,"Sale por un ventana " + msj);
                    return true;
                } catch(Exception e) {
                    System.out.println(e.getMessage());
                    return false;
                }
            default:
                return false;
        }
    }
    /**
     * Salida por ventana o consala de un número entero
     * @param edad cadena que queremos imprimir
     * @param device dispositivo de salida<br>consola: SALIDA_CONSOLA<br>ventana:SALIDA_VENTANA
     * @return si es true: correcto si no false
     */

    public static boolean salidanumero(int edad, int device) {
        switch (device) {
            case SALIDA_CONSOLA:
                try {
                    System.out.println("Consola: " + edad);
                    return true;
                } catch (Exception e) {
                    return false;
                }

            case SALIDA_WINDOW:
                try {
                    JOptionPane.showMessageDialog(null,"Sale por un ventana " + edad);
                    return true;
                } catch(Exception e) {
                    System.out.println(e.getMessage());
                    return false;
                }
            default:
                return false;
        }
    }



    /**
     * método para obtener un String por consola
     * @param device
     * @return null
     */
    public static String entradaString(int device){
        switch (device){
            case STRING_COMENTARIO:
                try {
                    System.out.println("Dime tu nombre");
                    Scanner datos = new Scanner(System.in);
                    return datos.nextLine();
                } catch (Exception e){
                    System.out.println(e.getMessage());
                    return null;
                }
            default:
                return null;
        }


    }


    /**
     * método para obtener un entero por consola
     * @param device
     * @return edad
     */

    public static int entradaInt(int device) {
        boolean edadOK = false;
        int edad = 0;
        Scanner datos = new Scanner(System.in);
        while (!edadOK) {
            switch (device) {
                case INT_COMENTARIO:

                    try {
                        edadOK = true;
                        System.out.println("Dime tu edad");
                        edad = datos.nextInt();
                        //return datos.nextInt();
                    } catch (InputMismatchException ex) {
                        edadOK = false;
                        ex.printStackTrace();
                        datos.next();

                    }

            }
    } return edad;

}
}