import java.util.Scanner;

public class Taller3 {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);


        int x;
        int y;
         

        System.out.println("Ingrese la primera coordenada");
        x = Entrada.nextInt();

        System.out.println("Ingrese la segunda coordenada");
        y = Entrada.nextInt();

        if ( x > 0 && y > 0 ) {

            System.out.println("esta en el cuadrante 1°: ");

         } else if (x < 0 && y > 0 ){

            System.out.println("esta en el cuadrante 2°: ");

         } else if (x < 0 && y < 0 ){

            System.out.println("esta en el cuadrante 3°: ");

         } else if (x > 0 && y < 0){

            System.out.println("esta en el cuadrante 4°: ");
         } else if (x == 0 && y == 0){
            
            System.out.println("Centro del Plano");
         }

        

    }
}
