import java.util.Scanner;

public class Ejercicio1{
    public static void main(String[] args) {
        Scanner entrena = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int n = entrena.nextInt();

        int[] arreglo = new int[n];
        int num = 1;
        for (int i = 0; i < n; i++) {
            arreglo[i] = num;
            num += 2;
        }

        System.out.print("Arreglo de números impares: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arreglo[i] + " ");
        }
    }
}
