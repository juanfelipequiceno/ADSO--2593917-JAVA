import java.util.Scanner;

public class Ciclo15{

    public static void main (String[] args){
        Scanner Entrada = new Scanner(System.in);
        int factorial= 1;

        System.out.print("ingrese el numero de la Secuencia: ");
        int numero = Entrada.nextInt();

        while(numero != 0){
            factorial = factorial*numero; numero--;

        }
        System.out.println(factorial);

    }
}