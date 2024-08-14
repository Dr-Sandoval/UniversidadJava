import java.util.Scanner;

public class EjercicioSebas22 {
    public static void main(String[] args) {

        /*
        Ejercicio 2.2: Contando Vocales
        Descripción: Escribe un programa que cuente cuántas vocales
        hay en una cadena de texto proporcionada por el usuario.
        (RESUELTO CON ARRAY Y METODO SPLIT)
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
        String[] palabraSegmentada = palabraRandom.split("");

        System.out.println("La palabra aleatoria que elegiste fue = " + palabraRandom);
        System.out.println("La cantidad de letras de la palabra aleatoria es de: " + longitudPalabra);

        System.out.println("\n*********************************************************************************\n");

        for (int i = 0; i < longitudPalabra; i++) {


            if (palabraSegmentada[i].equals(vocalA)){

                letraA += 1;

            } else if (palabraSegmentada[i].equals(vocalE)) {

                letraE += 1;

            } else if (palabraSegmentada[i].equals(vocalI)) {

                letraI += 1;

            } else if (palabraSegmentada[i].equals(vocalO)) {

                letraO += 1;

            } else if (palabraSegmentada[i].equals(vocalU)) {

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
