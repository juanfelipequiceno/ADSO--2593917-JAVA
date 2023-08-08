import java.util.Scanner;


    public class Taller5{

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




        if ( numero1 < numero2 && numero1 < numero3) {

        System.out.println("Los numeros se Ingresaron en Orden Ascendente");

        } else if (numero1 > numero2 && numero1 > numero3) {

        System.out.println("Los Numero se Ingresaron en Orden Descendente");

        } else if ( numero1 > numero2 && numero1 < numero3) {

        System.out.println("Los Numeros se Ingresaron de Forma Desordenada");

        }
    }
}
