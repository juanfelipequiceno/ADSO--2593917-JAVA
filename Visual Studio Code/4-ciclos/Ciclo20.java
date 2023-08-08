import java.util.Scanner;
public class New_Ciclo10{
    public static void main (String[]args){
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese un numero N: ");
        int numero = teclado.nextInt();
        int acum = 0;
        int ultimo = 0;
        int invertido = 0;

        for (int i=1 ; i<=numero ; i++){
            
            for (int j=1 ; j<=numero ; j++){
                ultimo=acum%10;
                invertido = (invertido * 10) + ultimo;
                acum=acum/10; 
                acum=j;
                System.out.print(acum+" ");
            }
            
            
            
            System.out.println(" ");
            
        }

    }
}