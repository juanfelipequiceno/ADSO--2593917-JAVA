import java.util.Scanner;

public class Ejercicio14{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el tamaño del arreglo: ");
        int n = entrada.nextInt();

        String[] arreglo = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el valor para la posición " + i + ": ");
            arreglo[i] = entrada.nextLine();
        }
        System.out.print("Ingrese la palabra a buscar: ");
        String palabra = entrada.nextLine();

        int posicion = buscarPalabra(arreglo, palabra);
        if (posicion != -1) {
            System.out.println("La palabra '" + palabra + "' se encontró en la posición " + posicion + " del arreglo.");
            System.out.println("El contenido de la posición " + posicion + " es: " + arreglo[posicion]);
        } else {
            System.out.println("La palabra '" + palabra + "' no se encontró en el arreglo.");
        }
    }
    public static int buscarPalabra(String[] arreglo, String palabra) {
        int n = arreglo.length;
        for (int i = 0; i < n; i++) {
            if (arreglo[i].equals(palabra)) {
                return i;
            }
        }
        return -1;
    }
}
