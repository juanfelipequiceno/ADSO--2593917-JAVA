import java.util.Scanner;
public class Ejercicio_real3{
    public static void main(String [] args){
        Scanner teclado = new Scanner(System.in);

        System.out.print("Valor a financiar: ");
        int capital = teclado.nextInt();

        System.out.print("Taza de interes: ");
        int interes = teclado.nextInt();

        System.out.print("Cantidad de cuotas ");
        int cuotas = teclado.nextInt();
        
        

        for (int i=1; i<=cuotas;i++){
            System.out.println("Valor cuota " +i+ " que desea pagar ");
            int valorc=teclado.nextInt();
            int total = capital*interes;
            int porcentaje = total/100; 
            System.out.println("interes "+porcentaje);
            int cap = valorc-porcentaje;
            System.out.println("capital "+cap);
            int total_d= capital-valorc;
            System.out.println("total deuda "+total_d);
            capital=total_d;

        }
    }
}