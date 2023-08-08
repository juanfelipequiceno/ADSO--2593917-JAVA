import java.util.Scanner;
import java.util.ArrayList;

public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner entrada_texto = new Scanner(System.in);
        Scanner entrada_numero = new Scanner(System.in);

        ArrayList<String> municipios = new ArrayList<>(100);
        
        System.out.print("Por favor, ingrese su nombre: ");
        String nombre = entrada_texto.nextLine();

        System.out.println("1.Registrar Municipio.");
        System.out.println("2.Ver lista de Municipio.");
        System.out.println("3.Ver informacion Municipio.");
        System.out.println("4.Registrar Numero de habitantes en un municipio.");
        System.out.println("5.Verlista de Departamentos Registrados.");
        System.out.println("6.Ver informacion de Departamento.");
        System.out.println("7.Eliminar Municipio.");
        System.out.println("8.Eliminar Departameno.");
        System.out.println(" ");

        System.out.print("Señor: " + nombre + " - Deacuerdo al menu, Ingrese una Opcion: ");
        int opcion = entrada_texto.nextInt();
        

        if(opcion == 1){
            boolean continuar = true;
            while (continuar) {
                System.out.println("Ingrese un municipio: ");
                String municipio = entrada_texto.nextLine();
                
                municipios.add(municipio);
                
                System.out.print("¿Desea ingresar otro municipio? (s/n): ");
                String respuesta = entrada_texto.nextLine();
                
                if (respuesta.equalsIgnoreCase("n")) {
                    continuar = false;
                }
            }
            System.out.println("1.Registrar Municipio.");
            System.out.println("2.Ver lista de Municipio.");
            System.out.println("3.Ver informacion Municipio.");
            System.out.println("4.Registrar Numero de habitantes en un municipio.");
            System.out.println("5.Verlista de Departamentos Registrados.");
            System.out.println("6.Ver informacion de Departamento.");
            System.out.println("7.Eliminar Municipio.");
            System.out.println("8.Eliminar Departameno.");
            System.out.println(" ");

            System.out.print("Señor: " + nombre + " - Deacuerdo al menu, Ingrese una Opcion: ");
            opcion = entrada_texto.nextInt();
        }
        if(opcion==2){
            System.out.println("|----------------------------------------|");
            System.out.println("|--------lista de los Municipios----------|");
            for (String municipio : municipios) {
                System.out.println(" - "+municipio);
            }
            System.out.println("|----------------------------------------|");
            System.out.println("|----------------------------------------|");
            System.out.println(" ");

            System.out.println("1.Registrar Municipio.");
            System.out.println("2.Ver lista de Municipio.");
            System.out.println("3.Ver informacion Municipio.");
            System.out.println("4.Registrar Numero de habitantes en un municipio.");
            System.out.println("5.Verlista de Departamentos Registrados.");
            System.out.println("6.Ver informacion de Departamento.");
            System.out.println("7.Eliminar Municipio.");
            System.out.println("8.Eliminar Departameno.");
            System.out.println("");

            System.out.print("Señor: " + nombre + " - Deacuerdo al menu, Ingrese una Opcion: ");
            opcion = entrada_texto.nextInt();
        }
    }
}
