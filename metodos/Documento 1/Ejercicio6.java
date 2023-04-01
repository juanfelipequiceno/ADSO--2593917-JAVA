import java.util.Scanner;

public class Ejercicio6{
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);

        String triqui [] ={"_","_","_","_","_","_","_","_","_"};
        int tirada = 0;
        boolean gano = false;
        

        static void triqui(String[]triqui){    
            System.out.println(triqui[0] + " | " + triqui[1] + " | " + triqui[2]);
            System.out.println(triqui[2] + " | " + triqui[4] + " | " + triqui[5]);
            System.out.println(triqui[6] + " | " + triqui[7] + " | " + triqui[8]);
        }
        static jugador(String ficha, String[] triqui){
            System.out.println("¿donde quieres marcar, jugador " + ficha+ "?" );
            int pos = entrada.nextInt();

            triqui[pos] = ficha;
        }

        do{
            triqui(triqui);
            String ficha = tirada%2==0? "X":"O";
            player(ficha, tablero);
            gano = ganador(triqui);
            tirada++;
        }while(!gano);

        static boolean ganador (String triqui[]){
            if(triqui[0].equals(triqui[1]) && triqui[0].equals(triqui[2]) && !triqui[0].equals("_")){
                return true;
            }else if(triqui[3].equals(triqui[4]) && triqui[3].equals(triqui[5]) && !triqui[3].equals("_")){
                return true;
            }else if(triqui[6].equals(triqui[7]) && triqui[6].equals(triqui[8]) && !triqui[6].equals("_")){
                return true;
            }else if(triqui[0].equals(triqui[3]) && triqui[0].equals(triqui[6]) && !triqui[0].equals("_")){
                return true;
            }else if(triqui[1].equals(triqui[4]) && triqui[1].equals(triqui[7]) && !triqui[1].equals("_")){
                return true;
            }else if(triqui[2].equals(triqui[5]) && triqui[2].equals(triqui[8]) && !triqui[0].equals("_")){
                return true;
            }else if(triqui[0].equals(triqui[4]) && triqui[0].equals(triqui[8]) && !triqui[0].equals("_")){
                return true;
            }else if(triqui[2].equals(triqui[4]) && triqui[2].equals(triqui[6]) && !triqui[2].equals("_")){
                return true;
            }
        }       
    }
}