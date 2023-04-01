import java.util.Scanner;
import java.io.IOException;

public class Main1{
    public static void main(String[]args){
        try { new ProcessBuilder("cmd","/c").inheritIO().start().waitFor();}catch(Exception e){}
        Scanner entrada_texto = new Scanner(System.in);
        Scanner entrada_numero = new Scanner(System.in);

        Persona1 registro_persona [] = new Persona1 [100];
        int pos_actual=0;
        int opcion=0;
    
        do{
            System.out.println("|--------------------------------------------|");
            System.out.println("|---------------Datos Persona----------------|");
            System.out.println("|-----------------Personas Registradas: " +((pos_actual<10)? "0":"")+pos_actual+" --|");
            System.out.println("|                                            |");
            System.out.println("|   1. Registrar Persona.                    |");
            System.out.println("|   2. Ver lista de Registros.               |");
            System.out.println("|   3. Modificar informacion cliente.        |");
            System.out.println("|   4. ver informacion cliente.              |");
            System.out.println("|   5. Ordenar lista Personas.               |");
            System.out.println("|   6. Eliminar clientes.                    |");
            System.out.println("|   7. Salir.                                |");
            System.out.println("|--------------------------------------------|");
            
            System.out.print("|   Ingrese una Opcion: ");
            opcion = entrada_numero.nextInt();
            int i = 0;

            if(opcion==1){
                System.out.print("Ingrese Nombre: ");
                String nombre = entrada_texto.nextLine();

                System.out.print("Ingrese Apellido: ");
                String apellido = entrada_texto.nextLine();

                System.out.print("Ingrese La Direccion: ");
                String direccion = entrada_texto.nextLine();

                System.out.print("Ingrese Numero de Cedula: ");
                int cedula = entrada_numero.nextInt();
                
                System.out.print("Ingrese Numero de Telefono: ");
                String telefono = entrada_texto.nextLine();

                Persona1 temporal = new Persona1(nombre, apellido, direccion, cedula, telefono);
                registro_persona[pos_actual] = temporal;

                boolean valido = true;
                for( i=0;i<pos_actual;i++){
                    if(cedula==registro_persona[i].getCedula()){
                        valido = false;
                        break;
                    }
                }
                if(valido){
                    registro_persona[pos_actual] = temporal;
                    pos_actual++;
                    System.out.println("REGISTRADO CON EXITO \n\n");
                }else{
                    System.out.println("EL DOCUMENTO YA EXISTE, NO SE PUEDE ASIGNAR");
                }
            }else if(opcion==2){
                for( i = 0; i < pos_actual; i++){
                    if(registro_persona[i] != null){
                        registro_persona[i].mostrarDatosPersonales();
                    }
                }
            }else if(opcion == 3){
                for(i=0; i<pos_actual; i++){
                    System.out.println("|-------------------------------------------|");
                    registro_persona[i].resumenInformacion();
                    System.out.println("|-------------------------------------------|");
                }

                System.out.print("Ingrese la Cedula que va a modificar: ");
                int modificar = entrada_numero.nextInt();

                for(i = 0; i < pos_actual; i++){

                    registro_persona[i].mostrarDatosPersonales();

                    if(modificar == registro_persona[i].getCedula()){
                        System.out.println("-----------Modificar Informacion-------------");
                        System.out.println(" 1. Nombre   ");
                        System.out.println(" 2. Apellido   ");
                        System.out.println(" 3. Direccion   ");
                        System.out.println(" 4. Cedula   ");
                        System.out.println(" 5. Teléfono   ");
                        System.out.println(" 6. salir ");
                        System.out.println("---------------------------------------------");
                    }
                    int modific = 0;
                    while(modific < 6){
                        System.out.print("Ingrese una opcion que va modificar: ");
                        modific = entrada_numero.nextInt();

                        if(modific < 1 && modific > 6){
                            System.out.print("No existe el parametro");
                            
                        }else if(modific == 1){
                                System.out.println("Ingrese nuevo nombre: ");
                                String nuevo1 = entrada_texto.nextLine();
                            for(i = 0; i< pos_actual; i++){
                                registro_persona[i].setNombre(nuevo1);
                            }
                        }else if(modific == 2){
                            System.out.println("Ingrese nuevo Apellido: ");
                            String nuevo2 = entrada_texto.nextLine();
                            for(i = 0; i< pos_actual; i++){
                                registro_persona[i].setApellido(nuevo2);
                            }
                        }else if(modific == 3){
                            System.out.println("Ingrese nuevo Direccion: ");
                            String nuevo3 = entrada_texto.nextLine();
                            for(i = 0; i< pos_actual; i++){
                                registro_persona[i].setDireccion(nuevo3);
                            } 
                        }else if(modific == 4){
                            System.out.println("Ingrese una nueva Cedula: ");
                            int nuevo4 = entrada_numero.nextInt();
                            for(i = 0; i< pos_actual; i++){
                                registro_persona[i].setCedula(nuevo4);
                            } 
                        }else if(modific == 5){
                            System.out.println("Ingrese un nuevo Telefono: ");
                            String nuevo5 = entrada_texto.nextLine();
                            for(i = 0; i< pos_actual; i++){
                                registro_persona[i].setTelefono(nuevo5);
                            } 
                        }
                    }

                }
            }else if(opcion==4){
                for(i = 0; i < pos_actual; i++){
                    registro_persona[i].mostrarDatosPersonales();
                }

                System.out.print("Ingrese el documento para Revisar: ");
                int buscarDocumento = entrada_numero.nextInt();
                for(i = 0; i < pos_actual; i++){
                    if(buscarDocumento == registro_persona[i].getCedula()){
                        registro_persona[i].mostrarDatosPersonales();
                    }
                }
            }else if (opcion==5){
                // burbuja con numeros enteros
                for( i = 0; i < registro_persona.length ; i++){
                    for(int j = 0; j < registro_persona.length-1; j++){
                        if(registro_persona[j] != null && registro_persona[j+1] != null){
                            if(registro_persona[j].getCedula() > registro_persona[j+1].getCedula()){
                                Persona1 aux = registro_persona[j];
                                registro_persona[j] = registro_persona[j+1];
                                registro_persona[j+1] = aux;
                            }
                        }
                    }
                }
            }else if(opcion==6){
                for( i = 0; i < pos_actual; i++){
                    if(registro_persona[i] != null){
                        registro_persona[i].resumenInformacion();
                    }
                }
                int buscarCedula = 0;
                System.out.print("Ingrese un Documento para Eliminar: ");
                buscarCedula = entrada_numero.nextInt();
                int pocicionar = 0;
                int iterador = 0;
                for( i = 0;i < pos_actual; i++ ){
                    if(buscarCedula == registro_persona[i].getCedula()){
                        pocicionar = 1;
                        iterador = i;
                    }
                }
                if(pocicionar != 1){
                    System.out.println("El Documento no se encuantra registrado");
                }else{
                    for(int j = 0; j < pos_actual; j++){
                        if(registro_persona[j]!=null){
                            registro_persona[iterador] = registro_persona[j+1];
                            registro_persona[j+1] = null;
                            pos_actual--;
                        }
                    }
                }
            }else if(opcion==7){
                System.out.println("|========== SALIENDO ==========|");
            }else {
                System.out.println("|==============================|");
            }
            System.out.println("Enter para continuar");
            String comodin = entrada_texto.nextLine();

            try { new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();}catch(Exception e){}
        }while(opcion != 7);
    }
}