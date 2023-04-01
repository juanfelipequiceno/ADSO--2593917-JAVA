import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese un Numero: ");
        int longitud = entrada.nextInt();
        
        int[] arreglo = new int[longitud];
        
        for (int i = 0; i < longitud; i++) {
            System.out.print("Ingrese una posición " + i + ": ");
            arreglo[i] = entrada.nextInt();
        }

        System.out.print("Ingrese un número correspondiente a una posición dentro del arreglo: ");
        int posicion = entrada.nextInt();
    
        System.out.print("Arreglo original: ");
        for (int i = 0; i < longitud; i++) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println();
        
        System.out.print("Arreglo en sentido anti horario a partir de la posición " + posicion + ": ");
        for (int i = posicion; i >= 0; i--) {
            System.out.print(arreglo[i] + " ");
        }
        for (int i = longitud - 1; i > posicion; i--) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println();
    }
}
