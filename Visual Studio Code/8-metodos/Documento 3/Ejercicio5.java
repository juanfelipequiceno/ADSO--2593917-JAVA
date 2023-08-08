import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el número de personas: ");
        int nombre = entrada.nextInt();

        char [] nombres = new char[nombre];
        char[] generos = new char[nombre];

        for (int i = 0; i <= nombre; i++) {
            System.out.println("Ingrese el nombre de la persona " + (i+1) + ": ");
            nombres[i] = entrada.nextLine();

            System.out.println("Ingrese el género de " + nombres[i] + " (M/F): ");
            generos[i] = entrada.nextLine().charAt(0);
        }

        System.out.println("Nombres\t\tGénero");
        for (int i = 0; i < nombre; i++) {
            System.out.println(nombres[i] + "\t\t" + generos[i]);
        }
    }
}
