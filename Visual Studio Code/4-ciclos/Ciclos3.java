import java.util.Scanner;

public class Ciclos3{

    public static void main (String[] args){
        Scanner Entrada = new Scanner(System.in);

    System.out.print("Ingrese la altura de la Piramide:");
    int altura = Entrada.nextInt();
     
 
        for (int i=1;i<=altura;i++ ){
            int multi = (2*i)-1;
            int n = altura - i;

            for (int m=1;m<=n;m++){
                System.out.print(" ");
            }
            
            for (int j=0;j<multi;j++){
                System.out.print("x");
            }

            System.out.println();
     
        }
    }
}