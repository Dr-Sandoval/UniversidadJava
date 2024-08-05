import java.util.Scanner;

public class EjercicioIVA {
    public static void main(String[] args) {

        System.out.println("***************************** CALCULADORA DE IVA *********************************");

        //INVOCACION DE CLASES
        Scanner inputTeclado= new Scanner(System.in);

        //MENSAJE INICIAL
        String mensajeInicial = ("""
            \t Bienvenido a nuestro sistema de Estimación de IVA.
            \t Elige pais de donde deseas calcular el IVA:
            \t \t 1.- URUGUAY
            \t \t 2.- ARGENTINA
            \t \t 3.- COLOMBIA
            \t \t 4.- VENEZUELA
            \t \t 5.- PARAGUAY
            \t \t 6.- PANAMA
            \t \t 0.- SALIR
            """);
        String mensajeSecundario = """
                \t¿Deseas calcular el valor del IVA en otro pais?
                \t Elige pais de donde deseas calcular el IVA:
                \t \t 1.- URUGUAY
                \t \t 2.- ARGENTINA
                \t \t 3.- COLOMBIA
                \t \t 4.- VENEZUELA
                \t \t 5.- PARAGUAY
                \t \t 6.- PANAMA
                \t \t 0.- SALIR
                """;

        System.out.println(mensajeInicial);


        // CONSTANTES
        final double impuestoUruguay = 0.22;
        final double impuestoArgentina = 0.21;
        final double impuestoColombia = 0.19;
        final double impuestoVenezuela = 0.12;
        final double impuestoParaguay = 0.10;
        final double impuestoPanama = 0.07;

        //VARIABLES
        double valorConImpuesto = 0;
        double calculoImpuesto = 0;
        boolean isFinish = true;

        //ESTRUCTURACION DE CODIGO

        while (isFinish) {

            int eleccionUsuario = Integer.parseInt(inputTeclado.nextLine());

            switch (eleccionUsuario) {
                case 1:
                    System.out.println("""
                            Muy bien has elegido a URUGUAY. \n
                            \t ¿Sabias que URUGUAY tiene un IVA del 22 %?. \n
                            \t Ingresa el monto al cual deseas estimar el IVA: \n
                            """);
                    valorConImpuesto = Double.parseDouble(inputTeclado.nextLine());
                    calculoImpuesto = valorConImpuesto * impuestoUruguay;
                    System.out.println("El IVA del monto indicado en URUGUAY es de = " + calculoImpuesto + "\n");
                    System.out.println(mensajeSecundario);
                    break;

                case 2:
                    System.out.println("""
                            Muy bien has elegido a ARGENTINA. \n
                            \t ¿Sabias que ARGENTINA tiene un IVA del 21 %?. \n
                            \t Ingresa el monto al cual deseas estimar el IVA: \n
                            """);
                    valorConImpuesto = Double.parseDouble(inputTeclado.nextLine());
                    calculoImpuesto = valorConImpuesto * impuestoArgentina;
                    System.out.println("El IVA del monto indicado en ARGENTINA es de = " + calculoImpuesto + "\n");
                    System.out.println(mensajeSecundario);
                    break;

                case 3:
                    System.out.println("""
                            Muy bien has elegido a COLOMBIA. \n
                            \t ¿Sabias que COLOMBIA tiene un IVA del 19 %?. \n
                            \t Ingresa el monto al cual deseas estimar el IVA: \n
                            """);
                    valorConImpuesto = Double.parseDouble(inputTeclado.nextLine());
                    calculoImpuesto = valorConImpuesto * impuestoColombia;
                    System.out.println("El IVA del monto indicado en COLOMBIA es de = " + calculoImpuesto + "\n");
                    System.out.println(mensajeSecundario);
                    break;

                case 4:
                    System.out.println("""
                            Muy bien has elegido a VENEZUELA. \n
                            \t ¿Sabias que VENEZUELA tiene un IVA del 12 %?. \n
                            \t Ingresa el monto al cual deseas estimar el IVA: \n
                            """);
                    valorConImpuesto = Double.parseDouble(inputTeclado.nextLine());
                    calculoImpuesto = valorConImpuesto * impuestoVenezuela;
                    System.out.println("El IVA del monto indicado en VENEZUELA es de = " + calculoImpuesto + "\n");
                    System.out.println(mensajeSecundario);
                    break;

                case 5:
                    System.out.println("""
                            Muy bien has elegido a PARAGUAY. \n
                            \t ¿Sabias que PARAGUAY tiene un IVA del 12 %?. \n
                            \t Ingresa el monto al cual deseas estimar el IVA: \n
                            """);
                    valorConImpuesto = Double.parseDouble(inputTeclado.nextLine());
                    calculoImpuesto = valorConImpuesto * impuestoParaguay;
                    System.out.println("El IVA del monto indicado en PARAGUAY es de = " + calculoImpuesto + "\n");
                    System.out.println(mensajeSecundario);
                    break;

                case 6:
                    System.out.println("""
                            Muy bien has elegido a PANAMA. \n
                            \t ¿Sabias que PANAMA tiene un IVA del 12 %?. \n
                            \t Ingresa el monto al cual deseas estimar el IVA: \n
                            """);
                    valorConImpuesto = Double.parseDouble(inputTeclado.nextLine());
                    calculoImpuesto = valorConImpuesto * impuestoPanama;
                    System.out.println("El IVA del monto indicado en PANAMA es de = " + calculoImpuesto + "\n");
                    System.out.println(mensajeSecundario);
                    break;

                case 0:
                    System.out.println("Hasta Luego");
                    isFinish = false;
                    break;

                default:
                    System.out.println("Seleccion INVALIDA, por favor selecciona de nuevo tu opción.");
                    break;

            };
        };
    };
};
