public class TIendaEnLinea {
    public static void main(String[] args) {

        System.out.println("*** Tienda en Linea - Detalle del Producto #1 ***");

        String nombreProducto = "Caja";
        double precioProducto = 152.3;
        int cantidadProducto = 45;
        boolean estaDisponible = true;

        System.out.println("nombreProducto = " + nombreProducto);
        System.out.println("precioProducto = " + precioProducto);
        System.out.println("cantidadProducto = " + cantidadProducto);
        System.out.println("estaDisponible = " + estaDisponible);

        System.out.println("*** Tienda en Linea - Detalle del Producto #2 ***");

        nombreProducto = "Zapato";
        precioProducto = 200.5;
        cantidadProducto = 96;
        estaDisponible = false;

        System.out.println("nombreProducto = " + nombreProducto);
        System.out.println("precioProducto = " + precioProducto);
        System.out.println("cantidadProducto = " + cantidadProducto);
        System.out.println("estaDisponible = " + estaDisponible);


    }
}
