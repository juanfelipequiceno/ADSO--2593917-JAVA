import java.util.Scanner;

public class Ciclos2{

    public static void main (String[] args){
        Scanner Entrada = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de Notas:");
            int cantidad = Entrada.nextInt();

        

            
        float sumatoria = 0;
        float sumatoria_creditos= 0;
        float divicion;

        for (int i=1;i<=cantidad;i=i+1 ){
            System.out.print("Ingrese nota"+i+":");
            float notas = Entrada.nextFloat();
           

            System.out.print("Ingrese el Credito"+i+":");
            float valor_credito = Entrada.nextFloat();
            
            sumatoria_creditos = sumatoria_creditos + valor_credito;
            sumatoria = sumatoria + (valor_credito * notas);
            
            
        }
        divicion = sumatoria/sumatoria_creditos;
        System.out.println("Total de Creditos: " + sumatoria_creditos);
        System.out.println("Promedio del semestre: " + divicion);
       
    }
}