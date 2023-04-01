import java.util.Scanner;
import java.util.Arrays;

public class Ejercicio11{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el tamaño de los arreglos: ");
        int tamaño = scanner.nextInt();

        int[] arreglo1 = new int[tamaño];
        int[] arreglo2 = new int[tamaño];

        System.out.println("Ingrese los elementos del primer arreglo:");
        for (int i = 0; i < tamaño; i++) {
            System.out.print("Ingrese el elemento en la posición " + i + ": ");
            arreglo1[i] = scanner.nextInt();
        }
        System.out.println("Ingrese los elementos del segundo arreglo:");
        for (int i = 0; i < tamaño; i++) {
            System.out.print("Ingrese el elemento en la posición " + i + ": ");
            arreglo2[i] = scanner.nextInt();
        }

        Arrays.sort(arreglo1);
        Arrays.sort(arreglo2);

        if (Arrays.equals(arreglo1, arreglo2)) {
            System.out.println("Los dos arreglos contienen la misma información.");
        } else {
            System.out.println("Los dos arreglos son diferentes.");
        }
    }
}
