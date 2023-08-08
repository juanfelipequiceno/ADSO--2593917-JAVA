import java.util.Scanner;

public class Ejercicio15{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el tamaño del arreglo: ");
        int n = entrada.nextInt();

        String[] arreglo = new String[n];
        System.out.println("Ingrese los datos del arreglo:");

        for (int i = 0; i < n; i++) {
            arreglo[i] = entrada.next();
        }
        System.out.println("Arreglo original:");
        imprimirArreglo(arreglo);
        System.out.print("Ingrese la posición del dato a eliminar: ");
        int posicionAEliminar = entrada.nextInt();

        if (posicionAEliminar >= n || posicionAEliminar < 0) {
            System.out.println("Posición inválida.");
        } else {
            for (int i = posicionAEliminar; i < n - 1; i++) {
                arreglo[i] = arreglo[i + 1];
            }
            arreglo[n - 1] = null;
            System.out.println("Arreglo después de eliminar el dato:");
            imprimirArreglo(arreglo);
        }
    }
    public static void imprimirArreglo(String[] arreglo) {
        for (String s : arreglo) {
            System.out.print(s + " ");
        }
        System.out.println();
    }
}
