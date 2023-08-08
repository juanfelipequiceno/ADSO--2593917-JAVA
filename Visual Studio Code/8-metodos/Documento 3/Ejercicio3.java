import java.util.Random;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese un número entero: ");
        int n = entrada.nextInt();
        int[] arreglo = new int[n];

        Random numero_aleatorio = new Math.Random();
        for (int i = 0; i < n; i++) {
            arreglo[i] = numero_aleatorio.nextInt(Math.Random());
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;
                }
            }
        }
        System.out.println("Arreglo ordenado:");
        for (int i = 0; i < n; i++) {
            System.out.print(arreglo[i] + " ");
        }
    }
}
