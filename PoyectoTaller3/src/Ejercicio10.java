public class Ejercicio10 {
    public static void main(String[] args) {
        int v1, v2, v3, v6, v7, v8;
        double operacion01, operacion02;
        boolean respuesta, v4, v5;
        v1 = 25;
        v2 = 10;
        v3 = 100;
        v4 = true;
        v5 = false;
        v6 = 10;
        v7 = 5;
        v8 = 2;

        operacion01 = Math.sqrt(v1) * v2;
        operacion02 = v6 / v7;
        respuesta = operacion01 >= v3 && v4 || v5 || operacion02 >= v8;

        System.out.println("--------- Solución del problema ------------------");
        System.out.println("Respuesta = " + respuesta);

    }
}
