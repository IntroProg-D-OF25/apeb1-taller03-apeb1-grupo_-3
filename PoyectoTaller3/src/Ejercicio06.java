
public class Ejercicio06 {

    public static void main(String[] args) {
        int v1, v2, v3, v4, v5, v6;
        double operacion01;
        boolean respuesta;
        v1 = 81;
        v2 = 9;
        v3 = 9;
        v4 = 9;
        v5 = 10;
        v6 = 1;
        operacion01 = ((Math.sqrt(v1) + v2) / v3);
        respuesta = (operacion01 == v4) && (v5 > v6);
        System.out.println("--------- Solución del problema ------------------");
        System.out.println("respuesta = " + respuesta);
    }
}
