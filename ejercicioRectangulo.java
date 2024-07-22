import java.util.Scanner;

public class ejercicioRectangulo {
    public static void main(String[] args) {
        Scanner usuario = new Scanner(System.in);

        System.out.println("Bienvenido, con esta herramienta podras calcular el area y perimetro de un rectangulo.");
        System.out.println("Ingresa por favor el alto del rectangulo: ");
        int alto = usuario.nextInt();
        System.out.println("Ahora ingresa por favor el ancho del rectangulo: ");
        int ancho = usuario.nextInt();
        int area = alto * ancho;
        int perimetro = (alto + ancho) * 2;
        System.out.println("Excelente, los resultados obtenidos fueron: Area = " + area + ", y Perimetro = " + perimetro + ".");
    }

}

//        CORRECCION DEL EJERCICIO REALIZADO
//        import java.util.Scanner;
//
//        public class ejercicioRectangulo {
//            public static void main(String[] args) {
//                Scanner usuario = new Scanner(System.in);
//
//                System.out.println("Bienvenido, con esta herramienta podras calcular el area y perimetro de un rectangulo.");
//                System.out.println("Ingresa por favor el alto del rectangulo: ");
//                int alto = usuario.nextInt();
//
//                // Consumir la nueva línea restante en el buffer
//                usuario.nextLine();
//
//                System.out.println("Ahora ingresa por favor el ancho del rectangulo: ");
//                int ancho = usuario.nextInt();
//
//                // Consumir la nueva línea restante en el buffer
//                usuario.nextLine();
//
//                int area = alto * ancho;
//                int perimetro = (alto + ancho) * 2;
//                System.out.println("Excelente, los resultados obtenidos fueron: Area = " + area + ", y Perimetro = " + perimetro + ".");
//
//            }
////        }

//        EJERCICIO OPTIMO
//
//        import java.util.Scanner;
//
//        public class Main {
//            public static void main(String[] args) {
//                Scanner scanner = new Scanner(System.in);
//                // Escribe tu solucion aqui
//                System.out.println("Proporciona el alto:");
//                int alto = Integer.parseInt(scanner.nextLine());
//                System.out.println("Proporciona el ancho:");
//                int ancho = Integer.parseInt(scanner.nextLine());
//                int area = alto * ancho;
//                int perimetro = (alto + ancho) * 2;
//                System.out.println("Area: " + area);
//                System.out.println("Perimetro: " + perimetro);
//            }
//        }

