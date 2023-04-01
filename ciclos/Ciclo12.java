import java.util.Scanner;
public class Ciclos12{

    //fecha aleatoria

    public static void main (String[] args){
        Scanner Entrada = new Scanner(System.in);
        int dia;
        dia = (int)(Math.random()*31);
        if(dia<=31){
            System.out.print(dia);
        }
        boolean aleatorio1 = true;

        while(aleatorio1 == true){
            int mes = (int)(Math.random()*12);
            if(mes<=12){
                System.out.print(mes);
                aleatorio1 =false;
            }
        }
        boolean ale = true;
        while(ale == true){
            int anos = (int)(Math.random()*9999);
            if(anos>1000 && anos <= 9999){
                System.out.print(anos);
                ale = false;
            }
        }
      
    }
}
