import java.util.Scanner;
public class Ciclo16{

    public static void main (String[] args){
        Scanner Entrada = new Scanner(System.in);

        System.out.print("Ingrese el numero N: ");
        int numero1 = Entrada.nextInt();

        System.out.print("Ingrese el numero M: ");
        int numero2 = Entrada.nextInt();

        int i = numero1;
        int suma = 1;

        while(i<=numero2){
            int j=1;
            while(j<=i){
                suma *=j;
                if (j==i){
                    System.out.print(j + " = ");
                } else{
                    System.out.print(j + " X ");
                }
                if (i==j){
                System.out.println(suma);
                suma=1;
                }
            j++;
        }
        i++;
    }

    }
}