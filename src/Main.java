import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = null;
        int filas = 0, cols = 0;
        int opcion = 0;

        System.out.println("Bienvenido al menú de control");

        do {
            System.out.println("\n1. Crear matriz");
            System.out.println("2. Mostrar fila");
            System.out.println("3. Llenar matriz con valores aleatorios");
            System.out.println("4. Salir");
            System.out.print("Elija una opción: ");

            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese cantidad de filas: ");
                    filas = sc.nextInt();
                    System.out.print("Ingrese cantidad de columnas: ");
                    cols = sc.nextInt();

                    if (validarDimensiones(filas, cols)) {
                        matriz = crearMatriz(filas, cols);
                        System.out.println("Matriz creada exitosamente.");
                    } else {
                        System.out.println("Dimensiones inválidas. Deben ser mayores que cero.");
                    }
                    break;

                case 2:
                    if (matriz != null) {
                        System.out.print("Ingrese el número de fila a mostrar (0 a " + (filas - 1) + "): ");
                        int fila = sc.nextInt();
                        mostrarFila(matriz, fila);
                    } else {
                        System.out.println("Primero debe crear la matriz.");
                    }
                    break;

                case 3:
                    if (matriz != null) {
                        LlennarMatriz(matriz, filas, cols);
                        System.out.println("Matriz llena con valores aleatorios.");
                    } else {
                        System.out.println("Primero debe crear la matriz.");
                    }
                    break;

                case 4:
                    System.out.println("Saliendo del programa.");
                    break;

                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
                    break;
            }
        } while (opcion != 4);

        sc.close();
    }

    public static int[][] crearMatriz(int filas, int cols) {
        return new int[filas][cols];
    }

    public static void mostrarFila(int[][] matriz, int fila) {
        if (fila < 0 || fila >= matriz.length) {
            System.out.println("La fila no existe.");
            return;
        }
        for (int j = 0; j < matriz[fila].length; j++) {
            System.out.print(matriz[fila][j] + " ");
        }
        System.out.println();
    }

    public static void LlennarMatriz(int[][] matriz, int filas, int cols) {
        Random r = new Random();
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < cols; j++) {
                matriz[i][j] = r.nextInt(10);
            }
        }
    }

    public static boolean validarDimensiones(int filas, int cols) {
        return filas > 0 && cols > 0;
    }
}
