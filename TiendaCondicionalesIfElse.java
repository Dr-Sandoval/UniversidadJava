import java.util.Scanner;

public class TiendaCondicionalesIfElse {
    public static void main(String[] args) {

        System.out.println("\n************************** TIENDA EN LINEA ****************************\n");


        //INVOCANDO CLASES
        Scanner inputUsuario = new Scanner(System.in);

        //VARIABLES Y EJECUCION DEL CODIGO
        final double MONTO_MINIMO = 1000.00;

        System.out.print("¿Indica cual fue el monto de tu compra? ");
        double montoDeCompra = Double.parseDouble(inputUsuario.nextLine());

        System.out.print("¿Eres miembro de la tienda (True/False)? = ");
        boolean miembroDeTienda = Boolean.parseBoolean(inputUsuario.nextLine());

        //CONDICIONAL IF/ELSE IF

        if (montoDeCompra >= MONTO_MINIMO && miembroDeTienda == true){

            double descuentoCompra = montoDeCompra * 0.10;
            double montoTotal = montoDeCompra - descuentoCompra;

            System.out.printf("""
                    \n\t¡Felicitaciones, has obtenido un descuento del 10 porciento del monto de tu compra!\n
                    \tMonto de compra = %.2f
                    \tDescuento = %.2f
                    \tMonto total a pagar con descuentos = %.2f \n
                    
                    ¡Gracias por preferirnos!
                    
                    """,montoDeCompra,descuentoCompra, montoTotal);
        }else if(montoDeCompra < MONTO_MINIMO && miembroDeTienda == true){

            double descuentoCompra = montoDeCompra * 0.05;
            double montoTotal = montoDeCompra - descuentoCompra;

            System.out.printf("""
                    \n\t¡Felicitaciones, has obtenido un descuento del 5 porciento del monto de tu compra!\n
                    \tMonto de compra = %.2f
                    \tDescuento = %.2f
                    \tMonto total a pagar con descuentos = %.2f \n
                    
                    ¡Gracias por preferirnos!
                    
                    """,montoDeCompra,descuentoCompra, montoTotal);

        }else {
            System.out.println("\n¡Lo lamentamos, no has recibido, ningun descuento, te invitamos a ser parte de nuestra tienda afiliandote a ella!");
        }


    }
}
