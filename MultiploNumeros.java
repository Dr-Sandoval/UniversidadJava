import java.util.Scanner;

public class MultiploNumeros {
    public static void main(String[] args) {

        //INVOCANDO SCANNER
        Scanner imputUsuario = new Scanner(System.in);

        //MENSAJE DE BIENVENIDA
        System.out.print("Indica el numero del cual desees saber cuantos multiplos tiene hasta el 1000: ");
        int numeroUsuario = Integer.parseInt(imputUsuario.nextLine());

        //VARIABLES
        int contadorDeMultiplos = 0;


        //CODIGO
        for (int i = 1; i < 1000; i++) {
            if (i % numeroUsuario == 0){
                contadorDeMultiplos++;

            }
        }

        System.out.printf("Los multiplos de %d entre 1 al 1000 son: " + contadorDeMultiplos,numeroUsuario);

    }
}
