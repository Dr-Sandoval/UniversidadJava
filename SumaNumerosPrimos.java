import java.util.Scanner;

public class SumaNumerosPrimos {

    public static void main(String[] args) {

        /*
        Ejercicio 3: Números Primos
        Descripción: Escribe un programa que determine si un número
        proporcionado por el usuario es primo o no.

         */

        //INVOCAMOS SCANNER
        Scanner inputUsuario = new Scanner(System.in);

        //CODIGO
        System.out.println("\n- - - - - - - - - - - - SENSOR DE NUMEROS PRIMOS - - - - - - - - - - - - \n");

        System.out.println("""
                Bienvenido, el objetivo del programa es determinar si el número elegido por usted es PRIMO o no. ¿Listos?, comencemos..
                
                \tCONDICIONES PARA QUE UN NUMERO SEA PRIMO: 
                
                \t 1.- SOLO TIENEN (2) DIVISORES: EL NUMERO (1) UNO Y EL MISMO NUMERO.
                \t 2.- EL RESULTADO AL DIVIDIR TIENE QUE SER NUMERO ENTERO.
                
                \tMETODO DE EVALUACIÓN
                
                \t 1.- SE SACARA LA RAIZ CUADRADA DEL NUMERO QUE INGRESE EL USUARIO.
                \t 2.- DICHO RESULTADO ESTABLECERÁ EL LIMITE DE NUMEROS HASTA DONDE SE VERIFICARÁN LOS DIVISORES.
                
                       EJEMPLO: 
                       0.- Numero Usuario = 17
                       1.- Raiz Cuadrada (17) = 4.12
                       2.- Verificamos Divisibilidad hasta = 2, 3 y 4.
                       3.- Si es divisible por alguno de los factores, no es primo.
                
                """);


        System.out.println("Digita un número aleatorio = ");
        int numeroUsuario = Integer.parseInt(inputUsuario.nextLine());
//        System.out.println("numeroUsuario = " + numeroUsuario);
        double raizCuadrada = Math.sqrt(numeroUsuario);
//        System.out.println("raizCuadrada = " + raizCuadrada);
        int enteroRaizCuadrada = (int)raizCuadrada;
        System.out.println("enteroRaizCuadrada = " + enteroRaizCuadrada);

        for (int i = 2; i <= enteroRaizCuadrada; i++) {


            if(numeroUsuario % i == 0){
                System.out.printf("""
                El numero elegido %d NO ES PRIMO
                """, numeroUsuario);
                return;

            }else {
                System.out.printf("""
                        El numero elegido %d SI ES PRIMO.
                        """, numeroUsuario);
                        return;
            }

        }







    }

}
