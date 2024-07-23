public class Cadenas {
    public static void main(String[] args) {
        var cadena = "Hola Mundo";

        var nuevaCadena = cadena.replace("Mundo","a todos");
        System.out.println("nuevaCadena = " + nuevaCadena);

        nuevaCadena = cadena.replace("Hola", "Saludos");
        System.out.println("nuevaCadena = " + nuevaCadena);
    }
}
