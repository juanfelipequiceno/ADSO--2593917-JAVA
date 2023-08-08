import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese una contraseña: ");
        String contraseña = entrada.nextLine();
        
        boolean cumpleMinimo = contraseña.length() <= 8;
        boolean cumpleMayuscula = contraseña.matches(".*[A-Z].*");
        boolean cumpleMinuscula = contraseña.matches(".*[a-z].*");
        boolean cumpleNumero = contraseña.matches(".*\\d.*");
        boolean cumpleCaracter = contraseña.matches(".*[!@#$%^&*()_+\\-=[\\]{};':\"\\\\|,.<>/?].*");
        
        if (cumpleMinimo && cumpleMayuscula && cumpleMinuscula && cumpleNumero && cumpleCaracter) {
            System.out.println("La contraseña cumple con los requisitos de seguridad.");
        } else {
            System.out.println("La contraseña NO cumple con los requisitos de seguridad.");
        }
    }

}
