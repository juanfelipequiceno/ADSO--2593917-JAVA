import java.util.Scanner;
public class Matrices3{
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el numero de Filas");
        int n = entrada.nextInt();
        System.out.print("Ingrese el numero de Columnas");
        int m = entrada.nextInt();

        int fila_columna [][] = new int [n][m];


        for(int i=0;i<fila_columna.length;i++){
            for(int j=0;fila_columna[i].length;j++){
                System.out.print("0");
            }
            System.out.println("");
        }

    }
}