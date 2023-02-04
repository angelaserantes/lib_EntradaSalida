public class Main {
    public static void main(String[] args) {

        boolean isOK_ventana = false;
        boolean isOK_consola = false;

        isOK_consola = EntradaSalida.salida("Hola", EntradaSalida.SALIDA_CONSOLA);
        if (!isOK_consola) System.out.println("ERROR CONSOLA");
        isOK_ventana = EntradaSalida.salida("Hello world", EntradaSalida.SALIDA_WINDOW);
        if (!isOK_ventana) System.out.println("ERROR VENTANA");
        String nombre = EntradaSalida.entradaString(EntradaSalida.STRING_COMENTARIO);
        int edad =  EntradaSalida.entradaInt(EntradaSalida.INT_COMENTARIO);

        isOK_consola = EntradaSalida.salida(nombre, EntradaSalida.SALIDA_CONSOLA);
        if (!isOK_consola) System.out.println("ERROR CONSOLA");
        isOK_ventana = EntradaSalida.salida(nombre, EntradaSalida.SALIDA_WINDOW);
        if (!isOK_ventana) System.out.println("ERROR VENTANA");

        isOK_consola = EntradaSalida.salidanumero(edad, EntradaSalida.SALIDA_CONSOLA);
        if (!isOK_consola) System.out.println("ERROR CONSOLA");
        isOK_ventana = EntradaSalida.salidanumero(edad, EntradaSalida.SALIDA_WINDOW);
        if (!isOK_ventana) System.out.println("ERROR VENTANA");

    }
}