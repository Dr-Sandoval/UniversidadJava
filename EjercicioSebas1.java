public class EjercicioSebas1 {
    public static void main(String[] args) {

        /*
        Ejercicio 1: Sumando Números Pares
        Descripción: Escribe un programa que sume todos los números pares del 1 al 100 y muestre el resultado.

         */

        //CODIGO

        int numeroRecipiente = 0;

        for (int i = 0; i < 102; i = i + 2) {
            numeroRecipiente += i;
            int resultado = i;
            System.out.println("resultado = " + resultado);
        }

        System.out.println("numeroRecipiente = " + numeroRecipiente);

    }
}
