import java.time.chrono.MinguoChronology;
import java.util.Scanner;

public class Taller2 {

    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);

        int numero1;

        System.out.println("Ingrese un numero de 3 digitos: ");
        numero1 = Entrada.nextInt();

        int valor = numero1 % 2;

        if (valor == 0 ){

            System.out.println("Este valor es un numero PAR: " + valor);
        } else {

            System.out.println("Este valor es IMPAR: " + valor);
        }


        
        
    }

}
