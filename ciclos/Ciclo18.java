import java.util.Scanner;
public class Ciclo18{

    public static void main (String[] args){
        Scanner Entrada = new Scanner(System.in);

        System.out.print("ingrese el tamano del cuadro: ");
        int numero = Entrada.nextInt();

        int cont = 1;

        for(int i =0; i<numero;i++){
            for(int j=0; j<numero;j++){
                if(cont%2==0){
                    int m=i;
                    while (m<i){
                        int aleatorio = (int)(Math.random()*999);
                        int acomulador = 0;
                        int a=i;
                        while(a<=aleatorio){
                            if(aleatorio==0){
                                acomulador++;
                            }
                            a++;
                        }
                        if (acomulador>2){
                            System.out.print(" "+((aleatorio<10)? "00" : ((aleatorio<100)? "0" : ""))+aleatorio + " ");
                            m++;
                        }
                    }
                }else {
                    int  m=0;
                    while(m<1){
                        int aleatorio = (int)(Math.random()*999);
                        int acomulador=0;
                        int a=1;
                        while (a<aleatorio){
                            if(aleatorio%a==0){
                                acomulador++;
                            }
                            a++;
                        }if (aleatorio==2){
                            System.out.print(" "+((aleatorio<10)? "00" : ((aleatorio<100)? "0" : ""))+aleatorio + " ");
                            m++;
                        }
                    }
                }
                cont++;
            }
            System.out.println(" ");
        }
    }
        
}
