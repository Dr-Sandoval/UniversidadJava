import java.util.Scanner;

public class HolaMundo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Bienvenido al sistema de registro de Libros, por favor digita el nombre del libro que deseas registrar: ");
        String nombreLibro = input.nextLine();
        System.out.println("Excelente, ahora indica por favor el numero de ID del libro indicado: ");
        int idLibro = input.nextInt();
        System.out.println("Muy bien, ahora indica por favor el precio del Libro: ");
        double precioLibro = input.nextDouble();
        System.out.println("Excelente, ahora por ultimo, indica si el envio es gratuito, escribe 'true' para afirmar o 'false' para negar: ");
        boolean envioGratuito = input.nextBoolean();
        System.out.println("Enhorabuena has registrado con exito el siguiente libro: ");
        System.out.println("Nombre de Libro: " + nombreLibro + "\n" + "Id del libro: #" + idLibro + "\n" + "Precio del libro: $" + precioLibro + "\n" + "Envio Gratuito: " + envioGratuito);

    }
}
