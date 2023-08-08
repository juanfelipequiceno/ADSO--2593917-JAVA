import java.util.Scanner;

public class Ejercicio2{
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);


       
        System.out.print("Ingrese la cantidad financiada");
        int numero = entrada.nextInt();
        System.out.print("cantidad de cuotas pagadas");
        int numero1 = entrada.nextInt();
        System.out.print("valor de cada cuota");
        int numero2 = entrada.nextInt();

        int multi = numero1 * numero2;
        int nuevo = multi - numero;
        float mult = (float)nuevo/(float)numero;
        float porcentaje = mult*100;
        
        System.out.print("Este es el porcentaje de interes: "+porcentaje+"%");

            
    }
}