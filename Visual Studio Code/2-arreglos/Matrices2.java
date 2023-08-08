import java.util.Scanner;
import java.io.IOException;
public class Matrices2{
    public static void main(String[]args){
        Scanner entrada = new Scanner (System.in);
        try { new ProcessBuilder("cmd","/c","color 0d").inheritIO().start().waitFor();}catch(Exception e){}
        int laberinto [][] = {
            {1,1,1,1,1,1,1},
            {1,0,0,0,1,0,3},
            {1,0,1,0,1,0,1},
            {1,0,1,0,1,0,1},
            {2,0,1,0,0,0,1},
            {1,1,1,1,1,1,1}
        };
        boolean k=true;
        int fila_f = 4;
        int colun_f = 0;
        while(k){
            try { new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();}catch(Exception e){}
        for(int i=0;i<laberinto.length;i++){
            for(int j=0;j<laberinto[i].length;j++){
                System.out.print("["+ laberinto [i][j]+"]"); 
            }
            System.out.println("");
        }
            System.out.println("1. Arriba      2.Abajo    3.izquierda    4.Derecha");
            System.out.print("ingrese Moviento : ");
            int moviento = entrada.nextInt();
            if(moviento == 1){
                if(laberinto[fila_f-1][colun_f]==0){
                    laberinto[fila_f][colun_f]= 0;
                    fila_f=fila_f-1;
                    colun_f=colun_f;
                    laberinto[fila_f][colun_f]=2;
                }else if(laberinto[fila_f][colun_f+1]==3){
                    laberinto[fila_f][colun_f]= 0;
                    fila_f=fila_f-1;
                    colun_f=colun_f;
                    laberinto[fila_f][colun_f]=2;
                    k=false;
                }
            }
            if(moviento == 2){
                if(laberinto[fila_f+1][colun_f]==0){
                    laberinto[fila_f][colun_f]= 0;
                    fila_f=fila_f+1;
                    colun_f=colun_f;
                    laberinto[fila_f][colun_f]=2;
                }else if(laberinto[fila_f+1][colun_f]==3){
                    laberinto[fila_f][colun_f]= 0;
                    fila_f=fila_f+1;
                    colun_f=colun_f;
                    laberinto[fila_f][colun_f]=2;
                    k=false;
                }
            }
            if(moviento == 3){
               if(laberinto[fila_f][colun_f-1]==0){
                    laberinto[fila_f][colun_f]= 0;
                    fila_f=fila_f;
                    colun_f=colun_f-1;
                    laberinto[fila_f][colun_f]=2;
                }else if(laberinto[fila_f][colun_f-1]==3){
                    laberinto[fila_f][colun_f]= 0;
                    fila_f=fila_f;
                    colun_f=colun_f-1;
                    laberinto[fila_f][colun_f]=2;
                    k=false;
                }
            }
            if(moviento == 4){
                if(laberinto[fila_f][colun_f+1]==0){
                    laberinto[fila_f][colun_f]= 0;
                    fila_f=fila_f;
                    colun_f=colun_f+1;
                    laberinto[fila_f][colun_f]=2;
                }else if(laberinto[fila_f][colun_f+1]==3){
                    laberinto[fila_f][colun_f]= 0;
                    fila_f=fila_f;
                    colun_f=colun_f+1;
                    laberinto[fila_f][colun_f]=2;
                    k=false;
                }
            }
            if(moviento<1 || moviento>4){
                System.out.println("//---------Moviento Incorrecto---------//");
            }
            for(int i=0;i<6;i++){
                for(int j=0;j<7;j++){
                    System.out.print("["+ laberinto [i][j]+"]"); 
                }
                System.out.println("");
            }
        }
        System.out.println("GAME OVER");
    }
}

// import java.io.IOException;
// try { new ProcessBuilder("cmd","/c","color 0d").inheritIO().start().waitFor();}catch(Exception e){}
// try { new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();}catch(Exception e){}