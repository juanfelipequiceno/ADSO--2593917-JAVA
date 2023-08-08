import java.util.Scanner;

public class Ejercicio8{
    public static void main(String[] args) {
        Scanner estrada = new Scanner(System.in);
        
        System.out.print("Ingrese un numero: ");
        int longitud = estrada.nextInt();
        
        int[] arreglo = new int[longitud];
        
        for (int i = 0; i < longitud; i++) {
            System.out.print("Ingrese el elemento en la posición " + i + ": ");
            arreglo[i] = estrada.nextInt();
        }
        int[] pares = new int[longitud];
        int[] impares = new int[longitud];
        int contadorPares = 0;
        int contadorImpares = 0;
        
        for (int i = 0; i < longitud; i++) {
            if (arreglo[i] % 2 == 0) {
                pares[contadorPares] = arreglo[i];
                contadorPares++;
            } else {
                impares[contadorImpares] = arreglo[i];
                contadorImpares++;
            }
        }
        System.out.print("Arreglo original: ");
        for (int i = 0; i < longitud; i++) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println();

        System.out.print("Arreglo de números pares: ");
        for (int i = 0; i < contadorPares; i++) {
            System.out.print(pares[i] + " ");
        }
        System.out.println(" (longitud: " + contadorPares + ")");
        
        System.out.print("Arreglo de números impares: ");
        for (int i = 0; i < contadorImpares; i++) {
            System.out.print(impares[i] + " ");
        }
        System.out.println(" (longitud: " + contadorImpares + ")");
    }
}
