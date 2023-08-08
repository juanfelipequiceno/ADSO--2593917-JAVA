import java.util.Scanner;

public class Ejercicio12{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el tamaño del primer arreglo: ");
        int tamaño1 = entrada.nextInt();
        System.out.print("Ingrese el tamaño del segundo arreglo: ");
        int tamaño2 = entrada.nextInt();

        int[] arreglo1 = new int[tamaño1];
        int[] arreglo2 = new int[tamaño2];

        System.out.println("Ingrese los elementos del primer arreglo:");
        for (int i = 0; i < tamaño1; i++) {
            System.out.print("Ingrese el elemento en la posición " + i + ": ");
            arreglo1[i] = entrada.nextInt();
        }
        System.out.println("Ingrese los elementos del segundo arreglo:");
        for (int i = 0; i < tamaño2; i++) {
            System.out.print("Ingrese el elemento en la posición " + i + ": ");
            arreglo2[i] = entrada.nextInt();
        }
        int tamaño3 = tamaño1 + tamaño2;
        int[] arreglo3 = new int[tamaño3];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < tamaño1 && j < tamaño2) {
            arreglo3[k++] = arreglo1[i++];
            arreglo3[k++] = arreglo2[j++];
        }
        while (i < tamaño1) {
            arreglo3[k++] = arreglo1[i++];
        }
        while (j < tamaño2) {
            arreglo3[k++] = arreglo2[j++];
        }
        System.out.println("El tercer arreglo con la información intercalada de los dos arreglos originales es:");
        for (i = 0; i < tamaño3; i++) {
            System.out.print(arreglo3[i] + " ");
        }
    }
}
