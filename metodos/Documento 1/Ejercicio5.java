import java.util.Scanner;

public class Ejercicio5{
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese una palabra: ");
        String palabra = entrada.nextLine();
        int valor = palabra.length();

        System.out.println("1. Iniciar");
        System.out.println("2. salir");
        int j = entrada.nextInt();
        
        char [] letra = palabra.toCharArray();
        char [] letraGuion = new char [letra.length];

        while(j <= 1){

            for(int i=0;i<valor;i++){
                letraGuion[i]='_';
            }
            System.out.println(letraGuion);

            boolean ganar=false;

            while(ganar==false){

            System.out.print("Ingrese una letra");
            String letraIndi = entrada.nextLine();
            char letraIndi2 = letraIndi.charAt();
            for(int k=0; k<letra.length;k++){
                if(letra[k]==letraIndi2){
                    letraGuion[k]=letraIndi2;
                }
            }
            if(Arrays.equals(letra, letraGuion)) {
                System.out.print("Ganaste");
            }
            System.out.print(letraGuion);

            }
        j++;
        }


    }
}