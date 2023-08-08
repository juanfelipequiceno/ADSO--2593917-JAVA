import java.util.Scanner;

public class Arreglos0{
    public static void main (String[]args){ 
        Scanner entrada = new Scanner(System.in);

        //arreglo vacio
        int []arreglo_1 = new int [5]
        //crear arreglo lleno
        int [] arreglo_2 = {1,2,30,20,,79};
        //llenar arreglo con numeros pares

        for(int i=0;i<arreglo_1.length; i++){
            arreglo_1[i]= (i+1)*2;
        }    
        //imprimir arreglo
        for(int i=0;i<=arreglo_1.length;i++){
            System.out.print("["+arreglo_1[i]+"]");
        }

    }
}