import java.util.Scanner;

public class Taller4 {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);

            int numero1;
            int numero2;
            int numero3;

            System.out.println("Ingrese el Primer Digito");
            numero1 = Entrada.nextInt();

            System.out.println("Ingrese el Segundo Digito");
            numero2 = Entrada.nextInt();

            System.out.println("Ingrese el Tercer Digito");
            numero3 = Entrada.nextInt();


            if ( numero1 > numero2 && numero1 > numero3) {

                System.out.println("Este es el numero mayor: " + numero1);

            } else if ( numero2 > numero1 && numero2 > numero3 ) {

            System.out.println("Este es el nuemro mayor: " + numero2);

            }else if (numero3 > numero1 && numero3 > numero2){

            System.out.println("Este es el nuemro mayor: " + numero3);

            }
    
            if (numero1 < numero2 && numero1 < numero3) {

            System.out.println("Este es el numero menor: " + numero1);

            } else if ( numero2 < numero1 && numero2 < numero3 ) {

            System.out.println("Este es el nuemro menor: " + numero2);

            }else if (numero3 < numero1 && numero3 < numero2){

            System.out.println("Este es el nuemro menor: " + numero3);

            }


    }   
}
