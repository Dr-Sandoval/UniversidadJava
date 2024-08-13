import java.util.Scanner;

public class EjercicioSebas2 {
    public static void main(String[] args) {

        /*
        Ejercicio 2: Contando Vocales
        Descripción: Escribe un programa que cuente cuántas vocales
        hay en una cadena de texto proporcionada por el usuario.
         */

        //INVOCACION DE SCANNER 
        Scanner imputUsuario = new Scanner(System.in);
        
        //CODIGOS
        int numeroVocales = 0; 
        String vocalA = "a";
        String vocalE = "e";
        String vocalI = "i";
        String vocalO = "o";
        String vocalU = "u";

        System.out.println("\n- - - - - - - EL CONTADOR DE VOCALES - - - - - - - \n");

        System.out.println("Ingresa una palabra aleatoria: ");
        String palabraRandom = "casa";
        int longitudPalabra = palabraRandom.length();
//        System.out.println("La primera letra es: " + palabraRandom.charAt(0));
//        System.out.println("La primera letra es: " + vocalA.charAt(0));


        System.out.println("palabraRandom = " + palabraRandom);
        System.out.println("La cantidad de letras de la palabra random es de: " + longitudPalabra);

        for (int i = 0; i < longitudPalabra; i++) {

            if (palabraRandom.charAt(i) == vocalA.charAt(0)){

                numeroVocales += i;

            }else{
                System.out.println("nada");
            }

        }
        System.out.printf("""
                La cantidad de vocales de la palabra %s son %d
                """, palabraRandom, numeroVocales);

    }
}
