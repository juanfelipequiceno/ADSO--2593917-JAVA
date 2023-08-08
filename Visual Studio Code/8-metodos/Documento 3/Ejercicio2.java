import java.util.Scanner;

public class Ejercicio2 { 
    // Numeros primos
    public static boolean esPrimo(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner entrena = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int n = entrena.nextInt();
    
        int[] arregloPrimos = new int[n];
        int num = 2;
        int i = 0;
        while (i < n) {
            if (esPrimo(num)) {
                arregloPrimos[i] = num;
                i++;
            }
            num++;
        }
        System.out.println("El arreglo de números primos es:");
        for (int j = 0; j < n; j++) {
            System.out.print(arregloPrimos[j] + " ");
        }
    }
}
