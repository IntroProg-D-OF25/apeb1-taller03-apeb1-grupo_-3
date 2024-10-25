
public class Ejercicio07 {

    public static void main(String[] args) {
        int v1, v2, v3, v4, v5, v6, v7, v8, v9;
        double operacion01, operacion02;
        boolean respuesta;

        v1 = 81;
        v2 = 9;
        v3 = 3;
        v4 = 9;
        v5 = 10;
        v6 = 1;
        v7 = 100;
        v8 = 25;
        v9 = 100;

        operacion01 = (Math.sqrt(v1) + v2) / v3;
        operacion02 = ((v7 / v8) - Math.sqrt(v9));
        respuesta = (operacion01 == v4) || (v5 > v6) && ((v7 / v8) > Math.sqrt(v9));

        System.out.println(" ");
        System.out.println("--------- Error ------------------");
        System.out.println("--- operacion01 = (Math.sqrt(v1) + v2) / v3;");
        System.out.println("--- operacion02 = ((v7 / v8) - Math.sqrt(v9)); ==> Esta variable guarda un tipo de dato DOUBLE = " + operacion02);
        System.out.println("--- respuesta   = (operacion01 == v4) || (v5 > v6) && (operacion02) ==> La variable 'operacion02' es de tipo de dato DOUBLE al no ser un boleano no se puede compara directamente.");
        System.out.println(" ");
        System.out.println("--------- Solución del problema ------------------");
        System.out.println("- Si se rempaza el '+' de = (100/25) + raiz(100)  a un '>'  (100/25) > raiz(100)  logramos hacer q el programa se ejecute.");
        System.out.println("respuesta = " + respuesta);

    }
}
