import java.util.Scanner;

public class Ejercicio1{
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("ingrese una Oracion: ");
        String oracion = entrada.nextLine();
        int cantidad = oracion.length();

        int acom1=0;

        for(int j=0;j<cantidad;j++){
            if(oracion.charAt(j)=='a' || oracion.charAt(j)=='e' || oracion.charAt(j)=='i' || oracion.charAt(j)=='o' || oracion.charAt(j)=='u'){
                    acom1++;
            }
            if(oracion.charAt(j)=='A' || oracion.charAt(j)=='E' || oracion.charAt(j)=='I' || oracion.charAt(j)=='O' || oracion.charAt(j)=='U'){
                    acom1++;
            }
        }
        System.out.println("Esta es la cantidad de Vocales: "+acom1);
    }
}