import java.util.Scanner;

public class numeroMayor {
    public static void main(String[] args) {
        Scanner usuario = new Scanner(System.in);

        System.out.println("Proporciona el numero 1 = ");
        int numero1 = Integer.parseInt(usuario.next());
        System.out.println("Proporciona el numero 2 = ");
        int numero2 = Integer.parseInt(usuario.nextLine());

        String numeroMayor = (numero1>numero2) ? "Numero Mayor es " + numero1 : "Numero Mayor es " + numero2;
        System.out.println("numeroMayor = " + numeroMayor);

        usuario.close(); //Cerrar el Scanner libera los recursos del sistema asociados con él, como el flujo de entrada del sistema.
    }
}
