import java.util.Scanner;
public class Ejercicio7{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Solicitar al usuario un número entero para el tamaño del arreglo
        System.out.print("Ingresa el tamaño del arreglo: ");
        int n = entrada.nextInt();

        // Crear un arreglo de tamaño n
        int[] arreglo = new int[n];

        // Solicitar al usuario los números para llenar el arreglo
        for (int i = 0; i < n; i++) {
            System.out.print("Ingresa un número entero para la posición " + i + ": ");
            arreglo[i] = entrada.nextInt();
        }

        // Solicitar al usuario un número correspondiente a una posición del arreglo
        System.out.print("Ingresa un número correspondiente a una posición del arreglo: ");
        int posicion = entrada.nextInt();

        // Imprimir el arreglo original
        System.out.println("Arreglo original:");
        for (int i = 0; i < n; i++) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println();

        // Imprimir los valores del arreglo en sentido antihorario desde la posición indicada por el usuario
        System.out.println("Valores del arreglo en sentido antihorario desde la posición " + posicion + ":");
        for (int i = posicion; i >= 0; i--) {
            System.out.print(arreglo[i] + " ");
        }
        for (int i = n - 1; i > posicion; i--) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println();
    }
}
