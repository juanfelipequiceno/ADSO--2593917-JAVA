import java.util.Scanner;
public class Ciclo17{
    //rombo

    public static void main (String[] args){
        Scanner Entrada = new Scanner(System.in);

        System.out.print("Ingrese el Numero N:");
        int altura = Entrada.nextInt();
        int nu = (altura+1)/2;
        for( int i=1;i<=nu;i++){
            for(int j=1;j<=nu-i;j++){
                System.out.print("");
            }

            for(int al=0;al<(i*2)-1;al++){
                System.out.print("x");
            }
            System.out.println();
        }
        nu--;
        for (int i=0;i<nu;i++){
            for(int j=0;j<=i;j++){
                System.out.print(" ");
            }
            for(int al=0;al<((nu-1)*2)-1;al++){
                System.out.print("x");
            }
            System.out.println();
        }
    }
} 