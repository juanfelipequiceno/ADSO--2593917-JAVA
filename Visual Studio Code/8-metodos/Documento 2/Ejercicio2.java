import java.util.Scanner;

public class Ejercicio2{
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);

    

        System.out.println("ingrese una frase");
        String frase = entrada.nextLine();
        int cantidad = frase.length();

        System.out.println("Ingrese un numero");
        int numero = entrada.nextInt();

        if(numero<=0 || numero > cantidad){
            System.out.print("intentalo de nuevo");
        }else{
            for(int i=numero;i<cantidad;i++ ){
                System.out.print(frase.charAt(i));
            }
            for(int j=0;j<numero;j++){
                System.out.print(frase.charAt(j));
                
            }
        
        }

    }
}