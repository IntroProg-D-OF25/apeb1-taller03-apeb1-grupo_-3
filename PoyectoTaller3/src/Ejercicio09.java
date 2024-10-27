public class Ejercicio09 {
    public static void main(String[] args) {
        int v1, v2, v3, v4;
        double operacion1;
        boolean respuesta;
        v1 = 81;
        v2 = 25;
        v3 = 10;
        v4 = 50;

        operacion1 = Math.sqrt(v1) + Math.sqrt(v2) * v3;
        respuesta = operacion1 > v4;
        System.out.println("--------- Solución del problema ------------------");
        System.out.println("Respuesta = " + respuesta);
    }
}
