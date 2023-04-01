import java.util.Scanner;

public class Ejercicio3{
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingresa la primera palabra:");
        String palabra1 = entrada.nextLine();

        System.out.println("Ingresa la segunda palabra:");
        String palabra2 = entrada.nextLine();

        String palabraCompuesta = "";
        int longitud1 = palabra1.length();
        int longitud2 = palabra2.length();
        int longitudMinima = Math.min(longitud1, longitud2);

        for (int i = 0; i < longitudMinima; i++) {
            palabraCompuesta += palabra1.charAt(i);
            palabraCompuesta += palabra2.charAt(i);
        }

        if (longitud1 > longitud2) {
            palabraCompuesta += palabra1.substring(longitudMinima);
        } else if (longitud2 > longitud1) {
            palabraCompuesta += palabra2.substring(longitudMinima);
        }

        System.out.println("La palabra compuesta es: " + palabraCompuesta);
    }
}
