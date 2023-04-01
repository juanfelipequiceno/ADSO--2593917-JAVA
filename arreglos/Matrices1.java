import java.util.Scanner;
public class Matrices1{
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("ingrese Dos numeros enteros: ");
        int n = entrada.nextInt();
        int m = entrada.nextInt();

        int matriz [][] = new int [n][m];

        for(int i=0;i<m;i++){
            for(int j=0;j<m;j++){
                System.out.print("Ingrese los Datos: "+i+ "-"+j+ ": ");
                matriz[i][j] = entrada.nextInt();
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<m;j++){
                System.out.println("Estos son los Datos Guardados en la Matriz: "+matriz[i][j]);
            
            }
        }

    }
}