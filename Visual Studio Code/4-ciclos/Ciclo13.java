import java.util.Scanner;
public class Ciclo13{

    //sacar numero primo

    public static void main (String[] args){
        Scanner Entrada = new Scanner(System.in);
        
        int acum=0;
        int aleatorio;

        System.out.println("Ingrese un numero: ");
        int num = Entrada.nextInt();
         
        while(int i==num){
            aleatorio = (int)(Math.ramdom()*999);
        }
        for(int j=1; j<=alatorio; j++){
            if (aleatorio%j == 0){
                acum++;
                System.out.println(i);
            }
            i++;
        }

        if (acum==2){
            System.out.print("El "+j+" Primo Generado es: " + aleatorio);  
            j++;
        
        }
    }
}
