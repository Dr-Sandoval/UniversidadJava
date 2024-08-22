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
<<<<<<< HEAD
        String palabra = "";

        for (int i = numeroDeCaracteres - 1 ; i >= 0 ; i--) {
            palabra = palabra + cadenaInversa [i];
=======

        for (int i = numeroDeCaracteres - 1 ; i >= 0 ; i--) {
            String palabra = cadenaInversa[i] + cadenaInversa[i] + cadenaInversa[i] + cadenaInversa [i];
>>>>>>> 525ab8c60903b47e3590bc38c94a3f1388aa4d54
            System.out.println("palabra = " + palabra);







        }




    }
}
