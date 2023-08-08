import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese un número entero: ");
        int n = entrada.nextInt();
        String[] nombres = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el nombre " + (i+1) + ": ");
            nombres[i] = entrada.next();
        }
        System.out.println("Arreglo original: " + Arrays.toString(nombres));
        Arrays.sort(nombres);
        System.out.println("Arreglo ordenado: " + Arrays.toString(nombres));
    }
}

