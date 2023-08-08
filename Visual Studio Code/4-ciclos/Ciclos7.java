import java.util.Scanner;

public class Ciclos7{

    public static void main (String[] args){
        Scanner Entrada = new Scanner(System.in);

        boolean buscando;
        int contador = 1;
      

        System.out.print("Ingrese el Primer Numero");
        int numero1 = Entrada.nextInt();

        System.out.print("Ingrese el Primer Numero");
        int numero2 = Entrada.nextInt();

        System.out.print("Ingrese el Primer Numero");
        int numero3 = Entrada.nextInt();

        while (buscando == true){
            if(contador%numero1==0 && contador%numero2==0 && contador%numero3==0){
                buscando = false;
            }else{
                contador++;
            }
            
        }
        System.out.print("MCM es: " + contador);
        


           




    }
}