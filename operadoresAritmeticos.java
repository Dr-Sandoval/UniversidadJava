//import java.util.Scanner;

public class operadoresAritmeticos {
    public static void main(String[] args) {

//        Scanner consola = new Scanner(System.in);

// Operadores de Asignacion y Relacionales

        //Operadores de Igualdad
        var a = 3;
        var b = 2;
        var c = (a == b);
        System.out.println("c = " + c);

        //Operador de diferencia
        var d = a != b;
        System.out.println("d = " + d);

        //Operador de igualdad con cadena de textos

        var cadena = "Hola";
        var cadena2 = "Hola";
        var e = cadena == cadena2; // Esta comparacion no esta evaluando el contenido de cada string, esta comparando las refencias de los objetos.
        var f = cadena.equals(cadena2); //Con el metodo equals nos ayuda a comparar el contenido de cada cadena de texto.



// Operadores Relacionales

        var g = a >= b; // Estamos usando el operador "mayor o igual que", los output de este tipo de operadores son Bolean.
        System.out.println("g = " + g);

        

//        //OPERADORES UNARIOS
//
//        //Operador unario de cambio de signo
//        var a = 3;
//        var b = -a;//Asignacion y cambio de signo.
//        System.out.println("a = " + a);
//        System.out.println("b = " + b);
//
//        //Operador unario de negacion para variables del tipo Boolean
//        var c = false;
//        var d = !c;
//        System.out.println("c = " + c);
//        System.out.println("d = " + d);
//
//        //Operador Unario de Incremento y Decremento
//
//        //Operador Unario de Incremento
//
//            //Operador Unario de Pre-Incremento
//            var e = 1;
//            var f = ++e; // Primero incrementa el valor de la variable "e" y luego ese valor incrementado se asigna a "f"
//            System.out.println("e = " + e);
//            System.out.println("f = " + f);
//
//            //Operador Unario de Post-Incremento
//            var g = 1;
//            var h = g++; //Primero se asigna el valor de la variable "g" a la variable "h" y luego se incrementa el valor de la variable "g"
//            System.out.println("g = " + g);
//            System.out.println("h = " + h);
//
//
//        //Operador Unario de Decrecimiento
//
//            //Operador Unario de Pre-Decrecimiento
//            var i = 5;
//            var j = --i;// Primero decrementa el valor de la variable "i" y luego ese valor decrementado se asigna a "j"
//            System.out.println("i = " + i);
//            System.out.println("j = " + j);
//
//            //Operador Unario de Post-Decrecimiento
//            var k = 8;
//            var l = k--; //Primero se asigna el valor de la variable "k" a la variable "l" y luego se decrementa el valor de la variable "k"
//            System.out.println("k = " + k);
//            System.out.println("l = " + l);


//        //OPERADORES ARITMETICOS
//        int a = 3, b = 2;
//        var resultado = a + b;
//        System.out.println("resultado suma = " + resultado);
//
//        resultado = a - b;
//        System.out.println("resultado resta = " + resultado);
//
//        resultado = a * b;
//        System.out.println("resultado multiplicacion = " + resultado);
//
//        var resultado2 = 3D / b;
//        System.out.println("resultado division = " + resultado2);
//
//        //OPERADORES ASIGNACION
//
//        int c = 3, d = 2, f = 4;
//        int e = a + 5 - b;//Poniendo en practica el operador de asignacion "=".
//        System.out.println("e = " + e);
//
//        c += 1;//Poniendo en practica el operador de composicion "+=, -=, /=, *=, %=.
//        System.out.println("c = " + c);
//
//        d -= 1;
//        System.out.println("d = " + d);
//
//        f /= 2;
//        System.out.println("f = " + f);


    }
}
