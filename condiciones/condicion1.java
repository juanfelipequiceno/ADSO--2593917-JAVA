import java.util.Scanner;

import javax.swing.text.DefaultStyledDocument.ElementSpec;

public class Taller1 {
        public static void main (String [] args){
        Scanner Entrada = new Scanner(System.in);
        
        int menor_edad = 800000;
        int mayor_edad = 200000;
        int edad1;       
        System.out.println("Hola Señor usuario");
        System.out.print("ingrese su edad: ");
        edad1 = Entrada.nextInt();

        if ( edad1 >= 18 && edad1 <= 120) {
                
                System.out.println("debes de pagar un impuesto de: " + mayor_edad);

        } else if ( edad1 <= 0 && edad1 >= 17) {
                System.out.println("este es su Auxilio: " + menor_edad);

        } else {
                System.out.println("Hay un error, Ingrese bien los datos perro");
        }

       
        

 }
}