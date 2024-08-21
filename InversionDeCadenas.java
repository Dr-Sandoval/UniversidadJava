import java.util.Scanner;

public class InversionDeCadenas {
    public static void main(String[] args) {

        /*
        Ejercicio 4: Inversión de Cadenas
        Descripción: Escribe un programa que invierta una cadena de texto
        proporcionada por el usuario. Es decir, si el usuario introduce "hola",
        el programa debe devolver "aloh".
        */

        //INVOCANDO SCANNER
        Scanner imputUsuario = new Scanner(System.in);

        //CODIGO
        System.out.println("\n BIENVENIDO AL PROGRAMA QUE TE DESORDENA LAS PALABRAS DE MANERA AUTOMATICA \n");
        System.out.print("Escribe una palabra aleatoria = ");

        String palabraRandom = imputUsuario.nextLine();
        int numeroDeCaracteres = palabraRandom.length();
        String[] cadenaInversa = palabraRandom.split("");
        System.out.println("numeroDeCaracteres = " + numeroDeCaracteres);
        String palabra = "";

        for (int i = numeroDeCaracteres - 1 ; i >= 0 ; i--) {
            palabra = palabra + cadenaInversa [i];
            System.out.println("palabra = " + palabra);







        }




    }
}
