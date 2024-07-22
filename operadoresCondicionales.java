public class operadoresCondicionales {
    public static void main(String[] args) {

    //Operadores Condicionales
        //Operador AND &&

            var a = 15;
            var valorMinimo = 0;
            var valorMaximo = 10;

            var resultado = a >= valorMinimo && a <= valorMaximo;
            if (resultado){
                System.out.println("Dentro del rango");
            }else {
                System.out.println("Fuera del rango");
            }
        //Operador OR ||

            var vacaciones = false;
            var diaDescanso = false;

            if (vacaciones||diaDescanso){
                System.out.println("Padre puede asistir al juego del hijo");

            }else{
                System.out.println("Padre esta ocupado");
            }

    //Operador Ternario
        var resultado2 = (3>2) ? "Verdadero" : "Falso";
        System.out.println("resultado2 = " + resultado2);

        var numero = 9;
        var resultado3 = (numero % 2 == 0) ? "Numero Par" : "Numero Impar";
        System.out.println("resultado3 = " + resultado3);

    //Precedencia de Operadores

        var x = 5;
        var y = 10;
        var z = ++x + y--;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);

        var resultado4 = 4 + 5 * 6 / 3;
        System.out.println("resultado4 = " + resultado4);

    }
}
