import java.util.Scanner;

public class Ejercicio1{
    public static void main(String[]args) {
        Scanner Entrada = new Scanner(System.in);

        System.out.print("=> Ingrese un sueldo en total: ");
        int numero = Entrada.nextInt();
        System.out.print("=> Cantidad de pagos: ");
        int cant_pagos = Entrada.nextInt();
        int i = 1;

        while (i<=cant_pagos){

            System.out.println("---------------FORMAS DE PAGO-------------------");
            System.out.println("        1. Pagos de igual valor                 ");
            System.out.println("        2. Primer pago diferente                ");
            System.out.println("        3. Ultimo pago diferente                ");
            System.out.println("        4. Primer y Ultimo pago diferente       ");
            System.out.print("=> Ingrese forma de pago: ");
            int forma = Entrada.nextInt();
            if (forma==1){
                int e=1;
                int valor=numero/cant_pagos;
                while (e<=cant_pagos) {
                    System.out.println("Mes "+e+": $"+valor);
                    e++;
                }
            }else if (forma==2){
                int e=1;
                System.out.print("=> Ingrese el valor del Primer pago: ");
                int primer_pago = Entrada.nextInt();
                numero=numero-primer_pago;
                cant_pagos=cant_pagos-1;
                int valor=numero/cant_pagos;
                System.out.println("Mes "+e+": $"+primer_pago);
                while (e<=cant_pagos) {
                    System.out.println("Mes "+(e+1)+": $"+valor);
                    e++;
                }
            }else if (forma==3){
                int e=1;
                System.out.println("=> Ingrese el valor del ultimo pago: ");
                int ultimo_pago = Entrada.nextInt();
                numero=numero-ultimo_pago;
                cant_pagos=cant_pagos-1;
                int valor=numero/cant_pagos;
                while(e<=cant_pagos){
                    System.out.println("Mes "+e+": $"+valor);
                    e++;
                }
                System.out.println("Mes "+(e+1)+": $"+ultimo_pago);
            }else if(forma==4){
                int e=1;
                System.out.println("=> Ingrese el valor del Primer pago: ");
                int primer_pago = Entrada.nextInt();

                System.out.println("=> Ingrese el valor del ultimo pago: ");
                int ultimo_pago = Entrada.nextInt();
                numero=numero-ultimo_pago;
                numero=numero-primer_pago;
                cant_pagos=cant_pagos-2;
                int valor = numero/cant_pagos;
                System.out.println("Mes "+e+": $"+primer_pago);
                while(e<=cant_pagos){
                    System.out.println("Mes "+(e+1)+": $"+valor);
                    e++;
                }
                System.out.println("Mes "+(e+1)+": $"+ultimo_pago);
            }
        }
    }
}
    
