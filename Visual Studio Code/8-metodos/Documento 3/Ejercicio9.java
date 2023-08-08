import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner estrada = new Scanner(System.in);

        System.out.print("Ingrese un numero: ");
        int longitud = estrada.nextInt();

        int[] arreglo = new int[longitud];

        for (int i = 0; i < longitud; i++) {
            System.out.print("Ingrese el elemento en la posición " + i + ": ");
            arreglo[i] = estrada.nextInt();
        }

        int[] primos = new int[longitud];
        int[] noPrimos = new int[longitud];
        int contadorPrimos = 0;
        int contadorNoPrimos = 0;

        for (int i = 0; i < longitud; i++) {
            if (esPrimo(arreglo[i])) {
                primos[contadorPrimos] = arreglo[i];
                contadorPrimos++;
            } else {
                noPrimos[contadorNoPrimos] = arreglo[i];
                contadorNoPrimos++;
            }
        }

        System.out.print("Arreglo original: ");
        for (int i = 0; i < longitud; i++) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println();

        System.out.print("Arreglo de números primos: ");
        for (int i = 0; i < contadorPrimos; i++) {
            System.out.print(primos[i] + " ");
        }
        System.out.println(" (longitud: " + contadorPrimos + ")");

        System.out.print("Arreglo de números no primos: ");
        for (int i = 0; i < contadorNoPrimos; i++) {
            System.out.print(noPrimos[i] + " ");
        }
        System.out.println(" (longitud: " + contadorNoPrimos + ")");
    }

    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }

        return true;
    }
}
