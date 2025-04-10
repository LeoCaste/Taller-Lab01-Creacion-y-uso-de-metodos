import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Bienvenido al menú de control");

        System.out.println("1. Crear matriz");
        System.out.println("2. ");
        System.out.println("3. ");
        System.out.println("4. ");
        System.out.println("5. ");

        System.out.println("6. ");
    }

    public static int[][] crearMatriz(int filas, int cols) {
        return new int[filas][cols];
    }

    public static void LlennarMatriz(int[][] matriz, int filas, int cols) {
        Random r = new Random();
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j< cols; j++) {
                matriz[i][j] = r.nextInt(10);
            }
        }


    }
}