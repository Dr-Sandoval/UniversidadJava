import java.util.Random;
import java.util.Scanner;

public class GeneradorDeID {
    public static void main(String[] args) {
        //MENSAJE INICIAL
        System.out.println("\n********* GENERADOR DE ID UNICO *********\n");

        //CREACION DEL NUMERO ALEATORIO
        Random generadorRandom = new Random();

        //VARIABLES DE ENTRADA Y SOLICITUD DE INFORMACION
        Scanner inputUsuario = new Scanner(System.in);
        System.out.print("¿Cual es tu nombre? = ");
        String nombreUsuario = inputUsuario.nextLine();
        System.out.print("¿Cual es tu apellido? = ");
        String apellidoUsuario = inputUsuario.nextLine();
        System.out.print("¿Cual es tu año de nacimiento? = ");
        String yearNacimiento = inputUsuario.nextLine();

        //EXTRACCION DE DATOS PARA LA CREACION DEL ID

        String letrasNombre = nombreUsuario.toUpperCase().strip().substring(0,2);
        String letrasApellido = apellidoUsuario.toUpperCase().strip().substring(0,2);
        String  numerosYear = yearNacimiento.strip().substring(2,4);

        //CREACION DEL NUMERO ALEATORIO CON SUS CONDICIONALES
        System.out.println("\n******************************************************\n");
        int numeroRandom = generadorRandom.nextInt(9999)+1;
        System.out.println("numeroRandom = " + numeroRandom);
        String numeroRandomFormateado = String.format("%04d",numeroRandom);
        System.out.println("numeroFormateado = " + numeroRandomFormateado);
        System.out.println("\n******************************************************\n");

        //CREACION DEL ID
        String nuevoID = letrasNombre + letrasApellido + numerosYear + numeroRandomFormateado;

        //IMPRESION DEL MENSAJE DE SALIDA Y ENTREGA DE NUEVO ID UNICO
        System.out.printf("""
                Hola %s,
                \t Tú nuevo numero de identificacion (ID) generado por el sistema es:
                \t %s
                \t ¡FELICIDADES!
                """,nombreUsuario,nuevoID);

    }
}
