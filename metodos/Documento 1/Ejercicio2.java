import java.util.Scanner;

public class Ejercicio2{
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese una Oracion: ");
        String oracion = entrada.nextLine();
        int cantidad = oracion.length();
        int pos;
        char valor=' ';

        for(int i=0;i<cantidad;i++){
            pos =(int) oracion.charAt(i);
            if(pos>=65 && pos <= 90){
                valor = (char)(pos+32);
            }else if(pos>=97 && pos <=122){
                valor = (char)(pos-32);
            }
            System.out.print(valor);
        }
    }
}