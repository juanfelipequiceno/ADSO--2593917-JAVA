import java.util.Scanner;

public class Ejercicio3{
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese su nombre completo: ");
        String nombre = entrada.nextLine();
        int cantidad = nombre.length();
        
        char [] arreglo = new char [cantidad];
        char [] invertido = new char [cantidad];

        for(int i=0;i<cantidad;i++){
            arreglo[i]=nombre.charAt(i);
        }
        int cont = 0;
        for(int j=cantidad-1;j>=0;j--){
            invertido[cont]=arreglo[j];
            cont++;
        }
        System.out.print("Nombre Invertido: "+String.copyValueOf(invertido));


        
    }
}