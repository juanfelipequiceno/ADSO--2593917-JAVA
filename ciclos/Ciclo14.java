import java.util.Scanner;
public class Ciclo14{

//polindromo
    public static void main (String[] args){
        Scanner Entrada = new Scanner(System.in);

        System.out.print("Ingrese un numero N Maximo de 6 digitos: ");
        int numero = Entrada.nextInt();
        int valor =0;
        int invertido=0;
        int i=0;

        while(i<numero){
            valor = numero%10;
            invertido = (invertido*10)+valor;
            numero = numero/10;
            System.out.print(valor);
            i++;
            
        }
        System.out.println(numero);
        if (valor==numero){
            System.out.println("el numero si es Palindromo");
        }else {
            System.out.println("El numero no es Palindromo");
        }


    }
}