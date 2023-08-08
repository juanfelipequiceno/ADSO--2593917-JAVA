import java.util.Scanner;

public class Ciclos1{

    public static void main (String[] args){
        Scanner Entrada = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de Notas:");
            int cantidad = Entrada.nextInt();


        float sumatoria= 0;

         for (int i=1;i<=cantidad;i=i+1 ){
           System.out.print("Ingrese nota"+i+":");
           float nota = Entrada.nextFloat();
           sumatoria = sumatoria + nota;        

        }

        float promedio = sumatoria / cantidad;
        System.out.print("el Promedio es: "+ promedio);


    }
}