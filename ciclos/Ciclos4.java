import java.util.Scanner;

public class Ciclos4{

    public static void main (String[] args){
        Scanner Entrada = new Scanner(System.in);
        int opcion = 0;
       
        while(opcion != 3){
            System.out.println("|-------------BIENVENIDO-------------|");
            System.out.println("|1. Docente                          |");
            System.out.println("|2. Estudiante                       |");
            System.out.println("|3. Salir                            |");
            System.out.println("|------------------------------------|");

            System.out.println("Ingrese una Opcion");
            opcion = Entrada.nextInt();

            if (opcion == 1){
                System.out.print("Ingrese la cantidad de Notas:");
                    int cantidad = Entrada.nextInt();
                    float sumatoria= 0;
                    for (int i=1;i<=cantidad;i=i+1 ){
                        System.out.print("Ingrese nota"+i+":");
                        float nota = Entrada.nextFloat();
                        sumatoria = sumatoria + nota;        
                    }
                    float promedio = sumatoria / cantidad;
                    System.out.print("el Promedio es: "+ promedio);

            } else if(opcion == 2){
                System.out.print("Ingrese la cantidad de Notas:");
                int cantidad1 = Entrada.nextInt();
        
                float sumatoria = 0;
                float sumatoria_creditos= 0;
                float divicion;

                for (int i=1;i<=cantidad1;i=i+1 ){
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
            } else if (opcion == 3){
                System.out.print("salir");
            }else if (opcion < 1 && opcion > 3 ){
                System.out.print("Error, Ingrese bien la Opcion");
            }
        }

        


    }
}
