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
        
        //VARIABLES
        String vocalA = "a";
        String vocalE = "e";
        String vocalI = "i";
        String vocalO = "o";
        String vocalU = "u";
        int letraA = 0;
        int letraE = 0;
        int letraI = 0;
        int letraO = 0;
        int letraU = 0;

        //CODIGO

        System.out.println("\n- - - - - - - EL CONTADOR DE VOCALES - - - - - - - \n");

        System.out.print("Ingresa una palabra aleatoria: ");
        String palabraRandom = imputUsuario.nextLine().toLowerCase();
        int longitudPalabra = palabraRandom.length();

        System.out.println("La palabra aleatoria que elegiste fue = " + palabraRandom);
        System.out.println("La cantidad de letras de la palabra aleatoria es de: " + longitudPalabra);

        System.out.println("\n*********************************************************************************\n");

        for (int i = 0; i < longitudPalabra; i++) {


            if (palabraRandom.charAt(i) == vocalA.charAt(0)){

                letraA += 1;

            }else if ((palabraRandom.charAt(i) == vocalE.charAt(0))){

                letraE += 1;

            } else if (palabraRandom.charAt(i) == vocalI.charAt(0)){

                letraI += 1;

            } else if (palabraRandom.charAt(i) == vocalO.charAt(0)) {

                letraO += 1;

            } else if (palabraRandom.charAt(i) == vocalU.charAt(0)) {

                letraU += 1;

            }

        }

        System.out.printf("""
            La cantidad de vocales de la palabra %s son:  
            
            Vocal A = %d
            Vocal E = %d
            Vocal I = %d
            Vocal O = %d
            Vocal U = %d
            
            """, palabraRandom, letraA, letraE, letraI, letraO, letraU);

    }
}
