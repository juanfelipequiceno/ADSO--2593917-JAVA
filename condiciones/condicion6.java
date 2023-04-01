import java.util.Scanner;


    public class Taller6{

    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);

        int numero1;
        int digito;

        System.out.println("Ingrese el Numero de 6 Digito");
        int numero1 = Entrada.nextInt();

        System.out.println("Ingrese el Primer Digito");
        int digito = Entrada.nextInt();

        if (digito == 1 ){
            int residuo = (numero1/10)%10;
            System.out.println("este el es digito: " + residuo);
        }else if (digito ==  2){
            int  residuo = (numero1/100)%10;
            System.out.println("este el es digito: " + residuo);
        }else if (digito ==  3){
            int residuo = (numero1/1000)%10;
            System.out.println("este el es digito: " + residuo);
        }else if (digito ==  4){
            int residuo = (numero1/1000)%10;
            System.out.println("este el es digito: " + residuo);
        }else if (digito ==  5){
            int residuo = (numero1/10000)%10;
            System.out.println("este el es digito: " + residuo);
        }else if (digito ==  6){
            int residuo = (numero1/100000)10;
            System.out.println("este el es digito: " + residuo);
        }

    }
}    