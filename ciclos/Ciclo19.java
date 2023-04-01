import java.util.Scanner;
public class Ciclo19{

    public static void main (String[] args){
        Scanner Entrada = new Scanner(System.in);

        System.out.print("Ingrese su numer: ");
        long numero=Entrada.nextInt.();
        boolean procesando=true;
        int sumatoria =0;
        while(procesando){
            long ult=0;
            long inventario=0;
            while(numero!=0){
                ult = numero%10;
                inventario = (inventario*10)+ult;
                numero = numero/10;
            }
            numero=inventario;
            sumatoria=0;
            while(numero!=0){
                long ultimo = numero%10;
                numero=numero /10;
                sumatoria+=ultimo
                System.out.print(ultimo+((numero)? "=" : " + "));
            }
           System.out.println(sumatoria);
           if (sumatoria<10){
            procesando=false
           } else {
            numer=sumatoria;
           }
        }
    }
}