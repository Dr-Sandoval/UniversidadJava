import java.util.Scanner;

public class RecetaCocina {
    public static void main(String[] args) {
        Scanner inputUsuario = new Scanner(System.in);

        //******************************************************************************//
        //MENSAJE INICIAL
        System.out.println("*********RECETAS DE COCINA DEL VENEQUITO DE LA SUERTE*********\n");

        //VARIABLES E INPUTS DE ENTRADA DE LA CONSOLA
        System.out.println("Ingresa el nombre de la receta: ");
        String nombreReceta = inputUsuario.nextLine();
        System.out.println("Ingresa la lista de ingredientes separados por comas (,): ");
        String listaIngredientes = inputUsuario.nextLine();
        System.out.println("Ingresa el tiempo de preparacion (min): ");
        int tiempoPreparacion = Integer.parseInt(inputUsuario.nextLine());
        System.out.println("Ingresa la dificultad de la receta (facil, medio, dificil): ");
        String dificultadReceta = inputUsuario.nextLine();

        //SALIDA
        System.out.println("\n*********RECETAS DE COCINA DEL VENEQUITO DE LA SUERTE*********\n");
        System.out.println("Nombre de Receta = " + nombreReceta + ".");
        System.out.println("Lista de Ingredientes = " + listaIngredientes + ".");
        System.out.println("Tiempo de Preparacion = " + tiempoPreparacion + " min.");
        System.out.println("Dificultad = " + dificultadReceta + ".");






    }
}
