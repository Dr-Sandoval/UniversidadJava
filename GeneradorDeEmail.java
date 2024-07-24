import java.util.Scanner;

public class GeneradorDeEmail {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String dominioEmpresa = ".com.co";

        System.out.println("***** CREADOR GENERICO DE EMAILS *****");

        System.out.println("Bienvenido, ingresa por favor tu nombre completo: ");
        String nombreCompleto = input.nextLine().toLowerCase().trim().replace(" ",".");
        System.out.println("nombreCompleto = " + nombreCompleto);

        System.out.println("Muy bien, ahora ingresa el nombre de la empresa en que laboras: ");
        String nombreEmpresa = input.nextLine().toLowerCase().trim().replace(" ","").concat(dominioEmpresa);
        System.out.println("nombreEmpresa = " + nombreEmpresa);

        String correoGenerico = String.join("\u0040",nombreCompleto,nombreEmpresa);
        System.out.println("correoGenerico = " + correoGenerico);

    }
}
