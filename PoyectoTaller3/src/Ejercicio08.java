
public class Ejercicio08 {

    public static void main(String[] args) {
        int v01, v02, v03, v04, v05, v06, v07, v08, v09, v10, v11, v12;
        double operacion01, operacion02;
        boolean respuesta;

        v01 = 10;
        v02 = 9;
        v03 = 20;
        v04 = 500;
        v05 = 2;
        v06 = 3;
        v07 = 2;
        v08 = 200;
        v09 = 50;
        v10 = 50;
        v11 = 50;
        v12 = 51;

        operacion01 = ((v01 * v02) + v03 - (v04 / v05) + Math.pow(v06, v07));
        operacion02 = (v10 - v11 + v12);
        respuesta = (operacion01 >= v08) || (v09 >= operacion02);

        System.out.println("--------- Solución del problema ------------------");
        System.out.println("Respuesta = " + respuesta);
    }
}
