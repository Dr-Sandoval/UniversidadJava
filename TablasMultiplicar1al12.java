
public class TablasMultiplicar1al12 {
    public static void main(String[] args) {
        System.out.println("\n**************************************** BIENVENIDO AL GENERADOR DE TABLAS DE MULTIPLICAR OBLIGADO (OTRA VEZ) *****************************************\n");


        //ESTRUCTURACION DE CODIGO

        for (int numeroMultiplicando = 0; numeroMultiplicando < 13; numeroMultiplicando++) {
            System.out.printf("""
                    \nTABLA DEL %d\n
                        """, numeroMultiplicando);
            for (int numeroMultiplicador = 0; numeroMultiplicador < 13; numeroMultiplicador++) {
                int productoMultiplicacion = numeroMultiplicando * numeroMultiplicador;
                System.out.printf("""
                        %d * %d = %d
                        """, numeroMultiplicando, numeroMultiplicador, productoMultiplicacion);
            };
        };
    };
};