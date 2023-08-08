import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el tamaño del arreglo: ");
        int n = entrada.nextInt();

        int[] arreglo = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el valor para la posición " + i + ": ");
            arreglo[i] = entrada.nextInt();
        }
        System.out.print("Ingrese la posición a buscar: ");
        int posicion = entrada.nextInt();
        
        int valor = arreglo[buscarPosicionCircular(arreglo, posicion)];

        System.out.println("El valor en la posición " + posicion + " es: " + valor);
    }

    public static int buscarPosicionCircular(int[] arreglo, int posicion) {
        int n = arreglo.length;
        if (posicion >= 0) {
            return posicion % n;
        } else {
            return ((posicion % n) + n) % n;
        }
    }
}
