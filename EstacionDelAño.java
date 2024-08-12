import java.util.Scanner;

public class EstacionDelAño {
    public static void main(String[] args) {

        //INVOCACION DE ESCANER
        Scanner imputUsuario = new Scanner(System.in);

        //CODIGO
        System.out.println("\n * * * * ESTACION DEL AÑO * * * * \n");

        int contador = 0;

        while (contador < 13) {
            System.out.print("Indica un numero correspondiente a un mes del año y te dire en que Temporada del Año estas:  ");
            int mes = Integer.parseInt(imputUsuario.nextLine());

            if (mes == 1 || mes == 2 || mes == 12) {
                System.out.println("Estamos en Invierno");
            } else if (mes == 3 || mes == 4 || mes == 5) {
                System.out.println("Estamos en Primavera");
            } else if (mes == 6 || mes == 7 || mes == 8) {
                System.out.println("Estamos en Verano");
            } else if (mes == 9 || mes == 10 || mes == 11) {
                System.out.println("Estamos en Otoño");
            } else {
                System.out.println("Estacion Desconocida");
            }

            contador++;

        }


    }
}
