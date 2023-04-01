import java.util.Scanner;

public class Ejercicio4{
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese la palabra: ");
        String palabra = entrada.nextLine();
        int cantidad = palabra.length();

        char [] arreglo = new char[cantidad];

        int cont=0;
        for(int i=cantidad-1;i>=0;i--){
            arreglo[cont]=palabra.charAt(i);
            cont++;
        }
        String nueva = String.copyValueOf(arreglo);
        if(palabra.equalsIgnoreCase(palabra)==nueva.equalsIgnoreCase(nueva)){
            System.out.print("La palabra es Polindroma: ");
        }else{
            System.out.print("La palabra no es Polindroma: ");
        }
    }
}
