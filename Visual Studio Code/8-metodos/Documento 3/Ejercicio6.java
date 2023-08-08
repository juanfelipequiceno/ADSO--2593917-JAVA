import java.util.Scanner;
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nombreUsuario;
        int opcion;
        System.out.print("Ingrese su nombre: ");
        nombreUsuario = scanner.nextLine();

        do {
            System.out.println("\nMenú de opciones:");
            System.out.println("1: Registrar pago mensual - año 2019");
            System.out.println("2: Ver pago todos los meses - año 2019");
            System.out.println("3: Ver pago mes especifico");
            System.out.println("4: Salir");

            System.out.print("\nIngrese la opción deseada: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    registrarPago();
                    break;
                case 2:
                    verPagosAnio();
                    break;
                case 3:
                    System.out.print("Ingrese un número entero: ");
                    int n = entrada.nextInt();
                    int[] arreglo = new int[n];

                    Random numero_aleatorio = new Math.Random();
                    for (int i = 0; i < n; i++) {
                        arreglo[i] = numero_aleatorio.nextInt(Math.Random());
                    }
                    for (int i = 0; i < n - 1; i++) {
                        for (int j = 0; j < n - i - 1; j++) {
                            if (arreglo[j] > arreglo[j + 1]) {
                                int temp = arreglo[j];
                                arreglo[j] = arreglo[j + 1];
                                arreglo[j + 1] = temp;
                            }
                        }
                    }
                    System.out.println("Arreglo ordenado:");
                    for (int i = 0; i < n; i++) {
                        System.out.print(arreglo[i] + " ");
                    }
                case 4:
                    System.out.println("\n¡Hasta pronto, " + nombreUsuario + "!");
                    break;
                default:
                    System.out.println("\nOpción inválida. Intente de nuevo.");
            }
        } while (opcion != 4);
        scanner.close();
    }
    public static void registrarPago() {
        // Lógica para registrar un pago mensual
        System.out.println("\nSe ha registrado el pago exitosamente.");
    }
    public static void verPagosAnio() {
        // Lógica para ver todos los pagos del año 2019
        System.out.println("\nEstos son los pagos realizados en el año 2019:");
    }
    public static void verPagoMesEspecifico() {
        // Lógica para ver un pago específico de un mes determinado
        System.out.println("\nIngrese el mes que desea consultar (1-12): ");
    }

}
