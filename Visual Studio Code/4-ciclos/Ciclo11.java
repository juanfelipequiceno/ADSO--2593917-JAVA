import java.util.Scanner;

public class Ciclos11{

//numero aleatorio
    public static void main (String[] args){
        Scanner Entrada = new Scanner(System.in);
        
        int suma =1;

        System.out.print("Ingrese un numero Aleatorio en 1 y 6: ");
        int numero1 = Entrada.nextInt();
        

        for(int i=1;i<numero1;i++){
            int aleatorio = (int)(Math.random()*10);
            suma=suma*10+aleatorio; 
            
            
        }
        System.out.println("El numero Construido: " +suma);
        int total = suma*2;
        System.out.println("Resultado Producto: "+ total);
       
    }
}
