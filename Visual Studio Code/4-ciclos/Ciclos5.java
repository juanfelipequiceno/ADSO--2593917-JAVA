import java.util.Scanner;

public class Ciclos5{

    public static void main (String[] args){
        Scanner Entrada = new Scanner(System.in);

        int numero1 = 0;
        int numero2 = 1;
        int numero3;
        int numero4;


        System.out.println("Ingrese un numero: ");
        numero4 = Entrada.nextInt();

        for(int i=0; i < numero4;i++){
            System.out.println(numero1);
            numero3 = numero1 + numero2;
            numero1 = numero2;
            numero2 = numero3;

        }

    }
}