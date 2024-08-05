import java.util.Scanner;

public class TablasDeMultiplicar {
    public static void main(String[] args) {

        System.out.println("\n**************************************** BIENVENIDO A LAS TABLAS DE MULTIPLICAR DEL VENEQUITO DE LA SUERTE *****************************************\n");


        //INVOCANDO CLASES
        Scanner inputTeclado = new Scanner(System.in);

        //ESTRUCTURACION DE CODIGO
        System.out.println("Indicame que numero quieres que multipliquemos:  ");
        int numeroMultiplicando = Integer.parseInt(inputTeclado.nextLine());
        System.out.println("Indicame el numero hasta donde quieres que multiplique: ");
        int numeroMultiplicador = Integer.parseInt(inputTeclado.nextLine());

        System.out.printf("""
                    Aqui tienes la tabla de multiplicacion solicitada: 
                    
                    TABLA DEL %d
                    """,numeroMultiplicando);

        for (int i = 0; i <= numeroMultiplicador; i++) {
            int productoMultiplicacion = numeroMultiplicando * i;
            System.out.printf("""
                    %d * %d = %d
                    
                    """,numeroMultiplicando, i, productoMultiplicacion);

        }

    }
}
