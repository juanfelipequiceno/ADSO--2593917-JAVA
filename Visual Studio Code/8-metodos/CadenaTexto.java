import java.util.Scanner;

    public class CadenaTexto{
        public static void main(String[]args){

            //variable para leer datos
            Scanner entrada = new Scanner(System.in);

            pedir texto al usuario
            System.out.print("Ingrese su nombre: ");
            String cadena = entrada.nextLine();

            pruebas
            System.out.println("-> Valor almacenamineto "+cadena);
            //devuelto en la cantidad de caracteres
            System.out.println("-> Cadena letras "+cadena.length());
            //parametro charAt
            System.out.println("->Letra en Pos 0: "+cadena.charAt(0));
            System.out.println("->Letra en Pos 4: "+cadena.charAt(4));
            System.out.println("->Letra en Pos 5: "+cadena.charAt(5));
            System.out.println("->Letra en Pos 2: "+cadena.charAt(2));

            compareTo
            String palabra_1 = "Hola";
            String palabra_2 = "Mundo";

            System.out.println("CompareTo P1 a P2: "+palabra_1.compareTo(palabra_2));
            System.out.println("CompareTo P2 a P1: "+palabra_2.compareTo(palabra_1));

            //compareToignoreCase
            String palabra_1 = "a";
            String palabra_2 = "A";

            System.out.println("CompareTo P1 a P2: "+palabra_1.compareTo(palabra_2));
            System.out.println("CompareTo P2 a P1: "+palabra_2.compareTo(palabra_1));

            // equals
            String palabra_1 = "hola mundo";
            String palabra_2 = "Hola Mundo";

            System.out.println("equals P1 a P2: "+palabra_1.equals(palabra_2));
            System.out.println("equals P2 a P1: "+palabra_2.equals(palabra_1));

            System.out.println("equals P1 a P2: "+palabra_1.equalsIgnoreCase(palabra_2));
            System.out.println("equals P2 a P1: "+palabra_2.equalsIgnoreCase(palabra_1));

           

            
        }
    }