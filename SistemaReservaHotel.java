import java.util.Scanner;

public class SistemaReservaHotel {
    public static void main(String[] args) {

        //INVOCACION DE ESCANER
        Scanner imputUsuario = new Scanner(System.in);

        //CONSTANTES
        final double PRECIO_CON_VISTA = 190.50;
        final double PRECIO_SIN_VISTA = 150.50;

        //CODIGO
        System.out.println("\n***** SISTEMA DE RESERVA DE HOTEL ****\n");
        System.out.print("Indica tu nombre y apellido: ");
        String nombreCliente = imputUsuario.nextLine();
        System.out.print("Indica cuantos dias te alojaras en el Hotel: ");
        int estadiaHotel = Integer.parseInt(imputUsuario.nextLine());
        System.out.print("Deseas una habitacion con vista al mar (True = Si / False = No): ");
        boolean vistaAlMar = Boolean.parseBoolean(imputUsuario.nextLine());

        String desiciones = (vistaAlMar) ? "Si" : "No";

        if (vistaAlMar){
            double precioTotalConVista = PRECIO_CON_VISTA * estadiaHotel;
            System.out.printf("""
                    \n------------ DETALLES DE LA RESERVACION ------------\n
                    Estimado(a) %s.
                    Dias de estadia: %d.
                    Habitacion con vista al mar: %s
                    Costo total por reservacion: $ %.2f
                   
                   ¡Feliz Estadia!.
                   """,nombreCliente,estadiaHotel,desiciones,precioTotalConVista);
        }else {
            double precioTotalSinVista = PRECIO_SIN_VISTA * estadiaHotel;
            System.out.printf("""
                    \n------------ DETALLES DE LA RESERVACION ------------\n
                    Estimado(a) %s.
                    Dias de estadia: %d.
                    Habitacion con vista al mar: %s
                    Costo total por reservacion: $ %.2f
                   
                   ¡Feliz Estadia!.
                   """,nombreCliente,estadiaHotel,desiciones,precioTotalSinVista);

        }
    }
}
